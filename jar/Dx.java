public final class DX extends Ec {
   public static final DX a = new DX();

   private DX() {
   }

   public Dv a(sD var1) {
      Dv var2 = var1.a();
      if (var2 == null) {
         var2 = new Dv(var1.a().a(), a(var1.getProperties()));
         var1.a(var2);
      }

      return var2;
   }
}
