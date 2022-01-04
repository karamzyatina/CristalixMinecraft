import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.util.vector.Vector3f;

public final class ajA {
   public static CV a(HO var0, HK var1, int var2) {
      ObjectArrayList var3 = new ObjectArrayList();
      abP[] var4 = abP.VALUES;
      EnumMap var5 = new EnumMap(abP.class);

      for(int var6 = 0; var6 < var4.length; ++var6) {
         abP var7 = var4[var6];
         var5.put(var7, Collections.singletonList(a(var0, var7, var1, var2)));
      }

      return new Dz(var3, var5, true, true, var1, CW.a, Dg.a);
   }

   public static CV a(CV var0, CV var1) {
      ObjectArrayList var2 = new ObjectArrayList();
      var2.addAll(var0.a((sD)null, (abP)null, 0L));
      var2.addAll(var1.a((sD)null, (abP)null, 0L));
      abP[] var3 = abP.VALUES;
      EnumMap var4 = new EnumMap(abP.class);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         abP var6 = var3[var5];
         ReferenceArrayList var7 = new ReferenceArrayList();
         var7.addAll(var0.a((sD)null, var6, 0L));
         var7.addAll(var1.a((sD)null, var6, 0L));
         var4.put(var6, var7);
      }

      boolean var10 = var0.isAmbientOcclusion();
      boolean var11 = var0.isBuiltInRenderer();
      HK var12 = var0.a();
      CW var8 = var0.a();
      Dg var9 = var0.a();
      return new Dz(var2, var4, var10, var11, var12, var8, var9);
   }

   public static CD a(HO var0, abP var1, HK var2, int var3) {
      Vector3f var4 = Lh.a;
      Vector3f var5 = Lh.b;
      CF var6 = new CF(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      CK var7 = new CK(var1, var3, '#' + var1.getName(), var6);
      return CO.a(var0, var4, var5, var7, var2, var1, Dw.X0_Y0, (CM)null, false, true);
   }

   public static CV a(HO var0, Du var1, String var2, HK var3, HK var4) {
      if (var3 != null && var4 != null) {
         Dv var5 = new Dv(var2, "normal");
         CV var6 = var1.a(var5);
         if (var6 != null && var6 != var1.a()) {
            CV var7 = ajD.a(var6);
            abP[] var8 = abP.VALUES;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               abP var10 = var8[var9];
               List var11 = var7.a((sD)null, var10, 0L);
               a(var0, var11, var3, var4);
            }

            List var12 = var7.a((sD)null, (abP)null, 0L);
            a(var0, var12, var3, var4);
            return var7;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static void a(HO var0, List<CD> var1, HK var2, HK var3) {
      ArrayList var4 = new ArrayList();
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         CD var6 = (CD)var5.next();
         if (var6.a() != var2) {
            var4.add(var6);
            break;
         }

         var4.add(new CE(var0, var6, var3));
      }

      var1.clear();
      var1.addAll(var4);
   }

   public static void a(Vector3f var0) {
      var0.setX(a(var0.getX()));
      var0.setY(a(var0.getY()));
      var0.setZ(a(var0.getZ()));
   }

   private static float a(float var0) {
      if (var0 > -1.0E-6F && var0 < 1.0E-6F) {
         return 0.0F;
      } else {
         return var0 > 0.999999F && var0 < 1.000001F ? 1.0F : var0;
      }
   }

   public static acU a(acU var0, mZ var1, int var2, int var3) {
      long var4 = (long)(var2 * 3129871) ^ (long)var3 * 116129781L;
      var4 = var4 * var4 * 42317861L + var4 * 11L;
      double var6 = ((double)((float)(var4 >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D;
      double var8 = ((double)((float)(var4 >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D;
      double var10 = 0.0D;
      if (var1 == mZ.XYZ) {
         var10 = ((double)((float)(var4 >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D;
      }

      return var0.h(var6, var10, var8);
   }
}
