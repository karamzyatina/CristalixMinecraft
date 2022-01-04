public class amY extends amX {
   private final StringBuilder a = new StringBuilder();
   private boolean a;
   private boolean b;
   private int b;

   public amY() {
      super(589824);
   }

   public void a(String var1) {
      if (!this.a) {
         this.a = true;
         this.a.append('<');
      }

      this.a.append(var1);
      this.a.append(':');
   }

   public amX a() {
      return this;
   }

   public amX b() {
      this.a.append(':');
      return this;
   }

   public amX c() {
      this.c();
      return this;
   }

   public amX d() {
      return this;
   }

   public amX e() {
      this.c();
      if (!this.b) {
         this.b = true;
         this.a.append('(');
      }

      return this;
   }

   public amX f() {
      this.c();
      if (!this.b) {
         this.a.append('(');
      }

      this.a.append(')');
      return this;
   }

   public amX g() {
      this.a.append('^');
      return this;
   }

   public void a(char var1) {
      this.a.append(var1);
   }

   public void b(String var1) {
      this.a.append('T');
      this.a.append(var1);
      this.a.append(';');
   }

   public amX h() {
      this.a.append('[');
      return this;
   }

   public void c(String var1) {
      this.a.append('L');
      this.a.append(var1);
      this.b *= 2;
   }

   public void d(String var1) {
      this.d();
      this.a.append('.');
      this.a.append(var1);
      this.b *= 2;
   }

   public void a() {
      if (this.b % 2 == 0) {
         this.b |= 1;
         this.a.append('<');
      }

      this.a.append('*');
   }

   public amX a(char var1) {
      if (this.b % 2 == 0) {
         this.b |= 1;
         this.a.append('<');
      }

      if (var1 != '=') {
         this.a.append(var1);
      }

      return this;
   }

   public void b() {
      this.d();
      this.a.append(';');
   }

   public String toString() {
      return this.a.toString();
   }

   private void c() {
      if (this.a) {
         this.a = false;
         this.a.append('>');
      }

   }

   private void d() {
      if (this.b % 2 == 1) {
         this.a.append('>');
      }

      this.b /= 2;
   }
}
