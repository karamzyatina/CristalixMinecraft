public class ait {
   private final aix[] a;

   public ait(aix[] var1) {
      this.a = var1;
   }

   public void a(sE var1) {
      aix[] var2 = this.a;
      int var3 = 0;

      for(int var4 = var2.length; var3 < var4; ++var3) {
         aix var5 = var2[var3];
         var5.a(var1);
      }

   }

   public boolean a(aiq var1) {
      aix[] var2 = this.a;
      int var3 = 0;

      for(int var4 = var2.length; var3 < var4; ++var3) {
         aix var5 = var2[var3];
         if (!var5.a(var1)) {
            return false;
         }
      }

      return true;
   }
}
