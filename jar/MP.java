import com.google.common.base.Function;
import com.google.common.base.Functions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.logging.log4j.Logger;

public final class mP {
   private static final Logger a;
   private final Map<acC, mN> a = new HashMap();
   private final Set<mN> a = new LinkedHashSet();
   private final Set<mN> b = new LinkedHashSet();
   private mQ a;

   private void a(mN var1) {
      Iterator var2 = var1.a().iterator();

      while(var2.hasNext()) {
         mN var3 = (mN)var2.next();
         this.a(var3);
      }

      a.info("Forgot about advancement " + var1.a());
      this.a.remove(var1.a());
      if (var1.a() == null) {
         this.a.remove(var1);
         if (this.a != null) {
            this.a.b(var1);
         }
      } else {
         this.b.remove(var1);
         if (this.a != null) {
            this.a.d(var1);
         }
      }

   }

   public void a(Set<acC> var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         acC var3 = (acC)var2.next();
         mN var4 = (mN)this.a.get(var3);
         if (var4 == null) {
            a.warn("Told to remove advancement " + var3 + " but I don't know what that is");
         } else {
            this.a(var4);
         }
      }

   }

   public void a(Map<acC, mO> var1) {
      Function var2 = Functions.forMap(this.a, (Object)null);

      label42:
      while(!var1.isEmpty()) {
         boolean var3 = false;
         Iterator var4 = var1.entrySet().iterator();

         Entry var5;
         while(var4.hasNext()) {
            var5 = (Entry)var4.next();
            acC var6 = (acC)var5.getKey();
            mO var7 = (mO)var5.getValue();
            if (var7.a((java.util.function.Function)var2)) {
               mN var8 = var7.a(var6);
               this.a.put(var6, var8);
               var3 = true;
               var4.remove();
               if (var8.a() == null) {
                  this.a.add(var8);
                  if (this.a != null) {
                     this.a.a(var8);
                  }
               } else {
                  this.b.add(var8);
                  if (this.a != null) {
                     this.a.c(var8);
                  }
               }
            }
         }

         if (!var3) {
            var4 = var1.entrySet().iterator();

            while(true) {
               if (!var4.hasNext()) {
                  break label42;
               }

               var5 = (Entry)var4.next();
               a.error("Couldn't load advancement " + var5.getKey() + ": " + var5.getValue());
            }
         }
      }

      a.info("Loaded " + this.a.size() + " advancements");
   }

   public void a() {
      this.a.clear();
      this.a.clear();
      this.b.clear();
      if (this.a != null) {
         this.a.c();
      }

   }

   public Iterable<mN> a() {
      return this.a.values();
   }

   public mN a(acC var1) {
      return (mN)this.a.get(var1);
   }

   public void a(mQ var1) {
      this.a = var1;
      if (var1 != null) {
         Iterator var2 = this.a.iterator();

         mN var3;
         while(var2.hasNext()) {
            var3 = (mN)var2.next();
            var1.a(var3);
         }

         var2 = this.b.iterator();

         while(var2.hasNext()) {
            var3 = (mN)var2.next();
            var1.c(var3);
         }
      }

   }

   static {
      a = sE.a;
   }
}
