public final class Ui extends SZ {
   public Ui() {
      this.a = 16;
      this.a(KC.e);
   }

   public abs<Vh> a(aej var1, Rn var2, abU var3) {
      Vh var4 = var2.a((abU)var3);
      if (!var2.a.d) {
         var4.shrink(1);
      }

      var2.b().a(this, 20);
      return new abs(abN.SUCCESS, var4);
   }
}
