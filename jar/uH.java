public class UH extends TH {
   protected final nh b;
   protected final UJ a;

   public UH(mY var1, nh var2, UJ var3) {
      super(var1);
      this.b = var2;
      this.a = var3;
      this.c(0);
      this.a(true);
   }

   public UH(mY var1, nh var2, String[] var3) {
      this(var1, var2, (UJ)(new UI(var3)));
   }

   public int getMetadata(int var1) {
      return var1;
   }

   public String b(Vh var1) {
      return super.getTranslationKey() + '.' + this.a.a(var1);
   }
}
