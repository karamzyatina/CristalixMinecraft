import org.apache.logging.log4j.Logger;

public final class RG extends RL {
   private static final WB<Vh> g;
   private static final Logger a;

   public RG(aej var1) {
      super(var1);
   }

   public RG(aej var1, Oh var2, Vh var3) {
      super(var1, var2);
      this.a(var3);
   }

   public RG(aej var1, double var2, double var4, double var6, Vh var8) {
      super(var1, var2, var4, var6);
      if (!var8.isEmpty()) {
         this.a(var8);
      }

   }

   protected void l() {
      this.a().a((WB)g, (Object)Vh.a);
   }

   public Vh a() {
      Vh var1 = (Vh)this.a().a(g);
      if (var1.a() != RT.b && var1.a() != RT.c) {
         if (this.a != null) {
            a.error("ThrownPotion entity {} has no item?!", this.getEntityId());
         }

         return new Vh(RT.b);
      } else {
         return var1;
      }
   }

   public void a(Vh var1) {
      this.a().b(g, var1);
      this.a().a(g);
   }

   protected float a() {
      return 0.05F;
   }

   protected void a(adi var1) {
   }

   public void b(VR var1) {
      super.b(var1);
      Vh var2 = new Vh(var1.a("Potion"));
      if (var2.isEmpty()) {
         this.n();
      } else {
         this.a(var2);
      }

   }

   private static boolean a(Oh var0) {
      return var0 instanceof PM || var0 instanceof PI;
   }

   static {
      g = WS.a(RG.class, WD.f);
      a = sE.a;
   }
}
