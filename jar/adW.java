import dev.xdark.clientapi.text.ClickEvent;
import dev.xdark.clientapi.text.HoverEvent;
import dev.xdark.clientapi.text.Style;
import dev.xdark.clientapi.text.TextFormatting;
import java.util.Objects;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class adw implements apa, Style {
   public adw a;
   public adH a;
   public Boolean a;
   public Boolean b;
   public Boolean c;
   public Boolean d;
   public Boolean e;
   public adI a;
   public adK a;
   public String a;
   public String b;
   private static final adw b = new adx();
   public String c;

   public boolean a() {
      Boolean var1 = this.a;
      return var1 == null ? this.c().a() : var1;
   }

   public boolean b() {
      Boolean var1 = this.b;
      return var1 == null ? this.c().b() : var1;
   }

   public boolean c() {
      Boolean var1 = this.d;
      return var1 == null ? this.c().c() : var1;
   }

   public boolean d() {
      Boolean var1 = this.c;
      return var1 == null ? this.c().d() : var1;
   }

   public boolean e() {
      Boolean var1 = this.e;
      return var1 == null ? this.c().e() : var1;
   }

   public adI a() {
      adI var1 = this.a;
      return var1 == null ? this.c().a() : var1;
   }

   public adK a() {
      adK var1 = this.a;
      return var1 == null ? this.c().a() : var1;
   }

   public String getInsertion() {
      String var1 = this.a;
      return var1 == null ? this.c().getInsertion() : var1;
   }

   public adw a(adH var1) {
      if (this.a != var1) {
         this.a = var1;
         this.b = null;
      }

      return this;
   }

   public adw a(Boolean var1) {
      if (this.a != var1) {
         this.a = var1;
         this.b = null;
      }

      return this;
   }

   public adw b(Boolean var1) {
      if (this.b != var1) {
         this.b = var1;
         this.b = null;
      }

      return this;
   }

   public adw c(Boolean var1) {
      if (this.d != var1) {
         this.d = var1;
         this.b = null;
      }

      return this;
   }

   public adw d(Boolean var1) {
      if (this.c != var1) {
         this.c = var1;
         this.b = null;
      }

      return this;
   }

   public adw e(Boolean var1) {
      if (this.e != var1) {
         this.e = var1;
         this.b = null;
      }

      return this;
   }

   public adw a(adI var1) {
      this.a = var1;
      return this;
   }

   public adw a(adK var1) {
      this.a = var1;
      return this;
   }

   public adw a(String var1) {
      this.a = var1;
      return this;
   }

   public adw a(adw var1) {
      this.a = var1;
      return this;
   }

   private adw c() {
      return this.a == null ? b : this.a;
   }

   public adw a() {
      adw var1 = new adw();
      var1.a = this.a;
      var1.b = this.b;
      var1.d = this.d;
      var1.c = this.c;
      var1.e = this.e;
      var1.a = this.a;
      var1.a = this.a;
      var1.a = this.a;
      var1.a = this.a;
      var1.a = this.a;
      var1.a = this.a;
      this.a(new CallbackInfoReturnable("createShallowCopy", false, var1));
      return var1;
   }

   public adw b() {
      adw var1 = new adw();
      var1.a(this.a());
      var1.b(this.b());
      var1.c(this.c());
      var1.d(this.d());
      var1.e(this.e());
      var1.a(this.a());
      var1.a(this.a());
      var1.a(this.a());
      var1.a(this.getInsertion());
      this.b(new CallbackInfoReturnable("createDeepCopy", false, var1));
      return var1;
   }

   public TextFormatting getColor() {
      return (TextFormatting)d.a(this.a);
   }

   public boolean isBold() {
      return this.a();
   }

   public boolean isItalic() {
      return this.b();
   }

   public boolean isStrikethrough() {
      return this.c();
   }

   public boolean isUnderlined() {
      return this.d();
   }

   public boolean isObfuscated() {
      return this.e();
   }

   public Style setColor(TextFormatting var1) {
      this.a((adH)d.a(var1));
      return this;
   }

   public Style setBold(boolean var1) {
      this.a(var1);
      return this;
   }

   public Style setItalic(boolean var1) {
      this.b(var1);
      return this;
   }

   public Style setStrikethrough(boolean var1) {
      this.c(var1);
      return this;
   }

   public Style setUnderlined(boolean var1) {
      this.d(var1);
      return this;
   }

   public Style setObfuscated(boolean var1) {
      this.e(var1);
      return this;
   }

   public Style setClickEvent(ClickEvent var1) {
      this.a((adI)d.a(var1));
      return this;
   }

   public Style setHoverEvent(HoverEvent var1) {
      this.a((adK)d.a(var1));
      return this;
   }

   public Style setInsertion(String var1) {
      this.a = var1;
      return this;
   }

   public Style deepCopy() {
      return (Style)this.b();
   }

   public Style shallowCopy() {
      return (Style)this.a();
   }

   public adw b(String var1) {
      this.c = var1;
      return this;
   }

   public String a() {
      if (this.a != null) {
         return null;
      } else if (this.c != null) {
         return this.c;
      } else if (this.c() == this) {
         return null;
      } else {
         return this.c().a() != null ? null : ((apa)this.c()).a();
      }
   }

   public String b() {
      return this.c;
   }

   public adH a() {
      return this.a == null && this.c == null ? this.c().a() : this.a;
   }

   public void a(CallbackInfoReturnable var1) {
      ((apa)var1.getReturnValue()).b(this.c);
   }

   public void b(CallbackInfoReturnable var1) {
      ((apa)var1.getReturnValue()).b(this.a());
   }

   public String toString() {
      return "Style{hasParent=" + (this.a != null) + ", color=" + this.a + ", colorRGB=" + this.c + ", bold=" + this.a + ", italic=" + this.b + ", underlined=" + this.c + ", obfuscated=" + this.e + ", clickEvent=" + this.a() + ", hoverEvent=" + this.a() + ", insertion=" + this.getInsertion() + '}';
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof adw)) {
         return false;
      } else {
         adw var3 = (adw)var1;
         boolean var2;
         if (this.a() == var3.a() && this.a() == var3.a() && Objects.equals(this.a(), ((apa)var3).a()) && this.b() == var3.b() && this.e() == var3.e() && this.c() == var3.c() && this.d() == var3.d()) {
            label75: {
               if (this.a() != null) {
                  if (!this.a().equals(var3.a())) {
                     break label75;
                  }
               } else if (var3.a() != null) {
                  break label75;
               }

               if (this.a() != null) {
                  if (!this.a().equals(var3.a())) {
                     break label75;
                  }
               } else if (var3.a() != null) {
                  break label75;
               }

               if (this.getInsertion() != null) {
                  if (!this.getInsertion().equals(var3.getInsertion())) {
                     break label75;
                  }
               } else if (var3.getInsertion() != null) {
                  break label75;
               }

               var2 = true;
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      int var1 = this.a.hashCode();
      var1 = 31 * var1 + this.c.hashCode();
      var1 = 31 * var1 + this.a.hashCode();
      var1 = 31 * var1 + this.b.hashCode();
      var1 = 31 * var1 + this.c.hashCode();
      var1 = 31 * var1 + this.d.hashCode();
      var1 = 31 * var1 + this.e.hashCode();
      var1 = 31 * var1 + this.a.hashCode();
      var1 = 31 * var1 + this.a.hashCode();
      var1 = 31 * var1 + this.a.hashCode();
      return var1;
   }

   public boolean isEmpty() {
      return this.a == null && this.b == null && this.d == null && this.c == null && this.e == null && this.a == null && this.c == null && this.a == null && this.a == null && this.a == null;
   }

   public String c() {
      if (this.isEmpty()) {
         return this.a != null ? this.a.c() : "";
      } else {
         StringBuilder var1 = new StringBuilder();
         if (this.a() != null) {
            var1.append(this.a());
         } else if (this.a() != null) {
            var1.append('¨').append(this.a());
         }

         if (this.a()) {
            var1.append(adH.BOLD);
         }

         if (this.b()) {
            var1.append(adH.ITALIC);
         }

         if (this.d()) {
            var1.append(adH.UNDERLINE);
         }

         if (this.e()) {
            var1.append(adH.OBFUSCATED);
         }

         if (this.c()) {
            var1.append(adH.STRIKETHROUGH);
         }

         return var1.toString();
      }
   }
}
