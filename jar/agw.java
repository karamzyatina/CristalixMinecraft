public final class agW extends aha {
   public agW(sE var1) {
      super(var1, Pa.class, "armor_stand", 0.0F);
   }

   public wY a() {
      return new wV(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof wV)) {
         return null;
      } else {
         wV var3 = (wV)var1;
         if (var2.equals("right")) {
            return var3.a;
         } else if (var2.equals("left")) {
            return var3.b;
         } else if (var2.equals("waist")) {
            return var3.c;
         } else {
            return var2.equals("base") ? var3.d : super.a(var3, var2);
         }
      }
   }

   public String[] b() {
      String[] var1 = super.b();
      var1 = (String[])((String[])afT.a((Object[])var1, (Object[])(new String[]{"right", "left", "waist", "base"})));
      return var1;
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Fi var4 = new Fi(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
