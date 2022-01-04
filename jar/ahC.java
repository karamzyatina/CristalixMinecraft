public class ahc extends agV {
   public ahc(sE var1) {
      super(var1, Pc.class, "boat", 0.5F);
   }

   public wY a() {
      return new xf(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xf)) {
         return null;
      } else {
         xf var3 = (xf)var1;
         if (var2.equals("bottom")) {
            return var3.a[0];
         } else if (var2.equals("back")) {
            return var3.a[1];
         } else if (var2.equals("front")) {
            return var3.a[2];
         } else if (var2.equals("right")) {
            return var3.a[3];
         } else if (var2.equals("left")) {
            return var3.a[4];
         } else if (var2.equals("paddle_left")) {
            return var3.b[0];
         } else if (var2.equals("paddle_right")) {
            return var3.b[1];
         } else {
            return var2.equals("bottom_no_water") ? var3.a : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"bottom", "back", "front", "right", "left", "paddle_left", "paddle_right", "bottom_no_water"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Fo var4 = new Fo(var3);
      var4.a = var1;
      return var4;
   }
}
