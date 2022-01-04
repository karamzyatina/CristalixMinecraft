import dev.xdark.feder.RecyclableArrayList;
import java.util.List;
import java.util.Properties;

public final class aga {
   private static abu[] a = null;
   public static boolean a = false;

   public static abu a(sD var0) {
      if (a == null) {
         return null;
      } else if (var0.isOpaqueCube()) {
         return null;
      } else if (!(var0 instanceof sw)) {
         return null;
      } else {
         sw var1 = (sw)var0;
         int var2 = var1.a();
         return var2 > 0 && var2 < a.length ? a[var2] : null;
      }
   }

   public static void a(IN var0) {
      a = null;
      a = false;
      RecyclableArrayList var1 = RecyclableArrayList.newInstance();
      String var2 = "optifine/block.properties";
      Properties var3 = amg.a(var0, var2, "CustomBlockLayers");
      if (var3 != null) {
         a(var2, var3, var1);
      }

      if (afT.ad()) {
         Properties var4 = ajZ.a();
         if (var4 != null) {
            String var5 = "shaders/block.properties";
            a(var5, var4, var1);
         }
      }

      if (!var1.isEmpty()) {
         a = (abu[])var1.toArray(new abu[0]);
         a = true;
      }

      var1.recycle();
   }

   private static void a(String var0, Properties var1, List<abu> var2) {
      afT.a("CustomBlockLayers: " + var0);
      a("solid", abu.SOLID, var1, var2);
      a("cutout", abu.CUTOUT, var1, var2);
      a("cutout_mipped", abu.CUTOUT_MIPPED, var1, var2);
      a("translucent", abu.TRANSLUCENT, var1, var2);
   }

   private static void a(String var0, abu var1, Properties var2, List<abu> var3) {
      String var4 = "layer." + var0;
      String var5 = var2.getProperty(var4);
      if (var5 != null) {
         agC var6 = new agC("CustomBlockLayers");
         agH[] var7 = var6.a(var5);
         if (var7 != null) {
            for(int var8 = 0; var8 < var7.length; ++var8) {
               agH var9 = var7[var8];
               int var10 = var9.a();
               if (var10 > 0) {
                  while(var3.size() < var10 + 1) {
                     var3.add((Object)null);
                  }

                  if (var3.get(var10) != null) {
                     afT.b("CustomBlockLayers: Block layer is already set, block: " + var10 + ", layer: " + var0);
                  }

                  var3.set(var10, var1);
               }
            }
         }
      }

   }

   public static boolean a() {
      return a;
   }
}
