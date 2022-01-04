import com.google.common.collect.AbstractIterator;

class afR extends AbstractIterator {
   private afP a;
   // $FF: synthetic field
   final afQ a;

   afR(afQ var1) {
      this.a = var1;
      this.a = null;
   }

   protected afP a() {
      if (this.a == null) {
         this.a = new afP(this.a.a.a, this.a.a.b, this.a.a.c, 3);
         return this.a;
      } else if (this.a.equals(this.a.b)) {
         return (afP)this.endOfData();
      } else {
         int var1 = this.a.a;
         int var2 = this.a.b;
         int var3 = this.a.c;
         if (var1 < this.a.b.a) {
            ++var1;
         } else if (var2 < this.a.b.b) {
            var1 = this.a.a.a;
            ++var2;
         } else if (var3 < this.a.b.c) {
            var1 = this.a.a.a;
            var2 = this.a.a.b;
            ++var3;
         }

         this.a.a(var1, var2, var3);
         return this.a;
      }
   }

   protected Object computeNext() {
      return this.a();
   }
}
