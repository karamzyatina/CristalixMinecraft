public final class amI extends IndexOutOfBoundsException {
   private static final long a = 6807380416709738314L;
   private final String a;
   private final String b;
   private final String c;
   private final int a;

   public amI(String var1, String var2, String var3, int var4) {
      super("Method too large: " + var1 + "." + var2 + " " + var3);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.a = var4;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public int a() {
      return this.a;
   }
}
