import java.util.Collection;

public final class rl extends np implements Lj {
   public static final sr<SW> a;

   public rl(si var1) {
      super(var1, false);
      this.a(this.a.a().a(a, SW.WHITE));
      this.a(KC.a);
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

   public abu a() {
      return abu.TRANSLUCENT;
   }

   public boolean h(sD var1) {
      return false;
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

   protected boolean f() {
      return true;
   }

   static {
      a = sr.a("color", SW.class, (Collection)SW.SET);
   }
}
