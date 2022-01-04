import org.lwjgl.util.vector.Vector3f;

public final class Dh {
   public static final Dh a;
   public final Vector3f a;
   public final Vector3f b;
   public final Vector3f c;

   public Dh(Vector3f var1, Vector3f var2, Vector3f var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Dh)) {
         return false;
      } else {
         Dh var2 = (Dh)var1;
         return this.a.equals(var2.a) && this.c.equals(var2.c) && this.b.equals(var2.b);
      }
   }

   public int hashCode() {
      int var1 = this.a.hashCode();
      var1 = 31 * var1 + this.b.hashCode();
      var1 = 31 * var1 + this.c.hashCode();
      return var1;
   }

   static {
      a = new Dh(Lh.a, Lh.a, Lh.f);
   }
}
