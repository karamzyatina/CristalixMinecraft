import java.io.ByteArrayInputStream;

public final class LD extends ByteArrayInputStream {
   public LD(byte[] var1) {
      super(var1);
   }

   public byte[] a() {
      return this.buf;
   }
}
