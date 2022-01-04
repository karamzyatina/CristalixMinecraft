import dev.xdark.clientapi.language.Language;

public final class IQ implements Language, Comparable {
   private final String a;
   private final String b;
   private final String c;
   private final boolean a;

   public IQ(String var1, String var2, String var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.a = var4;
   }

   public String a() {
      return this.a;
   }

   public boolean isBidirectional() {
      return this.a;
   }

   public String toString() {
      return String.format("%s (%s)", this.c, this.b);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof IQ && this.a.equals(((IQ)var1).a);
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public int a(IQ var1) {
      return this.a.compareTo(var1.a);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((IQ)var1);
   }

   public String getCode() {
      return this.a;
   }

   public String getRegion() {
      return this.b;
   }

   public String getName() {
      return this.c;
   }
}
