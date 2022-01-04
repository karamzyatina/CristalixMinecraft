public final class rc extends nM {
   public static final sq a;
   public static final sp a;
   protected static final acU d;
   protected static final acU e;
   protected static final acU f;
   protected static final acU g;
   protected static final acU h;

   public rc() {
      super(si.q);
      this.a(this.a.a().a(a, abP.NORTH).a(a, Boolean.FALSE));
   }

   public String getLocalizedName() {
      return adM.a("tile.skull.skeleton.name");
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean i(sD var1) {
      return true;
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      return this.a().a(a, var10.b()).a(a, Boolean.FALSE);
   }

   public aaD a(aej var1, int var2) {
      return new abo();
   }

   public Vh a(aej var1, int var2, int var3, int var4, sD var5) {
      int var6 = 0;
      aaD var7 = var1.a(var2, var3, var4);
      if (var7 instanceof abo) {
         var6 = ((abo)var7).e();
      }

      return new Vh(RT.bG, 1, var6);
   }

   public void a(aej var1, acV var2, sD var3, Rn var4) {
      if (var4.a.d) {
         var3 = var3.a(a, Boolean.TRUE);
         var1.a((acV)var2, (sD)var3, 4);
      }

      super.a(var1, var2, var3, var4);
   }

   public sD a(int var1) {
      return this.a().a(a, abP.a(var1 & 7)).a(a, (var1 & 8) > 0);
   }

   public int c(sD var1) {
      byte var2 = 0;
      int var3 = var2 | ((abP)var1.a((so)a)).getIndex();
      if ((Boolean)var1.a((so)a)) {
         var3 |= 8;
      }

      return var3;
   }

   public sD a(sD var1, acE var2) {
      return var1.a(a, var2.a((abP)var1.a((so)a)));
   }

   public sD a(sD var1, act var2) {
      return var1.a((acE)var2.a((abP)var1.a((so)a)));
   }

   public sy a() {
      return new sy(this, new so[]{a, a});
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return su.UNDEFINED;
   }

   static {
      a = nQ.a;
      a = sp.a("nodrop");
      d = (new acU(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D)).a();
      e = (new acU(0.25D, 0.25D, 0.5D, 0.75D, 0.75D, 1.0D)).a();
      f = (new acU(0.25D, 0.25D, 0.0D, 0.75D, 0.75D, 0.5D)).a();
      g = (new acU(0.5D, 0.25D, 0.25D, 1.0D, 0.75D, 0.75D)).a();
      h = (new acU(0.0D, 0.25D, 0.25D, 0.5D, 0.75D, 0.75D)).a();
   }
}
