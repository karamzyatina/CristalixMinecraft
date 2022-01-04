import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class iM {
   private static final Object a = new Object();
   private static final Object b = new Object();
   public static final Unsafe a;
   private static final long a;

   public static int a(int var0) {
      Unsafe var1 = a;
      long var2 = a + 8L;
      synchronized(a) {
         var1.putInt(var2, var0);
         var1.storeFence();
         return var1.getInt(var2);
      }
   }

   public static long a(long var0) {
      Unsafe var2 = a;
      long var3 = a;
      synchronized(b) {
         var2.putLong(var3, var0);
         var2.storeFence();
         return var2.getLong(var3);
      }
   }

   public static int a(float var0) {
      return Float.floatToRawIntBits(var0);
   }

   public static float a(int var0) {
      return Float.intBitsToFloat(var0);
   }

   public static long a(double var0) {
      return Double.doubleToRawLongBits(var0);
   }

   public static double a(long var0) {
      return Double.longBitsToDouble(var0);
   }

   private iM() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      try {
         Field var0 = Unsafe.class.getDeclaredField("theUnsafe");
         var0.setAccessible(true);
         Unsafe var1 = a = (Unsafe)var0.get((Object)null);
         a = var1.allocateMemory(12L);
      } catch (NoSuchFieldException | IllegalAccessException var2) {
         throw new ExceptionInInitializerError(var2);
      }
   }
}
