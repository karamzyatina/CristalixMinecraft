import dev.xdark.feder.RecyclableArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public final class Nh {
   private static final Nm a = new Nm((Ni)null);
   private static final Nn a = new Nn((Ni)null);
   private static final Nk a = new Nk((Ni)null);
   private static final Nj a = new Nj((Ni)null);

   public static int a(MT var0, Vh var1) {
      if (!var1.isEmpty()) {
         VZ var2 = var1.a();

         for(int var3 = 0; var3 < var2.a(); ++var3) {
            VR var4 = var2.a(var3);
            MT var5 = MT.a(var4.getShort("id"));
            short var6 = var4.getShort("lvl");
            if (var5 == var0) {
               return var6;
            }
         }
      }

      return 0;
   }

   public static Map<MT, Integer> a(Vh var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      VZ var2 = var0.a() == RT.bM ? Uf.a(var0) : var0.a();

      for(int var3 = 0; var3 < var2.a(); ++var3) {
         VR var4 = var2.a(var3);
         MT var5 = MT.a(var4.getShort("id"));
         short var6 = var4.getShort("lvl");
         var1.put(var5, Integer.valueOf(var6));
      }

      return var1;
   }

   public static void a(Map<MT, Integer> var0, Vh var1) {
      VZ var2 = new VZ();
      Iterator var3 = var0.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         MT var5 = (MT)var4.getKey();
         if (var5 != null) {
            int var6 = (Integer)var4.getValue();
            VR var7 = new VR();
            var7.a("id", (short)MT.a(var5));
            var7.a("lvl", (short)var6);
            var2.a((VK)var7);
            if (var1.a() == RT.bM) {
               Uf.a(var1, new Nb(var5, var6));
            }
         }
      }

      if (var2.isEmpty()) {
         if (var1.c()) {
            var1.a().a("ench");
         }
      } else if (var1.a() != RT.bM) {
         var1.a((String)"ench", (VK)var2);
      }

   }

   private static void a(Nl var0, Vh var1) {
      if (!var1.isEmpty()) {
         VZ var2 = var1.a();

         for(int var3 = 0; var3 < var2.a(); ++var3) {
            short var4 = var2.a(var3).getShort("id");
            short var5 = var2.a(var3).getShort("lvl");
            if (MT.a(var4) != null) {
               var0.a(MT.a(var4), var5);
            }
         }
      }

   }

   private static void a(Nl var0, Iterable<Vh> var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Vh var3 = (Vh)var2.next();
         a(var0, var3);
      }

   }

   public static int a(Iterable<Vh> var0, abD var1) {
      a.a = 0;
      a.a = var1;
      a((Nl)a, (Iterable)var0);
      return a.a;
   }

   public static float a(Vh var0, Oj var1) {
      a.a = 0.0F;
      a.a = var1;
      a((Nl)a, (Vh)var0);
      return a.a;
   }

   public static float a(Oh var0) {
      int var1 = a(RS.r, var0);
      return var1 > 0 ? Nu.a(var1) : 0.0F;
   }

   public static void a(Oh var0, NN var1) {
      a.a = var1;
      a.a = var0;
      if (var0 != null) {
         a((Nl)a, (Iterable)var0.getEquipmentAndArmor());
      }

      if (var1 instanceof Rn) {
         a((Nl)a, (Vh)var0.a());
      }

   }

   public static void b(Oh var0, NN var1) {
      a.a = var0;
      a.a = var1;
      if (var0 != null) {
         a((Nl)a, (Iterable)var0.getEquipmentAndArmor());
      }

      if (var0 instanceof Rn) {
         a((Nl)a, (Vh)var0.a());
      }

   }

   public static int a(MT var0, Oh var1) {
      List var2 = var0.a(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = 0;
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            Vh var5 = (Vh)var4.next();
            int var6 = a(var0, var5);
            if (var6 > var3) {
               var3 = var6;
            }
         }

         return var3;
      }
   }

   public static int a(Oh var0) {
      return a(RS.o, var0);
   }

   public static int b(Oh var0) {
      return a(RS.p, var0);
   }

   public static int c(Oh var0) {
      return a(RS.f, var0);
   }

   public static int d(Oh var0) {
      return a(RS.i, var0);
   }

   public static int e(Oh var0) {
      return a(RS.s, var0);
   }

   public static int a(Vh var0) {
      return a(RS.A, var0);
   }

   public static int b(Vh var0) {
      return a(RS.B, var0);
   }

   public static int f(Oh var0) {
      return a(RS.q, var0);
   }

   public static boolean a(Oh var0) {
      return a(RS.g, var0) > 0;
   }

   public static boolean b(Oh var0) {
      return a(RS.j, var0) > 0;
   }

   public static boolean a(Vh var0) {
      return a(RS.k, var0) > 0;
   }

   public static boolean b(Vh var0) {
      return a(RS.D, var0) > 0;
   }

   public static Vh a(MT var0, Oh var1) {
      List var2 = var0.a(var1);
      if (var2.isEmpty()) {
         return Vh.a;
      } else {
         RecyclableArrayList var3 = RecyclableArrayList.newInstance();
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            Vh var5 = (Vh)var4.next();
            if (!var5.isEmpty() && a(var0, var5) > 0) {
               var3.add(var5);
            }
         }

         Vh var6;
         if (var3.isEmpty()) {
            var6 = Vh.a;
         } else {
            var6 = (Vh)var3.get(var1.a().nextInt(var3.size()));
         }

         var3.recycle();
         return var6;
      }
   }

   public static int a(Random var0, int var1, int var2, Vh var3) {
      SZ var4 = var3.a();
      int var5 = var4.a();
      if (var5 <= 0) {
         return 0;
      } else {
         if (var2 > 15) {
            var2 = 15;
         }

         int var6 = var0.nextInt(8) + 1 + (var2 >> 1) + var0.nextInt(var2 + 1);
         if (var1 == 0) {
            return Math.max(var6 / 3, 1);
         } else {
            return var1 == 1 ? var6 * 2 / 3 + 1 : Math.max(var6, var2 * 2);
         }
      }
   }

   public static Vh a(Random var0, Vh var1, int var2, boolean var3) {
      List var4 = a(var0, var1, var2, var3);
      boolean var5 = var1.a() == RT.ay;
      if (var5) {
         var1 = new Vh(RT.bM);
      }

      Iterator var6 = var4.iterator();

      while(var6.hasNext()) {
         Nb var7 = (Nb)var6.next();
         if (var5) {
            Uf.a(var1, var7);
         } else {
            var1.a(var7.a, var7.a);
         }
      }

      return var1;
   }

   public static List<Nb> a(Random var0, Vh var1, int var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      SZ var5 = var1.a();
      int var6 = var5.a();
      if (var6 > 0) {
         var2 = var2 + 1 + var0.nextInt(var6 / 4 + 1) + var0.nextInt(var6 / 4 + 1);
         float var7 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         var2 = adh.a(Math.round((float)var2 + (float)var2 * var7), 1, Integer.MAX_VALUE);
         List var8 = a(var2, var1, var3);
         if (!var8.isEmpty()) {
            var4.add(acR.a(var0, var8));

            while(var0.nextInt(50) <= var2) {
               a(var8, (Nb)acP.a(var4));
               if (var8.isEmpty()) {
                  break;
               }

               var4.add(acR.a(var0, var8));
               var2 /= 2;
            }
         }
      }

      return var4;
   }

   public static void a(List<Nb> var0, Nb var1) {
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         if (!var1.a.a(((Nb)var2.next()).a)) {
            var2.remove();
         }
      }

   }

   public static List<Nb> a(int var0, Vh var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      SZ var4 = var1.a();
      boolean var5 = var1.a() == RT.ay;
      Iterator var6 = MT.a.iterator();

      while(true) {
         while(true) {
            MT var7;
            do {
               do {
                  if (!var6.hasNext()) {
                     return var3;
                  }

                  var7 = (MT)var6.next();
               } while(var7.a() && !var2);
            } while(!var7.a.a(var4) && !var5);

            for(int var8 = var7.b(); var8 > var7.a() - 1; --var8) {
               if (var0 >= var7.a(var8) && var0 <= var7.b(var8)) {
                  var3.add(new Nb(var7, var8));
                  break;
               }
            }
         }
      }
   }
}
