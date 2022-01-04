import dev.xdark.clientapi.render.VertexFormat;
import dev.xdark.clientapi.renderer.block.model.BakedQuad;
import dev.xdark.clientapi.renderer.texture.TextureAtlasSprite;
import dev.xdark.clientapi.util.EnumFacing;

public class CD implements BakedQuad {
   protected int[] a;
   protected final int a;
   protected abP a;
   protected HK a;
   private int[] b = null;
   protected boolean a = false;
   protected Ip a;
   private ajE a;
   private boolean b;
   private CD a;
   public final HO a;

   public CD(HO var1, int[] var2, int var3, abP var4, HK var5, boolean var6, Ip var7) {
      this.a = var1;
      this.a = (int[])Ll.a.a(var2);
      this.a = var3;
      this.a = var4;
      this.a = var5;
      this.a = var6;
      this.a = var7;
   }

   public CD(HO var1, int[] var2, int var3, abP var4, HK var5) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
      this.a = var5;
      this.a = In.b;
   }

   public HK a() {
      HK var1 = this.a;
      return var1 == null ? (this.a = a(this.a, this.getVertexData())) : var1;
   }

   public final int[] getVertexData() {
      this.a();
      return this.a;
   }

   public final boolean hasTintIndex() {
      return this.a != -1;
   }

   public final int getTintIndex() {
      return this.a;
   }

   public final abP a() {
      abP var1 = this.a;
      return var1 == null ? (this.a = CO.a(this.getVertexData())) : var1;
   }

   public final int[] getVertexDataSingle() {
      int[] var1 = this.b;
      return var1 == null ? (this.b = a(this.getVertexData(), this.a())) : var1;
   }

   private static int[] a(int[] var0, HK var1) {
      int[] var2 = (int[])var0.clone();
      int var3 = var2.length / 4;

      for(int var4 = 0; var4 < 4; ++var4) {
         int var5 = var4 * var3;
         float var6 = Float.intBitsToFloat(var2[var5 + 4]);
         float var7 = Float.intBitsToFloat(var2[var5 + 4 + 1]);
         float var8 = var1.toSingleU(var6);
         float var9 = var1.toSingleV(var7);
         var2[var5 + 4] = Float.floatToRawIntBits(var8);
         var2[var5 + 4 + 1] = Float.floatToRawIntBits(var9);
      }

      return var2;
   }

   public final Ip a() {
      return this.a;
   }

   public final boolean shouldApplyDiffuseLighting() {
      return this.a;
   }

   private static HK a(HO var0, int[] var1) {
      float var2 = 1.0F;
      float var3 = 1.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      int var6 = var1.length / 4;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var7 * var6;
         float var9 = Float.intBitsToFloat(var1[var8 + 4]);
         float var10 = Float.intBitsToFloat(var1[var8 + 4 + 1]);
         var2 = Math.min(var2, var9);
         var3 = Math.min(var3, var10);
         var4 = Math.max(var4, var9);
         var5 = Math.max(var5, var10);
      }

      float var11 = (var2 + var4) / 2.0F;
      float var12 = (var3 + var5) / 2.0F;
      return var0.a((double)var11, (double)var12);
   }

   protected final void a() {
      int[] var1 = this.a;
      if (afT.ad()) {
         if (var1.length == 28) {
            this.a = a(var1);
         }
      } else if (var1.length == 56) {
         this.a = b(var1);
      }

   }

   private static int[] a(int[] var0) {
      int var1 = var0.length / 4;
      int var2 = var1 * 2;
      int[] var3 = new int[var2 * 4];

      for(int var4 = 0; var4 < 4; ++var4) {
         System.arraycopy(var0, var4 * var1, var3, var4 * var2, var1);
      }

      return var3;
   }

   private static int[] b(int[] var0) {
      int var1 = var0.length / 4;
      int var2 = var1 / 2;
      int[] var3 = new int[var2 * 4];

      for(int var4 = 0; var4 < 4; ++var4) {
         System.arraycopy(var0, var4 * var1, var3, var4 * var2, var2);
      }

      return var3;
   }

   public final ajE a() {
      ajE var1 = this.a;
      return var1 == null ? (this.a = new ajE(this.getVertexData())) : var1;
   }

   public final float a() {
      ajE var1 = this.a();
      return (var1.d() + var1.a()) / 2.0F;
   }

   public final float b() {
      ajE var1 = this.a();
      return (var1.e() + var1.b()) / 2.0F;
   }

   public final double a() {
      ajE var1 = this.a();
      return (double)((var1.f() + var1.c()) / 2.0F);
   }

   public final boolean a() {
      ajE var1 = this.a();
      return var1.a(this.a);
   }

   public final boolean b() {
      ajE var1 = this.a();
      return var1.b(this.a);
   }

   public final boolean c() {
      return this.b() && this.a();
   }

   public final CD a() {
      if (!this.b) {
         if (this.a == null && this.a != null && this.a.d != null) {
            this.a = new CE(this.a, this, this.a.d);
         }

         this.b = true;
      }

      return this.a;
   }

   public final String toString() {
      return "vertex: " + this.a.length / 7 + ", tint: " + this.a + ", facing: " + this.a + ", sprite: " + this.a;
   }

   public TextureAtlasSprite getSprite() {
      return (TextureAtlasSprite)d.a(this.a);
   }

   public EnumFacing getFace() {
      return (EnumFacing)d.a(this.a);
   }

   public VertexFormat getFormat() {
      return (VertexFormat)d.a(this.a);
   }
}
