class aaF implements KB {
   // $FF: synthetic field
   final acV a;
   // $FF: synthetic field
   final aaD a;

   aaF(aaD var1, acV var2) {
      this.a = var1;
      this.a = var2;
   }

   public String a() {
      int var1 = mY.a(this.a.a.a(this.a).a());

      try {
         return String.format("ID #%d (%s // %s)", var1, mY.a(var1).getTranslationKey(), mY.a(var1).getClass().getCanonicalName());
      } catch (Throwable var3) {
         return "ID #" + var1;
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
