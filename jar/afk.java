class afK implements KB {
   // $FF: synthetic field
   final afF a;

   afK(afF var1) {
      this.a = var1;
   }

   public String a() {
      return String.format("Game mode: %s (ID %d). Hardcore: %b.", afF.a(this.a).getName(), afF.a(this.a).a(), afF.b(this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
