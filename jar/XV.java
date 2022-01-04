public class xV extends xb {
   public xV(sE var1) {
      this(var1, 0.0F, false);
   }

   public xV(sE var1, float var2, boolean var3) {
      super(var1, var2, 0.0F, 64, 32);
      if (!var3) {
         this.h = new xN(var1, this, 40, 16);
         this.h.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var2);
         this.h.a(-5.0F, 2.0F, 0.0F);
         this.i = new xN(var1, this, 40, 16);
         this.i.a = true;
         this.i.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var2);
         this.i.a(5.0F, 2.0F, 0.0F);
         this.j = new xN(var1, this, 0, 16);
         this.j.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var2);
         this.j.a(-2.0F, 12.0F, 0.0F);
         this.k = new xN(var1, this, 0, 16);
         this.k.a = true;
         this.k.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var2);
         this.k.a(2.0F, 12.0F, 0.0F);
      }

   }

   public void a(Oh var1, float var2, float var3, float var4) {
      this.b = xd.EMPTY;
      this.a = xd.EMPTY;
      Vh var5 = var1.a(abU.MAIN_HAND);
      if (var5.a() == RT.a && ((PH)var1).x()) {
         if (var1.a() == abV.RIGHT) {
            this.b = xd.BOW_AND_ARROW;
         } else {
            this.a = xd.BOW_AND_ARROW;
         }
      }

      super.a(var1, var2, var3, var4);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      Vh var8 = ((Oh)var7).a();
      PH var9 = (PH)var7;
      if (var9.x() && (var8.isEmpty() || var8.a() != RT.a)) {
         float var10 = adh.a(this.a * 3.1415927F);
         float var11 = adh.a((1.0F - (1.0F - this.a) * (1.0F - this.a)) * 3.1415927F);
         this.h.h = 0.0F;
         this.i.h = 0.0F;
         this.h.g = -(0.1F - var10 * 0.6F);
         this.i.g = 0.1F - var10 * 0.6F;
         this.h.f = -1.5707964F;
         this.i.f = -1.5707964F;
         xN var10000 = this.h;
         var10000.f -= var10 * 1.2F - var11 * 0.4F;
         var10000 = this.i;
         var10000.f -= var10 * 1.2F - var11 * 0.4F;
         var10000 = this.h;
         var10000.h += adh.b(var3 * 0.09F) * 0.05F + 0.05F;
         var10000 = this.i;
         var10000.h -= adh.b(var3 * 0.09F) * 0.05F + 0.05F;
         var10000 = this.h;
         var10000.f += adh.a(var3 * 0.067F) * 0.05F;
         var10000 = this.i;
         var10000.f -= adh.a(var3 * 0.067F) * 0.05F;
      }

   }

   public void a(float var1, abV var2) {
      float var3 = var2 == abV.RIGHT ? 1.0F : -1.0F;
      xN var4 = this.a(var2);
      var4.c += var3;
      var4.c(var1);
      var4.c -= var3;
   }
}
