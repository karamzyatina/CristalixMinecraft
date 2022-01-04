public abstract class ahA extends agV {
   public ahA(sE var1, Class var2, String var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xx)) {
         return null;
      } else {
         xx var3 = (xx)var1;
         if (var2.equals("head")) {
            return var3.a;
         } else if (var2.equals("body")) {
            return var3.c;
         } else if (var2.equals("arms")) {
            return var3.d;
         } else if (var2.equals("left_leg")) {
            return var3.f;
         } else if (var2.equals("right_leg")) {
            return var3.e;
         } else if (var2.equals("nose")) {
            return var3.g;
         } else if (var2.equals("left_arm")) {
            return var3.i;
         } else {
            return var2.equals("right_arm") ? var3.h : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head", "body", "arms", "right_leg", "left_leg", "nose", "right_arm", "left_arm"};
   }
}
