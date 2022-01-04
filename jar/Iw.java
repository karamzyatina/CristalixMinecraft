import java.io.File;
import java.io.FileNotFoundException;

public final class IW extends FileNotFoundException {
   public IW(File var1, String var2) {
      super(String.format("'%s' in ResourcePack '%s'", var2, var1));
   }

   public IW(String var1, String var2) {
      super(String.format("'%s' in ResourcePack '%s'", var2, var1));
   }
}
