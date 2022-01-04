public class aho extends ahn {
   public aho(sE var1) {
      super(var1, "end_crystal_no_base");
   }

   public wY a() {
      return new xp(this.a, false);
   }

   public String[] b() {
      String[] var1 = super.b();
      var1 = (String[])((String[])afT.b((Object[])var1, (Object)"base"));
      return var1;
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Ff var4 = (Ff)var3.a().get(Pg.class);
      if (!(var4 instanceof Fw)) {
         afT.b("Not an instance of RenderEnderCrystal: " + var4);
         return null;
      } else {
         Fw var5 = (Fw)var4;
         var5.b = var1;
         return var5;
      }
   }
}
