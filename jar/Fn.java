public class FN extends FU {
   private static final acC a = new acC("textures/entity/illager/illusionist.png");

   public FN(Ga var1) {
      super(var1, new xx(var1.a, 0.0F, 0.0F, 64, 64), 0.5F);
      this.a((Hn)(new FO(this, this)));
      ((xx)this.a()).b.b = true;
   }

   protected acC a(PZ var1) {
      return a;
   }

   protected void a(PZ var1, float var2) {
      float var3 = 0.9375F;
      By.b(0.9375F, 0.9375F, 0.9375F);
   }

   public void a(PZ var1, double var2, double var4, double var6, float var8, float var9) {
      if (var1.isInvisible()) {
         adm[] var10 = ((PW)var1).a(var9);
         float var11 = this.a((Oh)var1, var9);

         for(int var12 = 0; var12 < var10.length; ++var12) {
            super.a((Of)var1, var2 + var10[var12].a + (double)adh.b((float)var12 + var11 * 0.5F) * 0.025D, var4 + var10[var12].b + (double)adh.b((float)var12 + var11 * 0.75F) * 0.0125D, var6 + var10[var12].c + (double)adh.b((float)var12 + var11 * 0.7F) * 0.025D, var8, var9);
         }
      } else {
         super.a((Of)var1, var2, var4, var6, var8, var9);
      }

   }

   public void a(PZ var1, double var2, double var4, double var6) {
      super.a(var1, var2, var4, var6);
   }

   protected boolean a(PZ var1) {
      return true;
   }

   // $FF: synthetic method
   protected boolean b(Oh var1) {
      return this.a((PZ)var1);
   }
}
