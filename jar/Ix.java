import dev.xdark.ssbus.Dispatcher;
import dev.xdark.ssbus.DispatcherGenerator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class iX implements ja {
   private static final jj a = new iY();
   private static final Dispatcher a = new iZ();
   private static final Comparator<jg> a = (var0, var1) -> {
      return var1.a - var0.a;
   };
   private final List<jg> a;
   private final Class<?> a;
   private final String a;
   private Dispatcher<E> b;
   private boolean a;

   public iX(Class<E> var1) {
      this(var1, jk.a(var1));
   }

   public iX(Class<?> var1, Class<E> var2) {
      this(var1, jk.a(var2));
   }

   private iX(Class<?> var1, String var2) {
      this.a = new ArrayList();
      this.b = a;
      this.a = true;
      this.a = var1;
      this.a = var2;
   }

   public final <V extends E> V a(V var1) {
      this.b.dispatch(var1);
      return var1;
   }

   public final <V extends E> V b(V var1) {
      try {
         this.b.dispatch(var1);
      } catch (Throwable var3) {
         this.a(var3);
      }

      return var1;
   }

   public final void a(E var1) {
      this.b.dispatch(var1);
   }

   public final void b(E var1) {
      try {
         this.b.dispatch(var1);
      } catch (Throwable var3) {
         this.a(var3);
      }

   }

   public final ja<E> a() {
      return new jd(this);
   }

   public final jj a(Consumer<E> var1, int var2) {
      jg var3 = jk.a(var1, var2);
      List var4 = this.a;
      var4.add(var3);
      var4.sort(a);
      if (this.a) {
         this.b = DispatcherGenerator.generateDispatcher(this.a, this.a, var4);
      }

      return new jh(this, Collections.singletonList(var3));
   }

   public final jj a(Object var1) {
      List var2 = this.a;
      int var3 = var2.size();
      jk.a(var2, var1);
      int var4 = var2.size();
      if (var3 != var4) {
         ArrayList var5 = new ArrayList(var2.subList(var3, var4));
         var2.sort(a);
         if (this.a) {
            this.b = DispatcherGenerator.generateDispatcher(this.a, this.a, var2);
         }

         return new jh(this, var5);
      } else {
         return a;
      }
   }

   public void a() {
      List var1 = this.a;
      if (var1.isEmpty()) {
         this.b = a;
      } else {
         this.b = DispatcherGenerator.generateDispatcher(this.a, this.a, var1);
      }

   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public boolean a() {
      return this.a;
   }

   void a(jg var1) {
      this.a.add(var1);
   }

   void a(Collection<jg> var1) {
      this.a.addAll(var1);
   }

   void b(Collection<jg> var1) {
      List var2 = this.a;
      if (var2.removeAll(var1)) {
         if (var2.isEmpty()) {
            this.b = a;
         } else {
            var2.sort(a);
            this.b = DispatcherGenerator.generateDispatcher(this.a, this.a, var2);
         }
      }

   }

   protected void a(Throwable var1) {
   }

   private static List<jg> a(List<jg> var0, jg var1) {
      if (var0 == null) {
         var0 = new ArrayList();
      }

      ((List)var0).add(var1);
      return (List)var0;
   }
}
