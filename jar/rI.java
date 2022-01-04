public abstract class Ri extends Of implements Rm {
   public Ri(aej var1) {
      super(var1);
   }

   public boolean t() {
      return true;
   }

   public boolean isNotColliding() {
      return this.a.a((acU)this.b(), (NN)this);
   }

   public int getTalkInterval() {
      return 120;
   }

   public boolean canDespawn() {
      return true;
   }

   protected int a(Rn var1) {
      return 1 + this.a.a.nextInt(3);
   }

   public void o() {
      int var1 = this.getAir();
      super.o();
      if (this.isEntityAlive() && !this.isInWater()) {
         this.setAir(var1 - 1);
         if (this.getAir() == -20) {
            this.setAir(0);
            this.a(abD.h, 2.0F);
         }
      } else {
         this.setAir(300);
      }

   }

   public boolean o() {
      return false;
   }
}
