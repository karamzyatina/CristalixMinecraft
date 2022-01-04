import java.nio.ByteBuffer;
import java.util.Properties;

public final class agz {
   private String a = null;
   private String b = null;
   acC a = null;
   private int a = -1;
   private int b = 0;
   private int c = 0;
   private int d = 0;
   private int e = 0;
   private agA[] a = null;
   private int f = 0;
   private boolean a = false;
   private int g = 0;
   private ByteBuffer a = null;
   byte[] a = null;
   private ByteBuffer b = null;
   private boolean b = true;
   private boolean c = true;

   public agz(String var1, byte[] var2, String var3, acC var4, int var5, int var6, int var7, int var8, Properties var9) {
      this.a = var1;
      this.b = var3;
      this.a = var4;
      this.b = var5;
      this.c = var6;
      this.d = var7;
      this.e = var8;
      int var10 = var7 * var8 * 4;
      if (var2.length % var10 != 0) {
         afT.b("Invalid animated texture length: " + var2.length + ", frameWidth: " + var7 + ", frameHeight: " + var8);
      }

      this.a = var2;
      int var11 = var2.length / var10;
      if (var9.get("tile.0") != null) {
         for(int var12 = 0; var9.get("tile." + var12) != null; ++var12) {
            var11 = var12 + 1;
         }
      }

      String var20 = (String)var9.get("duration");
      int var13 = Math.max(afT.a((String)var20, 1), 1);
      this.a = new agA[var11];

      for(int var14 = 0; var14 < this.a.length; ++var14) {
         String var15 = (String)var9.get("tile." + var14);
         int var16 = afT.a(var15, var14);
         String var17 = (String)var9.get("duration." + var14);
         int var18 = Math.max(afT.a(var17, var13), 1);
         agA var19 = new agA(var16, var18);
         this.a[var14] = var19;
      }

      this.a = afT.a(var9.getProperty("interpolate"), false);
      this.g = afT.a((String)var9.getProperty("skip"), 0);
      if (this.a) {
         this.a = Bx.a(var10);
      }

   }

   public boolean a() {
      agA var1 = this.a();
      if (var1 == null) {
         return false;
      } else {
         ++var1.c;
         if (var1.c < var1.b) {
            return this.a;
         } else {
            var1.c = 0;
            ++this.f;
            if (this.f >= this.a.length) {
               this.f = 0;
            }

            return true;
         }
      }
   }

   public agA a() {
      return this.a(this.f);
   }

   public agA a(int var1) {
      if (this.a.length <= 0) {
         return null;
      } else {
         if (var1 < 0 || var1 >= this.a.length) {
            var1 = 0;
         }

         agA var2 = this.a[var1];
         return var2;
      }
   }

   public int a() {
      return this.a.length;
   }

   public void a(IN var1, HM var2) {
      if (this.c) {
         if (this.a < 0) {
            HA var3 = amj.a(var1, var2, this.a);
            if (var3 == null) {
               this.c = false;
               return;
            }

            this.a = var3.getGlTextureId();
         }

         if (this.b == null) {
            this.b = Bx.a(this.a.length);
            this.b.put(this.a);
            this.b.flip();
            this.a = null;
         }

         this.b = !agx.a() || agx.b(this.a);
         if (this.a() && this.b) {
            int var9 = this.d * this.e * 4;
            agA var4 = this.a();
            if (var4 != null) {
               int var5 = var9 * var4.a;
               if (var5 + var9 <= this.b.limit()) {
                  if (this.a && var4.c > 0) {
                     if (this.g <= 1 || var4.c % this.g == 0) {
                        agA var6 = this.a(this.f + 1);
                        double var7 = 1.0D * (double)var4.c / (double)var4.b;
                        this.a(var4, var6, var7);
                     }
                  } else {
                     this.b.position(var5);
                     By.i(this.a);
                     Lw.a(3553, 0, this.b, this.c, this.d, this.e, 6408, 5121, (ByteBuffer)this.b);
                  }
               }
            }
         }
      }

   }

   private void a(agA var1, agA var2, double var3) {
      int var5 = this.d * this.e * 4;
      int var6 = var5 * var1.a;
      if (var6 + var5 <= this.b.limit()) {
         int var7 = var5 * var2.a;
         if (var7 + var5 <= this.b.limit()) {
            this.a.clear();

            for(int var8 = 0; var8 < var5; ++var8) {
               int var9 = this.b.get(var6 + var8) & 255;
               int var10 = this.b.get(var7 + var8) & 255;
               int var11 = this.a(var9, var10, var3);
               byte var12 = (byte)var11;
               this.a.put(var12);
            }

            this.a.flip();
            By.i(this.a);
            Lw.a(3553, 0, this.b, this.c, this.d, this.e, 6408, 5121, (ByteBuffer)this.a);
         }
      }
   }

   private int a(int var1, int var2, double var3) {
      return (int)((double)var1 * (1.0D - var3) + (double)var2 * var3);
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public acC a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }
}
