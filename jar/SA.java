import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class sA extends sw {
   private static int a;
   private final nh a;
   private final Map<so<?>, Comparable<?>> a;
   private final Map<so<?>, Comparable<?>> b;
   private Table<so<?>, Comparable<?>, sD> a;
   private final int b;

   private sA(nh var1, Map<so<?>, Comparable<?>> var2) {
      this.a = var1;
      this.b = var2;
      this.a = a(var2);
      this.b = a++;
   }

   public Collection<so<?>> getPropertyKeys() {
      return this.b.keySet();
   }

   public <T extends Comparable<T>> T a(so<T> var1) {
      Comparable var2 = (Comparable)this.a.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException("Cannot get property " + var1 + " as it does not exist in " + this.a.b());
      } else {
         return var2;
      }
   }

   public <T extends Comparable<T>, V extends T> sD a(so<T> var1, V var2) {
      Comparable var3 = (Comparable)this.a.get(var1);
      if (var3 == null) {
         throw new IllegalArgumentException("Cannot set property " + var1 + " as it does not exist in " + this.a.b());
      } else if (var3 == var2) {
         return this;
      } else {
         sD var4 = (sD)this.a.get(var1, var2);
         if (var4 == null) {
            throw new IllegalArgumentException("Cannot set property " + var1 + " to " + var2 + " on block " + this.a.a() + ", it is not an allowed value");
         } else {
            return var4;
         }
      }
   }

   public Map<so<?>, Comparable<?>> getProperties() {
      return this.b;
   }

   public nh a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      return this == var1;
   }

   public int hashCode() {
      return this.b;
   }

   public void a(Map<Map<so<?>, Comparable<?>>, sA> var1) {
      Map var2 = this.b;
      int var3 = var2.size();
      if (var3 == 0) {
         this.a = ImmutableTable.of();
      } else {
         HashBasedTable var4 = HashBasedTable.create(var3, 1);
         Iterator var5 = var2.entrySet().iterator();

         while(var3-- > 0) {
            Entry var6 = (Entry)var5.next();
            so var7 = (so)var6.getKey();
            Iterator var8 = var7.getAllowedValues().iterator();

            while(var8.hasNext()) {
               Comparable var9 = (Comparable)var8.next();
               if (var9 != var6.getValue()) {
                  var4.put(var7, var9, var1.get(this.a(var7, var9)));
               }
            }
         }

         this.a = new KY(var4);
      }

   }

   private Map<so<?>, Comparable<?>> a(so<?> var1, Comparable<?> var2) {
      Map var3 = this.b;
      HashMap var4 = new HashMap(var3.size() + 1, 1.0F);
      var4.putAll(var3);
      var4.put(var1, var2);
      return var4;
   }

   public si a() {
      return this.a.a((sD)this);
   }

   public boolean isFullBlock() {
      return this.a.b((sD)this);
   }

   public int getLightOpacity() {
      return this.a.a((sD)this);
   }

   public int getLightValue() {
      return this.a.b((sD)this);
   }

   public boolean isTranslucent() {
      return this.a.c(this);
   }

   public boolean useNeighborBrightness() {
      return this.a.d(this);
   }

   public sh a(aec var1, acV var2) {
      return this.a.a((sD)this, (aec)var1, (acV)var2);
   }

   public sD a(acE var1) {
      return this.a.a((sD)this, (acE)var1);
   }

   public sD a(act var1) {
      return this.a.a((sD)this, (act)var1);
   }

   public boolean isFullCube() {
      return this.a.h(this);
   }

   public boolean hasCustomBreakingProgress() {
      return this.a.i(this);
   }

   public abO a() {
      return this.a.a((sD)this);
   }

   public int a(aec var1, int var2, int var3, int var4) {
      return this.a.a(this, (aec)var1, var2, var3, var4);
   }

   public int a(aec var1, acV var2) {
      return this.a(var1, var2.a, var2.b, var2.c);
   }

   public float getAmbientOcclusionLightValue() {
      return this.a.a((sD)this);
   }

   public boolean isBlockNormalCube() {
      return this.a.e(this);
   }

   public boolean isNormalCube() {
      return this.a.f(this);
   }

   public boolean canProvidePower() {
      return this.a.l(this);
   }

   public int a(aec var1, int var2, int var3, int var4, abP var5) {
      return this.a.a((sD)this, (aec)var1, var2, var3, var4, (abP)var5);
   }

   public int a(aec var1, acV var2, abP var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   public boolean hasComparatorInputOverride() {
      return this.a.k(this);
   }

   public int a(aej var1, acV var2) {
      return this.a.a(this, (aej)var1, var2.a, var2.b, var2.c);
   }

   public int a(aej var1, int var2, int var3, int var4) {
      return this.a.a(this, (aej)var1, var2, var3, var4);
   }

   public float a(aej var1, acV var2) {
      return this.a.a(this, (aej)var1, var2.a, var2.b, var2.c);
   }

   public float a(aej var1, int var2, int var3, int var4) {
      return this.a.a(this, (aej)var1, var2, var3, var4);
   }

   public float a(Rn var1, aej var2, int var3, int var4, int var5) {
      return this.a.a(this, var1, var2, var3, var4, var5);
   }

   public float a(Rn var1, aej var2, acV var3) {
      return this.a.a(this, var1, var2, var3.a, var3.b, var3.c);
   }

   public int b(aec var1, int var2, int var3, int var4, abP var5) {
      return this.a.b(this, var1, var2, var3, var4, var5);
   }

   public int b(aec var1, acV var2, abP var3) {
      return this.b(var1, var2.a, var2.b, var2.c, var3);
   }

   public sg a() {
      return this.a.a((sD)this);
   }

   public sD a(aec var1, int var2, int var3, int var4) {
      return this.a.a(this, (aec)var1, var2, var3, var4);
   }

   public sD a(aec var1, acV var2) {
      return this.a(var1, var2.a, var2.b, var2.c);
   }

   public acU a(aej var1, acV var2) {
      return this.a.a(this, (aej)var1, var2.a, var2.b, var2.c);
   }

   public acU a(aej var1, int var2, int var3, int var4) {
      return this.a.a(this, (aej)var1, var2, var3, var4);
   }

   public boolean a(aec var1, acV var2, abP var3) {
      return this.a.a((sD)this, (aec)var1, var2.a, var2.b, var2.c, (abP)var3);
   }

   public boolean a(aec var1, int var2, int var3, int var4, abP var5) {
      return this.a.a((sD)this, (aec)var1, var2, var3, var4, (abP)var5);
   }

   public boolean isOpaqueCube() {
      return this.a.j(this);
   }

   public acU a(aec var1, int var2, int var3, int var4) {
      return this.a.b(this, var1, var2, var3, var4);
   }

   public acU a(aec var1, acV var2) {
      return this.a(var1, var2.a, var2.b, var2.c);
   }

   public void a(aej var1, int var2, int var3, int var4, acU var5, List<acU> var6, NN var7, boolean var8) {
      this.a.a(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void a(aej var1, acV var2, acU var3, List<acU> var4, NN var5, boolean var6) {
      this.a(var1, var2.a, var2.b, var2.c, var3, var4, var5, var6);
   }

   public acU b(aec var1, int var2, int var3, int var4) {
      nh var5 = this.a;
      mZ var6 = var5.a();
      acU var7 = var5.a(this, (aec)var1, var2, var3, var4);
      if (var6 != mZ.NONE && !(var5 instanceof ow)) {
         var7 = ajA.a(var7, var6, var2, var4);
      }

      return var7;
   }

   public acU b(aec var1, acV var2) {
      return this.b(var1, var2.a, var2.b, var2.c);
   }

   public adi a(aej var1, int var2, int var3, int var4, adm var5, adm var6) {
      return this.a.a(this, var1, var2, var3, var4, var5, var6);
   }

   public adi a(aej var1, acV var2, adm var3, adm var4) {
      return this.a(var1, var2.a, var2.b, var2.c, var3, var4);
   }

   public boolean isTopSolid() {
      return this.a.a((sD)this);
   }

   public adm a(aec var1, int var2, int var3, int var4) {
      return this.a.a(this, (aec)var1, var2, var3, var4);
   }

   public adm a(aec var1, acV var2) {
      return this.a.a(this, (aec)var1, var2.a, var2.b, var2.c);
   }

   public void a(aec var1, int var2, int var3, int var4, adm var5) {
      this.a.a((sD)this, (aec)var1, var2, var3, var4, (adm)var5);
   }

   public void a(aec var1, acV var2, adm var3) {
      this.a.a((sD)this, (aec)var1, var2.a, var2.b, var2.c, (adm)var3);
   }

   public boolean a(aej var1, int var2, int var3, int var4, int var5, int var6) {
      return this.a.a(this, var1, var2, var3, var4, var5, var6);
   }

   public boolean a(aej var1, acV var2, int var3, int var4) {
      return this.a.a(this, var1, var2.a, var2.b, var2.c, var3, var4);
   }

   public boolean causesSuffocation() {
      return this.a.g(this);
   }

   public su a(aec var1, int var2, int var3, int var4, abP var5) {
      return this.a.a((aec)var1, (sD)this, var2, var3, var4, (abP)var5);
   }

   public su a(aec var1, acV var2, abP var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   private static <K, V> Map<K, V> a(Map<K, V> var0) {
      return (Map)(var0 instanceof LinkedHashMap ? new HashMap(var0) : var0);
   }

   // $FF: synthetic method
   sA(nh var1, Map var2, sz var3) {
      this(var1, var2);
   }
}
