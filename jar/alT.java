import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class alt {
   private final als[] a;
   private final aiR[] a;

   public alt(als[] var1, Map<String, aiP> var2) {
      this.a = var1;
      ArrayList var3 = new ArrayList();
      Iterator var4 = var2.keySet().iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         aiP var6 = (aiP)var2.get(var5);
         if (var6 instanceof aiR) {
            aiR var7 = (aiR)var6;
            var3.add(var7);
         }
      }

      this.a = (aiR[])((aiR[])var3.toArray(new aiR[0]));
   }

   public void a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         als var3 = this.a[var2];
         var3.a(var1);
      }

   }

   public void a(sE var1) {
      this.b();
      als[] var2 = this.a;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3].a(var1);
      }

   }

   private void b() {
      aiR[] var1 = this.a;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2].a();
      }

   }

   public void a() {
      als[] var1 = this.a;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2].a();
      }

   }
}
