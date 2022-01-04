import java.util.ArrayList;
import java.util.List;

public class wJ implements wH {
   private final List<Vh> a = new ArrayList();
   private long a;
   private boolean a;

   public wJ(Vh var1) {
      this.a.add(var1);
   }

   public wI a(wE var1, long var2) {
      if (this.a) {
         this.a = var2;
         this.a = false;
      }

      if (this.a.isEmpty()) {
         return wI.HIDE;
      } else {
         var1.a().a().c(a);
         By.d(1.0F, 1.0F, 1.0F);
         var1.b(0, 0, 0, 32, 160, 32);
         var1.a().a.a(IK.a("recipe.toast.title"), 30, 7, -11534256);
         var1.a().a.a(IK.a("recipe.toast.description"), 30, 18, -16777216);
         Co.c();
         var1.a().a().a((Oh)((Oh)null), (Vh)this.a.get((int)(var2 / (5000L / (long)this.a.size()) % (long)this.a.size())), 8, 8);
         return var2 - this.a >= 5000L ? wI.HIDE : wI.SHOW;
      }
   }

   public void a(Vh var1) {
      if (this.a.add(var1)) {
         this.a = true;
      }

   }

   public static void a(wE var0, Vp var1) {
      wJ var2 = (wJ)var0.a(wJ.class, a);
      if (var2 == null) {
         var0.a((wH)(new wJ(var1.a())));
      } else {
         var2.a(var1.a());
      }

   }
}
