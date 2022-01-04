public class ut extends uI {
   public void b() {
      this.a.clear();
      this.a.add(new uy(0, this.c / 2 - 155, this.d / 4 + 120 + 12, IK.a("gui.toTitle")));
      this.a.add(new uy(1, this.c / 2 - 155 + 160, this.d / 4 + 120 + 12, IK.a("menu.quit")));
   }

   public void a(tL var1) {
      if (var1.e == 0) {
         this.a.a(this.a.a());
      } else if (var1.e == 1) {
         this.a.i();
      }

   }

   protected void keyTyped(char var1, int var2) {
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.a(this.a, "Out of memory!", this.c / 2, this.d / 4 - 60 + 20, 16777215);
      this.b(this.a, "Minecraft has run out of memory.", this.c / 2 - 140, this.d / 4 - 60 + 60, 10526880);
      this.b(this.a, "This could be caused by a bug in the game or by the", this.c / 2 - 140, this.d / 4 - 60 + 60 + 18, 10526880);
      this.b(this.a, "Java Virtual Machine not being allocated enough", this.c / 2 - 140, this.d / 4 - 60 + 60 + 27, 10526880);
      this.b(this.a, "memory.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 36, 10526880);
      this.b(this.a, "To prevent level corruption, the current game has quit.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 54, 10526880);
      this.b(this.a, "We've tried to free up enough memory to let you go back to", this.c / 2 - 140, this.d / 4 - 60 + 60 + 63, 10526880);
      this.b(this.a, "the main menu and back to playing, but this may not have worked.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 72, 10526880);
      this.b(this.a, "Please restart the game if you see this message again.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 81, 10526880);
      super.drawScreen(var1, var2, var3);
   }
}
