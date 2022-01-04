import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum adX {
   OVERWORLD(0, "overworld", "", aer.class),
   NETHER(-1, "the_nether", "_nether", aep.class),
   THE_END(1, "the_end", "_end", aeo.class);

   private final int id;
   private final String name;
   private final String suffix;
   private final Class<? extends aen> clazz;

   private adX(int var3, String var4, String var5, Class<? extends aen> var6) {
      this.id = var3;
      this.name = var4;
      this.suffix = var5;
      this.clazz = var6;
   }

   public int a() {
      return this.id;
   }

   public String a() {
      return this.name;
   }

   public String b() {
      return this.suffix;
   }

   public aen a() {
      try {
         Constructor var1 = this.clazz.getConstructor();
         return (aen)var1.newInstance();
      } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException var2) {
         throw new Error("Could not create new dimension", var2);
      }
   }

   public static adX a(int var0) {
      adX[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         adX var4 = var1[var3];
         if (var4.a() == var0) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid dimension id " + var0);
   }

   public static adX a(String var0) {
      adX[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         adX var4 = var1[var3];
         if (var4.a().equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid dimension " + var0);
   }
}
