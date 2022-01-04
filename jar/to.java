public final class TO extends SZ implements LH {
   private final nh a;

   public TO(nh var1) {
      this.a = 1;
      this.a = var1;
      this.a(KC.e);
   }

   public abs<Vh> a(aej var1, Rn var2, abU var3) {
      return LO.a((LH)this, (aej)var1, (Rn)var2, (abU)var3);
   }

   public Vh a(Vh var1, Rn var2, SZ var3) {
      if (var2.a.d) {
         return var1;
      } else {
         var1.shrink(1);
         if (var1.isEmpty()) {
            return new Vh(var3);
         } else {
            if (!var2.a.a(new Vh(var3))) {
               var2.a(new Vh(var3), false);
            }

            return var1;
         }
      }
   }

   public boolean a(Rn var1, aej var2, acV var3) {
      if (this.a == RQ.a) {
         return false;
      } else {
         sD var4 = var2.a(var3);
         si var5 = var4.a();
         boolean var6 = !var5.isSolid();
         boolean var7 = var4.a().a((aec)var2, (acV)var3);
         if (!var2.a(var3) && !var6 && !var7) {
            return false;
         } else {
            if (var2.a.c() && this.a == RQ.a) {
               int var12 = var3.a;
               int var9 = var3.b;
               int var10 = var3.c;
               var2.a(var1, var3, RW.bN, acI.BLOCKS, 0.5F, 2.6F + (var2.a.nextFloat() - var2.a.nextFloat()) * 0.8F);

               for(int var11 = 0; var11 < 8; ++var11) {
                  var2.a(abW.SMOKE_LARGE, (double)var12 + Math.random(), (double)var9 + Math.random(), (double)var10 + Math.random(), 0.0D, 0.0D, 0.0D);
               }
            } else {
               acJ var8 = this.a == RQ.b ? RW.R : RW.Q;
               var2.a(var1, var3, var8, acI.BLOCKS, 1.0F, 1.0F);
               var2.a((acV)var3, (sD)this.a.a(), 11);
            }

            return true;
         }
      }
   }

   public nh a() {
      return this.a;
   }
}
