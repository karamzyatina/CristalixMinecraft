import org.apache.logging.log4j.Logger;

public final class JS {
   private static final Logger a;
   private static final JS a;

   public static JS a() {
      return a;
   }

   public void a(JV var1) {
      var1.b().b(var1);
      var1.a().b(var1);
      Ci.d(var1.a());
   }

   public int a() {
      int var1 = Ci.a();
      if (var1 <= 0) {
         throw new Kb("Could not create shader program (returned program ID " + var1 + ')');
      } else {
         return var1;
      }
   }

   public void b(JV var1) {
      var1.b().a(var1);
      var1.a().a(var1);
      Ci.e(var1.a());
      int var2 = Ci.a(var1.a(), Ci.j);
      if (var2 == 0) {
         a.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", var1.a().a(), var1.b().a());
         a.warn(Ci.b(var1.a(), 32768));
      }

   }

   static {
      a = sE.a;
      a = new JS();
   }
}
