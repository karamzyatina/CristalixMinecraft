import java.util.List;

public final class TF extends TH {
   public TF() {
      super(RQ.bF);
      this.a = 16;
      this.a(KC.b);
      this.a(true);
      this.c(0);
   }

   public abN a(Rn var1, aej var2, acV var3, abU var4, abP var5, float var6, float var7, float var8) {
      sD var9 = var2.a(var3);
      boolean var10 = var9.a().a((aec)var2, (acV)var3);
      if (var5 == abP.DOWN || !var9.a().isSolid() && !var10 || var10 && var5 != abP.UP) {
         return abN.FAIL;
      } else {
         var3 = var3.a(var5);
         Vh var11 = var1.a((abU)var4);
         return var1.a(var3, var5, var11) && RQ.bF.a(var2, var3) ? abN.SUCCESS : abN.FAIL;
      }
   }

   public String c(Vh var1) {
      String var2 = "item.banner.";
      SW var3 = a(var1);
      var2 = var2 + var3.b() + ".name";
      return adM.a(var2);
   }

   public static void a(Vh var0, List<String> var1) {
      VR var2 = var0.b("BlockEntityTag");
      if (var2 != null && var2.hasKey("Patterns")) {
         VZ var3 = var2.a("Patterns", (int)10);

         for(int var4 = 0; var4 < var3.a() && var4 < 6; ++var4) {
            VR var5 = var3.a(var4);
            SW var6 = SW.a(var5.getInteger("Color"));
            aaz var7 = aaz.a(var5.getString("Pattern"));
            if (var7 != null) {
               var1.add(adM.a("item.banner." + var7.a() + '.' + var6.b()));
            }
         }
      }

   }

   public void a(Vh var1, aej var2, List<String> var3, JY var4) {
      a(var1, var3);
   }

   public void a(KC var1, acz<Vh> var2) {
      if (this.a(var1)) {
         SW[] var3 = SW.VALUES;
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            SW var6 = var3[var5];
            var2.add(a(var6, (VZ)null));
         }
      }

   }

   public static Vh a(SW var0, VZ var1) {
      Vh var2 = new Vh(RT.cm, 1, var0.b());
      if (var1 != null && !var1.isEmpty()) {
         var2.a("BlockEntityTag").a((String)"Patterns", (VK)var1.a());
      }

      return var2;
   }

   public KC a() {
      return KC.b;
   }

   public static SW a(Vh var0) {
      return SW.a(var0.getMetadata() & 15);
   }
}
