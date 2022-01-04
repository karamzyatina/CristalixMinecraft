import java.util.Iterator;

public final class aba extends abc implements SG, aci {
   private acz<Vh> a;
   private int d;
   private int e;
   private int f;
   private int g;
   public String a;

   public aba() {
      this.a = acz.a(3, Vh.a);
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
      return SO.a(this.a, var1, var2);
   }

   public Vh b(int var1) {
      return SO.a(this.a, var1);
   }

   public void a(int var1, Vh var2) {
      Vh var3 = (Vh)this.a.get(var1);
      boolean var4 = !var2.isEmpty() && var2.a(var3) && Vh.a(var2, var3);
      this.a.set(var1, var2);
      if (var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }

      if (var1 == 0 && !var4) {
         this.g = this.a(var2);
         this.f = 0;
         this.b();
      }

   }

   public String getName() {
      return this.hasCustomName() ? this.a : "container.furnace";
   }

   public boolean hasCustomName() {
      return this.a != null && !this.a.isEmpty();
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void a(VR var1) {
      super.a(var1);
      this.a = acz.a(this.getSizeInventory(), Vh.a);
      SO.a(var1, this.a);
      this.d = var1.getShort("BurnTime");
      this.f = var1.getShort("CookTime");
      this.g = var1.getShort("CookTimeTotal");
      if (var1.a("ItemBurnTime", (int)99)) {
         this.e = var1.getShort("ItemBurnTime");
      } else {
         this.e = b((Vh)this.a.get(1));
      }

      if (var1.a("CustomName", (int)8)) {
         this.a = var1.getString("CustomName");
      }

   }

   public VR a(VR var1) {
      super.a(var1);
      var1.a("BurnTime", (short)this.d);
      var1.a("CookTime", (short)this.f);
      var1.a("CookTimeTotal", (short)this.g);
      SO.a(var1, this.a);
      if (this.hasCustomName()) {
         var1.a("CustomName", this.a);
      }

      return var1;
   }

   public int getInventoryStackLimit() {
      return 64;
   }

   public boolean c() {
      return this.d > 0;
   }

   public static boolean a(SE var0) {
      return var0.getField(0) > 0;
   }

   public void a() {
      if (this.c()) {
         --this.d;
      }

   }

   public int a(Vh var1) {
      return 200;
   }

   public static int b(Vh var0) {
      if (var0.isEmpty()) {
         return 0;
      } else {
         SZ var1 = var0.a();
         if (var1 == SZ.a((nh)RQ.d)) {
            return 150;
         } else if (var1 == SZ.a((nh)RQ.x)) {
            return 100;
         } else if (var1 == SZ.a((nh)RQ.bw)) {
            return 67;
         } else if (var1 == SZ.a((nh)RQ.P)) {
            return 300;
         } else if (var1 == SZ.a((nh)RQ.bh)) {
            return 100;
         } else if (mY.a(var1).a().a() == si.d) {
            return 300;
         } else if (var1 == SZ.a((nh)RQ.by)) {
            return 16000;
         } else if (var1 instanceof LN && ((LN)var1).a() == Tw.a) {
            return 200;
         } else if (var1 instanceof LM && Tw.a == ((LM)var1).a()) {
            return 200;
         } else if (var1 instanceof Uw && "WOOD".equals(((Uw)var1).a())) {
            return 200;
         } else if (var1 == RT.A) {
            return 100;
         } else if (var1 != RT.a && var1 != RT.a) {
            if (var1 == RT.X) {
               return 200;
            } else if (var1 == RT.j) {
               return 1600;
            } else if (var1 == RT.ag) {
               return 20000;
            } else if (var1 != SZ.a((nh)RQ.f) && var1 != RT.B) {
               if (var1 == RT.bf) {
                  return 2400;
               } else if (var1 instanceof TZ && var1 != RT.aj) {
                  return 200;
               } else {
                  return var1 instanceof TJ ? 400 : 0;
               }
            } else {
               return 100;
            }
         } else {
            return 300;
         }
      }
   }

   public static boolean a(Vh var0) {
      return b(var0) > 0;
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
      if (var1 == 2) {
         return false;
      } else if (var1 != 1) {
         return true;
      } else {
         Vh var3 = (Vh)this.a.get(1);
         return a(var2) || SR.b(var2) && var3.a() != RT.ae;
      }
   }

   public String a() {
      return "minecraft:furnace";
   }

   public RY a(Rs var1, Rn var2) {
      return new Sl(var1, this);
   }

   public int getField(int var1) {
      switch(var1) {
      case 0:
         return this.d;
      case 1:
         return this.e;
      case 2:
         return this.f;
      case 3:
         return this.g;
      default:
         return 0;
      }
   }

   public void setField(int var1, int var2) {
      switch(var1) {
      case 0:
         this.d = var2;
         break;
      case 1:
         this.e = var2;
         break;
      case 2:
         this.f = var2;
         break;
      case 3:
         this.g = var2;
      }

   }

   public int getFieldCount() {
      return 4;
   }

   public void clear() {
      this.a.clear();
   }
}
