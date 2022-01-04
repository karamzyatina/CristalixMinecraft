import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

class Ji extends URLConnection {
   // $FF: synthetic field
   final Path a;
   // $FF: synthetic field
   final Jh a;

   Ji(Jh var1, URL var2, Path var3) {
      super(var2);
      this.a = var1;
      this.a = var3;
   }

   public void connect() {
   }

   public InputStream getInputStream() {
      return Files.newInputStream(this.a);
   }

   public long getContentLengthLong() {
      try {
         return Files.size(this.a);
      } catch (IOException var2) {
         return -1L;
      }
   }
}
