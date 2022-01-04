import java.util.HashMap;
import java.util.Map;

public abstract class GT implements Hn {
   protected static final Lg a = new Lg("textures/misc/enchanted_item_glint.png");
   protected static final acC a;
   protected T a;
   protected T b;
   private final FV<?> a;
   private final float a = 1.0F;
   private final float b = 1.0F;
   private final float c = 1.0F;
   private final float d = 1.0F;
   private boolean a;
   private static final Map<String, acC> a;

   public GT(FV<?> var1) {
      this.a = var1;
   }

   public void b() {
      this.a();
   }

   public void a(Oh var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, SB.CHEST);
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, SB.LEGS);
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, SB.FEET);
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, SB.HEAD);
   }

   public boolean a() {
      return false;
   }

   private void a(Oh var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, SB var9) {
      Vh var10 = var1.a(var9);
      if (var10.a() instanceof TA) {
         TA var11 = (TA)var10.a();
         if (var11.a() == var9) {
            wY var12 = this.a(var9);
            var12.a(this.a.a());
            var12.a(var1, var2, var3, var4);
            this.a(var12, var9);
            boolean var13 = a(var9);
            acC var14 = ajs.a((Vh)var10, (SB)var9, (String)null);
            if (var14 == null) {
               this.a.a((Lg)((Lg)a(var11, var13)));
            } else {
               this.a.a((acC)var14);
            }

            int var15 = La.a(var11.b(var10));
            this.getClass();
            this.getClass();
            this.getClass();
            this.getClass();
            La.a(var15, 1.0F, 1.0F, 1.0F, 1.0F);
            var12.a(var1, var2, var3, var5, var6, var7, var8);
            if (var11.a() == TB.a) {
               acC var16 = ajs.a(var10, var9, "overlay");
               if (var16 == null) {
                  this.a.a((Lg)((Lg)a(var11, var13, "overlay")));
               } else {
                  this.a.a((acC)var16);
               }
            }

            VR var23 = var10.a();
            boolean var17 = false;
            float var18 = 0.38F;
            float var19 = 0.19F;
            float var20 = 0.608F;
            float var21 = 1.0F;
            if (var23 != null && var23.a("glow_color", (int)99)) {
               int var22 = var23.getInteger("glow_color");
               var18 = (float)(var22 >> 16 & 255) / 255.0F;
               var19 = (float)(var22 >> 8 & 255) / 255.0F;
               var20 = (float)(var22 & 255) / 255.0F;
               var21 = (float)(var22 >> 24 & 255) / 255.0F;
               var17 = true;
            }

            if (!this.a && (var17 || var10.isItemEnchanted()) && !ajs.a(this.a.a().a, var1, var10, var12, var2, var3, var4, var5, var6, var7, var8)) {
               a(this.a, var1, var12, var2, var3, var4, var5, var6, var7, var8, var18, var19, var20, var21);
            }
         }
      }

   }

   public T a(SB var1) {
      return a(var1) ? this.a : this.b;
   }

   private static boolean a(SB var0) {
      return var0 == SB.LEGS;
   }

   public static void a(FV<?> var0, Oh var1, wY var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13) {
      if (!afT.ad() || !akC.c) {
         float var14 = (float)var1.b + var5;
         var0.a((Lg)a);
         if (afT.ad()) {
            akF.g(var0.a().a);
         }

         sE var15 = var0.a().a;
         var15.a.a(true);
         By.l();
         By.c(514);
         By.a(false);
         By.c(0.5F, 0.5F, 0.5F, 1.0F);

         for(int var16 = 0; var16 < 2; ++var16) {
            By.f();
            By.a(BU.SRC_COLOR, BL.ONE);
            By.c(var10, var11, var12, var13);
            By.l(5890);
            By.B();
            By.b(0.33333334F, 0.33333334F, 0.33333334F);
            By.b(30.0F - (float)var16 * 60.0F, 0.0F, 0.0F, 1.0F);
            By.c(0.0F, var14 * (0.001F + (float)var16 * 0.003F) * 20.0F, 0.0F);
            By.l(5888);
            var2.a(var1, var3, var4, var6, var7, var8, var9);
            By.a(BU.ONE, BL.ZERO);
         }

         By.l(5890);
         By.B();
         By.l(5888);
         By.e();
         By.a(true);
         By.c(515);
         By.k();
         var15.a.a(false);
         if (afT.ad()) {
            akF.h(var15);
         }
      }

   }

   public static void a(FV<?> var0, Oh var1, wY var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 0.38F, 0.19F, 0.608F, 1.0F);
   }

   private static acC a(TA var0, boolean var1) {
      return a(var0, var1, (String)null);
   }

   private static acC a(TA var0, boolean var1, String var2) {
      String var3 = "textures/models/armor/" + var0.a().getName() + "_layer_" + (var1 ? 2 : 1) + (var2 == null ? "" : '_' + var2) + ".png";
      Object var4 = (acC)a.get(var3);
      if (var4 == null) {
         var4 = new Lg(var3);
         a.put(var3, var4);
      }

      return (acC)var4;
   }

   protected abstract void a();

   protected abstract void a(T var1, SB var2);

   static {
      a = a;
      a = new HashMap();
   }
}
