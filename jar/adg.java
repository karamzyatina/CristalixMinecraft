import java.util.Iterator;

public class adG {
   public static adu a(adu var0, NN var1) {
      Object var2;
      if (var0 instanceof adB) {
         adB var3 = (adB)var0;
         String var4 = var3.b();
         String var5 = var1 != null && var4.equals("*") ? var1.getName() : var4;
         var2 = new adB(var5, var3.c());
         ((adB)var2).a(var3.a());
      } else if (var0 instanceof adC) {
         var2 = new adD("");
      } else if (var0 instanceof adD) {
         var2 = new adD(((adD)var0).b());
      } else if (var0 instanceof adA) {
         var2 = new adA(((adA)var0).b());
      } else {
         if (!(var0 instanceof adE)) {
            return var0;
         }

         Object[] var6 = ((adE)var0).a();

         for(int var8 = 0; var8 < var6.length; ++var8) {
            Object var10 = var6[var8];
            if (var10 instanceof adu) {
               var6[var8] = a((adu)var10, var1);
            }
         }

         var2 = new adE(((adE)var0).b(), var6);
      }

      adw var7 = var0.a();
      if (var7 != null) {
         ((adu)var2).a(var7.a());
      }

      Iterator var9 = var0.a().iterator();

      while(var9.hasNext()) {
         adu var11 = (adu)var9.next();
         ((adu)var2).a(a(var11, var1));
      }

      return (adu)var2;
   }
}
