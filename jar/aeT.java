public final class aet {
   public static final aet[] a = new aet[16];
   public static final aet a = new aet(0, "default", 1);
   public static final aet b = new aet(1, "flat");
   public static final aet c = new aet(2, "largeBiomes");
   public static final aet d = new aet(3, "amplified");
   public static final aet e = new aet(4, "customized");
   public static final aet f = new aet(5, "debug_all_block_states");
   public static final aet g = new aet(8, "default_1_1", 0);
   private final int a;
   private final String a;
   private final int b;

   private aet(int var1, String var2) {
      this(var1, var2, 0);
   }

   private aet(int var1, String var2, int var3) {
      this.a = var2;
      this.b = var3;
      this.a = var1;
      a[var1] = this;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return "generator." + this.a;
   }

   public int a() {
      return this.b;
   }

   public static aet a(String var0) {
      aet[] var1 = a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         aet var4 = var1[var3];
         if (var4 != null && var4.a.equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }

   public int b() {
      return this.a;
   }
}
