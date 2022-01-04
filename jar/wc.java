import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

final class wC implements wq {
   private final sE a;
   private final aan a;
   private final acC a;
   private final List<yF> a;

   public wC(sE var1, aan var2) {
      this.a = var1;
      this.a = var2;
      this.a = new ArrayList();
      Iterator var3 = var2.a().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         yF var5 = var1.a().a(var4);
         if (var5 != null) {
            this.a.add(var5);
         }
      }

      if (this.a.isEmpty()) {
         this.a = ID.a();
      } else {
         yF var6 = (yF)this.a.get((new Random()).nextInt(this.a.size()));
         this.a = var6.a();
      }

   }

   public void a(wu var1) {
      var1.a((ws)(new wz(this.a, this.a)));
   }

   public adu b() {
      return new adD(this.a.b());
   }

   public void a(float var1, int var2) {
      int var3 = -1;
      String var4 = tI.a(this.a.c());
      if (var4.length() >= 2) {
         var3 = this.a.a.a(var4.charAt(1));
      }

      Cw var5 = this.a.a;
      if (var3 >= 0) {
         float var6 = (float)(var3 >> 16 & 255) / 255.0F;
         float var7 = (float)(var3 >> 8 & 255) / 255.0F;
         float var8 = (float)(var3 & 255) / 255.0F;
         tJ.a(var5, 1, 1, 15, 15, adh.a(var6 * var1, var7 * var1, var8 * var1) | var2 << 24);
      }

      this.a.a().a(this.a);
      By.c(var1, var1, var1, (float)var2 / 255.0F);
      tJ.a(var5, 2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
      tJ.a(var5, 2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
   }

   public boolean a() {
      return !this.a.isEmpty();
   }
}
