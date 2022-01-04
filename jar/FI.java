public final class Fi extends FV {
   public static final Lg a = new Lg("textures/entity/armorstand/wood.png");

   public Fi(Ga var1) {
      super(var1, new wV(var1.a), 0.0F);
      sE var2 = var1.a;
      Fj var3 = new Fj(this, this, var2);
      this.a((Hn)var3);
      this.a((Hn)(new Hi(this)));
      this.a((Hn)(new Hb(this)));
      this.a((Hn)(new GZ(var1.a, this.a().e)));
   }

   protected acC a(Pa var1) {
      return a;
   }

   public wV a() {
      return (wV)super.a();
   }

   protected void a(Pa var1, float var2, float var3, float var4) {
      By.b(180.0F - var3, 0.0F, 1.0F, 0.0F);
      float var5 = (float)(var1.a.a() - var1.d) + var4;
      if (var5 < 5.0F) {
         By.b(adh.a(var5 / 1.5F * 3.1415927F) * 3.0F, 0.0F, 1.0F, 0.0F);
      }

   }

   protected boolean a(Pa var1) {
      return var1.getAlwaysRenderNameTag();
   }

   public void a(Pa var1, double var2, double var4, double var6, float var8, float var9) {
      if (var1.hasMarker()) {
         this.b = true;
      }

      super.a((Oh)var1, var2, var4, var6, var8, var9);
      if (var1.hasMarker()) {
         this.b = false;
      }

   }
}
