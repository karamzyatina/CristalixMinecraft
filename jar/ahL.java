public class ahl extends agV {
   public ahl(sE var1) {
      super(var1, OG.class, "dragon", 0.5F);
   }

   public wY a() {
      return new xm(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xm)) {
         return null;
      } else {
         xm var3 = (xm)var1;
         if (var2.equals("head")) {
            return var3.a;
         } else if (var2.equals("spine")) {
            return var3.b;
         } else if (var2.equals("jaw")) {
            return var3.c;
         } else if (var2.equals("body")) {
            return var3.d;
         } else if (var2.equals("rear_leg")) {
            return var3.e;
         } else if (var2.equals("front_leg")) {
            return var3.f;
         } else if (var2.equals("rear_leg_tip")) {
            return var3.g;
         } else if (var2.equals("front_leg_tip")) {
            return var3.h;
         } else if (var2.equals("rear_foot")) {
            return var3.i;
         } else if (var2.equals("front_foot")) {
            return var3.j;
         } else if (var2.equals("wing")) {
            return var3.k;
         } else {
            return var2.equals("wing_tip") ? var3.l : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head", "spine", "jaw", "body", "rear_leg", "front_leg", "rear_leg_tip", "front_leg_tip", "rear_foot", "front_foot", "wing", "wing_tip"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Ft var4 = new Ft(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
