import java.util.Iterator;

public final class SN implements SE {
   private final Oo a;
   private final acz<Vh> a;
   private final Rn a;
   private adO a;
   private int a;

   public SN(Rn var1, Oo var2) {
      this.a = acz.a(3, Vh.a);
      this.a = var1;
      this.a = var2;
   }

   public int getSizeInventory() {
      return this.a.size();
   }

   public boolean isEmpty() {
      Iterator var1 = this.a.iterator();

      Vh var2;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         var2 = (Vh)var1.next();
      } while(var2.isEmpty());

      return false;
   }

   public Vh a(int var1) {
      return (Vh)this.a.get(var1);
   }

   public Vh a(int var1, int var2) {
      Vh var3 = (Vh)this.a.get(var1);
      if (var1 == 2 && !var3.isEmpty()) {
         return SO.a(this.a, var1, var3.getCount());
      } else {
         Vh var4 = SO.a(this.a, var1, var2);
         if (!var4.isEmpty() && this.a(var1)) {
            this.a();
         }

         return var4;
      }
   }

   private boolean a(int var1) {
      return var1 == 0 || var1 == 1;
   }

   public Vh b(int var1) {
      return SO.a(this.a, var1);
   }

   public void a(int var1, Vh var2) {
      this.a.set(var1, var2);
      if (!var2.isEmpty() && var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }

      if (this.a(var1)) {
         this.a();
      }

   }

   public String getName() {
      return "mob.villager";
   }

   public boolean hasCustomName() {
      return false;
   }

   public adu a() {
      return (adu)(this.hasCustomName() ? new adD(this.getName()) : new adE(this.getName(), new Object[0]));
   }

   public int getInventoryStackLimit() {
      return 64;
   }

   public boolean b(Rn var1) {
      return this.a.a() == var1;
   }

   public void b(Rn var1) {
   }

   public void c(Rn var1) {
   }

   public boolean b(int var1, Vh var2) {
      return true;
   }

   public void b() {
      this.a();
   }

   public void a() {
      this.a = null;
      Vh var1 = (Vh)this.a.get(0);
      Vh var2 = (Vh)this.a.get(1);
      if (var1.isEmpty()) {
         var1 = var2;
         var2 = Vh.a;
      }

      if (var1.isEmpty()) {
         this.a(2, Vh.a);
      } else {
         adP var3 = this.a.a(this.a);
         if (var3 != null) {
            adO var4 = var3.a(var1, var2, this.a);
            if (var4 != null && !var4.b()) {
               this.a = var4;
               this.a(2, var4.c().a());
            } else if (!var2.isEmpty()) {
               var4 = var3.a(var2, var1, this.a);
               if (var4 != null && !var4.b()) {
                  this.a = var4;
                  this.a(2, var4.c().a());
               } else {
                  this.a(2, Vh.a);
               }
            } else {
               this.a(2, Vh.a);
            }
         }

         this.a.a(this.a(2));
      }

   }

   public adO a() {
      return this.a;
   }

   public void a(int var1) {
      this.a = var1;
      this.a();
   }

   public int getField(int var1) {
      return 0;
   }

   public void setField(int var1, int var2) {
   }

   public int getFieldCount() {
      return 0;
   }

   public void clear() {
      this.a.clear();
   }
}
