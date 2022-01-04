public final class yt {
   public String a;
   public String b;
   public String c;
   public String d;
   public long a;
   public int a = 340;
   public String e = "1.12.2";
   public boolean a;
   public String f;
   private yu a;
   private String g;

   public yt(String var1, String var2, boolean var3) {
      this.a = yu.PROMPT;
      this.a = var1;
      this.b = var2;
   }

   public VR a() {
      VR var1 = new VR();
      var1.a("name", this.a);
      var1.a("ip", this.b);
      if (this.g != null) {
         var1.a("icon", this.g);
      }

      if (this.a == yu.ENABLED) {
         var1.a("acceptTextures", true);
      } else if (this.a == yu.DISABLED) {
         var1.a("acceptTextures", false);
      }

      return var1;
   }

   public yu a() {
      return this.a;
   }

   public void a(yu var1) {
      this.a = var1;
   }

   public static yt a(VR var0) {
      yt var1 = new yt(var0.getString("name"), var0.getString("ip"), false);
      if (var0.a("icon", (int)8)) {
         var1.a(var0.getString("icon"));
      }

      if (var0.a("acceptTextures", (int)1)) {
         if (var0.getBoolean("acceptTextures")) {
            var1.a(yu.ENABLED);
         } else {
            var1.a(yu.DISABLED);
         }
      } else {
         var1.a(yu.PROMPT);
      }

      return var1;
   }

   public String a() {
      return this.g;
   }

   public void a(String var1) {
      this.g = var1;
   }

   public void a(yt var1) {
      this.b = var1.b;
      this.a = var1.a;
      this.a(var1.a());
      this.g = var1.g;
   }
}
