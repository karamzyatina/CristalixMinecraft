import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.resource.ResourcePack;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Set;

public interface IP extends ResourcePack {
   InputStream a(acC var1);

   InputStream b(acC var1);

   boolean a(acC var1);

   Set<String> getResourceDomains();

   <T extends Jw> T a(JA var1, String var2);

   BufferedImage getPackImage();

   String getPackName();

   default Dr a(acC var1) {
      InputStream var2 = this.b(var1);
      Throwable var3 = null;

      Dr var4;
      try {
         var4 = var2 == null ? null : Dr.a((Reader)(new InputStreamReader(var2, StandardCharsets.UTF_8)));
      } catch (Throwable var13) {
         var3 = var13;
         throw var13;
      } finally {
         if (var2 != null) {
            if (var3 != null) {
               try {
                  var2.close();
               } catch (Throwable var12) {
                  var3.addSuppressed(var12);
               }
            } else {
               var2.close();
            }
         }

      }

      return var4;
   }

   default Dm a(acC var1) {
      InputStream var2 = this.b(var1);
      Throwable var3 = null;

      Dm var4;
      try {
         var4 = var2 == null ? null : Dm.a((Reader)(new InputStreamReader(var2, StandardCharsets.UTF_8)));
      } catch (Throwable var13) {
         var3 = var13;
         throw var13;
      } finally {
         if (var2 != null) {
            if (var3 != null) {
               try {
                  var2.close();
               } catch (Throwable var12) {
                  var3.addSuppressed(var12);
               }
            } else {
               var2.close();
            }
         }

      }

      return var4;
   }

   default ajr a(String var1, acC var2) {
      InputStream var4 = this.b(var2);
      Throwable var5 = null;

      Object var6;
      try {
         if (var4 != null) {
            Properties var3 = new Properties();
            var3.load(var4);
            return new ajr(var3, var1);
         }

         var6 = null;
      } catch (Throwable var16) {
         var5 = var16;
         throw var16;
      } finally {
         if (var4 != null) {
            if (var5 != null) {
               try {
                  var4.close();
               } catch (Throwable var15) {
                  var5.addSuppressed(var15);
               }
            } else {
               var4.close();
            }
         }

      }

      return (ajr)var6;
   }

   default Ln a(acC var1) {
      InputStream var2 = this.b(var1);
      Throwable var3 = null;

      Ln var4;
      try {
         var4 = var2 == null ? null : new Ln(Lo.a(var2));
      } catch (Throwable var13) {
         var3 = var13;
         throw var13;
      } finally {
         if (var2 != null) {
            if (var3 != null) {
               try {
                  var2.close();
               } catch (Throwable var12) {
                  var3.addSuppressed(var12);
               }
            } else {
               var2.close();
            }
         }

      }

      return var4;
   }

   default boolean a() {
      return true;
   }

   default InputStream getInputStream(ResourceLocation var1) {
      return this.a((acC)var1);
   }

   default boolean resourceExists(ResourceLocation var1) {
      return this.a((acC)var1);
   }
}
