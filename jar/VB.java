public class vb extends ajk {
   private final uI a;
   protected String a = "Video Settings";
   private final JI a;
   private static final JL[] a;
   private final ajm a = new ajm(this, new ajp());

   public vb(uI var1, JI var2) {
      this.a = var1;
      this.a = var2;
   }

   public void b_() {
      this.a.a.b();
   }

   public void b() {
      this.a = IK.a("options.videoTitle");
      this.a.clear();

      int var1;
      for(var1 = 0; var1 < a.length; ++var1) {
         JL var2 = a[var1];
         int var3 = this.c / 2 - 155 + var1 % 2 * 160;
         int var4 = this.d / 6 + 21 * (var1 / 2) - 12;
         if (var2.a()) {
            this.a.add(new ajg(this.a, var2.a(), var3, var4, var2));
         } else {
            this.a.add(new ajf(var2.a(), var3, var4, var2, this.a.a(var2)));
         }
      }

      var1 = this.d / 6 + 21 * (a.length / 2) - 12;
      boolean var5 = false;
      int var6 = this.c / 2 - 155;
      this.a.add(new uy(231, var6, var1, agt.a("of.options.shaders")));
      var6 = this.c / 2 - 155 + 160;
      this.a.add(new uy(202, var6, var1, agt.a("of.options.quality")));
      var1 += 21;
      var6 = this.c / 2 - 155;
      this.a.add(new uy(201, var6, var1, agt.a("of.options.details")));
      var6 = this.c / 2 - 155 + 160;
      this.a.add(new uy(212, var6, var1, agt.a("of.options.performance")));
      var1 += 21;
      var6 = this.c / 2 - 155;
      this.a.add(new uy(211, var6, var1, agt.a("of.options.animations")));
      var6 = this.c / 2 - 155 + 160;
      this.a.add(new uy(222, var6, var1, agt.a("of.options.other")));
      this.a.add(new tL(200, this.c / 2 - 100, this.d / 6 + 168 + 11, IK.a("gui.done")));
   }

   public void a(tL var1) {
      this.a(var1, 1);
   }

   public void b(tL var1) {
      if (var1.e == JL.GUI_SCALE.ordinal()) {
         this.a(var1, -1);
      }

   }

   private void a(tL var1, int var2) {
      if (var1.a) {
         int var3 = JI.k;
         if (var1.e < 200 && var1 instanceof uy) {
            this.a.a(((uy)var1).a(), var2);
            var1.a = this.a.a(JL.a(var1.e));
         }

         if (var1.e == 200) {
            this.a.a(this.a);
         }

         if (JI.k != var3) {
            vk var4 = this.a.a();
            int var5 = var4.getScaledWidth();
            int var6 = var4.getScaledHeight();
            this.b(this.a, var5, var6);
         }

         if (var1.e == 201) {
            ajd var7 = new ajd(this);
            this.a.a((uI)var7);
         }

         if (var1.e == 202) {
            ajj var8 = new ajj(this);
            this.a.a((uI)var8);
         }

         if (var1.e == 211) {
            ajc var9 = new ajc(this);
            this.a.a((uI)var9);
         }

         if (var1.e == 212) {
            aji var10 = new aji(this);
            this.a.a((uI)var10);
         }

         if (var1.e == 222) {
            ajh var11 = new ajh(this);
            this.a.a((uI)var11);
         }

         if (var1.e == 231) {
            if (afT.M() || afT.N()) {
               afT.a(this.a, agt.a("of.message.shaders.aa1"), agt.a("of.message.shaders.aa2"));
               return;
            }

            if (afT.L()) {
               afT.a(this.a, agt.a("of.message.shaders.af1"), agt.a("of.message.shaders.af2"));
               return;
            }

            if (afT.ac()) {
               afT.a(this.a, agt.a("of.message.shaders.fr1"), agt.a("of.message.shaders.fr2"));
               return;
            }

            aln var12 = new aln(this, this.a);
            this.a.a((uI)var12);
         }

         this.a.a.b();
      }

   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.a(this.a, this.a, this.c / 2, 15, 16777215);
      super.drawScreen(var1, var2, var3);
      this.a.a(var1, var2, this.a);
   }

   public static int a(tL var0) {
      return var0.a;
   }

   public static int b(tL var0) {
      return var0.b;
   }

   protected void keyTyped(char var1, int var2) {
      if (var2 == 1) {
         this.a.a.b();
      }

      super.keyTyped(var1, var2);
   }

   static {
      a = new JL[]{JL.GRAPHICS, JL.RENDER_DISTANCE, JL.AMBIENT_OCCLUSION, JL.FRAMERATE_LIMIT, JL.AO_LEVEL, JL.VIEW_BOBBING, JL.GUI_SCALE, JL.USE_VBO, JL.GAMMA, JL.ATTACK_INDICATOR, JL.DYNAMIC_LIGHTS, JL.DYNAMIC_FOV};
   }
}
