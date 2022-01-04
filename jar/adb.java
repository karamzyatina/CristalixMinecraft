import java.util.List;

public final class adB extends adz {
   private final String a;
   private final String b;
   private String c = "";

   public adB(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public String b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public void a(String var1) {
      this.c = var1;
   }

   public String a() {
      return this.c;
   }

   public adB a() {
      adB var1 = new adB(this.a, this.b);
      var1.a(this.c);
      var1.a(this.a().a());
      List var2 = this.a();
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         adu var5 = (adu)var2.get(var3);
         var1.a(var5.a());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         adB var2;
         return var1 instanceof adB && this.a.equals((var2 = (adB)var1).a) && this.b.equals(var2.b) && super.a((adz)var2);
      }
   }

   public String toString() {
      return "ScoreComponent{name='" + this.a + '\'' + "objective='" + this.b + '\'' + ", siblings=" + this.b + ", style=" + this.a() + '}';
   }
}
