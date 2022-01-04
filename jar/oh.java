public final class OH extends PZ {
   private static final WB<Integer> m;
   private static final WB<Integer> n;
   private static final WB<Integer> o;
   private static final WB<Integer>[] a;
   private static final WB<Integer> p;
   private final float[] c = new float[2];
   private final float[] d = new float[2];
   private int i;

   public OH(aej var1) {
      super(var1);
      this.setHealth(this.getMaxHealth());
      this.setSize(0.9F, 3.5F);
      this.f = true;
      this.m = 50;
   }

   protected void l() {
      super.l();
      this.a.a((WB)m, (int)0);
      this.a.a((WB)n, (int)0);
      this.a.a((WB)o, (int)0);
      this.a.a((WB)p, (int)0);
   }

   public void b(VR var1) {
      super.b(var1);
      this.a(var1.getInteger("Invul"));
   }

   public void setCustomNameTag(String var1) {
      super.setCustomNameTag(var1);
   }

   protected acJ c() {
      return RW.iC;
   }

   protected acJ a(abD var1) {
      return RW.iF;
   }

   protected acJ d() {
      return RW.iE;
   }

   public void b() {
      this.b.a(this.b.a() * 0.6000000238418579D);
      if (this.a.a() * this.a.a() + this.c.a() * this.c.a() > 0.05000000074505806D) {
         this.j = (float)adh.c(this.c.a(), this.a.a()) * 57.295776F - 90.0F;
      }

      super.b();

      int var2;
      for(int var1 = 0; var1 < 2; ++var1) {
         var2 = this.b(var1 + 1);
         NN var3 = null;
         if (var2 > 0) {
            var3 = this.a.a(var2);
         }

         if (var3 != null) {
            double var4 = this.a(var1 + 1);
            double var6 = this.b(var1 + 1);
            double var8 = this.c(var1 + 1);
            double var10 = var3.d - var4;
            double var12 = var3.e + (double)var3.getEyeHeight() - var6;
            double var14 = var3.f - var8;
            double var16 = (double)adh.a(var10 * var10 + var14 * var14);
            float var18 = (float)(adh.c(var14, var10) * 57.29577951308232D) - 90.0F;
            float var19 = (float)(-(adh.c(var12, var16) * 57.29577951308232D));
            this.c[var1] = this.a(this.c[var1], var19, 40.0F);
            this.d[var1] = this.a(this.d[var1], var18, 10.0F);
         } else {
            this.d[var1] = this.a(this.d[var1], this.A, 10.0F);
         }
      }

      boolean var20 = this.x();

      for(var2 = 0; var2 < 3; ++var2) {
         double var21 = this.a(var2);
         double var5 = this.b(var2);
         double var7 = this.c(var2);
         this.a.a(abW.SMOKE_NORMAL, var21 + this.a.nextGaussian() * 0.30000001192092896D, var5 + this.a.nextGaussian() * 0.30000001192092896D, var7 + this.a.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
         if (var20 && this.a.a.nextInt(4) == 0) {
            this.a.a(abW.SPELL_MOB, var21 + this.a.nextGaussian() * 0.30000001192092896D, var5 + this.a.nextGaussian() * 0.30000001192092896D, var7 + this.a.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
         }
      }

      if (this.d() > 0) {
         for(var2 = 0; var2 < 3; ++var2) {
            this.a.a(abW.SPELL_MOB, this.d + this.a.nextGaussian(), this.e + (double)(this.a.nextFloat() * 3.3F), this.f + this.a.nextGaussian(), 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
         }
      }

   }

   public static boolean a(nh var0) {
      return var0 != RQ.g && var0 != RQ.e && var0 != RQ.aQ && var0 != RQ.be && var0 != RQ.bQ && var0 != RQ.bR && var0 != RQ.bt && var0 != RQ.cG && var0 != RQ.bW && var0 != RQ.a && var0 != RQ.j;
   }

   public void c() {
      this.a(220);
      this.setHealth(this.getMaxHealth() / 3.0F);
   }

   public void setInWeb() {
   }

   private double a(int var1) {
      if (var1 <= 0) {
         return this.d;
      } else {
         float var2 = (this.A + (float)(180 * (var1 - 1))) * 0.017453292F;
         float var3 = adh.b(var2);
         return this.d + (double)var3 * 1.3D;
      }
   }

   private double b(int var1) {
      return var1 <= 0 ? this.e + 3.0D : this.e + 2.2D;
   }

   private double c(int var1) {
      if (var1 <= 0) {
         return this.f;
      } else {
         float var2 = (this.A + (float)(180 * (var1 - 1))) * 0.017453292F;
         float var3 = adh.a(var2);
         return this.f + (double)var3 * 1.3D;
      }
   }

   private float a(float var1, float var2, float var3) {
      float var4 = adh.d(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public boolean a(abD var1, float var2) {
      if (this.a((abD)var1)) {
         return false;
      } else if (var1 != abD.h && !(var1.b() instanceof OH)) {
         if (this.d() <= 0 || var1 == abD.m) {
            NN var3;
            if (this.x()) {
               var3 = var1.a();
               if (var3 instanceof Rv) {
                  return false;
               }
            }

            var3 = var1.b();
            if ((var3 == null || var3 instanceof Rn || !(var3 instanceof Oh) || ((Oh)var3).a() != this.a()) && this.i <= 0) {
               this.i = 20;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void despawnEntity() {
      this.u = 0;
   }

   public int getBrightnessForRender() {
      return 15728880;
   }

   public void c(float var1, float var2) {
   }

   public void a(ZY var1) {
   }

   protected void a_() {
      super.a_();
      this.a((OC)Ot.a).a(300.0D);
      this.a((OC)Ot.d).a(0.6000000238418579D);
      this.a((OC)Ot.b).a(40.0D);
      this.a((OC)Ot.h).a(4.0D);
   }

   public float a(int var1) {
      return this.d[var1];
   }

   public float b(int var1) {
      return this.c[var1];
   }

   public int d() {
      return (Integer)this.a.a(p);
   }

   public void a(int var1) {
      this.a.b(p, var1);
   }

   public int b(int var1) {
      return (Integer)this.a.a(a[var1]);
   }

   public void a(int var1, int var2) {
      this.a.b(a[var1], var2);
   }

   public boolean x() {
      return this.getHealth() <= this.getMaxHealth() / 2.0F;
   }

   public Oj a() {
      return Oj.UNDEAD;
   }

   public boolean b(NN var1) {
      return false;
   }

   public boolean l() {
      return false;
   }

   static {
      m = WS.a(OH.class, WD.b);
      n = WS.a(OH.class, WD.b);
      o = WS.a(OH.class, WD.b);
      a = new WB[]{m, n, o};
      p = WS.a(OH.class, WD.b);
   }
}
