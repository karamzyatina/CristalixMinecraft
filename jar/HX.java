public abstract class Hx implements HA {
   protected int a = -1;
   protected boolean a;
   protected boolean b;
   protected boolean c;
   protected boolean d;
   public ako a;

   public void a(boolean var1, boolean var2) {
      this.a = var1;
      this.b = var2;
      int var3;
      short var4;
      if (var1) {
         var3 = var2 ? 9987 : 9729;
         var4 = 9729;
      } else {
         var3 = var2 ? 9986 : 9728;
         var4 = 9728;
      }

      By.i(this.getGlTextureId());
      By.b(3553, 10241, var3);
      By.b(3553, 10240, var4);
   }

   public void setBlurMipmap(boolean var1, boolean var2) {
      this.c = this.a;
      this.d = this.b;
      this.a(var1, var2);
   }

   public void restoreLastBlurMipmap() {
      this.a(this.c, this.d);
   }

   public int getGlTextureId() {
      int var1 = this.a;
      return var1 == -1 ? (this.a = HS.a()) : var1;
   }

   public void deleteGlTexture() {
      int var1 = this.a;
      akG.a(this, var1);
      if (var1 != -1) {
         HS.a(var1);
         this.a = -1;
      }

   }

   public ako a() {
      return akG.a(this);
   }
}
