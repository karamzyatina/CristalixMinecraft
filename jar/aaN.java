import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class aan extends aap {
   private final String a;
   private final Set<String> a = new HashSet();
   private String b;
   private String c = "";
   private String d = "";
   private boolean a = true;
   private boolean b = true;
   private aar a;
   private adH a;
   private aaq a;

   public aan(String var1) {
      this.a = aar.ALWAYS;
      this.a = adH.RESET;
      this.a = aaq.ALWAYS;
      this.a = var1;
      this.b = var1;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public void a(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.b = var1;
      }
   }

   public Collection<String> a() {
      return this.a;
   }

   public String c() {
      return this.c;
   }

   public void b(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Prefix cannot be null");
      } else {
         this.c = var1;
      }
   }

   public String d() {
      return this.d;
   }

   public void c(String var1) {
      this.d = var1;
   }

   public String a(String var1) {
      return this.c() + var1 + this.d();
   }

   public static String a(aap var0, String var1) {
      return var0 == null ? var1 : var0.a(var1);
   }

   public boolean a() {
      return this.a;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public boolean b() {
      return this.b;
   }

   public void b(boolean var1) {
      this.b = var1;
   }

   public aar a() {
      return this.a;
   }

   public void a(aar var1) {
      this.a = var1;
   }

   public aaq a() {
      return this.a;
   }

   public void a(aaq var1) {
      this.a = var1;
   }

   public void a(int var1) {
      this.a((var1 & 1) > 0);
      this.b((var1 & 2) > 0);
   }

   public void a(adH var1) {
      this.a = var1;
   }

   public adH a() {
      return this.a;
   }
}
