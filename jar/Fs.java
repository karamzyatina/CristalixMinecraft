public class Fs extends FU {
   private static final acC a = new acC("textures/entity/creeper/creeper.png");

   public Fs(Ga var1) {
      super(var1, new xl(var1.a), 0.5F);
      this.a((Hn)(new GY(this)));
   }

   protected void a(PK var1, float var2) {
      float var3 = var1.c(var2);
      float var4 = 1.0F + adh.a(var3 * 100.0F) * var3 * 0.01F;
      var3 = adh.a(var3, 0.0F, 1.0F);
      var3 *= var3;
      var3 *= var3;
      float var5 = (1.0F + var3 * 0.4F) * var4;
      float var6 = (1.0F + var3 * 0.1F) / var4;
      By.b(var5, var6, var5);
   }

   protected int a(PK var1, float var2, float var3) {
      float var4 = var1.c(var3);
      if ((int)(var4 * 10.0F) % 2 == 0) {
         return 0;
      } else {
         int var5 = (int)(var4 * 0.2F * 255.0F);
         var5 = adh.a(var5, 0, 255);
         return var5 << 24 | 822083583;
      }
   }

   protected acC a(PK var1) {
      return a;
   }
}
