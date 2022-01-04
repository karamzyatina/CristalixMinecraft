public class vl extends uI {
   private static final JL[] a;
   private final uI a;
   private final JI a;
   private String a;
   private final sE b;

   public vl(sE var1, uI var2, JI var3) {
      this.b = var1;
      this.a = var2;
      this.a = var3;
   }

   public void b() {
      this.a = IK.a("options.chat.title");
      int var1 = 0;
      JL[] var2 = a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         JL var5 = var2[var4];
         if (var5.a()) {
            this.a.add(new uz(this.b.a, var5.a(), this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), var5));
         } else {
            uy var6 = new uy(var5.a(), this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), var5, this.a.a(var5));
            this.a.add(var6);
         }

         ++var1;
      }

      this.a.add(new tL(200, this.c / 2 - 100, this.d / 6 + 144, IK.a("gui.done")));
   }

   protected void keyTyped(char var1, int var2) {
      if (var2 == 1) {
         this.b.a.b();
      }

      super.keyTyped(var1, var2);
   }

   public void a(tL var1) {
      if (var1.a) {
         if (var1.e < 100 && var1 instanceof uy) {
            this.a.a((JL)((uy)var1).a(), 1);
            var1.a = this.a.a(JL.a(var1.e));
         }

         if (var1.e == 200) {
            this.b.a.b();
            this.b.a(this.a);
         }
      }

   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.a(this.a, this.a, this.c / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   static {
      a = new JL[]{JL.CHAT_VISIBILITY, JL.CHAT_COLOR, JL.CHAT_LINKS, JL.CHAT_OPACITY, JL.CHAT_LINKS_PROMPT, JL.CHAT_SCALE, JL.CHAT_HEIGHT_FOCUSED, JL.CHAT_HEIGHT_UNFOCUSED, JL.CHAT_WIDTH, JL.REDUCED_DEBUG_INFO, JL.CHAT_LINES};
   }
}
