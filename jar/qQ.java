public final class qq extends qj {
   public static final sr<ql> a;
   public static final sp a;

   public qq() {
      super(true);
      this.a(this.a.a().a(a, ql.NORTH_SOUTH).a(a, Boolean.FALSE));
   }

   protected boolean a(aej var1, acV var2, sD var3, boolean var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   protected boolean a(aej var1, acV var2, boolean var3, int var4, ql var5) {
      sD var6 = var1.a(var2);
      if (var6.a() != this) {
         return false;
      } else {
         ql var7 = (ql)var6.a((so)a);
         if (var5 != ql.EAST_WEST || var7 != ql.NORTH_SOUTH && var7 != ql.ASCENDING_NORTH && var7 != ql.ASCENDING_SOUTH) {
            if (var5 != ql.NORTH_SOUTH || var7 != ql.EAST_WEST && var7 != ql.ASCENDING_EAST && var7 != ql.ASCENDING_WEST) {
               if (!(Boolean)var6.a((so)a)) {
                  return false;
               } else {
                  return var1.h(var2) || this.a(var1, var2, var6, var3, var4 + 1);
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public so<ql> a() {
      return a;
   }

   public sD a(int var1) {
      return this.a().a(a, ql.a(var1 & 7)).a(a, (var1 & 8) > 0);
   }

   public int c(sD var1) {
      byte var2 = 0;
      int var3 = var2 | ((ql)var1.a((so)a)).a();
      if ((Boolean)var1.a((so)a)) {
         var3 |= 8;
      }

      return var3;
   }

   public sD a(sD var1, acE var2) {
      // $FF: Couldn't be decompiled
   }

   public sD a(sD var1, act var2) {
      // $FF: Couldn't be decompiled
   }

   public sy a() {
      return new sy(this, new so[]{a, a});
   }

   static {
      a = sr.a("shape", ql.class, new qr(), ql.VALUES);
      a = sp.a("powered");
   }
}
