public class ajQ {
   public static int a(String var0) {
      if (var0 == null) {
         return 1;
      } else {
         var0 = var0.toLowerCase().trim();
         byte var1 = -1;
         switch(var0.hashCode()) {
         case -2060248300:
            if (var0.equals("subtract")) {
               var1 = 2;
            }
            break;
         case -1091287984:
            if (var0.equals("overlay")) {
               var1 = 7;
            }
            break;
         case -907689876:
            if (var0.equals("screen")) {
               var1 = 6;
            }
            break;
         case 96417:
            if (var0.equals("add")) {
               var1 = 1;
            }
            break;
         case 3035599:
            if (var0.equals("burn")) {
               var1 = 5;
            }
            break;
         case 92909918:
            if (var0.equals("alpha")) {
               var1 = 0;
            }
            break;
         case 95758295:
            if (var0.equals("dodge")) {
               var1 = 4;
            }
            break;
         case 653829668:
            if (var0.equals("multiply")) {
               var1 = 3;
            }
            break;
         case 1094496948:
            if (var0.equals("replace")) {
               var1 = 8;
            }
         }

         switch(var1) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 4;
         case 5:
            return 5;
         case 6:
            return 6;
         case 7:
            return 7;
         case 8:
            return 8;
         default:
            afT.b("Unknown blend: " + var0);
            return 1;
         }
      }
   }

   public static void a(int var0, float var1) {
      switch(var0) {
      case 0:
         By.c();
         By.l();
         By.b(770, 771);
         By.c(1.0F, 1.0F, 1.0F, var1);
         break;
      case 1:
         By.c();
         By.l();
         By.b(770, 1);
         By.c(1.0F, 1.0F, 1.0F, var1);
         break;
      case 2:
         By.c();
         By.l();
         By.b(775, 0);
         By.c(var1, var1, var1, 1.0F);
         break;
      case 3:
         By.c();
         By.l();
         By.b(774, 771);
         By.c(var1, var1, var1, var1);
         break;
      case 4:
         By.c();
         By.l();
         By.b(1, 1);
         By.c(var1, var1, var1, 1.0F);
         break;
      case 5:
         By.c();
         By.l();
         By.b(0, 769);
         By.c(var1, var1, var1, 1.0F);
         break;
      case 6:
         By.c();
         By.l();
         By.b(1, 769);
         By.c(var1, var1, var1, 1.0F);
         break;
      case 7:
         By.c();
         By.l();
         By.b(774, 768);
         By.c(var1, var1, var1, 1.0F);
         break;
      case 8:
         By.d();
         By.k();
         By.c(1.0F, 1.0F, 1.0F, var1);
      }

      By.v();
   }

   public static void a(float var0) {
      By.c();
      By.l();
      By.b(770, 1);
      By.c(1.0F, 1.0F, 1.0F, var0);
   }
}
