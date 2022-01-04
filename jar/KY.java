import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ky implements ku {
   private final kU<kh<?>> a;
   private final ArrayList<kh<?>> a;
   private final Map<List<String>, Set<kD<?>>> a;
   private final Map<List<String>, Set<kD<?>>> b;
   private final Map<List<String>, Set<kD<?>>> c;
   private final Map<List<String>, Set<kD<?>>> d;
   private kz a;
   private boolean a;
   private boolean b;
   private kn a;

   public ky() {
      this(true);
   }

   public ky(boolean var1) {
      this.a = new kl();
      this.a = new ArrayList();
      this.a = new HashMap();
      this.b = new HashMap();
      this.c = new HashMap();
      this.d = new HashMap();
      this.a = kz.a(false);
      this.a = (kU)(var1 ? new kO() : new kZ());
      this.a((kh)(new ks()));
   }

   public ky(String var1) {
      this();
      (new kF(var1)).a(this);
   }

   public kE a(String var1) {
      return this.a(Collections.singletonList(var1));
   }

   public kE a(String var1, String var2) {
      return this.a(Collections.singletonList(var1), var2);
   }

   public kE a(List<String> var1) {
      return this.a(var1, "");
   }

   public kE a(List<String> var1, String var2) {
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("need at least one option");
      } else {
         kH.a(var1);
         return new kE(this, var1, var2);
      }
   }

   public ks<String> a() {
      ks var1 = new ks();
      this.a((kh)var1);
      return var1;
   }

   public ks<String> a(String var1) {
      ks var2 = new ks(var1);
      this.a((kh)var2);
      return var2;
   }

   public void a(boolean var1) {
      this.a = var1;
      this.a = kz.a(var1);
   }

   boolean a() {
      return this.a;
   }

   public void a() {
      this.b = true;
   }

   boolean b() {
      return this.b;
   }

   public void b(boolean var1) {
      if (var1) {
         this.a((kh)(new ki()));
      } else {
         this.a.a(String.valueOf("W"));
      }

   }

   void a(kh<?> var1) {
      this.a.a((Iterable)var1.a(), var1);
      this.a.add(var1);
   }

   public void a(OutputStream var1) {
      this.a((Writer)(new OutputStreamWriter(var1)));
   }

   public void a(Writer var1) {
      var1.write(this.a.a(this.b()));
      var1.flush();
   }

   public void a(kn var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.a = var1;
      }
   }

   public Map<String, kD<?>> a() {
      return new LinkedHashMap(this.b());
   }

   private Map<String, kh<?>> b() {
      LinkedHashMap var1 = new LinkedHashMap();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         kh var3 = (kh)var2.next();
         Iterator var4 = var3.a().iterator();

         while(var4.hasNext()) {
            String var5 = (String)var4.next();
            var1.put(var5, var3);
         }
      }

      return var1;
   }

   public kC a(String... var1) {
      kk var2 = new kk(var1);
      kC var3 = new kC(this.a.a());
      var3.a((kh)this.a.a("[arguments]"));

      while(var2.a()) {
         this.a.a(this, var2, var3);
      }

      this.c();
      this.a(var3);
      this.b(var3);
      return var3;
   }

   public void a(kE... var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var2 != var3) {
               var1[var2].d((kD)var1[var3], (kD[])());
            }
         }
      }

   }

   private void a(kC var1) {
      List var2 = this.a(var1);
      boolean var3 = this.a(var1);
      if (!var2.isEmpty() && !var3) {
         throw new kp(var2);
      }
   }

   private void b(kC var1) {
      List var2 = this.b(var1);
      boolean var3 = this.a(var1);
      if (!var2.isEmpty() && !var3) {
         throw new kJ(var2);
      }
   }

   private List<kh<?>> a(kC var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.a.a().values().iterator();

      while(var3.hasNext()) {
         kh var4 = (kh)var3.next();
         if (var4.c() && !var1.a((kD)var4)) {
            var2.add(var4);
         }
      }

      var3 = this.a.entrySet().iterator();

      kh var5;
      Entry var6;
      while(var3.hasNext()) {
         var6 = (Entry)var3.next();
         var5 = this.a((String)((List)var6.getKey()).iterator().next());
         if (this.a(var1, (Collection)var6.getValue()) && !var1.a((kD)var5)) {
            var2.add(var5);
         }
      }

      var3 = this.b.entrySet().iterator();

      while(var3.hasNext()) {
         var6 = (Entry)var3.next();
         var5 = this.a((String)((List)var6.getKey()).iterator().next());
         if (!this.a(var1, (Collection)var6.getValue()) && !var1.a((kD)var5)) {
            var2.add(var5);
         }
      }

      return var2;
   }

   private List<kh<?>> b(kC var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.c.entrySet().iterator();

      Entry var4;
      kh var5;
      while(var3.hasNext()) {
         var4 = (Entry)var3.next();
         var5 = this.a((String)((List)var4.getKey()).iterator().next());
         if (!this.a(var1, (Collection)var4.getValue()) && var1.a((kD)var5)) {
            var2.add(var5);
         }
      }

      var3 = this.d.entrySet().iterator();

      while(var3.hasNext()) {
         var4 = (Entry)var3.next();
         var5 = this.a((String)((List)var4.getKey()).iterator().next());
         if (this.a(var1, (Collection)var4.getValue()) && var1.a((kD)var5)) {
            var2.add(var5);
         }
      }

      return var2;
   }

   private boolean a(kC var1, Collection<kD<?>> var2) {
      Iterator var3 = var2.iterator();

      kD var4;
      do {
         if (!var3.hasNext()) {
            return false;
         }

         var4 = (kD)var3.next();
      } while(!var1.a(var4));

      return true;
   }

   private boolean a(kC var1) {
      boolean var2 = false;
      Iterator var3 = this.a.a().values().iterator();

      while(var3.hasNext()) {
         kh var4 = (kh)var3.next();
         if (var4.a() && var1.a((kD)var4)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   void a(String var1, kk var2, kC var3) {
      le var4 = a(var1);
      if (!this.b(var4.a)) {
         throw kw.a(var4.a);
      } else {
         kh var5 = this.a(var4.a);
         var5.a(this, var2, var3, var4.b);
      }
   }

   void b(String var1, kk var2, kC var3) {
      le var4 = b(var1);
      if (this.b(var4.a)) {
         this.a(var4.a).a(this, var2, var3, var4.b);
      } else {
         this.d(var1, var2, var3);
      }

   }

   private void d(String var1, kk var2, kC var3) {
      char[] var4 = a(var1);
      this.a(var4);

      for(int var5 = 0; var5 < var4.length; ++var5) {
         kh var6 = this.a(var4[var5]);
         if (var6.e() && var4.length > var5 + 1) {
            String var7 = String.valueOf(var4, var5 + 1, var4.length - 1 - var5);
            var6.a(this, var2, var3, var7);
            break;
         }

         var6.a(this, var2, var3, (String)null);
      }

   }

   void c(String var1, kk var2, kC var3) {
      this.a("[arguments]").a(this, var2, var3, var1);
   }

   void b() {
      this.a = kz.a();
   }

   boolean a(String var1) {
      return kH.a(var1) || kH.b(var1);
   }

   boolean b(String var1) {
      return this.a.a(var1);
   }

   void a(List<String> var1, String var2) {
      this.a((List)var1, (kD)this.a(var2));
   }

   void a(List<String> var1, kD<?> var2) {
      this.a(var1, var2, this.a);
   }

   void b(List<String> var1, String var2) {
      this.b(var1, (kD)this.a(var2));
   }

   void b(List<String> var1, kD<?> var2) {
      this.a(var1, var2, this.b);
   }

   void c(List<String> var1, String var2) {
      this.c(var1, (kD)this.a(var2));
   }

   void c(List<String> var1, kD<?> var2) {
      this.a(var1, var2, this.c);
   }

   void d(List<String> var1, String var2) {
      this.d(var1, (kD)this.a(var2));
   }

   void d(List<String> var1, kD<?> var2) {
      this.a(var1, var2, this.d);
   }

   private void a(List<String> var1, kD<?> var2, Map<List<String>, Set<kD<?>>> var3) {
      Iterator var4 = var1.iterator();

      kh var6;
      do {
         if (!var4.hasNext()) {
            Object var7 = (Set)var3.get(var1);
            if (var7 == null) {
               var7 = new HashSet();
               var3.put(var1, var7);
            }

            ((Set)var7).add(var2);
            return;
         }

         String var5 = (String)var4.next();
         var6 = this.a(var5);
      } while(var6 != null);

      throw new kK(var1);
   }

   private kh<?> a(char var1) {
      return this.a(String.valueOf(var1));
   }

   private kh<?> a(String var1) {
      return (kh)this.a.a(var1);
   }

   private void c() {
      this.a = kz.a(this.a);
   }

   private static char[] a(String var0) {
      char[] var1 = new char[var0.length() - 1];
      var0.getChars(1, var0.length(), var1, 0);
      return var1;
   }

   private void a(char[] var1) {
      char[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var2[var4];
         String var6 = String.valueOf(var5);
         if (!this.b(var6)) {
            throw kw.a(var6);
         }

         if (this.a(var6).e()) {
            return;
         }
      }

   }

   private static le a(String var0) {
      return le.a(var0.substring(2));
   }

   private static le b(String var0) {
      return le.a(var0.substring(1));
   }
}
