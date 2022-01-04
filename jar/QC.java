import java.util.Random;

public final class qC extends qz {
   public static final sp a = sp.a("locked");
   public static final st a = st.a("delay", 1, 4);

   public qC(boolean var1) {
      super(var1);
      this.a(this.a.a().a(a, abP.NORTH).a(a, acm.a(1)).a(a, Boolean.FALSE));
   }

   public String getLocalizedName() {
      return adM.a("item.diode.name");
   }

   public sD a(sD var1, aec var2, int var3, int var4, int var5) {
      return var1.a(a, this.a(var2, var3, var4, var5, var1));
   }

   public sD a(sD var1, acE var2) {
      return var1.a(a, var2.a((abP)var1.a((so)a)));
   }

   public sD a(sD var1, act var2) {
      return var1.a((acE)var2.a((abP)var1.a((so)a)));
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      if (!var6.a.a.a()) {
         return false;
      } else {
         var1.a(var2, var3, var4, var5.a((so)a), 3);
         return true;
      }
   }

   protected int f(sD var1) {
      return (Integer)var1.a((so)a) * 2;
   }

   protected sD a(sD var1) {
      Integer var2 = (Integer)var1.a((so)a);
      Boolean var3 = (Boolean)var1.a((so)a);
      abP var4 = (abP)var1.a((so)a);
      return RQ.b.a().a(a, var4).a(a, var2).a(a, var3);
   }

   protected sD b(sD var1) {
      Integer var2 = (Integer)var1.a((so)a);
      Boolean var3 = (Boolean)var1.a((so)a);
      abP var4 = (abP)var1.a((so)a);
      return RQ.a.a().a(a, var4).a(a, var2).a(a, var3);
   }

   public Vh a(aej var1, int var2, int var3, int var4, sD var5) {
      return new Vh(RT.aN);
   }

   public boolean a(aec var1, int var2, int var3, int var4, sD var5) {
      return this.b(var1, var2, var3, var4, var5) > 0;
   }

   protected boolean n(sD var1) {
      return o(var1);
   }

   public void a(sD var1, aej var2, int var3, int var4, int var5, Random var6) {
      if (this.h) {
         abP var7 = (abP)var1.a((so)a);
         double var8 = (double)((float)var3 + 0.5F) + (double)(var6.nextFloat() - 0.5F) * 0.2D;
         double var10 = (double)((float)var4 + 0.4F) + (double)(var6.nextFloat() - 0.5F) * 0.2D;
         double var12 = (double)((float)var5 + 0.5F) + (double)(var6.nextFloat() - 0.5F) * 0.2D;
         float var14 = -5.0F;
         if (var6.nextBoolean()) {
            var14 = (float)((Integer)var1.a((so)a) * 2 - 1);
         }

         var14 /= 16.0F;
         double var15 = (double)(var14 * (float)var7.getXOffset());
         double var17 = (double)(var14 * (float)var7.getZOffset());
         var2.a(abW.REDSTONE, var8 + var15, var10, var12 + var17, 0.0D, 0.0D, 0.0D);
      }

   }

   public sD a(int var1) {
      return this.a().a(a, abP.b(var1)).a(a, Boolean.FALSE).a(a, acm.a(1 + (var1 >> 2)));
   }

   public int c(sD var1) {
      byte var2 = 0;
      int var3 = var2 | ((abP)var1.a((so)a)).getHorizontalIndex();
      var3 |= (Integer)var1.a((so)a) - 1 << 2;
      return var3;
   }

   public sy a() {
      return new sy(this, new so[]{a, a, a});
   }
}
