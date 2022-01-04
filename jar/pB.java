import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Iterator;

public final class PB extends NY {
   public PC a;

   public PB(aej var1) {
      super(var1);
   }

   public PB(aej var1, acV var2, abP var3) {
      super(var1, var2);
      ReferenceArrayList var4 = new ReferenceArrayList(PC.VALUES.length);
      int var5 = 0;
      PC[] var6 = PC.VALUES;
      int var7 = var6.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         PC var9 = var6[var8];
         this.a = var9;
         this.a(var3);
         if (this.a()) {
            var4.add(var9);
            int var10 = var9.sizeX * var9.sizeY;
            if (var10 > var5) {
               var5 = var10;
            }
         }
      }

      if (!var4.isEmpty()) {
         Iterator var11 = var4.iterator();

         while(var11.hasNext()) {
            PC var12 = (PC)var11.next();
            if (var12.sizeX * var12.sizeY < var5) {
               var11.remove();
            }
         }

         this.a = (PC)var4.get(this.a.nextInt(var4.size()));
      }

      this.a(var3);
   }

   public PB(aej var1, acV var2, abP var3, String var4) {
      this(var1, var2, var3);
      PC[] var5 = PC.VALUES;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         PC var8 = var5[var7];
         if (var8.title.equals(var4)) {
            this.a = var8;
            break;
         }
      }

      this.a(var3);
   }

   public void b(VR var1) {
      String var2 = var1.getString("Motive");
      PC[] var3 = PC.VALUES;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         PC var6 = var3[var5];
         if (var6.title.equals(var2)) {
            this.a = var6;
         }
      }

      if (this.a == null) {
         this.a = PC.KEBAB;
      }

      super.b(var1);
   }

   public int d() {
      return this.a.sizeX;
   }

   public int e() {
      return this.a.sizeY;
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.a(var1, var3, var5);
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      acV var11 = this.a.a(var1 - this.d, var3 - this.e, var5 - this.f);
      this.a((double)var11.a, (double)var11.b, (double)var11.c);
   }
}
