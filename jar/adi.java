import dev.xdark.clientapi.text.ClickEvent;
import dev.xdark.clientapi.text.ClickEvent.Action;
import java.util.Objects;

public final class adI implements ClickEvent {
   private final adJ a;
   private final String a;

   public adI(adJ var1, String var2) {
      this.a = var1;
      this.a = var2;
   }

   public adJ a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         adI var2;
         return var1 instanceof adI && this.a == (var2 = (adI)var1).a && Objects.equals(this.a, var2.a);
      }
   }

   public String toString() {
      return "ClickEvent{action=" + this.a + ", value='" + this.a + '\'' + '}';
   }

   public int hashCode() {
      int var1 = this.a.hashCode();
      var1 = 31 * var1 + (this.a != null ? this.a.hashCode() : 0);
      return var1;
   }

   public Action getAction() {
      return (Action)d.a(this.a);
   }

   public String getValue() {
      return this.a;
   }
}
