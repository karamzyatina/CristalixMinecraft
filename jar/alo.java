import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public final class alO {
   public String a;
   private final int b;
   private final int c;
   private int d;
   private final int e;
   private final int f;
   private final boolean a;
   private final float a;
   private float[] b;
   private agM b;
   private int g;
   private boolean b;
   private boolean c;
   private boolean d;
   public aeu[] a;
   public agM a;
   private float b;
   private amh a;
   public int a;
   private aej a;
   public static final float[] a = new float[]{1.0F, 0.0F, 0.0F};

   public alO(Properties var1, String var2) {
      this.b = a;
      this.b = null;
      this.g = 8;
      this.b = true;
      this.c = false;
      this.d = false;
      this.a = null;
      this.a = null;
      this.b = 1.0F;
      this.a = null;
      this.a = -1;
      this.a = null;
      agC var3 = new agC("CustomSky");
      this.a = var1.getProperty("source", var2);
      this.b = this.a(var1.getProperty("startFadeIn"));
      this.c = this.a(var1.getProperty("endFadeIn"));
      this.d = this.a(var1.getProperty("startFadeOut"));
      this.e = this.a(var1.getProperty("endFadeOut"));
      this.f = ajQ.a(var1.getProperty("blend"));
      this.a = this.a(var1.getProperty("rotate"), true);
      this.a = this.a(var1.getProperty("speed"), 1.0F);
      this.b = this.a(var1.getProperty("axis"), a);
      this.b = var3.a(var1.getProperty("days"));
      this.g = var3.a((String)var1.getProperty("daysLoop"), 8);
      List var4 = this.a(var1.getProperty("weather", "clear"));
      this.b = var4.contains("clear");
      this.c = var4.contains("rain");
      this.d = var4.contains("thunder");
      this.a = var3.a(var1.getProperty("biomes"));
      this.a = var3.a(var1.getProperty("heights"));
      this.b = this.a(var1.getProperty("transition"), 1.0F);
   }

   private List<String> a(String var1) {
      List var2 = Arrays.asList("clear", "rain", "thunder");
      ArrayList var3 = new ArrayList();
      String[] var4 = afT.a(var1, " ");

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var4[var5];
         if (!var2.contains(var6)) {
            afT.b("Unknown weather: " + var6);
         } else {
            var3.add(var6);
         }
      }

      return var3;
   }

   private int a(String var1) {
      if (var1 == null) {
         return -1;
      } else {
         String[] var2 = afT.a(var1, ":");
         if (var2.length != 2) {
            afT.b("Invalid time: " + var1);
            return -1;
         } else {
            String var3 = var2[0];
            String var4 = var2[1];
            int var5 = afT.a((String)var3, -1);
            int var6 = afT.a((String)var4, -1);
            if (var5 >= 0 && var5 <= 23 && var6 >= 0 && var6 <= 59) {
               var5 -= 6;
               if (var5 < 0) {
                  var5 += 24;
               }

               int var7 = var5 * 1000 + (int)((double)var6 / 60.0D * 1000.0D);
               return var7;
            } else {
               afT.b("Invalid time: " + var1);
               return -1;
            }
         }
      }
   }

   private boolean a(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      } else if (var1.equalsIgnoreCase("true")) {
         return true;
      } else if (var1.equalsIgnoreCase("false")) {
         return false;
      } else {
         afT.b("Unknown boolean: " + var1);
         return var2;
      }
   }

   private float a(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         float var3 = afT.a(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            afT.b("Invalid value: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   private float[] a(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         String[] var3 = afT.a(var1, " ");
         if (var3.length != 3) {
            afT.b("Invalid axis: " + var1);
            return var2;
         } else {
            float[] var4 = new float[3];

            for(int var5 = 0; var5 < var3.length; ++var5) {
               var4[var5] = afT.a(var3[var5], Float.MIN_VALUE);
               if (var4[var5] == Float.MIN_VALUE) {
                  afT.b("Invalid axis: " + var1);
                  return var2;
               }

               if (var4[var5] < -1.0F || var4[var5] > 1.0F) {
                  afT.b("Invalid axis values: " + var1);
                  return var2;
               }
            }

            float var9 = var4[0];
            float var6 = var4[1];
            float var7 = var4[2];
            if (var9 * var9 + var6 * var6 + var7 * var7 < 1.0E-5F) {
               afT.b("Invalid axis values: " + var1);
               return var2;
            } else {
               float[] var8 = new float[]{var7, var6, -var9};
               return var8;
            }
         }
      }
   }

   public boolean a(String var1) {
      if (this.a == null) {
         afT.b("No source texture: " + var1);
         return false;
      } else {
         this.a = amj.a(this.a, amj.a(var1));
         if (this.b >= 0 && this.c >= 0 && this.e >= 0) {
            int var2 = this.a(this.c - this.b);
            if (this.d < 0) {
               this.d = this.a(this.e - var2);
               if (this.a(this.d, this.b, this.c)) {
                  this.d = this.c;
               }
            }

            int var3 = this.a(this.d - this.c);
            int var4 = this.a(this.e - this.d);
            int var5 = this.a(this.b - this.e);
            int var6 = var2 + var3 + var4 + var5;
            if (var6 != 24000) {
               afT.b("Invalid fadeIn/fadeOut times, sum is not 24h: " + var6);
               return false;
            } else if (this.a < 0.0F) {
               afT.b("Invalid speed: " + this.a);
               return false;
            } else if (this.g <= 0) {
               afT.b("Invalid daysLoop: " + this.g);
               return false;
            } else {
               return true;
            }
         } else {
            afT.b("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
         }
      }
   }

   private int a(int var1) {
      while(var1 >= 24000) {
         var1 -= 24000;
      }

      while(var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   public void a(sE var1, Cw var2, aej var3, int var4, float var5, float var6, float var7) {
      float var8 = this.a(var1, var3);
      float var9 = this.a(var6, var7);
      float var10 = this.a(var4);
      float var11 = var8 * var9 * var10;
      var11 = afT.a(var11, 0.0F, 1.0F);
      if (var11 >= 1.0E-4F) {
         By.i(this.a);
         ajQ.a(this.f, var11);
         By.C();
         if (this.a) {
            float var12 = 0.0F;
            if (this.a != (float)Math.round(this.a)) {
               long var13 = (var3.b() + 18000L) / 24000L;
               double var15 = (double)(this.a % 1.0F);
               double var17 = (double)var13 * var15;
               var12 = (float)(var17 % 1.0D);
            }

            By.b(360.0F * (var12 + var5 * this.a), this.b[0], this.b[1], this.b[2]);
         }

         By.b(90.0F, 1.0F, 0.0F, 0.0F);
         By.b(-90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Cw)var2, 4);
         By.C();
         By.b(90.0F, 1.0F, 0.0F, 0.0F);
         this.a((Cw)var2, 1);
         By.D();
         By.C();
         By.b(-90.0F, 1.0F, 0.0F, 0.0F);
         this.a((Cw)var2, 0);
         By.D();
         By.b(90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Cw)var2, 5);
         By.b(90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Cw)var2, 2);
         By.b(90.0F, 0.0F, 0.0F, 1.0F);
         this.a((Cw)var2, 3);
         By.D();
      }

   }

   private float a(sE var1, aej var2) {
      if (this.a == null && this.a == null) {
         return 1.0F;
      } else {
         float var3 = this.b(var1, var2);
         if (this.a == null) {
            this.a = new amh(var3, this.b);
         }

         var3 = this.a.a(var3);
         return var3;
      }
   }

   private float b(sE var1, aej var2) {
      NN var3 = var1.a();
      if (var3 == null) {
         return 0.0F;
      } else {
         acV var4 = var3.a_();
         if (this.a != null) {
            aeu var5 = var2.a(var4);
            if (var5 == null) {
               return 0.0F;
            }

            if (!agI.a(var5, this.a)) {
               return 0.0F;
            }
         }

         return this.a != null && !this.a.a(var4.b) ? 0.0F : 1.0F;
      }
   }

   private float a(float var1, float var2) {
      float var3 = 1.0F - var1;
      float var4 = var1 - var2;
      float var5 = 0.0F;
      if (this.b) {
         var5 += var3;
      }

      if (this.c) {
         var5 += var4;
      }

      if (this.d) {
         var5 += var2;
      }

      var5 = ame.a(var5, 0.0F, 1.0F);
      return var5;
   }

   private float a(int var1) {
      int var2;
      int var3;
      if (this.a(var1, this.b, this.c)) {
         var2 = this.a(this.c - this.b);
         var3 = this.a(var1 - this.b);
         return (float)var3 / (float)var2;
      } else if (this.a(var1, this.c, this.d)) {
         return 1.0F;
      } else if (this.a(var1, this.d, this.e)) {
         var2 = this.a(this.e - this.d);
         var3 = this.a(var1 - this.d);
         return 1.0F - (float)var3 / (float)var2;
      } else {
         return 0.0F;
      }
   }

   private void a(Cw var1, int var2) {
      Bh var3 = var1.a();
      double var4 = (double)(var2 % 3) / 3.0D;
      double var6 = (double)(var2 / 3) / 2.0D;
      var3.a(7, In.g);
      var3.a(-100.0D, -100.0D, -100.0D).a(var4, var6).endVertex();
      var3.a(-100.0D, -100.0D, 100.0D).a(var4, var6 + 0.5D).endVertex();
      var3.a(100.0D, -100.0D, 100.0D).a(var4 + 0.3333333333333333D, var6 + 0.5D).endVertex();
      var3.a(100.0D, -100.0D, -100.0D).a(var4 + 0.3333333333333333D, var6).endVertex();
      var1.draw();
   }

   public boolean a(aej var1, int var2) {
      if (var1 != this.a) {
         this.a = var1;
         this.a = null;
      }

      if (this.a(var2, this.e, this.b)) {
         return false;
      } else if (this.b == null) {
         return true;
      } else {
         long var3 = var1.b();

         long var5;
         for(var5 = var3 - (long)this.b; var5 < 0L; var5 += (long)(24000 * this.g)) {
         }

         int var7 = (int)(var5 / 24000L);
         int var8 = var7 % this.g;
         return this.b.a(var8);
      }
   }

   private boolean a(int var1, int var2, int var3) {
      if (var2 <= var3) {
         return var1 >= var2 && var1 <= var3;
      } else {
         return var1 >= var2 || var1 <= var3;
      }
   }

   public String toString() {
      return this.a + ", " + this.b + '-' + this.c + ' ' + this.d + '-' + this.e;
   }
}
