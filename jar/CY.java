import java.util.List;

public final class Cy extends Bl {
   private double d;
   private double e;
   private double f;

   public void a(abu var1) {
      if (this.a) {
         int var3;
         if (!afT.an()) {
            List var11 = this.a;
            var3 = 0;

            for(int var12 = var11.size(); var3 < var12; ++var3) {
               Et var13 = (Et)var11.get(var3);
               Io var14 = var13.a(var1.ordinal());
               By.C();
               this.a(var13);
               var13.c();
               var14.a();
               this.a();
               var14.a(7);
               By.D();
            }
         } else {
            int var2 = Integer.MIN_VALUE;
            var3 = Integer.MIN_VALUE;
            ajX var4 = null;
            List var5 = this.a;
            int var6 = 0;
            int var7 = var5.size();

            while(true) {
               if (var6 >= var7) {
                  if (var4 != null) {
                     this.a(var2, var3, var4);
                  }
                  break;
               }

               Et var8 = (Et)var5.get(var6);
               Io var9 = var8.a(var1.ordinal());
               ajX var10 = var9.a();
               if (var10 != var4 || var2 != var8.a || var3 != var8.c) {
                  if (var4 != null) {
                     this.a(var2, var3, var4);
                  }

                  var2 = var8.a;
                  var3 = var8.c;
                  var4 = var10;
               }

               var9.a(7);
               ++var6;
            }
         }

         Ci.c(Ci.J, 0);
         By.E();
         this.a.clear();
      }

   }

   public void a() {
      if (afT.ad()) {
         akF.a();
      } else {
         By.d(3, 5126, 28, 0);
         By.e(4, 5121, 28, 12);
         By.c(2, 5126, 28, 16);
         Ci.j(Ci.o);
         By.c(2, 5122, 28, 24);
         Ci.j(Ci.n);
      }

   }

   public void a(double var1, double var3, double var5) {
      this.d = var1;
      this.e = var3;
      this.f = var5;
      super.a(var1, var3, var5);
   }

   private void a(int var1, int var2, ajX var3) {
      By.C();
      this.a(var1, 0, var2);
      var3.a(this);
      By.D();
   }

   public void a(int var1, int var2, int var3) {
      By.c((float)((double)var1 - this.d), (float)((double)var2 - this.e), (float)((double)var3 - this.f));
   }
}
