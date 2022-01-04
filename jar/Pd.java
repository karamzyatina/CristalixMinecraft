public final class pD extends pk {
   public static final sr<pQ> b;

   public pD() {
      this.a(this.a.a().a(b, pQ.OAK).a(a, pm.Y));
   }

   public sh a(sD var1, aec var2, acV var3) {
      // $FF: Couldn't be decompiled
   }

   public void a(KC var1, acz<Vh> var2) {
      var2.add(new Vh(this, 1, pQ.OAK.a()));
      var2.add(new Vh(this, 1, pQ.SPRUCE.a()));
      var2.add(new Vh(this, 1, pQ.BIRCH.a()));
      var2.add(new Vh(this, 1, pQ.JUNGLE.a()));
   }

   public sD a(int var1) {
      sD var2 = this.a().a(b, pQ.a((var1 & 3) % 4));
      switch(var1 & 12) {
      case 0:
         var2 = var2.a(a, pm.Y);
         break;
      case 4:
         var2 = var2.a(a, pm.X);
         break;
      case 8:
         var2 = var2.a(a, pm.Z);
         break;
      default:
         var2 = var2.a(a, pm.NONE);
      }

      return var2;
   }

   public int c(sD var1) {
      // $FF: Couldn't be decompiled
   }

   public sy a() {
      return new sy(this, new so[]{b, a});
   }

   protected Vh a(sD var1) {
      return new Vh(SZ.a((nh)this), 1, ((pQ)var1.a((so)b)).a());
   }

   public int d(sD var1) {
      return ((pQ)var1.a((so)b)).a();
   }

   static {
      b = sr.a("variant", pQ.class, (Enum[])pQ.OLD);
   }
}
