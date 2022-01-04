import com.mojang.authlib.GameProfile;
import java.util.UUID;

public final class UZ extends SZ {
   private static final String[] a = new String[]{"skeleton", "wither", "zombie", "char", "creeper", "dragon"};

   public UZ() {
      this.a(KC.b);
      this.c(0);
      this.a(true);
   }

   public abN a(Rn var1, aej var2, acV var3, abU var4, abP var5, float var6, float var7, float var8) {
      if (var5 == abP.DOWN) {
         return abN.FAIL;
      } else {
         sD var9 = var2.a(var3);
         nh var10 = var9.a();
         boolean var11 = var10.a((aec)var2, (acV)var3);
         if (!var11) {
            if (!var2.a(var3).a().isSolid()) {
               return abN.FAIL;
            }

            var3 = var3.a(var5);
         }

         Vh var12 = var1.a((abU)var4);
         return var1.a(var3, var5, var12) && RQ.a.a((aej)var2, (acV)var3) ? abN.SUCCESS : abN.FAIL;
      }
   }

   public void a(KC var1, acz<Vh> var2) {
      if (this.a(var1)) {
         for(int var3 = 0; var3 < a.length; ++var3) {
            var2.add(new Vh(this, 1, var3));
         }
      }

   }

   public int getMetadata(int var1) {
      return var1;
   }

   public String b(Vh var1) {
      int var2 = var1.getMetadata();
      if (var2 < 0 || var2 >= a.length) {
         var2 = 0;
      }

      return super.getTranslationKey() + '.' + a[var2];
   }

   public String c(Vh var1) {
      if (var1.getMetadata() == 3 && var1.c()) {
         if (var1.a().a("SkullOwner", (int)8)) {
            return adM.a("item.skull.player.name", var1.a().getString("SkullOwner"));
         }

         if (var1.a().a("SkullOwner", (int)10)) {
            VR var2 = var1.a().a("SkullOwner");
            if (var2.a("Name", (int)8)) {
               return adM.a("item.skull.player.name", var2.getString("Name"));
            }
         }
      }

      return super.c(var1);
   }

   public boolean a(VR var1) {
      super.a(var1);
      if (var1.a("SkullOwner", (int)8) && !acK.a((CharSequence)var1.getString("SkullOwner"))) {
         GameProfile var2 = new GameProfile((UUID)null, var1.getString("SkullOwner"));
         var2 = abo.a(var2);
         var1.a((String)"SkullOwner", (VK)We.a(new VR(), var2));
         return true;
      } else {
         return false;
      }
   }
}
