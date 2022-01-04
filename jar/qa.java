import dev.xdark.feder.UUIDConversionUtil;
import java.util.UUID;

public final class Qa extends Qu {
   private static final UUID b = UUIDConversionUtil.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final OA a;
   private int i;
   private UUID c;

   public Qa(aej var1) {
      super(var1);
      this.f = true;
   }

   public void c(Oh var1) {
      super.c(var1);
      if (var1 != null) {
         this.c = var1.getUniqueID();
      }

   }

   protected void a_() {
      super.a_();
      this.a((OC)a).a(0.0D);
      this.a((OC)Ot.d).a(0.23000000417232513D);
      this.a((OC)Ot.f).a(5.0D);
   }

   public boolean isNotColliding() {
      return this.a.a((acU)this.b(), (NN)this) && this.a.a((NN)this, (acU)this.b()).checkEmptyAndRecycle() && !this.a.d(this.b());
   }

   public void b(VR var1) {
      super.b(var1);
      this.i = var1.getShort("Anger");
      String var2 = var1.getString("HurtBy");
      if (!var2.isEmpty()) {
         this.c = UUIDConversionUtil.fromString(var2);
         Rn var3 = this.a.a(this.c);
         this.c(var3);
         if (var3 != null) {
            this.a = var3;
            this.t = this.f();
         }
      }

   }

   public boolean a(abD var1, float var2) {
      if (!this.a((abD)var1)) {
         NN var3 = var1.b();
         if (var3 instanceof Rn) {
            this.a(var3);
         }
      }

      return false;
   }

   public void a(NN var1) {
      this.i = 400 + this.a.nextInt(400);
      if (var1 instanceof Oh) {
         this.c((Oh)var1);
      }

   }

   public boolean y() {
      return this.i > 0;
   }

   protected acJ c() {
      return RW.js;
   }

   protected acJ a(abD var1) {
      return RW.jv;
   }

   protected acJ d() {
      return RW.ju;
   }

   public boolean b(Rn var1, abU var2) {
      return false;
   }

   protected void a(adW var1) {
      this.a(SB.MAINHAND, new Vh(RT.D));
   }

   protected Vh d() {
      return Vh.a;
   }

   static {
      a = new OA(b, "Attacking speed boost", 0.05D, 0);
   }
}
