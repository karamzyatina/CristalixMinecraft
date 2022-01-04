import dev.xdark.feder.collection.CompactIterators;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class adz implements adu, cK {
   protected static final List<adu> a = Collections.emptyList();
   protected List<adu> b;
   private adw a;
   private boolean a;

   public adz() {
      this.b = a;
   }

   public final adu a(adu var1) {
      var1.a().a(this.a());
      List var2 = this.b;
      if (var2 == a) {
         var2 = this.b = new ObjectArrayList(4);
      }

      var2.add(var1);
      return this;
   }

   public final List<adu> a() {
      return this.b;
   }

   public final adu a(String var1) {
      return this.a((adu)(new adD(var1)));
   }

   public adu a(adw var1) {
      this.a = var1;
      List var2 = this.b;
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         adu var5 = (adu)var2.get(var3);
         var5.a().a(this.a());
      }

      return this;
   }

   public adw a() {
      adw var1 = this.a;
      if (var1 == null) {
         var1 = new adw();
         List var2 = this.b;
         int var3 = 0;

         for(int var4 = var2.size(); var3 < var4; ++var3) {
            adu var5 = (adu)var2.get(var3);
            var5.a().a(var1);
         }

         this.a = var1;
      }

      return var1;
   }

   public Iterator<adu> iterator() {
      return CompactIterators.concat(CompactIterators.singleton(this), a((Iterable)this.b));
   }

   public final String getUnformattedText() {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.iterator();

      while(var2.hasNext()) {
         adu var3 = (adu)var2.next();
         var1.append(var3.a());
      }

      return var1.toString();
   }

   public final String getFormattedText() {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.iterator();

      while(var2.hasNext()) {
         adu var3 = (adu)var2.next();
         String var4 = var3.a();
         if (!var4.isEmpty()) {
            var1.append(var3.a().c());
            var1.append(var4);
            var1.append(adH.RESET);
         }
      }

      return var1.toString();
   }

   public static Iterator<adu> a(Iterable<adu> var0) {
      return CompactIterators.transform(CompactIterators.concat(CompactIterators.transform(var0.iterator(), Iterable::iterator)), (var0x) -> {
         adu var1 = var0x.a();
         var1.a(var1.a().b());
         return var1;
      });
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof adz && this.a((adz)var1);
      }
   }

   protected final boolean a(adz var1) {
      return this.b.equals(var1.b) && this.a().equals(var1.a());
   }

   public int hashCode() {
      return 31 * this.a.hashCode() + this.b.hashCode();
   }

   public String toString() {
      return "BaseComponent{style=" + this.a + ", siblings=" + this.b + '}';
   }

   public void a() {
      this.a = true;
   }

   public boolean a() {
      return this.a;
   }
}
