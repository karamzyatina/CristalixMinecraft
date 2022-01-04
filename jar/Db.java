import dev.xdark.clientapi.renderer.block.model.ModelRotation;
import dev.xdark.clientapi.renderer.block.model.Variant;
import dev.xdark.clientapi.resource.ResourceLocation;

public final class DB implements Variant {
   private final acC a;
   private final Dw a;
   private final boolean a;
   private final int a;
   private final int b;

   public DB(acC var1, Dw var2, boolean var3, int var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
      int var5 = var1.hashCode();
      var5 = 31 * var5 + var2.hashCode();
      var5 = 31 * var5 + Boolean.hashCode(var3);
      var5 = 31 * var5 + var4;
      this.b = var5;
   }

   public acC a() {
      return this.a;
   }

   public Dw a() {
      return this.a;
   }

   public boolean a() {
      return this.a;
   }

   public int getWeight() {
      return this.a;
   }

   public String toString() {
      return "Variant{modelLocation=" + this.a + ", rotation=" + this.a + ", uvLock=" + this.a + ", weight=" + this.a + '}';
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof DB)) {
         return false;
      } else {
         DB var2 = (DB)var1;
         return this.a == var2.a && this.a == var2.a && this.a == var2.a && this.a.equals(var2.a);
      }
   }

   public int hashCode() {
      return this.b;
   }

   public ResourceLocation getModelLocation() {
      return (ResourceLocation)d.a(this.a);
   }

   public ModelRotation getModelRotation() {
      return (ModelRotation)d.a(this.a);
   }

   // $FF: synthetic method
   public boolean isUVLocked() {
      return this.a();
   }
}
