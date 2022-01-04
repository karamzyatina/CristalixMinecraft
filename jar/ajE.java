import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aje extends uI {
   private final uI a;
   private final String b;
   private final String c;
   private final List<String> c = new ArrayList();
   protected String a;
   private int a;

   public aje(uI var1, String var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.a = IK.a("gui.done");
   }

   public void b() {
      this.a.add(new uy(0, this.c / 2 - 74, this.d / 6 + 96, this.a));
      this.c.clear();
      this.c.addAll(this.a.listFormattedStringToWidth(this.c, this.c - 50));
   }

   public void a(tL var1) {
      this.a.a(this.a);
   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.a(this.a, this.b, this.c / 2, 70, 16777215);
      int var4 = 90;

      for(Iterator var5 = this.c.iterator(); var5.hasNext(); var4 += this.a.a) {
         String var6 = (String)var5.next();
         this.a(this.a, var6, this.c / 2, var4, 16777215);
      }

      super.drawScreen(var1, var2, var3);
   }

   public void a(int var1) {
      this.a = var1;

      tL var3;
      for(Iterator var2 = this.a.iterator(); var2.hasNext(); var3.a = false) {
         var3 = (tL)var2.next();
      }

   }

   public void c_() {
      super.c_();
      tL var2;
      if (--this.a == 0) {
         for(Iterator var1 = this.a.iterator(); var1.hasNext(); var2.a = true) {
            var2 = (tL)var1.next();
         }
      }

   }
}
