import com.google.common.base.CharMatcher;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class IH extends IC {
   private static final byte[] a = new byte[0];
   private static final boolean a;
   private static final CharMatcher a;
   private final MH<File> a;

   public IH(File var1, Void var2) {
      super(var1);
      this.a = La.a((IP)this);
   }

   public IH(File var1) {
      super(var1);
      this.a = null;
   }

   protected static boolean a(File var0, String var1) {
      String var2 = var0.getCanonicalPath();
      if (a) {
         var2 = a.replaceFrom(var2, '/');
      }

      return var2.endsWith(var1);
   }

   protected InputStream a(String var1) {
      File var2 = this.b(var1);
      if (var2 == null) {
         throw new IW(this.a, var1);
      } else {
         return this.a(var2);
      }
   }

   protected InputStream b(String var1) {
      File var2 = this.a(var1);
      MH var3 = this.a;
      if (var3 != null) {
         byte[] var4 = var3.a((Object)var2);
         if (var4 == a) {
            return null;
         } else if (var4 != null) {
            return new LD(var4);
         } else if (!var2.isFile()) {
            var3.a((Object)var2, (byte[])a);
            return null;
         } else {
            return this.a(var2);
         }
      } else {
         return !var2.isFile() ? null : this.a(var2);
      }
   }

   protected boolean a(String var1) {
      return this.b(var1) != null;
   }

   private File a(String var1) {
      return new File(this.a, var1);
   }

   private File b(String var1) {
      File var2 = new File(this.a, var1);
      return var2.isFile() ? var2 : null;
   }

   public Set<String> getResourceDomains() {
      File var1 = new File(this.a, "assets/");
      if (var1.isDirectory()) {
         HashSet var2 = new HashSet();
         File[] var3 = var1.listFiles((var0, var1x) -> {
            return (new File(var0, var1x)).isDirectory();
         });
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            String var7 = a((File)var1, (File)var6);
            if (var7.equals(var7.toLowerCase(Locale.ROOT))) {
               var2.add(var7.substring(0, var7.length() - 1));
            } else {
               this.a((String)var7);
            }
         }

         return var2;
      } else {
         return Collections.emptySet();
      }
   }

   private InputStream a(File var1) {
      MH var2 = this.a;
      if (var2 == null) {
         return new LE(new FileInputStream(var1));
      } else {
         byte[] var3 = var2.a((Object)var1);
         if (var3 != null) {
            return new LD(var3);
         } else {
            FileInputStream var4 = new FileInputStream(var1);
            Throwable var5 = null;

            try {
               var3 = La.a((InputStream)var4);
            } catch (Throwable var14) {
               var5 = var14;
               throw var14;
            } finally {
               if (var4 != null) {
                  if (var5 != null) {
                     try {
                        var4.close();
                     } catch (Throwable var13) {
                        var5.addSuppressed(var13);
                     }
                  } else {
                     var4.close();
                  }
               }

            }

            var2.a((Object)var1, (byte[])var3);
            return new LD(var3);
         }
      }
   }

   public Dr a(acC var1) {
      MH var2 = this.a;
      return var2 == null ? super.a((acC)var1) : var2.a(var1);
   }

   public Dm a(acC var1) {
      MH var2 = this.a;
      return var2 == null ? super.a((acC)var1) : var2.a(var1);
   }

   public ajr a(String var1, acC var2) {
      MH var3 = this.a;
      return var3 == null ? super.a((String)var1, (acC)var2) : var3.a(var1, var2);
   }

   public Ln a(acC var1) {
      MH var2 = this.a;
      return var2 == null ? super.a((acC)var1) : var2.a(var1);
   }

   static {
      a = acP.a() == acQ.WINDOWS;
      a = CharMatcher.is('\\');
   }
}
