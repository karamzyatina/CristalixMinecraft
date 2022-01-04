import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class GZ implements Hn {
   private final xN a;
   private final sE a;

   public GZ(sE var1, xN var2) {
      this.a = var1;
      this.a = var2;
   }

   public void a(Oh var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      Vh var9 = var1.a(SB.HEAD);
      if (!var9.isEmpty()) {
         SZ var10 = var9.a();
         By.C();
         if (var1.isSneaking()) {
            By.c(0.0F, 0.2F, 0.0F);
         }

         boolean var11 = var1 instanceof QZ || var1 instanceof Qw;
         if (var1.isChild() && !(var1 instanceof QZ)) {
            By.c(0.0F, 0.5F * var8, 0.0F);
            By.b(0.7F, 0.7F, 0.7F);
            By.c(0.0F, 16.0F * var8, 0.0F);
         }

         this.a.c(0.0625F);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         if (var10 == RT.bG) {
            By.b(1.1875F, -1.1875F, -1.1875F);
            if (var11) {
               By.c(0.0F, 0.0625F, 0.0F);
            }

            GameProfile var12 = (GameProfile)var9.a;
            if (var12 == null && var9.c()) {
               VR var13 = var9.a();
               if (var13.a("SkullOwner", (int)10)) {
                  var12 = We.a(var13.a("SkullOwner"));
                  var9.a = var12;
               } else if (var13.a("SkullOwner", (int)8)) {
                  String var14 = var13.getString("SkullOwner");
                  if (!acK.a((CharSequence)var14)) {
                     var12 = abo.a(new GameProfile((UUID)null, var14));
                     var9.a = var12;
                     var13.a((String)"SkullOwner", (VK)We.a(new VR(), var12));
                  }
               }
            }

            Ii var15 = this.a.a.a;
            var15.a(-0.5F, 0.0F, -0.5F, abP.UP, 180.0F, var9.getMetadata(), var12, -1, var2);
         } else if (!(var10 instanceof TA) || ((TA)var10).a() != SB.HEAD) {
            By.c(0.0F, -0.25F, 0.0F);
            By.b(180.0F, 0.0F, 1.0F, 0.0F);
            By.b(0.625F, -0.625F, -0.625F);
            if (var11) {
               By.c(0.0F, 0.1875F, 0.0F);
            }

            this.a.a().a(var1, var9, CZ.HEAD);
         }

         By.D();
      }

   }

   public boolean a() {
      return false;
   }
}
