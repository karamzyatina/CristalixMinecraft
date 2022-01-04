public final class Qj extends PS {
   private static final WB<Byte> m;

   public Qj(aej var1) {
      super(var1);
      this.setSize(0.7F, 1.9F);
   }

   protected void a_() {
      super.a_();
      this.a(Ot.a).a(4.0D);
      this.a(Ot.d).a(0.20000000298023224D);
   }

   protected void l() {
      super.l();
      this.a.a((WB)m, (byte)16);
   }

   public void b(VR var1) {
      super.b(var1);
      if (var1.hasKey("Pumpkin")) {
         this.c(var1.getBoolean("Pumpkin"));
      }

   }

   public void b() {
      super.b();
   }

   public float getEyeHeight() {
      return 1.7F;
   }

   protected boolean b(Rn var1, abU var2) {
      return super.b(var1, var2);
   }

   public boolean x() {
      return ((Byte)this.a.a(m) & 16) != 0;
   }

   public void c(boolean var1) {
      byte var2 = (Byte)this.a.a(m);
      if (var1) {
         this.a.b(m, (byte)(var2 | 16));
      } else {
         this.a.b(m, (byte)(var2 & -17));
      }

   }

   protected acJ c() {
      return RW.hq;
   }

   protected acJ a(abD var1) {
      return RW.hs;
   }

   protected acJ d() {
      return RW.hr;
   }

   static {
      m = WS.a(Qj.class, WD.a);
   }
}
