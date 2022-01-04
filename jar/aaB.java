import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.List;

public final class aab {
   private static final List<aad<aae>> a = new ArrayList(49);
   private static final List<aad<SZ>> b = new ArrayList(2);
   private static final List<Vq> c = new ArrayList(3);
   private static final Predicate<Vh> a = new aac();

   public static boolean a(Vh var0) {
      return b(var0) || c(var0);
   }

   protected static boolean b(Vh var0) {
      int var1 = 0;

      for(int var2 = b.size(); var1 < var2; ++var1) {
         if (((aad)b.get(var1)).a.a(var0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(Vh var0) {
      int var1 = 0;

      for(int var2 = a.size(); var1 < var2; ++var1) {
         if (((aad)a.get(var1)).a.a(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Vh var0, Vh var1) {
      if (!a.apply(var0)) {
         return false;
      } else {
         return b(var0, var1) || c(var0, var1);
      }
   }

   protected static boolean b(Vh var0, Vh var1) {
      SZ var2 = var0.a();
      int var3 = 0;

      for(int var4 = b.size(); var3 < var4; ++var3) {
         aad var5 = (aad)b.get(var3);
         if (var5.a == var2 && var5.a.a(var1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(Vh var0, Vh var1) {
      aae var2 = aaf.a(var0);
      int var3 = 0;

      for(int var4 = a.size(); var3 < var4; ++var3) {
         aad var5 = (aad)a.get(var3);
         if (var5.a == var2 && var5.a.a(var1)) {
            return true;
         }
      }

      return false;
   }

   public static Vh a(Vh var0, Vh var1) {
      if (!var1.isEmpty()) {
         aae var2 = aaf.a(var1);
         SZ var3 = var1.a();
         int var4 = 0;

         int var5;
         aad var6;
         for(var5 = b.size(); var4 < var5; ++var4) {
            var6 = (aad)b.get(var4);
            if (var6.a == var3 && var6.a.a(var0)) {
               return aaf.a(new Vh((SZ)var6.b), var2);
            }
         }

         var4 = 0;

         for(var5 = a.size(); var4 < var5; ++var4) {
            var6 = (aad)a.get(var4);
            if (var6.a == var2 && var6.a.a(var0)) {
               return aaf.a(new Vh(var3), (aae)var6.b);
            }
         }
      }

      return var1;
   }

   public static void a() {
      a(RT.a);
      a(RT.b);
      a(RT.c);
      a(RT.a, RT.J, RT.b);
      a(RT.b, RT.bk, RT.c);
      a(RV.b, RT.bs, RV.c);
      a(RV.b, RT.bg, RV.c);
      a(RV.b, RT.bb, RV.c);
      a(RV.b, RT.bn, RV.c);
      a(RV.b, RT.bl, RV.c);
      a(RV.b, RT.aK, RV.c);
      a(RV.b, RT.bo, RV.c);
      a(RV.b, RT.aF, RV.d);
      a(RV.b, RT.ak, RV.c);
      a(RV.b, RT.bi, RV.e);
      a(RV.e, RT.bF, RV.f);
      a(RV.f, RT.ak, RV.g);
      a(RV.f, RT.bm, RV.h);
      a(RV.g, RT.bm, RV.i);
      a(RV.h, RT.ak, RV.i);
      a(RV.e, RT.bo, RV.m);
      a(RV.m, RT.ak, RV.n);
      a(RV.e, RT.bb, RV.j);
      a(RV.j, RT.ak, RV.k);
      a(RV.j, RT.aF, RV.l);
      a(RV.j, RT.bm, RV.r);
      a(RV.k, RT.bm, RV.s);
      a(RV.r, RT.ak, RV.s);
      a(RV.o, RT.bm, RV.r);
      a(RV.p, RT.bm, RV.s);
      a(RV.e, RT.aK, RV.o);
      a(RV.o, RT.ak, RV.p);
      a(RV.o, RT.aF, RV.q);
      a(RV.e, Vq.a(new Vh(RT.aG, 1, Uo.PUFFERFISH.a())), RV.t);
      a(RV.t, RT.ak, RV.u);
      a(RV.e, RT.bs, RV.v);
      a(RV.v, RT.aF, RV.w);
      a(RV.v, RT.bm, RV.x);
      a(RV.w, RT.bm, RV.y);
      a(RV.x, RT.aF, RV.y);
      a(RV.z, RT.bm, RV.x);
      a(RV.A, RT.bm, RV.x);
      a(RV.B, RT.bm, RV.y);
      a(RV.e, RT.bl, RV.z);
      a(RV.z, RT.ak, RV.A);
      a(RV.z, RT.aF, RV.B);
      a(RV.e, RT.bg, RV.C);
      a(RV.C, RT.ak, RV.D);
      a(RV.C, RT.aF, RV.E);
      a(RV.e, RT.bn, RV.F);
      a(RV.F, RT.ak, RV.G);
      a(RV.F, RT.aF, RV.H);
      a(RV.b, RT.bm, RV.I);
      a(RV.I, RT.ak, RV.J);
   }

   private static void a(UN var0, SZ var1, UN var2) {
      b.add(new aad(var0, Vq.a(var1), var2));
   }

   private static void a(UN var0) {
      c.add(Vq.a(var0));
   }

   private static void a(aae var0, SZ var1, aae var2) {
      a(var0, Vq.a(var1), var2);
   }

   private static void a(aae var0, Vq var1, aae var2) {
      a.add(new aad(var0, var1, var2));
   }

   // $FF: synthetic method
   static List a() {
      return c;
   }
}
