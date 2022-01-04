import com.google.common.collect.Multimap;
import java.util.Set;

public class Vk extends SZ implements LN {
   private final Set<nh> a;
   protected iT a;
   protected float a;
   protected float b;
   protected Tw a;

   protected Vk(float var1, float var2, Tw var3, Set<nh> var4) {
      if (this.a == null) {
         this.a = new iT(0.0F);
      }

      this.a = var3;
      this.a = var4;
      this.a = 1;
      this.c(var3.getMaxUses());
      this.a.a(var3.getEfficiency());
      this.a = var1 + var3.getAttackDamage();
      this.b = var2;
      this.a(KC.h);
   }

   protected Vk(Tw var1, Set<nh> var2) {
      this(0.0F, 0.0F, var1, var2);
   }

   public float b(Vh var1, sD var2) {
      return this.a.contains(var2.a()) ? this.a.a() : 1.0F;
   }

   public boolean a(Vh var1, Oh var2, Oh var3) {
      var1.a(2, (Oh)var3);
      return true;
   }

   public boolean a(Vh var1, aej var2, sD var3, acV var4, Oh var5) {
      return true;
   }

   public boolean isFull3D() {
      return true;
   }

   public int a() {
      return this.a.getEnchantability();
   }

   public String a() {
      return this.a.toString();
   }

   public boolean a(Vh var1, Vh var2) {
      return this.a.a() == var2.a() || super.a(var1, var2);
   }

   public Tw a() {
      return this.a;
   }

   public float getAttackDamage() {
      return this.a;
   }

   public float getAttackSpeed() {
      return this.b;
   }

   public float getEfficiency() {
      return this.a.a();
   }

   public Multimap<String, OA> a(SB var1) {
      return LO.a((LN)this, (SB)var1);
   }
}
