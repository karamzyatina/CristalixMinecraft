import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Set;

public final class IS implements IP {
   public final IP a;

   public IS(IP var1) {
      this.a = var1;
   }

   public InputStream a(acC var1) {
      return this.a.a(a(var1));
   }

   private static acC a(acC var0) {
      String var1 = var0.getPath();
      if (!"lang/swg_de.lang".equals(var1) && var1.startsWith("lang/") && var1.endsWith(".lang")) {
         int var2 = var1.indexOf(95);
         if (var2 != -1) {
            String var3 = var1.substring(0, var2 + 1) + var1.substring(var2 + 1, var1.indexOf(46, var2)).toUpperCase() + ".lang";
            return new acC(var0.getNamespace(), var3);
         }
      }

      return var0;
   }

   public boolean a(acC var1) {
      return this.a.a(a(var1));
   }

   public InputStream b(acC var1) {
      return this.a.b(a(var1));
   }

   public Set<String> getResourceDomains() {
      return this.a.getResourceDomains();
   }

   public <T extends Jw> T a(JA var1, String var2) {
      return this.a.a(var1, var2);
   }

   public BufferedImage getPackImage() {
      return this.a.getPackImage();
   }

   public String getPackName() {
      return this.a.getPackName();
   }

   public ajr a(String var1, acC var2) {
      return this.a.a(var1, a(var2));
   }

   public Ln a(acC var1) {
      return this.a.a(a(var1));
   }

   public Dm a(acC var1) {
      return this.a.a(a(var1));
   }

   public Dr a(acC var1) {
      return this.a.a(a(var1));
   }
}
