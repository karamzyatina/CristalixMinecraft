final class Ba extends Ec {
   // $FF: synthetic field
   final Ec a;

   Ba(Ec var1) {
      this.a = var1;
   }

   public Dv a(sD var1) {
      Dv var2 = var1.a();
      if (var2 == null) {
         var1.a(var2 = this.a.a(var1));
      }

      return var2;
   }
}
