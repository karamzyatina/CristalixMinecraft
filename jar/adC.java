import java.lang.reflect.Array;
import java.util.List;

public final class adc {
   public static <T> ade<T> a(Class<T> var0, Iterable<? extends T>[] var1) {
      return new ade(var0, var1, (add)null);
   }

   public static <T> ade<T> a(Class<T> var0, List<? extends Iterable<? extends T>> var1) {
      return new ade(var0, (Iterable[])a(Iterable.class, var1), (add)null);
   }

   private static <T> T[] a(Class<? super T> var0, List<? extends T> var1) {
      return (Object[])var1.toArray(b(var0, 0));
   }

   private static <T> T[] b(Class<? super T> var0, int var1) {
      return (Object[])((Object[])Array.newInstance(var0, var1));
   }

   // $FF: synthetic method
   static Object[] a(Class var0, int var1) {
      return b(var0, var1);
   }
}
