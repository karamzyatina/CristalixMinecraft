public class ahd extends agV {
   public ahd(sE var1) {
      super(var1, aaV.class, "book", 0.0F);
   }

   public wY a() {
      return new xg(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xg)) {
         return null;
      } else {
         xg var3 = (xg)var1;
         if (var2.equals("cover_right")) {
            return var3.a;
         } else if (var2.equals("cover_left")) {
            return var3.b;
         } else if (var2.equals("pages_right")) {
            return var3.c;
         } else if (var2.equals("pages_left")) {
            return var3.d;
         } else if (var2.equals("flipping_page_right")) {
            return var3.e;
         } else if (var2.equals("flipping_page_left")) {
            return var3.f;
         } else {
            return var2.equals("book_spine") ? var3.g : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
   }

   public agU a(wY var1, float var2) {
      Ie var3 = this.a.a;
      Object var4 = var3.a(aaV.class);
      if (!(var4 instanceof HX)) {
         return null;
      } else {
         if (((Ik)var4).a() == null) {
            var4 = new HX(this.a);
            ((Ik)var4).a(var3);
         }

         ((HX)var4).a = (xg)var1;
         return (agU)var4;
      }
   }
}
