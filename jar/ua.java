public final class UA extends TH {
   private final pe a;

   public UA(pe var1) {
      super(var1);
      this.a = var1;
      this.c(0);
      this.a(true);
   }

   public int getMetadata(int var1) {
      return var1 | 4;
   }

   public String b(Vh var1) {
      return super.getTranslationKey() + '.' + this.a.a(var1.getMetadata()).a();
   }
}
