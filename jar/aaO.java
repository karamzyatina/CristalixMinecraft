import dev.xdark.feder.RecyclableArrayList;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class aao {
   private final Map<String, aam> a = new Object2ObjectOpenHashMap();
   private final Map<aag, List<aam>> b = new Object2ObjectOpenHashMap();
   private final Map<String, Map<aam, aai>> c = new Object2ObjectOpenHashMap();
   private final aam[] a = new aam[19];
   private final Map<String, aan> d = new Object2ObjectOpenHashMap();
   private final Map<String, aan> e = new Object2ObjectOpenHashMap();

   public aam a(String var1) {
      return (aam)this.a.get(var1);
   }

   public aam a(String var1, aag var2) {
      aam var3 = new aam(this, var1, var2);
      Object var4 = (List)this.b.get(var2);
      if (var4 == null) {
         var4 = new ObjectArrayList();
         this.b.put(var2, var4);
      }

      ((List)var4).add(var3);
      this.a.put(var1, var3);
      return var3;
   }

   public aai a(String var1, aam var2) {
      Map var3 = (Map)this.c.computeIfAbsent(var1, (var0) -> {
         return new HashMap();
      });
      aai var4 = (aai)var3.get(var2);
      if (var4 == null) {
         var4 = new aai(var2, var1);
         var3.put(var2, var4);
      }

      return var4;
   }

   public RecyclableArrayList<aai> a(aam var1) {
      RecyclableArrayList var2 = RecyclableArrayList.newInstance();
      Iterator var3 = this.c.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         aai var5 = (aai)var4.get(var1);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      var2.sort(aai.a);
      return var2;
   }

   public Collection<aai> a(aam var1) {
      ObjectArrayList var2 = new ObjectArrayList();
      Iterator var3 = this.c.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         aai var5 = (aai)var4.get(var1);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      var2.sort(aai.a);
      return var2;
   }

   public Collection<aam> a() {
      return this.a.values();
   }

   public Collection<String> b() {
      return this.c.keySet();
   }

   public void a(String var1, aam var2) {
      if (var2 == null) {
         this.c.remove(var1);
      } else {
         Map var3 = (Map)this.c.get(var1);
         if (var3 != null) {
            var3.remove(var2);
            if (var3.isEmpty()) {
               this.c.remove(var1);
            }
         }
      }

   }

   public Collection<aai> c() {
      Collection var1 = this.c.values();
      ObjectArrayList var2 = new ObjectArrayList();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         var2.addAll(var4.values());
      }

      return var2;
   }

   public void a(aam var1) {
      this.a.remove(var1.a());

      for(int var2 = 0; var2 < 19; ++var2) {
         if (this.a(var2) == var1) {
            this.a(var2, (aam)null);
         }
      }

      List var5 = (List)this.b.get(var1.a());
      if (var5 != null) {
         var5.remove(var1);
      }

      Iterator var3 = this.c.values().iterator();

      while(var3.hasNext()) {
         Map var4 = (Map)var3.next();
         var4.remove(var1);
      }

   }

   public void a(int var1, aam var2) {
      this.a[var1] = var2;
   }

   public aam a(int var1) {
      return this.a[var1];
   }

   public aan a(String var1) {
      return (aan)this.d.get(var1);
   }

   public aan b(String var1) {
      aan var2 = new aan(var1);
      this.d.put(var1, var2);
      return var2;
   }

   public void a(aan var1) {
      this.d.remove(var1.a());
      Iterator var2 = var1.a().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.e.remove(var3);
      }

   }

   public boolean a(String var1, String var2) {
      if (!this.d.containsKey(var2)) {
         return false;
      } else {
         aan var3 = this.a(var2);
         if (this.c(var1) != null) {
            this.a(var1);
         }

         this.e.put(var1, var3);
         var3.a().add(var1);
         return true;
      }
   }

   public boolean a(String var1) {
      aan var2 = this.c(var1);
      if (var2 != null) {
         this.a(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public void a(String var1, aan var2) {
      this.e.remove(var1);
      var2.a().remove(var1);
   }

   public Collection<aan> d() {
      return this.d.values();
   }

   public aan c(String var1) {
      return (aan)this.e.get(var1);
   }

   public static String a(int var0) {
      switch(var0) {
      case 0:
         return "list";
      case 1:
         return "sidebar";
      case 2:
         return "belowName";
      default:
         if (var0 >= 3 && var0 <= 18) {
            adH var1 = adH.a(var0 - 3);
            if (var1 != null && var1 != adH.RESET) {
               return "sidebar.team." + var1.getFriendlyName();
            }
         }

         return null;
      }
   }

   public void a(NN var1) {
      if (var1 != null && !(var1 instanceof Rn) && !var1.isEntityAlive()) {
         String var2 = var1.getCachedUniqueIdString();
         this.a(var2, (aam)null);
         this.a(var2);
      }

   }
}
