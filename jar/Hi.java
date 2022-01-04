public final class HI implements Comparable {
   private final HK a;
   private final int a;
   private final int b;
   private final int c;
   private boolean a;
   private float a = 1.0F;

   public HI(HK var1, int var2) {
      this.a = var1;
      this.a = var1.getIconWidth();
      this.b = var1.getIconHeight();
      this.c = var2;
      this.a = HH.a(this.b, var2) > HH.a(this.a, var2);
   }

   public HK a() {
      return this.a;
   }

   public int a() {
      int var1 = this.a ? this.b : this.a;
      return HH.a((int)((float)var1 * this.a), this.c);
   }

   public int b() {
      int var1 = this.a ? this.a : this.b;
      return HH.a((int)((float)var1 * this.a), this.c);
   }

   public void a() {
      this.a = !this.a;
   }

   public boolean a() {
      return this.a;
   }

   public void a(int var1) {
      if (this.a > var1 && this.b > var1) {
         this.a = (float)var1 / (float)Math.min(this.a, this.b);
      }

   }

   public String toString() {
      return "Holder{width=" + this.a + ", height=" + this.b + ", name=" + this.a.getIconName() + '}';
   }

   public int a(HI var1) {
      int var3 = this.b();
      int var4 = this.a();
      int var5 = var1.b();
      int var6 = var1.a();
      int var2;
      if (var3 == var5) {
         if (var4 == var6) {
            String var7 = this.a.getIconName();
            String var8 = var1.a.getIconName();
            if (var7 == null) {
               return var8 == null ? 0 : -1;
            }

            return var7.compareTo(var8);
         }

         var2 = var4 < var6 ? 1 : -1;
      } else {
         var2 = var3 < var5 ? 1 : -1;
      }

      return var2;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((HI)var1);
   }
}
