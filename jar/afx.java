import java.util.IdentityHashMap;
import java.util.Map;

public final class afX {
   public static CD[] a(HO var0, int var1, afU var2, int var3, CD var4, ajV var5) {
      if (var2.b != null && var1 >= 0 && var1 < var2.b.length) {
         int var6 = var2.b[var1];
         if (var6 >= 0 && var6 <= var2.b.length) {
            return a(var0, var6, var2.b, var4, var5);
         }
      }

      switch(var1) {
      case 1:
         return a(var0, 0, 3, var2.b, var3, var4, var5);
      case 2:
         return a(var0, 3, var2.b, var4, var5);
      case 3:
         return a(var0, 3, 0, var2.b, var3, var4, var5);
      case 4:
         return a(var0, 0, 3, 2, 4, var2.b, var3, var4, var5);
      case 5:
         return a(var0, 3, 0, 4, 2, var2.b, var3, var4, var5);
      case 6:
         return a(var0, 2, 4, 2, 4, var2.b, var3, var4, var5);
      case 7:
         return a(var0, 3, 3, 4, 4, var2.b, var3, var4, var5);
      case 8:
         return a(var0, 4, 1, 4, 4, var2.b, var3, var4, var5);
      case 9:
         return a(var0, 4, 4, 4, 1, var2.b, var3, var4, var5);
      case 10:
         return a(var0, 1, 4, 1, 4, var2.b, var3, var4, var5);
      case 11:
         return a(var0, 1, 1, 4, 4, var2.b, var3, var4, var5);
      case 12:
         return b(var0, 0, 2, var2.b, var3, var4, var5);
      case 13:
         return a(var0, 0, 3, 2, 1, var2.b, var3, var4, var5);
      case 14:
         return b(var0, 3, 1, var2.b, var3, var4, var5);
      case 15:
         return a(var0, 3, 0, 1, 2, var2.b, var3, var4, var5);
      case 16:
         return a(var0, 2, 4, 0, 3, var2.b, var3, var4, var5);
      case 17:
         return a(var0, 4, 2, 3, 0, var2.b, var3, var4, var5);
      case 18:
         return a(var0, 4, 4, 3, 3, var2.b, var3, var4, var5);
      case 19:
         return a(var0, 4, 2, 4, 2, var2.b, var3, var4, var5);
      case 20:
         return a(var0, 1, 4, 4, 4, var2.b, var3, var4, var5);
      case 21:
         return a(var0, 4, 4, 1, 4, var2.b, var3, var4, var5);
      case 22:
         return a(var0, 4, 4, 1, 1, var2.b, var3, var4, var5);
      case 23:
         return a(var0, 4, 1, 4, 1, var2.b, var3, var4, var5);
      case 24:
         return a(var0, 2, var2.b, var4, var5);
      case 25:
         return a(var0, 2, 1, var2.b, var3, var4, var5);
      case 26:
         return a(var0, 1, var2.b, var4, var5);
      case 27:
         return a(var0, 1, 2, var2.b, var3, var4, var5);
      case 28:
         return a(var0, 2, 4, 2, 1, var2.b, var3, var4, var5);
      case 29:
         return a(var0, 3, 3, 1, 4, var2.b, var3, var4, var5);
      case 30:
         return a(var0, 2, 1, 2, 4, var2.b, var3, var4, var5);
      case 31:
         return a(var0, 3, 3, 4, 1, var2.b, var3, var4, var5);
      case 32:
         return a(var0, 1, 1, 1, 4, var2.b, var3, var4, var5);
      case 33:
         return a(var0, 1, 1, 4, 1, var2.b, var3, var4, var5);
      case 34:
         return a(var0, 4, 1, 1, 4, var2.b, var3, var4, var5);
      case 35:
         return a(var0, 1, 4, 4, 1, var2.b, var3, var4, var5);
      case 36:
         return b(var0, 2, 0, var2.b, var3, var4, var5);
      case 37:
         return a(var0, 2, 1, 0, 3, var2.b, var3, var4, var5);
      case 38:
         return b(var0, 1, 3, var2.b, var3, var4, var5);
      case 39:
         return a(var0, 1, 2, 3, 0, var2.b, var3, var4, var5);
      case 40:
         return a(var0, 4, 1, 3, 3, var2.b, var3, var4, var5);
      case 41:
         return a(var0, 1, 2, 4, 2, var2.b, var3, var4, var5);
      case 42:
         return a(var0, 1, 4, 3, 3, var2.b, var3, var4, var5);
      case 43:
         return a(var0, 4, 2, 1, 2, var2.b, var3, var4, var5);
      case 44:
         return a(var0, 1, 4, 1, 1, var2.b, var3, var4, var5);
      case 45:
         return a(var0, 4, 1, 1, 1, var2.b, var3, var4, var5);
      case 46:
         return a(var0, 4, var2.b, var4, var5);
      default:
         return a(var0, 0, var2.b, var4, var5);
      }
   }

   private static CD[] a(HO var0, int var1, int var2, HK[] var3, int var4, CD var5, ajV var6) {
      return a(var0, afZ.LEFT, var1, afZ.RIGHT, var2, var3, var4, var5, var6);
   }

   private static CD[] b(HO var0, int var1, int var2, HK[] var3, int var4, CD var5, ajV var6) {
      return a(var0, afZ.UP, var1, afZ.DOWN, var2, var3, var4, var5, var6);
   }

   private static CD[] a(HO var0, int var1, int var2, int var3, int var4, HK[] var5, int var6, CD var7, ajV var8) {
      if (var1 == var2) {
         return var3 == var4 ? a(var0, afZ.UP, var1, afZ.DOWN, var3, var5, var6, var7, var8) : a(var0, afZ.UP, var1, afZ.DOWN_LEFT, var3, afZ.DOWN_RIGHT, var4, var5, var6, var7, var8);
      } else if (var3 == var4) {
         return a(var0, afZ.UP_LEFT, var1, afZ.UP_RIGHT, var2, afZ.DOWN, var3, var5, var6, var7, var8);
      } else if (var1 == var3) {
         return var2 == var4 ? a(var0, afZ.LEFT, var1, afZ.RIGHT, var2, var5, var6, var7, var8) : a(var0, afZ.LEFT, var1, afZ.UP_RIGHT, var2, afZ.DOWN_RIGHT, var4, var5, var6, var7, var8);
      } else {
         return var2 == var4 ? a(var0, afZ.UP_LEFT, var1, afZ.DOWN_LEFT, var3, afZ.RIGHT, var2, var5, var6, var7, var8) : a(var0, afZ.UP_LEFT, var1, afZ.UP_RIGHT, var2, afZ.DOWN_LEFT, var3, afZ.DOWN_RIGHT, var4, var5, var6, var7, var8);
      }
   }

   private static CD[] a(HO var0, int var1, HK[] var2, CD var3, ajV var4) {
      HK var5 = var2[var1];
      return afV.a(var0, var5, var3, var4);
   }

   private static CD[] a(HO var0, afZ var1, int var2, afZ var3, int var4, HK[] var5, int var6, CD var7, ajV var8) {
      CD var9 = a(var0, var5[var2], var1, var6, var7, var8);
      CD var10 = a(var0, var5[var4], var3, var6, var7, var8);
      return var8.a(var9, var10);
   }

   private static CD[] a(HO var0, afZ var1, int var2, afZ var3, int var4, afZ var5, int var6, HK[] var7, int var8, CD var9, ajV var10) {
      CD var11 = a(var0, var7[var2], var1, var8, var9, var10);
      CD var12 = a(var0, var7[var4], var3, var8, var9, var10);
      CD var13 = a(var0, var7[var6], var5, var8, var9, var10);
      return var10.a(var11, var12, var13);
   }

   private static CD[] a(HO var0, afZ var1, int var2, afZ var3, int var4, afZ var5, int var6, afZ var7, int var8, HK[] var9, int var10, CD var11, ajV var12) {
      CD var13 = a(var0, var9[var2], var1, var10, var11, var12);
      CD var14 = a(var0, var9[var4], var3, var10, var11, var12);
      CD var15 = a(var0, var9[var6], var5, var10, var11, var12);
      CD var16 = a(var0, var9[var8], var7, var10, var11, var12);
      return var12.a(var13, var14, var15, var16);
   }

   private static CD a(HO var0, HK var1, afZ var2, int var3, CD var4, ajV var5) {
      // $FF: Couldn't be decompiled
   }

   private static CD a(HO var0, HK var1, afZ var2, int var3, int var4, int var5, int var6, int var7, CD var8, ajV var9) {
      Map[][] var10 = afV.a();
      if (var10 == null) {
         return var8;
      } else {
         int var11 = var1.getIndexInMap();
         if (var11 >= 0 && var11 < var10.length) {
            Map[] var12 = var10[var11];
            if (var12 == null) {
               var12 = new Map[afZ.VALUES.length];
               var10[var11] = var12;
            }

            Object var13 = var12[var2.ordinal()];
            if (var13 == null) {
               var13 = new IdentityHashMap(1);
               var12[var2.ordinal()] = (Map)var13;
            }

            CD var14 = (CD)((Map)var13).get(var8);
            if (var14 == null) {
               var14 = a(var0, var8, var1, var7, var3, var4, var5, var6);
               ((Map)var13).put(var8, var14);
            }

            return var14;
         } else {
            return var8;
         }
      }
   }

   private static CD a(HO var0, CD var1, HK var2, int var3, int var4, int var5, int var6, int var7) {
      int[] var8 = (int[])((int[])var1.getVertexData().clone());
      HK var9 = var1.a();

      for(int var10 = 0; var10 < 4; ++var10) {
         a(var8, var10, var9, var2, var3, var4, var5, var6, var7);
      }

      CD var11 = new CD(var0, var8, var1.getTintIndex(), var1.a(), var2);
      return var11;
   }

   private static void a(int[] var0, int var1, HK var2, HK var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var0.length / 4;
      int var10 = var9 * var1;
      float var11 = Float.intBitsToFloat(var0[var10 + 4]);
      float var12 = Float.intBitsToFloat(var0[var10 + 4 + 1]);
      double var13 = var2.getSpriteU16(var11);
      double var15 = var2.getSpriteV16(var12);
      float var17 = Float.intBitsToFloat(var0[var10]);
      float var18 = Float.intBitsToFloat(var0[var10 + 1]);
      float var19 = Float.intBitsToFloat(var0[var10 + 2]);
      float var20;
      float var21;
      switch(var4) {
      case 0:
         var20 = var17;
         var21 = 1.0F - var19;
         break;
      case 1:
         var20 = var17;
         var21 = var19;
         break;
      case 2:
         var20 = 1.0F - var17;
         var21 = 1.0F - var18;
         break;
      case 3:
         var20 = var17;
         var21 = 1.0F - var18;
         break;
      case 4:
         var20 = var19;
         var21 = 1.0F - var18;
         break;
      case 5:
         var20 = 1.0F - var19;
         var21 = 1.0F - var18;
         break;
      default:
         return;
      }

      float var22 = 15.968F;
      float var23 = 15.968F;
      if (var13 < (double)var5) {
         var20 = (float)((double)var20 + ((double)var5 - var13) / (double)var22);
         var13 = (double)var5;
      }

      if (var13 > (double)var7) {
         var20 = (float)((double)var20 - (var13 - (double)var7) / (double)var22);
         var13 = (double)var7;
      }

      if (var15 < (double)var6) {
         var21 = (float)((double)var21 + ((double)var6 - var15) / (double)var23);
         var15 = (double)var6;
      }

      if (var15 > (double)var8) {
         var21 = (float)((double)var21 - (var15 - (double)var8) / (double)var23);
         var15 = (double)var8;
      }

      switch(var4) {
      case 0:
         var17 = var20;
         var19 = 1.0F - var21;
         break;
      case 1:
         var17 = var20;
         var19 = var21;
         break;
      case 2:
         var17 = 1.0F - var20;
         var18 = 1.0F - var21;
         break;
      case 3:
         var17 = var20;
         var18 = 1.0F - var21;
         break;
      case 4:
         var19 = var20;
         var18 = 1.0F - var21;
         break;
      case 5:
         var19 = 1.0F - var20;
         var18 = 1.0F - var21;
         break;
      default:
         return;
      }

      var0[var10 + 4] = Float.floatToRawIntBits(var3.getInterpolatedU(var13));
      var0[var10 + 4 + 1] = Float.floatToRawIntBits(var3.getInterpolatedV(var15));
      var0[var10] = Float.floatToRawIntBits(var17);
      var0[var10 + 1] = Float.floatToRawIntBits(var18);
      var0[var10 + 2] = Float.floatToRawIntBits(var19);
   }
}
