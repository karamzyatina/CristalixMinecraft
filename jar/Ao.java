import java.util.BitSet;
import java.util.List;

public final class AO {
   private final Ey a;
   private static float a = 0.2F;
   private static boolean a = false;
   private static final abu[] a;
   private final Cw a;
   private final HO a;
   private final AU a;

   public AO(Ey var1, Cw var2, HO var3, AU var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
   }

   public boolean a(adm var1, aec var2, CV var3, sD var4, acV var5, Bh var6, boolean var7) {
      return this.a(var1, var2, var3, var4, var5, var6, var7, adh.a((adn)var5));
   }

   public boolean a(adm var1, aec var2, CV var3, sD var4, acV var5, Bh var6, boolean var7, long var8) {
      boolean var10 = sE.c() && var4.getLightValue() == 0 && var3.isAmbientOcclusion();

      try {
         if (afT.ad()) {
            akv.a(var4, var6);
         }

         if (!afT.ah()) {
            var8 = 0L;
         }

         ajV var11 = var6.a(var4, var5);
         var3 = ajz.a(var3, var4, var11);
         boolean var15 = var10 ? this.c(var1, var2, var3, var4, var5, var6, var7, var8) : this.b(var1, var2, var3, var4, var5, var6, var7, var8);
         if (var15) {
            this.a(var1, var2, var4, var5, var6, var7, var8, var11, var10);
         }

         if (afT.ad()) {
            akv.b(var6);
         }

         return var15;
      } catch (Throwable var14) {
         Kn var12 = Kn.a(var14, "Tesselating block model");
         Ku var13 = var12.a("Block model being tesselated");
         Ku.a(var13, var5, var4);
         var13.a((String)"Using AO", (Object)var10);
         throw new acB(var12);
      }
   }

   private boolean c(adm var1, aec var2, CV var3, sD var4, acV var5, Bh var6, boolean var7, long var8) {
      boolean var10 = false;
      ajV var11 = var6.a(var4, var5);
      abu var12 = var6.a();
      HO var13 = this.a;
      AU var14 = this.a;
      abP[] var15 = abP.VALUES;
      int var16 = var15.length;

      for(int var17 = 0; var17 < var16; ++var17) {
         abP var18 = var15[var17];
         if (!var7 || var4.a(var2, var5, var18)) {
            List var19 = var3.b(var4, var18, var8);
            if (!var19.isEmpty()) {
               var19 = ajz.a(var14, var13, var19, var2, var4, var5, var18, var12, var8, var11);
               this.a(var1, var2, var4, var5, var6, var19, var11);
               var10 = true;
            }

            La.a((Object)var19);
         }
      }

      List var21 = var3.b(var4, (abP)null, var8);
      if (!var21.isEmpty()) {
         var21 = ajz.a(var14, var13, var21, var2, var4, var5, (abP)null, var12, var8, var11);
         this.a(var1, var2, var4, var5, var6, var21, var11);
         var10 = true;
      }

      La.a((Object)var21);
      return var10;
   }

   public boolean b(adm var1, aec var2, CV var3, sD var4, acV var5, Bh var6, boolean var7, long var8) {
      boolean var10 = false;
      ajV var11 = var6.a(var4, var5);
      abu var12 = var6.a();
      HO var13 = this.a;
      AU var14 = this.a;
      abP[] var15 = abP.VALUES;
      int var16 = var15.length;

      for(int var17 = 0; var17 < var16; ++var17) {
         abP var18 = var15[var17];
         if (!var7 || var4.a(var2, var5, var18)) {
            List var19 = var3.b(var4, var18, var8);
            if (!var19.isEmpty()) {
               int var21 = var4.a(var2, var5.a(var18));
               var19 = ajz.a(var14, var13, var19, var2, var4, var5, var18, var12, var8, var11);
               this.a(var1, var2, var4, var5, var21, false, var6, var19, var11);
               var10 = true;
            }

            La.a((Object)var19);
         }
      }

      List var22 = var3.b(var4, (abP)null, var8);
      if (!var22.isEmpty()) {
         var22 = ajz.a(var14, var13, var22, var2, var4, var5, (abP)null, var12, var8, var11);
         this.a(var1, var2, var4, var5, -1, true, var6, var22, var11);
         var10 = true;
      }

      La.a((Object)var22);
      return var10;
   }

   private void a(adm var1, aec var2, sD var3, acV var4, Bh var5, List<CD> var6, ajV var7) {
      float[] var8 = var7.a();
      BitSet var9 = var7.a();
      AQ var10 = var7.a();
      var3.a(var2, var4, var1);
      double var11 = (double)var4.a + var1.a;
      double var13 = (double)var4.b + var1.b;
      double var15 = (double)var4.c + var1.c;
      int var17 = 0;

      for(int var18 = var6.size(); var17 < var18; ++var17) {
         CD var19 = (CD)var6.get(var17);
         this.a(var3, var19.getVertexData(), var19.a(), var8, var9);
         var10.a(var2, var3, var4, var19.a(), var8, var9);
         if (var19.a().e) {
            var10.a();
         }

         if (var5.a()) {
            var5.addVertexData(var19.getVertexDataSingle());
         } else {
            var5.addVertexData(var19.getVertexData());
         }

         var5.a(var19.a());
         var5.putBrightness4(AQ.a(var10)[0], AQ.a(var10)[1], AQ.a(var10)[2], AQ.a(var10)[3]);
         float[] var20 = AQ.a(var10);
         if (var19.shouldApplyDiffuseLighting()) {
            float var21 = CO.a(var19.a());
            var20[0] *= var21;
            var20[1] *= var21;
            var20[2] *= var21;
            var20[3] *= var21;
         }

         int var30 = agd.a(this.a, var19, var3, var2, var4, var7);
         float var22 = var20[0];
         float var23 = var20[1];
         float var24 = var20[2];
         float var25 = var20[3];
         if (!var19.hasTintIndex() && var30 == -1) {
            if (a) {
               var5.a(1.0F, 1.0F, 1.0F, var22, 4);
               var5.a(1.0F, 1.0F, 1.0F, var23, 3);
               var5.a(1.0F, 1.0F, 1.0F, var24, 2);
               var5.a(1.0F, 1.0F, 1.0F, var25, 1);
            } else {
               var5.putColorMultiplier(var22, var22, var22, 4);
               var5.putColorMultiplier(var23, var23, var23, 3);
               var5.putColorMultiplier(var24, var24, var24, 2);
               var5.putColorMultiplier(var25, var25, var25, 1);
            }
         } else {
            int var26 = var30;
            if (var30 == -1) {
               var26 = this.a.a(var3, var2, var4, var19.getTintIndex());
            }

            float var27 = (float)(var26 >> 16 & 255) / 255.0F;
            float var28 = (float)(var26 >> 8 & 255) / 255.0F;
            float var29 = (float)(var26 & 255) / 255.0F;
            if (a) {
               var5.a(var27, var28, var29, var22, 4);
               var5.a(var27, var28, var29, var23, 3);
               var5.a(var27, var28, var29, var24, 2);
               var5.a(var27, var28, var29, var25, 1);
            } else {
               var5.putColorMultiplier(var22 * var27, var22 * var28, var22 * var29, 4);
               var5.putColorMultiplier(var23 * var27, var23 * var28, var23 * var29, 3);
               var5.putColorMultiplier(var24 * var27, var24 * var28, var24 * var29, 2);
               var5.putColorMultiplier(var25 * var27, var25 * var28, var25 * var29, 1);
            }
         }

         var5.putPosition(var11, var13, var15);
      }

   }

   private void a(sD var1, int[] var2, abP var3, float[] var4, BitSet var5) {
      float var6 = 32.0F;
      float var7 = 32.0F;
      float var8 = 32.0F;
      float var9 = -32.0F;
      float var10 = -32.0F;
      float var11 = -32.0F;
      int var12 = var2.length / 4;

      for(int var13 = 0; var13 < 4; ++var13) {
         float var14 = Float.intBitsToFloat(var2[var13 * var12]);
         float var15 = Float.intBitsToFloat(var2[var13 * var12 + 1]);
         float var16 = Float.intBitsToFloat(var2[var13 * var12 + 2]);
         var6 = Math.min(var6, var14);
         var7 = Math.min(var7, var15);
         var8 = Math.min(var8, var16);
         var9 = Math.max(var9, var14);
         var10 = Math.max(var10, var15);
         var11 = Math.max(var11, var16);
      }

      if (var4 != null) {
         this.a(var4, var6, var7, var8, var9, var10, var11);
      }

      this.a(var3, var5, var1, var6, var7, var8, var9, var10, var11);
   }

   private void a(float[] var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1[abP.WEST.getIndex()] = var2;
      var1[abP.EAST.getIndex()] = var5;
      var1[abP.DOWN.getIndex()] = var3;
      var1[abP.UP.getIndex()] = var6;
      var1[abP.NORTH.getIndex()] = var4;
      var1[abP.SOUTH.getIndex()] = var7;
      int var8 = abP.VALUES.length;
      var1[abP.WEST.getIndex() + var8] = 1.0F - var2;
      var1[abP.EAST.getIndex() + var8] = 1.0F - var5;
      var1[abP.DOWN.getIndex() + var8] = 1.0F - var3;
      var1[abP.UP.getIndex() + var8] = 1.0F - var6;
      var1[abP.NORTH.getIndex() + var8] = 1.0F - var4;
      var1[abP.SOUTH.getIndex() + var8] = 1.0F - var7;
   }

   private void a(abP var1, BitSet var2, sD var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      // $FF: Couldn't be decompiled
   }

   private void a(adm var1, aec var2, sD var3, acV var4, int var5, boolean var6, Bh var7, List<CD> var8, ajV var9) {
      BitSet var10 = var9.a();
      var3.a(var2, var4, var1);
      double var11 = (double)var4.a + var1.a;
      double var13 = (double)var4.b + var1.b;
      double var15 = (double)var4.c + var1.c;
      int var17 = 0;

      for(int var18 = var8.size(); var17 < var18; ++var17) {
         var5 = this.a(var2, var3, var4, var5, var6, var7, var9, var10, var11, var13, var15, (CD)var8.get(var17));
      }

   }

   private int a(aec var1, sD var2, acV var3, int var4, boolean var5, Bh var6, ajV var7, BitSet var8, double var9, double var11, double var13, CD var15) {
      if (var5) {
         this.a(var2, var15.getVertexData(), var15.a(), (float[])null, var8);
         acV var16 = var8.get(0) ? var3.a(var15.a()) : var3;
         var4 = var2.a(var1, var16);
      }

      HK var17 = var15.a();
      if (var17.e) {
         var4 |= 240;
      }

      if (var6.a()) {
         var6.addVertexData(var15.getVertexDataSingle());
      } else {
         var6.addVertexData(var15.getVertexData());
      }

      var6.a(var17);
      var6.putBrightness4(var4, var4, var4, var4);
      this.a(var1, var2, var3, var6, var7, var15);
      var6.putPosition(var9, var11, var13);
      return var4;
   }

   private void a(aec var1, sD var2, acV var3, Bh var4, ajV var5, CD var6) {
      int var7 = agd.a(this.a, var6, var2, var1, var3, var5);
      if (!var6.hasTintIndex() && var7 == -1) {
         if (var6.shouldApplyDiffuseLighting()) {
            float var13 = CO.a(var6.a());
            var4.putColorMultiplier(var13, var13, var13, 4);
            var4.putColorMultiplier(var13, var13, var13, 3);
            var4.putColorMultiplier(var13, var13, var13, 2);
            var4.putColorMultiplier(var13, var13, var13, 1);
         }
      } else {
         int var8 = var7;
         if (var7 == -1) {
            var8 = this.a.a(var2, var1, var3, var6.getTintIndex());
         }

         float var9 = (float)(var8 >> 16 & 255) / 255.0F;
         float var10 = (float)(var8 >> 8 & 255) / 255.0F;
         float var11 = (float)(var8 & 255) / 255.0F;
         if (var6.shouldApplyDiffuseLighting()) {
            float var12 = CO.a(var6.a());
            var9 *= var12;
            var10 *= var12;
            var11 *= var12;
         }

         var4.putColorMultiplier(var9, var10, var11, 4);
         var4.putColorMultiplier(var9, var10, var11, 3);
         var4.putColorMultiplier(var9, var10, var11, 2);
         var4.putColorMultiplier(var9, var10, var11, 1);
      }

   }

   public void a(CV var1, float var2, float var3, float var4, float var5) {
      this.a((sD)null, var1, var2, var3, var4, var5);
   }

   public void a(sD var1, CV var2, float var3, float var4, float var5, float var6) {
      abP[] var7 = abP.VALUES;
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         abP var10 = var7[var9];
         this.a(var3, var4, var5, var6, var2.b(var1, var10, 0L));
      }

      this.a(var3, var4, var5, var6, var2.b(var1, (abP)null, 0L));
   }

   public void a(CV var1, sD var2, float var3, boolean var4) {
      By.b(90.0F, 0.0F, 1.0F, 0.0F);
      int var5 = this.a.a(var2, (aec)null, (acV)null, 0);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if (!var4) {
         By.c(var3, var3, var3, 1.0F);
      }

      this.a(var2, var1, var3, var6, var7, var8);
   }

   private void a(float var1, float var2, float var3, float var4, List<CD> var5) {
      Cw var6 = this.a;
      Bh var7 = var6.a();
      int var8 = 0;

      for(int var9 = var5.size(); var8 < var9; ++var8) {
         CD var10 = (CD)var5.get(var8);
         var7.a(7, In.b);
         var7.addVertexData(var10.getVertexData());
         var7.a(var10.a());
         if (var10.hasTintIndex()) {
            var7.putColorRGB_F4(var2 * var1, var3 * var1, var4 * var1);
         } else {
            var7.putColorRGB_F4(var1, var1, var1);
         }

         adn var11 = var10.a().a();
         var7.putNormal((float)var11.a, (float)var11.b, (float)var11.c);
         var6.draw();
      }

      La.a((Object)var5);
   }

   public static float a(float var0) {
      return var0 == 0.2F ? a : var0;
   }

   public static void a() {
      a = 1.0F - afT.b() * 0.8F;
      a = afT.ad() && akC.k();
   }

   private void a(adm var1, aec var2, sD var3, acV var4, Bh var5, boolean var6, long var7, ajV var9, boolean var10) {
      if (var9.c()) {
         abu[] var11 = a;

         for(int var12 = 0; var12 < var11.length; ++var12) {
            abu var13 = var11[var12];
            ajB var14 = var9.a(var13);
            List var15 = var14.a();
            int var16 = var15.size();
            if (var16 > 0) {
               Cj var17 = var9.a();
               if (var17 != null) {
                  Bh var18 = var17.a(var13);
                  if (!var18.b()) {
                     var18.a(7, In.a);
                     var18.setTranslation(var5.a(), var5.b(), var5.c());
                  }

                  for(int var19 = 0; var19 < var16; ++var19) {
                     CD var20 = (CD)var15.get(var19);
                     List var21 = var14.a(var20);
                     sD var22 = var14.a(var19);
                     CD var23 = var20.a();
                     if (var23 != null) {
                        var14.a(var23, var22);
                     }

                     var9.a(var22, var4);
                     if (var10) {
                        this.a(var1, var2, var22, var4, var18, var21, var9);
                     } else {
                        int var24 = var22.a(var2, var4.a(var20.a()));
                        this.a(var1, var2, var22, var4, var24, false, var18, var21, var9);
                     }
                  }
               }

               var14.a();
            }
         }
      }

      if (afT.Q() && !var9.a() && afN.a(var2, var3, var4)) {
         CV var25 = afN.a();
         sD var26 = afN.a();
         this.a(var1, var2, var25, var26, var4, var5, var6, var7);
      }

   }

   static {
      a = new abu[]{abu.CUTOUT, abu.CUTOUT_MIPPED, abu.TRANSLUCENT};
   }
}
