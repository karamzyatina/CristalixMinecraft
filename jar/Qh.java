public final class QH extends Qz {
   private static final WB<Integer> m;
   private static final WB<Integer> n;
   public static final String[] a;
   public static final String[] b;
   private static final String[] c;
   private static final String[] d;
   private String b;
   private final String[] e = new String[3];

   public QH(aej var1) {
      super(var1);
   }

   protected void l() {
      super.l();
      this.a.a((WB)m, (int)0);
      this.a.a((WB)n, (Object)Rl.NONE.a());
   }

   public void b(VR var1) {
      super.b(var1);
      this.e(var1.getInteger("Variant"));
      if (var1.a("ArmorItem", (int)10)) {
         Vh var2 = new Vh(var1.a("ArmorItem"));
         if (!var2.isEmpty() && Rl.a(var2.a())) {
            this.a.a(1, var2);
         }
      }

      this.k();
   }

   public void e(int var1) {
      this.a.b(m, var1);
      this.L();
   }

   public int j() {
      return (Integer)this.a.a(m);
   }

   private void L() {
      this.b = null;
   }

   private void M() {
      int var1 = this.j();
      int var2 = (var1 & 255) % 7;
      int var3 = ((var1 & '\uff00') >> 8) % 5;
      Rl var4 = this.a();
      this.e[0] = a[var2];
      this.e[1] = c[var3];
      this.e[2] = var4.b();
      this.b = "horse/" + b[var2] + d[var3] + var4.a();
   }

   public String a() {
      if (this.b == null) {
         this.M();
      }

      return this.b;
   }

   public String[] a() {
      if (this.b == null) {
         this.M();
      }

      return this.e;
   }

   protected void k() {
      super.k();
      this.c(this.a.a(1));
   }

   public void c(Vh var1) {
      Rl var2 = Rl.a(var1);
      this.a.b(n, var2.a());
      this.L();
   }

   public Rl a() {
      return Rl.a((Integer)this.a.a(n));
   }

   public void a(SE var1) {
      super.a(var1);
   }

   protected void a(sf var1) {
      super.a(var1);
   }

   protected void a_() {
      super.a_();
      this.a((OC)Ot.a).a((double)this.h());
      this.a((OC)Ot.d).a(this.d());
      this.a((OC)a).a(this.c());
   }

   public void a() {
      super.a();
      if (this.a.isDirty()) {
         this.a.a();
         this.L();
      }

   }

   protected acJ c() {
      super.c();
      return RW.cF;
   }

   protected acJ d() {
      super.d();
      return RW.cJ;
   }

   protected acJ a(abD var1) {
      super.a(var1);
      return RW.cM;
   }

   protected acJ e() {
      super.e();
      return RW.cG;
   }

   public boolean b(Rn var1, abU var2) {
      Vh var3 = var1.a((abU)var2);
      boolean var4 = !var3.isEmpty();
      if (var4 && var3.a() == RT.bt) {
         return super.b(var1, var2);
      } else {
         if (!this.isChild()) {
            if (this.y() && var1.isSneaking()) {
               this.b(var1);
               return true;
            }

            if (this.isBeingRidden()) {
               return super.b(var1, var2);
            }
         }

         if (var4) {
            if (this.a(var1, var3)) {
               if (!var1.a.d) {
                  var3.shrink(1);
               }

               return true;
            }

            if (var3.a((Rn)var1, (Oh)this, (abU)var2)) {
               return true;
            }

            if (!this.y()) {
               this.J();
               return true;
            }

            boolean var5 = Rl.a(var3) != Rl.NONE;
            boolean var6 = !this.isChild() && !this.E() && var3.a() == RT.ai;
            if (var5 || var6) {
               this.b(var1);
               return true;
            }
         }

         if (this.isChild()) {
            return super.b(var1, var2);
         } else {
            this.c((Rn)var1);
            return true;
         }
      }
   }

   public boolean a(QB var1) {
      if (var1 == this) {
         return false;
      } else if (!(var1 instanceof QF) && !(var1 instanceof QH)) {
         return false;
      } else {
         return this.G() && ((Qz)var1).G();
      }
   }

   public boolean H() {
      return true;
   }

   public boolean c(Vh var1) {
      return Rl.a(var1.a());
   }

   static {
      m = WS.a(QH.class, WD.b);
      n = WS.a(QH.class, WD.b);
      a = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
      b = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
      c = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
      d = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
   }
}
