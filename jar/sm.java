public final class SM implements aee {
   private final String a;
   private final aee a;
   private final aee b;

   public SM(String var1, aee var2, aee var3) {
      this.a = var1;
      if (var2 == null) {
         var2 = var3;
      }

      if (var3 == null) {
         var3 = var2;
      }

      this.a = var2;
      this.b = var3;
   }

   public int getSizeInventory() {
      return this.a.getSizeInventory() + this.b.getSizeInventory();
   }

   public boolean isEmpty() {
      return this.a.isEmpty() && this.b.isEmpty();
   }

   public boolean a(SE var1) {
      return this.a == var1 || this.b == var1;
   }

   public String getName() {
      if (this.a.hasCustomName()) {
         return this.a.getName();
      } else {
         return this.b.hasCustomName() ? this.b.getName() : this.a;
      }
   }

   public boolean hasCustomName() {
      return this.a.hasCustomName() || this.b.hasCustomName();
   }

   public adu a() {
      return (adu)(this.hasCustomName() ? new adD(this.getName()) : new adE(this.getName(), new Object[0]));
   }

   public Vh a(int var1) {
      return var1 >= this.a.getSizeInventory() ? this.b.a(var1 - this.a.getSizeInventory()) : this.a.a(var1);
   }

   public Vh a(int var1, int var2) {
      return var1 >= this.a.getSizeInventory() ? this.b.a(var1 - this.a.getSizeInventory(), var2) : this.a.a(var1, var2);
   }

   public Vh b(int var1) {
      return var1 >= this.a.getSizeInventory() ? this.b.b(var1 - this.a.getSizeInventory()) : this.a.b(var1);
   }

   public void a(int var1, Vh var2) {
      if (var1 >= this.a.getSizeInventory()) {
         this.b.a(var1 - this.a.getSizeInventory(), var2);
      } else {
         this.a.a(var1, var2);
      }

   }

   public int getInventoryStackLimit() {
      return this.a.getInventoryStackLimit();
   }

   public void b() {
      this.a.b();
      this.b.b();
   }

   public boolean b(Rn var1) {
      return this.a.b(var1) && this.b.b(var1);
   }

   public void b(Rn var1) {
      this.a.b(var1);
      this.b.b(var1);
   }

   public void c(Rn var1) {
      this.a.c(var1);
      this.b.c(var1);
   }

   public boolean b(int var1, Vh var2) {
      return true;
   }

   public int getField(int var1) {
      return 0;
   }

   public void setField(int var1, int var2) {
   }

   public int getFieldCount() {
      return 0;
   }

   public String a() {
      return this.a.a();
   }

   public RY a(Rs var1, Rn var2) {
      return new Sf(var1, this, var2);
   }

   public void clear() {
      this.a.clear();
      this.b.clear();
   }
}
