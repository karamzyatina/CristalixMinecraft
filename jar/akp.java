public class akP extends akO {
   public static final String[] a = new String[]{"default", "fast", "fancy", "off"};
   public static final String[] b = new String[]{"Default", "Fast", "Fancy", "OFF"};

   public akP(String var1, String var2, int var3) {
      super(var1, a, var2, b, var3);
   }

   public boolean a() {
      return this.a() == 0;
   }

   public boolean b() {
      return this.a() == 1;
   }

   public boolean c() {
      return this.a() == 2;
   }

   public boolean d() {
      return this.a() == 3;
   }

   public boolean a(String var1) {
      if ("none".equals(var1)) {
         var1 = "off";
      }

      return super.a(var1);
   }
}
