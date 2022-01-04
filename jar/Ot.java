public abstract class OT extends OJ {
   public OT(OG var1) {
      super(var1);
   }

   public boolean a() {
      return true;
   }

   public float a(Or var1, abD var2, float var3) {
      if (var2.a() instanceof Rv) {
         var2.a().setFire(1);
         return 0.0F;
      } else {
         return super.a(var1, var2, var3);
      }
   }
}
