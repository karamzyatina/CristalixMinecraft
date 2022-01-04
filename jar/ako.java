import dev.xdark.feder.ArrayUtil;
import java.util.Properties;

public class akO {
   private int a = 0;
   private String a = null;
   private String[] a = null;
   private String b = null;
   private String[] b = null;
   private int b = 0;

   public akO(String var1, String[] var2, String var3, String[] var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.b = var4;
      this.a = var5;
      if (var2.length != var4.length) {
         throw new IllegalArgumentException("Property and user values have different lengths: " + var2.length + " != " + var4.length);
      } else if (var5 >= 0 && var5 < var2.length) {
         this.b = var5;
      } else {
         throw new IllegalArgumentException("Invalid default value: " + var5);
      }
   }

   public boolean a(String var1) {
      if (var1 == null) {
         this.b = this.a;
         return false;
      } else {
         this.b = ArrayUtil.indexOf(this.a, var1);
         if (this.b >= 0 && this.b < this.a.length) {
            return true;
         } else {
            this.b = this.a;
            return false;
         }
      }
   }

   public void a() {
      ++this.b;
      if (this.b < 0 || this.b >= this.a.length) {
         this.b = 0;
      }

   }

   public void a(int var1) {
      this.b = var1;
      if (this.b < 0 || this.b >= this.a.length) {
         this.b = this.a;
      }

   }

   public int a() {
      return this.b;
   }

   public String a() {
      return this.b[this.b];
   }

   public String b() {
      return this.a[this.b];
   }

   public String c() {
      return this.b;
   }

   public String d() {
      return this.a;
   }

   public void b() {
      this.b = this.a;
   }

   public boolean a(Properties var1) {
      this.b();
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.getProperty(this.a);
         return var2 != null && this.a(var2);
      }
   }

   public void a(Properties var1) {
      if (var1 != null) {
         var1.setProperty(this.d(), this.b());
      }

   }

   public String toString() {
      return this.a + '=' + this.b() + " [" + afT.a((Object[])this.a) + "], value: " + this.b;
   }
}
