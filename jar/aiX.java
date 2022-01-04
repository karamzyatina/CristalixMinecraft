public class aix {
   private final String a;
   private final String b;
   private aiu a;
   private aiS a;

   public boolean a(aiq var1) {
      this.a = var1.a(this.a);
      if (this.a == null) {
         afT.b("Model variable not found: " + this.a);
         return false;
      } else {
         try {
            aiH var2 = new aiH(var1);
            this.a = var2.a(this.b);
            return true;
         } catch (aiY var3) {
            afT.b("Error parsing expression: " + this.b);
            afT.b(var3.getClass().getName() + ": " + var3.getMessage());
            return false;
         }
      }
   }

   public aix(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(sE var1) {
      float var2 = this.a.a(var1);
      this.a.a(var2);
   }
}
