import java.util.List;
import java.util.Random;

public final class nq extends nM {
   public static final sp[] a = new sp[]{sp.a("has_bottle_0"), sp.a("has_bottle_1"), sp.a("has_bottle_2")};
   protected static final acU d = (new acU(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D)).a();
   protected static final acU e = (new acU(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.875D, 0.5625D)).a();

   public nq() {
      super(si.f);
      this.a(this.a.a().a(a[0], Boolean.FALSE).a(a[1], Boolean.FALSE).a(a[2], Boolean.FALSE));
   }

   public String getLocalizedName() {
      return adM.a("item.brewingStand.name");
   }

   public boolean j(sD var1) {
      return false;
   }

   public abO a(sD var1) {
      return abO.MODEL;
   }

   public aaD a(aej var1, int var2) {
      return new aaL();
   }

   public boolean h(sD var1) {
      return false;
   }

   public void a(sD var1, aej var2, int var3, int var4, int var5, acU var6, List<acU> var7, NN var8, boolean var9) {
      a(var3, var4, var5, var6, var7, e);
      a(var3, var4, var5, var6, var7, d);
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      return d;
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      return true;
   }

   public void a(aej var1, acV var2, sD var3, Oh var4, Vh var5) {
      if (var5.hasDisplayName()) {
         aaD var6 = var1.a(var2);
         if (var6 instanceof aaL) {
            ((aaL)var6).a(var5.getDisplayName());
         }
      }

   }

   public void a(sD var1, aej var2, int var3, int var4, int var5, Random var6) {
      double var7 = (double)((float)var3 + 0.4F + var6.nextFloat() * 0.2F);
      double var9 = (double)((float)var4 + 0.7F + var6.nextFloat() * 0.3F);
      double var11 = (double)((float)var5 + 0.4F + var6.nextFloat() * 0.2F);
      var2.a(abW.SMOKE_NORMAL, var7, var9, var11, 0.0D, 0.0D, 0.0D);
   }

   public Vh a(aej var1, int var2, int var3, int var4, sD var5) {
      return new Vh(RT.bp);
   }

   public boolean k(sD var1) {
      return true;
   }

   public int a(sD var1, aej var2, int var3, int var4, int var5) {
      return RY.a(var2.a(var3, var4, var5));
   }

   public abu a() {
      return abu.CUTOUT;
   }

   public sD a(int var1) {
      sD var2 = this.a();

      for(int var3 = 0; var3 < 3; ++var3) {
         var2 = var2.a(a[var3], (var1 & 1 << var3) > 0);
      }

      return var2;
   }

   public int c(sD var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 3; ++var3) {
         if ((Boolean)var1.a((so)a[var3])) {
            var2 |= 1 << var3;
         }
      }

      return var2;
   }

   public sy a() {
      return new sy(this, new so[]{a[0], a[1], a[2]});
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return su.UNDEFINED;
   }
}
