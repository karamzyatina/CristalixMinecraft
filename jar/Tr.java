import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.lwjgl.input.Keyboard;

public class tR extends uI implements acg {
   private uZ a;
   private uZ b;
   private final aaO a;
   private tL b;
   private tL c;
   private tL d;
   private tL e;
   private tL f;
   private tL g;
   private boolean b;
   private aaQ a;
   private acL a;
   private boolean c;
   private boolean d;
   private final sE b;

   public tR(sE var1, aaO var2) {
      this.a = aaQ.REDSTONE;
      this.b = var1;
      this.a = var2;
   }

   public void c_() {
      this.a.a();
   }

   public void b() {
      aaA var1 = this.a.a();
      Keyboard.enableRepeatEvents(true);
      this.a.clear();
      this.b = this.a((tL)(new tL(0, this.c / 2 - 4 - 150, this.d / 4 + 120 + 12, 150, 20, IK.a("gui.done"))));
      this.c = this.a((tL)(new tL(1, this.c / 2 + 4, this.d / 4 + 120 + 12, 150, 20, IK.a("gui.cancel"))));
      this.d = this.a((tL)(new tL(4, this.c / 2 + 150 - 20, 135, 20, 20, "O")));
      this.e = this.a((tL)(new tL(5, this.c / 2 - 50 - 100 - 4, 165, 100, 20, IK.a("advMode.mode.sequence"))));
      this.f = this.a((tL)(new tL(6, this.c / 2 - 50, 165, 100, 20, IK.a("advMode.mode.unconditional"))));
      this.g = this.a((tL)(new tL(7, this.c / 2 + 50 + 4, 165, 100, 20, IK.a("advMode.mode.redstoneTriggered"))));
      this.a = new uZ(this.b, 2, this.a, this.c / 2 - 150, 50, 300, 20);
      this.a.a(32500);
      this.a.setFocused(true);
      this.b = new uZ(this.b, 3, this.a, this.c / 2 - 150, 135, 276, 20);
      this.b.a(32500);
      this.b.setEnabled(false);
      this.b.setText("-");
      this.b.a = false;
      this.d.a = false;
      this.e.a = false;
      this.f.a = false;
      this.g.a = false;
      this.a = new tS(this, this.b, this.a, true, var1);
   }

   public void d() {
      aaA var1 = this.a.a();
      this.a.setText(var1.a());
      this.b = var1.a();
      this.a = this.a.a();
      this.c = this.a.h();
      this.d = this.a.d();
      this.e();
      this.f();
      this.h();
      this.i();
      this.b.a = true;
      this.d.a = true;
      this.e.a = true;
      this.f.a = true;
      this.g.a = true;
   }

   public void b_() {
      Keyboard.enableRepeatEvents(false);
   }

   public void a(tL var1) {
      if (var1.a) {
         aaA var2 = this.a.a();
         if (var1.e == 1) {
            var2.a(this.b);
            this.b.a((uI)null);
         } else if (var1.e == 0) {
            ByteBuf var3 = Unpooled.buffer();
            var2.a(var3);
            NetUtil.writeUtf8(this.a.getText(), var3);
            var3.writeBoolean(var2.a());
            NetUtil.writeUtf8(this.a.name(), var3);
            var3.writeBoolean(this.c);
            var3.writeBoolean(this.d);
            this.b.a().a((Ws)(new Xq("MC|AutoCmd", var3)));
            if (!var2.a()) {
               var2.b((adu)null);
            }

            this.b.a((uI)null);
         } else if (var1.e == 4) {
            var2.a(!var2.a());
            this.e();
         } else if (var1.e == 5) {
            this.g();
            this.f();
         } else if (var1.e == 6) {
            this.c = !this.c;
            this.h();
         } else if (var1.e == 7) {
            this.d = !this.d;
            this.i();
         }
      }

   }

   protected void keyTyped(char var1, int var2) {
      this.a.c();
      if (var2 == 15) {
         this.a.a();
      } else {
         this.a.b();
      }

      this.a.textboxKeyTyped(var1, var2);
      this.b.textboxKeyTyped(var1, var2);
      if (var2 != 28 && var2 != 156) {
         if (var2 == 1) {
            this.a(this.c);
         }
      } else {
         this.a(this.b);
      }

   }

   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.a.mouseClicked(var1, var2, var3);
      this.b.mouseClicked(var1, var2, var3);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.a(this.a, IK.a("advMode.setCommand"), this.c / 2, 20, 16777215);
      this.b(this.a, IK.a("advMode.command"), this.c / 2 - 150, 40, 10526880);
      this.a.drawTextBox();
      byte var4 = 75;
      byte var5 = 0;
      tI var10001 = this.a;
      String var10002 = IK.a("advMode.nearestPlayer");
      int var10003 = this.c / 2 - 140;
      int var7 = var5 + 1;
      this.b(var10001, var10002, var10003, var4 + var5 * this.a.a, 10526880);
      this.b(this.a, IK.a("advMode.randomPlayer"), this.c / 2 - 140, var4 + var7++ * this.a.a, 10526880);
      this.b(this.a, IK.a("advMode.allPlayers"), this.c / 2 - 140, var4 + var7++ * this.a.a, 10526880);
      this.b(this.a, IK.a("advMode.allEntities"), this.c / 2 - 140, var4 + var7++ * this.a.a, 10526880);
      this.b(this.a, IK.a("advMode.self"), this.c / 2 - 140, var4 + var7++ * this.a.a, 10526880);
      if (!this.b.getText().isEmpty()) {
         int var6 = var4 + var7 * this.a.a + 1;
         this.b(this.a, IK.a("advMode.previousOutput"), this.c / 2 - 150, var6 + 4, 10526880);
         this.b.drawTextBox();
      }

      super.drawScreen(var1, var2, var3);
   }

   private void e() {
      aaA var1 = this.a.a();
      if (var1.a()) {
         this.d.a = "O";
         if (var1.b() != null) {
            this.b.setText(var1.b().getUnformattedText());
         }
      } else {
         this.d.a = "X";
         this.b.setText("-");
      }

   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   private void g() {
      // $FF: Couldn't be decompiled
   }

   private void h() {
      if (this.c) {
         this.f.a = IK.a("advMode.mode.conditional");
      } else {
         this.f.a = IK.a("advMode.mode.unconditional");
      }

   }

   private void i() {
      if (this.d) {
         this.g.a = IK.a("advMode.mode.autoexec.bat");
      } else {
         this.g.a = IK.a("advMode.mode.redstoneTriggered");
      }

   }

   public void a(String... var1) {
      this.a.a(var1);
   }
}
