import dev.xdark.clientapi.gui.ingame.InventoryCreativeScreen;
import dev.xdark.feder.RecyclableArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.lwjgl.input.Keyboard;

public class vP extends Cd implements InventoryCreativeScreen {
   private static final acC e = new acC("textures/gui/container/creative_inventory/tabs.png");
   private static final SH a = new SH("tmp", true, 45);
   private static int a;
   private float b;
   private boolean d;
   private boolean e;
   private uZ a;
   private List<SP> c;
   private SP a;
   private boolean f;
   private vG a;

   public vP(Rn var1) {
      super(new vQ(var1));
      var1.b = this.a;
      this.a = true;
      this.e = 136;
      this.b = 195;
   }

   public void c_() {
      if (!this.a.a.d()) {
         this.a.a((uI)(new wb(this.a.a)));
      }

   }

   protected void a(SP var1, int var2, int var3, RX var4) {
      this.f = true;
      boolean var5 = var4 == RX.QUICK_MOVE;
      var4 = var2 == -999 && var4 == RX.PICKUP ? RX.THROW : var4;
      Vh var7;
      Rs var10;
      if (var1 == null && a != KC.m.getIndex() && var4 != RX.QUICK_CRAFT) {
         var10 = this.a.a.a;
         if (!var10.b().isEmpty()) {
            if (var3 == 0) {
               this.a.a.a((Vh)var10.b(), true);
               this.a.a.a(var10.b());
               var10.c(Vh.a);
            }

            if (var3 == 1) {
               var7 = var10.b().a(1);
               this.a.a.a((Vh)var7, true);
               this.a.a.a(var7);
            }
         }
      } else {
         if (var1 != null && !var1.a((Rn)this.a.a)) {
            return;
         }

         if (var1 == this.a && var5) {
            for(int var11 = 0; var11 < this.a.a.a.a().size(); ++var11) {
               this.a.a.a(Vh.a, var11);
            }
         } else {
            Vh var6;
            if (a == KC.m.getIndex()) {
               if (var1 == this.a) {
                  this.a.a.a.c(Vh.a);
               } else if (var4 == RX.THROW && var1 != null && var1.a()) {
                  var6 = var1.a(var3 == 0 ? 1 : var1.a().a());
                  var7 = var1.a();
                  this.a.a.a((Vh)var6, true);
                  this.a.a.a(var6);
                  this.a.a.a(var7, vR.a((vR)var1).a);
               } else if (var4 == RX.THROW && !this.a.a.a.b().isEmpty()) {
                  this.a.a.a((Vh)this.a.a.a.b(), true);
                  this.a.a.a(this.a.a.a.b());
                  this.a.a.a.c(Vh.a);
               } else {
                  this.a.a.a.a(var1 == null ? var2 : vR.a((vR)var1).a, var3, var4, this.a.a);
                  this.a.a.a.a();
               }
            } else {
               Vh var9;
               if (var4 != RX.QUICK_CRAFT && var1.a == a) {
                  var10 = this.a.a.a;
                  var7 = var10.b();
                  Vh var13 = var1.a();
                  if (var4 == RX.SWAP) {
                     if (!var13.isEmpty() && var3 >= 0 && var3 < 9) {
                        var9 = var13.a();
                        var9.setCount(var9.a());
                        this.a.a.a.a(var3, var9);
                        this.a.a.a.a();
                     }

                     return;
                  }

                  if (var4 == RX.CLONE) {
                     if (var10.b().isEmpty() && var1.a()) {
                        var9 = var1.a().a();
                        var9.setCount(var9.a());
                        var10.c(var9);
                     }

                     return;
                  }

                  if (var4 == RX.THROW) {
                     if (!var13.isEmpty()) {
                        var9 = var13.a();
                        var9.setCount(var3 == 0 ? 1 : var9.a());
                        this.a.a.a((Vh)var9, true);
                        this.a.a.a(var9);
                     }

                     return;
                  }

                  if (!var7.isEmpty() && !var13.isEmpty() && var7.a(var13) && Vh.a(var7, var13)) {
                     if (var3 == 0) {
                        if (var5) {
                           var7.setCount(var7.a());
                        } else if (var7.getCount() < var7.a()) {
                           var7.grow(1);
                        }
                     } else {
                        var7.shrink(1);
                     }
                  } else if (!var13.isEmpty() && var7.isEmpty()) {
                     var10.c(var13.a());
                     var7 = var10.b();
                     if (var5) {
                        var7.setCount(var7.a());
                     }
                  } else if (var3 == 0) {
                     var10.c(Vh.a);
                  } else {
                     var10.b().shrink(1);
                  }
               } else if (this.a != null) {
                  var6 = var1 == null ? Vh.a : this.a.a(var1.a).a();
                  this.a.a(var1 == null ? var2 : var1.a, var3, var4, this.a.a);
                  if (RY.b(var3) == 2) {
                     for(int var12 = 0; var12 < 9; ++var12) {
                        this.a.a.a(this.a.a(45 + var12).a(), 36 + var12);
                     }
                  } else if (var1 != null) {
                     var7 = this.a.a(var1.a).a();
                     this.a.a.a(var7, var1.a - this.a.a.size() + 9 + 36);
                     int var8 = 45 + var3;
                     if (var4 == RX.SWAP) {
                        this.a.a.a(var6, var8 - this.a.a.size() + 9 + 36);
                     } else if (var4 == RX.THROW && !var6.isEmpty()) {
                        var9 = var6.a();
                        var9.setCount(var3 == 0 ? 1 : var9.a());
                        this.a.a.a((Vh)var9, true);
                        this.a.a.a(var9);
                     }

                     this.a.a.a.a();
                  }
               }
            }
         }
      }

   }

   protected void d_() {
      int var1 = this.f;
      super.d_();
      if (this.a != null && this.f != var1) {
         this.a.a = this.f + 82;
      }

   }

   public void b() {
      if (this.a.a.d()) {
         super.b();
         this.a.clear();
         Keyboard.enableRepeatEvents(true);
         this.a = new uZ(this.a, 0, this.a, this.f + 82, this.g + 6, 80, this.a.a);
         this.a.a(50);
         this.a.a(false);
         this.a.setVisible(false);
         this.a.b(16777215);
         int var1 = a;
         a = -1;
         this.b(KC.a[var1]);
         this.a = new vG(this.a);
         this.a.a.a.a((SD)this.a);
      } else {
         this.a.a((uI)(new wb(this.a.a)));
      }

   }

   public void b_() {
      super.b_();
      if (this.a.a != null && this.a.a.a != null) {
         this.a.a.a.b((SD)this.a);
      }

      Keyboard.enableRepeatEvents(false);
   }

   protected void keyTyped(char var1, int var2) {
      if (a != KC.f.getIndex()) {
         if (JI.a(this.a.a.n)) {
            this.b(KC.f);
         } else {
            super.keyTyped(var1, var2);
         }
      } else {
         if (this.f) {
            this.f = false;
            this.a.setText("");
         }

         if (!this.e(var2)) {
            if (this.a.textboxKeyTyped(var1, var2)) {
               this.f();
            } else {
               super.keyTyped(var1, var2);
            }
         }
      }

   }

   private void f() {
      vQ var1 = (vQ)this.a;
      var1.a.clear();
      if (this.a.getText().isEmpty()) {
         Iterator var2 = SZ.a.iterator();

         while(var2.hasNext()) {
            SZ var3 = (SZ)var2.next();
            var3.a(KC.f, var1.a);
         }
      } else {
         var1.a.addAll(this.a.a(Kj.a).a(this.a.getText().toLowerCase(Locale.ROOT)));
      }

      this.b = 0.0F;
      var1.a(0.0F);
   }

   protected void a(int var1, int var2) {
      KC var3 = KC.a[a];
      if (var3.drawInForegroundOfTab()) {
         By.k();
         this.a.a(IK.a(var3.getTranslationKey()), 8, 6, 4210752);
      }

   }

   public void mouseClicked(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.f;
         int var5 = var2 - this.g;
         KC[] var6 = KC.a;
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            KC var9 = var6[var8];
            if (this.a(var9, var4, var5)) {
               return;
            }
         }
      }

      super.mouseClicked(var1, var2, var3);
   }

   protected void mouseReleased(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.f;
         int var5 = var2 - this.g;
         KC[] var6 = KC.a;
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            KC var9 = var6[var8];
            if (this.a(var9, var4, var5)) {
               this.b(var9);
               return;
            }
         }
      }

      super.mouseReleased(var1, var2, var3);
   }

   private boolean d() {
      return a != KC.m.getIndex() && KC.a[a].hasScrollbar() && ((vQ)this.a).a();
   }

   private void b(KC var1) {
      int var2 = a;
      a = var1.getIndex();
      vQ var3 = (vQ)this.a;
      this.a.clear();
      var3.a.clear();
      if (var1 == KC.l) {
         for(int var4 = 0; var4 < 9; ++var4) {
            JM var5 = this.a.a.a(var4);
            if (var5.isEmpty()) {
               for(int var6 = 0; var6 < 9; ++var6) {
                  if (var6 == var4) {
                     Vh var7 = new Vh(RT.ax);
                     var7.a("CustomCreativeLock");
                     String var8 = JI.a(this.a.a.a[var4].getKeyCode());
                     String var9 = JI.a(this.a.a.w.getKeyCode());
                     var7.b((new adE("inventory.hotbarInfo", new Object[]{var9, var8})).getUnformattedText());
                     var3.a.add(var7);
                  } else {
                     var3.a.add(Vh.a);
                  }
               }
            } else {
               var3.a.addAll(var5);
            }
         }
      } else if (var1 != KC.f) {
         var1.a(var3.a);
      }

      if (var1 == KC.m) {
         RY var10 = this.a.a.a;
         if (this.c == null) {
            this.c = var3.a;
         }

         var3.a = new ArrayList();

         for(int var11 = 0; var11 < var10.a.size(); ++var11) {
            vR var12 = new vR((SP)var10.a.get(var11), var11);
            var3.a.add(var12);
            int var13;
            int var14;
            int var15;
            if (var11 >= 5 && var11 < 9) {
               var13 = var11 - 5;
               var14 = var13 / 2;
               var15 = var13 % 2;
               var12.b = 54 + var14 * 54;
               var12.c = 6 + var15 * 27;
            } else if (var11 >= 0 && var11 < 5) {
               var12.b = -2000;
               var12.c = -2000;
            } else if (var11 == 45) {
               var12.b = 35;
               var12.c = 20;
            } else if (var11 < var10.a.size()) {
               var13 = var11 - 9;
               var14 = var13 % 9;
               var15 = var13 / 9;
               var12.b = 9 + var14 * 18;
               if (var11 >= 36) {
                  var12.c = 112;
               } else {
                  var12.c = 54 + var15 * 18;
               }
            }
         }

         this.a = new SP(a, 0, 173, 112);
         var3.a.add(this.a);
      } else if (var2 == KC.m.getIndex()) {
         var3.a = this.c;
         this.c = null;
      }

      if (this.a != null) {
         if (var1 == KC.f) {
            this.a.setVisible(true);
            this.a.setCanLoseFocus(false);
            this.a.setFocused(true);
            this.a.setText("");
            this.f();
         } else {
            this.a.setVisible(false);
            this.a.setCanLoseFocus(true);
            this.a.setFocused(false);
         }
      }

      this.b = 0.0F;
      var3.a(0.0F);
   }

   public void handleMouseInput() {
      super.handleMouseInput();
      int var1 = Lv.f();
      if (var1 != 0 && this.d()) {
         int var2 = (((vQ)this.a).a.size() + 9 - 1) / 9 - 5;
         if (var1 > 0) {
            var1 = 1;
         }

         if (var1 < 0) {
            var1 = -1;
         }

         this.b = (float)((double)this.b - (double)var1 / (double)var2);
         this.b = adh.a(this.b, 0.0F, 1.0F);
         ((vQ)this.a).a(this.b);
      }

   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      boolean var4 = Lv.a(0);
      int var5 = this.f;
      int var6 = this.g;
      int var7 = var5 + 175;
      int var8 = var6 + 18;
      int var9 = var7 + 14;
      int var10 = var8 + 112;
      if (!this.e && var4 && var1 >= var7 && var2 >= var8 && var1 < var9 && var2 < var10) {
         this.d = this.d();
      }

      if (!var4) {
         this.d = false;
      }

      this.e = var4;
      if (this.d) {
         this.b = ((float)(var2 - var8) - 7.5F) / ((float)(var10 - var8) - 15.0F);
         this.b = adh.a(this.b, 0.0F, 1.0F);
         ((vQ)this.a).a(this.b);
      }

      super.drawScreen(var1, var2, var3);
      KC[] var11 = KC.a;
      int var12 = var11.length;

      for(int var13 = 0; var13 < var12; ++var13) {
         KC var14 = var11[var13];
         if (this.b(var14, var1, var2)) {
            break;
         }
      }

      if (this.a != null && a == KC.m.getIndex() && this.a(this.a.b, this.a.c, 16, 16, var1, var2)) {
         this.drawHoveringText(IK.a("inventory.binSlot"), var1, var2);
      }

      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.f();
      this.c(var1, var2);
   }

   protected void a(Vh var1, int var2, int var3) {
      if (a == KC.f.getIndex()) {
         JI var10002 = this.a.a;
         RecyclableArrayList var4 = var1.a((Rn)this.a.a, (JY)(JI.l ? JZ.ADVANCED : JZ.NORMAL));
         KC var5 = var1.a().a();
         if (var5 == null && var1.a() == RT.bM) {
            Map var6 = Nh.a(var1);
            if (var6.size() == 1) {
               MT var7 = (MT)var6.keySet().iterator().next();
               KC[] var8 = KC.a;
               int var9 = var8.length;

               for(int var10 = 0; var10 < var9; ++var10) {
                  KC var11 = var8[var10];
                  if (var11.a(var7.a)) {
                     var5 = var11;
                     break;
                  }
               }
            }
         }

         if (var5 != null) {
            var4.add(1, String.valueOf(adH.BOLD) + adH.BLUE + IK.a(var5.getTranslationKey()));
         }

         for(int var12 = 0; var12 < var4.size(); ++var12) {
            if (var12 == 0) {
               var4.set(var12, var1.a().color + (String)var4.get(var12));
            } else {
               var4.set(var12, adH.GRAY + (String)var4.get(var12));
            }
         }

         this.drawHoveringText(var4, var2, var3);
         var4.recycle();
      } else {
         super.a(var1, var2, var3);
      }

   }

   protected void a(float var1, int var2, int var3) {
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      Co.c();
      KC var4 = KC.a[a];
      KC[] var5 = KC.a;
      int var6 = var5.length;

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         KC var8 = var5[var7];
         this.a.a().c(e);
         if (var8.getIndex() != a) {
            this.a(var8);
         }
      }

      this.a.a().c(new acC("textures/gui/container/creative_inventory/tab_" + var4.getBackgroundImageName()));
      this.b(this.f, this.g, 0, 0, this.b, this.e);
      this.a.drawTextBox();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      int var9 = this.f + 175;
      var6 = this.g + 18;
      var7 = var6 + 112;
      this.a.a().c(e);
      if (var4.hasScrollbar()) {
         this.b(var9, var6 + (int)((float)(var7 - var6 - 17) * this.b), 232 + (this.d() ? 0 : 12), 0, 12, 15);
      }

      this.a(var4);
      if (var4 == KC.m) {
         wb.a(this.a.a(), this.f + 88, this.g + 45, 20, (float)(this.f + 88 - var2), (float)(this.g + 45 - 30 - var3), this.a.a);
      }

   }

   protected boolean a(KC var1, int var2, int var3) {
      int var4 = var1.getColumn();
      int var5 = 28 * var4;
      byte var6 = 0;
      if (var1.isAlignedRight()) {
         var5 = this.b - 28 * (6 - var4) + 2;
      } else if (var4 > 0) {
         var5 += var4;
      }

      int var7;
      if (var1.isOnTopRow()) {
         var7 = var6 - 32;
      } else {
         var7 = var6 + this.e;
      }

      return var2 >= var5 && var2 <= var5 + 28 && var3 >= var7 && var3 <= var7 + 32;
   }

   protected boolean b(KC var1, int var2, int var3) {
      int var4 = var1.getColumn();
      int var5 = 28 * var4;
      byte var6 = 0;
      if (var1.isAlignedRight()) {
         var5 = this.b - 28 * (6 - var4) + 2;
      } else if (var4 > 0) {
         var5 += var4;
      }

      int var7;
      if (var1.isOnTopRow()) {
         var7 = var6 - 32;
      } else {
         var7 = var6 + this.e;
      }

      if (this.a(var5 + 3, var7 + 3, 23, 27, var2, var3)) {
         this.drawHoveringText(IK.a(var1.getTranslationKey()), var2, var3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(KC var1) {
      boolean var2 = var1.getIndex() == a;
      boolean var3 = var1.isOnTopRow();
      int var4 = var1.getColumn();
      int var5 = var4 * 28;
      int var6 = 0;
      int var7 = this.f + 28 * var4;
      int var8 = this.g;
      boolean var9 = true;
      if (var2) {
         var6 += 32;
      }

      if (var1.isAlignedRight()) {
         var7 = this.f + this.b - 28 * (6 - var4);
      } else if (var4 > 0) {
         var7 += var4;
      }

      if (var3) {
         var8 -= 28;
      } else {
         var6 += 64;
         var8 += this.e - 4;
      }

      By.f();
      this.b(var7, var8, var5, var6, 28, 32);
      this.a = 100.0F;
      this.a.a = 100.0F;
      var7 += 6;
      var8 = var8 + 8 + (var3 ? 1 : -1);
      By.e();
      By.z();
      Vh var10 = var1.a();
      this.a.b(var10, var7, var8);
      this.a.a(this.a, var10, var7, var8);
      By.f();
      this.a.a = 0.0F;
      this.a = 0.0F;
   }

   public void a(tL var1) {
      if (var1.e == 1) {
         this.a.a((uI)(new vp(this, this.a.a.a())));
      }

   }

   public int a() {
      return a;
   }

   public static void a(sE var0, int var1, boolean var2, boolean var3) {
      tE var4 = var0.a;
      JH var5 = var0.a;
      JM var6 = var5.a(var1);
      int var7;
      if (var2) {
         for(var7 = 0; var7 < Rs.a(); ++var7) {
            Vh var8 = ((Vh)var6.get(var7)).a();
            var4.a.a(var7, var8);
            var0.a.a(var8, 36 + var7);
         }

         var4.a.a();
      } else if (var3) {
         for(var7 = 0; var7 < Rs.a(); ++var7) {
            var6.set(var7, var4.a.a(var7).a());
         }

         String var9 = JI.a(var0.a.a[var1].getKeyCode());
         String var10 = JI.a(var0.a.x.getKeyCode());
         var0.a.a((adu)(new adE("inventory.hotbarSaved", new Object[]{var10, var9})), false);
         var5.c();
      }

   }

   // $FF: synthetic method
   static SH a() {
      return a;
   }

   static {
      a = KC.a.getIndex();
   }
}
