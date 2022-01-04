public class xa extends wY {
   public xN a;
   public xN b;
   public xN[] a = new xN[4];

   public xa(sE var1) {
      this.b = 64;
      this.c = 64;
      this.a = new xN(var1, this, 0, 0);
      this.a.a(0.0F, 0.0F, 0.0F, 16, 16, 6, 0.0F);
      this.b = new xN(var1, this, 0, 22);
      this.b.a(0.0F, 0.0F, 0.0F, 16, 16, 6, 0.0F);
      xN[] var2 = this.a;
      var2[0] = new xN(var1, this, 50, 0);
      var2[1] = new xN(var1, this, 50, 6);
      var2[2] = new xN(var1, this, 50, 12);
      var2[3] = new xN(var1, this, 50, 18);
      var2[0].a(0.0F, 6.0F, -16.0F, 3, 3, 3);
      var2[1].a(0.0F, 6.0F, 0.0F, 3, 3, 3);
      var2[2].a(-16.0F, 6.0F, -16.0F, 3, 3, 3);
      var2[3].a(-16.0F, 6.0F, 0.0F, 3, 3, 3);
      var2[0].f = 1.5707964F;
      var2[1].f = 1.5707964F;
      var2[2].f = 1.5707964F;
      var2[3].f = 1.5707964F;
      var2[0].h = 0.0F;
      var2[1].h = 1.5707964F;
      var2[2].h = 4.712389F;
      var2[3].h = 3.1415927F;
   }

   public int a() {
      return 51;
   }

   public void a() {
      this.a.a(0.0625F);
      this.b.a(0.0625F);
      xN[] var1 = this.a;
      var1[0].a(0.0625F);
      var1[1].a(0.0625F);
      var1[2].a(0.0625F);
      var1[3].a(0.0625F);
   }

   public void a(boolean var1) {
      this.a.b = var1;
      this.b.b = !var1;
      xN[] var2 = this.a;
      var2[0].b = !var1;
      var2[1].b = var1;
      var2[2].b = !var1;
      var2[3].b = var1;
   }
}
