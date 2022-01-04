import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class kO implements kU {
   private final Map<Character, kO<V>> a = new TreeMap();
   private String a;
   private V a;
   private int a;

   public boolean a(String var1) {
      return this.a(var1) != null;
   }

   public V a(String var1) {
      char[] var2 = a(var1);
      kO var3 = this;
      char[] var4 = var2;
      int var5 = var2.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var4[var6];
         var3 = (kO)var3.a.get(var7);
         if (var3 == null) {
            return null;
         }
      }

      return var3.a;
   }

   public void a(String var1, V var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else if (var1.length() == 0) {
         throw new IllegalArgumentException();
      } else {
         char[] var3 = a(var1);
         this.a(var3, var2, 0, var3.length);
      }
   }

   public void a(Iterable<String> var1, V var2) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         this.a(var4, var2);
      }

   }

   private boolean a(char[] var1, V var2, int var3, int var4) {
      if (var3 == var4) {
         this.a = var2;
         boolean var8 = this.a != null;
         this.a = new String(var1);
         return !var8;
      } else {
         char var5 = var1[var3];
         kO var6 = (kO)this.a.get(var5);
         if (var6 == null) {
            var6 = new kO();
            this.a.put(var5, var6);
         }

         boolean var7 = var6.a(var1, var2, var3 + 1, var4);
         if (var7) {
            ++this.a;
         }

         if (this.a == null) {
            this.a = this.a > 1 ? null : var2;
         }

         return var7;
      }
   }

   public void a(String var1) {
      if (var1.length() == 0) {
         throw new IllegalArgumentException();
      } else {
         char[] var2 = a(var1);
         this.a(var2, 0, var2.length);
      }
   }

   private boolean a(char[] var1, int var2, int var3) {
      if (var2 == var3) {
         return this.a();
      } else {
         char var4 = var1[var2];
         kO var5 = (kO)this.a.get(var4);
         if (var5 != null && var5.a(var1, var2 + 1, var3)) {
            --this.a;
            if (var5.a == 0) {
               this.a.remove(var4);
            }

            if (this.a == 1 && this.a == null) {
               this.a();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   private void a() {
      Entry var1 = (Entry)this.a.entrySet().iterator().next();
      kO var2 = (kO)var1.getValue();
      this.a = var2.a;
   }

   private boolean a() {
      if (this.a == null) {
         return false;
      } else {
         this.a = null;
         if (this.a == 1) {
            this.a();
         } else {
            this.a = null;
         }

         return true;
      }
   }

   public Map<String, V> a() {
      TreeMap var1 = new TreeMap();
      this.a((Map)var1);
      return var1;
   }

   private void a(Map<String, V> var1) {
      if (this.a != null) {
         var1.put(this.a, this.a);
      }

      Iterator var2 = this.a.values().iterator();

      while(var2.hasNext()) {
         kO var3 = (kO)var2.next();
         var3.a(var1);
      }

   }

   private static char[] a(String var0) {
      char[] var1 = new char[var0.length()];
      var0.getChars(0, var0.length(), var1, 0);
      return var1;
   }
}
