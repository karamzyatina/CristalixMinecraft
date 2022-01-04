import dev.xdark.clientapi.render.BufferBuilder;
import dev.xdark.clientapi.render.Tessellator;
import java.util.BitSet;

public class Cw implements Tessellator {
   private final Bh a;
   private final CB a = new CB();

   public Cw(HO var1, int var2) {
      this.a = new Bh(var1, var2);
   }

   public final void draw() {
      Bh var1 = this.a;
      BitSet var2 = var1.a;
      if (var2 != null) {
         agx.a(var2);
      }

      var1.finishDrawing();
      this.a.a(var1);
   }

   public final Bh a() {
      return this.a;
   }

   public BufferBuilder getBufferBuilder() {
      return (BufferBuilder)d.a(this.a());
   }
}
