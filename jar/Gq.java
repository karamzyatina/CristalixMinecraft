public class GQ extends Fm {
   private static final acC a = new acC("textures/entity/zombie/zombie.png");

   public GQ(Ga var1) {
      super(var1, new yg(var1.a), 0.5F);
      sE var2 = var1.a;
      GR var3 = new GR(this, this, var2);
      this.a((Hn)var3);
   }

   protected acC a(Qu var1) {
      return a;
   }
}
