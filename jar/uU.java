import java.util.List;

public final class UU extends SZ {
   public UU() {
      this.a = 1;
      this.a((KC)KC.i);
      this.c(336);
      this.a(new acC("blocking"), new UV(this));
   }

   public String c(Vh var1) {
      if (var1.b("BlockEntityTag") != null) {
         SW var2 = aaH.a(var1);
         return adM.a("item.shield." + var2.b() + ".name");
      } else {
         return adM.a("item.shield.name");
      }
   }

   public void a(Vh var1, aej var2, List<String> var3, JY var4) {
      TF.a(var1, var3);
   }

   public SV a(Vh var1) {
      return SV.BLOCK;
   }

   public int a(Vh var1) {
      return 72000;
   }

   public abs<Vh> a(aej var1, Rn var2, abU var3) {
      Vh var4 = var2.a((abU)var3);
      var2.b((abU)var3);
      return new abs(abN.SUCCESS, var4);
   }

   public boolean a(Vh var1, Vh var2) {
      return var2.a() == SZ.a((nh)RQ.e) || super.a(var1, var2);
   }
}
