import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class aaI extends abc implements SG, aci {
   public static final ZV[][] a;
   private static final Set<ZV> a;
   private final List<aaJ> a = new ArrayList();
   private long a;
   private float a;
   private boolean b;
   private int d = -1;
   private ZV a;
   private ZV b;
   private Vh a;
   public String a;

   public aaI() {
      this.a = Vh.a;
   }

   public void a() {
      if (this.a.a() % 80L == 0L) {
         this.g();
      }

   }

   public void g() {
      if (this.a != null) {
         this.h();
      }

   }

   private void h() {
      int var1 = this.a;
      int var2 = this.b;
      int var3 = this.c;
      this.d = 0;
      this.a.clear();
      this.b = true;
      aaJ var4 = new aaJ(SW.WHITE.a());
      this.a.add(var4);
      boolean var5 = true;

      int var6;
      for(var6 = var2 + 1; var6 < 256; ++var6) {
         sD var7 = this.a.a(var1, var6, var3);
         float[] var8;
         if (var7.a() == RQ.a) {
            var8 = ((SW)var7.a((so)rl.a)).a();
         } else {
            if (var7.a() != RQ.a) {
               if (var7.getLightOpacity() >= 15 && var7.a() != RQ.g) {
                  this.b = false;
                  this.a.clear();
                  break;
               }

               var4.a();
               continue;
            }

            var8 = ((SW)var7.a((so)rm.a)).a();
         }

         if (!var5) {
            var8 = new float[]{(var4.a()[0] + var8[0]) / 2.0F, (var4.a()[1] + var8[1]) / 2.0F, (var4.a()[2] + var8[2]) / 2.0F};
         }

         if (Arrays.equals(var8, var4.a())) {
            var4.a();
         } else {
            var4 = new aaJ(var8);
            this.a.add(var4);
         }

         var5 = false;
      }

      if (this.b) {
         for(var6 = 1; var6 <= 4; this.d = var6++) {
            int var12 = var2 - var6;
            if (var12 < 0) {
               break;
            }

            boolean var13 = true;

            for(int var9 = var1 - var6; var9 <= var1 + var6 && var13; ++var9) {
               for(int var10 = var3 - var6; var10 <= var3 + var6; ++var10) {
                  nh var11 = this.a.a(var9, var12, var10).a();
                  if (var11 != RQ.ba && var11 != RQ.y && var11 != RQ.J && var11 != RQ.z) {
                     var13 = false;
                     break;
                  }
               }
            }

            if (!var13) {
               break;
            }
         }

         if (this.d == 0) {
            this.b = false;
         }
      }

   }

   public List<aaJ> a() {
      return this.a;
   }

   public float a() {
      if (!this.b) {
         return 0.0F;
      } else {
         int var1 = (int)(this.a.a() - this.a);
         this.a = this.a.a();
         if (var1 > 1) {
            this.a -= (float)var1 / 40.0F;
            if (this.a < 0.0F) {
               this.a = 0.0F;
            }
         }

         this.a += 0.025F;
         if (this.a > 1.0F) {
            this.a = 1.0F;
         }

         return this.a;
      }
   }

   public int e() {
      return this.d;
   }

   public VR a() {
      return this.a(new VR());
   }

   public double a() {
      return 65536.0D;
   }

   private static ZV a(int var0) {
      ZV var1 = ZV.a(var0);
      return a.contains(var1) ? var1 : null;
   }

   public void a(VR var1) {
      super.a(var1);
      this.a = a(var1.getInteger("Primary"));
      this.b = a(var1.getInteger("Secondary"));
      this.d = var1.getInteger("Levels");
   }

   public VR a(VR var1) {
      super.a(var1);
      var1.a("Primary", ZV.a(this.a));
      var1.a("Secondary", ZV.a(this.b));
      var1.a("Levels", this.d);
      return var1;
   }

   public int getSizeInventory() {
      return 1;
   }

   public boolean isEmpty() {
      return this.a.isEmpty();
   }

   public Vh a(int var1) {
      return var1 == 0 ? this.a : Vh.a;
   }

   public Vh a(int var1, int var2) {
      if (var1 == 0 && !this.a.isEmpty()) {
         if (var2 >= this.a.getCount()) {
            Vh var3 = this.a;
            this.a = Vh.a;
            return var3;
         } else {
            return this.a.a(var2);
         }
      } else {
         return Vh.a;
      }
   }

   public Vh b(int var1) {
      if (var1 == 0) {
         Vh var2 = this.a;
         this.a = Vh.a;
         return var2;
      } else {
         return Vh.a;
      }
   }

   public void a(int var1, Vh var2) {
      if (var1 == 0) {
         this.a = var2;
      }

   }

   public String getName() {
      return this.hasCustomName() ? this.a : "container.beacon";
   }

   public boolean hasCustomName() {
      return this.a != null && !this.a.isEmpty();
   }

   public void a(String var1) {
      this.a = var1;
   }

   public int getInventoryStackLimit() {
      return 1;
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
      return var2.a() == RT.by || var2.a() == RT.k || var2.a() == RT.m || var2.a() == RT.l;
   }

   public String a() {
      return "minecraft:beacon";
   }

   public RY a(Rs var1, Rn var2) {
      return new RZ(var1, this);
   }

   public int getField(int var1) {
      switch(var1) {
      case 0:
         return this.d;
      case 1:
         return ZV.a(this.a);
      case 2:
         return ZV.a(this.b);
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
         this.a = a(var2);
         break;
      case 2:
         this.b = a(var2);
      }

   }

   public int getFieldCount() {
      return 3;
   }

   public void clear() {
      this.a = Vh.a;
   }

   public boolean a(int var1, int var2) {
      if (var1 == 1) {
         this.g();
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   static {
      a = new ZV[][]{{RU.a, RU.c}, {RU.k, RU.h}, {RU.e}, {RU.j}};
      a = new HashSet();
      ZV[][] var0 = a;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         ZV[] var3 = var0[var2];
         Collections.addAll(a, var3);
      }

   }
}
