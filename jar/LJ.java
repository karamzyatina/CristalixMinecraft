import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

enum lj {
   lj(String var3) {
   }

   boolean a(Path var1) {
      return Files.notExists(var1, new LinkOption[0]);
   }
}
