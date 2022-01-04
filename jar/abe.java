import java.util.Random;

public final class abE {
   private static final abE a = new abE();
   private final Random a = new Random();
   private final String[] a = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale phnglui mglwnafh cthulhu rlyeh wgahnagl fhtagnbaguette".split(" ");

   public static abE a() {
      return a;
   }

   public String a(tI var1, int var2) {
      int var3 = this.a.nextInt(2) + 3;
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var5 < var3; ++var5) {
         if (var5 > 0) {
            var4.append(' ');
         }

         var4.append(this.a[this.a.nextInt(this.a.length)]);
      }

      String[] var6 = var1.a(var4.toString(), var2, 3);
      return String.join(" ", var6);
   }

   public void a(long var1) {
      this.a.setSeed(var1);
   }
}
