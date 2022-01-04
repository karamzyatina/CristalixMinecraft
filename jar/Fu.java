public abstract class FU extends FV {
   public FU(Ga var1, wY var2, float var3) {
      super(var1, var2, var3);
   }

   protected boolean a(T var1) {
      return super.a((Oh)var1) && (var1.getAlwaysRenderNameTagForRender() || var1.hasCustomName() && var1 == this.a.b);
   }

   public boolean a(T var1, Fb var2, double var3, double var5, double var7) {
      if (super.a(var1, var2, var3, var5, var7)) {
         return true;
      } else if (var1.getLeashed() && var1.e() != null) {
         NN var9 = var1.e();
         return var2.a(var9.c());
      } else {
         return false;
      }
   }

   public void a(T var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((Oh)var1, var2, var4, var6, var8, var9);
      if (!this.a) {
         this.b(var1, var2, var4, var6, var8, var9);
      }

   }

   public void a(T var1) {
      int var2 = var1.getBrightnessForRender();
      int var3 = var2 % 65536;
      int var4 = var2 / 65536;
      Ci.a(Ci.o, (float)var3, (float)var4);
   }

   private static double a(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   protected void b(T var1, double var2, double var4, double var6, float var8, float var9) {
      if (!afT.ad() || !akC.c) {
         NN var10 = var1.e();
         if (var10 != null) {
            var4 -= (1.6D - (double)var1.b.a()) * 0.5D;
            Cw var11 = this.a.a;
            Bh var12 = var11.a();
            double var13 = a((double)var10.l, (double)var10.j, (double)(var9 * 0.5F)) * 0.01745329238474369D;
            double var15 = a((double)var10.m, (double)var10.k, (double)(var9 * 0.5F)) * 0.01745329238474369D;
            double var17 = Math.cos(var13);
            double var19 = Math.sin(var13);
            double var21 = Math.sin(var15);
            if (var10 instanceof NY) {
               var17 = 0.0D;
               var19 = 0.0D;
               var21 = -1.0D;
            }

            double var23 = Math.cos(var15);
            double var25 = a(var10.a, var10.d, (double)var9) - var17 * 0.7D - var19 * 0.5D * var23;
            double var27 = a(var10.b + (double)var10.getEyeHeight() * 0.7D, var10.e + (double)var10.getEyeHeight() * 0.7D, (double)var9) - var21 * 0.5D - 0.25D;
            double var29 = a(var10.c, var10.f, (double)var9) - var19 * 0.7D + var17 * 0.5D * var23;
            double var31 = a((double)var1.B, (double)var1.A, (double)var9) * 0.01745329238474369D + 1.5707963267948966D;
            var17 = Math.cos(var31) * (double)var1.a.a() * 0.4D;
            var19 = Math.sin(var31) * (double)var1.a.a() * 0.4D;
            double var33 = a(var1.a, var1.d, (double)var9) + var17;
            double var35 = a(var1.b, var1.e, (double)var9);
            double var37 = a(var1.c, var1.f, (double)var9) + var19;
            var2 += var17;
            var6 += var19;
            double var39 = (double)((float)(var25 - var33));
            double var41 = (double)((float)(var27 - var35));
            double var43 = (double)((float)(var29 - var37));
            By.w();
            By.f();
            By.q();
            if (afT.ad()) {
               akC.A(this.a.a);
            }

            var12.a(5, In.f);

            int var45;
            float var46;
            float var47;
            float var48;
            float var49;
            for(var45 = 0; var45 <= 24; ++var45) {
               var46 = 0.5F;
               var47 = 0.4F;
               var48 = 0.3F;
               if (var45 % 2 == 0) {
                  var46 *= 0.7F;
                  var47 *= 0.7F;
                  var48 *= 0.7F;
               }

               var49 = (float)var45 / 24.0F;
               var12.a(var2 + var39 * (double)var49 + 0.0D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var45) / 18.0F + 0.125F), var6 + var43 * (double)var49).a(var46, var47, var48, 1.0F).endVertex();
               var12.a(var2 + var39 * (double)var49 + 0.025D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var45) / 18.0F + 0.125F) + 0.025D, var6 + var43 * (double)var49).a(var46, var47, var48, 1.0F).endVertex();
            }

            var11.draw();
            var12.a(5, In.f);

            for(var45 = 0; var45 <= 24; ++var45) {
               var46 = 0.5F;
               var47 = 0.4F;
               var48 = 0.3F;
               if (var45 % 2 == 0) {
                  var46 *= 0.7F;
                  var47 *= 0.7F;
                  var48 *= 0.7F;
               }

               var49 = (float)var45 / 24.0F;
               var12.a(var2 + var39 * (double)var49 + 0.0D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var45) / 18.0F + 0.125F) + 0.025D, var6 + var43 * (double)var49).a(var46, var47, var48, 1.0F).endVertex();
               var12.a(var2 + var39 * (double)var49 + 0.025D, var4 + var41 * (double)(var49 * var49 + var49) * 0.5D + (double)((24.0F - (float)var45) / 18.0F + 0.125F), var6 + var43 * (double)var49 + 0.025D).a(var46, var47, var48, 1.0F).endVertex();
            }

            var11.draw();
            if (afT.ad()) {
               akC.B(this.a.a);
            }

            By.e();
            By.v();
            By.p();
         }
      }

   }
}
