import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class vw extends uV {
   private final List<Oe> a;
   // $FF: synthetic field
   final vp a;

   public vw(vp var1, sE var2) {
      super(var2, var1.c, var1.d, 32, var1.d - 64, vp.l(var1).a * 4);
      this.a = var1;
      this.a = new ArrayList();
      this.a(false);
      Iterator var3 = Oc.a.values().iterator();

      while(true) {
         Oe var4;
         do {
            if (!var3.hasNext()) {
               return;
            }

            var4 = (Oe)var3.next();
         } while(vp.a(var1).a(var4.a) <= 0 && vp.a(var1).a(var4.b) <= 0);

         this.a.add(var4);
      }
   }

   protected int a() {
      return this.a.size();
   }

   protected void a(int var1, boolean var2, int var3, int var4) {
   }

   protected boolean a(int var1) {
      return false;
   }

   protected int d() {
      return this.a() * vp.m(this.a).a * 4;
   }

   protected void a() {
      this.a.drawDefaultBackground();
   }

   protected void a(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      Oe var8 = (Oe)this.a.get(var1);
      String var9 = IK.a("entity." + Oc.a(var8.a) + ".name");
      int var10 = vp.a(this.a).a(var8.a);
      int var11 = vp.a(this.a).a(var8.b);
      String var12 = IK.a("stat.entityKills", var10, var9);
      String var13 = IK.a("stat.entityKilledBy", var9, var11);
      if (var10 == 0) {
         var12 = IK.a("stat.entityKills.none", var9);
      }

      if (var11 == 0) {
         var13 = IK.a("stat.entityKilledBy.none", var9);
      }

      this.a.b(vp.n(this.a), var9, var2 + 2 - 10, var3 + 1, 16777215);
      this.a.b(vp.o(this.a), var12, var2 + 2, var3 + 1 + vp.p(this.a).a, var10 == 0 ? 6316128 : 9474192);
      this.a.b(vp.q(this.a), var13, var2 + 2, var3 + 1 + vp.r(this.a).a * 2, var11 == 0 ? 6316128 : 9474192);
   }
}
