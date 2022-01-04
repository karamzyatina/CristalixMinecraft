import com.google.common.base.Splitter;
import org.lwjgl.input.Keyboard;

public class uw extends uI {
   private yI a;
   private final uI a;
   private vo a;
   private yv a;
   private tL b;
   private tL c;
   private tL d;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private String a;
   private yt a;
   private boolean f;

   public uw(uI var1) {
      this.a = var1;
   }

   public void b() {
      Keyboard.enableRepeatEvents(true);
      this.a = new yI();
      this.a.clear();
      if (this.f) {
         this.a.b(this.c, this.d, 32, this.d - 64);
      } else {
         this.f = true;
         this.a = new yv(this.a);
         this.a.a();
         this.a = new vo(this, this.a, this.c, this.d, 32, this.d - 64, 36);
         this.a.a(this.a);
      }

      this.d();
   }

   public void handleMouseInput() {
      super.handleMouseInput();
      this.a.c();
   }

   public void d() {
      this.b = this.a((tL)(new tL(7, this.c / 2 - 154, this.d - 28, 70, 20, IK.a("selectServer.edit"))));
      this.d = this.a((tL)(new tL(2, this.c / 2 - 74, this.d - 28, 70, 20, IK.a("selectServer.delete"))));
      this.c = this.a((tL)(new tL(1, this.c / 2 - 154, this.d - 52, 100, 20, IK.a("selectServer.select"))));
      this.a.add(new tL(4, this.c / 2 - 50, this.d - 52, 100, 20, IK.a("selectServer.direct")));
      this.a.add(new tL(3, this.c / 2 + 4 + 50, this.d - 52, 100, 20, IK.a("selectServer.add")));
      this.a.add(new tL(8, this.c / 2 + 4, this.d - 28, 70, 20, IK.a("selectServer.refresh")));
      this.a.add(new tL(0, this.c / 2 + 4 + 76, this.d - 28, 75, 20, IK.a("gui.cancel")));
      this.a(this.a.h());
   }

   public void c_() {
      super.c_();
      this.a.a();
   }

   public void b_() {
      Keyboard.enableRepeatEvents(false);
      this.a.b();
   }

   public void a(tL var1) {
      if (var1.a) {
         up var2 = this.a.h() < 0 ? null : this.a.a(this.a.h());
         if (var1.e == 2 && var2 instanceof vm) {
            String var9 = ((vm)var2).a().a;
            if (var9 != null) {
               this.b = true;
               String var4 = IK.a("selectServer.deleteQuestion");
               String var5 = '\'' + var9 + "' " + IK.a("selectServer.deleteWarning");
               String var6 = IK.a("selectServer.deleteButton");
               String var7 = IK.a("gui.cancel");
               ve var8 = new ve(this, var4, var5, var6, var7, this.a.h());
               this.a.a((uI)var8);
            }
         } else if (var1.e == 1) {
            this.e();
         } else if (var1.e == 4) {
            this.e = true;
            this.a = new yt(IK.a("selectServer.defaultName"), "", false);
            this.a.a((uI)(new uR(this, this.a)));
         } else if (var1.e == 3) {
            this.c = true;
            this.a = new yt(IK.a("selectServer.defaultName"), "", false);
            this.a.a((uI)(new uJ(this, this.a)));
         } else if (var1.e == 7 && var2 instanceof vm) {
            this.d = true;
            yt var3 = ((vm)var2).a();
            this.a = new yt(var3.a, var3.b, false);
            this.a.a(var3);
            this.a.a((uI)(new uJ(this, this.a)));
         } else if (var1.e == 0) {
            this.a.a(this.a);
         } else if (var1.e == 8) {
            this.f();
         }
      }

   }

   private void f() {
      this.a.a((uI)(new uw(this.a)));
   }

   public void confirmClicked(boolean var1, int var2) {
      up var3 = this.a.h() < 0 ? null : this.a.a(this.a.h());
      if (this.b) {
         this.b = false;
         if (var1 && var3 instanceof vm) {
            this.a.a(this.a.h());
            this.a.b();
            this.a.c(-1);
            this.a.a(this.a);
         }

         this.a.a((uI)this);
      } else if (this.e) {
         this.e = false;
         if (var1) {
            this.a(this.a);
         } else {
            this.a.a((uI)this);
         }
      } else if (this.c) {
         this.c = false;
         if (var1) {
            this.a.a(this.a);
            this.a.b();
            this.a.c(-1);
            this.a.a(this.a);
         }

         this.a.a((uI)this);
      } else if (this.d) {
         this.d = false;
         if (var1 && var3 instanceof vm) {
            yt var4 = ((vm)var3).a();
            var4.a = this.a.a;
            var4.b = this.a.b;
            var4.a(this.a);
            this.a.b();
            this.a.a(this.a);
         }

         this.a.a((uI)this);
      }

   }

   protected void keyTyped(char var1, int var2) {
      int var3 = this.a.h();
      up var4 = var3 < 0 ? null : this.a.a(var3);
      if (var2 == 63) {
         this.f();
      } else if (var3 >= 0) {
         if (var2 == 200) {
            if (b()) {
               if (var3 > 0 && var4 instanceof vm) {
                  this.a.a(var3, var3 - 1);
                  this.a(this.a.h() - 1);
                  this.a.a(-this.a.g());
                  this.a.a(this.a);
               }
            } else if (var3 > 0) {
               this.a(this.a.h() - 1);
               this.a.a(-this.a.g());
            } else {
               this.a(-1);
            }
         } else if (var2 == 208) {
            if (b()) {
               if (var3 < this.a.a() - 1) {
                  this.a.a(var3, var3 + 1);
                  this.a(var3 + 1);
                  this.a.a(this.a.g());
                  this.a.a(this.a);
               }
            } else if (var3 < this.a.a()) {
               this.a(this.a.h() + 1);
               this.a.a(this.a.g());
            } else {
               this.a(-1);
            }
         } else if (var2 != 28 && var2 != 156) {
            super.keyTyped(var1, var2);
         } else {
            this.a((tL)this.a.get(2));
         }
      } else {
         super.keyTyped(var1, var2);
      }

   }

   public void drawScreen(int var1, int var2, float var3) {
      this.a = null;
      this.drawDefaultBackground();
      this.a.a(var1, var2, var3);
      this.a(this.a, IK.a("multiplayer.title"), this.c / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
      if (this.a != null) {
         this.drawHoveringText(Splitter.on("\n").splitToList(this.a), var1, var2);
      }

   }

   public void e() {
      up var1 = this.a.h() < 0 ? null : this.a.a(this.a.h());
      if (var1 instanceof vm) {
         this.a(((vm)var1).a());
      }

   }

   private void a(yt var1) {
      this.a.d();
      this.a.a((uI)(new yp(this, this.a, var1)));
   }

   public void a(int var1) {
      this.a.c(var1);
      up var2 = var1 < 0 ? null : this.a.a(var1);
      this.c.a = false;
      this.b.a = false;
      this.d.a = false;
      if (var2 != null) {
         this.c.a = true;
         if (var2 instanceof vm) {
            this.b.a = true;
            this.d.a = true;
         }
      }

   }

   public yI a() {
      return this.a;
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.a.a(var1, var2, var3);
   }

   protected void mouseReleased(int var1, int var2, int var3) {
      super.mouseReleased(var1, var2, var3);
      this.a.b(var1, var2, var3);
   }

   public yv a() {
      return this.a;
   }

   public boolean a(vm var1, int var2) {
      return var2 > 0;
   }

   public boolean b(vm var1, int var2) {
      return var2 < this.a.a() - 1;
   }

   public void a(vm var1, int var2, boolean var3) {
      int var4 = var3 ? 0 : var2 - 1;
      this.a.a(var2, var4);
      if (this.a.h() == var2) {
         this.a(var4);
      }

      this.a.a(this.a);
   }

   public void b(vm var1, int var2, boolean var3) {
      int var4 = var3 ? this.a.a() - 1 : var2 + 1;
      this.a.a(var2, var4);
      if (this.a.h() == var2) {
         this.a(var4);
      }

      this.a.a(this.a);
   }
}
