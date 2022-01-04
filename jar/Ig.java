import dev.xdark.feder.IOUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class IG extends IC implements Closeable {
   private ZipFile a;
   private MH<String> a;

   public IG(File var1, MH<String> var2) {
      super(var1);
      this.a = var2;
   }

   public IG(File var1) {
      super(var1);
      this.a = null;
   }

   public void a(MH<String> var1) {
      this.a = var1;
   }

   private ZipFile a() {
      if (this.a == null) {
         this.a = new ZipFile(this.a);
      }

      return this.a;
   }

   protected InputStream a(String var1) {
      InputStream var2 = this.b(var1);
      if (var2 == null) {
         throw new IW(this.a, var1);
      } else {
         return var2;
      }
   }

   protected InputStream b(String var1) {
      MH var2 = this.a;
      if (var2 != null) {
         byte[] var3 = var2.a((Object)var1);
         if (var3 != null) {
            return new LD(var3);
         }
      }

      ZipFile var11 = this.a();
      ZipEntry var4 = var11.getEntry(var1);
      if (var4 == null) {
         return null;
      } else {
         InputStream var5 = var11.getInputStream(var4);
         if (var2 == null) {
            return new LE(var5);
         } else {
            LD var6;
            try {
               byte[] var7 = La.a(var5);
               var2.a((Object)var1, (byte[])var7);
               var6 = new LD(var7);
            } finally {
               IOUtil.closeQuietly(var5);
            }

            return var6;
         }
      }
   }

   public boolean a(String var1) {
      try {
         return this.a().getEntry(var1) != null;
      } catch (IOException var3) {
         return false;
      }
   }

   public Set<String> getResourceDomains() {
      ZipFile var1;
      try {
         var1 = this.a();
      } catch (IOException var8) {
         return Collections.emptySet();
      }

      Enumeration var2 = var1.entries();
      HashSet var3 = new HashSet();

      while(var2.hasMoreElements()) {
         ZipEntry var4 = (ZipEntry)var2.nextElement();
         String var5 = var4.getName();
         if (var5.startsWith("assets/")) {
            String[] var6 = var5.split("/", 3);
            if (var6.length > 1) {
               String var7 = var6[1];
               if (var7.equals(var7.toLowerCase(Locale.ROOT))) {
                  var3.add(var7);
               } else {
                  this.a((String)var7);
               }
            }
         }
      }

      return var3;
   }

   protected void finalize() {
      this.close();
      super.finalize();
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

   public void close() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }

   }
}
