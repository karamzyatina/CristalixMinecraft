public class OU extends OT {
   private int a;
   private NU a;

   public OU(OG var1) {
      super(var1);
   }

   public void a() {
      ++this.a;
      if (this.a % 2 == 0 && this.a < 10) {
         adm var1 = this.a.c(1.0F).a();
         double var2 = this.a.a.d;
         double var4 = this.a.a.e + (double)(this.a.a.b.a() / 2.0F);
         double var6 = this.a.a.f;

         for(int var8 = 0; var8 < 8; ++var8) {
            double var9 = var2 + this.a.a().nextGaussian() / 2.0D;
            double var11 = var4 + this.a.a().nextGaussian() / 2.0D;
            double var13 = var6 + this.a.a().nextGaussian() / 2.0D;

            for(int var15 = 0; var15 < 6; ++var15) {
               this.a.a.a(abW.DRAGON_BREATH, var9, var11, var13, -var1.a * 0.07999999821186066D * (double)var15, -var1.b * 0.6000000238418579D, -var1.c * 0.07999999821186066D * (double)var15);
            }
         }
      }

   }

   public void b() {
      this.a = 0;
   }

   public void c() {
      if (this.a != null) {
         this.a.n();
         this.a = null;
      }

   }

   public OQ<OU> a() {
      return OQ.f;
   }
}
