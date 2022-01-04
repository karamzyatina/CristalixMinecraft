import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.xdark.feder.IOUtil;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class akI extends Hx {
   private final String a;
   private static final JA a = a();

   public akI(String var1) {
      this.a = var1;
   }

   public void a(IN var1) {
      this.deleteGlTexture();
      InputStream var2 = akC.a(this.a);
      if (var2 == null) {
         throw new FileNotFoundException("Shader texture not found: " + this.a);
      } else {
         try {
            BufferedImage var3 = HS.a(var2);
            JF var4 = this.a();
            HS.a(this.getGlTextureId(), var3, var4.a(), var4.b());
         } finally {
            IOUtil.closeQuietly(var2);
         }

      }
   }

   private JF a() {
      String var1 = this.a + ".mcmeta";
      String var2 = "texture";
      InputStream var3 = akC.a(var1);
      if (var3 != null) {
         JA var4 = a;
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var3));

         JF var6;
         try {
            JF var8;
            try {
               JsonObject var7 = (new JsonParser()).parse(var5).getAsJsonObject();
               var8 = (JF)var4.a(var2, var7);
               if (var8 != null) {
                  JF var10 = var8;
                  return var10;
               }

               var6 = new JF(false, false);
            } catch (RuntimeException var14) {
               akt.b("Error reading metadata: " + var1);
               akt.b(var14.getClass().getName() + ": " + var14.getMessage());
               var8 = new JF(false, false);
               JF var9 = var8;
               return var9;
            }
         } finally {
            IOUtil.closeQuietly(var5);
            IOUtil.closeQuietly(var3);
         }

         return var6;
      } else {
         return new JF(false, false);
      }
   }

   private static JA a() {
      JA var0 = new JA();
      var0.a((Jx)(new JG()), (Class)JF.class);
      var0.a((Jx)(new Ju()), (Class)Jt.class);
      var0.a((Jx)(new JE()), (Class)JD.class);
      var0.a((Jx)(new Jz()), (Class)Jy.class);
      return var0;
   }
}
