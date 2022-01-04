import io.netty.buffer.ByteBuf;

public abstract class aaA implements Km {
   private long a = -1L;
   private boolean a = true;
   private int a;
   private boolean b = true;
   private adu a;
   private String a = "";
   private String b = "@";

   public int b() {
      return this.a;
   }

   public adu b() {
      return (adu)(this.a == null ? new adD("") : this.a);
   }

   public VR a(VR var1) {
      var1.a("Command", this.a);
      var1.a("SuccessCount", this.a);
      var1.a("CustomName", this.b);
      var1.a("TrackOutput", this.b);
      if (this.a != null && this.b) {
         var1.a("LastOutput", adv.a(this.a));
      }

      var1.a("UpdateLastExecution", this.a);
      if (this.a && this.a > 0L) {
         var1.a("LastExecution", this.a);
      }

      return var1;
   }

   public void a(VR var1) {
      this.a = var1.getString("Command");
      this.a = var1.getInteger("SuccessCount");
      if (var1.a("CustomName", (int)8)) {
         this.b = var1.getString("CustomName");
      }

      if (var1.a("TrackOutput", (int)1)) {
         this.b = var1.getBoolean("TrackOutput");
      }

      if (var1.a("LastOutput", (int)8) && this.b) {
         try {
            this.a = adv.a(var1.getString("LastOutput"));
         } catch (Throwable var3) {
            this.a = new adD(var3.getMessage());
         }
      } else {
         this.a = null;
      }

      if (var1.hasKey("UpdateLastExecution")) {
         this.a = var1.getBoolean("UpdateLastExecution");
      }

      if (this.a && var1.hasKey("LastExecution")) {
         this.a = var1.getLong("LastExecution");
      } else {
         this.a = -1L;
      }

   }

   public boolean a(int var1, String var2) {
      return var1 <= 2;
   }

   public void a(String var1) {
      this.a = var1;
      this.a = 0;
   }

   public String a() {
      return this.a;
   }

   public String getName() {
      return this.b;
   }

   public void b(String var1) {
      this.b = var1;
   }

   public abstract int a();

   public abstract void a(ByteBuf var1);

   public void b(adu var1) {
      this.a = var1;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   public boolean a() {
      return this.b;
   }

   public boolean a(Rn var1) {
      if (!var1.x()) {
         return false;
      } else {
         var1.a(this);
         return true;
      }
   }
}
