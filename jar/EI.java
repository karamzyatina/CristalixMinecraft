class Ei implements Runnable {
   // $FF: synthetic field
   final Ed a;
   // $FF: synthetic field
   final Eg a;

   Ei(Eg var1, Ed var2) {
      this.a = var1;
      this.a = var2;
   }

   public void run() {
      Eg.a(this.a).remove(this.a);
   }
}
