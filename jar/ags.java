import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class agS {
   private final Map<String, agV> a;

   public agS(sE var1) {
      this.a = this.a(var1);
   }

   private Map<String, agV> a(sE var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      this.a(var2, new agW(var1));
      this.a(var2, new agY(var1));
      this.a(var2, new ahb(var1));
      this.a(var2, new ahc(var1));
      this.a(var2, new ahe(var1));
      this.a(var2, new ahh(var1));
      this.a(var2, new ahi(var1));
      this.a(var2, new ahj(var1));
      this.a(var2, new ahl(var1));
      this.a(var2, new ahk(var1));
      this.a(var2, new ahn(var1));
      this.a(var2, new aho(var1));
      this.a(var2, new ahp(var1));
      this.a(var2, new ahq(var1));
      this.a(var2, new ahr(var1));
      this.a(var2, new ahs(var1));
      this.a(var2, new aht(var1));
      this.a(var2, new ahu(var1));
      this.a(var2, new ahy(var1));
      this.a(var2, new ahz(var1));
      this.a(var2, new ahB(var1));
      this.a(var2, new ahC(var1));
      this.a(var2, new ahD(var1));
      this.a(var2, new ahE(var1));
      this.a(var2, new ahF(var1));
      this.a(var2, new ahH(var1));
      this.a(var2, new ahG(var1));
      this.a(var2, new ahI(var1));
      this.a(var2, new ahJ(var1));
      this.a(var2, new ahK(var1));
      this.a(var2, new ahL(var1));
      this.a(var2, new ahM(var1));
      this.a(var2, new ahN(var1));
      this.a(var2, new ahO(var1));
      this.a(var2, new ahQ(var1));
      this.a(var2, new ahR(var1));
      this.a(var2, new ahT(var1));
      this.a(var2, new ahV(var1));
      this.a(var2, new ahX(var1));
      this.a(var2, new ahY(var1));
      this.a(var2, new ahZ(var1));
      this.a(var2, new aia(var1));
      this.a(var2, new aib(var1));
      this.a(var2, new aic(var1));
      this.a(var2, new aid(var1));
      this.a(var2, new aie(var1));
      this.a(var2, new aif(var1));
      this.a(var2, new aig(var1));
      this.a(var2, new aih(var1));
      this.a(var2, new aii(var1));
      this.a(var2, new aij(var1));
      this.a(var2, new aik(var1));
      this.a(var2, new ail(var1));
      this.a(var2, new aim(var1));
      this.a(var2, new ain(var1));
      this.a(var2, new aio(var1));
      this.a(var2, new aip(var1));
      this.a(var2, new ahS(var1));
      this.a(var2, new agX(var1));
      this.a(var2, new agZ(var1));
      this.a(var2, new ahd(var1));
      this.a(var2, new ahf(var1));
      this.a(var2, new ahg(var1));
      this.a(var2, new ahm(var1));
      this.a(var2, new ahv(var1));
      this.a(var2, new ahw(var1));
      this.a(var2, new ahx(var1));
      this.a(var2, new ahU(var1));
      this.a(var2, new ahW(var1));
      return var2;
   }

   private void a(Map<String, agV> var1, agV var2) {
      a(var1, var2, var2.a());
      String[] var3 = var2.a();
      if (var3 != null) {
         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            a(var1, var2, var5);
         }
      }

      wY var9 = var2.a();
      String[] var10 = var2.b();

      for(int var6 = 0; var6 < var10.length; ++var6) {
         String var7 = var10[var6];
         xN var8 = var2.a(var9, var7);
         if (var8 == null) {
            afT.b("Model renderer not found, model: " + var2.a() + ", name: " + var7);
         }
      }

   }

   private static void a(Map<String, agV> var0, agV var1, String var2) {
      if (var0.containsKey(var2)) {
         afT.b("Model adapter already registered for id: " + var2 + ", class: " + var1.a().getName());
      }

      var0.put(var2, var1);
   }

   public agV a(String var1) {
      return (agV)this.a.get(var1);
   }

   public String[] a() {
      Set var1 = this.a.keySet();
      String[] var2 = (String[])((String[])var1.toArray(new String[0]));
      return var2;
   }
}
