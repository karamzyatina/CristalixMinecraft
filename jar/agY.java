import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class agy {
   private static List a = null;
   private static List b = null;
   private static List c = null;
   private static List d = null;
   private static List e = null;
   private static List f = null;
   private static CV a = null;
   private static CV b = null;
   private static CV c = null;
   private static CV d = null;
   private static CV e = null;
   private static CV f = null;

   public static CV a(CV var0, sD var1) {
      if (!afT.m()) {
         return var0;
      } else {
         List var2 = var0.a(var1, (abP)null, 0L);
         if (var2 == a) {
            return a;
         } else if (var2 == b) {
            return b;
         } else if (var2 == c) {
            return c;
         } else if (var2 == d) {
            return d;
         } else if (var2 == e) {
            return e;
         } else {
            return var2 == f ? f : var0;
         }
      }
   }

   public static boolean a(sD var0, sD var1) {
      if (var0 == var1) {
         return true;
      } else {
         nh var2 = var0.a();
         nh var3 = var1.a();
         if (var2 != var3) {
            return false;
         } else if (var2 instanceof pC) {
            return ((pQ)var0.a((so)pC.a)).equals(var1.a((so)pC.a));
         } else {
            return var2 instanceof pv && ((pQ)var0.a((so)pv.a)).equals(var1.a((so)pv.a));
         }
      }
   }

   public static void a(Jc var0, Du var1, HO var2) {
      ArrayList var3 = new ArrayList();
      CV var4 = a(var0, var1, "acacia", var3);
      CV var5 = a(var0, var1, "birch", var3);
      CV var6 = a(var0, var1, "dark_oak", var3);
      CV var7 = a(var0, var1, "jungle", var3);
      CV var8 = a(var0, var1, "oak", var3);
      CV var9 = a(var0, var1, "spruce", var3);
      a = a(var4);
      b = a(var5);
      c = a(var6);
      d = a(var7);
      e = a(var8);
      f = a(var9);
      a = a(var2, var4);
      b = a(var2, var5);
      c = a(var2, var6);
      d = a(var2, var7);
      e = a(var2, var8);
      f = a(var2, var9);
      if (var3.size() > 0) {
         afT.a("Enable face culling: " + afT.a(var3.toArray()));
      }

   }

   private static List a(CV var0) {
      return var0 == null ? null : var0.a((sD)null, (abP)null, 0L);
   }

   static CV a(Jc var0, Du var1, String var2, List var3) {
      acC var4 = new acC("blockstates/" + var2 + "_leaves.json");
      if (var0.a(var4) != var0.a) {
         return null;
      } else {
         acC var5 = new acC("models/block/" + var2 + "_leaves.json");
         if (var0.a(var5) != var0.a) {
            return null;
         } else {
            Dv var6 = new Dv(var2 + "_leaves", "normal");
            CV var7 = var1.a(var6);
            if (var7 != null && var7 != var1.a()) {
               List var8 = var7.a((sD)null, (abP)null, 0L);
               if (var8.size() == 0) {
                  return var7;
               } else if (var8.size() != 6) {
                  return null;
               } else {
                  Iterator var9 = var8.iterator();

                  while(var9.hasNext()) {
                     CD var10 = (CD)var9.next();
                     List var11 = var7.a((sD)null, var10.a(), 0L);
                     if (var11.size() > 0) {
                        return null;
                     }

                     var11.add(var10);
                  }

                  var8.clear();
                  var3.add(var2 + "_leaves");
                  return var7;
               }
            } else {
               return null;
            }
         }
      }
   }

   private static CV a(HO var0, CV var1) {
      if (var1 == null) {
         return null;
      } else if (var1.a((sD)null, (abP)null, 0L)) {
         afT.b("SmartLeaves: Model is not cube, model: " + var1);
         return var1;
      } else {
         abP[] var2 = abP.VALUES;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            abP var4 = var2[var3];
            List var5 = var1.a((sD)null, var4, 0L);
            if (var5.size() != 1) {
               afT.b("SmartLeaves: Model is not cube, side: " + var4 + ", quads: " + var5.size() + ", model: " + var1);
               return var1;
            }
         }

         CV var12 = ajD.a(var1);

         for(int var13 = 0; var13 < var2.length; ++var13) {
            abP var14 = var2[var13];
            List var6 = var12.a((sD)null, var14, 0L);
            CD var7 = (CD)var6.get(0);
            CD var8 = new CD(var0, (int[])var7.getVertexData().clone(), var7.getTintIndex(), var7.a(), var7.a());
            int[] var9 = var8.getVertexData();
            int[] var10 = (int[])var9.clone();
            int var11 = var9.length / 4;
            System.arraycopy(var9, 0, var10, 3 * var11, var11);
            System.arraycopy(var9, var11, var10, 2 * var11, var11);
            System.arraycopy(var9, 2 * var11, var10, var11, var11);
            System.arraycopy(var9, 3 * var11, var10, 0, var11);
            System.arraycopy(var10, 0, var9, 0, var10.length);
            var6.add(var8);
         }

         return var12;
      }
   }
}
