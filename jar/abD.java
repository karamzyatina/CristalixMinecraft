public abstract class abd extends abc {
   protected acC a;
   protected long a;
   public String a;

   protected boolean a(VR var1) {
      if (var1.a("LootTable", (int)8)) {
         this.a = new acC(var1.getString("LootTable"));
         this.a = var1.getLong("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(VR var1) {
      if (this.a != null) {
         var1.a("LootTable", this.a.toString());
         if (this.a != 0L) {
            var1.a("LootTableSeed", this.a);
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean hasCustomName() {
      return this.a != null && !this.a.isEmpty();
   }

   public void a(String var1) {
      this.a = var1;
   }

   public Vh a(int var1) {
      return (Vh)this.a().get(var1);
   }

   public Vh a(int var1, int var2) {
      Vh var3 = SO.a(this.a(), var1, var2);
      if (!var3.isEmpty()) {
         this.b();
      }

      return var3;
   }

   public Vh b(int var1) {
      return SO.a(this.a(), var1);
   }

   public void a(int var1, Vh var2) {
      this.a().set(var1, var2);
      if (var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }

      this.b();
   }

   public boolean b(Rn var1) {
      if (this.a.a(this.a, this.b, this.c) != this) {
         return false;
      } else {
         return var1.a((double)this.a + 0.5D, (double)this.b + 0.5D, (double)this.c + 0.5D) <= 64.0D;
      }
   }

   public void b(Rn var1) {
   }

   public void c(Rn var1) {
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

   public void clear() {
      this.a().clear();
   }

   protected abstract acz<Vh> a();
}
