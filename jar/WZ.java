import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class wz implements wq, ws {
   private static final Ordering<yF> a = Ordering.from(new wA());
   private final sE a;
   private final List<wq> a;

   public wz(sE var1) {
      this(var1, a.sortedCopy(var1.a().a()));
   }

   public wz(sE var1, Collection<yF> var2) {
      this.a = new ArrayList();
      this.a = var1;
      Iterator var3 = a.sortedCopy(var2).iterator();

      while(var3.hasNext()) {
         yF var4 = (yF)var3.next();
         if (var4.a() != aeb.SPECTATOR) {
            this.a.add(new wt(var1, var4));
         }
      }

   }

   public List<wq> a() {
      return this.a;
   }

   public adu a() {
      return new adE("spectatorMenu.teleport.prompt", new Object[0]);
   }

   public void a(wu var1) {
      var1.a((ws)this);
   }

   public adu b() {
      return new adE("spectatorMenu.teleport", new Object[0]);
   }

   public void a(float var1, int var2) {
      this.a.a().c(uW.d);
      tJ.a(this.a.a, 0, 0, 0.0F, 0.0F, 16, 16, 256.0F, 256.0F);
   }

   public boolean a() {
      return !this.a.isEmpty();
   }
}
