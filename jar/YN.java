import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.Logger;

public final class yn {
   private static final Logger a;
   private final sE a;
   private final mP a = new mP();
   private final Map<mN, mR> a = new HashMap();
   private yo a;
   private mN a;

   public yn(sE var1) {
      this.a = var1;
   }

   public void a() {
      this.a.a();
      this.a.clear();
      this.a = null;
   }

   public void a(XU var1) {
      if (var1.a()) {
         this.a.a();
         this.a.clear();
      }

      this.a.a(var1.a());
      this.a.a(var1.a());
      Iterator var2 = var1.b().entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         mN var4 = this.a.a((acC)var3.getKey());
         if (var4 != null) {
            mR var5 = (mR)var3.getValue();
            var5.a(var4.a(), var4.a());
            this.a.put(var4, var5);
            if (this.a != null) {
               this.a.a(var4, var5);
            }

            if (!var1.a() && var5.a() && var4.a() != null && var4.a().a()) {
               this.a.a().a((wH)(new wD(var4)));
            }
         } else {
            a.warn("Server informed client about progress for unknown advancement " + var3.getKey());
         }
      }

   }

   public mP a() {
      return this.a;
   }

   public void a(mN var1, boolean var2) {
      yC var3 = this.a.a();
      if (var3 != null && var1 != null && var2) {
         var3.a((Ws)XL.a(var1));
      }

      if (this.a != var1) {
         this.a = var1;
         if (this.a != null) {
            this.a.e(var1);
         }
      }

   }

   public void a(yo var1) {
      this.a = var1;
      this.a.a((mQ)var1);
      if (var1 != null) {
         Iterator var2 = this.a.entrySet().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            var1.a((mN)var3.getKey(), (mR)var3.getValue());
         }

         var1.e(this.a);
      }

   }

   static {
      a = sE.a;
   }
}
