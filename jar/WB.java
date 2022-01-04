import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class wB implements wq, ws {
   private final List<wq> a = new ArrayList();
   private final sE a;

   public wB(sE var1) {
      this.a = var1;
      Iterator var2 = var1.a.a().d().iterator();

      while(var2.hasNext()) {
         aan var3 = (aan)var2.next();
         this.a.add(new wC(var1, var3));
      }

   }

   public List<wq> a() {
      return this.a;
   }

   public adu a() {
      return new adE("spectatorMenu.team_teleport.prompt", new Object[0]);
   }

   public void a(wu var1) {
      var1.a((ws)this);
   }

   public adu b() {
      return new adE("spectatorMenu.team_teleport", new Object[0]);
   }

   public void a(float var1, int var2) {
      this.a.a().c(uW.d);
      tJ.a(this.a.a, 0, 0, 16.0F, 0.0F, 16, 16, 256.0F, 256.0F);
   }

   public boolean a() {
      Iterator var1 = this.a.iterator();

      wq var2;
      do {
         if (!var1.hasNext()) {
            return false;
         }

         var2 = (wq)var1.next();
      } while(!var2.a());

      return true;
   }
}
