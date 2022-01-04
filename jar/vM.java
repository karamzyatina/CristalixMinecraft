import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class vm implements up {
   private static final Logger a;
   private static final acC a;
   private static final acC b;
   private final uw a;
   private final sE a;
   private final yt a;
   private final acC c;
   private String a;
   private Hy a;
   private long a;

   protected vm(sE var1, uw var2, yt var3) {
      this.a = var2;
      this.a = var3;
      this.a = var1;
      this.c = new acC("servers/" + var3.b + "/icon");
      this.a = (Hy)this.a.a().a(this.c);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      if (!this.a.a) {
         this.a.a = true;
         this.a.a = -2L;
         this.a.d = "";
         this.a.c = "";
         La.a((Runnable)(new vn(this)));
      }

      boolean var10 = this.a.a > 340;
      boolean var11 = this.a.a < 340;
      boolean var12 = var10 || var11;
      this.a.a.a(this.a.a, var2 + 32 + 3, var3 + 1, 16777215);
      List var13 = this.a.a.listFormattedStringToWidth(this.a.d, var4 - 32 - 2);

      for(int var14 = 0; var14 < Math.min(var13.size(), 2); ++var14) {
         this.a.a.a((String)var13.get(var14), var2 + 32 + 3, var3 + 12 + this.a.a.a * var14, 8421504);
      }

      String var25 = var12 ? adH.DARK_RED + this.a.e : this.a.c;
      int var15 = this.a.a.getStringWidth(var25);
      this.a.a.a(var25, var2 + var4 - var15 - 15 - 2, var3 + 1, 8421504);
      byte var16 = 0;
      String var17 = null;
      int var18;
      String var19;
      if (var12) {
         var18 = 5;
         var19 = IK.a(var10 ? "multiplayer.status.client_out_of_date" : "multiplayer.status.server_out_of_date");
         var17 = this.a.f;
      } else if (this.a.a && this.a.a != -2L) {
         if (this.a.a < 0L) {
            var18 = 5;
         } else if (this.a.a < 150L) {
            var18 = 0;
         } else if (this.a.a < 300L) {
            var18 = 1;
         } else if (this.a.a < 600L) {
            var18 = 2;
         } else if (this.a.a < 1000L) {
            var18 = 3;
         } else {
            var18 = 4;
         }

         if (this.a.a < 0L) {
            var19 = IK.a("multiplayer.status.no_connection");
         } else {
            var19 = this.a.a + "ms";
            var17 = this.a.f;
         }
      } else {
         var16 = 1;
         var18 = (int)(sE.a() / 100L + (long)(var1 * 2) & 7L);
         if (var18 > 4) {
            var18 = 8 - var18;
         }

         var19 = IK.a("multiplayer.status.pinging");
      }

      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.a().a(tJ.b);
      Cw var20 = this.a.a;
      tJ.a(var20, var2 + var4 - 15, var3, (float)(var16 * 10), (float)(176 + var18 * 8), 10, 8, 256.0F, 256.0F);
      if (this.a.a() != null && !this.a.a().equals(this.a)) {
         this.a = this.a.a();
         this.a();
         this.a.a().b();
      }

      if (this.a != null) {
         this.a(var2, var3, this.c);
      } else {
         this.a(var2, var3, a);
      }

      int var21 = var6 - var2;
      int var22 = var7 - var3;
      if (var21 >= var4 - 15 && var21 <= var4 - 5 && var22 >= 0 && var22 <= 8) {
         this.a.a(var19);
      } else if (var21 >= var4 - var15 - 15 - 2 && var21 <= var4 - 15 - 2 && var22 >= 0 && var22 <= 8) {
         this.a.a(var17);
      }

      if (JI.n || var8) {
         this.a.a().c(b);
         tJ.a(var20, var2, var3, var2 + 32, var3 + 32, -1601138544);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         int var23 = var6 - var2;
         int var24 = var7 - var3;
         if (this.a()) {
            if (var23 < 32 && var23 > 16) {
               tJ.a(var20, var2, var3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
               tJ.a(var20, var2, var3, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
         }

         if (this.a.a(this, var1)) {
            if (var23 < 16 && var24 < 16) {
               tJ.a(var20, var2, var3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
               tJ.a(var20, var2, var3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
         }

         if (this.a.b(this, var1)) {
            if (var23 < 16 && var24 > 16) {
               tJ.a(var20, var2, var3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
               tJ.a(var20, var2, var3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
         }
      }

   }

   protected void a(int var1, int var2, acC var3) {
      this.a.a().a(var3);
      By.l();
      tJ.a(this.a.a, var1, var2, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
      By.k();
   }

   private boolean a() {
      return true;
   }

   private void a() {
      if (this.a.a() == null) {
         this.a.a().e(this.c);
         this.a = null;
      } else {
         ByteBuf var1 = Unpooled.copiedBuffer(this.a.a(), StandardCharsets.UTF_8);
         ByteBuf var2 = null;

         BufferedImage var3;
         label99: {
            try {
               var2 = Base64.decode(var1);
               var3 = HS.a(new ByteBufInputStream(var2));
               Preconditions.checkState(var3.getWidth() == 64, "Must be 64 pixels wide");
               Preconditions.checkState(var3.getHeight() == 64, "Must be 64 pixels high");
               break label99;
            } catch (Throwable var8) {
               a.error("Invalid icon for server {} ({})", this.a.a, this.a.b, var8);
               this.a.a((String)null);
            } finally {
               var1.release();
               if (var2 != null) {
                  var2.release();
               }

            }

            return;
         }

         if (this.a == null) {
            this.a = new Hy(var3.getWidth(), var3.getHeight());
            this.a.a().a((acC)this.c, (HA)this.a);
         }

         var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), this.a.getTextureData(), 0, var3.getWidth());
         this.a.updateDynamicTexture();
      }

   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 <= 32) {
         if (var5 < 32 && var5 > 16 && this.a()) {
            this.a.a(var1);
            this.a.e();
            return true;
         }

         if (var5 < 16 && var6 < 16 && this.a.a(this, var1)) {
            this.a.a(this, var1, uI.b());
            return true;
         }

         if (var5 < 16 && var6 > 16 && this.a.b(this, var1)) {
            this.a.b(this, var1, uI.b());
            return true;
         }
      }

      this.a.a(var1);
      if (sE.a() - this.a < 250L) {
         this.a.e();
      }

      this.a = sE.a();
      return false;
   }

   public void a(int var1, int var2, int var3, float var4) {
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public yt a() {
      return this.a;
   }

   // $FF: synthetic method
   static yt a(vm var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static uw a(vm var0) {
      return var0.a;
   }

   static {
      a = sE.a;
      a = new acC("textures/misc/unknown_server.png");
      b = new acC("textures/gui/server_selection.png");
   }
}
