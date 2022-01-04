import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Iterator;
import java.util.Map;

public final class Ie {
   public final Map<Class<? extends aaD>, Ik<? extends aaD>> a = new Reference2ObjectArrayMap(18);
   public final tI a;
   public static double a;
   public static double b;
   public static double c;
   public final HM a;
   public aej a;
   public NN a;
   public float a;
   public float b;
   public adi a;
   public double d;
   public double e;
   public double f;
   public aaD a;
   public final Ii a;

   public Ie(sE var1) {
      this.a = var1.a;
      this.a = var1.a();
      this.a.put(abn.class, new Ih(var1));
      this.a.put(abe.class, new Ic(var1));
      this.a.put(abh.class, new Id(var1));
      this.a.put(aaM.class, new HW(var1));
      this.a.put(aaY.class, new Ia(var1));
      this.a.put(aaV.class, new HX(var1));
      this.a.put(aaX.class, new HZ(var1));
      this.a.put(aaW.class, new HY(var1));
      this.a.put(aaI.class, new HU(var1));
      this.a.put(abo.class, this.a = new Ii(var1));
      this.a.put(aaH.class, new HT(var1));
      this.a.put(abp.class, new Il(var1));
      this.a.put(abk.class, new If(var1, new xR(var1)));
      this.a.put(aaK.class, new HV(var1));
      Iterator var2 = this.a.values().iterator();

      while(var2.hasNext()) {
         Ik var3 = (Ik)var2.next();
         var3.a(this);
      }

   }

   public <T extends aaD> Ik<T> a(Class var1) {
      return (Ik)this.a.get(var1);
   }

   public <T extends aaD> Ik<T> a(aaD var1) {
      if (var1 != null && !var1.b()) {
         Ik var2 = var1.a;
         return var2 == null ? (var1.a = this.a(var1.getClass())) : var2;
      } else {
         return null;
      }
   }

   public void a(aej var1, NN var2, adi var3, float var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      float var5 = var2.l;
      float var6 = var2.m;
      this.a = var5 + (var2.j - var5) * var4;
      this.b = var6 + (var2.k - var6) * var4;
      double var7 = var2.g;
      double var9 = var2.h;
      double var11 = var2.i;
      this.d = var7 + (var2.d - var7) * (double)var4;
      this.e = var9 + (var2.e - var9) * (double)var4;
      this.f = var11 + (var2.f - var11) * (double)var4;
   }

   public void a(aaD var1, float var2, int var3) {
      if (var1.a(this.d, this.e, this.f) < var1.a()) {
         int var4 = var1.b();
         int var5 = var1.c();
         int var6 = var1.d();
         Co.b();
         int var7 = this.a.getCombinedLight(var4, var5, var6, 0);
         int var8 = var7 % 65536;
         int var9 = var7 / 65536;
         Ci.a(Ci.o, (float)var8, (float)var9);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         if (agp.a()) {
            agp.a();
         }

         double var10 = (double)var4 - a;
         double var12 = (double)var5 - b;
         double var14 = (double)var6 - c;
         this.a(var1, var10, var12, var14, var2, var3, 1.0F);
         if (agp.a()) {
            if (agp.b()) {
               agp.b();
               this.a(var1, var10, var12, var14, var2, var3, 1.0F);
               agp.c();
            }

            agp.d();
         }
      }

   }

   public void a(aaD var1, double var2, double var4, double var6, float var8) {
      this.a(var1, var2, var4, var6, var8, 1.0F);
   }

   public void a(aaD var1, double var2, double var4, double var6, float var8, float var9) {
      this.a(var1, var2, var4, var6, var8, -1, var9);
   }

   public void a(aaD var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      Ik var11 = this.a(var1);
      if (var11 != null) {
         try {
            this.a = var1;
            var11.a(var1, var2, var4, var6, var8, var9, var10);
            this.a = null;
         } catch (Throwable var15) {
            Kn var13 = Kn.a(var15, "Rendering Block Entity");
            Ku var14 = var13.a("Block Entity Details");
            var1.a(var14);
            throw new acB(var13);
         }
      }

   }

   public void a(aej var1) {
      this.a = var1;
      if (var1 == null) {
         this.a = null;
      }

   }

   public tI a() {
      return this.a;
   }
}
