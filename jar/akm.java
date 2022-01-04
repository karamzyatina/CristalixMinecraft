import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class akM {
   public static InputStream a(sE var0, InputStream var1) {
      String var2 = afT.a(var1, StandardCharsets.US_ASCII);
      String var3 = a(var2);
      if (!var3.isEmpty()) {
         var2 = var3 + var2;
         var2 = a(var0, var2);
      }

      byte[] var4 = var2.getBytes(StandardCharsets.US_ASCII);
      return new ByteArrayInputStream(var4);
   }

   public static String a(sE var0, String var1) {
      StringReader var2 = new StringReader(var1);
      BufferedReader var3 = new BufferedReader(var2);
      akN var4 = new akN();
      StringBuilder var5 = new StringBuilder();

      while(true) {
         String var6 = var3.readLine();
         if (var6 == null) {
            var6 = var5.toString();
            return var6;
         }

         if (var4.a(var0, var6) && !akN.a(var6)) {
            var5.append(var6);
            var5.append('\n');
         }
      }
   }

   private static String a(String var0) {
      StringBuilder var1 = new StringBuilder();
      ArrayList var2 = null;
      StringReader var3 = new StringReader(var0);
      BufferedReader var4 = new BufferedReader(var3);

      while(true) {
         String var5;
         do {
            var5 = var4.readLine();
            if (var5 == null) {
               return var1.toString();
            }
         } while(!akN.a(var5));

         if (var1.length() == 0) {
            var1.append(akV.e());
         }

         if (var2 == null) {
            var2 = new ArrayList(Arrays.asList(akV.a()));
         }

         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            akU var7 = (akU)var6.next();
            if (var5.contains(var7.a())) {
               var1.append(var7.c());
               var1.append('\n');
               var6.remove();
            }
         }
      }
   }
}
