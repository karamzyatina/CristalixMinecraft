import dev.xdark.feder.RecyclableArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

public class Da {
   public static final List<String> a = Arrays.asList("layer0", "layer1", "layer2", "layer3", "layer4");

   public static Dm a(HO var0, Dm var1) {
      List var2 = a;
      int var3 = var2.size();
      HashMap var4 = new HashMap(var3, 1.0F);
      List var5 = null;

      String var7;
      for(int var6 = 0; var6 < var3; ++var6) {
         var7 = (String)var2.get(var6);
         if (!var1.isTexturePresent(var7)) {
            break;
         }

         acC var8 = var1.a(var7);
         String var9 = MI.a.equals(var8) ? "missingno" : var8.toString();
         var4.put(var7, var9);
         HK var10 = var0.a(var8.toString());
         List var11 = a(var6, var7, var10);
         if (var5 == null) {
            var5 = var11;
         } else {
            var5.addAll(var11);
         }
      }

      if (var5 != null && !var5.isEmpty()) {
         acC var12 = var1.a("particle");
         if (MI.a.equals(var12)) {
            var7 = (String)var4.get("layer0");
         } else {
            var7 = var12.toString();
         }

         var4.put("particle", var7);
         return new Dm((acC)null, var5, var4, false, false, var1.a(), var1.a());
      } else {
         return null;
      }
   }

   private static List<CH> a(int var0, String var1, HK var2) {
      EnumMap var3 = new EnumMap(abP.class);
      var3.put(abP.SOUTH, new CK((abP)null, var0, var1, new CF(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
      var3.put(abP.NORTH, new CK((abP)null, var0, var1, new CF(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
      List var4 = a(var2, var1, var0);
      var4.add(0, new CH(Lh.c, Lh.d, var3, (CM)null, true));
      return var4;
   }

   private static List<CH> a(HK var0, String var1, int var2) {
      // $FF: Couldn't be decompiled
   }

   private static RecyclableArrayList a(HK var0) {
      int var1 = var0.getIconWidth();
      int var2 = var0.getIconHeight();
      RecyclableArrayList var3 = RecyclableArrayList.newInstance();

      for(int var4 = 0; var4 < var0.getFrameCount(); ++var4) {
         int[] var5 = var0.getFrameTextureData(var4)[0];

         for(int var6 = 0; var6 < var2; ++var6) {
            for(int var7 = 0; var7 < var1; ++var7) {
               boolean var8 = !a(var5, var7, var6, var1, var2);
               a(Dd.UP, var3, var5, var7, var6, var1, var2, var8);
               a(Dd.DOWN, var3, var5, var7, var6, var1, var2, var8);
               a(Dd.LEFT, var3, var5, var7, var6, var1, var2, var8);
               a(Dd.RIGHT, var3, var5, var7, var6, var1, var2, var8);
            }
         }
      }

      return var3;
   }

   private static void a(Dd var0, List<Dc> var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      boolean var8 = a(var2, var3 + var0.a(), var4 + var0.b(), var5, var6) && var7;
      if (var8) {
         a(var1, var0, var3, var4);
      }

   }

   private static void a(List<Dc> var0, Dd var1, int var2, int var3) {
      Dc var4 = null;
      int var5 = 0;

      int var6;
      for(var6 = var0.size(); var5 < var6; ++var5) {
         Dc var7 = (Dc)var0.get(var5);
         if (var7.a() == var1) {
            int var8 = Dd.a(var1) ? var3 : var2;
            if (var7.c() == var8) {
               var4 = var7;
               break;
            }
         }
      }

      var5 = Dd.a(var1) ? var3 : var2;
      var6 = Dd.a(var1) ? var2 : var3;
      if (var4 == null) {
         var0.add(new Dc(var1, var6, var5));
      } else {
         var4.a(var6);
      }

   }

   private static boolean a(int[] var0, int var1, int var2, int var3, int var4) {
      if (var1 >= 0 && var2 >= 0 && var1 < var3 && var2 < var4) {
         return (var0[var2 * var3 + var1] >> 24 & 255) == 0;
      } else {
         return true;
      }
   }
}
