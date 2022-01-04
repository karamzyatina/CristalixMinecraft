import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.util.Mirror;
import dev.xdark.clientapi.util.Rotation;

public enum act implements Mirror {
   NONE,
   LEFT_RIGHT,
   FRONT_BACK;

   public int mirrorRotation(int var1, int var2) {
      // $FF: Couldn't be decompiled
   }

   public acE a(abP var1) {
      abR var2 = var1.a();
      return (this != LEFT_RIGHT || var2 != abR.Z) && (this != FRONT_BACK || var2 != abR.X) ? acE.NONE : acE.CLOCKWISE_180;
   }

   public abP a(abP var1) {
      // $FF: Couldn't be decompiled
   }

   public Rotation toRotation(EnumFacing var1) {
      return (Rotation)d.a(this.a((abP)d.a(var1)));
   }

   public EnumFacing mirror(EnumFacing var1) {
      return (EnumFacing)d.a(this.a((abP)d.a(var1)));
   }
}
