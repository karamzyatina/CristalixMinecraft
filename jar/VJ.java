import java.util.Arrays;
import java.util.Iterator;

final class vj {
   private final afz a;
   private final Hy a;
   private final acC a;
   private final int[] a;
   // $FF: synthetic field
   final vh a;

   private vj(vh var1, afz var2) {
      this.a = var1;
      this.a = var2;
      this.a = new Hy(128, 128);
      this.a = this.a.getTextureData();
      this.a = vh.a(var1).a("map/" + var2.a, this.a);
      Arrays.fill(this.a, 0);
   }

   private void a() {
      byte[] var1 = this.a.a;
      int[] var2 = this.a;

      for(int var3 = 0; var3 < 16384; ++var3) {
         int var4 = var1[var3] & 255;
         if (var4 / 4 == 0) {
            var2[var3] = (var3 + var3 / 128 & 1) * 8 + 16 << 24;
         } else {
            var2[var3] = sh.a[var4 / 4].a(var4 & 3);
         }
      }

      this.a.updateDynamicTexture();
   }

   private void a(boolean var1) {
      Cw var2 = vh.a(this.a);
      Bh var3 = var2.a();
      vh.a(this.a).a(this.a);
      By.l();
      By.a(BU.ONE, BL.ONE_MINUS_SRC_ALPHA, BU.ZERO, BL.ONE);
      By.c();
      var3.a(7, In.g);
      var3.a(0.0D, 128.0D, -0.009999999776482582D).a(0.0D, 1.0D).endVertex();
      var3.a(128.0D, 128.0D, -0.009999999776482582D).a(1.0D, 1.0D).endVertex();
      var3.a(128.0D, 0.0D, -0.009999999776482582D).a(1.0D, 0.0D).endVertex();
      var3.a(0.0D, 0.0D, -0.009999999776482582D).a(0.0D, 0.0D).endVertex();
      var2.draw();
      By.d();
      By.k();
      vh.a(this.a).a(vh.a());
      int var4 = 0;
      Iterator var5 = this.a.a.values().iterator();

      while(true) {
         afB var6;
         do {
            if (!var5.hasNext()) {
               By.C();
               By.c(0.0F, 0.0F, -0.04F);
               By.b(1.0F, 1.0F, 1.0F);
               By.D();
               return;
            }

            var6 = (afB)var5.next();
         } while(var1 && !var6.a());

         By.C();
         By.c(0.0F + (float)var6.b() / 2.0F + 64.0F, 0.0F + (float)var6.c() / 2.0F + 64.0F, -0.02F);
         By.b((float)(var6.d() * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
         By.b(4.0F, 4.0F, 3.0F);
         By.c(-0.125F, 0.125F, 0.0F);
         byte var7 = var6.a();
         float var8 = (float)(var7 % 4) / 4.0F;
         float var9 = (float)(var7 / 4) / 4.0F;
         float var10 = (float)(var7 % 4 + 1) / 4.0F;
         float var11 = (float)(var7 / 4 + 1) / 4.0F;
         var3.a(7, In.g);
         var3.a(-1.0D, 1.0D, (double)((float)var4 * -0.001F)).a((double)var8, (double)var9).endVertex();
         var3.a(1.0D, 1.0D, (double)((float)var4 * -0.001F)).a((double)var10, (double)var9).endVertex();
         var3.a(1.0D, -1.0D, (double)((float)var4 * -0.001F)).a((double)var10, (double)var11).endVertex();
         var3.a(-1.0D, -1.0D, (double)((float)var4 * -0.001F)).a((double)var8, (double)var11).endVertex();
         var2.draw();
         By.D();
         ++var4;
      }
   }

   // $FF: synthetic method
   static void a(vj var0) {
      var0.a();
   }

   // $FF: synthetic method
   static void a(vj var0, boolean var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   vj(vh var1, afz var2, vi var3) {
      this(var1, var2);
   }

   // $FF: synthetic method
   static acC a(vj var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static afz a(vj var0) {
      return var0.a;
   }
}
