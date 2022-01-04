public final class Qp extends PZ {
   protected static final WB<Byte> m;
   private Of a;
   private boolean m;
   private int i;

   public Qp(aej var1) {
      super(var1);
      this.f = true;
      this.a = new Qq(this);
      this.setSize(0.4F, 0.8F);
      this.m = 3;
   }

   public void a(Oq var1, double var2, double var4, double var6) {
      super.a(var1, var2, var4, var6);
      this.s();
   }

   public void a() {
      this.f.a(true);
      super.a();
      this.f.a(false);
      this.setNoGravity(true);
      if (this.m && --this.i <= 0) {
         this.i = 20;
         this.a(abD.i, 1.0F);
      }

   }

   protected void a_() {
      super.a_();
      this.a((OC)Ot.a).a(14.0D);
      this.a((OC)Ot.f).a(4.0D);
   }

   protected void l() {
      super.l();
      this.a.a((WB)m, (byte)0);
   }

   public void b(VR var1) {
      super.b(var1);
      if (var1.hasKey("LifeTicks")) {
         this.a(var1.getInteger("LifeTicks"));
      }

   }

   public Of a() {
      return this.a;
   }

   private boolean b(int var1) {
      byte var2 = (Byte)this.a.a(m);
      return (var2 & var1) != 0;
   }

   private void b(int var1, boolean var2) {
      byte var3 = (Byte)this.a.a(m);
      int var4;
      if (var2) {
         var4 = var3 | var1;
      } else {
         var4 = var3 & ~var1;
      }

      this.a.b(m, (byte)(var4 & 255));
   }

   public boolean x() {
      return this.b(1);
   }

   public void c(boolean var1) {
      this.b(1, var1);
   }

   public void a(Of var1) {
      this.a = var1;
   }

   public void a(int var1) {
      this.m = true;
      this.i = var1;
   }

   protected acJ c() {
      return RW.ig;
   }

   protected acJ d() {
      return RW.ii;
   }

   protected acJ a(abD var1) {
      return RW.ij;
   }

   public int getBrightnessForRender() {
      return 15728880;
   }

   public float getBrightness() {
      return 1.0F;
   }

   protected void a(adW var1) {
      this.a(SB.MAINHAND, new Vh(RT.n));
      this.a(SB.MAINHAND, 0.0F);
   }

   static {
      m = WS.a(Qp.class, WD.a);
   }
}
