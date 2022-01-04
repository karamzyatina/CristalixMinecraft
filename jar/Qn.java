public final class QN extends QY {
   private static final WB<Integer> o;

   public QN(aej var1) {
      super(var1);
      this.setSize(0.6F, 0.7F);
   }

   protected void l() {
      super.l();
      this.a.a((WB)o, (int)0);
   }

   public boolean canDespawn() {
      return !this.A() && this.b > 2400;
   }

   protected void a_() {
      super.a_();
      this.a((OC)Ot.a).a(10.0D);
      this.a((OC)Ot.d).a(0.30000001192092896D);
   }

   public void c(float var1, float var2) {
   }

   public void b(VR var1) {
      super.b(var1);
      this.d(var1.getInteger("CatType"));
   }

   protected acJ c() {
      if (this.A()) {
         if (this.I()) {
            return RW.Y;
         } else {
            return this.a.nextInt(4) == 0 ? RW.Z : RW.U;
         }
      } else {
         return null;
      }
   }

   protected acJ a(abD var1) {
      return RW.X;
   }

   protected acJ d() {
      return RW.V;
   }

   protected float c() {
      return 0.4F;
   }

   public boolean a(abD var1, float var2) {
      return this.a((abD)var1) ? false : super.a(var1, var2);
   }

   public boolean b(Rn var1, abU var2) {
      Vh var3 = var1.a((abU)var2);
      if (!this.A() && var3.a() == RT.aG && var1.a((NN)this) < 9.0D) {
         if (!var1.a.d) {
            var3.shrink(1);
         }

         return true;
      } else {
         return super.b(var1, var2);
      }
   }

   public boolean b(Vh var1) {
      return var1.a() == RT.aG;
   }

   public boolean a(QB var1) {
      if (var1 == this) {
         return false;
      } else if (!this.A()) {
         return false;
      } else if (!(var1 instanceof QN)) {
         return false;
      } else {
         QN var2 = (QN)var1;
         if (!var2.A()) {
            return false;
         } else {
            return this.I() && var2.I();
         }
      }
   }

   public int i() {
      return (Integer)this.a.a(o);
   }

   public void d(int var1) {
      this.a.b(o, var1);
   }

   public boolean isNotColliding() {
      if (this.a.a((acU)this.b(), (NN)this) && this.a.a((NN)this, (acU)this.b()).checkEmptyAndRecycle() && !this.a.d(this.b())) {
         acV var1 = new acV(this.d, this.b().b, this.f);
         if (var1.b < this.a.b()) {
            return false;
         } else {
            sD var2 = this.a.a(var1.b());
            nh var3 = var2.a();
            return var3 == RQ.a || var2.a() == si.j;
         }
      } else {
         return false;
      }
   }

   public String getName() {
      if (this.hasCustomName()) {
         return this.getCustomNameTag();
      } else {
         return this.A() ? adM.a("entity.Cat.name") : super.getName();
      }
   }

   static {
      o = WS.a(QN.class, WD.b);
   }
}
