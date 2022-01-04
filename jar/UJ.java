import org.lwjgl.input.Keyboard;

public class uj implements up {
   private final String a;
   private final int a;
   // $FF: synthetic field
   final uh a;
   private final tL a;
   private final tL b;
   private final tL c;
   private static final int b = 260;

   public uj(uh var1, String var2) {
      this.a = var1;
      this.a = new tL(0, 0, 0, 150, 20, "");
      this.b = new tL(0, 0, 0, 60, 20, IK.a("core.keybinding.edit"));
      this.c = new tL(0, 0, 0, 20, 20, IK.a("core.keybinding.add"));
      this.a = IK.a(var2);
      this.a = uh.a(var1).a.getStringWidth(this.a);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      sE var10 = sE.a();
      anW var11 = (anW)anV.a.b.get(this.a);
      if (var11 == null) {
         var10.a.a(this.a, var10.a.c / 2 - this.a / 2, var3 + var5 - var10.a.a - 1, 16777215);
      } else {
         this.a.a = (var11.b ? "§a" : "§c") + var11.a + (var11.a ? "§r: " + IK.a(var11.b ? "core.keybinding.toggle.enabled" : "core.keybinding.toggle.disabled") : "");
         this.a.a = false;
         if (var11.a) {
            this.a.a = true;
            this.b.c = var2 + 260 - this.c.a() - this.b.a();
            this.b.d = var3;
            this.b.a(var10, var6, var7, var9);
            this.c.c = var2 + 260 - this.c.a();
            this.c.d = var3;
            this.c.a(var10, var6, var7, var9);
         }

         this.a.c = var10.a.c / 2 - this.a.a() / 2;
         this.a.d = var3;
         this.a.a(var10, var6, var7, var9);
      }

   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      sE var7 = sE.a();
      anW var8;
      if (this.b.a(var7, var2, var3)) {
         var8 = (anW)anV.a.b.get(this.a);
         var7.a((uI)(new aob(var7.a, var8, false)));
         return true;
      } else if (this.c.a(sE.a(), var2, var3)) {
         var8 = (anW)anV.a.b.get(this.a);
         anU var9 = var8.a("Новый бинд #" + var8.a.size());
         if (Keyboard.isKeyDown(42)) {
            var7.a((uI)(new anZ(var7.a, var8, var9, true)));
         } else {
            var7.a((uI)(new aoa(var7.a, var8, var9, true)));
         }

         return true;
      } else if (this.a.a(var7, var2, var3)) {
         var8 = (anW)anV.a.b.get(this.a);
         var8.b = !var8.b;
         return true;
      } else {
         return false;
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.b.mouseReleased(var2, var3);
      this.c.mouseReleased(var2, var3);
   }

   public void a(int var1, int var2, int var3, float var4) {
   }
}
