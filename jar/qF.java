public final class QF extends Qy {
   public QF(aej var1) {
      super(var1);
   }

   protected acJ c() {
      super.c();
      return RW.aC;
   }

   protected acJ d() {
      super.d();
      return RW.aF;
   }

   protected acJ a(abD var1) {
      super.a(var1);
      return RW.aG;
   }

   public boolean a(QB var1) {
      if (var1 == this) {
         return false;
      } else if (!(var1 instanceof QF) && !(var1 instanceof QH)) {
         return false;
      } else {
         return this.G() && ((Qz)var1).G();
      }
   }
}
