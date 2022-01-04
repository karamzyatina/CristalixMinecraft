public final class Bd implements IO {
   private static final Mp a = new Be();
   private final AU a;
   private final AO a;
   private final Bk a;
   private final AN a;
   private final Bh a;
   private final HO a;

   public Bd(HO var1, AU var2, Ey var3, Ib var4, Cw var5) {
      this.a = var1;
      this.a = var2;
      this.a = new AO(var3, var5, var1, var2);
      this.a = new AN(var3, var1);
      this.a = var5.a();
      this.a = new Bk(var4);
   }

   public AU a() {
      return this.a;
   }

   public Mp a(adm var1, sD var2, acV var3, HK var4, aec var5) {
      if (var2.a() != abO.MODEL) {
         return a;
      } else {
         sD var6 = var2.a(var5, var3);
         CV var7 = this.a.a(var6);
         CV var8 = (new DA(this.a, var6, var7, var4, var3)).a();
         AO var9 = this.a;
         Bh var10 = this.a;
         return new Bf(this, var9, var1, var5, var8, var6, var3, var10);
      }
   }

   public void a(adm var1, sD var2, acV var3, HK var4, aec var5) {
      if (var2.a() == abO.MODEL) {
         var2 = var2.a(var5, var3);
         CV var6 = this.a.a(var2);
         CV var7 = (new DA(this.a, var2, var6, var4, var3)).a();
         this.a.a(var1, var5, var7, var2, var3, this.a, true);
      }

   }

   public boolean a(adm var1, sD var2, acV var3, aec var4, Bh var5) {
      // $FF: Couldn't be decompiled
   }

   public AO a() {
      return this.a;
   }

   public CV a(sD var1) {
      return this.a.a(var1);
   }

   public void a(sD var1, float var2) {
      // $FF: Couldn't be decompiled
   }

   public void onResourceManagerReload(IN var1) {
      this.a.a();
   }
}
