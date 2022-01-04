import dev.xdark.clientapi.inventory.EntityEquipmentSlot;
import dev.xdark.clientapi.item.ArmorMaterial;
import dev.xdark.clientapi.item.Item;
import dev.xdark.clientapi.sound.SoundEvent;

public class TB implements ArmorMaterial {
   public static final TB a;
   public static final TB b;
   public static final TB c;
   public static final TB d;
   public static final TB e;
   private final String a;
   protected final int a;
   private final int[] a;
   private final int b;
   private final acJ a;
   private final float a;

   public TB(String var1, int var2, int[] var3, int var4, acJ var5, float var6) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.b = var4;
      this.a = var5;
      this.a = var6;
   }

   public int a(SB var1) {
      return TA.a()[var1.getIndex()] * this.a;
   }

   public int b(SB var1) {
      return this.a[var1.getIndex()];
   }

   public int getEnchantability() {
      return this.b;
   }

   public acJ a() {
      return this.a;
   }

   public SZ a() {
      if (this == a) {
         return RT.as;
      } else if (this == b) {
         return RT.l;
      } else if (this == d) {
         return RT.m;
      } else if (this == c) {
         return RT.l;
      } else {
         return this == e ? RT.k : null;
      }
   }

   public String getName() {
      return this.a;
   }

   public float getToughness() {
      return this.a;
   }

   static {
      a = new TB("leather", 5, new int[]{1, 2, 3, 1}, 15, RW.t, 0.0F);
      b = new TB("chainmail", 15, new int[]{1, 4, 5, 2}, 12, RW.n, 0.0F);
      c = new TB("iron", 15, new int[]{2, 5, 6, 2}, 9, RW.s, 0.0F);
      d = new TB("gold", 7, new int[]{1, 3, 5, 2}, 25, RW.r, 0.0F);
      e = new TB("diamond", 33, new int[]{3, 6, 8, 3}, 10, RW.o, 2.0F);
   }

   public int getDurability(EntityEquipmentSlot var1) {
      return this.a((SB)d.a(var1));
   }

   public int getDamageReductionAmount(EntityEquipmentSlot var1) {
      return this.b((SB)d.a(var1));
   }

   public SoundEvent getEquipSound() {
      return (SoundEvent)d.a(this.a);
   }

   public Item getRepairItem() {
      return (Item)d.a(this.a());
   }
}
