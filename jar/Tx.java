import paulscode.sound.SoundSystemLogger;

class tx extends SoundSystemLogger {
   // $FF: synthetic field
   final tw a;

   tx(tw var1) {
      this.a = var1;
   }

   public void message(String var1, int var2) {
      if (!var1.isEmpty()) {
         tw.a().info(var1);
      }

   }

   public void importantMessage(String var1, int var2) {
      if (!var1.isEmpty()) {
         tw.a().warn(var1);
      }

   }

   public void errorMessage(String var1, String var2, int var3) {
      if (!var2.isEmpty()) {
         tw.a().error("Error in class '{}'", var1);
         tw.a().error(var2);
      }

   }
}
