public abstract class amJ {
   private static final String a = "This feature requires ASM5";
   protected final int a;
   protected amJ a;

   public amJ(int var1) {
      this(var1, (amJ)null);
   }

   public amJ(int var1, amJ var2) {
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

   public void b(String var1, int var2) {
      if (this.a < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         if (this.a != null) {
            this.a.b(var1, var2);
         }

      }
   }

   public amo a() {
      return this.a != null ? this.a.a() : null;
   }

   public amo a(String var1, boolean var2) {
      return this.a != null ? this.a.a(var1, var2) : null;
   }

   public amo a(int var1, amU var2, String var3, boolean var4) {
      if (this.a < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.a != null ? this.a.a(var1, var2, var3, var4) : null;
      }
   }

   public void a(int var1, boolean var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public amo a(int var1, String var2, boolean var3) {
      return this.a != null ? this.a.a(var1, var2, var3) : null;
   }

   public void a(amq var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public void a() {
      if (this.a != null) {
         this.a.a();
      }

   }

   public void a(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      if (this.a != null) {
         this.a.a(var1, var2, var3, var4, var5);
      }

   }

   public void a(int var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public void a(int var1, int var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public void b(int var1, int var2) {
      if (this.a != null) {
         this.a.b(var1, var2);
      }

   }

   public void a(int var1, String var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public void a(int var1, String var2, String var3, String var4) {
      if (this.a != null) {
         this.a.a(var1, var2, var3, var4);
      }

   }

   @Deprecated
   public void b(int var1, String var2, String var3, String var4) {
      int var5 = var1 | (this.a < 327680 ? 256 : 0);
      this.a(var5, var2, var3, var4, var1 == 185);
   }

   public void a(int var1, String var2, String var3, String var4, boolean var5) {
      if (this.a < 327680 && (var1 & 256) == 0) {
         if (var5 != (var1 == 185)) {
            throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
         } else {
            this.b(var1, var2, var3, var4);
         }
      } else {
         if (this.a != null) {
            this.a.a(var1 & -257, var2, var3, var4, var5);
         }

      }
   }

   public void a(String var1, String var2, amF var3, Object... var4) {
      if (this.a < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         if (this.a != null) {
            this.a.a(var1, var2, var3, var4);
         }

      }
   }

   public void a(int var1, amH var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public void a(amH var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public void a(Object var1) {
      if (this.a < 327680 && (var1 instanceof amF || var1 instanceof amT && ((amT)var1).a() == 11)) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else if (this.a < 458752 && var1 instanceof amx) {
         throw new UnsupportedOperationException("This feature requires ASM7");
      } else {
         if (this.a != null) {
            this.a.a(var1);
         }

      }
   }

   public void c(int var1, int var2) {
      if (this.a != null) {
         this.a.c(var1, var2);
      }

   }

   public void a(int var1, int var2, amH var3, amH... var4) {
      if (this.a != null) {
         this.a.a(var1, var2, var3, var4);
      }

   }

   public void a(amH var1, int[] var2, amH[] var3) {
      if (this.a != null) {
         this.a.a(var1, var2, var3);
      }

   }

   public void a(String var1, int var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public amo b(int var1, amU var2, String var3, boolean var4) {
      if (this.a < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.a != null ? this.a.b(var1, var2, var3, var4) : null;
      }
   }

   public void a(amH var1, amH var2, amH var3, String var4) {
      if (this.a != null) {
         this.a.a(var1, var2, var3, var4);
      }

   }

   public amo c(int var1, amU var2, String var3, boolean var4) {
      if (this.a < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.a != null ? this.a.c(var1, var2, var3, var4) : null;
      }
   }

   public void a(String var1, String var2, String var3, amH var4, amH var5, int var6) {
      if (this.a != null) {
         this.a.a(var1, var2, var3, var4, var5, var6);
      }

   }

   public amo a(int var1, amU var2, amH[] var3, amH[] var4, int[] var5, String var6, boolean var7) {
      if (this.a < 327680) {
         throw new UnsupportedOperationException("This feature requires ASM5");
      } else {
         return this.a != null ? this.a.a(var1, var2, var3, var4, var5, var6, var7) : null;
      }
   }

   public void b(int var1, amH var2) {
      if (this.a != null) {
         this.a.b(var1, var2);
      }

   }

   public void d(int var1, int var2) {
      if (this.a != null) {
         this.a.d(var1, var2);
      }

   }

   public void b() {
      if (this.a != null) {
         this.a.b();
      }

   }
}
