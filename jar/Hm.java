import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.texture.DynamicTexture;
import dev.xdark.clientapi.texture.RenderEngine;
import dev.xdark.clientapi.texture.Texture;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.Logger;

public final class HM implements HB, IO, atd, RenderEngine {
   private static final Logger a;
   public static final acC a;
   private final Map<acC, HA> a = new HashMap();
   private final List<HB> a = new ArrayList();
   private final Object2IntMap<String> a = new Object2IntOpenHashMap();
   private final sE a;
   private final IN a;
   private MF a;

   public HM(sE var1, IN var2) {
      this.a = var1;
      this.a = var2;
   }

   public void a(Lg var1) {
      Object var2 = var1.a();
      if (agp.a()) {
         var2 = agp.a((HM)this, (HA)var2, (Map)this.a);
      }

      if (var2 == null) {
         var2 = new HG(var1);
         this.a((acC)var1, (HA)var2);
      }

      this.a.a((HA)var2);
   }

   public void b(Lg var1) {
      Object var2 = var1.a();
      if (var2 == null) {
         var2 = new HG(var1);
         this.a((acC)var1, (HA)var2);
      }

      this.a.a((HA)var2);
   }

   public void a(acC var1) {
      Object var2 = (HA)this.a.get(var1);
      if (var2 == null) {
         var2 = new HG(var1);
         this.a((acC)var1, (HA)var2);
      }

      this.a.a((HA)var2);
   }

   public void b(acC var1) {
      this.a(ajK.a(this.a.a, var1));
   }

   public void c(acC var1) {
      if (afT.am()) {
         var1 = ago.a(this.a, var1);
      }

      this.a(var1);
   }

   public void d(acC var1) {
      if (afT.am()) {
         var1 = ago.a(this.a, var1);
      }

      Object var2 = (HA)this.a.get(var1);
      if (agp.a()) {
         var2 = agp.a((HM)this, (HA)var2, (Map)this.a);
      }

      if (var2 == null) {
         var2 = new HG(var1);
         this.a((acC)var1, (HA)var2);
      }

      this.a.a((HA)var2);
   }

   public boolean a(acC var1, HC var2) {
      if (this.a((acC)var1, (HA)var2)) {
         this.a.add(var2);
         return true;
      } else {
         return false;
      }
   }

   public void a(acC var1, HA var2) {
      this.a.put(var1, var2);
   }

   public boolean a(acC var1, HA var2) {
      try {
         ((HA)var2).a(this.a);
      } catch (IOException var4) {
         if (var1 != a) {
            a.warn("Failed to load texture: {}", var1, var4);
         }

         var2 = HS.a;
      } catch (Throwable var5) {
         this.a((HA)var2, var5, var1);
      }

      if (var1 instanceof Lg) {
         ((Lg)var1).a((HA)var2);
      }

      this.a.put(var1, var2);
      return var2 != HS.a;
   }

   private void a(HA var1, Throwable var2, acC var3) {
      Kn var4 = Kn.a(var2, "Registering texture");
      Ku var5 = var4.a("Resource location being registered");
      var5.a((String)"Resource location", (Object)var3);
      var5.a((String)"Texture object class", (KB)(new HN(this, var1)));
      throw new acB(var4);
   }

   public HA a(Lg var1) {
      return var1.a();
   }

   public HA a(acC var1) {
      return (HA)this.a.get(var1);
   }

   public Lg a(String var1, Hy var2) {
      int var3 = this.a.getInt(var1) + 1;
      this.a.put(var1, var3);
      Lg var4 = new Lg(a(var1, var3));
      this.a((acC)var4, (HA)var2);
      return var4;
   }

   public acC a(String var1, Hy var2) {
      int var3 = this.a.getInt(var1) + 1;
      this.a.put(var1, var3);
      acC var4 = new acC(a(var1, var3));
      this.a((acC)var4, (HA)var2);
      return var4;
   }

   public void tick() {
      List var1 = this.a;
      int var2 = 0;

      for(int var3 = var1.size(); var2 < var3; ++var2) {
         ((HB)var1.get(var2)).tick();
      }

   }

   public void c(Lg var1) {
      HA var2 = (HA)this.a.remove(var1);
      if (var2 != null) {
         HA var3 = var1.a();
         if (var3 != var2) {
            throw new IllegalStateException("TexResourceLocation link is broken: " + var1);
         }

         var1.a((HA)null);
         var2.deleteGlTexture();
      }

   }

   public void e(acC var1) {
      HA var2 = (HA)this.a.remove(var1);
      if (var2 != null) {
         if (var1 instanceof Lg) {
            Lg var3 = (Lg)var1;
            HA var4 = var3.a();
            if (var4 != var2) {
               throw new IllegalStateException("TexResourceLocation link is broken!: " + var1);
            }

            var3.a((HA)null);
         }

         var2.deleteGlTexture();
      }

   }

   public void onResourceManagerReload(IN var1) {
      this.a = afT.ad() ? ME.a : Mu.a;
      Iterator var2 = this.a.entrySet().iterator();

      while(true) {
         Entry var3;
         acC var4;
         String var5;
         do {
            if (!var2.hasNext()) {
               agp.a(var1);
               Iterator var7 = (new HashSet(this.a.entrySet())).iterator();

               while(var7.hasNext()) {
                  Entry var8 = (Entry)var7.next();
                  HA var9 = (HA)var8.getValue();
                  if (var9 != HS.a) {
                     this.a((acC)var8.getKey(), var9);
                  }
               }

               return;
            }

            var3 = (Entry)var2.next();
            var4 = (acC)var3.getKey();
            var5 = var4.getPath();
         } while(!var5.startsWith("mod/") && !var5.startsWith("mcpatcher/") && !var5.startsWith("optifine/") && !agp.a(var4));

         HA var6 = (HA)var3.getValue();
         var6.deleteGlTexture();
         if (var4 instanceof Lg) {
            ((Lg)var4).a((HA)null);
         }

         var2.remove();
      }
   }

   public void a() {
      Iterator var1 = (new HashSet(this.a.entrySet())).iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         acC var3 = (acC)var2.getKey();
         HA var4 = (HA)var2.getValue();
         if (var4 instanceof HD) {
            this.a(var3, var4);
         }
      }

   }

   private static String a(String var0, int var1) {
      return "dynamic/" + var0 + "_" + var1;
   }

   static {
      a = sE.a;
      a = new acC("");
   }

   public void b() {
      Map var1 = this.a;
      Iterator var2 = var1.entrySet().iterator();
      int var3 = var1.size();

      while(var3-- > 0) {
         Entry var4 = (Entry)var2.next();
         if (((acC)var4.getKey()).getPath().startsWith("skins/")) {
            HA var5 = (HA)var4.getValue();
            var2.remove();
            var5.deleteGlTexture();
         }
      }

   }

   public boolean loadTexture(ResourceLocation var1, Texture var2) {
      return this.a((acC)var1, (HA)var2);
   }

   public ResourceLocation getDynamicTextureLocation(String var1, DynamicTexture var2) {
      return (ResourceLocation)this.a(var1, (Hy)var2);
   }

   public void deleteTexture(ResourceLocation var1) {
      this.e((acC)var1);
   }

   public void bindTexture(ResourceLocation var1) {
      this.d((acC)var1);
   }

   public void bindTexture(Texture var1) {
      this.a.a((HA)d.a(var1));
   }

   public Texture newSimpleTexture(ResourceLocation var1) {
      return (Texture)d.a(new HG((acC)d.a(var1)));
   }

   public DynamicTexture newDynamicTexture(BufferedImage var1) {
      return (DynamicTexture)d.a(new Hy(var1));
   }

   public DynamicTexture newDynamicTexture(int var1, int var2) {
      return (DynamicTexture)d.a(new Hy(var1, var2));
   }

   public Texture newImageTexture(BufferedImage var1, boolean var2, boolean var3) {
      return (Texture)d.a(new ce(var1, var2, var3));
   }

   public Texture newRemoteTexture(Path var1, String var2, ResourceLocation var3) {
      return (Texture)d.a(new Cx((sE)d.a(this.a), var1.toFile(), var2, (acC)d.a(var3), (Cb)null));
   }
}
