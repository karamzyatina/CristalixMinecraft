import dev.xdark.feder.RecyclableArrayList;

public final class TJ extends SZ {
   private final Pf a;

   public TJ(Pf var1) {
      this.a = var1;
      this.a = 1;
      this.a(KC.d);
      this.b("boat." + var1.a());
   }

   public abs<Vh> a(aej var1, Rn var2, abU var3) {
      Vh var4 = var2.a((abU)var3);
      float var5 = var2.m + (var2.k - var2.m) * 1.0F;
      float var6 = var2.l + (var2.j - var2.l) * 1.0F;
      double var7 = var2.a + (var2.d - var2.a) * 1.0D;
      double var9 = var2.b + (var2.e - var2.b) * 1.0D + (double)var2.getEyeHeight();
      double var11 = var2.c + (var2.f - var2.c) * 1.0D;
      adm var13 = new adm(var7, var9, var11);
      float var14 = adh.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = adh.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -adh.b(-var5 * 0.017453292F);
      float var17 = adh.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var19 = var14 * var16;
      adm var20 = var13.e((double)var18 * 5.0D, (double)var17 * 5.0D, (double)var19 * 5.0D);
      adi var21 = var1.a(var13, var20, true);
      if (var21 == null) {
         return new abs(abN.PASS, var4);
      } else {
         adm var22 = var2.a(1.0F);
         boolean var23 = false;
         RecyclableArrayList var24 = var1.b((NN)var2, (acU)var2.b().b(var22.a * 5.0D, var22.b * 5.0D, var22.c * 5.0D).c(1.0D));

         for(int var25 = 0; var25 < var24.size(); ++var25) {
            NN var26 = (NN)var24.get(var25);
            if (var26.g()) {
               acU var27 = var26.b().c((double)var26.b());
               if (var27.a(var13)) {
                  var23 = true;
               }
            }
         }

         var24.recycle();
         if (var23) {
            return new abs(abN.PASS, var4);
         } else if (var21.a != adj.BLOCK) {
            return new abs(abN.PASS, var4);
         } else {
            nh var28 = var1.a(var21.a()).a();
            boolean var29 = var28 == RQ.a || var28 == RQ.a;
            Pc var30 = new Pc(var1, var21.a.a, var29 ? var21.a.b - 0.12D : var21.a.b, var21.a.c);
            var30.a(this.a);
            var30.j = var2.j;
            if (!var1.a((NN)var30, (acU)var30.b().c(-0.1D)).checkEmptyAndRecycle()) {
               return new abs(abN.FAIL, var4);
            } else {
               if (!var2.a.d) {
                  var4.shrink(1);
               }

               return new abs(abN.SUCCESS, var4);
            }
         }
      }
   }
}
