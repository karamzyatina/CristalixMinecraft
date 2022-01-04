import java.util.Collection;

public final class nL extends op {
   public static final sr<SW> a;

   public nL() {
      super(si.p);
      this.a(this.a.a().a(a, SW.WHITE));
      this.a(KC.a);
   }

   public void a(aej var1, acV var2, sD var3, sD var4) {
      if (var4.a().isLiquid()) {
         var1.a((acV)var2, (sD)RQ.cE.a().a(nI.a, var3.a((so)a)), 3);
      }

   }

   public int d(sD var1) {
      return ((SW)var1.a((so)a)).a();
   }

   public void a(KC var1, acz<Vh> var2) {
      SW[] var3 = SW.VALUES;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         SW var6 = var3[var5];
         var2.add(new Vh(this, 1, var6.a()));
      }

   }

   public sh a(sD var1, aec var2, acV var3) {
      return sh.a((SW)var1.a((so)a));
   }

   public sD a(int var1) {
      return this.a().a(a, SW.b(var1));
   }

   public int c(sD var1) {
      return ((SW)var1.a((so)a)).a();
   }

   public sy a() {
      return new sy(this, a);
   }

   static {
      a = sr.a("color", SW.class, (Collection)SW.SET);
   }
}
