import java.lang.reflect.Constructor;

class kR implements kN {
   private final Constructor<V> a;

   kR(Constructor<V> var1) {
      this.a = var1;
   }

   public V a(String var1) {
      return kV.a(this.a, var1);
   }

   public Class<V> a() {
      return this.a.getDeclaringClass();
   }

   public String a() {
      return null;
   }
}
