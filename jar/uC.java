public class uc extends uI {
   private final String a;
   private final String b;

   public uc(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void b() {
      super.b();
      this.a.add(new tL(0, this.c / 2 - 100, 140, IK.a("gui.cancel")));
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.a(0, 0, this.c, this.d, -12574688, -11530224);
      this.a(this.a, this.a, this.c / 2, 90, 16777215);
      this.a(this.a, this.b, this.c / 2, 110, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   protected void keyTyped(char var1, int var2) {
   }

   public void a(tL var1) {
      this.a.a((uI)null);
   }
}
