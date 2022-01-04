import dev.xdark.clientapi.gui.ingame.IngameMenuScreen;
import java.util.List;
import ru.cristalix.core.display.messages.ServerNameMessage;

public class ug extends uI implements IngameMenuScreen {
   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.a(this.a, IK.a("menu.game"), this.c / 2, 40, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   public void b() {
      List var1 = this.a;
      var1.clear();
      boolean var2 = true;
      var1.add(new tL(asQ.RETURN.ordinal(), this.c / 2 - 100, this.d / 4 + 48 + -32, "Вернуться в игру"));
      var1.add(new tL(asQ.OPTIONS.ordinal(), this.c / 2 - 100, this.d / 4 + 72 + -32, "Настройки"));
      var1.add(new tL(asQ.ADVANCEMENTS.ordinal(), this.c / 2 - 100, this.d / 4 + 96 + -32, "Гайды"));
      tL var3;
      var1.add(var3 = new tL(asQ.HUB.ordinal(), this.c / 2 - 100, this.d / 4 + 138 + -32, "Вернуться в хаб"));
      ServerNameMessage var4 = ((ata)this.a).a().a.a();
      String var5 = var4 == null ? null : var4.getRealmName();
      var3.a = var5 != null && !var5.startsWith("HUB-");
      tL var6;
      this.a.add(var6 = new tL(asQ.EXIT.ordinal(), this.c / 2 - 100, this.d / 4 + 138 + -32, "Покинуть сервер"));
      var3.setWidth(var3.a() / 2 - 2);
      var6.setWidth(var3.a());
      var6.c += var3.a() + 4;
   }

   public void a(tL var1) {
      sE var2 = this.a;
      if (var1.e == asQ.HUB.ordinal()) {
         var2.a((uI)null);
         var2.setIngameFocus();
         var2.a().a((Ws)(new Xh("/hub")));
      } else if (var1.e == asQ.OPTIONS.ordinal()) {
         var2.a((uI)(new uA(this, this.a.a)));
      } else if (var1.e == asQ.EXIT.ordinal()) {
         var1.a = false;
         var2.a.d();
         var2.a((yw)null);
         var2.a(var2.a());
         asE var3 = ((ata)var2).a();
         var3.c();
         asE.d();
      } else if (var1.e == asQ.RETURN.ordinal()) {
         var2.a((uI)null);
         var2.setIngameFocus();
      } else if (var1.e == asQ.ADVANCEMENTS.ordinal()) {
         var2.a((uI)(new vC(var2.a.a.a())));
      }

   }
}
