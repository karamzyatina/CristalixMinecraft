abstract class CU {
   private CU() {
   }

   public CF a(CF var1) {
      float var2 = var1.getVertexU(var1.getVertexRotatedRev(0));
      float var3 = var1.getVertexV(var1.getVertexRotatedRev(0));
      float var4 = var1.getVertexU(var1.getVertexRotatedRev(2));
      float var5 = var1.getVertexV(var1.getVertexRotatedRev(2));
      return this.a(var2, var3, var4, var5);
   }

   abstract CF a(float var1, float var2, float var3, float var4);

   // $FF: synthetic method
   CU(CP var1) {
      this();
   }
}
