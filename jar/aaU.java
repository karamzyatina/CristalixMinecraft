import java.text.NumberFormat;
import java.util.Locale;

public class aau {
   public final String a;
   private final adu a;
   public boolean a;
   private final aas b;
   private final aag a;
   private static final NumberFormat a;
   public static final aas a;

   public aau(String var1, adu var2, aas var3) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.a = new aal(this);
   }

   public aau(String var1, adu var2) {
      this(var1, var2, a);
   }

   public aau a() {
      if (aax.a.containsKey(this.a)) {
         throw new RuntimeException("Duplicate stat id: \"" + ((aau)aax.a.get(this.a)).a + "\" and \"" + this.a + "\" at id " + this.a);
      } else {
         aax.a.add(this);
         aax.a.put(this.a, this);
         return this;
      }
   }

   public String a(int var1) {
      return this.b.a(var1);
   }

   public adu a() {
      adu var1 = this.a.a();
      var1.a().a(adH.GRAY);
      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         aau var2 = (aau)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "Stat{id=" + this.a + ", nameId=" + this.a + ", awardLocallyOnly=" + this.a + ", formatter=" + this.b + ", objectiveCriteria=" + this.a + '}';
   }

   // $FF: synthetic method
   static NumberFormat a() {
      return a;
   }

   static {
      a = NumberFormat.getIntegerInstance(Locale.US);
      a = new aav();
   }
}
