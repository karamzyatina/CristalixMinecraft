import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.lwjgl.input.Keyboard;

public class uE extends vO implements SD {
   private static final acC e = new acC("textures/gui/container/anvil.png");
   private final Sv a;
   private uZ a;
   private final Rs a;
   private final sE b;

   public uE(sE var1, tE var2, Rs var3, aej var4) {
      super(new Sv(var3, var4, var2));
      this.b = var1;
      this.a = var3;
      this.a = (Sv)this.a;
   }

   public void b() {
      super.b();
      Keyboard.enableRepeatEvents(true);
      int var1 = (this.c - this.b) / 2;
      int var2 = (this.d - this.e) / 2;
      this.a = new uZ(this.b, 0, this.a, var1 + 62, var2 + 24, 103, 12);
      this.a.b(-1);
      this.a.c(-1);
      this.a.a(false);
      this.a.a(35);
      this.a.b((SD)this);
      this.a.a((SD)this);
   }

   public void b_() {
      super.b_();
      Keyboard.enableRepeatEvents(false);
      this.a.b((SD)this);
   }

   protected void a(int var1, int var2) {
      By.f();
      By.k();
      this.a.a(IK.a("container.repair"), 60, 6, 4210752);
      if (this.a.b > 0) {
         int var3 = 8453920;
         boolean var4 = true;
         String var5 = IK.a("container.repair.cost", this.a.b);
         if (this.a.b >= 40 && !this.b.a.a.d) {
            var5 = IK.a("container.repair.expensive");
            var3 = 16736352;
         } else if (!this.a.a(2).a()) {
            var4 = false;
         } else if (!this.a.a(2).a(this.a.a)) {
            var3 = 16736352;
         }

         if (var4) {
            int var6 = -16777216 | (var3 & 16579836) >> 2 | var3 & -16777216;
            int var7 = this.b - 8 - this.a.getStringWidth(var5);
            boolean var8 = true;
            if (this.a.getUnicodeFlag()) {
               a(var7 - 3, 65, this.b - 7, 77, -16777216);
               a(var7 - 2, 66, this.b - 8, 76, -12895429);
            } else {
               this.a.a(var5, var7, 68, var6);
               this.a.a(var5, var7 + 1, 67, var6);
               this.a.a(var5, var7 + 1, 68, var6);
            }

            this.a.a(var5, var7, 67, var3);
         }
      }

      By.e();
   }

   protected void keyTyped(char var1, int var2) {
      if (this.a.textboxKeyTyped(var1, var2)) {
         this.d();
      } else {
         super.keyTyped(var1, var2);
      }

   }

   private void d() {
      String var1 = this.a.getText();
      SP var2 = this.a.a(0);
      if (var2 != null && var2.a() && !var2.a().hasDisplayName() && var1.equals(var2.a().getDisplayName())) {
         var1 = "";
      }

      this.a.a(var1);
      ByteBuf var3 = Unpooled.buffer(var1.length() * 4);
      NetUtil.writeUtf8(var1, var3);
      this.b.a.a.a((Ws)(new Xq("MC|ItemName", var3)));
   }

   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.a.mouseClicked(var1, var2, var3);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      super.drawScreen(var1, var2, var3);
      this.c(var1, var2);
      By.f();
      By.k();
      this.a.drawTextBox();
   }

   protected void a(float var1, int var2, int var3) {
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.a().c(e);
      int var4 = (this.c - this.b) / 2;
      int var5 = (this.d - this.e) / 2;
      this.b(var4, var5, 0, 0, this.b, this.e);
      this.b(var4 + 59, var5 + 20, 0, this.e + (this.a.a(0).a() ? 0 : 16), 110, 16);
      if ((this.a.a(0).a() || this.a.a(1).a()) && !this.a.a(2).a()) {
         this.b(var4 + 99, var5 + 45, this.b, 0, 28, 21);
      }

   }

   public void a(RY var1, acz<Vh> var2) {
      this.a(var1, 0, var1.a(0).a());
   }

   public void a(RY var1, int var2, Vh var3) {
      if (var2 == 0) {
         this.a.setText(var3.isEmpty() ? "" : var3.getDisplayName());
         this.a.setEnabled(!var3.isEmpty());
         if (!var3.isEmpty()) {
            this.d();
         }
      }

   }
}
