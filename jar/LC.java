import java.text.MessageFormat;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.ResourceBundle;

public abstract class lc implements kN {
   private final Class<E> a;
   private String a = "[,]";

   protected lc(Class<E> var1) {
      this.a = var1;
   }

   public E a(String var1) {
      Enum[] var2 = (Enum[])this.a().getEnumConstants();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Enum var5 = var2[var4];
         if (var5.name().equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      throw new kM(this.a(var1));
   }

   public Class<E> a() {
      return this.a;
   }

   public void a(String var1) {
      this.a = var1;
   }

   public String a() {
      EnumSet var1 = EnumSet.allOf(this.a());
      StringBuilder var2 = new StringBuilder();
      var2.append(this.a.charAt(0));
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         var2.append(((Enum)var3.next()).toString());
         if (var3.hasNext()) {
            var2.append(this.a.charAt(1));
         }
      }

      var2.append(this.a.charAt(2));
      return var2.toString();
   }

   private String a(String var1) {
      ResourceBundle var2 = ResourceBundle.getBundle("joptsimple.ExceptionMessages");
      Object[] var3 = new Object[]{var1, this.a()};
      String var4 = var2.getString(lc.class.getName() + ".message");
      return (new MessageFormat(var4)).format(var3);
   }
}
