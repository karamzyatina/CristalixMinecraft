import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;

public class uN extends uI {
   private static final Logger a;
   private static final acC d;

   public void b() {
      this.a.clear();
      this.a.add(new tL(1, this.c / 2 - 116, this.d / 2 + 62 + -16, 114, 20, IK.a("demo.help.buy")));
      this.a.add(new tL(2, this.c / 2 + 2, this.d / 2 + 62 + -16, 114, 20, IK.a("demo.help.later")));
   }

   public void a(tL var1) {
      switch(var1.e) {
      case 1:
         var1.a = false;

         try {
            Sys.openURL("https://www.minecraft.net/store?source=demo");
         } catch (Throwable var3) {
            a.error("Couldn't open link", var3);
         }
         break;
      case 2:
         this.a.a((uI)null);
         this.a.setIngameFocus();
      }

   }

   public void drawDefaultBackground() {
      super.drawDefaultBackground();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.a().c(d);
      int var1 = (this.c - 248) / 2;
      int var2 = (this.d - 166) / 2;
      this.b(var1, var2, 0, 0, 248, 166);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      int var4 = (this.c - 248) / 2 + 10;
      int var5 = (this.d - 166) / 2 + 8;
      this.a.a(IK.a("demo.help.title"), var4, var5, 2039583);
      var5 += 12;
      JI var6 = this.a.a;
      this.a.a(IK.a("demo.help.movementShort", JI.a(var6.a.getKeyCode()), JI.a(var6.b.getKeyCode()), JI.a(var6.c.getKeyCode()), JI.a(var6.d.getKeyCode())), var4, var5, 5197647);
      this.a.a(IK.a("demo.help.movementMouse"), var4, var5 + 12, 5197647);
      this.a.a(IK.a("demo.help.jump", JI.a(var6.e.getKeyCode())), var4, var5 + 24, 5197647);
      this.a.a(IK.a("demo.help.inventory", JI.a(var6.h.getKeyCode())), var4, var5 + 36, 5197647);
      this.a.drawSplitString(IK.a("demo.help.fullWrapped"), var4, var5 + 68, 218, 2039583);
      super.drawScreen(var1, var2, var3);
   }

   static {
      a = sE.a;
      d = new acC("textures/gui/demo_background.png");
   }
}
