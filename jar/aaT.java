import java.util.BitSet;

public class aat {
   protected final BitSet a = new BitSet();
   protected final BitSet b = new BitSet();
   protected boolean a;
   protected boolean b;

   public void a() {
      this.a.clear();
      this.b.clear();
      this.a = false;
      this.b = false;
   }

   public void a(Vp var1) {
      if (!var1.a()) {
         this.a.set(a(var1));
      }

   }

   public boolean a(Vp var1) {
      return this.a.get(a(var1));
   }

   public void b(Vp var1) {
      int var2 = a(var1);
      this.a.clear(var2);
      this.b.clear(var2);
   }

   protected static int a(Vp var0) {
      return Vn.a.a(var0);
   }

   public boolean b(Vp var1) {
      return this.b.get(a(var1));
   }

   public void c(Vp var1) {
      this.b.clear(a(var1));
   }

   public void d(Vp var1) {
      this.b.set(a(var1));
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
}
