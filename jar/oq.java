import java.lang.reflect.Constructor;
import java.util.Arrays;

public final class OQ {
   private static OQ<?>[] a = new OQ[0];
   public static final OQ<OM> a = a(OM.class, "HoldingPattern");
   public static final OQ<OW> b = a(OW.class, "StrafePlayer");
   public static final OQ<OP> c = a(OP.class, "LandingApproach");
   public static final OQ<OO> d = a(OO.class, "Landing");
   public static final OQ<OX> e = a(OX.class, "Takeoff");
   public static final OQ<OU> f = a(OU.class, "SittingFlaming");
   public static final OQ<OV> g = a(OV.class, "SittingScanning");
   public static final OQ<OS> h = a(OS.class, "SittingAttacking");
   public static final OQ<OK> i = a(OK.class, "ChargingPlayer");
   public static final OQ<OL> j = a(OL.class, "Dying");
   public static final OQ<ON> k = a(ON.class, "Hover");
   private final Class<? extends OI> a;
   private final int a;
   private final String a;

   private OQ(int var1, Class<? extends OI> var2, String var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public OI a(OG var1) {
      try {
         Constructor var2 = this.a();
         return (OI)var2.newInstance(var1);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends OI> a() {
      return this.a.getConstructor(OG.class);
   }

   public int a() {
      return this.a;
   }

   public String toString() {
      return this.a + " (#" + this.a + ')';
   }

   public static OQ<?> a(int var0) {
      return var0 >= 0 && var0 < a.length ? a[var0] : a;
   }

   public static int b() {
      return a.length;
   }

   private static <T extends OI> OQ<T> a(Class<T> var0, String var1) {
      OQ var2 = new OQ(a.length, var0, var1);
      a = (OQ[])((OQ[])((OQ[])Arrays.copyOf(a, a.length + 1)));
      a[var2.a()] = var2;
      return var2;
   }
}
