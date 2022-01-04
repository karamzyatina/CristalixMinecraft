import java.util.List;

public final class HU extends Ik {
   private static final Lg a = new Lg("textures/entity/beacon_beam.png");
   public static final acC a;

   public HU(sE var1) {
      super(var1);
   }

   public void a(aaI var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      this.a(var1, var2, var4, var6, (double)var8, (double)var1.a(), var1.a(), (double)var1.b().a());
   }

   public void a(aaI var1, double var2, double var4, double var6, double var8, double var10, List<aaJ> var12, double var13) {
      if (var10 > 0.0D && var12.size() > 0) {
         if (afT.ad()) {
            akC.E(this.a);
         }

         By.a(516, 0.1F);
         La.a(var1.a());
         this.a((Lg)a);
         if (var10 > 0.0D) {
            Cw var15 = this.a.a;
            By.o();
            int var16 = 0;

            for(int var17 = 0; var17 < var12.size(); ++var17) {
               aaJ var18 = (aaJ)var12.get(var17);
               a(var15, var2, var4, var6, var8, var10, var13, var16, var18.a(), var18.a());
               var16 += var18.a();
            }

            By.n();
         }

         if (afT.ad()) {
            akC.F(this.a);
         }
      }

   }

   public static void a(Cw var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14, float[] var15) {
      a(var0, var1, var3, var5, var7, var9, var11, var13, var14, var15, 0.2D, 0.25D);
   }

   public static void a(Cw var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14, float[] var15, double var16, double var18) {
      int var20 = var13 + var14;
      By.b(3553, 10242, 10497);
      By.b(3553, 10243, 10497);
      By.f();
      By.q();
      By.k();
      By.a(true);
      By.a(BU.SRC_ALPHA, BL.ONE, BU.ONE, BL.ZERO);
      Bh var21 = var0.a();
      double var22 = var11 + var7;
      double var24 = var14 < 0 ? var22 : -var22;
      double var26 = adh.b(var24 * 0.2D - (double)adh.b(var24 * 0.1D));
      float var28 = var15[0];
      float var29 = var15[1];
      float var30 = var15[2];
      double var31 = var22 * 0.025D * -1.5D;
      double var33 = 0.5D + Math.cos(var31 + 2.356194490192345D) * var16;
      double var35 = 0.5D + Math.sin(var31 + 2.356194490192345D) * var16;
      double var37 = 0.5D + Math.cos(var31 + 0.7853981633974483D) * var16;
      double var39 = 0.5D + Math.sin(var31 + 0.7853981633974483D) * var16;
      double var41 = 0.5D + Math.cos(var31 + 3.9269908169872414D) * var16;
      double var43 = 0.5D + Math.sin(var31 + 3.9269908169872414D) * var16;
      double var45 = 0.5D + Math.cos(var31 + 5.497787143782138D) * var16;
      double var47 = 0.5D + Math.sin(var31 + 5.497787143782138D) * var16;
      double var49 = -1.0D + var26;
      double var51 = (double)var14 * var9 * (0.5D / var16) + var49;
      var21.a(7, In.i);
      var21.a(var1 + var33, var3 + (double)var20, var5 + var35).a(1.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var33, var3 + (double)var13, var5 + var35).a(1.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var37, var3 + (double)var13, var5 + var39).a(0.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var37, var3 + (double)var20, var5 + var39).a(0.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var45, var3 + (double)var20, var5 + var47).a(1.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var45, var3 + (double)var13, var5 + var47).a(1.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var41, var3 + (double)var13, var5 + var43).a(0.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var41, var3 + (double)var20, var5 + var43).a(0.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var37, var3 + (double)var20, var5 + var39).a(1.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var37, var3 + (double)var13, var5 + var39).a(1.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var45, var3 + (double)var13, var5 + var47).a(0.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var45, var3 + (double)var20, var5 + var47).a(0.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var41, var3 + (double)var20, var5 + var43).a(1.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var41, var3 + (double)var13, var5 + var43).a(1.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var33, var3 + (double)var13, var5 + var35).a(0.0D, var49).a(var28, var29, var30, 1.0F).endVertex();
      var21.a(var1 + var33, var3 + (double)var20, var5 + var35).a(0.0D, var51).a(var28, var29, var30, 1.0F).endVertex();
      var0.draw();
      By.l();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      By.a(false);
      if (afT.ad()) {
         By.a(akC.j());
      }

      var31 = 0.5D - var18;
      var33 = 0.5D - var18;
      var35 = 0.5D + var18;
      var37 = 0.5D - var18;
      var39 = 0.5D - var18;
      var41 = 0.5D + var18;
      var43 = 0.5D + var18;
      var45 = 0.5D + var18;
      double var53 = -1.0D + var26;
      var49 = (double)var14 * var9 + var53;
      var21.a(7, In.i);
      var21.a(var1 + var31, var3 + (double)var20, var5 + var33).a(1.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var31, var3 + (double)var13, var5 + var33).a(1.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var35, var3 + (double)var13, var5 + var37).a(0.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var35, var3 + (double)var20, var5 + var37).a(0.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var43, var3 + (double)var20, var5 + var45).a(1.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var43, var3 + (double)var13, var5 + var45).a(1.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var39, var3 + (double)var13, var5 + var41).a(0.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var39, var3 + (double)var20, var5 + var41).a(0.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var35, var3 + (double)var20, var5 + var37).a(1.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var35, var3 + (double)var13, var5 + var37).a(1.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var43, var3 + (double)var13, var5 + var45).a(0.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var43, var3 + (double)var20, var5 + var45).a(0.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var39, var3 + (double)var20, var5 + var41).a(1.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var39, var3 + (double)var13, var5 + var41).a(1.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var31, var3 + (double)var13, var5 + var33).a(0.0D, var53).a(var28, var29, var30, 0.125F).endVertex();
      var21.a(var1 + var31, var3 + (double)var20, var5 + var33).a(0.0D, var49).a(var28, var29, var30, 0.125F).endVertex();
      var0.draw();
      By.e();
      By.v();
      By.a(true);
   }

   public boolean a(aaI var1) {
      return true;
   }

   static {
      a = a;
   }
}
