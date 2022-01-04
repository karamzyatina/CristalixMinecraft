public class FX extends FU {
   private static final acC[] a = new acC[]{new acC("textures/entity/llama/llama_creamy.png"), new acC("textures/entity/llama/llama_white.png"), new acC("textures/entity/llama/llama_brown.png"), new acC("textures/entity/llama/llama_gray.png")};

   public FX(Ga var1) {
      super(var1, new xB(var1.a, 0.0F), 0.7F);
      this.a((Hn)(new Hl(this)));
   }

   protected acC a(QJ var1) {
      return a[var1.n()];
   }
}
