public abstract class NT extends NW {
   private static final WB<Boolean> m;
   protected int i;
   protected int j;
   protected int k;
   private float a = -1.0F;
   private float b;

   public NT(aej var1) {
      super(var1);
   }

   public boolean b(Rn var1, abU var2) {
      Vh var3 = var1.a((abU)var2);
      return var3.a() == RT.bt;
   }

   protected boolean a(Vh var1, Class<? extends NN> var2) {
      if (var1.a() != RT.bt) {
         return false;
      } else {
         Class var3 = (Class)Oc.a.a(UG.a(var1));
         return var3 != null && var2 == var3;
      }
   }

   protected void l() {
      super.l();
      this.a.a((WB)m, (Object)Boolean.FALSE);
   }

   public int d() {
      return (Boolean)this.a.a(m) ? -1 : 1;
   }

   public void b(int var1, boolean var2) {
      int var3 = this.d();
      int var4 = var3;
      var3 += var1 * 20;
      if (var3 > 0) {
         var3 = 0;
         if (var4 < 0) {
            this.e_();
         }
      }

      int var5 = var3 - var4;
      this.c(var3);
      if (var2) {
         this.j += var5;
         if (this.k == 0) {
            this.k = 40;
         }
      }

      if (this.d() == 0) {
         this.c(this.j);
      }

   }

   public void a_(int var1) {
      this.b(var1, false);
   }

   public void c(int var1) {
      this.a.b(m, var1 < 0);
      this.i = var1;
      this.c(this.isChild());
   }

   public void b(VR var1) {
      super.b(var1);
      this.c(var1.getInteger("Age"));
      this.j = var1.getInteger("ForcedAge");
   }

   public void a(WB<?> var1) {
      if (m.equals(var1)) {
         this.c(this.isChild());
      }

      super.a(var1);
   }

   public void b() {
      super.b();
      if (this.k > 0) {
         if (this.k % 4 == 0) {
            this.a.a(abW.VILLAGER_HAPPY, this.d + (double)(this.a.nextFloat() * this.a.a() * 2.0F) - (double)this.a.a(), this.e + 0.5D + (double)(this.a.nextFloat() * this.b.a()), this.f + (double)(this.a.nextFloat() * this.a.a() * 2.0F) - (double)this.a.a(), 0.0D, 0.0D, 0.0D);
         }

         --this.k;
      }

   }

   protected void e_() {
   }

   public boolean isChild() {
      return this.d() < 0;
   }

   public void c(boolean var1) {
      this.b(var1 ? 0.5F : 1.0F);
   }

   public final void setSize(float var1, float var2) {
      boolean var3 = this.a > 0.0F;
      this.a = var1;
      this.b = var2;
      if (!var3) {
         this.b(1.0F);
      }

   }

   protected final void b(float var1) {
      super.setSize(this.a * var1, this.b * var1);
   }

   static {
      m = WS.a(NT.class, WD.h);
   }
}
