import java.nio.FloatBuffer;

public final class Co {
   private static final FloatBuffer a = Bx.a(4);
   private static final adm a = (new adm(0.20000000298023224D, 1.0D, -0.699999988079071D)).a();
   private static final adm b = (new adm(-0.20000000298023224D, 1.0D, 0.699999988079071D)).a();

   public static void a() {
      By.f();
      By.b(0);
      By.b(1);
      By.h();
   }

   public static void b() {
      adm var0 = a;
      adm var1 = b;
      By.e();
      By.a(0);
      By.a(1);
      By.g();
      By.a(1032, 5634);
      By.a(16384, 4611, (FloatBuffer)a(var0.a, var0.b, var0.c, 0.0D));
      By.a(16384, 4609, (FloatBuffer)a(0.6F, 0.6F, 0.6F, 1.0F));
      By.a(16384, 4608, (FloatBuffer)a(0.0F, 0.0F, 0.0F, 1.0F));
      By.a(16384, 4610, (FloatBuffer)a(0.0F, 0.0F, 0.0F, 1.0F));
      By.a(16385, 4611, (FloatBuffer)a(var1.a, var1.b, var1.c, 0.0D));
      By.a(16385, 4609, (FloatBuffer)a(0.6F, 0.6F, 0.6F, 1.0F));
      By.a(16385, 4608, (FloatBuffer)a(0.0F, 0.0F, 0.0F, 1.0F));
      By.a(16385, 4610, (FloatBuffer)a(0.0F, 0.0F, 0.0F, 1.0F));
      By.j(7424);
      By.a(2899, (FloatBuffer)a(0.4F, 0.4F, 0.4F, 1.0F));
   }

   private static FloatBuffer a(double var0, double var2, double var4, double var6) {
      return a((float)var0, (float)var2, (float)var4, (float)var6);
   }

   public static FloatBuffer a(float var0, float var1, float var2, float var3) {
      FloatBuffer var4 = a;
      var4.clear();
      var4.put(var0).put(var1).put(var2).put(var3).flip();
      return var4;
   }

   public static void c() {
      By.C();
      By.b(-30.0F, 0.0F, 1.0F, 0.0F);
      By.b(165.0F, 1.0F, 0.0F, 0.0F);
      b();
      By.D();
   }
}
