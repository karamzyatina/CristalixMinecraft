import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;

public final class yv {
   private static final Logger a;
   private final sE a;
   private final List<yt> a = new ArrayList();

   public yv(sE var1) {
      this.a = var1;
      this.a();
   }

   public void a() {
      try {
         this.a.clear();
         VR var1 = VI.a(new File(this.a.a, "servers.dat"));
         if (var1 == null) {
            return;
         }

         VZ var2 = var1.a("servers", (int)10);

         for(int var3 = 0; var3 < var2.a(); ++var3) {
            this.a.add(yt.a(var2.a(var3)));
         }
      } catch (Exception var4) {
         a.error("Couldn't load server list", var4);
      }

   }

   public void b() {
      try {
         VZ var1 = new VZ();
         Iterator var2 = this.a.iterator();

         while(var2.hasNext()) {
            yt var3 = (yt)var2.next();
            var1.a((VK)var3.a());
         }

         VR var5 = new VR();
         var5.a((String)"servers", (VK)var1);
         VI.a(var5, new File(this.a.a, "servers.dat"));
      } catch (Exception var4) {
         a.error("Couldn't save server list", var4);
      }

   }

   public yt a(int var1) {
      return (yt)this.a.get(var1);
   }

   public void a(int var1) {
      this.a.remove(var1);
   }

   public void a(yt var1) {
      this.a.add(var1);
   }

   public int a() {
      return this.a.size();
   }

   public void a(int var1, int var2) {
      yt var3 = this.a(var1);
      this.a.set(var1, this.a(var2));
      this.a.set(var2, var3);
      this.b();
   }

   public void a(int var1, yt var2) {
      this.a.set(var1, var2);
   }

   static {
      a = sE.a;
   }
}
