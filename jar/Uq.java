import dev.xdark.feder.collection.CompactIterables;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class uQ extends uI {
   private final uI a;
   private List<IX> c;
   private List<IX> d;
   private uF a;
   private uH a;
   private boolean b;

   public uQ(uI var1) {
      this.a = var1;
   }

   public void b() {
      this.a.add(new uy(2, this.c / 2 - 154, this.d - 48, IK.a("resourcePack.openFolder")));
      this.a.add(new uy(1, this.c / 2 + 4, this.d - 48, IK.a("gui.done")));
      if (!this.b) {
         this.c = new ArrayList();
         this.d = new ArrayList();
         Jc var1 = this.a.a();
         var1.a();
         ArrayList var2 = new ArrayList(var1.a());
         var2.removeAll(var1.b());
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            Jj var4 = (Jj)var3.next();
            if (var4.a().a()) {
               this.c.add(new Ja(this.a, this, var4));
            }
         }

         Jj var6 = var1.a();
         if (var6 != null) {
            this.d.add(new Jb(this.a, this, var1.a()));
         }

         Iterator var7 = CompactIterables.reverse(var1.b()).iterator();

         while(var7.hasNext()) {
            Jj var5 = (Jj)var7.next();
            if (var5.a().a()) {
               this.d.add(new Ja(this.a, this, var5));
            }
         }

         this.d.add(new IZ(this.a, this));
      }

      this.a = new uF(this.a, 200, this.d, this.c);
      this.a.b(this.c / 2 - 4 - 200);
      this.a.c(7, 8);
      this.a = new uH(this.a, 200, this.d, this.d);
      this.a.b(this.c / 2 + 4);
      this.a.c(7, 8);
   }

   public void handleMouseInput() {
      super.handleMouseInput();
      this.a.c();
      this.a.c();
   }

   public boolean a(IX var1) {
      return this.d.contains(var1);
   }

   public List<IX> a(IX var1) {
      return this.a(var1) ? this.d : this.c;
   }

   public List<IX> a() {
      return this.c;
   }

   public List<IX> b() {
      return this.d;
   }

   public void a(tL var1) {
      if (var1.a) {
         if (var1.e == 2) {
            File var2 = this.a.a().a();
            Ci.a(var2);
         } else if (var1.e == 1) {
            if (this.b) {
               ArrayList var5 = new ArrayList();
               Iterator var3 = this.d.iterator();

               while(var3.hasNext()) {
                  IX var4 = (IX)var3.next();
                  if (var4 instanceof Ja) {
                     var5.add(((Ja)var4).a());
                  }
               }

               Collections.reverse(var5);
               this.a.a().a((List)var5);
               this.a.a.a.clear();
               this.a.a.b.clear();
               var3 = var5.iterator();

               while(var3.hasNext()) {
                  Jj var6 = (Jj)var3.next();
                  this.a.a.a.add(var6.a());
                  if (var6.a() != 3) {
                     this.a.a.b.add(var6.a());
                  }
               }

               this.a.a.b();
               this.a.refreshResources();
            }

            this.a.a(this.a);
         }
      }

   }

   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.a.a(var1, var2, var3);
      this.a.a(var1, var2, var3);
   }

   protected void mouseReleased(int var1, int var2, int var3) {
      super.mouseReleased(var1, var2, var3);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawBackground(0);
      this.a.a(var1, var2, var3);
      this.a.a(var1, var2, var3);
      this.a(this.a, IK.a("resourcePack.title"), this.c / 2, 16, 16777215);
      this.a(this.a, IK.a("resourcePack.folderInfo"), this.c / 2 - 77, this.d - 26, 8421504);
      super.drawScreen(var1, var2, var3);
   }

   public void d() {
      this.b = true;
   }
}
