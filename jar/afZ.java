import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class afz extends afL {
   public int a;
   public int b;
   public byte a;
   public boolean a;
   public boolean b;
   public byte b;
   public byte[] a = new byte[16384];
   public List<afA> a = new ArrayList();
   public Map<String, afB> a = new LinkedHashMap();

   public afz(String var1) {
      super(var1);
   }

   public void a(double var1, double var3, int var5) {
      int var6 = 128 * (1 << var5);
      int var7 = adh.b((var1 + 64.0D) / (double)var6);
      int var8 = adh.b((var3 + 64.0D) / (double)var6);
      this.a = var7 * var6 + var6 / 2 - 64;
      this.b = var8 * var6 + var6 / 2 - 64;
   }

   public void a(VR var1) {
      this.a = var1.getByte("dimension");
      this.a = var1.getInteger("xCenter");
      this.b = var1.getInteger("zCenter");
      this.b = var1.getByte("scale");
      this.b = (byte)adh.a(this.b, 0, 4);
      if (var1.a("trackingPosition", (int)1)) {
         this.a = var1.getBoolean("trackingPosition");
      } else {
         this.a = true;
      }

      this.b = var1.getBoolean("unlimitedTracking");
      short var2 = var1.getShort("width");
      short var3 = var1.getShort("height");
      if (var2 == 128 && var3 == 128) {
         this.a = var1.getByteArray("colors");
      } else {
         byte[] var4 = var1.getByteArray("colors");
         this.a = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = var7 + var6;
            if (var8 >= 0 || var8 < 128) {
               for(int var9 = 0; var9 < var2; ++var9) {
                  int var10 = var9 + var5;
                  if (var10 >= 0 || var10 < 128) {
                     this.a[var10 + var8 * 128] = var4[var9 + var7 * var2];
                  }
               }
            }
         }
      }

   }

   public VR a(VR var1) {
      var1.a("dimension", this.a);
      var1.a("xCenter", this.a);
      var1.a("zCenter", this.b);
      var1.a("scale", this.b);
      var1.a("width", (short)128);
      var1.a("height", (short)128);
      var1.a("colors", this.a);
      var1.a("trackingPosition", this.a);
      var1.a("unlimitedTracking", this.b);
      return var1;
   }

   public static void a(Vh var0, acV var1, String var2, afC var3) {
      VZ var4;
      if (var0.c() && var0.a().a("Decorations", (int)9)) {
         var4 = var0.a().a("Decorations", (int)10);
      } else {
         var4 = new VZ();
         var0.a((String)"Decorations", (VK)var4);
      }

      VR var5 = new VR();
      var5.a("type", var3.a());
      var5.a("id", var2);
      var5.a("x", (double)var1.a);
      var5.a("z", (double)var1.c);
      var5.a("rot", 180.0D);
      var4.a((VK)var5);
      if (var3.b()) {
         VR var6 = var0.a("display");
         var6.a("MapColor", var3.a());
      }

   }

   public void a(int var1, int var2) {
      super.a();
      Iterator var3 = this.a.iterator();

      while(var3.hasNext()) {
         afA var4 = (afA)var3.next();
         var4.a(var1, var2);
      }

   }
}
