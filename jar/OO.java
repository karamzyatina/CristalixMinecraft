import java.util.Random;

public final class oo extends nM {
   public static final sq a;
   protected static final acU d;

   public oo() {
      super(si.e);
      this.a(this.a.a().a(a, abP.NORTH));
      this.a(KC.b);
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      return d;
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean i(sD var1) {
      return true;
   }

   public abO a(sD var1) {
      return abO.ENTITYBLOCK_ANIMATED;
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      return this.a().a(a, var10.b().a());
   }

   public void a(aej var1, acV var2, sD var3, Oh var4, Vh var5) {
      var1.a((acV)var2, (sD)var3.a(a, var4.b().a()), 2);
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      return true;
   }

   public aaD a(aej var1, int var2) {
      return new aaY();
   }

   public void a(sD var1, aej var2, int var3, int var4, int var5, Random var6) {
      for(int var7 = 0; var7 < 3; ++var7) {
         int var8 = var6.nextInt(2) * 2 - 1;
         int var9 = var6.nextInt(2) * 2 - 1;
         double var10 = (double)var3 + 0.5D + 0.25D * (double)var8;
         double var12 = (double)((float)var4 + var6.nextFloat());
         double var14 = (double)var5 + 0.5D + 0.25D * (double)var9;
         double var16 = (double)(var6.nextFloat() * (float)var8);
         double var18 = ((double)var6.nextFloat() - 0.5D) * 0.125D;
         double var20 = (double)(var6.nextFloat() * (float)var9);
         var2.a(abW.PORTAL, var10, var12, var14, var16, var18, var20);
      }

   }

   public sD a(int var1) {
      abP var2 = abP.a(var1);
      if (var2.a() == abR.Y) {
         var2 = abP.NORTH;
      }

      return this.a().a(a, var2);
   }

   public int c(sD var1) {
      return ((abP)var1.a((so)a)).getIndex();
   }

   public sD a(sD var1, acE var2) {
      return var1.a(a, var2.a((abP)var1.a((so)a)));
   }

   public sD a(sD var1, act var2) {
      return var1.a((acE)var2.a((abP)var1.a((so)a)));
   }

   public sy a() {
      return new sy(this, a);
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return su.UNDEFINED;
   }

   static {
      a = oV.a;
      d = (new acU(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.875D, 0.9375D)).a();
   }
}
