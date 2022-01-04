import dev.xdark.feder.RecyclableArrayList;
import dev.xdark.feder.collection.CompactIterables;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.lwjgl.input.Keyboard;

public class wi extends tJ implements wm {
   protected static final acC d = new acC("textures/gui/recipe_book.png");
   private int a;
   private int b;
   private int c;
   private final we a = new we();
   private final List<wh> a;
   private wh a;
   private tO a;
   private SJ a;
   private sE a;
   private uZ a;
   private String a;
   private aat a;
   private final wn a;
   private final Kf a;
   private int d;

   public wi() {
      this.a = CompactIterables.newArrayList(new wh[]{new wh(0, KC.f), new wh(0, KC.h), new wh(0, KC.a), new wh(0, KC.e), new wh(0, KC.c)});
      this.a = "";
      this.a = new wn();
      this.a = new Kf();
   }

   public void a(int var1, int var2, sE var3, boolean var4, SJ var5) {
      this.a = var3;
      this.b = var1;
      this.c = var2;
      this.a = var5;
      this.a = var3.a.a();
      this.d = var3.a.a.getTimesChanged();
      this.a = (wh)this.a.get(0);
      this.a.a(true);
      if (this.a()) {
         this.a(var4, var5);
      }

      Keyboard.enableRepeatEvents(true);
   }

   public void a(boolean var1, SJ var2) {
      this.a = var1 ? 0 : 86;
      int var3 = (this.b - 147) / 2 - this.a;
      int var4 = (this.c - 166) / 2;
      this.a.a();
      this.a.a.a.a(this.a, false);
      var2.a(this.a);
      this.a = new uZ(this.a, 0, this.a.a, var3 + 25, var4 + 14, 80, this.a.a.a + 5);
      this.a.a(50);
      this.a.a(false);
      this.a.setVisible(true);
      this.a.b(16777215);
      this.a.a(this.a, var3, var4);
      this.a.a(this);
      this.a = new tO(0, var3 + 110, var4 + 12, 26, 16, this.a.b());
      this.a.a(152, 41, 28, 18, d);
      this.b(false);
      this.e();
   }

   public void a() {
      Keyboard.enableRepeatEvents(false);
   }

   public int a(boolean var1, int var2, int var3) {
      int var4;
      if (this.a() && !var1) {
         var4 = 177 + (var2 - var3 - 200) / 2;
      } else {
         var4 = (var2 - var3) / 2;
      }

      return var4;
   }

   public void b() {
      this.a(!this.a());
   }

   public boolean a() {
      return this.a.a();
   }

   private void a(boolean var1) {
      this.a.a(var1);
      if (!var1) {
         this.a.a();
      }

      this.g();
   }

   public void a(SP var1) {
      if (var1 != null && var1.a <= 9) {
         this.a.a();
         if (this.a()) {
            this.f();
         }
      }

   }

   private void b(boolean var1) {
      List var2 = (List)Ke.a.get(this.a.a());
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         wo var5 = (wo)var2.get(var3);
         var5.a(this.a, this.a.b(), this.a.a(), this.a);
      }

      ArrayList var7 = new ArrayList(var2);
      var7.removeIf((var0) -> {
         return !var0.a() || !var0.c();
      });
      String var8 = this.a.getText();
      if (!var8.isEmpty()) {
         ObjectLinkedOpenHashSet var6 = new ObjectLinkedOpenHashSet(this.a.a(Kj.b).a(var8.toLowerCase(Locale.ROOT)));
         var7.removeIf((var1x) -> {
            return !var6.contains(var1x);
         });
      }

      if (this.a.b()) {
         var7.removeIf((var0) -> {
            return !var0.b();
         });
      }

      this.a.a(var7, var1);
   }

   private void e() {
      int var1 = (this.b - 147) / 2 - this.a - 30;
      int var2 = (this.c - 166) / 2 + 3;
      int var3 = 0;
      Iterator var4 = this.a.iterator();

      while(var4.hasNext()) {
         wh var5 = (wh)var4.next();
         KC var6 = var5.a();
         if (var6 == KC.f) {
            var5.b = true;
            var5.a(var1, var2 + 27 * var3++);
         } else if (var5.c()) {
            var5.a(var1, var2 + 27 * var3++);
            var5.a(this.a);
         }
      }

   }

   public void c() {
      if (this.a() && this.d != this.a.a.a.getTimesChanged()) {
         this.f();
         this.d = this.a.a.a.getTimesChanged();
      }

   }

   private void f() {
      this.a.a();
      this.a.a.a.a(this.a, false);
      this.a.a(this.a);
      this.b(false);
   }

   public void a(int var1, int var2, float var3) {
      if (this.a()) {
         Co.c();
         By.f();
         By.C();
         By.c(0.0F, 0.0F, 100.0F);
         this.a.a().c(d);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         int var4 = (this.b - 147) / 2 - this.a;
         int var5 = (this.c - 166) / 2;
         this.b(var4, var5, 1, 1, 147, 166);
         this.a.drawTextBox();
         Co.a();
         Iterator var6 = this.a.iterator();

         while(var6.hasNext()) {
            wh var7 = (wh)var6.next();
            var7.a(this.a, var1, var2, var3);
         }

         this.a.a(this.a, var1, var2, var3);
         this.a.a(var4, var5, var1, var2, var3);
         By.D();
      }

   }

   public void c(int var1, int var2, int var3, int var4) {
      if (this.a()) {
         this.a.a(var3, var4);
         if (this.a.a()) {
            String var5 = IK.a(this.a.b() ? "gui.recipebook.toggleRecipes.craftable" : "gui.recipebook.toggleRecipes.all");
            if (this.a.a != null) {
               this.a.a.drawHoveringText(var5, var3, var4);
            }
         }

         this.d(var1, var2, var3, var4);
      }

   }

   private void d(int var1, int var2, int var3, int var4) {
      Vh var5 = null;

      for(int var6 = 0; var6 < this.a.a(); ++var6) {
         wf var7 = this.a.a(var6);
         int var8 = var7.a() + var1;
         int var9 = var7.b() + var2;
         if (var3 >= var8 && var4 >= var9 && var3 < var8 + 16 && var4 < var9 + 16) {
            var5 = var7.a();
         }
      }

      if (var5 != null && this.a.a != null) {
         RecyclableArrayList var10 = this.a.a.a(var5);
         this.a.a.drawHoveringText((List)var10, var3, var4);
         var10.recycle();
      }

   }

   public void a(int var1, int var2, boolean var3, float var4) {
      this.a.a(this.a, var1, var2, var3, var4);
   }

   public boolean a(int var1, int var2, int var3) {
      if (this.a() && !this.a.a.isSpectator()) {
         if (this.a.a(var1, var2, var3, (this.b - 147) / 2 - this.a, (this.c - 166) / 2, 147, 166)) {
            Vp var7 = this.a.a();
            wo var8 = this.a.a();
            if (var7 != null && var8 != null) {
               if (!var8.a(var7) && this.a.a() == var7) {
                  return false;
               }

               this.a.a();
               this.a.a.a(this.a.a.b.a, var7, uI.b(), this.a.a);
               if (!this.b() && var3 == 0) {
                  this.a(false);
               }
            }

            return true;
         } else if (var3 != 0) {
            return false;
         } else if (this.a.mouseClicked(var1, var2, var3)) {
            return true;
         } else if (this.a.a(this.a, var1, var2)) {
            boolean var6 = !this.a.b();
            this.a.b(var6);
            this.a.a(var6);
            this.a.a(this.a.a());
            this.g();
            this.b(false);
            return true;
         } else {
            Iterator var4 = this.a.iterator();

            wh var5;
            do {
               if (!var4.hasNext()) {
                  return false;
               }

               var5 = (wh)var4.next();
            } while(!var5.a(this.a, var1, var2));

            if (this.a != var5) {
               var5.a((tq)this.a.a());
               this.a.a(false);
               this.a = var5;
               this.a.a(true);
               this.b(true);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (!this.a()) {
         return true;
      } else {
         boolean var7 = var1 < var3 || var2 < var4 || var1 >= var3 + var5 || var2 >= var4 + var6;
         boolean var8 = var3 - 147 < var1 && var1 < var3 && var4 < var2 && var2 < var4 + var6;
         return var7 && !var8 && !this.a.a(this.a, var1, var2);
      }
   }

   public boolean a(char var1, int var2) {
      if (this.a() && !this.a.a.isSpectator()) {
         if (var2 == 1 && !this.b()) {
            this.a(false);
            return true;
         } else {
            if (JI.a(this.a.a.n) && !this.a.isFocused()) {
               this.a.setFocused(true);
            } else if (this.a.textboxKeyTyped(var1, var2)) {
               String var3 = this.a.getText().toLowerCase(Locale.ROOT);
               this.a(var3);
               if (!var3.equals(this.a)) {
                  this.b(false);
                  this.a = var3;
               }

               return true;
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private void a(String var1) {
      if ("excitedze".equals(var1)) {
         sE var2 = this.a;
         IR var3 = var2.a();
         IQ var4 = var3.a("en_pt");
         if (var3.a().a(var4) == 0) {
            return;
         }

         var3.a(var4);
         var2.a.b = var4.a();
         var2.refreshResources();
         var2.a.b(var3.isCurrentLocaleUnicode() || JI.v);
         var2.a.a(var3.isCurrentLanguageBidirectional());
         var2.a.b();
      }

   }

   private boolean b() {
      return this.a == 86;
   }

   public void d() {
      this.e();
      if (this.a()) {
         this.b(false);
      }

   }

   public void a(List<Vp> var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Vp var3 = (Vp)var2.next();
         this.a.a.a(var3);
      }

   }

   public void a(Vp var1, List<SP> var2) {
      Vh var3 = var1.a();
      this.a.a(var1);
      this.a.a(Vq.a(var3), ((SP)var2.get(0)).b, ((SP)var2.get(0)).c);
      int var4 = this.a.b();
      int var5 = this.a.a();
      int var6 = var1 instanceof VC ? ((VC)var1).a() : var4;
      int var7 = 1;
      Iterator var8 = var1.a().iterator();

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var6; ++var10) {
            if (!var8.hasNext()) {
               return;
            }

            Vq var11 = (Vq)var8.next();
            if (var11 != Vq.a) {
               SP var12 = (SP)var2.get(var7);
               this.a.a(var11, var12.b, var12.c);
            }

            ++var7;
         }

         if (var6 < var4) {
            var7 += var4 - var6;
         }
      }

   }

   private void g() {
      if (this.a.a() != null) {
         this.a.a().a((Ws)(new XH(this.a(), this.a.b())));
      }

   }
}
