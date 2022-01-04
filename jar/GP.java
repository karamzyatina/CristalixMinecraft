public class Gp extends FU {
   public static final Lg[] a = new Lg[]{new Lg("textures/entity/shulker/shulker_white.png"), new Lg("textures/entity/shulker/shulker_orange.png"), new Lg("textures/entity/shulker/shulker_magenta.png"), new Lg("textures/entity/shulker/shulker_light_blue.png"), new Lg("textures/entity/shulker/shulker_yellow.png"), new Lg("textures/entity/shulker/shulker_lime.png"), new Lg("textures/entity/shulker/shulker_pink.png"), new Lg("textures/entity/shulker/shulker_gray.png"), new Lg("textures/entity/shulker/shulker_silver.png"), new Lg("textures/entity/shulker/shulker_cyan.png"), new Lg("textures/entity/shulker/shulker_purple.png"), new Lg("textures/entity/shulker/shulker_blue.png"), new Lg("textures/entity/shulker/shulker_brown.png"), new Lg("textures/entity/shulker/shulker_green.png"), new Lg("textures/entity/shulker/shulker_red.png"), new Lg("textures/entity/shulker/shulker_black.png")};
   public static final acC[] a;

   public Gp(Ga var1) {
      super(var1, new xR(var1.a), 0.0F);
      this.a((Hn)(new Gr(this, (Gq)null)));
   }

   public xR a() {
      return (xR)super.a();
   }

   public void a(Qc var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = var1.i();
      if (var10 > 0 && var1.y()) {
         acV var11 = var1.b();
         acV var12 = var1.c();
         double var13 = (double)((float)var10 - var9) / 6.0D;
         var13 *= var13;
         double var15 = (double)(var11.a - var12.a) * var13;
         double var17 = (double)(var11.b - var12.b) * var13;
         double var19 = (double)(var11.c - var12.c) * var13;
         super.a((Of)var1, var2 - var15, var4 - var17, var6 - var19, var8, var9);
      } else {
         super.a((Of)var1, var2, var4, var6, var8, var9);
      }

   }

   public boolean a(Qc var1, Fb var2, double var3, double var5, double var7) {
      if (super.a((Of)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         if (var1.i() > 0 && var1.y()) {
            acV var9 = var1.c();
            acV var10 = var1.b();
            adm var11 = new adm((double)var10.a, (double)var10.b, (double)var10.c);
            adm var12 = new adm((double)var9.a, (double)var9.b, (double)var9.c);
            if (var2.a(new acU(var12.a, var12.b, var12.c, var11.a, var11.b, var11.c))) {
               return true;
            }
         }

         return false;
      }
   }

   protected acC a(Qc var1) {
      return a[var1.a().a()];
   }

   protected void a(Qc var1, float var2, float var3, float var4) {
      // $FF: Couldn't be decompiled
   }

   protected void a(Qc var1, float var2) {
      By.b(0.999F, 0.999F, 0.999F);
   }

   static {
      a = a;
   }
}
