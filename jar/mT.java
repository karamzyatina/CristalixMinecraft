import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class MT {
   public static final adq<acC, MT> a = new adq(72);
   private final SB[] a;
   private final MU a;
   public NA a;
   protected String a;

   public static MT a(int var0) {
      return (MT)a.a(var0);
   }

   public static int a(MT var0) {
      return a.a(var0);
   }

   public static MT a(String var0) {
      return (MT)a.a(new acC(var0));
   }

   protected MT(MU var1, NA var2, SB[] var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public List<Vh> a(Oh var1) {
      Object var2 = Collections.emptyList();
      SB[] var3 = this.a;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         SB var6 = var3[var5];
         Vh var7 = var1.a(var6);
         if (!var7.isEmpty()) {
            if (((List)var2).isEmpty()) {
               var2 = new ArrayList(this.a.length);
            }

            ((List)var2).add(var7);
         }
      }

      return (List)var2;
   }

   public MU a() {
      return this.a;
   }

   public int a() {
      return 1;
   }

   public int b() {
      return 1;
   }

   public int a(int var1) {
      return 1 + var1 * 10;
   }

   public int b(int var1) {
      return this.a(var1) + 5;
   }

   public int a(int var1, abD var2) {
      return 0;
   }

   public float a(int var1, Oj var2) {
      return 0.0F;
   }

   public final boolean a(MT var1) {
      return this.b(var1) && var1.b(this);
   }

   protected boolean b(MT var1) {
      return this != var1;
   }

   public MT b(String var1) {
      this.a = var1;
      return this;
   }

   public String a() {
      return "enchantment." + this.a;
   }

   public String a(int var1) {
      String var2 = adM.a(this.a());
      if (this.b()) {
         var2 = adH.RED + var2;
      }

      return var1 == 1 && this.b() == 1 ? var2 : var2 + ' ' + adM.a("enchantment.level." + var1);
   }

   public boolean a(Vh var1) {
      return this.a.a(var1.a());
   }

   public void a(Oh var1, NN var2, int var3) {
   }

   public void b(Oh var1, NN var2, int var3) {
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public static void a() {
      SB[] var0 = new SB[]{SB.HEAD, SB.CHEST, SB.LEGS, SB.FEET};
      a.a(0, new acC("protection"), new Ns(MU.COMMON, Nt.ALL, var0));
      a.a(1, new acC("fire_protection"), new Ns(MU.UNCOMMON, Nt.FIRE, var0));
      a.a(2, new acC("feather_falling"), new Ns(MU.UNCOMMON, Nt.FALL, var0));
      a.a(3, new acC("blast_protection"), new Ns(MU.RARE, Nt.EXPLOSION, var0));
      a.a(4, new acC("projectile_protection"), new Ns(MU.UNCOMMON, Nt.PROJECTILE, var0));
      a.a(5, new acC("respiration"), new Nr(MU.RARE, var0));
      a.a(6, new acC("aqua_affinity"), new Nz(MU.RARE, var0));
      a.a(7, new acC("thorns"), new Nv(MU.VERY_RARE, var0));
      a.a(8, new acC("depth_strider"), new Ny(MU.RARE, var0));
      a.a(9, new acC("frost_walker"), new Ng(MU.RARE, new SB[]{SB.FEET}));
      a.a(10, new acC("binding_curse"), new MZ(MU.VERY_RARE, var0));
      a.a(16, new acC("sharpness"), new Na(MU.COMMON, 0, new SB[]{SB.MAINHAND}));
      a.a(17, new acC("smite"), new Na(MU.UNCOMMON, 1, new SB[]{SB.MAINHAND}));
      a.a(18, new acC("bane_of_arthropods"), new Na(MU.UNCOMMON, 2, new SB[]{SB.MAINHAND}));
      a.a(19, new acC("knockback"), new No(MU.UNCOMMON, new SB[]{SB.MAINHAND}));
      a.a(20, new acC("fire_aspect"), new Ne(MU.RARE, new SB[]{SB.MAINHAND}));
      a.a(21, new acC("looting"), new Np(MU.RARE, NA.WEAPON, new SB[]{SB.MAINHAND}));
      a.a(22, new acC("sweeping"), new Nu(MU.RARE, new SB[]{SB.MAINHAND}));
      a.a(32, new acC("efficiency"), new Nc(MU.COMMON, new SB[]{SB.MAINHAND}));
      a.a(33, new acC("silk_touch"), new Nw(MU.VERY_RARE, new SB[]{SB.MAINHAND}));
      a.a(34, new acC("unbreaking"), new Nd(MU.UNCOMMON, new SB[]{SB.MAINHAND}));
      a.a(35, new acC("fortune"), new Np(MU.RARE, NA.DIGGER, new SB[]{SB.MAINHAND}));
      a.a(48, new acC("power"), new MV(MU.COMMON, new SB[]{SB.MAINHAND}));
      a.a(49, new acC("punch"), new MY(MU.RARE, new SB[]{SB.MAINHAND}));
      a.a(50, new acC("flame"), new MW(MU.RARE, new SB[]{SB.MAINHAND}));
      a.a(51, new acC("infinity"), new MX(MU.VERY_RARE, new SB[]{SB.MAINHAND}));
      a.a(61, new acC("luck_of_the_sea"), new Np(MU.RARE, NA.FISHING_ROD, new SB[]{SB.MAINHAND}));
      a.a(62, new acC("lure"), new Nf(MU.RARE, NA.FISHING_ROD, new SB[]{SB.MAINHAND}));
      a.a(70, new acC("mending"), new Nq(MU.RARE, SB.values()));
      a.a(71, new acC("vanishing_curse"), new Nx(MU.VERY_RARE, SB.values()));
   }
}
