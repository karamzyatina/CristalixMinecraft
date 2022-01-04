public abstract class rA extends re {
   public static final sp a = sp.a("seamless");
   public static final sr<rB> a;

   public rA() {
      super(si.e);
      sD var1 = this.a.a();
      if (this.f()) {
         var1 = var1.a(a, Boolean.FALSE);
      } else {
         var1 = var1.a(b, rf.BOTTOM);
      }

      this.a(var1.a(a, rB.STONE));
      this.a(KC.a);
   }

   public Vh a(aej var1, int var2, int var3, int var4, sD var5) {
      return new Vh(RQ.b, 1, ((rB)var5.a((so)a)).a());
   }

   public String a(int var1) {
      return super.getTranslationKey() + '.' + rB.a(var1).a();
   }

   public so<?> a() {
      return a;
   }

   public Comparable<?> a(Vh var1) {
      return rB.a(var1.getMetadata() & 7);
   }

   public void a(KC var1, acz<Vh> var2) {
      rB[] var3 = rB.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         rB var6 = var3[var5];
         if (var6 != rB.WOOD) {
            var2.add(new Vh(this, 1, var6.a()));
         }
      }

   }

   public sD a(int var1) {
      sD var2 = this.a().a(a, rB.a(var1 & 7));
      if (this.f()) {
         var2 = var2.a(a, (var1 & 8) != 0);
      } else {
         var2 = var2.a(b, (var1 & 8) == 0 ? rf.BOTTOM : rf.TOP);
      }

      return var2;
   }

   public int c(sD var1) {
      byte var2 = 0;
      int var3 = var2 | ((rB)var1.a((so)a)).a();
      if (this.f()) {
         if ((Boolean)var1.a((so)a)) {
            var3 |= 8;
         }
      } else if (var1.a((so)b) == rf.TOP) {
         var3 |= 8;
      }

      return var3;
   }

   public sy a() {
      return this.f() ? new sy(this, new so[]{a, a}) : new sy(this, new so[]{b, a});
   }

   public int d(sD var1) {
      return ((rB)var1.a((so)a)).a();
   }

   public sh a(sD var1, aec var2, acV var3) {
      return ((rB)var1.a((so)a)).a();
   }

   static {
      a = sr.a("variant", rB.class, (Enum[])rB.VALUES);
   }
}
