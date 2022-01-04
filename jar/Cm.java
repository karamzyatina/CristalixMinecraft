import dev.xdark.clientapi.renderer.block.model.BlockPartRotation;
import dev.xdark.clientapi.util.EnumFacing.Axis;
import org.lwjgl.util.vector.Vector3f;

public class CM implements BlockPartRotation {
   public final Vector3f a;
   public final abR a;
   public final float a;
   public final boolean a;

   public CM(Vector3f var1, abR var2, float var3, boolean var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
   }

   public Axis getAxis() {
      return (Axis)d.a(this.a);
   }

   // $FF: synthetic method
   public Vector3f getOrigin() {
      return this.a;
   }

   // $FF: synthetic method
   public float getAngle() {
      return this.a;
   }

   // $FF: synthetic method
   public boolean shouldRescale() {
      return this.a;
   }
}
