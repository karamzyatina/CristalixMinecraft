import dev.xdark.feder.IOUtil;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class Jj {
   private final IP a;
   private JD a;
   private acC a;
   // $FF: synthetic field
   final Jc a;

   private Jj(Jc var1, File var2) {
      this(var1, var1.a(var2));
   }

   public Jj(Jc var1, IP var2) {
      this.a = var1;
      this.a = var2;
   }

   public void a() {
      this.a = (JD)this.a.a(this.a.a, "pack");
      this.b();
   }

   public void a(HM var1) {
      BufferedImage var2 = null;
      if (this.a == null) {
         try {
            var2 = this.a.getPackImage();
         } catch (IOException var5) {
         }

         if (var2 == null) {
            try {
               Ln var3 = Jc.a(this.a).a().b(Jc.a());
               var2 = var3.a;
            } catch (IOException var4) {
               throw new Error("Couldn't bind resource pack icon", var4);
            }
         }
      }

      if (this.a == null) {
         this.a = var1.a("texturepackicon", new Hy(var2));
      }

      var1.a(this.a);
   }

   public void b() {
      if (this.a instanceof Closeable) {
         IOUtil.closeQuietly((Closeable)this.a);
      }

   }

   public IP a() {
      return this.a;
   }

   public String a() {
      return this.a.getPackName();
   }

   public String b() {
      return this.a == null ? adH.RED + "Invalid pack.mcmeta (or missing 'pack' section)" : this.a.a().getFormattedText();
   }

   public int a() {
      return this.a == null ? 0 : this.a.a();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof Jj && this.toString().equals(var1.toString());
      }
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   public String toString() {
      return String.format("%s:%s", this.a.getPackName(), this.a instanceof IH ? "folder" : "zip");
   }

   // $FF: synthetic method
   Jj(Jc var1, File var2, Jd var3) {
      this(var1, var2);
   }
}
