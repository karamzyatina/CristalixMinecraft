import dev.xdark.feder.array.EmptyArrays;
import dev.xdark.feder.collection.CompactIterators;
import dev.xdark.feder.function.Suppliers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public class adE extends adz {
   private static final Supplier<Matcher> a;
   private static final Logger a;
   private final String a;
   private final Object[] a;
   private final Object a = new Object();
   private long a = -1L;
   private final List<adu> c = new ArrayList();
   private boolean a;

   public adE(String var1, Object... var2) {
      this.a = var1;
      this.a = var2;
      Object[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object var6 = var3[var5];
         if (var6 instanceof adu) {
            ((adu)var6).a().a(this.a());
         }
      }

   }

   public adE(String var1, Object var2) {
      this.a = var1;
      this.a = new Object[]{var2};
      if (var2 instanceof adu) {
         ((adu)var2).a().a(this.a());
      }

   }

   public adE(String var1) {
      this.a = var1;
      this.a = EmptyArrays.OBJECT;
   }

   synchronized void b() {
      if (!this.a) {
         synchronized(this.a) {
            long var2 = adM.a();
            if (var2 == this.a) {
               return;
            }

            this.a = var2;
            this.c.clear();
         }

         try {
            this.a(adM.a(this.a));
         } catch (adF var6) {
            this.c.clear();

            try {
               this.a(adM.b(this.a));
            } catch (adF var5) {
               a.error("Unable to parse translation component: ", var5);
               this.a = true;
               List var3 = this.c;
               var3.clear();
               var3.add(new adD("Corrupted translation component"));
            }
         }

      }
   }

   protected void a(String var1) {
      Matcher var2 = ((Matcher)a.get()).reset(var1);
      int var3 = 0;
      int var4 = 0;

      try {
         int var5;
         for(; var2.find(var4); var4 = var5) {
            int var6 = var2.start();
            var5 = var2.end();
            if (var6 > var4) {
               adD var7 = new adD(var1.substring(var4, var6));
               var7.a().a(this.a());
               this.c.add(var7);
            }

            String var13 = var2.group(2);
            String var8 = var1.substring(var6, var5);
            if ("%".equals(var13) && "%%".equals(var8)) {
               adD var14 = new adD("%");
               var14.a().a(this.a());
               this.c.add(var14);
            } else {
               if (!"s".equals(var13)) {
                  throw new adF(this, "Unsupported format: '" + var8 + '\'');
               }

               String var9 = var2.group(1);
               int var10 = var9 != null ? Integer.parseInt(var9) - 1 : var3++;
               if (var10 < this.a.length) {
                  this.c.add(this.a(var10));
               }
            }
         }

         if (var4 < var1.length()) {
            adD var12 = new adD(var1.substring(var4));
            var12.a().a(this.a());
            this.c.add(var12);
         }

      } catch (IllegalFormatException var11) {
         throw new adF(this, var11);
      }
   }

   private adu a(int var1) {
      if (var1 >= this.a.length) {
         throw new adF(this, var1);
      } else {
         Object var2 = this.a[var1];
         Object var3;
         if (var2 instanceof adu) {
            var3 = (adu)var2;
         } else {
            var3 = new adD(var2 == null ? "null" : var2.toString());
            ((adu)var3).a().a(this.a());
         }

         return (adu)var3;
      }
   }

   public final adu a(adw var1) {
      super.a(var1);
      Object[] var2 = this.a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Object var5 = var2[var4];
         if (var5 instanceof adu) {
            ((adu)var5).a().a(this.a());
         }
      }

      if (this.a > -1L) {
         Iterator var6 = this.c.iterator();

         while(var6.hasNext()) {
            adu var7 = (adu)var6.next();
            var7.a().a(var1);
         }
      }

      return this;
   }

   public final Iterator<adu> iterator() {
      this.b();
      return CompactIterators.concat(a((Iterable)this.c), a((Iterable)this.b));
   }

   public final String a() {
      this.b();
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.c.iterator();

      while(var2.hasNext()) {
         adu var3 = (adu)var2.next();
         var1.append(var3.a());
      }

      return var1.toString();
   }

   public final adE a() {
      Object[] var1 = new Object[this.a.length];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] instanceof adu) {
            var1[var2] = ((adu)this.a[var2]).a();
         } else {
            var1[var2] = this.a[var2];
         }
      }

      adE var7 = new adE(this.a, var1);
      var7.a(this.a().a());
      List var3 = this.a();
      int var4 = 0;

      for(int var5 = var3.size(); var4 < var5; ++var4) {
         adu var6 = (adu)var3.get(var4);
         var7.a((adu)var6.a());
      }

      return var7;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof adE)) {
         return false;
      } else {
         adE var2 = (adE)var1;
         return this.a.equals(var2.a) && Arrays.equals(this.a, var2.a) && super.equals(var1);
      }
   }

   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.a.hashCode();
      var1 = 31 * var1 + Arrays.hashCode(this.a);
      return var1;
   }

   public String toString() {
      return "TranslatableComponent{key='" + this.a + '\'' + ", args=" + Arrays.toString(this.a) + ", siblings=" + this.b + ", style=" + this.a() + '}';
   }

   public String b() {
      return this.a;
   }

   public Object[] a() {
      return this.a;
   }

   static {
      Pattern var0 = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
      a = Suppliers.fastThreadLocal(() -> {
         return var0.matcher("");
      });
      a = sE.a;
   }
}
