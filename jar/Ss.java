import com.google.common.base.MoreObjects;

public abstract class ss implements so {
   private final Class<T> a;
   private final String a;
   private int a;

   protected ss(String var1, Class<T> var2) {
      this.a = var2;
      this.a = var1;
   }

   public final String getName() {
      return this.a;
   }

   public final Class<T> getValueClass() {
      return this.a;
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.a).add("clazz", this.a).add("values", this.getAllowedValues()).toString();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ss)) {
         return false;
      } else {
         ss var2 = (ss)var1;
         return this.a == var2.a && this.a.equals(var2.a);
      }
   }

   public final int hashCode() {
      int var1;
      return (var1 = this.a) == 0 ? (this.a = this.a()) : var1;
   }

   protected int a() {
      return 31 * this.a.hashCode() + this.a.hashCode();
   }
}
