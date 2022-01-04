import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class afu {
   public final List<afx> a = new ArrayList();
   public final List<afy> b = new ArrayList();
   public acV a;
   private String a;

   public afu() {
      this.a = acV.a;
      this.a = "?";
   }

   public acV a() {
      return this.a;
   }

   public void a(String var1) {
      this.a = var1;
   }

   public String a() {
      return this.a;
   }

   public VR a(VR var1) {
      afw var2 = new afw((afv)null);
      VZ var3 = new VZ();

      VR var6;
      for(Iterator var4 = this.a.iterator(); var4.hasNext(); var3.a((VK)var6)) {
         afx var5 = (afx)var4.next();
         var6 = new VR();
         var6.a((String)"pos", (VK)this.a(var5.a.a, var5.a.b, var5.a.c));
         var6.a("state", var2.a(var5.a));
         if (var5.a != null) {
            var6.a((String)"nbt", (VK)var5.a);
         }
      }

      VZ var8 = new VZ();

      VR var7;
      for(Iterator var9 = this.b.iterator(); var9.hasNext(); var8.a((VK)var7)) {
         afy var11 = (afy)var9.next();
         var7 = new VR();
         var7.a((String)"pos", (VK)this.a(var11.a.a, var11.a.b, var11.a.c));
         var7.a((String)"blockPos", (VK)this.a(var11.a.a, var11.a.b, var11.a.c));
         if (var11.a != null) {
            var7.a((String)"nbt", (VK)var11.a);
         }
      }

      VZ var10 = new VZ();
      Iterator var12 = var2.iterator();

      while(var12.hasNext()) {
         sD var13 = (sD)var12.next();
         var10.a((VK)We.a(new VR(), var13));
      }

      var1.a((String)"palette", (VK)var10);
      var1.a((String)"blocks", (VK)var3);
      var1.a((String)"entities", (VK)var8);
      var1.a((String)"size", (VK)this.a(this.a.a, this.a.b, this.a.c));
      var1.a("author", this.a);
      var1.a("DataVersion", (int)1343);
      return var1;
   }

   public void a(VR var1) {
      this.a.clear();
      this.b.clear();
      VZ var2 = var1.a("size", (int)3);
      this.a = new acV(var2.a(0), var2.a(1), var2.a(2));
      this.a = var1.getString("author");
      afw var3 = new afw((afv)null);
      VZ var4 = var1.a("palette", (int)10);

      for(int var5 = 0; var5 < var4.a(); ++var5) {
         var3.a(We.a(var4.a(var5)), var5);
      }

      VZ var14 = var1.a("blocks", (int)10);

      for(int var6 = 0; var6 < var14.a(); ++var6) {
         VR var7 = var14.a(var6);
         VZ var8 = var7.a("pos", (int)3);
         acV var9 = new acV(var8.a(0), var8.a(1), var8.a(2));
         sD var10 = var3.a(var7.getInteger("state"));
         VR var11;
         if (var7.hasKey("nbt")) {
            var11 = var7.a("nbt");
         } else {
            var11 = null;
         }

         this.a.add(new afx(var9, var10, var11));
      }

      VZ var15 = var1.a("entities", (int)10);

      for(int var16 = 0; var16 < var15.a(); ++var16) {
         VR var17 = var15.a(var16);
         VZ var18 = var17.a("pos", (int)6);
         adm var19 = new adm(var18.a(0), var18.a(1), var18.a(2));
         VZ var20 = var17.a("blockPos", (int)3);
         acV var12 = new acV(var20.a(0), var20.a(1), var20.a(2));
         if (var17.hasKey("nbt")) {
            VR var13 = var17.a("nbt");
            this.b.add(new afy(var19, var12, var13));
         }
      }

   }

   private VZ a(int... var1) {
      VZ var2 = new VZ();
      int[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var2.a((VK)(new VX(var6)));
      }

      return var2;
   }

   private VZ a(double... var1) {
      VZ var2 = new VZ();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.a((VK)(new VU(var6)));
      }

      return var2;
   }
}
