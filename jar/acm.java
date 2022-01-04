import dev.xdark.clientapi.game.Timer;

public final class acM implements Timer {
   public int a;
   public float a;
   public float b;
   private long a;
   private final iT a;

   public acM(float var1) {
      if (this.a == null) {
         this.a = new iT(0.0F);
      }

      this.a.a(iM.a(iM.a(2108597964) ^ iM.a(~iM.a(-970237645))) / var1);
      this.a = sE.a();
   }

   public void a() {
      long var1 = sE.a();
      float var3 = this.b = (float)(var1 - this.a) / this.a.a();
      this.a = var1;
      float var4 = this.a += var3;
      this.a = (int)var4;
      this.a -= (float)((int)var4);
   }

   public void setTickLength(float var1) {
      this.a.a(var1);
   }

   // $FF: synthetic method
   public int getElapsedTicks() {
      return this.a;
   }

   // $FF: synthetic method
   public float getRenderPartialTicks() {
      return this.a;
   }

   // $FF: synthetic method
   public float getElapsedPartialTicks() {
      return this.b;
   }

   // $FF: synthetic method
   public long lastSyncSysClock() {
      return this.a;
   }

   // $FF: synthetic method
   public float getTickLength() {
      return this.a.a();
   }
}
