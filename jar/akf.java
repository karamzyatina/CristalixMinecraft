import java.nio.IntBuffer;

public final class akF {
   public static void a(Fb var0, double var1, double var3, double var5) {
      var0.setPosition(var1, var3, var5);
   }

   public static void a(Ck var0, NN var1, double var2, Fb var4, int var5, boolean var6) {
      var0.a(var1, var2, var4, var5, var6);
   }

   public static void a(sE var0) {
      if (akC.b) {
         akC.e = true;
         akC.a(var0, akC.k);
      }

   }

   public static void b(sE var0) {
      if (akC.b) {
         akC.a(var0, akC.k);
      }

   }

   public static void c(sE var0) {
      if (akC.b) {
         akC.a(var0, akC.k);
      }

   }

   public static void d(sE var0) {
      if (akC.b) {
         akC.a(var0, akC.g);
      }

   }

   public static void a(Bn var0, float var1, int var2) {
      if (!akC.c) {
         boolean var3 = akC.m();
         boolean var4 = akC.n();
         if (!var3 || !var4) {
            akC.o();
            akC.a(var0.a, false);
            Lw.c(1.0F, 1.0F, 1.0F, 1.0F);
            akC.a(var3, var4);
            var0.a(var1, var2, true, false, false);
            akC.r();
            akC.b(!var3, !var4);
            akC.a(false, false);
         }
      }

   }

   public static void b(Bn var0, float var1, int var2) {
      if (!akC.c && !akC.o()) {
         akC.o();
         By.l();
         akC.a(var0.a, true);
         Lw.c(1.0F, 1.0F, 1.0F, 1.0F);
         akC.a(akC.q(), akC.r());
         var0.a(var1, var2, true, false, true);
         akC.r();
         akC.b(true, true);
         akC.a(false, false);
      }

   }

   public static void a(Cg var0, float var1, boolean var2) {
      akC.a(true);
      By.a(true);
      if (var2) {
         By.c(519);
         Lw.a();
         IntBuffer var3 = akC.a;
         akC.a(akC.h);
         akC.d = true;
         var0.a(var1);
         akC.d = false;
         akC.a(var3);
         Lw.b();
      }

      By.c(515);
      Lw.c(1.0F, 1.0F, 1.0F, 1.0F);
      var0.a(var1);
      akC.a(false);
   }

   public static void c(Bn var0, float var1, int var2) {
      if (!akC.c) {
         akC.s();
         var0.a(var1, var2, false, true, false);
      }

   }

   public static void e(sE var0) {
      if (akC.b) {
         akC.a(var0, akC.l);
         if (akC.l.b() == akC.k.b()) {
            akC.a(akC.i);
            By.a(false);
         }
      }

   }

   public static void f(sE var0) {
      if (akC.b) {
         By.a(true);
         akC.a(var0, akC.g);
      }

   }

   public static void a(Bn var0, float var1) {
      if (akC.u > 0 && --akC.p <= 0) {
         sE var2 = var0.a;
         Ck var3 = var2.a;
         akC.c = true;
         akC.p = akC.k;
         JI var10000 = var2.a;
         akC.q = JI.j;
         var10000 = var2.a;
         JI.j = 1;
         akC.b("pre shadow");
         Lw.a(5889);
         Lw.a();
         Lw.a(5888);
         Lw.a();
         Lt.a(36160, akC.y);
         akC.b("shadow bind sfb");
         var0.a(var1, 2);
         sE var4 = var0.a;
         akC.b(var4, var1);
         akC.b("shadow camera");
         akC.a(var4, akC.b);
         Lw.c(akC.g);
         akC.b("shadow drawbuffers");
         Lw.y(0);
         akC.b("shadow readbuffer");
         Lt.a(36160, 36096, 3553, akC.e.get(0), 0);
         if (akC.t != 0) {
            Lt.a(36160, 36064, 3553, akC.d.get(0), 0);
         }

         akC.a("shadow fb");
         Lw.b(1.0F, 1.0F, 1.0F, 1.0F);
         Lw.b(akC.t != 0 ? 16640 : 256);
         akC.b("shadow clear");
         EY var5 = aka.a();
         Fa var6 = new Fa(var5);
         NN var7 = var2.a();
         double var8 = var7.g + (var7.d - var7.g) * (double)var1;
         double var10 = var7.h + (var7.e - var7.h) * (double)var1;
         double var12 = var7.i + (var7.f - var7.i) * (double)var1;
         var6.setPosition(var8, var10, var12);
         By.j(7425);
         By.j();
         By.c(515);
         By.a(true);
         By.a(true, true, true, true);
         By.q();
         var2.a().a(HO.a);
         int var14 = var0.b++;
         var3.a(var7, (double)var1, var6, var14, var2.a.isSpectator());
         By.l(5888);
         By.C();
         By.c();
         var3.a(abu.SOLID, (double)var1, 2, var7);
         akC.b("shadow terrain solid");
         By.d();
         var3.a(abu.CUTOUT_MIPPED, (double)var1, 2, var7);
         akC.b("shadow terrain cutoutmipped");
         var2.a().a(HO.a).setBlurMipmap(false, false);
         var3.a(abu.CUTOUT, (double)var1, 2, var7);
         akC.b("shadow terrain cutout");
         var2.a().a(HO.a).restoreLastBlurMipmap();
         By.j(7424);
         By.a(516, 0.1F);
         By.l(5888);
         By.D();
         By.C();
         var3.a(var7, var6, var1);
         akC.b("shadow entities");
         By.l(5888);
         By.D();
         By.a(true);
         By.k();
         By.p();
         By.a(770, 771, 1, 0);
         By.a(516, 0.1F);
         if (akC.u >= 2) {
            By.g(33989);
            akC.b("pre copy shadow depth");
            Lw.a(3553, 0, 0, 0, 0, 0, akC.l, akC.m);
            akC.b("copy shadow depth");
            By.g(33984);
         }

         By.k();
         By.a(true);
         var2.a().a(HO.a);
         By.j(7425);
         akC.b("shadow pre-translucent");
         Lw.c(akC.g);
         akC.b("shadow drawbuffers pre-translucent");
         akC.a("shadow pre-translucent");
         if (akC.d()) {
            var3.a(abu.TRANSLUCENT, (double)var1, 2, var7);
            akC.b("shadow translucent");
         }

         By.j(7424);
         By.a(true);
         By.p();
         By.k();
         Lw.h();
         akC.b("shadow flush");
         akC.c = false;
         var10000 = var2.a;
         JI.j = akC.q;
         if (akC.a) {
            if (akC.u >= 1) {
               if (akC.c[0]) {
                  By.g(33988);
                  By.i(akC.e.get(0));
                  Lw.x(3553);
                  Lw.a(3553, 10241, akC.d[0] ? 9984 : 9987);
               }

               if (akC.u >= 2 && akC.c[1]) {
                  By.g(33989);
                  By.i(akC.e.get(1));
                  Lw.x(3553);
                  Lw.a(3553, 10241, akC.d[1] ? 9984 : 9987);
               }

               By.g(33984);
            }

            if (akC.t >= 1) {
               if (akC.e[0]) {
                  By.g(33997);
                  By.i(akC.d.get(0));
                  Lw.x(3553);
                  Lw.a(3553, 10241, akC.f[0] ? 9984 : 9987);
               }

               if (akC.t >= 2 && akC.e[1]) {
                  By.g(33998);
                  By.i(akC.d.get(1));
                  Lw.x(3553);
                  Lw.a(3553, 10241, akC.f[1] ? 9984 : 9987);
               }

               By.g(33984);
            }
         }

         akC.b("shadow postprocess");
         Lt.a(36160, akC.x);
         Lw.a(0, 0, akC.b, akC.c);
         akC.a = null;
         var2.a().a(HO.a);
         akC.a(var4, akC.k);
         Lw.a(5888);
         Lw.b();
         Lw.a(5889);
         Lw.b();
         Lw.a(5888);
         akC.b("shadow end");
      }

   }

   public static void a(abu var0) {
      if (akC.a(var0)) {
         By.q();
      }

      if (Ci.b()) {
         Lw.e(32885);
         Lw.v(11);
         Lw.v(12);
         Lw.v(10);
      }

   }

   public static void b(abu var0) {
      if (Ci.b()) {
         Lw.f(32885);
         Lw.w(11);
         Lw.w(12);
         Lw.w(10);
      }

      if (akC.a(var0)) {
         By.p();
      }

   }

   public static void a() {
      Lw.a(3, 5126, 56, 0L);
      Lw.b(4, 5121, 56, 12L);
      Lw.c(2, 5126, 56, 16L);
      Ci.j(Ci.o);
      Lw.c(2, 5122, 56, 24L);
      Ci.j(Ci.n);
      Lw.a(5120, 56, 28L);
      Lw.a(11, 2, 5126, false, 56, 32L);
      Lw.a(12, 4, 5122, false, 56, 40L);
      Lw.a(10, 3, 5122, false, 56, 48L);
   }

   public static void g(sE var0) {
      akC.a(var0, akC.q);
   }

   public static void h(sE var0) {
      if (akC.b) {
         if (akC.s() && akC.p()) {
            akC.a(var0, akC.s);
         } else {
            akC.a(var0, akC.o);
         }
      } else {
         akC.a(var0, akC.a);
      }

   }

   public static boolean a(HM var0, Cw var1, aaX var2, double var3, double var5, double var7, float var9, int var10, float var11) {
      if (!akC.c && akC.z.b() == 0) {
         return false;
      } else {
         By.f();
         var0.a(HZ.a);
         Bh var12 = var1.a();
         var12.a(7, In.a);
         float var13 = 0.5F;
         float var14 = var13 * 0.15F;
         float var15 = var13 * 0.3F;
         float var16 = var13 * 0.4F;
         float var17 = 0.0F;
         float var18 = 0.2F;
         float var19 = (float)(System.currentTimeMillis() % 100000L) / 100000.0F;
         short var20 = 240;
         if (var2.a(abP.SOUTH)) {
            var12.a(var3, var5, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5 + 1.0D, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3, var5 + 1.0D, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
         }

         if (var2.a(abP.NORTH)) {
            var12.a(var3, var5 + 1.0D, var7).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5 + 1.0D, var7).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5, var7).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3, var5, var7).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
         }

         if (var2.a(abP.EAST)) {
            var12.a(var3 + 1.0D, var5 + 1.0D, var7).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5 + 1.0D, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5, var7).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
         }

         if (var2.a(abP.WEST)) {
            var12.a(var3, var5, var7).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3, var5, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3, var5 + 1.0D, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3, var5 + 1.0D, var7).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
         }

         if (var2.a(abP.DOWN)) {
            var12.a(var3, var5, var7).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5, var7).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3, var5, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
         }

         if (var2.a(abP.UP)) {
            var12.a(var3, var5 + (double)var11, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5 + (double)var11, var7 + 1.0D).a(var14, var15, var16, 1.0F).a((double)(var17 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3 + 1.0D, var5 + (double)var11, var7).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var18 + var19)).a(var20, var20).endVertex();
            var12.a(var3, var5 + (double)var11, var7).a(var14, var15, var16, 1.0F).a((double)(var18 + var19), (double)(var17 + var19)).a(var20, var20).endVertex();
         }

         var1.draw();
         By.e();
         return true;
      }
   }
}
