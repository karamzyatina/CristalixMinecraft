public final class afN {
   private static CV a = null;

   public static void a(AU var0) {
      a = var0.a(RQ.aa.a());
   }

   public static CV a() {
      return a;
   }

   public static sD a() {
      return RQ.aa.a();
   }

   public static boolean a(aec var0, sD var1, acV var2) {
      nh var3 = var1.a();
      return a(var3, var1) && a(var0, var2);
   }

   private static boolean a(aec var0, acV var1) {
      mY var2 = RQ.aa;
      return (var0.a(var1.c()).a() == var2 || var0.a(var1.d()).a() == var2 || var0.a(var1.e()).a() == var2 || var0.a(var1.f()).a() == var2) && var0.a(var1.b()).isOpaqueCube();
   }

   private static boolean a(nh var0, sD var1) {
      if (var1.isFullCube()) {
         return false;
      } else if (var1.isOpaqueCube()) {
         return false;
      } else if (var0 instanceof rh) {
         return false;
      } else if (var0 instanceof nr && (var0 instanceof nY || var0 instanceof ow || var0 instanceof pq || var0 instanceof qO || var0 instanceof rH)) {
         return true;
      } else if (!(var0 instanceof os) && !(var0 instanceof ou) && !(var0 instanceof oB) && !(var0 instanceof pH) && !(var0 instanceof qH) && !(var0 instanceof rV)) {
         if (var0 instanceof qD && var1.a((so)rJ.a) == abP.UP) {
            return true;
         } else if (!(var0 instanceof pf)) {
            return false;
         } else {
            Comparable var2 = var1.a((so)pf.a);
            return var2 == ph.UP_X || var2 == ph.UP_Z;
         }
      } else {
         return true;
      }
   }
}
