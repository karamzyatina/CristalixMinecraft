import com.mojang.authlib.GameProfile;
import java.util.UUID;

public final class abo extends aaD implements aci {
   private int d;
   private int e;
   private GameProfile a;
   private int f;
   private boolean b;

   public VR a(VR var1) {
      super.a(var1);
      var1.a("SkullType", (byte)(this.d & 255));
      var1.a("Rot", (byte)(this.e & 255));
      if (this.a != null) {
         VR var2 = new VR();
         We.a(var2, this.a);
         var1.a((String)"Owner", (VK)var2);
      }

      return var1;
   }

   public void a(VR var1) {
      super.a(var1);
      this.d = var1.getByte("SkullType");
      this.e = var1.getByte("Rot");
      if (this.d == 3) {
         if (var1.a("Owner", (int)10)) {
            VR var2 = var1.a("Owner");
            La.a(var2);
            this.a = We.a(var2);
         } else if (var1.a("ExtraType", (int)8)) {
            String var3 = var1.getString("ExtraType");
            if (!acK.a(var3)) {
               this.a = new GameProfile((UUID)null, var3);
               this.g();
            }
         }
      }

   }

   public void a() {
      if (this.d == 5) {
         if (this.a.d(this.a, this.b, this.c)) {
            this.b = true;
            ++this.f;
         } else {
            this.b = false;
         }
      }

   }

   public float a(float var1) {
      return this.b ? (float)this.f + var1 : (float)this.f;
   }

   public GameProfile a() {
      return this.a;
   }

   public VR a() {
      return this.a(new VR());
   }

   public void b(int var1) {
      this.d = var1;
      this.a = null;
   }

   public void a(GameProfile var1) {
      this.d = 3;
      this.a = var1;
      this.g();
   }

   private void g() {
      this.a = a(this.a);
      this.b();
   }

   public static GameProfile a(GameProfile var0) {
      return var0;
   }

   public int e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }

   public void c(int var1) {
      this.e = var1;
   }

   public void a(act var1) {
      if (this.a != null && this.a.a(this.a, this.b, this.c).a((so)rc.a) == abP.UP) {
         this.e = var1.mirrorRotation(this.e, 16);
      }

   }

   public void a(acE var1) {
      if (this.a != null && this.a.a(this.a, this.b, this.c).a((so)rc.a) == abP.UP) {
         this.e = var1.rotate(this.e, 16);
      }

   }
}
