import java.util.Iterator;

class wk extends tL {
   private final Vp a;
   private final boolean d;
   // $FF: synthetic field
   final wj a;

   public wk(wj var1, int var2, int var3, Vp var4, boolean var5) {
      super(0, var2, var3, "");
      this.a = var1;
      this.a = 24;
      this.b = 24;
      this.a = var4;
      this.d = var5;
   }

   public void a(sE var1, int var2, int var3, float var4) {
      Co.c();
      By.d();
      var1.a().c(wj.a());
      this.c = var2 >= this.c && var3 >= this.d && var2 < this.c + this.a && var3 < this.d + this.b;
      int var5 = 152;
      if (!this.d) {
         var5 += 26;
      }

      int var6 = 78;
      if (this.c) {
         var6 += 26;
      }

      this.b(this.c, this.d, var5, var6, this.a, this.b);
      int var7 = 3;
      int var8 = 3;
      if (this.a instanceof VC) {
         VC var9 = (VC)this.a;
         var7 = var9.a();
         var8 = var9.b();
      }

      Iterator var18 = this.a.a().iterator();

      for(int var10 = 0; var10 < var8; ++var10) {
         int var11 = 3 + var10 * 7;

         for(int var12 = 0; var12 < var7; ++var12) {
            if (var18.hasNext()) {
               Vh[] var13 = ((Vq)var18.next()).a();
               if (var13.length != 0) {
                  int var14 = 3 + var12 * 7;
                  By.C();
                  float var15 = 0.42F;
                  int var16 = (int)((float)(this.c + var14) / 0.42F - 3.0F);
                  int var17 = (int)((float)(this.d + var11) / 0.42F - 3.0F);
                  By.b(0.42F, 0.42F, 1.0F);
                  By.e();
                  var1.a().b(var13[adh.a(wj.a(this.a) / 30.0F) % var13.length], var16, var17);
                  By.f();
                  By.D();
               }
            }
         }
      }

      By.c();
      Co.a();
   }

   // $FF: synthetic method
   static Vp a(wk var0) {
      return var0.a;
   }
}
