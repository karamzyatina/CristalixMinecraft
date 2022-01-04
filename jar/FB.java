import dev.xdark.clientapi.math.AxisAlignedBB;
import dev.xdark.clientapi.renderer.culling.Camera;

public interface Fb extends Camera {
   boolean a(acU var1);

   double a();

   double b();

   double c();

   void setPosition(double var1, double var3, double var5);

   boolean b(double var1, double var3, double var5, double var7, double var9, double var11);

   default boolean isBoundingBoxInFrustum(AxisAlignedBB var1) {
      return this.a((acU)d.a(var1));
   }
}
