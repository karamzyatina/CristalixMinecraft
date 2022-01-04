public enum aiN {
   PLUS(10, aiJ.FLOAT, "+", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   MINUS(10, aiJ.FLOAT, "-", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   MUL(11, aiJ.FLOAT, "*", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   DIV(11, aiJ.FLOAT, "/", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   MOD(11, aiJ.FLOAT, "%", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   NEG(12, aiJ.FLOAT, "neg", new aiJ[]{aiJ.FLOAT}),
   PI(aiJ.FLOAT, "pi", new aiJ[0]),
   SIN(aiJ.FLOAT, "sin", new aiJ[]{aiJ.FLOAT}),
   COS(aiJ.FLOAT, "cos", new aiJ[]{aiJ.FLOAT}),
   ASIN(aiJ.FLOAT, "asin", new aiJ[]{aiJ.FLOAT}),
   ACOS(aiJ.FLOAT, "acos", new aiJ[]{aiJ.FLOAT}),
   TAN(aiJ.FLOAT, "tan", new aiJ[]{aiJ.FLOAT}),
   ATAN(aiJ.FLOAT, "atan", new aiJ[]{aiJ.FLOAT}),
   ATAN2(aiJ.FLOAT, "atan2", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   TORAD(aiJ.FLOAT, "torad", new aiJ[]{aiJ.FLOAT}),
   TODEG(aiJ.FLOAT, "todeg", new aiJ[]{aiJ.FLOAT}),
   MIN(aiJ.FLOAT, "min", (new aiX()).a(aiJ.FLOAT).b(aiJ.FLOAT)),
   MAX(aiJ.FLOAT, "max", (new aiX()).a(aiJ.FLOAT).b(aiJ.FLOAT)),
   CLAMP(aiJ.FLOAT, "clamp", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT, aiJ.FLOAT}),
   ABS(aiJ.FLOAT, "abs", new aiJ[]{aiJ.FLOAT}),
   FLOOR(aiJ.FLOAT, "floor", new aiJ[]{aiJ.FLOAT}),
   CEIL(aiJ.FLOAT, "ceil", new aiJ[]{aiJ.FLOAT}),
   EXP(aiJ.FLOAT, "exp", new aiJ[]{aiJ.FLOAT}),
   FRAC(aiJ.FLOAT, "frac", new aiJ[]{aiJ.FLOAT}),
   LOG(aiJ.FLOAT, "log", new aiJ[]{aiJ.FLOAT}),
   POW(aiJ.FLOAT, "pow", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   RANDOM(aiJ.FLOAT, "random", new aiJ[0]),
   ROUND(aiJ.FLOAT, "round", new aiJ[]{aiJ.FLOAT}),
   SIGNUM(aiJ.FLOAT, "signum", new aiJ[]{aiJ.FLOAT}),
   SQRT(aiJ.FLOAT, "sqrt", new aiJ[]{aiJ.FLOAT}),
   FMOD(aiJ.FLOAT, "fmod", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   TIME(aiJ.FLOAT, "time", new aiJ[0]),
   IF(aiJ.FLOAT, "if", (new aiX()).a(aiJ.BOOL, aiJ.FLOAT).b(aiJ.BOOL, aiJ.FLOAT).c(aiJ.FLOAT)),
   NOT(12, aiJ.BOOL, "!", new aiJ[]{aiJ.BOOL}),
   AND(3, aiJ.BOOL, "&&", new aiJ[]{aiJ.BOOL, aiJ.BOOL}),
   OR(2, aiJ.BOOL, "||", new aiJ[]{aiJ.BOOL, aiJ.BOOL}),
   GREATER(8, aiJ.BOOL, ">", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   GREATER_OR_EQUAL(8, aiJ.BOOL, ">=", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   SMALLER(8, aiJ.BOOL, "<", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   SMALLER_OR_EQUAL(8, aiJ.BOOL, "<=", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   EQUAL(7, aiJ.BOOL, "==", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   NOT_EQUAL(7, aiJ.BOOL, "!=", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   BETWEEN(7, aiJ.BOOL, "between", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT, aiJ.FLOAT}),
   EQUALS(7, aiJ.BOOL, "equals", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT, aiJ.FLOAT}),
   IN(aiJ.BOOL, "in", (new aiX()).a(aiJ.FLOAT).b(aiJ.FLOAT).c(aiJ.FLOAT)),
   SMOOTH(aiJ.FLOAT, "smooth", (new aiX()).a(aiJ.FLOAT).b(aiJ.FLOAT).a(4)),
   TRUE(aiJ.BOOL, "true", new aiJ[0]),
   FALSE(aiJ.BOOL, "false", new aiJ[0]),
   VEC2(aiJ.FLOAT_ARRAY, "vec2", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT}),
   VEC3(aiJ.FLOAT_ARRAY, "vec3", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT, aiJ.FLOAT}),
   VEC4(aiJ.FLOAT_ARRAY, "vec4", new aiJ[]{aiJ.FLOAT, aiJ.FLOAT, aiJ.FLOAT, aiJ.FLOAT});

   private int precedence;
   private final aiJ expressionType;
   private final String name;
   private final aiV parameters;
   public static aiN[] VALUES = values();

   private aiN(aiJ var3, String var4, aiJ[] var5) {
      this.expressionType = var3;
      this.name = var4;
      this.parameters = new aiW(var5);
   }

   private aiN(int var3, aiJ var4, String var5, aiJ[] var6) {
      this.precedence = var3;
      this.expressionType = var4;
      this.name = var5;
      this.parameters = new aiW(var6);
   }

   private aiN(aiJ var3, String var4, aiV var5) {
      this.expressionType = var3;
      this.name = var4;
      this.parameters = var5;
   }

   private aiN(int var3, aiJ var4, String var5, aiV var6) {
      this.precedence = var3;
      this.expressionType = var4;
      this.name = var5;
      this.parameters = var6;
   }

   public String a() {
      return this.name;
   }

   public int a() {
      return this.precedence;
   }

   public aiJ a() {
      return this.expressionType;
   }

   public aiV a() {
      return this.parameters;
   }

   public int a(aiP[] var1) {
      return this.parameters.a(var1).length;
   }

   public aiJ[] a(aiP[] var1) {
      return this.parameters.a(var1);
   }

   public float a(sE var1, aiP[] var2) {
      // $FF: Couldn't be decompiled
   }

   private float b(sE var1, aiP[] var2) {
      if (var2.length == 2) {
         return Math.min(a(var1, var2, 0), a(var1, var2, 1));
      } else {
         float var3 = a(var1, var2, 0);

         for(int var4 = 1; var4 < var2.length; ++var4) {
            float var5 = a(var1, var2, var4);
            if (var5 < var3) {
               var3 = var5;
            }
         }

         return var3;
      }
   }

   private float c(sE var1, aiP[] var2) {
      if (var2.length == 2) {
         return Math.max(a(var1, var2, 0), a(var1, var2, 1));
      } else {
         float var3 = a(var1, var2, 0);

         for(int var4 = 1; var4 < var2.length; ++var4) {
            float var5 = a(var1, var2, var4);
            if (var5 > var3) {
               var3 = var5;
            }
         }

         return var3;
      }
   }

   private static float a(sE var0, aiP[] var1, int var2) {
      return ((aiS)var1[var2]).a(var0);
   }

   public boolean a(sE var1, aiP[] var2) {
      // $FF: Couldn't be decompiled
   }

   private static boolean a(sE var0, aiP[] var1, int var2) {
      return ((aiQ)var1[var2]).a(var0);
   }

   public float[] a(sE var1, aiP[] var2) {
      // $FF: Couldn't be decompiled
   }

   public static aiN a(String var0) {
      aiN[] var1 = VALUES;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         aiN var3 = var1[var2];
         if (var3.a().equals(var0)) {
            return var3;
         }
      }

      return null;
   }
}
