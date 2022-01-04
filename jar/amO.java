public abstract class amo {
   protected final int a;
   protected amo a;

   public amo(int var1) {
      this(var1, (amo)null);
   }

   public amo(int var1, amo var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException("Unsupported api " + var1);
      } else {
         if (var1 == 17432576) {
            amy.a((Object)this);
         }

         this.a = var1;
         this.a = var2;
      }
   }

   public void a(String var1, Object var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public void a(String var1, String var2, String var3) {
      if (this.a != null) {
         this.a.a(var1, var2, var3);
      }

   }

   public amo a(String var1, String var2) {
      return this.a != null ? this.a.a(var1, var2) : null;
   }

   public amo a(String var1) {
      return this.a != null ? this.a.a(var1) : null;
   }

   public void a() {
      if (this.a != null) {
         this.a.a();
      }

   }
}
