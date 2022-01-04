import java.util.HashMap;
import java.util.Map;

public enum JU {
   VERTEX("vertex", ".vsh", Ci.l),
   FRAGMENT("fragment", ".fsh", Ci.m);

   private final String shaderName;
   private final String shaderExtension;
   private final int shaderMode;
   private final Map<String, JT> loadedShaders = new HashMap();

   private JU(String var3, String var4, int var5) {
      this.shaderName = var3;
      this.shaderExtension = var4;
      this.shaderMode = var5;
   }

   public String a() {
      return this.shaderName;
   }

   private String b() {
      return this.shaderExtension;
   }

   private int a() {
      return this.shaderMode;
   }

   private Map<String, JT> a() {
      return this.loadedShaders;
   }

   // $FF: synthetic method
   static Map a(JU var0) {
      return var0.a();
   }

   // $FF: synthetic method
   static String a(JU var0) {
      return var0.b();
   }

   // $FF: synthetic method
   static int a(JU var0) {
      return var0.a();
   }
}
