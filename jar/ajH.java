public class ajh extends uI implements vf {
   private final uI a;
   protected String a;
   private static final JL[] a;
   private final ajm a = new ajm(this, new ajp());

   public ajh(uI var1) {
      this.a = var1;
   }

   public void b() {
      this.a = IK.a("of.options.otherTitle");
      this.a.clear();

      for(int var1 = 0; var1 < a.length; ++var1) {
         JL var2 = a[var1];
         int var3 = this.c / 2 - 155 + var1 % 2 * 160;
         int var4 = this.d / 6 + 21 * (var1 / 2) - 12;
         if (!var2.a()) {
            this.a.add(new ajf(var2.a(), var3, var4, var2, this.a.a.a(var2)));
         } else {
            this.a.add(new ajg(this.a.a, var2.a(), var3, var4, var2));
         }
      }

      this.a.add(new tL(210, this.c / 2 - 100, this.d / 6 + 168 + 11 - 44, IK.a("of.options.other.reset")));
      this.a.add(new tL(200, this.c / 2 - 100, this.d / 6 + 168 + 11, IK.a("gui.done")));
   }

   public void a(tL var1) {
      if (var1.a) {
         if (var1.e < 200 && var1 instanceof uy) {
            this.a.a.a((JL)((uy)var1).a(), 1);
            var1.a = this.a.a.a(JL.a(var1.e));
            this.a.a.b();
         }

         if (var1.e == 200) {
            this.a.a.b();
            this.a.a(this.a);
         }

         if (var1.e == 210) {
            this.a.a.b();
            ve var2 = new ve(this, IK.a("of.message.other.reset"), "", 9999);
            this.a.a((uI)var2);
         }
      }

   }

   protected void keyTyped(char var1, int var2) {
      if (var2 == 1) {
         this.a.a.b();
      }

      super.keyTyped(var1, var2);
   }

   public void confirmClicked(boolean var1, int var2) {
      if (var1) {
         this.a.a.f();
      }

      this.a.a((uI)this);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.a(this.a, this.a, this.c / 2, 15, 16777215);
      super.drawScreen(var1, var2, var3);
      this.a.a(var1, var2, this.a);
   }

   static {
      a = new JL[]{JL.SHOW_FPS, JL.ADVANCED_TOOLTIPS, JL.WEATHER, JL.TIME, JL.USE_FULLSCREEN, JL.FULLSCREEN_MODE, JL.SCREENSHOT_SIZE, JL.SHOW_GL_ERRORS};
   }
}
