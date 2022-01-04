import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public final class afV {
   private static Map[] a = null;
   private static Map[] b = null;
   private static Map[][] a = (Map[][])null;
   private static afU[][] a = (afU[][])null;
   private static afU[][] b = (afU[][])null;
   private static boolean a = false;
   public static final sD a;
   private static HK b;
   private static final afO[] a;
   private static final afO[] b;
   private static final afO[] c;
   private static final afO[] d;
   private static final afO[] e;
   private static final afO[] f;
   private static final afO[] g;
   private static final afO[] h;
   private static final afO[] i;
   private static final afO[] j;
   private static final afO[] k;
   private static final afO[] l;
   private static final afO[] m;
   private static final afO[] n;
   private static final afO[] o;
   private static final afO[] p;
   public static final HK a;

   public static CD[] a(AU var0, HO var1, aec var2, sD var3, acV var4, CD var5, ajV var6) {
      HK var7 = var5.a();
      if (var7 == null) {
         return var6.a(var5);
      } else if (a(var2, var3, var4, var5, var6)) {
         var5 = a(var1, b, var5);
         return var6.a(var5);
      } else {
         abP var8 = var5.a();
         return a(var0, var1, var2, var3, var4, var8, var5, var6);
      }
   }

   private static boolean a(aec var0, sD var1, acV var2, CD var3, ajV var4) {
      nh var5 = var1.a();
      if (var5 instanceof pH) {
         abP var6 = var3.a();
         if (var6 != abP.UP && var6 != abP.DOWN) {
            return false;
         } else if (!var3.a()) {
            return false;
         } else {
            acV var7 = var2.a(var3.a());
            sD var8 = var0.a(var7);
            if (var8.a() != var5) {
               return false;
            } else if (var5 == RQ.a && var8.a((so)rm.a) != var1.a((so)rm.a)) {
               return false;
            } else {
               var8 = var8.a(var0, var7);
               double var9 = (double)var3.a();
               if (var9 < 0.4D) {
                  return (Boolean)var8.a((so)pH.d);
               } else if (var9 > 0.6D) {
                  return (Boolean)var8.a((so)pH.b);
               } else {
                  double var11 = var3.a();
                  if (var11 < 0.4D) {
                     return (Boolean)var8.a((so)pH.a);
                  } else {
                     return var11 <= 0.6D || (Boolean)var8.a((so)pH.c);
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   protected static CD[] a(HO var0, HK var1, CD var2, ajV var3) {
      if (var1 == null) {
         return null;
      } else if (var1 == a) {
         return var3.a(var2);
      } else {
         CD var4 = a(var0, var1, var2);
         return var3.a(var4);
      }
   }

   private static synchronized CD a(HO var0, HK var1, CD var2) {
      if (a == null) {
         return var2;
      } else {
         int var3 = var1.getIndexInMap();
         if (var3 >= 0 && var3 < a.length) {
            Object var4 = a[var3];
            if (var4 == null) {
               var4 = new IdentityHashMap(1);
               a[var3] = (Map)var4;
            }

            CD var5 = (CD)((Map)var4).get(var2);
            if (var5 == null) {
               var5 = a(var0, var2, var1);
               ((Map)var4).put(var2, var5);
            }

            return var5;
         } else {
            return var2;
         }
      }
   }

   private static synchronized CD a(HO var0, HK var1, CD var2, int var3) {
      if (b == null) {
         return null;
      } else if (var1 == null) {
         return null;
      } else {
         int var4 = var1.getIndexInMap();
         if (var4 >= 0 && var4 < b.length) {
            Object var5 = b[var4];
            if (var5 == null) {
               var5 = new EnumMap(abP.class);
               b[var4] = (Map)var5;
            }

            abP var6 = var2.a();
            CD var7 = (CD)((Map)var5).get(var6);
            if (var7 == null) {
               var7 = ajA.a(var0, var6, var1, var3);
               ((Map)var5).put(var6, var7);
            }

            return var7;
         } else {
            return null;
         }
      }
   }

   private static CD a(HO var0, CD var1, HK var2) {
      int[] var3 = (int[])var1.getVertexData().clone();
      HK var4 = var1.a();

      for(int var5 = 0; var5 < 4; ++var5) {
         a(var3, var5, var4, var2);
      }

      return new CD(var0, var3, var1.getTintIndex(), var1.a(), var2);
   }

   private static void a(int[] var0, int var1, HK var2, HK var3) {
      int var4 = var0.length / 4;
      int var5 = var4 * var1;
      float var6 = Float.intBitsToFloat(var0[var5 + 4]);
      float var7 = Float.intBitsToFloat(var0[var5 + 4 + 1]);
      double var8 = var2.getSpriteU16(var6);
      double var10 = var2.getSpriteV16(var7);
      var0[var5 + 4] = Float.floatToRawIntBits(var3.getInterpolatedU(var8));
      var0[var5 + 4 + 1] = Float.floatToRawIntBits(var3.getInterpolatedV(var10));
   }

   private static CD[] a(AU var0, HO var1, aec var2, sD var3, acV var4, abP var5, CD var6, ajV var7) {
      CD[] var8 = a(var0, var1, var2, var3, var4, var5, var6, true, 0, var7);
      if (!a) {
         return var8;
      } else if (var8.length == 1 && var8[0] == var6) {
         return var8;
      } else {
         List var9 = var7.a(var8);

         int var10;
         for(var10 = 0; var10 < var9.size(); ++var10) {
            CD var11 = (CD)var9.get(var10);

            for(int var12 = 0; var12 < 3; ++var12) {
               CD[] var13 = a(var0, var1, var2, var3, var4, var5, var11, false, var12 + 1, var7);
               if (var13.length != 1 || var13[0] == var11) {
                  break;
               }

               var11 = var13[0];
            }

            var9.set(var10, var11);
         }

         for(var10 = 0; var10 < var8.length; ++var10) {
            var8[var10] = (CD)var9.get(var10);
         }

         return var8;
      }
   }

   public static CD[] a(AU var0, HO var1, aec var2, sD var3, acV var4, abP var5, CD var6, boolean var7, int var8, ajV var9) {
      if (!(var3 instanceof sw)) {
         return var9.a(var6);
      } else {
         sw var10 = (sw)var3;
         HK var11 = var6.a();
         int var12;
         afU[] var13;
         int var14;
         int var15;
         afU var16;
         CD[] var17;
         if (b != null) {
            var12 = var11.getIndexInMap();
            if (var12 >= 0 && var12 < b.length) {
               var13 = b[var12];
               if (var13 != null) {
                  var14 = a(var5);

                  for(var15 = 0; var15 < var13.length; ++var15) {
                     var16 = var13[var15];
                     if (var16 != null && var16.a(var10.a())) {
                        var17 = a(var0, var1, var16, var2, var10, var4, var14, var6, var8, var9);
                        if (var17 != null) {
                           return var17;
                        }
                     }
                  }
               }
            }
         }

         if (a != null && var7) {
            var12 = var9.a();
            if (var12 >= 0 && var12 < a.length) {
               var13 = a[var12];
               if (var13 != null) {
                  var14 = a(var5);

                  for(var15 = 0; var15 < var13.length; ++var15) {
                     var16 = var13[var15];
                     if (var16 != null && var16.a(var11)) {
                        var17 = a(var0, var1, var16, var2, var10, var4, var14, var6, var8, var9);
                        if (var17 != null) {
                           return var17;
                        }
                     }
                  }
               }
            }
         }

         return var9.a(var6);
      }
   }

   public static int a(abP var0) {
      // $FF: Couldn't be decompiled
   }

   private static abP a(int var0) {
      switch(var0) {
      case 0:
         return abP.DOWN;
      case 1:
         return abP.UP;
      case 2:
         return abP.NORTH;
      case 3:
         return abP.SOUTH;
      case 4:
         return abP.WEST;
      case 5:
         return abP.EAST;
      default:
         return abP.UP;
      }
   }

   private static CD[] a(AU var0, HO var1, afU var2, aec var3, sw var4, acV var5, int var6, CD var7, int var8, ajV var9) {
      int var10 = 0;
      int var11 = var4.b();
      int var12 = var11;
      nh var13 = var4.a();
      if (var13 instanceof qI) {
         var10 = b(var6, var11);
         if (var2.a() <= 3) {
            var12 = var11 & 3;
         }
      }

      if (var13 instanceof qe) {
         var10 = c(var6, var11);
         if (var2.a() <= 2 && var12 > 2) {
            var12 = 2;
         }
      }

      if (!var2.a(var4.a(), var12)) {
         return null;
      } else {
         int var14;
         if (var6 >= 0 && var2.c != 63) {
            var14 = var6;
            if (var10 != 0) {
               var14 = a(var6, var10);
            }

            if ((1 << var14 & var2.c) == 0) {
               return null;
            }
         }

         var14 = var5.b;
         if (var2.a != null && !var2.a.a(var14)) {
            return null;
         } else {
            if (var2.a != null) {
               aeu var15 = var3.a(var5);
               if (!var2.a(var15)) {
                  return null;
               }
            }

            if (var2.a != null) {
               String var16 = amm.a(var3, var5);
               if (!var2.a.a(var16)) {
                  return null;
               }
            }

            HK var17 = var7.a();
            switch(var2.a) {
            case 1:
               return a(var1, a(var0, var2, var3, var4, var5, var10, var6, var17, var11, var9), var7, var9);
            case 2:
               return a(var1, a(var0, var2, var3, var4, var5, var10, var6, var17, var11), var7, var9);
            case 3:
               return a(var1, e(var0, var2, var3, var4, var5, var10, var6, var17, var11), var7, var9);
            case 4:
               return a(var1, a(var2, var3, var4, var5, var6), var7, var9);
            case 5:
               return a(var1, a(var2, var5, var6), var7, var9);
            case 6:
               return a(var1, b(var0, var2, var3, var4, var5, var10, var6, var17, var11), var7, var9);
            case 7:
               return a(var1, a(var2), var7, var9);
            case 8:
               return a(var1, c(var0, var2, var3, var4, var5, var10, var6, var17, var11), var7, var9);
            case 9:
               return a(var1, d(var0, var2, var3, var4, var5, var10, var6, var17, var11), var7, var9);
            case 10:
               if (var8 == 0) {
                  return a(var1, var0, var2, var3, var4, var5, var10, var6, var7, var11, var9);
               }
            default:
               return null;
            case 11:
               return b(var1, var0, var2, var3, var4, var5, var10, var6, var7, var11, var9);
            case 12:
               return a(var1, var2, var7, var9);
            case 13:
               return a(var1, var2, var3, var4, var5, var6, var7, var9);
            case 14:
               return a(var1, var2, var5, var6, var7, var9);
            case 15:
               return c(var1, var0, var2, var3, var4, var5, var10, var6, var7, var11, var9);
            }
         }
      }
   }

   private static int a(int var0, int var1) {
      switch(var1) {
      case 0:
         return var0;
      case 1:
         switch(var0) {
         case 0:
            return 2;
         case 1:
            return 3;
         case 2:
            return 1;
         case 3:
            return 0;
         default:
            return var0;
         }
      case 2:
         switch(var0) {
         case 0:
            return 4;
         case 1:
            return 5;
         case 2:
         case 3:
         default:
            return var0;
         case 4:
            return 1;
         case 5:
            return 0;
         }
      default:
         return var0;
      }
   }

   private static int b(int var0, int var1) {
      int var2 = (var1 & 12) >> 2;
      switch(var2) {
      case 1:
         return 2;
      case 2:
         return 1;
      default:
         return 0;
      }
   }

   private static int c(int var0, int var1) {
      switch(var1) {
      case 3:
         return 2;
      case 4:
         return 1;
      default:
         return 0;
      }
   }

   private static HK a(afU var0, aec var1, sw var2, acV var3, int var4) {
      if (var0.b.length == 1) {
         return var0.b[0];
      } else {
         int var5 = var4 / var0.h * var0.h;
         if (var0.b) {
            acV var6 = var3.b();

            for(sD var7 = var1.a(var6); var7.a() == var2.a(); var7 = var1.a(var6)) {
               var3 = var6;
               var6 = var6.b();
               if (var6.b < 0) {
                  break;
               }
            }
         }

         int var11 = afT.a(var3, var5) & Integer.MAX_VALUE;

         int var12;
         for(var12 = 0; var12 < var0.g; ++var12) {
            var11 = afT.a(var11);
         }

         var12 = 0;
         if (var0.c == null) {
            var12 = var11 % var0.b.length;
         } else {
            int var8 = var11 % var0.i;
            int[] var9 = var0.d;

            for(int var10 = 0; var10 < var9.length; ++var10) {
               if (var8 < var9[var10]) {
                  var12 = var10;
                  break;
               }
            }
         }

         return var0.b[var12];
      }
   }

   private static HK a(afU var0) {
      return var0.b[0];
   }

   private static HK a(afU var0, acV var1, int var2) {
      if (var0.b.length == 1) {
         return var0.b[0];
      } else {
         int var3 = var1.a;
         int var4 = var1.b;
         int var5 = var1.c;
         int var6 = 0;
         int var7 = 0;
         switch(var2) {
         case 0:
            var6 = var3;
            var7 = -var5 - 1;
            break;
         case 1:
            var6 = var3;
            var7 = var5;
            break;
         case 2:
            var6 = -var3 - 1;
            var7 = -var4;
            break;
         case 3:
            var6 = var3;
            var7 = -var4;
            break;
         case 4:
            var6 = var5;
            var7 = -var4;
            break;
         case 5:
            var6 = -var5 - 1;
            var7 = -var4;
         }

         var6 %= var0.e;
         var7 %= var0.f;
         if (var6 < 0) {
            var6 += var0.e;
         }

         if (var7 < 0) {
            var7 += var0.f;
         }

         int var8 = var7 * var0.e + var6;
         return var0.b[var8];
      }
   }

   private static HK a(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, int var6, HK var7, int var8, ajV var9) {
      int var10 = a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      return var1.b[var10];
   }

   private static synchronized CD[] a(HO var0, AU var1, afU var2, aec var3, sD var4, acV var5, int var6, int var7, CD var8, int var9, ajV var10) {
      HK var11 = var8.a();
      int var12 = a(var1, var2, var3, var4, var5, var6, var7, var11, var9, var10);
      return afX.a(var0, var12, var2, var7, var8, var10);
   }

   private static CD[] b(HO var0, AU var1, afU var2, aec var3, sD var4, acV var5, int var6, int var7, CD var8, int var9, ajV var10) {
      if (!var8.b()) {
         return null;
      } else {
         HK var11 = var8.a();
         afO[] var12 = a(var7, var6);
         boolean[] var13 = var10.a();

         for(int var14 = 0; var14 < 4; ++var14) {
            var13[var14] = a(var1, var2, var3, var4, var12[var14].a(var5), var7, var11, var9);
         }

         ajB var24 = var10.a(var2.a);

         Object var25;
         try {
            if (var13[0] && var13[1] && var13[2] && var13[3]) {
               var24.a(a(var0, var2.b[8], var8, var2.j), var2.a);
               Object var15 = null;
               return null;
            }

            afO[] var16;
            if (var13[0] && var13[1] && var13[2]) {
               var24.a(a(var0, var2.b[5], var8, var2.j), var2.a);
               var16 = null;
               return var16;
            }

            if (var13[0] && var13[2] && var13[3]) {
               var24.a(a(var0, var2.b[6], var8, var2.j), var2.a);
               var16 = null;
               return var16;
            }

            if (var13[1] && var13[2] && var13[3]) {
               var24.a(a(var0, var2.b[12], var8, var2.j), var2.a);
               var16 = null;
               return var16;
            }

            if (var13[0] && var13[1] && var13[3]) {
               var24.a(a(var0, var2.b[13], var8, var2.j), var2.a);
               var16 = null;
               return var16;
            }

            var16 = b(var7, var6);
            boolean[] var17 = var10.b();

            for(int var18 = 0; var18 < 4; ++var18) {
               var17[var18] = a(var1, var2, var3, var4, var16[var18].a(var5), var7, var11, var9);
            }

            if (var13[1] && var13[2]) {
               var24.a(a(var0, var2.b[3], var8, var2.j), var2.a);
               if (var17[3]) {
                  var24.a(a(var0, var2.b[16], var8, var2.j), var2.a);
               }

               var25 = null;
               return (CD[])var25;
            }

            if (var13[0] && var13[2]) {
               var24.a(a(var0, var2.b[4], var8, var2.j), var2.a);
               if (var17[2]) {
                  var24.a(a(var0, var2.b[14], var8, var2.j), var2.a);
               }

               var25 = null;
               return (CD[])var25;
            }

            if (!var13[1] || !var13[3]) {
               if (var13[0] && var13[3]) {
                  var24.a(a(var0, var2.b[11], var8, var2.j), var2.a);
                  if (var17[0]) {
                     var24.a(a(var0, var2.b[0], var8, var2.j), var2.a);
                  }

                  var25 = null;
                  return (CD[])var25;
               }

               boolean[] var26 = var10.c();

               for(int var19 = 0; var19 < 4; ++var19) {
                  var26[var19] = b(var1, var2, var3, var4, var12[var19].a(var5), var7, var11, var9);
               }

               if (var13[0]) {
                  var24.a(a(var0, var2.b[9], var8, var2.j), var2.a);
               }

               if (var13[1]) {
                  var24.a(a(var0, var2.b[7], var8, var2.j), var2.a);
               }

               if (var13[2]) {
                  var24.a(a(var0, var2.b[1], var8, var2.j), var2.a);
               }

               if (var13[3]) {
                  var24.a(a(var0, var2.b[15], var8, var2.j), var2.a);
               }

               if (var17[0] && (var26[1] || var26[2]) && !var13[1] && !var13[2]) {
                  var24.a(a(var0, var2.b[0], var8, var2.j), var2.a);
               }

               if (var17[1] && (var26[0] || var26[2]) && !var13[0] && !var13[2]) {
                  var24.a(a(var0, var2.b[2], var8, var2.j), var2.a);
               }

               if (var17[2] && (var26[1] || var26[3]) && !var13[1] && !var13[3]) {
                  var24.a(a(var0, var2.b[14], var8, var2.j), var2.a);
               }

               if (var17[3] && (var26[0] || var26[3]) && !var13[0] && !var13[3]) {
                  var24.a(a(var0, var2.b[16], var8, var2.j), var2.a);
               }

               Object var27 = null;
               CD[] var20 = (CD[])((CD[])var27);
               return var20;
            }

            var24.a(a(var0, var2.b[10], var8, var2.j), var2.a);
            if (var17[1]) {
               var24.a(a(var0, var2.b[2], var8, var2.j), var2.a);
            }

            var25 = null;
         } finally {
            if (var24.a() > 0) {
               var10.a(true);
            }

         }

         return (CD[])var25;
      }
   }

   private static CD[] a(HO var0, afU var1, CD var2, ajV var3) {
      if (!var2.b()) {
         return null;
      } else {
         ajB var4 = var3.a(var1.a);

         Object var5;
         try {
            HK var6 = a(var1);
            if (var6 != null) {
               var4.a(a(var0, var6, var2, var1.j), var1.a);
            }

            var5 = null;
         } finally {
            if (var4.a() > 0) {
               var3.a(true);
            }

         }

         return (CD[])((CD[])var5);
      }
   }

   private static CD[] a(HO var0, afU var1, aec var2, sw var3, acV var4, int var5, CD var6, ajV var7) {
      if (!var6.b()) {
         return null;
      } else {
         ajB var8 = var7.a(var1.a);

         Object var9;
         try {
            HK var10 = a(var1, var2, var3, var4, var5);
            if (var10 != null) {
               var8.a(a(var0, var10, var6, var1.j), var1.a);
            }

            var9 = null;
         } finally {
            if (var8.a() > 0) {
               var7.a(true);
            }

         }

         return (CD[])((CD[])var9);
      }
   }

   private static CD[] a(HO var0, afU var1, acV var2, int var3, CD var4, ajV var5) {
      if (!var4.b()) {
         return null;
      } else {
         ajB var6 = var5.a(var1.a);

         Object var7;
         try {
            HK var8 = a(var1, var2, var3);
            if (var8 != null) {
               var6.a(a(var0, var8, var4, var1.j), var1.a);
            }

            var7 = null;
         } finally {
            if (var6.a() > 0) {
               var5.a(true);
            }

         }

         return (CD[])((CD[])var7);
      }
   }

   private static CD[] c(HO var0, AU var1, afU var2, aec var3, sD var4, acV var5, int var6, int var7, CD var8, int var9, ajV var10) {
      if (!var8.b()) {
         return null;
      } else {
         ajB var11 = var10.a(var2.a);

         Object var12;
         try {
            HK var13 = a(var1, var2, var3, var4, var5, var6, var7, var8.a(), var9, var10);
            if (var13 != null) {
               var11.a(a(var0, var13, var8, var2.j), var2.a);
            }

            var12 = null;
         } finally {
            if (var11.a() > 0) {
               var10.a(true);
            }

         }

         return (CD[])((CD[])var12);
      }
   }

   private static afO[] a(int var0, int var1) {
      switch(var0) {
      case 0:
         return a;
      case 1:
         return b;
      case 2:
         if (var1 == 1) {
            return g;
         }

         return c;
      case 3:
         return d;
      case 4:
         return e;
      case 5:
         if (var1 == 2) {
            return h;
         }

         return f;
      default:
         throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static afO[] b(int var0, int var1) {
      switch(var0) {
      case 0:
         return i;
      case 1:
         return j;
      case 2:
         if (var1 == 1) {
            return o;
         }

         return k;
      case 3:
         return l;
      case 4:
         return m;
      case 5:
         if (var1 == 2) {
            return p;
         }

         return n;
      default:
         throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   protected static Map[][] a() {
      return a;
   }

   private static int a(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, int var6, HK var7, int var8, ajV var9) {
      boolean[] var10 = var9.a();
      acV var11;
      switch(var6) {
      case 0:
         var10[0] = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
         var10[1] = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
         var10[2] = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
         var10[3] = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
         if (var1.a) {
            var11 = var4.b();
            var10[0] = var10[0] && !c(var0, var1, var2, var3, var11.e(), var6, var7, var8);
            var10[1] = var10[1] && !c(var0, var1, var2, var3, var11.f(), var6, var7, var8);
            var10[2] = var10[2] && !c(var0, var1, var2, var3, var11.c(), var6, var7, var8);
            var10[3] = var10[3] && !c(var0, var1, var2, var3, var11.d(), var6, var7, var8);
         }
         break;
      case 1:
         var10[0] = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
         var10[1] = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
         var10[2] = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
         var10[3] = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
         if (var1.a) {
            var11 = var4.a();
            var10[0] = var10[0] && !c(var0, var1, var2, var3, var11.e(), var6, var7, var8);
            var10[1] = var10[1] && !c(var0, var1, var2, var3, var11.f(), var6, var7, var8);
            var10[2] = var10[2] && !c(var0, var1, var2, var3, var11.d(), var6, var7, var8);
            var10[3] = var10[3] && !c(var0, var1, var2, var3, var11.c(), var6, var7, var8);
         }
         break;
      case 2:
         var10[0] = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
         var10[1] = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
         var10[2] = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
         var10[3] = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         if (var1.a) {
            var11 = var4.c();
            var10[0] = var10[0] && !c(var0, var1, var2, var3, var11.f(), var6, var7, var8);
            var10[1] = var10[1] && !c(var0, var1, var2, var3, var11.e(), var6, var7, var8);
            var10[2] = var10[2] && !c(var0, var1, var2, var3, var11.b(), var6, var7, var8);
            var10[3] = var10[3] && !c(var0, var1, var2, var3, var11.a(), var6, var7, var8);
         }

         if (var5 == 1) {
            a(0, 1, var10);
            a(2, 3, var10);
         }
         break;
      case 3:
         var10[0] = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
         var10[1] = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
         var10[2] = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
         var10[3] = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         if (var1.a) {
            var11 = var4.d();
            var10[0] = var10[0] && !c(var0, var1, var2, var3, var11.e(), var6, var7, var8);
            var10[1] = var10[1] && !c(var0, var1, var2, var3, var11.f(), var6, var7, var8);
            var10[2] = var10[2] && !c(var0, var1, var2, var3, var11.b(), var6, var7, var8);
            var10[3] = var10[3] && !c(var0, var1, var2, var3, var11.a(), var6, var7, var8);
         }
         break;
      case 4:
         var10[0] = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
         var10[1] = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
         var10[2] = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
         var10[3] = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         if (var1.a) {
            var11 = var4.e();
            var10[0] = var10[0] && !c(var0, var1, var2, var3, var11.c(), var6, var7, var8);
            var10[1] = var10[1] && !c(var0, var1, var2, var3, var11.d(), var6, var7, var8);
            var10[2] = var10[2] && !c(var0, var1, var2, var3, var11.b(), var6, var7, var8);
            var10[3] = var10[3] && !c(var0, var1, var2, var3, var11.a(), var6, var7, var8);
         }
         break;
      case 5:
         var10[0] = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
         var10[1] = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
         var10[2] = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
         var10[3] = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         if (var1.a) {
            var11 = var4.f();
            var10[0] = var10[0] && !c(var0, var1, var2, var3, var11.d(), var6, var7, var8);
            var10[1] = var10[1] && !c(var0, var1, var2, var3, var11.c(), var6, var7, var8);
            var10[2] = var10[2] && !c(var0, var1, var2, var3, var11.b(), var6, var7, var8);
            var10[3] = var10[3] && !c(var0, var1, var2, var3, var11.a(), var6, var7, var8);
         }

         if (var5 == 2) {
            a(0, 1, var10);
            a(2, 3, var10);
         }
      }

      byte var13 = 0;
      if (var10[0] & !var10[1] & !var10[2] & !var10[3]) {
         var13 = 3;
      } else if (!var10[0] & var10[1] & !var10[2] & !var10[3]) {
         var13 = 1;
      } else if (!var10[0] & !var10[1] & var10[2] & !var10[3]) {
         var13 = 12;
      } else if (!var10[0] & !var10[1] & !var10[2] & var10[3]) {
         var13 = 36;
      } else if (var10[0] & var10[1] & !var10[2] & !var10[3]) {
         var13 = 2;
      } else if (!var10[0] & !var10[1] & var10[2] & var10[3]) {
         var13 = 24;
      } else if (var10[0] & !var10[1] & var10[2] & !var10[3]) {
         var13 = 15;
      } else if (var10[0] & !var10[1] & !var10[2] & var10[3]) {
         var13 = 39;
      } else if (!var10[0] & var10[1] & var10[2] & !var10[3]) {
         var13 = 13;
      } else if (!var10[0] & var10[1] & !var10[2] & var10[3]) {
         var13 = 37;
      } else if (!var10[0] & var10[1] & var10[2] & var10[3]) {
         var13 = 25;
      } else if (var10[0] & !var10[1] & var10[2] & var10[3]) {
         var13 = 27;
      } else if (var10[0] & var10[1] & !var10[2] & var10[3]) {
         var13 = 38;
      } else if (var10[0] & var10[1] & var10[2] & !var10[3]) {
         var13 = 14;
      } else if (var10[0] & var10[1] & var10[2] & var10[3]) {
         var13 = 26;
      }

      if (var13 == 0) {
         return var13;
      } else if (!afT.ab()) {
         return var13;
      } else {
         acV var12;
         switch(var6) {
         case 0:
            var10[0] = !c(var0, var1, var2, var3, var4.f().c(), var6, var7, var8);
            var10[1] = !c(var0, var1, var2, var3, var4.e().c(), var6, var7, var8);
            var10[2] = !c(var0, var1, var2, var3, var4.f().d(), var6, var7, var8);
            var10[3] = !c(var0, var1, var2, var3, var4.e().d(), var6, var7, var8);
            if (var1.a) {
               var12 = var4.b();
               var10[0] = var10[0] || c(var0, var1, var2, var3, var12.f().c(), var6, var7, var8);
               var10[1] = var10[1] || c(var0, var1, var2, var3, var12.e().c(), var6, var7, var8);
               var10[2] = var10[2] || c(var0, var1, var2, var3, var12.f().d(), var6, var7, var8);
               var10[3] = var10[3] || c(var0, var1, var2, var3, var12.e().d(), var6, var7, var8);
            }
            break;
         case 1:
            var10[0] = !c(var0, var1, var2, var3, var4.f().d(), var6, var7, var8);
            var10[1] = !c(var0, var1, var2, var3, var4.e().d(), var6, var7, var8);
            var10[2] = !c(var0, var1, var2, var3, var4.f().c(), var6, var7, var8);
            var10[3] = !c(var0, var1, var2, var3, var4.e().c(), var6, var7, var8);
            if (var1.a) {
               var12 = var4.a();
               var10[0] = var10[0] || c(var0, var1, var2, var3, var12.f().d(), var6, var7, var8);
               var10[1] = var10[1] || c(var0, var1, var2, var3, var12.e().d(), var6, var7, var8);
               var10[2] = var10[2] || c(var0, var1, var2, var3, var12.f().c(), var6, var7, var8);
               var10[3] = var10[3] || c(var0, var1, var2, var3, var12.e().c(), var6, var7, var8);
            }
            break;
         case 2:
            var10[0] = !c(var0, var1, var2, var3, var4.e().b(), var6, var7, var8);
            var10[1] = !c(var0, var1, var2, var3, var4.f().b(), var6, var7, var8);
            var10[2] = !c(var0, var1, var2, var3, var4.e().a(), var6, var7, var8);
            var10[3] = !c(var0, var1, var2, var3, var4.f().a(), var6, var7, var8);
            if (var1.a) {
               var12 = var4.c();
               var10[0] = var10[0] || c(var0, var1, var2, var3, var12.e().b(), var6, var7, var8);
               var10[1] = var10[1] || c(var0, var1, var2, var3, var12.f().b(), var6, var7, var8);
               var10[2] = var10[2] || c(var0, var1, var2, var3, var12.e().a(), var6, var7, var8);
               var10[3] = var10[3] || c(var0, var1, var2, var3, var12.f().a(), var6, var7, var8);
            }

            if (var5 == 1) {
               a(0, 3, var10);
               a(1, 2, var10);
            }
            break;
         case 3:
            var10[0] = !c(var0, var1, var2, var3, var4.f().b(), var6, var7, var8);
            var10[1] = !c(var0, var1, var2, var3, var4.e().b(), var6, var7, var8);
            var10[2] = !c(var0, var1, var2, var3, var4.f().a(), var6, var7, var8);
            var10[3] = !c(var0, var1, var2, var3, var4.e().a(), var6, var7, var8);
            if (var1.a) {
               var12 = var4.d();
               var10[0] = var10[0] || c(var0, var1, var2, var3, var12.f().b(), var6, var7, var8);
               var10[1] = var10[1] || c(var0, var1, var2, var3, var12.e().b(), var6, var7, var8);
               var10[2] = var10[2] || c(var0, var1, var2, var3, var12.f().a(), var6, var7, var8);
               var10[3] = var10[3] || c(var0, var1, var2, var3, var12.e().a(), var6, var7, var8);
            }
            break;
         case 4:
            var10[0] = !c(var0, var1, var2, var3, var4.b().d(), var6, var7, var8);
            var10[1] = !c(var0, var1, var2, var3, var4.b().c(), var6, var7, var8);
            var10[2] = !c(var0, var1, var2, var3, var4.a().d(), var6, var7, var8);
            var10[3] = !c(var0, var1, var2, var3, var4.a().c(), var6, var7, var8);
            if (var1.a) {
               var12 = var4.e();
               var10[0] = var10[0] || c(var0, var1, var2, var3, var12.b().d(), var6, var7, var8);
               var10[1] = var10[1] || c(var0, var1, var2, var3, var12.b().c(), var6, var7, var8);
               var10[2] = var10[2] || c(var0, var1, var2, var3, var12.a().d(), var6, var7, var8);
               var10[3] = var10[3] || c(var0, var1, var2, var3, var12.a().c(), var6, var7, var8);
            }
            break;
         case 5:
            var10[0] = !c(var0, var1, var2, var3, var4.b().c(), var6, var7, var8);
            var10[1] = !c(var0, var1, var2, var3, var4.b().d(), var6, var7, var8);
            var10[2] = !c(var0, var1, var2, var3, var4.a().c(), var6, var7, var8);
            var10[3] = !c(var0, var1, var2, var3, var4.a().d(), var6, var7, var8);
            if (var1.a) {
               var12 = var4.f();
               var10[0] = var10[0] || c(var0, var1, var2, var3, var12.b().c(), var6, var7, var8);
               var10[1] = var10[1] || c(var0, var1, var2, var3, var12.b().d(), var6, var7, var8);
               var10[2] = var10[2] || c(var0, var1, var2, var3, var12.a().c(), var6, var7, var8);
               var10[3] = var10[3] || c(var0, var1, var2, var3, var12.a().d(), var6, var7, var8);
            }

            if (var5 == 2) {
               a(0, 3, var10);
               a(1, 2, var10);
            }
         }

         if (var13 == 13 && var10[0]) {
            var13 = 4;
         } else if (var13 == 15 && var10[1]) {
            var13 = 5;
         } else if (var13 == 37 && var10[2]) {
            var13 = 16;
         } else if (var13 == 39 && var10[3]) {
            var13 = 17;
         } else if (var13 == 14 && var10[0] && var10[1]) {
            var13 = 7;
         } else if (var13 == 25 && var10[0] && var10[2]) {
            var13 = 6;
         } else if (var13 == 27 && var10[3] && var10[1]) {
            var13 = 19;
         } else if (var13 == 38 && var10[3] && var10[2]) {
            var13 = 18;
         } else if (var13 == 14 && !var10[0] && var10[1]) {
            var13 = 31;
         } else if (var13 == 25 && var10[0] && !var10[2]) {
            var13 = 30;
         } else if (var13 == 27 && !var10[3] && var10[1]) {
            var13 = 41;
         } else if (var13 == 38 && var10[3] && !var10[2]) {
            var13 = 40;
         } else if (var13 == 14 && var10[0] && !var10[1]) {
            var13 = 29;
         } else if (var13 == 25 && !var10[0] && var10[2]) {
            var13 = 28;
         } else if (var13 == 27 && var10[3] && !var10[1]) {
            var13 = 43;
         } else if (var13 == 38 && !var10[3] && var10[2]) {
            var13 = 42;
         } else if (var13 == 26 && var10[0] && var10[1] && var10[2] && var10[3]) {
            var13 = 46;
         } else if (var13 == 26 && !var10[0] && var10[1] && var10[2] && var10[3]) {
            var13 = 9;
         } else if (var13 == 26 && var10[0] && !var10[1] && var10[2] && var10[3]) {
            var13 = 21;
         } else if (var13 == 26 && var10[0] && var10[1] && !var10[2] && var10[3]) {
            var13 = 8;
         } else if (var13 == 26 && var10[0] && var10[1] && var10[2] && !var10[3]) {
            var13 = 20;
         } else if (var13 == 26 && var10[0] && var10[1] && !var10[2] && !var10[3]) {
            var13 = 11;
         } else if (var13 == 26 && !var10[0] && !var10[1] && var10[2] && var10[3]) {
            var13 = 22;
         } else if (var13 == 26 && !var10[0] && var10[1] && !var10[2] && var10[3]) {
            var13 = 23;
         } else if (var13 == 26 && var10[0] && !var10[1] && var10[2] && !var10[3]) {
            var13 = 10;
         } else if (var13 == 26 && var10[0] && !var10[1] && !var10[2] && var10[3]) {
            var13 = 34;
         } else if (var13 == 26 && !var10[0] && var10[1] && var10[2] && !var10[3]) {
            var13 = 35;
         } else if (var13 == 26 && var10[0] && !var10[1] && !var10[2] && !var10[3]) {
            var13 = 32;
         } else if (var13 == 26 && !var10[0] && var10[1] && !var10[2] && !var10[3]) {
            var13 = 33;
         } else if (var13 == 26 && !var10[0] && !var10[1] && var10[2] && !var10[3]) {
            var13 = 44;
         } else if (var13 == 26 && !var10[0] && !var10[1] && !var10[2] && var10[3]) {
            var13 = 45;
         }

         return var13;
      }
   }

   private static void a(int var0, int var1, boolean[] var2) {
      boolean var3 = var2[var0];
      var2[var0] = var2[var1];
      var2[var1] = var3;
   }

   private static boolean a(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, HK var6, int var7) {
      sD var8 = var2.a(var4);
      if (!a(var8)) {
         return false;
      } else {
         if (var1.b != null) {
            sw var9 = (sw)var8;
            if (!agI.a(var9.a(), var9.b(), var1.b)) {
               return false;
            }
         }

         if (var1.c != null) {
            HK var10 = a(var0, var2, var4, var8, var5);
            if (!afT.b((Object)var10, (Object[])var1.c)) {
               return false;
            }
         }

         sD var11 = var2.a(var4.a(a(var5)));
         if (var11.isOpaqueCube()) {
            return false;
         } else if (var5 == 1 && var11.a() == RQ.aa) {
            return false;
         } else {
            return !a(var0, var1, var2, var3, var4, var8, var5, var6, var7);
         }
      }
   }

   private static boolean a(sD var0) {
      if (var0.isFullCube()) {
         return true;
      } else {
         nh var1 = var0.a();
         return var1 instanceof Li || var1 instanceof Lj;
      }
   }

   private static boolean b(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, HK var6, int var7) {
      sD var8 = var2.a(var4);
      if (var8 == a) {
         return false;
      } else {
         if (var1.a != null && var8 instanceof sw) {
            sw var9 = (sw)var8;
            if (!var1.a(var9.a(), var9.b())) {
               return false;
            }
         }

         if (var1.a != null) {
            HK var10 = a(var0, var2, var4, var8, var5);
            if (var10 != var6) {
               return false;
            }
         }

         sD var11 = var2.a(var4.a(a(var5)));
         if (var11.isOpaqueCube()) {
            return false;
         } else {
            return var5 != 1 || var11.a() != RQ.aa;
         }
      }
   }

   private static boolean c(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, HK var6, int var7) {
      sD var8 = var2.a(var4);
      return a(var0, var1, var2, var3, var4, var8, var5, var6, var7);
   }

   private static boolean a(AU var0, afU var1, aec var2, sD var3, acV var4, sD var5, int var6, HK var7, int var8) {
      if (var3 == var5) {
         return true;
      } else if (var1.b == 2) {
         if (var5 == null) {
            return false;
         } else if (var5 == a) {
            return false;
         } else {
            HK var12 = a(var0, var2, var4, var5, var6);
            return var12 == var7;
         }
      } else if (var1.b == 3) {
         if (var5 == null) {
            return false;
         } else if (var5 == a) {
            return false;
         } else {
            return var5.a() == var3.a();
         }
      } else if (!(var5 instanceof sw)) {
         return false;
      } else {
         sw var9 = (sw)var5;
         nh var10 = var9.a();
         int var11 = var9.b();
         return var10 == var3.a() && var11 == var8;
      }
   }

   private static HK a(AU var0, aec var1, acV var2, sD var3, int var4) {
      var3 = var3.a().a(var3, var1, var2.a, var2.b, var2.c);
      CV var5 = var0.a(var3);
      if (var5 == null) {
         return null;
      } else {
         abP var6 = a(var4);
         List var7 = var5.a(var3, var6, 0L);
         if (var7 == null) {
            return null;
         } else {
            if (afT.C()) {
               var7 = afM.a(var1, var3, var2, var6, var7);
            }

            if (var7.size() > 0) {
               CD var11 = (CD)var7.get(0);
               return var11.a();
            } else {
               List var8 = var5.a(var3, (abP)null, 0L);
               if (var8 == null) {
                  return null;
               } else {
                  for(int var9 = 0; var9 < var8.size(); ++var9) {
                     CD var10 = (CD)var8.get(var9);
                     if (var10.a() == var6) {
                        return var10.a();
                     }
                  }

                  return null;
               }
            }
         }
      }
   }

   private static HK a(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, int var6, HK var7, int var8) {
      boolean var9;
      boolean var10;
      var9 = false;
      var10 = false;
      label49:
      switch(var5) {
      case 0:
         switch(var6) {
         case 0:
            var9 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            break label49;
         case 1:
            var9 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            break label49;
         case 2:
            var9 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            break label49;
         case 3:
            var9 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            break label49;
         case 4:
            var9 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            break label49;
         case 5:
            var9 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
         default:
            break label49;
         }
      case 1:
         switch(var6) {
         case 0:
            var9 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            break label49;
         case 1:
            var9 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            break label49;
         case 2:
            var9 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            break label49;
         case 3:
            var9 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
            break label49;
         case 4:
            var9 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
            break label49;
         case 5:
            var9 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
         default:
            break label49;
         }
      case 2:
         switch(var6) {
         case 0:
            var9 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
            break;
         case 1:
            var9 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            break;
         case 2:
            var9 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
            break;
         case 3:
            var9 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
            break;
         case 4:
            var9 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            break;
         case 5:
            var9 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
         }
      }

      boolean var11 = true;
      byte var12;
      if (var9) {
         if (var10) {
            var12 = 1;
         } else {
            var12 = 2;
         }
      } else if (var10) {
         var12 = 0;
      } else {
         var12 = 3;
      }

      return var1.b[var12];
   }

   private static HK b(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, int var6, HK var7, int var8) {
      boolean var9 = false;
      boolean var10 = false;
      switch(var5) {
      case 0:
         if (var6 == 1) {
            var9 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
         } else if (var6 == 0) {
            var9 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
         } else {
            var9 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         }
         break;
      case 1:
         if (var6 == 3) {
            var9 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         } else if (var6 == 2) {
            var9 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
         } else {
            var9 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.c(), var6, var7, var8);
         }
         break;
      case 2:
         if (var6 == 5) {
            var9 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
         } else if (var6 == 4) {
            var9 = c(var0, var1, var2, var3, var4.b(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         } else {
            var9 = c(var0, var1, var2, var3, var4.e(), var6, var7, var8);
            var10 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
         }
      }

      boolean var11 = true;
      byte var12;
      if (var9) {
         if (var10) {
            var12 = 1;
         } else {
            var12 = 2;
         }
      } else if (var10) {
         var12 = 0;
      } else {
         var12 = 3;
      }

      return var1.b[var12];
   }

   private static HK c(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, int var6, HK var7, int var8) {
      HK[] var9 = var1.b;
      HK var10 = a(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      if (var10 != null && var10 != var7 && var10 != var9[3]) {
         return var10;
      } else {
         HK var11 = b(var0, var1, var2, var3, var4, var5, var6, var7, var8);
         if (var11 == var9[0]) {
            return var9[4];
         } else if (var11 == var9[1]) {
            return var9[5];
         } else {
            return var11 == var9[2] ? var9[6] : var11;
         }
      }
   }

   private static HK d(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, int var6, HK var7, int var8) {
      HK[] var9 = var1.b;
      HK var10 = b(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      if (var10 != null && var10 != var7 && var10 != var9[3]) {
         return var10;
      } else {
         HK var11 = a(var0, var1, var2, var3, var4, var5, var6, var7, var8);
         if (var11 == var9[0]) {
            return var9[4];
         } else if (var11 == var9[1]) {
            return var9[5];
         } else {
            return var11 == var9[2] ? var9[6] : var11;
         }
      }
   }

   private static HK e(AU var0, afU var1, aec var2, sD var3, acV var4, int var5, int var6, HK var7, int var8) {
      boolean var9 = false;
      switch(var5) {
      case 0:
         if (var6 == 1 || var6 == 0) {
            return null;
         }

         var9 = c(var0, var1, var2, var3, var4.a(), var6, var7, var8);
         break;
      case 1:
         if (var6 != 3 && var6 != 2) {
            var9 = c(var0, var1, var2, var3, var4.d(), var6, var7, var8);
            break;
         }

         return null;
      case 2:
         if (var6 == 5 || var6 == 4) {
            return null;
         }

         var9 = c(var0, var1, var2, var3, var4.f(), var6, var7, var8);
      }

      if (var9) {
         return var1.b[0];
      } else {
         return null;
      }
   }

   public static void a(IN var0, Jc var1, HO var2) {
      a = (afU[][])null;
      b = (afU[][])null;
      a = null;
      a = (Map[][])null;
      if (afT.Y()) {
         IP[] var3 = var1.a();

         for(int var4 = var3.length - 1; var4 >= 0; --var4) {
            IP var5 = var3[var4];
            a(var0, var1, var2, var5);
         }

         a(var0, var1, var2, var1.a);
         acC var6 = new acC("mcpatcher/ctm/default/empty");
         b = var2.a(var6);
         a = new Map[var2.getCountRegisteredSprites() + 1];
         b = new Map[var2.getCountRegisteredSprites() + 1];
         a = new Map[var2.getCountRegisteredSprites() + 1][];
         if (a.length == 0) {
            a = (afU[][])null;
         }

         if (b.length == 0) {
            b = (afU[][])null;
         }
      }

      a = a();
      afT.a("Multipass connected textures: " + a);
   }

   public static void a(IN var0, Jc var1, HO var2, IP var3) {
      String[] var4 = amg.a(var3, "mcpatcher/ctm/", ".properties", a(var1));
      Arrays.sort(var4);
      List var5 = a(b);
      List var6 = a(a);

      for(int var7 = 0; var7 < var4.length; ++var7) {
         String var8 = var4[var7];
         afT.a("ConnectedTextures: " + var8);

         try {
            acC var9 = new acC(var8);
            InputStream var10 = var3.a(var9);
            if (var10 == null) {
               afT.b("ConnectedTextures file not found: " + var8);
            } else {
               Properties var11 = new Properties();
               var11.load(var10);
               afU var12 = new afU(var2, var11, var8);
               if (var12.a(var8)) {
                  var12.a(var0, var2);
                  a(var12, var5);
                  b(var12, var6);
               }
            }
         } catch (FileNotFoundException var13) {
            afT.b("ConnectedTextures file not found: " + var8);
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      a = a(var6);
      b = a(var5);
   }

   private static List a(afU[][] var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            afU[] var3 = var0[var2];
            ArrayList var4 = null;
            if (var3 != null) {
               var4 = new ArrayList(Arrays.asList(var3));
            }

            var1.add(var4);
         }
      }

      return var1;
   }

   private static boolean a() {
      ArrayList var0 = new ArrayList();
      int var1;
      afU[] var2;
      if (b != null) {
         for(var1 = 0; var1 < b.length; ++var1) {
            var2 = b[var1];
            if (var2 != null) {
               var0.addAll(Arrays.asList(var2));
            }
         }
      }

      if (a != null) {
         for(var1 = 0; var1 < a.length; ++var1) {
            var2 = a[var1];
            if (var2 != null) {
               var0.addAll(Arrays.asList(var2));
            }
         }
      }

      if (var0.isEmpty()) {
         return false;
      } else {
         afU[] var6 = (afU[])((afU[])var0.toArray(new afU[0]));
         HashSet var7 = new HashSet();
         HashSet var3 = new HashSet();

         for(int var4 = 0; var4 < var6.length; ++var4) {
            afU var5 = var6[var4];
            if (var5.a != null) {
               var7.addAll(Arrays.asList(var5.a));
            }

            if (var5.b != null) {
               var3.addAll(Arrays.asList(var5.b));
            }
         }

         var7.retainAll(var3);
         return !var7.isEmpty();
      }
   }

   private static afU[][] a(List var0) {
      afU[][] var1 = new afU[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            afU[] var4 = (afU[])((afU[])var3.toArray(new afU[0]));
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static void a(afU var0, List var1) {
      if (var0.a != null) {
         for(int var2 = 0; var2 < var0.a.length; ++var2) {
            HK var3 = var0.a[var2];
            if (!(var3 instanceof HK)) {
               afT.b("TextureAtlasSprite is not TextureAtlasSprite: " + var3 + ", name: " + var3.getIconName());
            } else {
               int var4 = var3.getIndexInMap();
               if (var4 < 0) {
                  afT.b("Invalid tile ID: " + var4 + ", icon: " + var3.getIconName());
               } else {
                  a(var0, var1, var4);
               }
            }
         }
      }

   }

   private static void b(afU var0, List var1) {
      if (var0.a != null) {
         for(int var2 = 0; var2 < var0.a.length; ++var2) {
            int var3 = var0.a[var2].a();
            if (var3 < 0) {
               afT.b("Invalid block ID: " + var3);
            } else {
               a(var0, var1, var3);
            }
         }
      }

   }

   private static void a(afU var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      ((List)var3).add(var0);
   }

   private static String[] a(Jc var0) {
      ArrayList var1 = new ArrayList();
      String var2 = "mcpatcher/ctm/default/";
      if (var0.a(new acC("textures/blocks/glass.png"))) {
         var1.add(var2 + "glass.properties");
         var1.add(var2 + "glasspane.properties");
      }

      if (var0.a(new acC("textures/blocks/bookshelf.png"))) {
         var1.add(var2 + "bookshelf.properties");
      }

      if (var0.a(new acC("textures/blocks/sandstone_normal.png"))) {
         var1.add(var2 + "sandstone.properties");
      }

      String[] var3 = new String[]{"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (var0.a(new acC("textures/blocks/glass_" + var5 + ".png"))) {
            var1.add(var2 + var4 + "_glass_" + var5 + "/glass_" + var5 + ".properties");
            var1.add(var2 + var4 + "_glass_" + var5 + "/glass_pane_" + var5 + ".properties");
         }
      }

      String[] var6 = (String[])((String[])var1.toArray(new String[0]));
      return var6;
   }

   static {
      a = afh.a;
      b = null;
      a = new afO[]{afO.WEST, afO.EAST, afO.NORTH, afO.SOUTH};
      b = new afO[]{afO.WEST, afO.EAST, afO.SOUTH, afO.NORTH};
      c = new afO[]{afO.EAST, afO.WEST, afO.DOWN, afO.UP};
      d = new afO[]{afO.WEST, afO.EAST, afO.DOWN, afO.UP};
      e = new afO[]{afO.NORTH, afO.SOUTH, afO.DOWN, afO.UP};
      f = new afO[]{afO.SOUTH, afO.NORTH, afO.DOWN, afO.UP};
      g = new afO[]{afO.WEST, afO.EAST, afO.UP, afO.DOWN};
      h = new afO[]{afO.NORTH, afO.SOUTH, afO.UP, afO.DOWN};
      i = new afO[]{afO.NORTH_EAST, afO.NORTH_WEST, afO.SOUTH_EAST, afO.SOUTH_WEST};
      j = new afO[]{afO.SOUTH_EAST, afO.SOUTH_WEST, afO.NORTH_EAST, afO.NORTH_WEST};
      k = new afO[]{afO.DOWN_WEST, afO.DOWN_EAST, afO.UP_WEST, afO.UP_EAST};
      l = new afO[]{afO.DOWN_EAST, afO.DOWN_WEST, afO.UP_EAST, afO.UP_WEST};
      m = new afO[]{afO.DOWN_SOUTH, afO.DOWN_NORTH, afO.UP_SOUTH, afO.UP_NORTH};
      n = new afO[]{afO.DOWN_NORTH, afO.DOWN_SOUTH, afO.UP_NORTH, afO.UP_SOUTH};
      o = new afO[]{afO.UP_EAST, afO.UP_WEST, afO.DOWN_EAST, afO.DOWN_WEST};
      p = new afO[]{afO.UP_SOUTH, afO.UP_NORTH, afO.DOWN_SOUTH, afO.DOWN_NORTH};
      a = new HK("<default>");
   }
}
