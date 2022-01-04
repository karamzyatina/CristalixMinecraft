import dev.xdark.clientapi.settings.KeyBinding;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public final class JN implements asZ, KeyBinding, Comparable {
   public static final Map<String, JN> a = new HashMap(34, 1.0F);
   public static final acj<JN> a = new acj();
   private static final Set<String> a = new HashSet(6, 1.0F);
   private static final Object2IntMap<String> a = new Object2IntOpenHashMap(7, 1.0F);
   public static final Map<String, Integer> b;
   private final String a;
   private final int a;
   private final String b;
   private int b;
   private boolean a;
   private int c;
   private boolean b;

   public static void a(int var0) {
      if (var0 != 0) {
         JN var1 = (JN)a.a(var0);
         if (var1 != null) {
            ++var1.c;
         }
      }

   }

   public static void a(int var0, boolean var1) {
      if (var0 != 0) {
         JN var2 = (JN)a.a(var0);
         if (var2 != null) {
            var2.a = var1;
         }
      }

   }

   public static void a() {
      Iterator var0 = a.values().iterator();

      while(var0.hasNext()) {
         JN var1 = (JN)var0.next();

         try {
            a(var1.b, var1.b < 256 && Lu.a(var1.b));
         } catch (IndexOutOfBoundsException var3) {
         }
      }

   }

   public static void b() {
      Iterator var0 = a.values().iterator();

      while(var0.hasNext()) {
         JN var1 = (JN)var0.next();
         var1.d();
      }

   }

   public static void c() {
      a.a();
      Iterator var0 = a.values().iterator();

      while(var0.hasNext()) {
         JN var1 = (JN)var0.next();
         a.a(var1.b, var1);
      }

   }

   public static Set<String> a() {
      return a;
   }

   public JN(String var1, int var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.a = var2;
      this.b = var3;
      a.put(var1, this);
      a.a(var2, this);
      a.add(var3);
      JI.a.put("key_" + this.a, this);
   }

   public String a() {
      return this.b;
   }

   public boolean isPressed() {
      if (this.c == 0) {
         return false;
      } else {
         --this.c;
         return true;
      }
   }

   private void d() {
      this.c = 0;
      this.a = false;
   }

   public String b() {
      return this.a;
   }

   public int getKeyCodeDefault() {
      return this.a;
   }

   public int getKeyCode() {
      return this.b;
   }

   public void b(int var1) {
      this.b = var1;
   }

   public int a(JN var1) {
      return this.b.equals(var1.b) ? IK.a(this.a).compareTo(IK.a(var1.a)) : Integer.compare(a.getInt(this.b), a.getInt(var1.b));
   }

   public static Supplier<String> a(String var0) {
      JN var1 = (JN)a.get(var0);
      return var1 == null ? () -> {
         return var0;
      } : () -> {
         return JI.a(var1.getKeyCode());
      };
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((JN)var1);
   }

   static {
      b = a;
      a.put("key.categories.movement", 1);
      a.put("key.categories.gameplay", 2);
      a.put("key.categories.inventory", 3);
      a.put("key.categories.creative", 4);
      a.put("key.categories.multiplayer", 5);
      a.put("key.categories.ui", 6);
      a.put("key.categories.misc", 7);
   }

   public boolean isKeyDown() {
      return !this.b && this.a;
   }

   public boolean a() {
      return this.b;
   }

   public void a(boolean var1) {
      this.b = var1;
   }
}
