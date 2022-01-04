import java.util.Random;

public final class Nd extends MT {
   protected Nd(MU var1, SB... var2) {
      super(var1, NA.BREAKABLE, var2);
      this.b("durability");
   }

   public int a(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 3;
   }

   public boolean a(Vh var1) {
      return var1.a() || super.a(var1);
   }

   public static boolean a(Vh var0, int var1, Random var2) {
      if (var0.a() instanceof TA && var2.nextFloat() < 0.6F) {
         return false;
      } else {
         return var2.nextInt(var1 + 1) > 0;
      }
   }
}
