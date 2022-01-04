import com.google.common.collect.AbstractIterator;

class acX extends AbstractIterator {
   private ada a;
   // $FF: synthetic field
   final acW a;

   acX(acW var1) {
      this.a = var1;
   }

   protected acZ a() {
      ada var1 = this.a;
      if (var1 == null) {
         var1 = ada.a(this.a.a, this.a.b, this.a.c);
         this.a = var1;
         return var1;
      } else if (var1.a == this.a.d && var1.b == this.a.e && var1.c == this.a.f) {
         var1.recycle();
         return (acZ)this.endOfData();
      } else {
         if (var1.a < this.a.d) {
            ++var1.a;
         } else if (var1.b < this.a.e) {
            var1.a = this.a.a;
            ++var1.b;
         } else if (var1.c < this.a.f) {
            var1.a = this.a.a;
            var1.b = this.a.b;
            ++var1.c;
         }

         return var1;
      }
   }

   // $FF: synthetic method
   protected Object computeNext() {
      return this.a();
   }
}
