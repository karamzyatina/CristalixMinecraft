public abstract class amv {
   protected final int a;
   protected amv a;

   public amv(int var1) {
      this(var1, (amv)null);
   }

   public amv(int var1, amv var2) {
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

   public void a(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      if (this.a < 524288 && (var2 & 65536) != 0) {
         throw new UnsupportedOperationException("Records requires ASM8");
      } else {
         if (this.a != null) {
            this.a.a(var1, var2, var3, var4, var5, var6);
         }

      }
   }

   public void a(String var1, String var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public amL a(String var1, int var2, String var3) {
      if (this.a < 393216) {
         throw new UnsupportedOperationException("Module requires ASM6");
      } else {
         return this.a != null ? this.a.a(var1, var2, var3) : null;
      }
   }

   public void a(String var1) {
      if (this.a < 458752) {
         throw new UnsupportedOperationException("NestHost requires ASM7");
      } else {
         if (this.a != null) {
            this.a.a(var1);
         }

      }
   }

   public void a(String var1, String var2, String var3) {
      if (this.a != null) {
         this.a.a(var1, var2, var3);
      }

   }

   public amo a(String var1, boolean var2) {
      return this.a != null ? this.a.a(var1, var2) : null;
   }

   public amo a(int var1, amU var2, String var3, boolean var4) {
      if (this.a < 327680) {
         throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
      } else {
         return this.a != null ? this.a.a(var1, var2, var3, var4) : null;
      }
   }

   public void a(amq var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public void b(String var1) {
      if (this.a < 458752) {
         throw new UnsupportedOperationException("NestMember requires ASM7");
      } else {
         if (this.a != null) {
            this.a.b(var1);
         }

      }
   }

   public void c(String var1) {
      if (this.a < 589824) {
         throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
      } else {
         if (this.a != null) {
            this.a.c(var1);
         }

      }
   }

   public void a(String var1, String var2, String var3, int var4) {
      if (this.a != null) {
         this.a.a(var1, var2, var3, var4);
      }

   }

   public amO a(String var1, String var2, String var3) {
      if (this.a < 524288) {
         throw new UnsupportedOperationException("Record requires ASM8");
      } else {
         return this.a != null ? this.a.a(var1, var2, var3) : null;
      }
   }

   public amC a(int var1, String var2, String var3, String var4, Object var5) {
      return this.a != null ? this.a.a(var1, var2, var3, var4, var5) : null;
   }

   public amJ a(int var1, String var2, String var3, String var4, String[] var5) {
      return this.a != null ? this.a.a(var1, var2, var3, var4, var5) : null;
   }

   public void a() {
      if (this.a != null) {
         this.a.a();
      }

   }
}
