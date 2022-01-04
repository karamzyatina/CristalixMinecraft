import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public final class Cf {
   private final Int2ObjectMap<Dv> a = new Int2ObjectOpenHashMap(1024);
   private final Int2ObjectMap<CV> b = new Int2ObjectOpenHashMap(1024);
   private final Du a;

   public Cf(Du var1) {
      this.a = var1;
   }

   public HK a(SZ var1) {
      return this.a(var1, 0);
   }

   public HK a(SZ var1, int var2) {
      return this.a(new Vh(var1, 1, var2)).a();
   }

   public CV a(Vh var1) {
      SZ var2 = var1.a();
      CV var3 = this.a(var2, this.a(var1));
      if (var3 == null) {
         Ce var4 = var2.a;
         if (var4 != null) {
            var3 = this.a.a(var4.a(var1));
         }
      }

      if (var3 == null) {
         var3 = this.a.a();
      }

      return var3;
   }

   protected int a(Vh var1) {
      return var1.getMaxDamage() > 0 ? 0 : var1.getMetadata();
   }

   protected CV a(SZ var1, int var2) {
      return (CV)this.b.get(a(var1, var2));
   }

   private static int a(SZ var0, int var1) {
      return SZ.a(var0) << 16 | var1;
   }

   public void a(SZ var1, int var2, Dv var3) {
      int var4 = a(var1, var2);
      this.a.put(var4, var3);
      this.b.put(var4, this.a.a(var3));
   }

   public void a(int var1) {
      this.a.remove(var1);
      this.b.remove(var1);
   }

   public void a(SZ var1, int var2) {
      int var3 = a(var1, var2);
      this.a.remove(var3);
      this.b.remove(var3);
   }

   public void a(SZ var1, Ce var2) {
      var1.a = var2;
   }

   public void a(SZ var1) {
      var1.a = null;
   }

   public Du a() {
      return this.a;
   }

   public void a() {
      this.b.clear();
      ObjectIterator var1 = this.a.int2ObjectEntrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         this.b.put(var2.getIntKey(), this.a.a((Dv)var2.getValue()));
      }

   }
}
