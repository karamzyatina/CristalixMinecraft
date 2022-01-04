import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public class lf implements kN {
   private final lg[] a;

   public lf(lg... var1) {
      this.a = var1;
   }

   public Path a(String var1) {
      Path var2 = Paths.get(var1);
      if (this.a != null) {
         lg[] var3 = this.a;
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            lg var6 = var3[var5];
            if (!var6.a(var2)) {
               throw new kM(this.a(var6.a(), var2.toString()));
            }
         }
      }

      return var2;
   }

   public Class<Path> a() {
      return Path.class;
   }

   public String a() {
      return null;
   }

   private String a(String var1, String var2) {
      ResourceBundle var3 = ResourceBundle.getBundle("joptsimple.ExceptionMessages");
      Object[] var4 = new Object[]{var2, this.a()};
      String var5 = var3.getString(lf.class.getName() + "." + var1 + ".message");
      return (new MessageFormat(var5)).format(var4);
   }
}
