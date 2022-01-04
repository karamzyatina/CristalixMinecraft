import com.google.common.base.Joiner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class akA implements akj {
   protected File a;
   protected ZipFile a;
   protected String a;

   public akA(String var1, File var2) {
      this.a = var2;
      this.a = null;
      this.a = "";
   }

   public void a() {
      if (this.a != null) {
         try {
            this.a.close();
         } catch (Exception var2) {
         }

         this.a = null;
      }

   }

   public InputStream a(String var1) {
      try {
         if (this.a == null) {
            this.a = new ZipFile(this.a);
            this.a = this.a(this.a);
         }

         String var2 = ami.a(var1, "/");
         if (var2.contains("..")) {
            var2 = this.a(var2);
         }

         ZipEntry var3 = this.a.getEntry(this.a + var2);
         return var3 == null ? null : this.a.getInputStream(var3);
      } catch (Exception var4) {
         return null;
      }
   }

   private String a(String var1) {
      ArrayDeque var2 = new ArrayDeque();
      String[] var3 = afT.a(var1, "/");

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (var5.equals("..")) {
            if (var2.isEmpty()) {
               return "";
            }

            var2.removeLast();
         } else {
            var2.add(var5);
         }
      }

      String var6 = Joiner.on('/').join(var2);
      return var6;
   }

   private String a(ZipFile var1) {
      ZipEntry var2 = var1.getEntry("shaders/");
      if (var2 != null && var2.isDirectory()) {
         return "";
      } else {
         Pattern var3 = Pattern.compile("([^/]+/)shaders/");
         Enumeration var4 = var1.entries();

         while(var4.hasMoreElements()) {
            ZipEntry var5 = (ZipEntry)var4.nextElement();
            String var6 = var5.getName();
            Matcher var7 = var3.matcher(var6);
            if (var7.matches()) {
               String var8 = var7.group(1);
               if (var8 != null) {
                  if (var8.equals("shaders/")) {
                     return "";
                  }

                  return var8;
               }
            }
         }

         return "";
      }
   }

   public boolean a(String var1) {
      try {
         if (this.a == null) {
            this.a = new ZipFile(this.a);
            this.a = this.a(this.a);
         }

         String var2 = ami.a(var1, "/");
         ZipEntry var3 = this.a.getEntry(this.a + var2);
         return var3 != null;
      } catch (IOException var4) {
         return false;
      }
   }

   public String a() {
      return this.a.getName();
   }
}
