import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UO extends SZ {
   private static final Map<acJ, UO> a = new HashMap();
   private final acJ a;
   private final String a;

   public UO(String var1, acJ var2) {
      this.a = "item.record." + var1 + ".desc";
      this.a = var2;
      this.a = 1;
      this.a((KC)KC.e);
      a.put(this.a, this);
   }

   public abN a(Rn var1, aej var2, acV var3, abU var4, abP var5, float var6, float var7, float var8) {
      sD var9 = var2.a(var3);
      return var9.a() == RQ.ae && !(Boolean)var9.a((so)pa.a) ? abN.SUCCESS : abN.PASS;
   }

   public void a(Vh var1, aej var2, List<String> var3, JY var4) {
      var3.add(this.a());
   }

   public String a() {
      return adM.a(this.a);
   }

   public SX a(Vh var1) {
      return SX.RARE;
   }

   public static UO a(acJ var0) {
      return (UO)a.get(var0);
   }

   public acJ a() {
      return this.a;
   }
}
