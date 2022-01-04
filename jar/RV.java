public final class rv extends nr implements sd {
   public static final st a;
   public static final sq a;
   private final nh a;
   protected static final acU[] a;

   public rv(nh var1) {
      this.a(this.a.a().a(a, acm.a(0)).a(a, abP.UP));
      this.a = var1;
      this.a(true);
      this.a((KC)null);
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      return a[(Integer)var1.a((so)a)];
   }

   public sD a(sD var1, aec var2, int var3, int var4, int var5) {
      int var6 = (Integer)var1.a((so)a);
      var1 = var1.a(a, abP.UP);
      abP[] var7 = abT.HORIZONTAL.a();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         abP var10 = var7[var9];
         if (var2.a(var3 + var10.getXOffset(), var4 + var10.getYOffset(), var5 + var10.getZOffset()).a() == this.a && var6 == 7) {
            var1 = var1.a(a, var10);
            break;
         }
      }

      return var1;
   }

   protected boolean m(sD var1) {
      return var1.a() == RQ.L;
   }

   protected SZ a() {
      if (this.a == RQ.al) {
         return RT.aQ;
      } else {
         return this.a == RQ.ay ? RT.aR : null;
      }
   }

   public Vh a(aej var1, int var2, int var3, int var4, sD var5) {
      SZ var6 = this.a();
      return var6 == null ? Vh.a : new Vh(var6);
   }

   public boolean a(aej var1, acV var2, sD var3, boolean var4) {
      return (Integer)var3.a((so)a) != 7;
   }

   public sD a(int var1) {
      return this.a().a(a, acm.a(var1));
   }

   public int c(sD var1) {
      return (Integer)var1.a((so)a);
   }

   public sy a() {
      return new sy(this, new so[]{a, a});
   }

   static {
      a = st.a("age", Lq.b);
      a = rJ.a;
      a = new acU[]{(new acU(0.375D, 0.0D, 0.375D, 0.625D, 0.125D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 0.375D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 0.5D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 0.625D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 0.75D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 0.875D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D)).a()};
   }
}
