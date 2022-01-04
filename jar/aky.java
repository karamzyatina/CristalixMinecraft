import java.util.ArrayList;

public class akY extends akX {
   private ali[] a = null;
   private akX[] a = null;
   private static final String d = "<profile>";
   private static final String e = "<custom>";

   public akY(ali[] var1, akX[] var2) {
      super("<profile>", "", a(var1, var2), a(var1), a(var1, var2, true), (String)null);
      this.a = var1;
      this.a = var2;
   }

   public void b() {
      super.b();
      if (this.d().equals("<custom>")) {
         super.b();
      }

      this.e();
   }

   public void d() {
      ali var1 = this.a(this.d());
      if (var1 == null || !akB.a(var1, this.a, false)) {
         String var2 = a(this.a, this.a);
         this.a((String)var2);
      }

   }

   private void e() {
      ali var1 = this.a(this.d());
      if (var1 != null) {
         String[] var2 = var1.a();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            String var4 = var2[var3];
            akX var5 = this.a(var4);
            if (var5 != null) {
               String var6 = var1.a(var4);
               var5.a(var6);
            }
         }
      }

   }

   private akX a(String var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         akX var3 = this.a[var2];
         if (var3.a().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private ali a(String var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         ali var3 = this.a[var2];
         if (var3.a().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public String f() {
      return agt.a("of.shaders.profile");
   }

   public String a(String var1) {
      return var1.equals("<custom>") ? agt.a("of.general.custom", "<custom>") : akC.a("profile." + var1, var1);
   }

   public String b(String var1) {
      return var1.equals("<custom>") ? "§c" : "§a";
   }

   public String c() {
      String var1 = akC.a("profile.comment", (String)null);
      if (var1 != null) {
         return var1;
      } else {
         StringBuilder var2 = new StringBuilder();

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            String var4 = this.a[var3].a();
            if (var4 != null) {
               String var5 = akC.a("profile." + var4 + ".comment", (String)null);
               if (var5 != null) {
                  var2.append(var5);
                  if (!var5.endsWith(". ")) {
                     var2.append(". ");
                  }
               }
            }
         }

         return var2.toString();
      }
   }

   private static String a(ali[] var0, akX[] var1) {
      return a(var0, var1, false);
   }

   private static String a(ali[] var0, akX[] var1, boolean var2) {
      ali var3 = akB.a(var0, var1, var2);
      return var3 == null ? "<custom>" : var3.a();
   }

   private static String[] a(ali[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         ali var3 = var0[var2];
         var1.add(var3.a());
      }

      var1.add("<custom>");
      String[] var4 = (String[])((String[])var1.toArray(new String[0]));
      return var4;
   }
}
