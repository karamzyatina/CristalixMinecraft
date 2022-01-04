import java.util.Random;
import org.lwjgl.util.glu.Project;

public class us extends uI {
   private static final Random a = new Random();
   private final float b;
   private final String a = "Welcome to the roots!";
   private float c;
   private static final Lg c = new Lg("textures/gui/title/minecraft.png");
   private static final acC d;
   private static final Lg d;
   private static final acC e;
   private static final Lg[] a;
   private static final acC[] a;
   private acC f;
   private int a;
   private int b;

   public us() {
      this.b = a.nextFloat();
   }

   public void c_() {
   }

   public boolean doesGuiPauseGame() {
      return false;
   }

   protected void keyTyped(char var1, int var2) {
   }

   public void b() {
      Hy var1 = new Hy(256, 256);
      this.f = this.a.a().a("background", var1);
      this.a = this.a.getStringWidth("Copyright Mojang AB. Do not distribute!");
      this.b = this.c - this.a - 2;
      int var2 = this.d / 4 + 48;
      this.a(var2);
      this.a.add(new tL(0, this.c / 2 - 100, var2 + 72 + 12, 98, 20, IK.a("menu.options")));
      this.a.add(new tL(4, this.c / 2 + 2, var2 + 72 + 12, 98, 20, IK.a("menu.quit")));
      this.a.add(new tN(5, this.c / 2 - 124, var2 + 72 + 12));
   }

   private void a(int var1) {
      this.a.add(new tL(2, this.c / 2 - 100, var1, IK.a("menu.multiplayer")));
   }

   public void a(tL var1) {
      if (var1.e == 0) {
         this.a.a((uI)(new uA(this, this.a.a)));
      }

      if (var1.e == 5) {
         this.a.a((uI)(new um(this, this.a.a, this.a.a())));
      }

      if (var1.e == 2) {
         this.a.a((uI)(new uw(this)));
      }

      if (var1.e == 4) {
         this.a.i();
      }

   }

   public void confirmClicked(boolean var1, int var2) {
      if (var2 == 12) {
         this.a.a((uI)this);
      } else if (var2 == 13) {
         this.a.a((uI)this);
      }

   }

   private void d() {
      Cw var1 = this.a.a;
      Bh var2 = var1.a();
      By.l(5889);
      By.C();
      By.B();
      Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
      By.l(5888);
      By.C();
      By.B();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.b(180.0F, 1.0F, 0.0F, 0.0F);
      By.b(90.0F, 0.0F, 0.0F, 1.0F);
      By.l();
      By.c();
      By.q();
      By.a(false);
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      byte var3 = 64;

      for(int var4 = 0; var4 < var3; ++var4) {
         By.C();
         float var5 = ((float)(var4 % 8) / 8.0F - 0.5F) / 64.0F;
         float var6 = ((float)(var4 / 8) / 8.0F - 0.5F) / 64.0F;
         float var7 = 0.0F;
         By.c(var5, var6, 0.0F);
         By.b(adh.a(this.c / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
         By.b(-this.c * 0.1F, 0.0F, 1.0F, 0.0F);

         for(int var8 = 0; var8 < 6; ++var8) {
            By.C();
            if (var8 == 1) {
               By.b(90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var8 == 2) {
               By.b(180.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var8 == 3) {
               By.b(-90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var8 == 4) {
               By.b(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var8 == 5) {
               By.b(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            this.a.a().a(a[var8]);
            var2.a(7, In.i);
            int var9 = 255 / (var4 + 1);
            var2.a(-1.0D, -1.0D, 1.0D).a(0.0D, 0.0D).a(255, 255, 255, var9).endVertex();
            var2.a(1.0D, -1.0D, 1.0D).a(1.0D, 0.0D).a(255, 255, 255, var9).endVertex();
            var2.a(1.0D, 1.0D, 1.0D).a(1.0D, 1.0D).a(255, 255, 255, var9).endVertex();
            var2.a(-1.0D, 1.0D, 1.0D).a(0.0D, 1.0D).a(255, 255, 255, var9).endVertex();
            var1.draw();
            By.D();
         }

         By.D();
         By.a(true, true, true, false);
      }

      var2.setTranslation(0.0D, 0.0D, 0.0D);
      By.a(true, true, true, true);
      By.l(5889);
      By.D();
      By.l(5888);
      By.D();
      By.a(true);
      By.p();
      By.j();
   }

   private void e() {
      this.a.a().a(this.f);
      By.b(3553, 10241, 9729);
      By.b(3553, 10240, 9729);
      By.a(3553, 0, 0, 0, 0, 0, 256, 256);
      By.l();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      By.a(true, true, true, false);
      Cw var1 = this.a.a;
      Bh var2 = var1.a();
      var2.a(7, In.i);
      By.c();
      byte var3 = 3;

      for(int var4 = 0; var4 < var3; ++var4) {
         float var5 = 1.0F / (float)(var4 + 1);
         int var6 = this.c;
         int var7 = this.d;
         float var8 = (float)(var4 - 1) / 256.0F;
         var2.a((double)var6, (double)var7, (double)this.a).a((double)(0.0F + var8), 1.0D).a(1.0F, 1.0F, 1.0F, var5).endVertex();
         var2.a((double)var6, 0.0D, (double)this.a).a((double)(1.0F + var8), 1.0D).a(1.0F, 1.0F, 1.0F, var5).endVertex();
         var2.a(0.0D, 0.0D, (double)this.a).a((double)(1.0F + var8), 0.0D).a(1.0F, 1.0F, 1.0F, var5).endVertex();
         var2.a(0.0D, (double)var7, (double)this.a).a((double)(0.0F + var8), 0.0D).a(1.0F, 1.0F, 1.0F, var5).endVertex();
      }

      var1.draw();
      By.d();
      By.a(true, true, true, true);
   }

   private void a(int var1, int var2, float var3) {
      this.a.a().unbindFramebuffer();
      By.b(0, 0, 256, 256);
      this.d();
      this.e();
      byte var4 = 3;

      for(int var5 = 0; var5 < var4; ++var5) {
         this.e();
         this.e();
      }

      this.a.a().bindFramebuffer(true);
      By.b(0, 0, this.a.a, this.a.b);
      float var12 = 120.0F / (float)(this.c > this.d ? this.c : this.d);
      float var6 = (float)this.d * var12 / 256.0F;
      float var7 = (float)this.c * var12 / 256.0F;
      int var8 = this.c;
      int var9 = this.d;
      Cw var10 = this.a.a;
      Bh var11 = var10.a();
      var11.a(7, In.i);
      var11.a(0.0D, (double)var9, (double)this.a).a((double)(0.5F - var6), (double)(0.5F + var7)).a(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var11.a((double)var8, (double)var9, (double)this.a).a((double)(0.5F - var6), (double)(0.5F - var7)).a(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var11.a((double)var8, 0.0D, (double)this.a).a((double)(0.5F + var6), (double)(0.5F - var7)).a(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var11.a(0.0D, 0.0D, (double)this.a).a((double)(0.5F + var6), (double)(0.5F + var7)).a(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var10.draw();
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.c += var3;
      By.c();
      this.a(var1, var2, var3);
      By.d();
      boolean var4 = true;
      int var5 = this.c / 2 - 137;
      boolean var6 = true;
      int var7 = -2130706433;
      int var8 = 16777215;
      byte var9 = 0;
      int var10 = Integer.MIN_VALUE;
      if (var7 != 0 || var8 != 0) {
         this.a(0, 0, this.c, this.d, var7, var8);
      }

      if (var9 != 0 || var10 != 0) {
         this.a(0, 0, this.c, this.d, var9, var10);
      }

      this.a.a().a(c);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      if ((double)this.b < 1.0E-4D) {
         this.b(var5, 30, 0, 0, 99, 44);
         this.b(var5 + 99, 30, 129, 0, 27, 44);
         this.b(var5 + 99 + 26, 30, 126, 0, 3, 44);
         this.b(var5 + 99 + 26 + 3, 30, 99, 0, 26, 44);
         this.b(var5 + 155, 30, 0, 45, 155, 44);
      } else {
         this.b(var5, 30, 0, 0, 155, 44);
         this.b(var5 + 155, 30, 0, 45, 155, 44);
      }

      this.a.a().a(d);
      this.a(var5 + 88, 67, 0.0F, 0.0F, 98, 14, 128.0F, 16.0F);
      By.C();
      By.c((float)(this.c / 2 + 90), 70.0F, 0.0F);
      By.b(-20.0F, 0.0F, 0.0F, 1.0F);
      float var11 = 1.8F - Math.abs(adh.a((float)(sE.a() % 1000L) / 1000.0F * 6.2831855F) * 0.1F);
      var11 = var11 * 100.0F / (float)(this.a.getStringWidth(this.a) + 32);
      By.b(var11, var11, var11);
      this.a(this.a, this.a, 0, -8, -256);
      By.D();
      String var12 = "Minecraft 1.12.2";
      this.b(this.a, var12, 2, this.d - 10, -1);
      this.b(this.a, "Copyright Mojang AB. Do not distribute!", this.b, this.d - 10, -1);
      if (var1 > this.b && var1 < this.b + this.a && var2 > this.d - 10 && var2 < this.d && Lv.f()) {
         a(this.b, this.d - 1, this.b + this.a, this.d, -1);
      }

      super.drawScreen(var1, var2, var3);
   }

   public void b_() {
   }

   static {
      d = c;
      d = new Lg("textures/gui/title/edition.png");
      e = d;
      a = new Lg[]{new Lg("textures/gui/title/background/panorama_0.png"), new Lg("textures/gui/title/background/panorama_1.png"), new Lg("textures/gui/title/background/panorama_2.png"), new Lg("textures/gui/title/background/panorama_3.png"), new Lg("textures/gui/title/background/panorama_4.png"), new Lg("textures/gui/title/background/panorama_5.png")};
      a = a;
   }
}
