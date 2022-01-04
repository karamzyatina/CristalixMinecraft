import dev.xdark.clientapi.renderer.block.model.BlockPart;
import dev.xdark.clientapi.renderer.block.model.BlockPartRotation;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.util.vector.Vector3f;

public class CH implements BlockPart {
   public final Vector3f a;
   public final Vector3f b;
   public final Map<abP, CK> a;
   public final CM a;
   public final boolean a;

   public CH(Vector3f var1, Vector3f var2, Map<abP, CK> var3, CM var4, boolean var5) {
      this.a = var1;
      this.b = var2;
      this.a = var3;
      this.a = var4;
      this.a = var5;
      this.a();
   }

   private void a() {
      Iterator var1 = this.a.entrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         float[] var3 = this.a((abP)var2.getKey());
         ((CK)var2.getValue()).a.setUvs(var3);
      }

   }

   private float[] a(abP var1) {
      // $FF: Couldn't be decompiled
   }

   public BlockPartRotation getPartRotation() {
      return (BlockPartRotation)d.a(this.a);
   }

   // $FF: synthetic method
   public Vector3f getFrom() {
      return this.a;
   }

   // $FF: synthetic method
   public Vector3f getTo() {
      return this.b;
   }

   // $FF: synthetic method
   public Map getFaces() {
      return this.a;
   }

   // $FF: synthetic method
   public boolean isShading() {
      return this.a;
   }
}
