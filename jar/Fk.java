public class FK extends FU {
   private static final acC a = new acC("textures/entity/guardian.png");
   private static final Lg a = new Lg("textures/entity/guardian_beam.png");
   private static final acC b;

   public FK(Ga var1) {
      super(var1, new xu(var1.a), 0.5F);
   }

   public boolean a(PT var1, Fb var2, double var3, double var5, double var7) {
      if (super.a((Of)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         if (var1.y()) {
            Oh var9 = var1.d();
            if (var9 != null) {
               adm var10 = this.a(var9, (double)var9.b.a() * 0.5D, 1.0F);
               adm var11 = this.a(var1, (double)var1.getEyeHeight(), 1.0F);
               if (var2.a(new acU(var11.a, var11.b, var11.c, var10.a, var10.b, var10.c))) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private adm a(Oh var1, double var2, float var4) {
      double var5 = var1.g + (var1.d - var1.g) * (double)var4;
      double var7 = var2 + var1.h + (var1.e - var1.h) * (double)var4;
      double var9 = var1.i + (var1.f - var1.i) * (double)var4;
      return new adm(var5, var7, var9);
   }

   public void a(PT var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((Of)var1, var2, var4, var6, var8, var9);
      Oh var10 = var1.d();
      if (var10 != null) {
         float var11 = var1.e(var9);
         Cw var12 = this.a.a;
         Bh var13 = var12.a();
         this.a((Lg)a);
         By.b(3553, 10242, 10497);
         By.b(3553, 10243, 10497);
         By.f();
         By.q();
         By.k();
         By.a(true);
         Ci.a(Ci.o, 240.0F, 240.0F);
         By.a(BU.SRC_ALPHA, BL.ONE, BU.ONE, BL.ZERO);
         float var14 = (float)var1.a.a() + var9;
         float var15 = var14 * 0.5F % 1.0F;
         float var16 = var1.getEyeHeight();
         By.C();
         By.c((float)var2, (float)var4 + var16, (float)var6);
         adm var17 = this.a(var10, (double)var10.b.a() * 0.5D, var9);
         adm var18 = this.a(var1, (double)var16, var9);
         adm var19 = var17.c(var18);
         double var20 = var19.length() + 1.0D;
         var19 = var19.a();
         float var22 = (float)Math.acos(var19.b);
         float var23 = (float)Math.atan2(var19.c, var19.a);
         By.b((1.5707964F + -var23) * 57.295776F, 0.0F, 1.0F, 0.0F);
         By.b(var22 * 57.295776F, 1.0F, 0.0F, 0.0F);
         double var24 = (double)var14 * 0.05D * -1.5D;
         var13.a(7, In.i);
         float var26 = var11 * var11;
         int var27 = 64 + (int)(var26 * 191.0F);
         int var28 = 32 + (int)(var26 * 191.0F);
         int var29 = 128 - (int)(var26 * 64.0F);
         double var30 = 0.0D + Math.cos(var24 + 2.356194490192345D) * 0.282D;
         double var32 = 0.0D + Math.sin(var24 + 2.356194490192345D) * 0.282D;
         double var34 = 0.0D + Math.cos(var24 + 0.7853981633974483D) * 0.282D;
         double var36 = 0.0D + Math.sin(var24 + 0.7853981633974483D) * 0.282D;
         double var38 = 0.0D + Math.cos(var24 + 3.9269908169872414D) * 0.282D;
         double var40 = 0.0D + Math.sin(var24 + 3.9269908169872414D) * 0.282D;
         double var42 = 0.0D + Math.cos(var24 + 5.497787143782138D) * 0.282D;
         double var44 = 0.0D + Math.sin(var24 + 5.497787143782138D) * 0.282D;
         double var46 = 0.0D + Math.cos(var24 + 3.141592653589793D) * 0.2D;
         double var48 = 0.0D + Math.sin(var24 + 3.141592653589793D) * 0.2D;
         double var50 = 0.0D + Math.cos(var24 + 0.0D) * 0.2D;
         double var52 = 0.0D + Math.sin(var24 + 0.0D) * 0.2D;
         double var54 = 0.0D + Math.cos(var24 + 1.5707963267948966D) * 0.2D;
         double var56 = 0.0D + Math.sin(var24 + 1.5707963267948966D) * 0.2D;
         double var58 = 0.0D + Math.cos(var24 + 4.71238898038469D) * 0.2D;
         double var60 = 0.0D + Math.sin(var24 + 4.71238898038469D) * 0.2D;
         double var62 = (double)(-1.0F + var15);
         double var64 = var20 * 2.5D + var62;
         var13.a(var46, var20, var48).a(0.4999D, var64).a(var27, var28, var29, 255).endVertex();
         var13.a(var46, 0.0D, var48).a(0.4999D, var62).a(var27, var28, var29, 255).endVertex();
         var13.a(var50, 0.0D, var52).a(0.0D, var62).a(var27, var28, var29, 255).endVertex();
         var13.a(var50, var20, var52).a(0.0D, var64).a(var27, var28, var29, 255).endVertex();
         var13.a(var54, var20, var56).a(0.4999D, var64).a(var27, var28, var29, 255).endVertex();
         var13.a(var54, 0.0D, var56).a(0.4999D, var62).a(var27, var28, var29, 255).endVertex();
         var13.a(var58, 0.0D, var60).a(0.0D, var62).a(var27, var28, var29, 255).endVertex();
         var13.a(var58, var20, var60).a(0.0D, var64).a(var27, var28, var29, 255).endVertex();
         double var66 = 0.0D;
         if (var1.b % 2 == 0) {
            var66 = 0.5D;
         }

         var13.a(var30, var20, var32).a(0.5D, var66 + 0.5D).a(var27, var28, var29, 255).endVertex();
         var13.a(var34, var20, var36).a(1.0D, var66 + 0.5D).a(var27, var28, var29, 255).endVertex();
         var13.a(var42, var20, var44).a(1.0D, var66).a(var27, var28, var29, 255).endVertex();
         var13.a(var38, var20, var40).a(0.5D, var66).a(var27, var28, var29, 255).endVertex();
         var12.draw();
         By.D();
      }

   }

   protected acC a(PT var1) {
      return a;
   }

   static {
      b = a;
   }
}
