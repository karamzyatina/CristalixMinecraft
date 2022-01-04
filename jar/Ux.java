import dev.xdark.clientapi.gui.ChatOverlay;
import dev.xdark.clientapi.text.Text;
import dev.xdark.feder.RecyclableArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class ux extends tJ implements ChatOverlay {
   private static final Logger a;
   private final sE a;
   private final List<String> a = new ArrayList();
   private final List<tH> b = new ReferenceArrayList();
   private final List<tH> c = new ReferenceArrayList();
   private int a;
   private boolean a;

   public ux(sE var1) {
      this.a = var1;
   }

   public void a(int var1) {
      CallbackInfo var23 = new CallbackInfo("drawChat", true);
      this.a(var1, var23);
      if (!var23.isCancelled()) {
         sE var2 = this.a;
         JI var3 = var2.a;
         if (var3.a != Rp.HIDDEN) {
            tI var4 = var2.a;
            List var5 = this.c;
            int var6 = this.a;
            boolean var7 = this.a;
            int var8 = this.getLineCount();
            int var9 = var5.size();
            float var10 = JI.b * 0.9F + 0.1F;
            if (var9 > 0) {
               boolean var11 = this.a();
               float var12 = this.a();
               int var13 = adh.b((float)this.a() / var12);
               By.C();
               By.c(2.0F, 8.0F, 0.0F);
               By.b(var12, var12, 1.0F);
               int var14 = 0;

               int var15;
               int var17;
               int var20;
               int var21;
               for(var15 = 0; var15 + var6 < var5.size() && var15 < var8; ++var15) {
                  tH var16 = (tH)var5.get(var15 + var6);
                  if (var16 != null) {
                     var17 = var1 - var16.a();
                     if (var17 < 200 || var11) {
                        double var18 = (double)var17 / 200.0D;
                        var18 = 1.0D - var18;
                        var18 *= 10.0D;
                        var18 = adh.a(var18, 0.0D, 1.0D);
                        var18 *= var18;
                        var20 = (int)(255.0D * var18);
                        if (var11) {
                           var20 = 255;
                        }

                        var20 = (int)((float)var20 * var10);
                        ++var14;
                        if (var20 > 3) {
                           var21 = -var15 * 9;
                           a(-2, var21 - 9, var13 + 4, var21, var20 / 2 << 24);
                           String var22 = var16.a();
                           By.l();
                           var4.drawStringWithShadow(var22, 0.0F, (float)(var21 - 8), 16777215 + (var20 << 24));
                           By.c();
                           By.k();
                        }
                     }
                  }
               }

               if (var11) {
                  var15 = var4.a;
                  By.c(-3.0F, 0.0F, 0.0F);
                  int var24 = var9 * var15 + var9;
                  var17 = var14 * var15 + var14;
                  int var25 = var6 * var17 / var9;
                  int var19 = var17 * var17 / var24;
                  if (var24 != var17) {
                     var20 = var25 > 0 ? 170 : 96;
                     var21 = var7 ? 13382451 : 3355562;
                     a(0, -var25, 2, -var25 - var19, var21 + (var20 << 24));
                     a(2, -var25, 1, -var25 - var19, 13421772 + (var20 << 24));
                  }
               }

               By.D();
            }
         }

      }
   }

   public void a(boolean var1) {
      this.c.clear();
      this.b.clear();
      if (var1) {
         this.a.clear();
      }

   }

   public void clearSentMessages() {
      this.a.clear();
   }

   public void a(adu var1) {
      this.a(var1, 0);
   }

   public void a(adu var1, int var2) {
      this.a(var1, var2, this.a.a.a(), false);
      a.info("[CHAT] {}", var1.getUnformattedText().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
   }

   private void a(adu var1, int var2, int var3, boolean var4) {
      if (var2 != 0) {
         this.deleteChatLine(var2);
      }

      int var5 = adh.a((float)this.a() / this.a());
      RecyclableArrayList var6 = va.a(var1, var5, this.a.a, false, false);
      boolean var7 = this.a();
      int var8 = 0;

      int var9;
      for(var9 = var6.size(); var8 < var9; ++var8) {
         adu var10 = (adu)var6.get(var8);
         if (var7 && this.a > 0) {
            this.a = true;
            this.scroll(1);
         }

         this.c.add(0, new tH(var3, var10, var2));
      }

      var6.recycle();
      var8 = this.c();

      while(this.c.size() > var8) {
         this.c.remove(this.c.size() - 1);
      }

      if (!var4) {
         this.b.add(0, new tH(var3, var1, var2));
         var9 = this.b.size();
         if (var9 == var8) {
            this.b.remove(var9 - 1);
         }
      }

   }

   public void a() {
      this.c.clear();
      this.resetScroll();

      for(int var1 = this.b.size() - 1; var1 >= 0; --var1) {
         tH var2 = (tH)this.b.get(var1);
         this.a(var2.a(), var2.b(), var2.a(), true);
      }

   }

   public List<String> getSentMessages() {
      return this.a;
   }

   public void a(String var1) {
      if (this.a.isEmpty() || !((String)this.a.get(this.a.size() - 1)).equals(var1)) {
         this.a.add(var1);
      }

   }

   public void resetScroll() {
      this.a = 0;
      this.a = false;
   }

   public void scroll(int var1) {
      this.a += var1;
      int var2 = this.c.size();
      if (this.a > var2 - this.getLineCount()) {
         this.a = var2 - this.getLineCount();
      }

      if (this.a <= 0) {
         this.a = 0;
         this.a = false;
      }

   }

   public adu a(int var1, int var2) {
      if (!this.a()) {
         return null;
      } else {
         vk var3 = this.a.b();
         int var4 = var3.getScaleFactor();
         float var5 = this.a();
         int var6 = var1 / var4 - 2;
         int var7 = var2 / var4 - 40;
         var6 = adh.a((float)var6 / var5);
         var7 = adh.a((float)var7 / var5);
         if (var6 >= 0 && var7 >= 0) {
            int var8 = Math.min(this.getLineCount(), this.c.size());
            if (var6 <= adh.a((float)this.a() / this.a()) && var7 < this.a.a.a * var8 + var8) {
               int var9 = var7 / this.a.a.a + this.a;
               if (var9 >= 0 && var9 < this.c.size()) {
                  tH var10 = (tH)this.c.get(var9);
                  int var11 = 0;
                  Iterator var12 = var10.a().iterator();

                  while(var12.hasNext()) {
                     adu var13 = (adu)var12.next();
                     if (var13 instanceof adD) {
                        var11 += this.a.a.getStringWidth(va.a(((adD)var13).b(), false));
                        if (var11 > var6) {
                           return var13;
                        }
                     }
                  }
               }
            }
         }

         return null;
      }
   }

   public boolean a() {
      return this.a.a instanceof tP;
   }

   public void deleteChatLine(int var1) {
      Iterator var2 = this.c.iterator();

      tH var3;
      while(var2.hasNext()) {
         var3 = (tH)var2.next();
         if (var3.b() == var1) {
            var2.remove();
         }
      }

      var2 = this.b.iterator();

      while(var2.hasNext()) {
         var3 = (tH)var2.next();
         if (var3.b() == var1) {
            var2.remove();
            break;
         }
      }

   }

   public int a() {
      return a(JI.d);
   }

   public int b() {
      return b(this.a() ? JI.f : JI.e);
   }

   public float a() {
      return JI.c;
   }

   public static int a(float var0) {
      return adh.a(var0 * 280.0F + 40.0F);
   }

   public static int b(float var0) {
      return adh.a(var0 * 160.0F + 20.0F);
   }

   public int getLineCount() {
      return this.b() / 9;
   }

   protected int c() {
      return JI.g;
   }

   public void setWidth(int var1) {
   }

   public void setFocusedHeight(int var1) {
   }

   public void setUnfocusedHeight(int var1) {
   }

   public void setScale(float var1) {
   }

   public void setHistoryLimit(int var1) {
   }

   static {
      a = sE.a;
   }

   private RecyclableArrayList a(JI var1, adu var2, int var3, tI var4, boolean var5, boolean var6) {
      boolean var7 = ((cK)var2).a();
      if (var7) {
         var3 -= var4.getStringWidth("§c¥§r ");
      }

      RecyclableArrayList var8 = va.a(var2, var3, var4, false, false);
      if (var7) {
         int var9 = 0;

         for(int var10 = var8.size(); var9 < var10; ++var9) {
            adu var11 = (adu)var8.get(var9);
            adD var12 = new adD("¥");
            var12.a().a(adH.RED);
            adD var13 = new adD(" ");
            var13.a().a(adH.RESET);
            var12.a((adu)var13);
            var13.a(var11);
            var8.set(var9, var12);
         }
      }

      return var8;
   }

   public void draw(int var1) {
      this.a(var1);
   }

   public void refresh() {
      this.a();
   }

   public int getWidth() {
      return this.a();
   }

   public int getHeight() {
      return this.b();
   }

   public float getScale() {
      return this.a();
   }

   public void printText(Text var1) {
      this.a((adu)d.a(var1));
   }

   public void printTextWithOptionalDeletion(Text var1, int var2) {
      this.a((adu)d.a(var1), var2);
   }

   public void a(int var1, CallbackInfo var2) {
      if (anF.a.a != null && anF.a.a.a()) {
         var2.cancel();
      }

   }
}
