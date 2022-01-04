import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import dev.xdark.feder.IOUtil;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.Logger;

public class IU {
   private static final Logger a;
   private final Map<acC, File> a = new Object2ReferenceOpenHashMap(1305, 1.0F);

   protected IU() {
   }

   public IU(File var1, String var2) {
      File var3 = new File(var1, "objects");
      File var4 = new File(var1, "indexes/" + var2 + ".json");
      JsonObject var5 = null;

      try {
         BufferedReader var6 = IOUtil.toBufferedReader(Files.newInputStream(var4.toPath()), LB.a());
         Throwable var7 = null;

         try {
            var5 = JsonParser.parseReader(var6).getAsJsonObject();
         } catch (Throwable var22) {
            var7 = var22;
            throw var22;
         } finally {
            if (var6 != null) {
               if (var7 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var21) {
                     var7.addSuppressed(var21);
                  }
               } else {
                  var6.close();
               }
            }

         }
      } catch (JsonParseException var24) {
         a.error("Unable to parse resource index file: {}", var4);
      } catch (IOException var25) {
         a.error("Unable to read the resource index file: {}", var4);
      }

      if (var5 != null) {
         JsonObject var26 = acn.a(var5, "objects", (JsonObject)null);
         if (var26 != null) {
            Iterator var27 = var26.entrySet().iterator();

            while(var27.hasNext()) {
               Entry var8 = (Entry)var27.next();
               JsonObject var9 = (JsonObject)var8.getValue();
               String var10 = (String)var8.getKey();
               String[] var11 = var10.split("/", 2);
               String var12 = var11.length == 1 ? var11[0] : var11[0] + ':' + var11[1];
               String var13 = acn.a(var9, "hash");
               File var14 = new File(var3, var13.substring(0, 2) + '/' + var13);
               this.a.put(new acC(var12), var14);
            }
         }
      }

   }

   public File a(acC var1) {
      return (File)this.a.get(var1);
   }

   public boolean a(acC var1) {
      File var2 = this.a(var1);
      return var2 != null && var2.isFile();
   }

   public File a() {
      return (File)this.a.get(new acC("pack.mcmeta"));
   }

   static {
      a = sE.a;
   }
}
