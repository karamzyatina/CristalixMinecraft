import dev.xdark.clientapi.text.HoverEvent;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.text.HoverEvent.Action;
import java.util.Objects;

public class adK implements HoverEvent {
   private final adL a;
   private final adu a;

   public adK(adL var1, adu var2) {
      this.a = var1;
      this.a = var2;
   }

   public adL a() {
      return this.a;
   }

   public adu a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         adK var2;
         return var1 instanceof adK && this.a == (var2 = (adK)var1).a && Objects.equals(this.a, var2.a);
      }
   }

   public String toString() {
      return "HoverEvent{action=" + this.a + ", value='" + this.a + '\'' + '}';
   }

   public int hashCode() {
      int var1 = this.a.hashCode();
      var1 = 31 * var1 + (this.a != null ? this.a.hashCode() : 0);
      return var1;
   }

   public Action getAction() {
      return (Action)d.a(this.a);
   }

   public Text getValue() {
      return (Text)d.a(this.a);
   }
}
