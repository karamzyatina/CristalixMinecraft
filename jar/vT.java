class VT implements KB {
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final VR a;

   VT(VR var1, int var2) {
      this.a = var1;
      this.a = var2;
   }

   public String a() {
      return VK.a[this.a];
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
