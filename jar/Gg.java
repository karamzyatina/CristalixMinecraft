public class GG extends Fm {
   private static final acC a = new acC("textures/entity/illager/vex.png");
   private static final acC b = new acC("textures/entity/illager/vex_charging.png");
   private int a;

   public GG(Ga var1) {
      super(var1, new yb(var1.a), 0.3F);
      this.a = ((yb)this.a).a();
   }

   protected acC a(Qp var1) {
      return var1.x() ? b : a;
   }

   public void a(Qp var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((yb)this.a).a();
      if (var10 != this.a) {
         this.a = new yb(this.a.a);
         this.a = var10;
      }

      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(Qp var1, float var2) {
      By.b(0.4F, 0.4F, 0.4F);
   }
}
