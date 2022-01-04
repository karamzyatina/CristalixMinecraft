public final class ajU {
   private boolean a;
   private int a;
   private int b;
   private int c;
   private int d;

   public ajU() {
      this(false, 1, 0);
   }

   public ajU(boolean var1) {
      this(var1, 1, 0);
   }

   public ajU(boolean var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public ajU(boolean var1, int var2, int var3) {
      this(var1, var2, var3, var2, var3);
   }

   public void a(boolean var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public void a(ajU var1) {
      this.a = var1.a;
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public void a() {
      this.a = true;
   }

   public void b() {
      this.a = false;
   }

   public void a(int var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = var1;
      this.d = var2;
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public boolean a() {
      return this.a;
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public boolean b() {
      return this.a != this.c || this.b != this.d;
   }

   public String toString() {
      return "enabled: " + this.a + ", src: " + this.a + ", dst: " + this.b + ", srcAlpha: " + this.c + ", dstAlpha: " + this.d;
   }
}
