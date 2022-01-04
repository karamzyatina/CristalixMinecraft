import dev.xdark.clientapi.text.TextKeybinding;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public final class adA extends adz implements TextKeybinding {
   public static Function<String, Supplier<String>> a = (var0) -> {
      return () -> {
         return var0;
      };
   };
   private final String a;
   private Supplier<String> a;

   public adA(String var1) {
      this.a = var1;
   }

   public String a() {
      if (this.a == null) {
         this.a = (Supplier)a.apply(this.a);
      }

      return (String)this.a.get();
   }

   public adA a() {
      adA var1 = new adA(this.a);
      var1.a((adw)this.a().a());
      List var2 = this.a();
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         adu var5 = (adu)var2.get(var3);
         var1.a((adu)var5.a());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         adA var2;
         return var1 instanceof adA && this.a.equals((var2 = (adA)var1).a) && super.a((adz)var2);
      }
   }

   public String toString() {
      return "KeybindComponent{keybind='" + this.a + '\'' + ", siblings=" + this.b + ", style=" + this.a() + '}';
   }

   public String b() {
      return this.a;
   }

   // $FF: synthetic method
   public String getKeybinding() {
      return this.a;
   }
}
