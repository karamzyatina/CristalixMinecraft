public final class Uv extends SZ {
   private final Class<? extends NY> a;

   public Uv(Class<? extends NY> var1) {
      this.a = var1;
      this.a(KC.b);
   }

   public abN a(Rn var1, aej var2, acV var3, abU var4, abP var5, float var6, float var7, float var8) {
      Vh var9 = var1.a((abU)var4);
      acV var10 = var3.a(var5);
      if (var5 != abP.DOWN && var5 != abP.UP && var1.a(var10, var5, var9)) {
         NY var11 = this.a(var2, var10, var5);
         if (var11 != null && var11.a()) {
            var9.shrink(1);
         }

         return abN.SUCCESS;
      } else {
         return abN.FAIL;
      }
   }

   private NY a(aej var1, acV var2, abP var3) {
      if (this.a == PB.class) {
         return new PB(var1, var2, var3);
      } else {
         return this.a == Pn.class ? new Pn(var1, var2, var3) : null;
      }
   }
}
