import sun.misc.SharedSecrets;
import sun.misc.JavaNioAccess.BufferPool;

public final class amd {
   private static final BufferPool a = SharedSecrets.getJavaNioAccess().getDirectBufferPool();

   private amd() {
   }

   public static long a() {
      return a.getMemoryUsed();
   }

   public static long b() {
      return sun.misc.VM.maxDirectMemory();
   }
}
