import java.util.ArrayList;
import java.util.List;

public class we {
   private Vp a;
   private final List<wf> a = new ArrayList();
   private float a;

   public void a() {
      this.a = null;
      this.a.clear();
      this.a = 0.0F;
   }

   public void a(Vq var1, int var2, int var3) {
      this.a.add(new wf(this, var1, var2, var3));
   }

   public wf a(int var1) {
      return (wf)this.a.get(var1);
   }

   public int a() {
      return this.a.size();
   }

   public Vp a() {
      return this.a;
   }

   public void a(Vp var1) {
      this.a = var1;
   }

   public void a(sE var1, int var2, int var3, boolean var4, float var5) {
      if (!uI.a()) {
         this.a += var5;
      }

      Co.c();
      By.f();
      Cw var6 = var1.a;

      for(int var7 = 0; var7 < this.a.size(); ++var7) {
         wf var8 = (wf)this.a.get(var7);
         int var9 = var8.a() + var2;
         int var10 = var8.b() + var3;
         if (var7 == 0 && var4) {
            tJ.a(var6, var9 - 4, var10 - 4, var9 + 20, var10 + 20, 822018048);
         } else {
            tJ.a(var6, var9, var10, var9 + 16, var10 + 16, 822018048);
         }

         By.f();
         Vh var11 = var8.a();
         Cp var12 = var1.a();
         var12.a((Oh)var1.a, var11, var9, var10);
         By.c(516);
         tJ.a(var6, var9, var10, var9 + 16, var10 + 16, 822083583);
         By.c(515);
         if (var7 == 0) {
            var12.a(var1.a, var11, var9, var10);
         }

         By.e();
      }

      Co.a();
   }

   // $FF: synthetic method
   static float a(we var0) {
      return var0.a;
   }
}
