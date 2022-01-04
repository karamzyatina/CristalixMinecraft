import java.util.ArrayList;

public final class JM extends ArrayList {
   public static final int a = Rs.a();

   public JM() {
      this.ensureCapacity(a);

      for(int var1 = 0; var1 < a; ++var1) {
         this.add(Vh.a);
      }

   }

   public VZ a() {
      VZ var1 = new VZ();

      for(int var2 = 0; var2 < a; ++var2) {
         var1.a((VK)((Vh)this.get(var2)).a(new VR()));
      }

      return var1;
   }

   public void a(VZ var1) {
      for(int var2 = 0; var2 < a; ++var2) {
         this.set(var2, new Vh(var1.a(var2)));
      }

   }

   public boolean isEmpty() {
      for(int var1 = 0; var1 < a; ++var1) {
         if (!((Vh)this.get(var1)).isEmpty()) {
            return false;
         }
      }

      return true;
   }
}
