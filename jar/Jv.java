import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.xdark.feder.IOUtil;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class JV {
   private static final Logger a;
   private static final JQ a;
   private static int a;
   private final Map<String, Object> a = new HashMap();
   private final List<String> a = new ArrayList();
   private final IntList a = new IntArrayList();
   private final List<JW> b = new ArrayList();
   private final Map<String, JW> b = new HashMap();
   private final int b;
   private final String a;
   private final boolean a;
   private final Ka a;
   private final JT a;
   private final JT b;

   public JV(IN var1, String var2) {
      acC var3 = new acC("shaders/program/" + var2 + ".json");
      this.a = var2;
      IM var4 = null;

      try {
         var4 = var1.a(var3);
         JsonObject var5 = JsonParser.parseString(IOUtil.toString(var4.getInputStream(), StandardCharsets.UTF_8)).getAsJsonObject();
         String var29 = acn.a(var5, "vertex");
         String var7 = acn.a(var5, "fragment");
         JsonArray var8 = acn.a(var5, "samplers", (JsonArray)null);
         if (var8 != null) {
            int var9 = 0;

            for(Iterator var10 = var8.iterator(); var10.hasNext(); ++var9) {
               JsonElement var11 = (JsonElement)var10.next();

               try {
                  this.a(var11);
               } catch (Exception var26) {
                  Kb var13 = Kb.a(var26);
                  var13.a("samplers[" + var9 + ']');
                  throw var13;
               }
            }
         }

         JsonArray var30 = acn.a(var5, "attributes", (JsonArray)null);
         IntArrayList var31;
         ArrayList var32;
         Iterator var34;
         if (var30 != null) {
            int var12 = 0;
            var31 = new IntArrayList(var30.size());
            var32 = new ArrayList(var30.size());

            for(var34 = var30.iterator(); var34.hasNext(); ++var12) {
               JsonElement var14 = (JsonElement)var34.next();

               try {
                  var32.add(acn.a(var14, "attribute"));
               } catch (Exception var25) {
                  Kb var16 = Kb.a(var25);
                  var16.a("attributes[" + var12 + ']');
                  throw var16;
               }
            }
         } else {
            var31 = null;
            var32 = null;
         }

         JsonArray var33 = acn.a(var5, "uniforms", (JsonArray)null);
         if (var33 != null) {
            int var35 = 0;

            for(Iterator var36 = var33.iterator(); var36.hasNext(); ++var35) {
               JsonElement var15 = (JsonElement)var36.next();

               try {
                  this.b(var15);
               } catch (Exception var24) {
                  Kb var17 = Kb.a(var24);
                  var17.a("uniforms[" + var35 + ']');
                  throw var17;
               }
            }
         }

         this.a = Ka.a(acn.a(var5, "blend", (JsonObject)null));
         this.a = acn.a(var5, "cull", true);
         this.a = JT.a(var1, JU.VERTEX, var29);
         this.b = JT.a(var1, JU.FRAGMENT, var7);
         this.b = JS.a().a();
         JS.a().b(this);
         this.e();
         if (var32 != null) {
            var34 = var32.iterator();

            while(var34.hasNext()) {
               String var37 = (String)var34.next();
               int var38 = Ci.b(this.b, (CharSequence)var37);
               var31.add(var38);
            }
         }
      } catch (Exception var27) {
         Kb var6 = Kb.a(var27);
         var6.b(var3.getPath());
         throw var6;
      } finally {
         IOUtil.closeQuietly(var4);
      }

      this.d();
   }

   public void a() {
      JS.a().a(this);
   }

   public void b() {
      Ci.c(0);
      a = -1;
      int var1 = 0;

      for(int var2 = this.a.size(); var1 < var2; ++var1) {
         if (this.a.get(this.a.get(var1)) != null) {
            By.g(Ci.n + var1);
            By.i(0);
         }
      }

   }

   public void c() {
      this.a.a();
      if (this.b != a) {
         Ci.c(this.b);
         a = this.b;
      }

      if (this.a) {
         By.p();
      } else {
         By.q();
      }

      int var1 = 0;

      for(int var2 = this.a.size(); var1 < var2; ++var1) {
         if (this.a.get(this.a.get(var1)) != null) {
            By.g(Ci.n + var1);
            By.v();
            Object var3 = this.a.get(this.a.get(var1));
            int var4 = -1;
            if (var3 instanceof JO) {
               var4 = ((JO)var3).f;
            } else if (var3 instanceof HA) {
               var4 = ((HA)var3).getGlTextureId();
            } else if (var3 instanceof Integer) {
               var4 = (Integer)var3;
            }

            if (var4 != -1) {
               By.i(var4);
               Ci.b(Ci.a(this.b, (CharSequence)this.a.get(var1)), var1);
            }
         }
      }

      Iterator var5 = this.b.iterator();

      while(var5.hasNext()) {
         JW var6 = (JW)var5.next();
         var6.a();
      }

   }

   public void d() {
   }

   public JW a(String var1) {
      return (JW)this.b.get(var1);
   }

   public JW b(String var1) {
      JW var2 = this.a(var1);
      return (JW)(var2 == null ? a : var2);
   }

   private void e() {
      int var1 = 0;

      for(int var2 = 0; var1 < this.a.size(); ++var2) {
         String var3 = (String)this.a.get(var1);
         int var4 = Ci.a(this.b, (CharSequence)var3);
         if (var4 == -1) {
            a.warn("Shader {}could not find sampler named {} in the specified shader program.", this.a, var3);
            this.a.remove(var3);
            this.a.remove(var2);
            --var2;
         } else {
            this.a.add(var4);
         }

         ++var1;
      }

      Iterator var6 = this.b.iterator();

      while(var6.hasNext()) {
         JW var7 = (JW)var6.next();
         String var8 = var7.a();
         int var5 = Ci.a(this.b, (CharSequence)var8);
         if (var5 == -1) {
            a.warn("Could not find uniform named {} in the specified shader program.", var8);
         } else {
            var7.a(var5);
            this.b.put(var8, var7);
         }
      }

   }

   private void a(JsonElement var1) {
      JsonObject var2 = acn.a(var1, "sampler");
      String var3 = acn.a(var2, "name");
      if (!acn.a(var2, "file")) {
         this.a.put(var3, (Object)null);
         this.a.add(var3);
      } else {
         this.a.add(var3);
      }

   }

   public void a(String var1, Object var2) {
      this.a.remove(var1);
      this.a.put(var1, var2);
      this.d();
   }

   private void b(JsonElement var1) {
      JsonObject var2 = acn.a(var1, "uniform");
      String var3 = acn.a(var2, "name");
      int var4 = JW.a(acn.a(var2, "type"));
      int var5 = acn.a(var2, "count");
      float[] var6 = new float[Math.max(var5, 16)];
      JsonArray var7 = acn.a(var2, "values");
      if (var7.size() != var5 && var7.size() > 1) {
         throw new Kb("Invalid amount of values specified (expected " + var5 + ", found " + var7.size() + ')');
      } else {
         int var8 = 0;

         for(Iterator var9 = var7.iterator(); var9.hasNext(); ++var8) {
            JsonElement var10 = (JsonElement)var9.next();

            try {
               var6[var8] = acn.a(var10, "value");
            } catch (Exception var13) {
               Kb var12 = Kb.a(var13);
               var12.a("values[" + var8 + ']');
               throw var12;
            }
         }

         if (var5 > 1 && var7.size() == 1) {
            while(var8 < var5) {
               var6[var8] = var6[0];
               ++var8;
            }
         }

         int var14 = var5 > 1 && var5 <= 4 && var4 < 8 ? var5 - 1 : 0;
         JW var15 = new JW(var3, var4 + var14, var5, this);
         if (var4 <= 3) {
            var15.a((int)var6[0], (int)var6[1], (int)var6[2], (int)var6[3]);
         } else if (var4 <= 7) {
            var15.b(var6[0], var6[1], var6[2], var6[3]);
         } else {
            var15.a(var6);
         }

         this.b.add(var15);
      }
   }

   public JT a() {
      return this.a;
   }

   public JT b() {
      return this.b;
   }

   public int a() {
      return this.b;
   }

   static {
      a = sE.a;
      a = new JQ();
      a = -1;
   }
}
