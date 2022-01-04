import dev.xdark.optlibrary.BooleanOption;
import dev.xdark.optlibrary.BooleanOptionBuilder;
import dev.xdark.optlibrary.DoubleOptionBuilder;
import dev.xdark.optlibrary.FloatOption;
import dev.xdark.optlibrary.FloatOptionBuilder;
import dev.xdark.optlibrary.IntOption;
import dev.xdark.optlibrary.IntOptionBuilder;
import dev.xdark.optlibrary.LongOptionBuilder;
import dev.xdark.optlibrary.Option;
import dev.xdark.optlibrary.OptionBuilder;
import dev.xdark.optlibrary.OptionNormalizers;
import dev.xdark.optlibrary.OptionParsers;
import dev.xdark.optlibrary.ValueOptionBuilder;

public class Md {
   public static final BooleanOption a = (BooleanOption)a("invertMouse").parser(OptionParsers.booleanParser(false)).get(() -> {
      return JI.a;
   }).set((var0) -> {
      JI.a = var0;
   }).build();
   public static final FloatOption a = (FloatOption)a("sensitivity").parser(OptionParsers.floatParser(0.8F)).min(0.0F).max(1.0F).get(() -> {
      return JI.a;
   }).set((var0) -> {
      JI.a = var0;
   }).build();
   public static final FloatOption b = (FloatOption)a("fov").parser(OptionParsers.floatParser(0.5F)).min(30.0F).max(110.0F).get(() -> {
      return JI.g;
   }).set((var0) -> {
      JI.g = var0;
   }).build();
   public static final FloatOption c = (FloatOption)a("gamma").parser(OptionParsers.floatParser(0.0F)).min(0.0F).max(10.0F).get(() -> {
      return JI.h;
   }).set((var0) -> {
      JI.h = var0;
   }).build();
   public static final IntOption a = (IntOption)a("renderDistance").parser(OptionParsers.intParser(8)).min(2).max(32).step(1).get(() -> {
      return JI.a;
   }).set((var0) -> {
      JI.a = var0;
   }).build();
   public static final BooleanOption b = (BooleanOption)a("viewBobbing").parser(OptionParsers.booleanParser(true)).get(() -> {
      return JI.b;
   }).set((var0) -> {
      JI.b = var0;
   }).build();
   public static final BooleanOption c = (BooleanOption)a("anaglyph").parser(OptionParsers.booleanParser(false)).get(() -> {
      return false;
   }).build();
   public static final IntOption b = (IntOption)a("framerateLimit").parser(OptionParsers.intParser(60)).min(5).max(260).step(5).get(() -> {
      return JI.b;
   }).set((var0) -> {
      JI.b = var0;
   }).build();
   public static final BooleanOption d = (BooleanOption)a("fboEnable").parser(OptionParsers.booleanParser(false)).get(() -> {
      return JI.c;
   }).set((var0) -> {
      JI.c = var0;
   }).build();
   public static final Option<Me> a;
   public static final Option<Mh> b;
   public static final Option<Mc> c;
   public static final Option<Mg> d;
   public static final Option<Mf> e;

   private static <V> ValueOptionBuilder<V> a(String var0) {
      return (ValueOptionBuilder)a(ValueOptionBuilder.builder(), var0);
   }

   private static LongOptionBuilder a(String var0) {
      return (LongOptionBuilder)a(LongOptionBuilder.builder(), var0);
   }

   private static DoubleOptionBuilder a(String var0) {
      return (DoubleOptionBuilder)a(DoubleOptionBuilder.builder(), var0);
   }

   private static IntOptionBuilder a(String var0) {
      return (IntOptionBuilder)a(IntOptionBuilder.builder(), var0);
   }

   private static FloatOptionBuilder a(String var0) {
      return (FloatOptionBuilder)a(FloatOptionBuilder.builder(), var0);
   }

   private static BooleanOptionBuilder a(String var0) {
      return (BooleanOptionBuilder)a(BooleanOptionBuilder.builder(), var0);
   }

   private static <T extends OptionBuilder<?>> T a(T var0, String var1) {
      var0.name(a(var1)).description(b(var1));
      return var0;
   }

   private static String a(String var0) {
      return "options." + var0;
   }

   private static String b(String var0) {
      return "options." + var0 + ".tooltip";
   }

   static {
      a = a("renderClouds").parser(OptionParsers.enumParser(Me.FANCY)).normalizer(OptionNormalizers.enumNormalizer(Me.VALUES)).min(Me.FAST).max(Me.OFF).get(() -> {
         return Me.VALUES[JI.c];
      }).set((var0) -> {
         JI.c = var0.ordinal();
      }).build();
      b = a("graphics").parser(OptionParsers.enumParser(Mh.FANCY)).normalizer(OptionNormalizers.enumNormalizer(Mh.VALUES)).min(Mh.FAST).max(Mh.FANCY).get(() -> {
         return Mh.VALUES[JI.d ? 1 : 0];
      }).set((var0) -> {
         JI.d = var0.ordinal() == 1;
      }).build();
      c = a("ao").parser(OptionParsers.enumParser(Mc.MAX)).normalizer(OptionNormalizers.enumNormalizer(Mc.VALUES)).min(Mc.MAX).max(Mc.OFF).get(() -> {
         return Mc.VALUES[JI.d];
      }).set((var0) -> {
         JI.d = var0.ordinal();
      }).build();
      d = a("guiScale").parser(OptionParsers.enumParser(Mg.NORMAL)).normalizer(OptionNormalizers.enumNormalizer(Mg.VALUES)).min(Mg.SMALL).max(Mg.HUGE).get(() -> {
         return Mg.VALUES[JI.k];
      }).set((var0) -> {
         JI.k = var0.ordinal();
      }).build();
      e = a("particles").parser(OptionParsers.enumParser(Mf.ALL)).normalizer(OptionNormalizers.enumNormalizer(Mf.VALUES)).min(Mf.ALL).max(Mf.OFF).get(() -> {
         return Mf.VALUES[JI.l];
      }).set((var0) -> {
         JI.l = var0.ordinal();
      }).build();
   }
}
