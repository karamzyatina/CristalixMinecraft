public final class PK extends PZ {
   private static final WB<Integer> m;
   private static final WB<Boolean> n;
   private static final WB<Boolean> o;
   private int i;
   private int j;
   private int k = 30;

   public PK(aej var1) {
      super(var1);
      this.setSize(0.6F, 1.7F);
   }

   protected void a_() {
      super.a_();
      this.a(Ot.d).a(0.25D);
   }

   public int b() {
      return this.a() == null ? 3 : 3 + (int)(this.getHealth() - 1.0F);
   }

   public void c(float var1, float var2) {
      super.c(var1, var2);
      this.j = (int)((float)this.j + var1 * 1.5F);
      if (this.j > this.k - 5) {
         this.j = this.k - 5;
      }

   }

   protected void l() {
      super.l();
      this.a.a((WB)m, (int)-1);
      this.a.a((WB)n, (Object)Boolean.FALSE);
      this.a.a((WB)o, (Object)Boolean.FALSE);
   }

   public void b(VR var1) {
      super.b(var1);
      this.a.b(n, var1.getBoolean("powered"));
      if (var1.a("Fuse", (int)99)) {
         this.k = var1.getShort("Fuse");
      }

      if (var1.getBoolean("ignited")) {
         this.c();
      }

   }

   public void a() {
      if (this.isEntityAlive()) {
         this.i = this.j;
         if (this.y()) {
            this.a(1);
         }

         int var1 = this.d();
         this.j += var1;
         if (this.j < 0) {
            this.j = 0;
         }

         if (this.j >= this.k) {
            this.j = this.k;
         }
      }

      super.a();
   }

   protected acJ a(abD var1) {
      return RW.ax;
   }

   protected acJ d() {
      return RW.aw;
   }

   public boolean x() {
      return (Boolean)this.a.a(n);
   }

   public float c(float var1) {
      return ((float)this.i + (float)(this.j - this.i) * var1) / (float)(this.k - 2);
   }

   public int d() {
      return (Integer)this.a.a(m);
   }

   public void a(int var1) {
      this.a.b(m, var1);
   }

   protected boolean b(Rn var1, abU var2) {
      Vh var3 = var1.a((abU)var2);
      if (var3.a() == RT.e) {
         this.a.a(var1, this.d, this.e, this.f, RW.bO, this.a(), 1.0F, this.a.nextFloat() * 0.4F + 0.8F);
         var1.a((abU)var2);
      }

      return super.b(var1, var2);
   }

   public boolean y() {
      return (Boolean)this.a.a(o);
   }

   public void c() {
      this.a.b(o, Boolean.TRUE);
   }

   static {
      m = WS.a(PK.class, WD.b);
      n = WS.a(PK.class, WD.h);
      o = WS.a(PK.class, WD.h);
   }
}
