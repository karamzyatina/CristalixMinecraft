import dev.xdark.feder.text.CharSequences;

public final class tQ extends acL {
   private final ux a;

   public tQ(sE var1, uZ var2, ux var3) {
      super(var1, var2, false);
      this.a = var3;
   }

   public void a() {
      super.a();
      if (this.a.size() > 1) {
         this.a.a(new adD(CharSequences.join(", ", this.a)), 1);
      }

   }

   public acV a() {
      acV var1 = null;
      if (this.a.a != null && this.a.a.a == adj.BLOCK) {
         var1 = this.a.a.a();
      }

      return var1;
   }
}
