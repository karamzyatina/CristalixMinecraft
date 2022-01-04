import dev.xdark.feder.function.Predicates;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public final class MR {
   private MR() {
   }

   public static <T> Predicate<T> a(Predicate<T> var0, Predicate<T> var1) {
      return var0.and(var1);
   }

   public static <T> Predicate<T> b(Predicate<T> var0, Predicate<T> var1) {
      return var0.or(var1);
   }

   public static <T> Predicate<T> a(Iterable<Predicate<T>> var0) {
      Iterator var1 = var0.iterator();
      if (!var1.hasNext()) {
         return Predicates.alwaysTrue();
      } else {
         Predicate var2 = (Predicate)var1.next();

         while(var1.hasNext()) {
            Predicate var3 = (Predicate)var1.next();
            if (var1.hasNext()) {
               Predicate var4 = (Predicate)var1.next();
               if (var1.hasNext()) {
                  Predicate var5 = (Predicate)var1.next();
                  if (var1.hasNext()) {
                     Predicate var6 = (Predicate)var1.next();
                     var2 = Predicates.and(var2, var3, var4, var5, var6);
                  }
               } else {
                  var2 = Predicates.and(var2, var3, var4);
               }
            } else {
               var2 = Predicates.and(var2, var3);
            }
         }

         return var2;
      }
   }

   public static <T> Predicate<T> b(Iterable<Predicate<T>> var0) {
      Iterator var1 = var0.iterator();
      if (!var1.hasNext()) {
         return Predicates.alwaysTrue();
      } else {
         Predicate var2 = (Predicate)var1.next();

         while(var1.hasNext()) {
            Predicate var3 = (Predicate)var1.next();
            if (var1.hasNext()) {
               Predicate var4 = (Predicate)var1.next();
               if (var1.hasNext()) {
                  Predicate var5 = (Predicate)var1.next();
                  if (var1.hasNext()) {
                     Predicate var6 = (Predicate)var1.next();
                     var2 = Predicates.or(var2, var3, var4, var5, var6);
                  } else {
                     var2 = Predicates.or(var2, var3, var4, var5);
                  }
               } else {
                  var2 = Predicates.or(var2, var3, var4);
               }
            } else {
               var2 = Predicates.or(var2, var3);
            }
         }

         return var2;
      }
   }

   public static <F, T> Predicate<T> a(List<F> var0, Function<F, Predicate<T>> var1) {
      int var2 = var0.size();
      if (var2 == 0) {
         return Predicates.alwaysTrue();
      } else {
         switch(var2) {
         case 2:
            return Predicates.or((Predicate)var1.apply(var0.get(0)), (Predicate)var1.apply(var0.get(1)));
         case 3:
            return Predicates.or((Predicate)var1.apply(var0.get(0)), (Predicate)var1.apply(var0.get(1)), (Predicate)var1.apply(var0.get(2)));
         case 4:
            return Predicates.or((Predicate)var1.apply(var0.get(0)), (Predicate)var1.apply(var0.get(1)), (Predicate)var1.apply(var0.get(2)), (Predicate)var1.apply(var0.get(3)));
         case 5:
            return Predicates.or((Predicate)var1.apply(var0.get(0)), (Predicate)var1.apply(var0.get(1)), (Predicate)var1.apply(var0.get(2)), (Predicate)var1.apply(var0.get(3)), (Predicate)var1.apply(var0.get(4)));
         default:
            return Predicates.or(Predicates.alwaysTrue(), (Predicate[])var0.stream().map(var1).toArray((var0x) -> {
               return new Predicate[var0x];
            }));
         }
      }
   }

   public static <T> Predicate<T> a(Predicate<T> var0, Predicate<T> var1, Predicate<T> var2) {
      return Predicates.or(var0, var1, var2);
   }

   public static <T> Predicate<T> a(Predicate<T> var0, Predicate<T> var1, Predicate<T> var2, Predicate<T> var3) {
      return Predicates.or(var0, var1, var2, var3);
   }

   public static <T> Predicate<T> b(Predicate<T> var0, Predicate<T> var1, Predicate<T> var2) {
      return Predicates.and(var0, var1, var2);
   }

   public static <T> Predicate<T> b(Predicate<T> var0, Predicate<T> var1, Predicate<T> var2, Predicate<T> var3) {
      return Predicates.and(var0, var1, var2, var3);
   }
}
