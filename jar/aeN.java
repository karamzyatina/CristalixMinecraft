public abstract class aen {
   public static final float[] a = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   protected aej a;
   private aet a;
   protected boolean a;
   protected boolean b;
   protected boolean c;
   protected final float[] b = new float[16];
   private final float[] c = new float[4];
   public final adm a = new adm(0.0D, 0.0D, 0.0D);

   public final void a(aej var1) {
      this.a = var1;
      this.a = var1.a().a();
      this.b();
      this.a();
   }

   protected void a() {
      for(int var1 = 0; var1 <= 15; ++var1) {
         float var2 = 1.0F - (float)var1 / 15.0F;
         this.b[var1] = (1.0F - var2) / (var2 * 3.0F + 1.0F) * 1.0F + 0.0F;
      }

   }

   protected void b() {
      this.c = true;
   }

   public float a(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if (var5 < 0.0F) {
         ++var5;
      }

      if (var5 > 1.0F) {
         --var5;
      }

      float var6 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 += (var6 - var5) / 3.0F;
      return var5;
   }

   public int a(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public boolean a() {
      return true;
   }

   public float[] a(float var1, float var2) {
      float var3 = adh.b(var1 * 6.2831855F) - 0.0F;
      if (var3 >= -0.4F && var3 <= 0.4F) {
         float var4 = (var3 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float var5 = 1.0F - (1.0F - adh.a(var4 * 3.1415927F)) * 0.99F;
         var5 *= var5;
         this.c[0] = var4 * 0.3F + 0.7F;
         this.c[1] = var4 * var4 * 0.7F + 0.2F;
         this.c[2] = var4 * var4 * 0.0F + 0.2F;
         this.c[3] = var5;
         return this.c;
      } else {
         return null;
      }
   }

   public adm a(float var1, float var2) {
      float var3 = adh.b(var1 * 6.2831855F) * 2.0F + 0.5F;
      var3 = adh.a(var3, 0.0F, 1.0F);
      float var4 = 0.7529412F;
      float var5 = 0.84705883F;
      float var6 = 1.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return this.a.g((double)var4, (double)var5, (double)var6);
   }

   public float a() {
      return 128.0F;
   }

   public boolean b() {
      return true;
   }

   public double a() {
      return this.a == aet.b ? 1.0D : 0.03125D;
   }

   public boolean a(int var1, int var2) {
      return false;
   }

   public boolean c() {
      return this.a;
   }

   public boolean d() {
      return this.c;
   }

   public boolean e() {
      return this.b;
   }

   public float[] a() {
      return this.b;
   }

   public afc a() {
      return new afc();
   }

   public abstract adX a();
}
