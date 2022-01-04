import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ajv {
   private static final ajw a = new ajw();
   private static final Map<Class, Integer> a = new HashMap();
   private static final Map<SZ, Integer> b = new HashMap();
   private static long a = 0L;
   private static final WB<Vh> a;
   private static boolean a;

   public static void a(NN var0, Ck var1) {
      synchronized(a) {
         aju var3 = a.b(var0.getEntityId());
         if (var3 != null) {
            var3.b(var1);
         }

      }
   }

   public static void a(Ck var0) {
      long var1 = System.currentTimeMillis();
      if (var1 >= a + 50L) {
         a = var1;
         if (!a) {
            b();
         }

         synchronized(a) {
            c(var0);
            if (a.a() > 0) {
               List var4 = a.a();

               for(int var5 = 0; var5 < var4.size(); ++var5) {
                  aju var6 = (aju)var4.get(var5);
                  var6.a(var0);
               }
            }
         }
      }

   }

   private static void b() {
      a = true;
      a.clear();
      b.clear();
   }

   private static void c(Ck var0) {
      yw var1 = var0.a();
      if (var1 != null) {
         Set var2 = var1.a();
         boolean var3 = false;
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            NN var5 = (NN)var4.next();
            int var6 = a(var0.a, var5);
            int var7;
            aju var8;
            if (var6 > 0) {
               var7 = var5.getEntityId();
               var8 = a.a(var7);
               if (var8 == null) {
                  var8 = new aju(var5);
                  a.a(var7, var8);
               }
            } else {
               var7 = var5.getEntityId();
               var8 = a.b(var7);
               if (var8 != null) {
                  var8.b(var0);
               }
            }
         }
      }

   }

   public static int a(int var0, int var1, int var2, int var3) {
      double var4 = a(var0, var1, var2);
      var3 = a(var4, var3);
      return var3;
   }

   public static int a(acV var0, int var1) {
      return a(var0.a, var0.b, var0.c, var1);
   }

   public static int a(sE var0, NN var1, int var2) {
      double var3 = (double)a(var0, var1);
      var2 = a(var3, var2);
      return var2;
   }

   public static int a(double var0, int var2) {
      if (var0 > 0.0D) {
         int var3 = (int)(var0 * 16.0D);
         int var4 = var2 & 255;
         if (var3 > var4) {
            var2 &= -256;
            var2 |= var3;
         }
      }

      return var2;
   }

   public static double a(int var0, int var1, int var2) {
      double var3 = 0.0D;
      synchronized(a) {
         List var6 = a.a();

         for(int var7 = 0; var7 < var6.size(); ++var7) {
            aju var8 = (aju)var6.get(var7);
            int var9 = var8.a();
            if (var9 > 0) {
               double var10 = var8.a();
               double var12 = var8.b();
               double var14 = var8.c();
               double var16 = (double)var0 - var10;
               double var18 = (double)var1 - var12;
               double var20 = (double)var2 - var14;
               double var22 = var16 * var16 + var18 * var18 + var20 * var20;
               if (var8.a() && !afT.K()) {
                  var9 = afT.a(var9 - 2, 0, 15);
                  var22 *= 2.0D;
               }

               if (var22 <= 56.25D) {
                  double var24 = Math.sqrt(var22);
                  double var26 = 1.0D - var24 / 7.5D;
                  double var28 = var26 * (double)var9;
                  if (var28 > var3) {
                     var3 = var28;
                  }
               }
            }
         }
      }

      double var5 = afT.a(var3, 0.0D, 15.0D);
      return var5;
   }

   public static double a(acV var0) {
      return a(var0.a, var0.b, var0.c);
   }

   public static int a(Vh var0) {
      if (var0 == null) {
         return 0;
      } else {
         SZ var1 = var0.a();
         if (var1 instanceof TH) {
            TH var2 = (TH)var1;
            nh var3 = var2.a();
            if (var3 != null) {
               return var3.b(var3.a());
            }
         }

         if (var1 == RT.ag) {
            return RQ.b.b(RQ.b.a());
         } else if (var1 != RT.bf && var1 != RT.bn) {
            if (var1 == RT.aF) {
               return 8;
            } else if (var1 == RT.cl) {
               return 8;
            } else if (var1 == RT.bo) {
               return 8;
            } else if (var1 == RT.bI) {
               return RQ.a.b(RQ.a.a()) / 2;
            } else {
               if (!b.isEmpty()) {
                  Integer var4 = (Integer)b.get(var1);
                  if (var4 != null) {
                     return var4;
                  }
               }

               return 0;
            }
         } else {
            return 10;
         }
      }
   }

   public static int a(sE var0, NN var1) {
      if (var1 == var0.a() && !afT.ak()) {
         return 0;
      } else {
         if (var1 instanceof Rn) {
            Rn var2 = (Rn)var1;
            if (var2.isSpectator()) {
               return 0;
            }
         }

         if (var1.isBurning()) {
            return 15;
         } else {
            if (!a.isEmpty()) {
               Integer var10 = (Integer)a.get(var1.getClass());
               if (var10 != null) {
                  return var10;
               }
            }

            if (var1 instanceof RB) {
               return 15;
            } else if (var1 instanceof PD) {
               return 15;
            } else if (var1 instanceof PI) {
               PI var15 = (PI)var1;
               return var15.x() ? 15 : 10;
            } else if (var1 instanceof PY) {
               PY var14 = (PY)var1;
               return (double)var14.b > 0.6D ? 13 : 8;
            } else {
               if (var1 instanceof PK) {
                  PK var11 = (PK)var1;
                  if ((double)var11.c(0.0F) > 0.001D) {
                     return 15;
                  }
               }

               Vh var3;
               if (var1 instanceof Oh) {
                  Oh var13 = (Oh)var1;
                  var3 = var13.a();
                  int var4 = a(var3);
                  Vh var5 = var13.b();
                  int var6 = a(var5);
                  Vh var7 = var13.a(SB.HEAD);
                  int var8 = a(var7);
                  int var9 = Math.max(var4, var6);
                  return Math.max(var9, var8);
               } else if (var1 instanceof Pm) {
                  Pm var12 = (Pm)var1;
                  var3 = a(var12);
                  return a(var3);
               } else {
                  return 0;
               }
            }
         }
      }
   }

   public static void b(Ck var0) {
      synchronized(a) {
         List var2 = a.a();

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            aju var4 = (aju)var2.get(var3);
            var4.b(var0);
         }

         a.a();
      }
   }

   public static void a() {
      synchronized(a) {
         a.a();
      }
   }

   public static int a() {
      synchronized(a) {
         return a.a();
      }
   }

   public static Vh a(Pm var0) {
      Vh var1 = (Vh)var0.a().a(a);
      return var1;
   }

   static {
      a = new WB(6, WD.f);
   }
}
