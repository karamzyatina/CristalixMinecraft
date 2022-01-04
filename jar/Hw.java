import java.util.Calendar;

public final class HW extends Ik {
   private static final Lg a = new Lg("textures/entity/chest/trapped_double.png");
   private static final acC a;
   private static final Lg b;
   private static final acC b;
   private static final Lg c;
   private static final acC c;
   private static final Lg d;
   private static final acC d;
   private static final Lg e;
   private static final acC e;
   private static final Lg f;
   private static final acC f;
   public xi a;
   public xi b;
   private boolean a;

   public HW(sE var1) {
      super(var1);
      this.a = new xi(var1);
      this.b = new xz(var1);
      Calendar var2 = Calendar.getInstance();
      if (var2.get(2) + 1 == 12 && var2.get(5) >= 13 && var2.get(5) <= 30) {
         this.a = true;
      }

   }

   public void a(aaM var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      By.j();
      By.c(515);
      By.a(true);
      int var11;
      if (var1.a()) {
         nh var12 = var1.a();
         var11 = var1.a();
         if (var12 instanceof nB && var11 == 0) {
            var11 = var1.a();
         }

         var1.g();
      } else {
         var11 = 0;
      }

      if (var1.a == null && var1.c == null) {
         xi var16;
         if (var1.b == null && var1.d == null) {
            var16 = this.a;
            if (var9 >= 0) {
               this.a(a[var9]);
               By.l(5890);
               By.C();
               By.b(4.0F, 4.0F, 1.0F);
               By.c(0.0625F, 0.0625F, 0.0625F);
               By.l(5888);
            } else if (!this.a && !var1.c()) {
               if (var1.a() == nC.TRAP) {
                  this.a(d);
               } else {
                  this.a(f);
               }
            } else {
               this.a(e);
            }
         } else {
            var16 = this.b;
            if (var9 >= 0) {
               this.a(a[var9]);
               By.l(5890);
               By.C();
               By.b(8.0F, 4.0F, 1.0F);
               By.c(0.0625F, 0.0625F, 0.0625F);
               By.l(5888);
            } else if (this.a) {
               this.a(b);
            } else if (var1.a() == nC.TRAP) {
               this.a(a);
            } else {
               this.a(c);
            }
         }

         By.C();
         By.z();
         if (var9 < 0) {
            By.c(1.0F, 1.0F, 1.0F, var10);
         }

         By.c((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         By.b(1.0F, -1.0F, -1.0F);
         By.c(0.5F, 0.5F, 0.5F);
         short var13 = 0;
         if (var11 == 2) {
            var13 = 180;
         }

         if (var11 == 3) {
            var13 = 0;
         }

         if (var11 == 4) {
            var13 = 90;
         }

         if (var11 == 5) {
            var13 = -90;
         }

         if (var11 == 2 && var1.b != null) {
            By.c(1.0F, 0.0F, 0.0F);
         }

         if (var11 == 5 && var1.d != null) {
            By.c(0.0F, 0.0F, -1.0F);
         }

         By.b((float)var13, 0.0F, 1.0F, 0.0F);
         By.c(-0.5F, -0.5F, -0.5F);
         float var14 = var1.b + (var1.a - var1.b) * var8;
         float var15;
         if (var1.a != null) {
            var15 = var1.a.b + (var1.a.a - var1.a.b) * var8;
            if (var15 > var14) {
               var14 = var15;
            }
         }

         if (var1.c != null) {
            var15 = var1.c.b + (var1.c.a - var1.c.b) * var8;
            if (var15 > var14) {
               var14 = var15;
            }
         }

         var14 = 1.0F - var14;
         var14 = 1.0F - var14 * var14 * var14;
         var16.a.f = -(var14 * 1.5707964F);
         var16.a();
         By.A();
         By.D();
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         if (var9 >= 0) {
            By.l(5890);
            By.D();
            By.l(5888);
         }
      }

   }

   static {
      a = a;
      b = new Lg("textures/entity/chest/christmas_double.png");
      b = b;
      c = new Lg("textures/entity/chest/normal_double.png");
      c = c;
      d = new Lg("textures/entity/chest/trapped.png");
      d = d;
      e = new Lg("textures/entity/chest/christmas.png");
      e = e;
      f = new Lg("textures/entity/chest/normal.png");
      f = f;
   }
}
