import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aax {
   protected static final Map<String, aau> a = new HashMap(1879, 1.0F);
   public static final List<aau> a = new ArrayList(1873);
   public static final List<aau> b = new ArrayList(50);
   public static final List<aaw> c = new ArrayList(209);
   public static final List<aaw> d = new ArrayList(192);
   private static final aau[] a = new aau[4096];
   private static final aau[] b = new aau[32000];
   private static final aau[] c = new aau[32000];
   private static final aau[] d = new aau[32000];
   private static final aau[] e = new aau[32000];
   private static final aau[] f = new aau[32000];

   public static aau a(nh var0) {
      return a[mY.a(var0)];
   }

   public static aau a(SZ var0) {
      return b[SZ.a(var0)];
   }

   public static aau b(SZ var0) {
      return c[SZ.a(var0)];
   }

   public static aau c(SZ var0) {
      return d[SZ.a(var0)];
   }

   public static aau d(SZ var0) {
      return e[SZ.a(var0)];
   }

   public static aau e(SZ var0) {
      return f[SZ.a(var0)];
   }

   public static void a() {
      c();
      d();
      e();
      b();
      f();
   }

   private static void b() {
      HashSet var0 = new HashSet(263, 1.0F);
      adq var1 = Vn.a;
      int var2 = var1.a();
      Iterator var3 = var1.iterator();

      while(var2-- > 0) {
         Vp var4 = (Vp)var3.next();
         Vh var5 = var4.a();
         if (!var5.isEmpty()) {
            var0.add(var4.a().a());
         }
      }

      Collection var12 = Vo.a().a().values();
      int var13 = var12.size();
      Iterator var6 = var12.iterator();

      while(var13-- > 0) {
         var0.add(((Vh)var6.next()).a());
      }

      int var7 = var0.size();
      Iterator var8 = var0.iterator();

      while(var7-- > 0) {
         SZ var9 = (SZ)var8.next();
         int var10 = SZ.a(var9);
         String var11 = a(var9);
         if (var11 != null) {
            b[var10] = (new aaw("stat.craftItem.", var11, new adE("stat.craftItem", new Object[]{(new Vh(var9)).a()}), var9)).a();
         }
      }

      a(b);
   }

   private static void c() {
      adr var0 = mY.a;
      int var1 = var0.a();
      Iterator var2 = var0.iterator();

      while(var1-- > 0) {
         nh var3 = (nh)var2.next();
         SZ var4 = SZ.a(var3);
         if (var4 != RT.a) {
            int var5 = mY.a(var3);
            String var6 = a(var4);
            if (var6 != null && var3.b()) {
               a[var5] = (new aaw("stat.mineBlock.", var6, new adE("stat.mineBlock", new Object[]{(new Vh(var3)).a()}), var4)).a();
               d.add((aaw)a[var5]);
            }
         }
      }

      a(a);
   }

   private static void d() {
      adq var0 = SZ.a;
      int var1 = var0.a();
      Iterator var2 = var0.iterator();

      while(var1-- > 0) {
         SZ var3 = (SZ)var2.next();
         if (var3 != null) {
            int var4 = SZ.a(var3);
            String var5 = a(var3);
            if (var5 != null) {
               c[var4] = (new aaw("stat.useItem.", var5, new adE("stat.useItem", new Object[]{(new Vh(var3)).a()}), var3)).a();
               if (!(var3 instanceof TH)) {
                  c.add((aaw)c[var4]);
               }
            }
         }
      }

      a(c);
   }

   private static void e() {
      adq var0 = SZ.a;
      int var1 = var0.a();
      Iterator var2 = var0.iterator();

      while(var1-- > 0) {
         SZ var3 = (SZ)var2.next();
         if (var3 != null) {
            int var4 = SZ.a(var3);
            String var5 = a(var3);
            if (var5 != null && var3.isDamageable()) {
               d[var4] = (new aaw("stat.breakItem.", var5, new adE("stat.breakItem", new Object[]{(new Vh(var3)).a()}), var3)).a();
            }
         }
      }

      a(d);
   }

   private static void f() {
      adq var0 = SZ.a;
      int var1 = var0.a();
      Iterator var2 = var0.iterator();

      while(var1-- > 0) {
         SZ var3 = (SZ)var2.next();
         if (var3 != null) {
            int var4 = SZ.a(var3);
            String var5 = a(var3);
            if (var5 != null) {
               e[var4] = (new aaw("stat.pickup.", var5, new adE("stat.pickup", new Object[]{(new Vh(var3)).a()}), var3)).a();
               f[var4] = (new aaw("stat.drop.", var5, new adE("stat.drop", new Object[]{(new Vh(var3)).a()}), var3)).a();
            }
         }
      }

      a(d);
   }

   private static String a(SZ var0) {
      acC var1 = var0.a();
      return var1 != null ? var1.toString().replace(':', '.') : null;
   }

   private static void a(aau[] var0) {
      a(var0, RQ.a, RQ.a);
      a(var0, RQ.b, RQ.b);
      a(var0, RQ.ap, RQ.al);
      a(var0, RQ.N, RQ.M);
      a(var0, RQ.W, RQ.V);
      a(var0, RQ.b, RQ.a);
      a(var0, RQ.b, RQ.a);
      a(var0, RQ.Y, RQ.X);
      a(var0, RQ.aU, RQ.aT);
      a(var0, RQ.a, RQ.b);
      a(var0, RQ.c, RQ.d);
      a(var0, RQ.e, RQ.f);
      a(var0, RQ.a, RQ.c);
      a(var0, RQ.L, RQ.c);
   }

   private static void a(aau[] var0, mY var1, mY var2) {
      int var3 = mY.a((nh)var1);
      int var4 = mY.a((nh)var2);
      if (var0[var3] != null && var0[var4] == null) {
         var0[var4] = var0[var3];
      } else {
         aau var5 = var0[var3];
         a.remove(var5);
         if (var5 instanceof aaw) {
            d.remove(var5);
         }

         b.remove(var5);
         var0[var3] = var0[var4];
      }

   }

   public static aau a(Oe var0) {
      String var1 = Oc.a(var0.a);
      return var1 == null ? null : (new aau("stat.killEntity." + var1, new adE("stat.entityKill", new Object[]{new adE("entity." + var1 + ".name", new Object[0])}))).a();
   }

   public static aau b(Oe var0) {
      String var1 = Oc.a(var0.a);
      return var1 == null ? null : (new aau("stat.entityKilledBy." + var1, new adE("stat.entityKilledBy", new Object[]{new adE("entity." + var1 + ".name", new Object[0])}))).a();
   }

   public static aau a(String var0) {
      return (aau)a.get(var0);
   }
}
