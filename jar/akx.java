import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class akX {
   private String d = null;
   private String e = null;
   private String f = null;
   private String[] a = null;
   private String g = null;
   private String[] b = null;
   private boolean a = true;
   private boolean b = true;
   public static final String a = "§a";
   public static final String b = "§c";
   public static final String c = "§9";

   public akX(String var1, String var2, String var3, String[] var4, String var5, String var6) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.a = var4;
      this.g = var5;
      if (var6 != null) {
         this.b = new String[]{var6};
      }

   }

   public String a() {
      return this.d;
   }

   public String b() {
      return this.e;
   }

   public String c() {
      String var1 = afT.a(this.e);
      var1 = ami.a(var1, "//");
      var1 = akC.a("option." + this.a() + ".comment", var1);
      return var1;
   }

   public void a(String var1) {
      this.e = var1;
   }

   public String d() {
      return this.f;
   }

   public boolean a(String var1) {
      int var2 = a(var1, this.a);
      if (var2 < 0) {
         return false;
      } else {
         this.f = var1;
         return true;
      }
   }

   public String e() {
      return this.g;
   }

   public void a() {
      this.f = this.g;
   }

   public void b() {
      int var1 = a(this.f, this.a);
      if (var1 >= 0) {
         var1 = (var1 + 1) % this.a.length;
         this.f = this.a[var1];
      }

   }

   public void c() {
      int var1 = a(this.f, this.a);
      if (var1 >= 0) {
         var1 = (var1 - 1 + this.a.length) % this.a.length;
         this.f = this.a[var1];
      }

   }

   private static int a(String var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         if (var3.equals(var0)) {
            return var2;
         }
      }

      return -1;
   }

   public String[] a() {
      return this.b;
   }

   public void a(String[] var1) {
      List var2 = Arrays.asList(this.b);

      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         if (!var2.contains(var4)) {
            this.b = (String[])((String[])afT.a((Object[])this.b, (Object)var4));
         }
      }

   }

   public boolean a() {
      return this.a;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public boolean b() {
      return !Objects.equals(this.f, this.g);
   }

   public boolean c() {
      return this.b;
   }

   public void b(boolean var1) {
      this.b = var1;
   }

   public boolean b(String var1) {
      return a(var1, this.a) >= 0;
   }

   public String f() {
      return akC.a("option." + this.d, this.d);
   }

   public String a(String var1) {
      return akC.a("value." + this.d + '.' + var1, var1);
   }

   public String b(String var1) {
      return "";
   }

   public boolean c(String var1) {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean d(String var1) {
      return false;
   }

   public String g() {
      return null;
   }

   public String[] b() {
      return (String[])((String[])this.a.clone());
   }

   public float a() {
      if (this.a.length <= 1) {
         return 0.0F;
      } else {
         int var1 = a(this.f, this.a);
         if (var1 < 0) {
            return 0.0F;
         } else {
            float var2 = 1.0F * (float)var1 / ((float)this.a.length - 1.0F);
            return var2;
         }
      }
   }

   public void a(float var1) {
      if (this.a.length > 1) {
         var1 = afT.a(var1, 0.0F, 1.0F);
         int var2 = Math.round(var1 * (float)(this.a.length - 1));
         this.f = this.a[var2];
      }

   }

   public String toString() {
      return this.d + ", value: " + this.f + ", valueDefault: " + this.g + ", paths: " + afT.a((Object[])this.b);
   }
}
