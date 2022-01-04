import dev.xdark.clientapi.gui.ChatOverlay;
import dev.xdark.clientapi.gui.TextField;
import dev.xdark.clientapi.gui.ingame.ChatScreen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class tP extends uI implements acg, ChatScreen {
   private String a = "";
   private int e = -1;
   private acL a;
   public uZ a;
   private String b = "";
   public ux a;
   private ChatOverlay a;
   anN a;
   int a;
   int b;

   public tP() {
   }

   public tP(String var1) {
      this.b = var1;
   }

   public void b() {
      this.a(new CallbackInfo("initGui", false));
      Keyboard.enableRepeatEvents(true);
      if (this.a == null) {
         this.a = this.a.a.a();
      }

      this.e = this.a.getSentMessages().size();
      uZ var1 = this.a;
      String var2 = var1 == null ? null : var1.getText();
      if (this.a == null) {
         this.a = new uZ(this.a, 0, this.a, 4, this.d - 12, this.c - 4, 12);
         this.a.a(256);
         this.a.a(false);
         this.a.setFocused(true);
         this.a.setText(var2 != null ? var2 : this.b);
         this.a.setCanLoseFocus(false);
      }

      this.a = new tQ(this.a, this.a, this.a);
   }

   public void b_() {
      Keyboard.enableRepeatEvents(false);
      this.a.resetScroll();
   }

   public void c_() {
      this.a.a();
   }

   protected void keyTyped(char var1, int var2) {
      CallbackInfo var4 = new CallbackInfo("keyTyped", true);
      this.a(var1, var2, var4);
      if (!var4.isCancelled()) {
         this.a.c();
         if (var2 == 15) {
            this.a.a();
         } else {
            this.a.b();
         }

         if (var2 == 1) {
            this.a.a((uI)null);
         } else if (var2 != 28 && var2 != 156) {
            if (var2 == 200) {
               this.a(-1);
            } else if (var2 == 208) {
               this.a(1);
            } else if (var2 == 201) {
               this.a.scroll(this.a.getLineCount() - 1);
            } else if (var2 == 209) {
               this.a.scroll(-this.a.getLineCount() + 1);
            } else {
               this.a.textboxKeyTyped(var1, var2);
            }
         } else {
            String var3 = this.a.getText().trim();
            if (!var3.isEmpty()) {
               this.c(var3);
            }

            if (this.a.a == this) {
               this.a.a((uI)null);
            }
         }

      }
   }

   public void handleMouseInput() {
      CallbackInfo var2 = new CallbackInfo("handleMouseInput", true);
      this.b(var2);
      if (!var2.isCancelled()) {
         super.handleMouseInput();
         int var1 = Lv.f();
         if (var1 != 0) {
            if (var1 > 1) {
               var1 = 1;
            }

            if (var1 < -1) {
               var1 = -1;
            }

            if (!b()) {
               var1 *= 7;
            }

            this.a.scroll(var1);
         }

      }
   }

   public void mouseClicked(int var1, int var2, int var3) {
      CallbackInfo var5 = new CallbackInfo("mouseClicked", true);
      this.a(var1, var2, var3, var5);
      if (!var5.isCancelled()) {
         if (var3 == 0) {
            adu var4 = this.a.a(Lv.g(), Lv.h());
            if (var4 != null && this.a((adu)var4)) {
               return;
            }
         }

         this.a.mouseClicked(var1, var2, var3);
         super.mouseClicked(var1, var2, var3);
      }
   }

   protected void setText(String var1, boolean var2) {
      if (var2) {
         this.a.setText(var1);
      } else {
         this.a.writeText(var1);
      }

   }

   public void a(int var1) {
      int var2 = this.e + var1;
      int var3 = this.a.getSentMessages().size();
      var2 = adh.a(var2, 0, var3);
      if (var2 != this.e) {
         if (var2 == var3) {
            this.e = var3;
            this.a.setText(this.a);
         } else {
            if (this.e == var3) {
               this.a = this.a.getText();
            }

            this.a.setText((String)this.a.getSentMessages().get(var2));
            this.e = var2;
         }
      }

   }

   public void drawScreen(int var1, int var2, float var3) {
      this.a(var1, var2, var3, new CallbackInfo("drawScreen", false));
      a(this.a(2), this.d - 14, this.c - this.b(2), this.d - 2, Integer.MIN_VALUE);
      this.a.drawTextBox();
      adu var4 = this.a.a(Lv.g(), Lv.h());
      if (var4 != null && var4.a().a() != null) {
         this.a(var4, var1, var2);
      }

      super.drawScreen(var1, var2, var3);
      this.b(var1, var2, var3, new CallbackInfo("drawScreen", false));
   }

   public boolean doesGuiPauseGame() {
      return false;
   }

   public void a(String... var1) {
      this.a.a(var1);
   }

   public TextField getInputField() {
      return (TextField)d.a(this.a);
   }

   public void setInputField(TextField var1) {
      this.a = (uZ)d.a(var1);
   }

   public ChatOverlay getChatOverlay() {
      ChatOverlay var1 = this.a;
      if (var1 != null) {
         return var1;
      } else {
         ux var2 = this.a;
         return var2.getClass() == ux.class ? (this.a = new hT((ChatOverlay)d.a(var2))) : (ChatOverlay)d.a(this.a);
      }
   }

   public void setChatOverlay(ChatOverlay var1) {
      var1 = a(var1);
      if (this.a != var1) {
         this.a = (ux)d.a(var1);
         this.a = null;
         this.e = -1;
      }

   }

   private static ChatOverlay a(ChatOverlay var0) {
      return var0 instanceof hT ? ((hT)var0).a() : var0;
   }

   public void a(CallbackInfo var1) {
      this.a = new anN(new aoP((float)this.c, (float)this.d));
   }

   public void a(int var1, int var2, float var3, CallbackInfo var4) {
      this.a = var1;
      this.b = var2;
      this.a.b();
      this.a.a(true, new aoO((float)var1, (float)var2));
      uZ var10000 = this.a;
      var10000.a = (int)((float)var10000.a + this.a.a());
      this.a.setWidth((int)((float)this.a.getRealWidth() - this.a.a() + this.a.b()));
   }

   public void b(int var1, int var2, float var3, CallbackInfo var4) {
      uZ var10000 = this.a;
      var10000.a = (int)((float)var10000.a - this.a.a());
      this.a.setWidth((int)((float)this.a.getRealWidth() + this.a.a() + this.a.b()));
   }

   public int a(int var1) {
      return var1 + (int)this.a.a();
   }

   public int b(int var1) {
      return var1 + (int)this.a.b();
   }

   protected void a(int var1, int var2, int var3, CallbackInfo var4) {
      aoG var5 = new aoG(var3);
      this.a.b();
      this.a.a(true, new aoO((float)var1, (float)var2), var5);
      if (var5.a) {
         var4.cancel();
      }

   }

   public void b(CallbackInfo var1) {
      int var2 = Mouse.getEventDWheel();
      if (var2 != 0) {
         if (var2 > 1) {
            var2 = 1;
         }

         if (var2 < -1) {
            var2 = -1;
         }

         aoJ var3 = new aoJ(var2);
         this.a.b();
         this.a.a(true, new aoO((float)this.a, (float)this.b), var3);
         if (var3.a) {
            var1.cancel();
         }
      }

   }

   protected void a(char var1, int var2, CallbackInfo var3) {
      aoI var4 = new aoI(var1, var2);
      this.a.b();
      this.a.a(true, new aoO((float)this.a, (float)this.b), var4);
      if (var4.a) {
         var3.cancel();
      } else if ((var2 == 1 || var2 == 28 || var2 == 156) && anF.a.a != null) {
         anF.a.a = null;
         var3.cancel();
      }

   }
}
