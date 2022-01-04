import java.util.Random;

class Rf implements Rb {
   public Vh a;
   public Rg a;

   public Rf(SZ var1, Rg var2) {
      this.a = new Vh(var1);
      this.a = var2;
   }

   public Rf(Vh var1, Rg var2) {
      this.a = var1;
      this.a = var2;
   }

   public void a(Oo var1, adP var2, Random var3) {
      int var4 = 1;
      if (this.a != null) {
         var4 = this.a.a(var3);
      }

      Vh var5;
      Vh var6;
      if (var4 < 0) {
         var5 = new Vh(RT.by);
         var6 = new Vh(this.a.a(), -var4, this.a.getMetadata());
      } else {
         var5 = new Vh(RT.by, var4, 0);
         var6 = new Vh(this.a.a(), 1, this.a.getMetadata());
      }

      var2.add(new adO(var5, var6));
   }
}
