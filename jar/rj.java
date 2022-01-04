import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public class rJ extends mY {
   public static final sq a = sq.a("facing", (Predicate)(new rK()));
   protected static final acU d = (new acU(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.6000000238418579D, 0.6000000238418579D)).a();
   protected static final acU e = (new acU(0.3499999940395355D, 0.20000000298023224D, 0.699999988079071D, 0.6499999761581421D, 0.800000011920929D, 1.0D)).a();
   protected static final acU f = (new acU(0.3499999940395355D, 0.20000000298023224D, 0.0D, 0.6499999761581421D, 0.800000011920929D, 0.30000001192092896D)).a();
   protected static final acU g = (new acU(0.699999988079071D, 0.20000000298023224D, 0.3499999940395355D, 1.0D, 0.800000011920929D, 0.6499999761581421D)).a();
   protected static final acU h = (new acU(0.0D, 0.20000000298023224D, 0.3499999940395355D, 0.30000001192092896D, 0.800000011920929D, 0.6499999761581421D)).a();

   public rJ() {
      super(si.q);
      this.a(this.a.a().a(a, abP.UP));
      this.a(true);
      this.a(KC.b);
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   public acU b(sD var1, aec var2, int var3, int var4, int var5) {
      return c;
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   private boolean b(aej var1, int var2, int var3, int var4) {
      sD var5 = var1.a(var2, var3, var4);
      nh var6 = var5.a();
      boolean var7 = var6 == RQ.j || var6 == RQ.ap;
      if (var5.isTopSolid()) {
         return !var7;
      } else {
         boolean var8 = var6 instanceof os || var6 == RQ.o || var6 == RQ.bf || var6 == RQ.a;
         return var8 && !var7;
      }
   }

   private boolean b(aej var1, acV var2) {
      return this.b(var1, var2.a, var2.b, var2.c);
   }

   public boolean a(aej var1, int var2, int var3, int var4) {
      Iterator var5 = a.getAllowedValues().iterator();

      abP var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (abP)var5.next();
      } while(!this.b(var1, var2, var3, var4, var6));

      return true;
   }

   private boolean b(aej var1, int var2, int var3, int var4, abP var5) {
      abP var6 = var5.a();
      int var7 = var2 + var6.getXOffset();
      int var8 = var3 + var6.getYOffset();
      int var9 = var4 + var6.getZOffset();
      sD var10 = var1.a(var7, var8, var9);
      nh var11 = var10.a();
      su var12 = var10.a(var1, var7, var8, var9, var5);
      if (var5.equals(abP.UP) && this.b(var1, var7, var8, var9)) {
         return true;
      } else if (var5 != abP.UP && var5 != abP.DOWN) {
         return !b(var11) && var12 == su.SOLID;
      } else {
         return false;
      }
   }

   private boolean b(aej var1, acV var2, abP var3) {
      return this.b(var1, var2.a, var2.b, var2.c, var3);
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      if (this.b(var1, var2, var3, var4, var5)) {
         return this.a().a(a, var5);
      } else {
         abP[] var11 = abT.HORIZONTAL.a();
         int var12 = var11.length;

         for(int var13 = 0; var13 < var12; ++var13) {
            abP var14 = var11[var13];
            if (this.b(var1, var2, var3, var4, var14)) {
               return this.a().a(a, var14);
            }
         }

         return this.a();
      }
   }

   public void a(sD var1, aej var2, int var3, int var4, int var5, Random var6) {
      abP var7 = (abP)var1.a((so)a);
      double var8 = (double)var3 + 0.5D;
      double var10 = (double)var4 + 0.7D;
      double var12 = (double)var5 + 0.5D;
      if (var7.a().isHorizontal()) {
         abP var14 = var7.a();
         var2.a(abW.SMOKE_NORMAL, var8 + 0.27D * (double)var14.getXOffset(), var10 + 0.22D, var12 + 0.27D * (double)var14.getZOffset(), 0.0D, 0.0D, 0.0D);
         var2.a(abW.FLAME, var8 + 0.27D * (double)var14.getXOffset(), var10 + 0.22D, var12 + 0.27D * (double)var14.getZOffset(), 0.0D, 0.0D, 0.0D);
      } else {
         var2.a(abW.SMOKE_NORMAL, var8, var10, var12, 0.0D, 0.0D, 0.0D);
         var2.a(abW.FLAME, var8, var10, var12, 0.0D, 0.0D, 0.0D);
      }

   }

   public abu a() {
      return abu.CUTOUT;
   }

   public sD a(int var1) {
      sD var2 = this.a();
      switch(var1) {
      case 1:
         var2 = var2.a(a, abP.EAST);
         break;
      case 2:
         var2 = var2.a(a, abP.WEST);
         break;
      case 3:
         var2 = var2.a(a, abP.SOUTH);
         break;
      case 4:
         var2 = var2.a(a, abP.NORTH);
         break;
      case 5:
      default:
         var2 = var2.a(a, abP.UP);
      }

      return var2;
   }

   public int c(sD var1) {
      // $FF: Couldn't be decompiled
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
}
