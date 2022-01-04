final class kB extends kz {
   // $FF: synthetic field
   final boolean a;

   kB(boolean var1) {
      this.a = var1;
   }

   protected void a(ky var1, kk var2, kC var3) {
      String var4 = var2.a();

      try {
         if (kH.c(var4)) {
            var1.b();
            return;
         }

         if (kH.b(var4)) {
            var1.a(var4, var2, var3);
            return;
         }

         if (kH.a(var4)) {
            var1.b(var4, var2, var3);
            return;
         }
      } catch (kL var6) {
         if (!var1.b()) {
            throw var6;
         }
      }

      if (this.a) {
         var1.b();
      }

      var1.c(var4, var2, var3);
   }
}
