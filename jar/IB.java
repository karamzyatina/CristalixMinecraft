import com.mojang.authlib.GameProfile;
import java.util.UUID;

public final class Ib {
   private final aaM a;
   private final aaM b;
   private final aaY a;
   private final aaH a;
   private final aaK a;
   private final abk a;
   private final abo a;
   private final xQ a;
   private final sE a;

   public Ib(sE var1) {
      this.a = new aaM(nC.BASIC);
      this.b = new aaM(nC.TRAP);
      this.a = new aaY();
      this.a = new aaH();
      this.a = new aaK();
      this.a = new abk(SW.WHITE);
      this.a = new abo();
      this.a = var1;
      this.a = new xQ(var1);
   }

   public void a(Vh var1) {
      this.a(var1, 1.0F);
   }

   public void a(Vh var1, float var2) {
      SZ var3 = var1.a();
      if (var3 == RT.cm) {
         this.a.b(var1.a());
         this.a.a(var1, false);
         this.a.a.a(this.a, 0.0D, 0.0D, 0.0D, 0.0F, var2);
      } else if (var3 == RT.aM) {
         this.a.b(var1.a());
         this.a.a(var1);
         this.a.a.a(this.a, 0.0D, 0.0D, 0.0D, 0.0F);
      } else if (var3 == RT.co) {
         this.a.b(var1.a());
         if (var1.b("BlockEntityTag") != null) {
            this.a.a(var1, true);
            this.a.a().d(AJ.b.a(this.a.a(), this.a.a(), this.a.a(), this.a.b()));
         } else {
            this.a.a().d(AJ.a);
         }

         By.C();
         By.b(1.0F, -1.0F, -1.0F);
         this.a.a();
         By.D();
      } else if (var3 == RT.bG) {
         GameProfile var4 = (GameProfile)var1.a;
         if (var4 == null && var1.c()) {
            VR var5 = var1.a();
            if (var5.a("SkullOwner", (int)10)) {
               VR var6 = var5.a("SkullOwner");
               La.a(var6);
               var4 = We.a(var6);
               var1.a = var4;
            } else if (var5.a("SkullOwner", (int)8) && !acK.a((CharSequence)var5.getString("SkullOwner"))) {
               GameProfile var10 = new GameProfile((UUID)null, var5.getString("SkullOwner"));
               var4 = abo.a(var10);
               var1.a = var4;
               var5.a("SkullOwner");
               VR var7 = We.a(new VR(), var4);
               La.a(var7);
               var5.a((String)"SkullOwner", (VK)var7);
            }
         }

         Ii var8 = this.a.a.a;
         this.a.b(var1.a());
         By.C();
         By.q();
         var8.a(this.a, 0.0F, 0.0F, 0.0F, abP.UP, 180.0F, var1.getMetadata(), var4, -1, 0.0F);
         By.p();
         By.D();
      } else if (var3 == SZ.a((nh)RQ.aY)) {
         this.a.b(var1.a());
         this.a.a.a(this.a, 0.0D, 0.0D, 0.0D, 0.0F, var2);
      } else if (var3 == SZ.a((nh)RQ.bj)) {
         this.b.b(var1.a());
         this.a.a.a(this.b, 0.0D, 0.0D, 0.0D, 0.0F, var2);
      } else if (mY.a(var3) instanceof qQ) {
         this.a.b((VR)var1.a());
         SW var9 = qQ.a(var3);
         this.a.a(var9);
         this.a.a(var1);
         this.a.a.a(this.a, 0.0D, 0.0D, 0.0D, 0.0F, var2);
      } else {
         this.a.b(var1.a());
         this.a.a.a(this.a, 0.0D, 0.0D, 0.0D, 0.0F, var2);
      }

   }
}
