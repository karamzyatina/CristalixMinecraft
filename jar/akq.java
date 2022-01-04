public class akQ extends akO {
   public static final String[] a = new String[]{"default", "true", "false"};
   public static final String[] b = new String[]{"Default", "ON", "OFF"};

   public akQ(String var1, String var2, int var3) {
      super(var1, a, var2, b, var3);
   }

   public String a() {
      if (this.a()) {
         return agt.e();
      } else if (this.b()) {
         return agt.a();
      } else {
         return this.c() ? agt.b() : super.a();
      }
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
}
