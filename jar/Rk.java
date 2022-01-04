import java.util.Random;

public final class rk extends mY {
   public static final sp a = sp.a("wet");

   public rk() {
      super(si.m);
      this.a(this.a.a().a(a, Boolean.FALSE));
      this.a(KC.a);
   }

   public String getLocalizedName() {
      return adM.a(this.getTranslationKey() + ".dry.name");
   }

   public int d(sD var1) {
      return (Boolean)var1.a((so)a) ? 1 : 0;
   }

   public void a(KC var1, acz<Vh> var2) {
      var2.add(new Vh(this, 1, 0));
      var2.add(new Vh(this, 1, 1));
   }

   public sD a(int var1) {
      return this.a().a(a, (var1 & 1) == 1);
   }

   public int c(sD var1) {
      return (Boolean)var1.a((so)a) ? 1 : 0;
   }

   public sy a() {
      return new sy(this, a);
   }

   public void a(sD var1, aej var2, int var3, int var4, int var5, Random var6) {
      if ((Boolean)var1.a((so)a)) {
         abP var7 = abP.a(var6);
         if (var7 != abP.UP && !var2.a(var3 + var7.getXOffset(), var4 + var7.getYOffset(), var5 + var7.getZOffset()).isTopSolid()) {
            double var8 = (double)var3;
            double var10 = (double)var4;
            double var12 = (double)var5;
            if (var7 == abP.DOWN) {
               var10 -= 0.05D;
               var8 += var6.nextDouble();
               var12 += var6.nextDouble();
            } else {
               var10 += var6.nextDouble() * 0.8D;
               if (var7.a() == abR.X) {
                  var12 += var6.nextDouble();
                  if (var7 == abP.EAST) {
                     ++var8;
                  } else {
                     var8 += 0.05D;
                  }
               } else {
                  var8 += var6.nextDouble();
                  if (var7 == abP.SOUTH) {
                     ++var12;
                  } else {
                     var12 += 0.05D;
                  }
               }
            }

            var2.a(abW.DRIP_WATER, var8, var10, var12, 0.0D, 0.0D, 0.0D);
         }
      }

   }
}
