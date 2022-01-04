import dev.xdark.feder.RecyclableArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HH {
   private final int a;
   private final List<HI> a = new ReferenceArrayList(256);
   private final List<HJ> b = new ReferenceArrayList(256);
   private int b;
   private int c;
   private final int d;
   private final int e;
   private final int f;
   private final HO a;

   public HH(HO var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.a = var5;
      this.d = var2;
      this.e = var3;
      this.f = var4;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public HI a(HK var1) {
      HI var2 = new HI(var1, this.a);
      int var3 = this.f;
      if (var3 > 0) {
         var2.a(var3);
      }

      return var2;
   }

   public void a(HI var1) {
      this.a.add(var1);
   }

   public void a(HK var1) {
      HI var2 = this.a(var1);
      this.a.add(var2);
   }

   public void a() {
      HI[] var1 = (HI[])this.a.toArray(new HI[0]);
      Arrays.sort(var1);
      HI[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         HI var5 = var2[var4];
         if (!this.a(var5)) {
            String var6 = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", var5.a().getIconName(), var5.a().getIconWidth(), var5.a().getIconHeight(), this.b, this.c, this.d, this.e);
            throw new Cv(var5, var6);
         }
      }

      this.b = adh.b(this.b);
      this.c = adh.b(this.c);
   }

   public List<HK> a() {
      List var1 = this.b;
      RecyclableArrayList var2 = RecyclableArrayList.newInstance(817);
      int var3 = 0;

      for(int var4 = var1.size(); var3 < var4; ++var3) {
         ((HJ)var1.get(var3)).a((List)var2);
      }

      ArrayList var10 = new ArrayList(var2.size());
      int var5 = 0;

      for(int var6 = var2.size(); var5 < var6; ++var5) {
         HJ var7 = (HJ)var2.get(var5);
         HI var8 = var7.a();
         HK var9 = var8.a();
         var9.a(this.a, this.b, this.c, var7.a(), var7.b(), var8.a());
         var10.add(var9);
      }

      var2.recycle();
      return var10;
   }

   private static int b(int var0, int var1) {
      return (var0 >> var1) + ((var0 & (1 << var1) - 1) == 0 ? 0 : 1) << var1;
   }

   private boolean a(HI var1) {
      HK var2 = var1.a();
      boolean var3 = var2.getIconWidth() != var2.getIconHeight();
      List var4 = this.b;

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         if (((HJ)var4.get(var5)).a(var1)) {
            return true;
         }

         if (var3) {
            var1.a();
            if (((HJ)var4.get(var5)).a(var1)) {
               return true;
            }

            var1.a();
         }
      }

      return this.b(var1);
   }

   private boolean b(HI var1) {
      int var2 = Math.min(var1.a(), var1.b());
      int var3 = adh.b(this.b + var2);
      int var4 = adh.b(this.c + var2);
      boolean var5 = var3 <= this.d;
      boolean var6 = var4 <= this.e;
      if (!var5 && !var6) {
         return false;
      } else {
         int var7 = amc.a(this.c);
         boolean var8 = var5 && var3 <= 2 * var7;
         if (this.b == 0 && this.c == 0) {
            var8 = true;
         }

         HJ var9;
         if (var8) {
            if (var1.a() > var1.b()) {
               var1.a();
            }

            if (this.c == 0) {
               this.c = var1.b();
            }

            var9 = new HJ(this.b, 0, var1.a(), this.c);
            this.b += var1.a();
         } else {
            var9 = new HJ(0, this.c, this.b, var1.b());
            this.c += var1.b();
         }

         var9.a(var1);
         this.b.add(var9);
         return true;
      }
   }

   // $FF: synthetic method
   static int a(int var0, int var1) {
      return b(var0, var1);
   }
}
