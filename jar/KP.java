class Kp implements KB {
   // $FF: synthetic field
   final Kn a;

   Kp(Kn var1) {
      this.a = var1;
   }

   public String a() {
      return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
