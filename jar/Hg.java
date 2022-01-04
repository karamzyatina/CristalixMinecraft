import dev.xdark.feder.IOUtil;
import org.apache.logging.log4j.Logger;

public class HG extends Hx {
   private static final Logger a;
   protected final acC a;
   public acC b;
   public boolean e;

   public HG(acC var1) {
      this.a = var1;
   }

   public void a(IN var1) {
      this.deleteGlTexture();
      IM var2 = null;
      boolean var3 = false;
      boolean var4 = false;

      Ln var5;
      try {
         var2 = var1.a(this.a);
         var5 = var2.a();
         if (var2.a()) {
            try {
               JF var6 = (JF)var2.a("texture");
               if (var6 != null) {
                  var3 = var6.a();
                  var4 = var6.b();
               }
            } catch (RuntimeException var10) {
               a.warn("Failed reading metadata of: {}", this.a, var10);
            }
         }
      } finally {
         IOUtil.closeQuietly(var2);
      }

      if (afT.ad()) {
         akG.a(this.getGlTextureId(), var5.a, var3, var4, var1, this.a, this.a());
      } else {
         HS.a(this.getGlTextureId(), var5, var3, var4);
      }

      if (agp.a()) {
         agp.a(var1, this.a, this);
      }

   }

   static {
      a = sE.a;
   }
}
