public enum alL {
   BOOL,
   INT,
   FLOAT,
   VEC2,
   VEC3,
   VEC4;

   public alH a(String var1) {
      // $FF: Couldn't be decompiled
   }

   public void a(sE var1, aiP var2, alH var3) {
      // $FF: Couldn't be decompiled
   }

   private void a(sE var1, aiQ var2, alB var3) {
      boolean var4 = var2.a(var1);
      int var5 = var4 ? 1 : 0;
      var3.b(var5);
   }

   private void a(sE var1, aiS var2, alB var3) {
      int var4 = (int)var2.a(var1);
      var3.b(var4);
   }

   private void a(sE var1, aiS var2, alA var3) {
      float var4 = var2.a(var1);
      var3.a(var4);
   }

   private void a(sE var1, aiT var2, alC var3) {
      float[] var4 = var2.a(var1);
      if (var4.length != 2) {
         throw new RuntimeException("Value length is not 2, length: " + var4.length);
      } else {
         var3.a(var4[0], var4[1]);
      }
   }

   private void a(sE var1, aiT var2, alE var3) {
      float[] var4 = var2.a(var1);
      if (var4.length != 3) {
         throw new RuntimeException("Value length is not 3, length: " + var4.length);
      } else {
         var3.a(var4[0], var4[1], var4[2]);
      }
   }

   private void a(sE var1, aiT var2, alF var3) {
      float[] var4 = var2.a(var1);
      if (var4.length != 4) {
         throw new RuntimeException("Value length is not 4, length: " + var4.length);
      } else {
         var3.a(var4[0], var4[1], var4[2], var4[3]);
      }
   }

   public boolean a(aiJ var1) {
      // $FF: Couldn't be decompiled
   }

   public static alL a(String var0) {
      alL[] var1 = values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         alL var3 = var1[var2];
         if (var3.name().toLowerCase().equals(var0)) {
            return var3;
         }
      }

      return null;
   }
}
