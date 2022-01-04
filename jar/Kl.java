import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;

public class kl implements kn {
   private final kY a;
   private final kY b;

   kl() {
      this(80, 2);
   }

   public kl(int var1, int var2) {
      this.a = new kY(var1 * 2, 0);
      this.b = new kY(var1, var2);
   }

   public String a(Map<String, ? extends kv> var1) {
      this.b.a();
      this.a.a();
      km var2 = new km(this);
      TreeSet var3 = new TreeSet(var2);
      var3.addAll(var1.values());
      this.a((Collection)var3);
      return this.c();
   }

   protected void a(String var1) {
      this.a(var1, "");
   }

   protected void a(String var1, String var2) {
      this.b.a(var1, var2);
   }

   protected void b(String var1) {
      this.a.a(var1, "");
   }

   protected void a() {
      this.a.b();
      this.b.b();
   }

   protected String a() {
      return this.a.a();
   }

   protected String b() {
      return this.b.a();
   }

   protected String c() {
      StringBuilder var1 = new StringBuilder();
      String var2 = this.a();
      if (!la.a(var2)) {
         var1.append(var2).append(la.b);
      }

      var1.append(this.b());
      return var1.toString();
   }

   protected void a(Collection<? extends kv> var1) {
      this.b(var1);
      if (var1.isEmpty()) {
         this.a(this.a("no.options.specified"));
      } else {
         this.c(var1);
         this.d(var1);
      }

      this.a();
   }

   protected void b(Collection<? extends kv> var1) {
      kv var2 = this.a(var1);
      if (this.a(var2)) {
         this.b(this.a("non.option.arguments.header"));
         this.b(this.a(var2));
      }

   }

   protected boolean a(kv var1) {
      return !la.a(var1.a()) || !la.a(var1.c()) || !la.a(var1.b());
   }

   protected String a(kv var1) {
      StringBuilder var2 = new StringBuilder();
      this.b(var2, var1);
      this.a(var2, var1);
      return var2.toString();
   }

   protected void a(StringBuilder var1, kv var2) {
      var1.append(var1.length() > 0 && !la.a(var2.a()) ? " -- " : "").append(var2.a());
   }

   protected kv a(Collection<? extends kv> var1) {
      Iterator var2 = var1.iterator();

      kv var3;
      do {
         if (!var2.hasNext()) {
            throw new AssertionError("no non-options argument spec");
         }

         var3 = (kv)var2.next();
      } while(!var3.b());

      var2.remove();
      return var3;
   }

   protected void c(Collection<? extends kv> var1) {
      if (this.a(var1)) {
         this.a(this.a("option.header.with.required.indicator"), this.a("description.header"));
         this.a(this.a("option.divider.with.required.indicator"), this.a("description.divider"));
      } else {
         this.a(this.a("option.header"), this.a("description.header"));
         this.a(this.a("option.divider"), this.a("description.divider"));
      }

   }

   protected final boolean a(Collection<? extends kv> var1) {
      Iterator var2 = var1.iterator();

      kv var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (kv)var2.next();
      } while(!var3.c());

      return true;
   }

   protected void d(Collection<? extends kv> var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         kv var3 = (kv)var2.next();
         if (!var3.b()) {
            this.a(this.b(var3), this.d(var3));
         }
      }

   }

   protected String b(kv var1) {
      StringBuilder var2 = new StringBuilder(var1.c() ? "* " : "");
      Iterator var3 = var1.a().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         var2.append(this.a(var4));
         var2.append(var4);
         if (var3.hasNext()) {
            var2.append(", ");
         }
      }

      this.b(var2, var1);
      return var2.toString();
   }

   protected String a(String var1) {
      return var1.length() > 1 ? "--" : kH.a;
   }

   protected void b(StringBuilder var1, kv var2) {
      String var3 = this.c(var2);
      String var4 = var2.b();
      if (var2.e() || !la.a(var4) || var2.b()) {
         this.a(var1, var3, var4, var2.f());
      }

   }

   protected String c(kv var1) {
      String var2 = var1.c();
      return !la.a(var2) && !String.class.getName().equals(var2) ? kP.a(var2) : "String";
   }

   protected void a(StringBuilder var1, String var2, String var3, boolean var4) {
      if (var4) {
         this.a(var1, var2, var3, '<', '>');
      } else {
         this.a(var1, var2, var3, '[', ']');
      }

   }

   protected void a(StringBuilder var1, String var2, String var3, char var4, char var5) {
      var1.append(' ').append(var4);
      if (var2 != null) {
         var1.append(var2);
      }

      if (!la.a(var3)) {
         if (var2 != null) {
            var1.append(": ");
         }

         var1.append(var3);
      }

      var1.append(var5);
   }

   protected String d(kv var1) {
      List var2 = var1.b();
      if (var2.isEmpty()) {
         return var1.a();
      } else {
         String var3 = this.a(var2);
         return (var1.a() + ' ' + la.a(this.a("default.value.header") + ' ' + var3, '(', ')')).trim();
      }
   }

   protected String a(List<?> var1) {
      return var1.size() == 1 ? var1.get(0).toString() : var1.toString();
   }

   protected String a(String var1, Object... var2) {
      return kS.a(Locale.getDefault(), "joptsimple.HelpFormatterMessages", kl.class, var1, var2);
   }
}
