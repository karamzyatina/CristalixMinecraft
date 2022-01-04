import dev.xdark.clientapi.biome.BiomeProperties;

public final class aev implements BiomeProperties {
   public final String a;
   public float a = 0.1F;
   public float b = 0.2F;
   public float c = 0.5F;
   public float d = 0.5F;
   public int a = 16777215;
   public boolean a;
   public boolean b = true;
   private String b;

   public aev(String var1) {
      this.a = var1;
   }

   protected aev a(float var1) {
      if (var1 > 0.1F && var1 < 0.2F) {
         throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
      } else {
         this.c = var1;
         return this;
      }
   }

   protected aev b(float var1) {
      this.d = var1;
      return this;
   }

   protected aev c(float var1) {
      this.a = var1;
      return this;
   }

   protected aev d(float var1) {
      this.b = var1;
      return this;
   }

   protected aev a() {
      this.b = false;
      return this;
   }

   protected aev b() {
      this.a = true;
      return this;
   }

   protected aev a(int var1) {
      this.a = var1;
      return this;
   }

   protected aev a(String var1) {
      this.b = var1;
      return this;
   }

   // $FF: synthetic method
   static String a(aev var0) {
      return var0.b;
   }

   public String getName() {
      return this.a;
   }

   public float getBaseHeight() {
      return this.a;
   }

   public float getHeightVariation() {
      return this.b;
   }

   public float getTemperature() {
      return this.c;
   }

   public float getRainfall() {
      return this.d;
   }

   public int getWaterColor() {
      return this.a;
   }

   public boolean isSnowEnabled() {
      return this.a;
   }

   public boolean isRainEnabled() {
      return this.b;
   }
}
