public class Fm extends FU {
   private static final Lg a = new Lg("textures/entity/steve.png");
   private static final acC a;

   public Fm(Ga var1, xb var2, float var3) {
      super(var1, var2, var3);
      this.a((Hn)(new GZ(var1.a, var2.e)));
      this.a((Hn)(new Hb(this)));
      this.a((Hn)(new Hi(this)));
   }

   protected acC a(T var1) {
      return a;
   }

   public void a() {
      By.c(0.0F, 0.1875F, 0.0F);
   }

   static {
      a = a;
   }
}
