public enum JL {
   INVERT_MOUSE("options.invertMouse", false, true),
   SENSITIVITY("options.sensitivity", true, false),
   FOV("options.fov", true, false, 30.0F, 110.0F, 1.0F),
   GAMMA("options.gamma", true, false, 0.0F, 10.0F, 0.0F),
   RENDER_DISTANCE("options.renderDistance", true, false, 2.0F, 16.0F, 1.0F),
   VIEW_BOBBING("options.viewBobbing", false, true),
   FRAMERATE_LIMIT("options.framerateLimit", true, false, 0.0F, 260.0F, 5.0F),
   FBO_ENABLE("options.fboEnable", false, true),
   RENDER_CLOUDS("options.renderClouds", false, false),
   GRAPHICS("options.graphics", false, false),
   AMBIENT_OCCLUSION("options.ao", false, false),
   GUI_SCALE("options.guiScale", false, false),
   PARTICLES("options.particles", false, false),
   CHAT_VISIBILITY("options.chat.visibility", false, false),
   CHAT_COLOR("options.chat.color", false, true),
   CHAT_LINKS("options.chat.links", false, true),
   CHAT_OPACITY("options.chat.opacity", true, false),
   CHAT_LINKS_PROMPT("options.chat.links.prompt", false, true),
   CHAT_LINES("options.chat.lines", true, false, 100.0F, 1000.0F, 1.0F),
   USE_FULLSCREEN("options.fullscreen", false, true),
   ENABLE_VSYNC("options.vsync", false, true),
   USE_VBO("options.vbo", false, true),
   TOUCHSCREEN("options.touchscreen", false, true),
   CHAT_SCALE("options.chat.scale", true, false),
   CHAT_WIDTH("options.chat.width", true, false),
   CHAT_HEIGHT_FOCUSED("options.chat.height.focused", true, false),
   CHAT_HEIGHT_UNFOCUSED("options.chat.height.unfocused", true, false),
   MIPMAP_LEVELS("options.mipmapLevels", true, false, 0.0F, 4.0F, 1.0F),
   FORCE_UNICODE_FONT("options.forceUnicodeFont", false, true),
   REDUCED_DEBUG_INFO("options.reducedDebugInfo", false, true),
   ENTITY_SHADOWS("options.entityShadows", false, true),
   MAIN_HAND("options.mainHand", false, false),
   ATTACK_INDICATOR("options.attackIndicator", false, false),
   SHOW_SUBTITLES("options.showSubtitles", false, true),
   AUTO_JUMP("options.autoJump", false, true),
   FOG_FANCY("of.options.FOG_FANCY", false, false),
   FOG_START("of.options.FOG_START", false, false),
   MIPMAP_TYPE("of.options.MIPMAP_TYPE", true, false, 0.0F, 3.0F, 1.0F),
   SMOOTH_FPS("of.options.SMOOTH_FPS", false, false),
   CLOUDS("of.options.CLOUDS", false, false),
   CLOUD_HEIGHT("of.options.CLOUD_HEIGHT", true, false),
   TREES("of.options.TREES", false, false),
   RAIN("of.options.RAIN", false, false),
   ANIMATED_WATER("of.options.ANIMATED_WATER", false, false),
   ANIMATED_LAVA("of.options.ANIMATED_LAVA", false, false),
   ANIMATED_FIRE("of.options.ANIMATED_FIRE", false, false),
   ANIMATED_PORTAL("of.options.ANIMATED_PORTAL", false, false),
   AO_LEVEL("of.options.AO_LEVEL", true, false),
   SHOW_FPS("of.options.SHOW_FPS", false, false),
   BETTER_GRASS("of.options.BETTER_GRASS", false, false),
   ANIMATED_REDSTONE("of.options.ANIMATED_REDSTONE", false, false),
   ANIMATED_EXPLOSION("of.options.ANIMATED_EXPLOSION", false, false),
   ANIMATED_FLAME("of.options.ANIMATED_FLAME", false, false),
   ANIMATED_SMOKE("of.options.ANIMATED_SMOKE", false, false),
   WEATHER("of.options.WEATHER", false, false),
   SKY("of.options.SKY", false, false),
   STARS("of.options.STARS", false, false),
   SUN_MOON("of.options.SUN_MOON", false, false),
   VIGNETTE("of.options.VIGNETTE", false, false),
   CHUNK_UPDATES("of.options.CHUNK_UPDATES", false, false),
   TIME("of.options.TIME", false, false),
   CLEAR_WATER("of.options.CLEAR_WATER", false, false),
   SMOOTH_WORLD("of.options.SMOOTH_WORLD", false, false),
   VOID_PARTICLES("of.options.VOID_PARTICLES", false, false),
   WATER_PARTICLES("of.options.WATER_PARTICLES", false, false),
   RAIN_SPLASH("of.options.RAIN_SPLASH", false, false),
   PORTAL_PARTICLES("of.options.PORTAL_PARTICLES", false, false),
   POTION_PARTICLES("of.options.POTION_PARTICLES", false, false),
   FIREWORK_PARTICLES("of.options.FIREWORK_PARTICLES", false, false),
   DRIPPING_WATER_LAVA("of.options.DRIPPING_WATER_LAVA", false, false),
   BETTER_SNOW("of.options.BETTER_SNOW", false, false),
   FULLSCREEN_MODE("of.options.FULLSCREEN_MODE", true, false, 0.0F, (float)afT.a().length, 1.0F),
   ANIMATED_TERRAIN("of.options.ANIMATED_TERRAIN", false, false),
   SWAMP_COLORS("of.options.SWAMP_COLORS", false, false),
   SMOOTH_BIOMES("of.options.SMOOTH_BIOMES", false, false),
   CUSTOM_COLORS("of.options.CUSTOM_COLORS", false, false),
   SHOW_CAPES("of.options.SHOW_CAPES", false, false),
   CONNECTED_TEXTURES("of.options.CONNECTED_TEXTURES", false, false),
   AA_LEVEL("of.options.AA_LEVEL", true, false, 0.0F, 16.0F, 1.0F),
   AF_LEVEL("of.options.AF_LEVEL", true, false, 1.0F, 16.0F, 1.0F),
   ANIMATED_TEXTURES("of.options.ANIMATED_TEXTURES", false, false),
   NATURAL_TEXTURES("of.options.NATURAL_TEXTURES", false, false),
   EMISSIVE_TEXTURES("of.options.EMISSIVE_TEXTURES", false, false),
   HELD_ITEM_TOOLTIPS("of.options.HELD_ITEM_TOOLTIPS", false, false),
   DROPPED_ITEMS("of.options.DROPPED_ITEMS", false, false),
   CUSTOM_SKY("of.options.CUSTOM_SKY", false, false),
   FAST_MATH("of.options.FAST_MATH", false, false),
   FAST_RENDER("of.options.FAST_RENDER", false, false),
   TRANSLUCENT_BLOCKS("of.options.TRANSLUCENT_BLOCKS", false, false),
   DYNAMIC_FOV("of.options.DYNAMIC_FOV", false, false),
   DYNAMIC_LIGHTS("of.options.DYNAMIC_LIGHTS", false, false),
   ALTERNATE_BLOCKS("of.options.ALTERNATE_BLOCKS", false, false),
   CUSTOM_ENTITY_MODELS("of.options.CUSTOM_ENTITY_MODELS", false, false),
   ADVANCED_TOOLTIPS("of.options.ADVANCED_TOOLTIPS", false, false),
   SCREENSHOT_SIZE("of.options.SCREENSHOT_SIZE", false, false),
   CUSTOM_GUIS("of.options.CUSTOM_GUIS", false, false),
   RENDER_REGIONS("of.options.RENDER_REGIONS", false, false),
   SHOW_GL_ERRORS("of.options.SHOW_GL_ERRORS", false, false),
   SMART_ANIMATIONS("of.options.SMART_ANIMATIONS", false, false);

   public static final JL[] VALUES = values();
   private final boolean isFloat;
   private final boolean isBoolean;
   private final String translation;
   private final float valueStep;
   private final float valueMin;
   private float valueMax;

   public static JL a(int var0) {
      return (JL)La.a((Object[])VALUES, var0);
   }

   private JL(String var3, boolean var4, boolean var5) {
      this(var3, var4, var5, 0.0F, 1.0F, 0.0F);
   }

   private JL(String var3, boolean var4, boolean var5, float var6, float var7, float var8) {
      this.translation = var3;
      this.isFloat = var4;
      this.isBoolean = var5;
      this.valueMin = var6;
      this.valueMax = var7;
      this.valueStep = var8;
   }

   public boolean a() {
      return this.isFloat;
   }

   public boolean b() {
      return this.isBoolean;
   }

   public int a() {
      return this.ordinal();
   }

   public String a() {
      return this.translation;
   }

   public float a() {
      return this.valueMin;
   }

   public float b() {
      return this.valueMax;
   }

   public void a(float var1) {
      this.valueMax = var1;
   }

   public float a(float var1) {
      return adh.a((this.c(var1) - this.valueMin) / (this.valueMax - this.valueMin), 0.0F, 1.0F);
   }

   public float b(float var1) {
      return this.c(this.valueMin + (this.valueMax - this.valueMin) * adh.a(var1, 0.0F, 1.0F));
   }

   public float c(float var1) {
      var1 = this.d(var1);
      return adh.a(var1, this.valueMin, this.valueMax);
   }

   private float d(float var1) {
      if (this.valueStep > 0.0F) {
         var1 = this.valueStep * (float)Math.round(var1 / this.valueStep);
      }

      return var1;
   }

   // $FF: synthetic method
   static float a(JL var0) {
      return var0.valueMax;
   }

   // $FF: synthetic method
   static float b(JL var0) {
      return var0.valueMin;
   }
}
