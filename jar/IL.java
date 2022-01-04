import java.util.Iterator;

public final class Il extends Ik {
   public Il(sE var1) {
      super(var1);
   }

   public void a(abp var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      // $FF: Couldn't be decompiled
   }

   private void a(abp var1, double var2, double var4, double var6, acV var8, Cw var9, Bh var10, boolean var11) {
      By.d(var11 ? 3.0F : 1.0F);
      var10.a(3, In.f);
      aej var12 = var1.b();
      acV var13 = var1.a();
      acV var14 = var13.a((adn)var8);
      Iterator var15 = acV.a(var14, var14.a((adn)var1.c()).a(-1, -1, -1)).iterator();

      while(true) {
         acV var16;
         boolean var18;
         boolean var19;
         do {
            if (!var15.hasNext()) {
               var9.draw();
               return;
            }

            var16 = (acV)var15.next();
            sD var17 = var12.a(var16);
            var18 = var17 == afh.a;
            var19 = var17 == RQ.bW.a();
         } while(!var18 && !var19);

         int var20 = var13.a;
         int var21 = var13.b;
         int var22 = var13.c;
         int var23 = var16.a;
         int var24 = var16.b;
         int var25 = var16.c;
         float var26 = var18 ? 0.05F : 0.0F;
         double var27 = (double)((float)(var23 - var20) + 0.45F) + var2 - (double)var26;
         double var29 = (double)((float)(var24 - var21) + 0.45F) + var4 - (double)var26;
         double var31 = (double)((float)(var25 - var22) + 0.45F) + var6 - (double)var26;
         double var33 = (double)((float)(var23 - var20) + 0.55F) + var2 + (double)var26;
         double var35 = (double)((float)(var24 - var21) + 0.55F) + var4 + (double)var26;
         double var37 = (double)((float)(var25 - var22) + 0.55F) + var6 + (double)var26;
         if (var11) {
            Ck.a(var10, var27, var29, var31, var33, var35, var37, 0.0F, 0.0F, 0.0F, 1.0F);
         } else if (var18) {
            Ck.a(var10, var27, var29, var31, var33, var35, var37, 0.5F, 0.5F, 1.0F, 1.0F);
         } else {
            Ck.a(var10, var27, var29, var31, var33, var35, var37, 1.0F, 0.25F, 0.25F, 1.0F);
         }
      }
   }

   private void a(Cw var1, Bh var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15, int var16, int var17) {
      By.d(2.0F);
      var2.a(3, In.f);
      var2.a(var3, var5, var7).a((float)var16, (float)var16, (float)var16, 0.0F).endVertex();
      var2.a(var3, var5, var7).a(var16, var16, var16, var15).endVertex();
      var2.a(var9, var5, var7).a(var16, var17, var17, var15).endVertex();
      var2.a(var9, var5, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var3, var5, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var3, var5, var7).a(var17, var17, var16, var15).endVertex();
      var2.a(var3, var11, var7).a(var17, var16, var17, var15).endVertex();
      var2.a(var9, var11, var7).a(var16, var16, var16, var15).endVertex();
      var2.a(var9, var11, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var3, var11, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var3, var11, var7).a(var16, var16, var16, var15).endVertex();
      var2.a(var3, var11, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var3, var5, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var9, var5, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var9, var11, var13).a(var16, var16, var16, var15).endVertex();
      var2.a(var9, var11, var7).a(var16, var16, var16, var15).endVertex();
      var2.a(var9, var5, var7).a(var16, var16, var16, var15).endVertex();
      var2.a(var9, var5, var7).a((float)var16, (float)var16, (float)var16, 0.0F).endVertex();
      var1.draw();
      By.d(1.0F);
   }

   public boolean a(abp var1) {
      return true;
   }
}
