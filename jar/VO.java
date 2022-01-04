import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class Vo {
   private static final Vo a = new Vo();
   private final Map<Vh, Vh> a = new HashMap();

   public static Vo a() {
      return a;
   }

   private Vo() {
      this.a((nh)RQ.j, new Vh(RT.l));
      this.a((nh)RQ.i, new Vh(RT.m));
      this.a((nh)RQ.I, new Vh(RT.k));
      this.a((nh)RQ.a, new Vh(RQ.o));
      this.a(RT.T, new Vh(RT.U));
      this.a(RT.aS, new Vh(RT.aT));
      this.a(RT.aU, new Vh(RT.aV));
      this.a(RT.aY, new Vh(RT.aZ));
      this.a(RT.aW, new Vh(RT.aX));
      this.a((nh)RQ.d, new Vh(RQ.b));
      this.a(new Vh(RQ.at, 1, ry.d), new Vh(RQ.at, 1, ry.f));
      this.a(RT.av, new Vh(RT.au));
      this.a((nh)RQ.ad, new Vh(RQ.bx));
      this.a((nh)RQ.a, new Vh(RT.aI, 1, SW.GREEN.b()));
      this.a((nh)RQ.l, new Vh(RT.j, 1, 1));
      this.a((nh)RQ.m, new Vh(RT.j, 1, 1));
      this.a((nh)RQ.aX, new Vh(RT.by));
      this.a(RT.bC, new Vh(RT.bD));
      this.a((nh)RQ.am, new Vh(RT.bO));
      this.a(new Vh(RQ.n, 1, 1), new Vh(RQ.n, 1, 0));
      this.a(RT.cq, new Vh(RT.cr));
      Uo[] var1 = Uo.values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Uo var4 = var1[var3];
         if (var4.a()) {
            this.a(new Vh(RT.aG, 1, var4.a()), new Vh(RT.aH, 1, var4.a()));
         }
      }

      this.a((nh)RQ.k, new Vh(RT.j));
      this.a((nh)RQ.V, new Vh(RT.ak));
      this.a((nh)RQ.p, new Vh(RT.aI, 1, SW.BLUE.b()));
      this.a((nh)RQ.bn, new Vh(RT.bP));
      this.a((SZ)RT.e, new Vh(RT.cx));
      this.a((SZ)RT.f, new Vh(RT.cx));
      this.a((SZ)RT.g, new Vh(RT.cx));
      this.a((SZ)RT.h, new Vh(RT.cx));
      this.a(RT.c, new Vh(RT.cx));
      this.a(RT.b, new Vh(RT.cx));
      this.a(RT.d, new Vh(RT.cx));
      this.a(RT.M, new Vh(RT.cx));
      this.a(RT.n, new Vh(RT.cx));
      this.a((SZ)RT.i, new Vh(RT.cx));
      this.a((SZ)RT.j, new Vh(RT.cx));
      this.a((SZ)RT.k, new Vh(RT.cx));
      this.a((SZ)RT.l, new Vh(RT.cx));
      this.a(RT.bS, new Vh(RT.cx));
      this.a(RT.F, new Vh(RT.bh));
      this.a(RT.E, new Vh(RT.bh));
      this.a(RT.G, new Vh(RT.bh));
      this.a(RT.O, new Vh(RT.bh));
      this.a(RT.D, new Vh(RT.bh));
      this.a((SZ)RT.q, new Vh(RT.bh));
      this.a((SZ)RT.r, new Vh(RT.bh));
      this.a((SZ)RT.s, new Vh(RT.bh));
      this.a((SZ)RT.t, new Vh(RT.bh));
      this.a(RT.bT, new Vh(RT.bh));
      this.a(new Vh(RQ.bs, 1, SW.WHITE.a()), new Vh(RQ.co));
      this.a(new Vh(RQ.bs, 1, SW.ORANGE.a()), new Vh(RQ.cp));
      this.a(new Vh(RQ.bs, 1, SW.MAGENTA.a()), new Vh(RQ.cq));
      this.a(new Vh(RQ.bs, 1, SW.LIGHT_BLUE.a()), new Vh(RQ.cr));
      this.a(new Vh(RQ.bs, 1, SW.YELLOW.a()), new Vh(RQ.cs));
      this.a(new Vh(RQ.bs, 1, SW.LIME.a()), new Vh(RQ.ct));
      this.a(new Vh(RQ.bs, 1, SW.PINK.a()), new Vh(RQ.cu));
      this.a(new Vh(RQ.bs, 1, SW.GRAY.a()), new Vh(RQ.cv));
      this.a(new Vh(RQ.bs, 1, SW.SILVER.a()), new Vh(RQ.cw));
      this.a(new Vh(RQ.bs, 1, SW.CYAN.a()), new Vh(RQ.cx));
      this.a(new Vh(RQ.bs, 1, SW.PURPLE.a()), new Vh(RQ.cy));
      this.a(new Vh(RQ.bs, 1, SW.BLUE.a()), new Vh(RQ.cz));
      this.a(new Vh(RQ.bs, 1, SW.BROWN.a()), new Vh(RQ.cA));
      this.a(new Vh(RQ.bs, 1, SW.GREEN.a()), new Vh(RQ.cB));
      this.a(new Vh(RQ.bs, 1, SW.RED.a()), new Vh(RQ.cC));
      this.a(new Vh(RQ.bs, 1, SW.BLACK.a()), new Vh(RQ.cD));
   }

   public void a(nh var1, Vh var2) {
      this.a(SZ.a(var1), var2);
   }

   public void a(SZ var1, Vh var2) {
      this.a(new Vh(var1, 1, 32767), var2);
   }

   public void a(Vh var1, Vh var2) {
      this.a.put(var1, var2);
   }

   public Vh a(Vh var1) {
      Iterator var2 = this.a.entrySet().iterator();

      Entry var3;
      do {
         if (!var2.hasNext()) {
            return Vh.a;
         }

         var3 = (Entry)var2.next();
      } while(!this.a(var1, (Vh)var3.getKey()));

      return (Vh)var3.getValue();
   }

   private boolean a(Vh var1, Vh var2) {
      return var2.a() == var1.a() && (var2.getMetadata() == 32767 || var2.getMetadata() == var1.getMetadata());
   }

   public Map<Vh, Vh> a() {
      return this.a;
   }
}
