public abstract class QV extends QY {
   private int y;

   public QV(aej var1) {
      super(var1);
   }

   public void a() {
      ++this.y;
      super.a();
   }

   public boolean z() {
      return this.y > 100;
   }
}
