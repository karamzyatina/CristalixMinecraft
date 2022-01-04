public class wd extends vO {
   private static final acC e = new acC("textures/gui/container/shulker_box.png");
   public final SE a;
   private final Rs a;

   public wd(tE var1, Rs var2, SE var3) {
      super(new Sz(var2, var3, var1));
      this.a = var2;
      this.a = var3;
      ++this.e;
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      super.drawScreen(var1, var2, var3);
      this.c(var1, var2);
   }

   protected void a(int var1, int var2) {
      this.a.a(this.a.a().getUnformattedText(), 8, 6, 4210752);
      this.a.a(this.a.a().getUnformattedText(), 8, this.e - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.a().c(e);
      int var4 = (this.c - this.b) / 2;
      int var5 = (this.d - this.e) / 2;
      this.b(var4, var5, 0, 0, this.b, this.e);
   }
}
