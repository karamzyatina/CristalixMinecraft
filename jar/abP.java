import io.netty.buffer.ByteBuf;

public final class abp extends aaD {
   private String a = "";
   private String b = "";
   private String c = "";
   private acV a = new acV(0, 1, 0);
   private acV b;
   private act a;
   private acE a;
   private abr a;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private float a;
   private long a;

   public abp() {
      this.b = acV.a;
      this.a = act.NONE;
      this.a = acE.NONE;
      this.a = abr.DATA;
      this.b = true;
      this.e = true;
      this.a = 1.0F;
   }

   public VR a(VR var1) {
      super.a(var1);
      var1.a("name", this.a);
      var1.a("author", this.b);
      var1.a("metadata", this.c);
      var1.a("posX", this.a.a);
      var1.a("posY", this.a.b);
      var1.a("posZ", this.a.c);
      var1.a("sizeX", this.b.a);
      var1.a("sizeY", this.b.b);
      var1.a("sizeZ", this.b.c);
      var1.a("rotation", this.a.toString());
      var1.a("mirror", this.a.toString());
      var1.a("mode", this.a.toString());
      var1.a("ignoreEntities", this.b);
      var1.a("powered", this.c);
      var1.a("showair", this.d);
      var1.a("showboundingbox", this.e);
      var1.a("integrity", this.a);
      var1.a("seed", this.a);
      return var1;
   }

   public void a(VR var1) {
      super.a(var1);
      this.a(var1.getString("name"));
      this.b = var1.getString("author");
      this.c = var1.getString("metadata");
      int var2 = adh.a(var1.getInteger("posX"), -32, 32);
      int var3 = adh.a(var1.getInteger("posY"), -32, 32);
      int var4 = adh.a(var1.getInteger("posZ"), -32, 32);
      this.a = new acV(var2, var3, var4);
      int var5 = adh.a(var1.getInteger("sizeX"), 0, 32);
      int var6 = adh.a(var1.getInteger("sizeY"), 0, 32);
      int var7 = adh.a(var1.getInteger("sizeZ"), 0, 32);
      this.b = new acV(var5, var6, var7);

      try {
         this.a = acE.valueOf(var1.getString("rotation"));
      } catch (IllegalArgumentException var11) {
         this.a = acE.NONE;
      }

      try {
         this.a = act.valueOf(var1.getString("mirror"));
      } catch (IllegalArgumentException var10) {
         this.a = act.NONE;
      }

      try {
         this.a = abr.valueOf(var1.getString("mode"));
      } catch (IllegalArgumentException var9) {
         this.a = abr.DATA;
      }

      this.b = var1.getBoolean("ignoreEntities");
      this.c = var1.getBoolean("powered");
      this.d = var1.getBoolean("showair");
      this.e = var1.getBoolean("showboundingbox");
      if (var1.hasKey("integrity")) {
         this.a = var1.getFloat("integrity");
      } else {
         this.a = 1.0F;
      }

      this.a = var1.getLong("seed");
      this.g();
   }

   private void g() {
      if (this.a != null) {
         acV var1 = this.a();
         sD var2 = this.a.a(var1);
         if (var2.a() == RQ.cG) {
            this.a.a((acV)var1, (sD)var2.a(rE.a, this.a), 2);
         }
      }

   }

   public VR a() {
      return this.a(new VR());
   }

   public boolean a(Rn var1) {
      if (!var1.x()) {
         return false;
      } else {
         var1.a(this);
         return true;
      }
   }

   public String a() {
      return this.a;
   }

   public void a(String var1) {
      String var2 = var1;
      char[] var3 = abv.a;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         var2 = var2.replace(var6, '_');
      }

      this.a = var2;
   }

   public void a(Oh var1) {
      if (!acK.a(var1.getName())) {
         this.b = var1.getName();
      }

   }

   public acV b() {
      return this.a;
   }

   public void b(acV var1) {
      this.a = var1;
   }

   public acV c() {
      return this.b;
   }

   public void c(acV var1) {
      this.b = var1;
   }

   public act a() {
      return this.a;
   }

   public void b(act var1) {
      this.a = var1;
   }

   public acE a() {
      return this.a;
   }

   public void b(acE var1) {
      this.a = var1;
   }

   public String b() {
      return this.c;
   }

   public void b(String var1) {
      this.c = var1;
   }

   public abr a() {
      return this.a;
   }

   public void a(abr var1) {
      this.a = var1;
      sD var2 = this.a.a(this.a, this.b, this.c);
      if (var2.a() == RQ.cG) {
         this.a.a(this.a, this.b, this.c, var2.a(rE.a, var1), 2);
      }

   }

   public void a() {
      // $FF: Couldn't be decompiled
   }

   public boolean c() {
      return this.b;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   public float a() {
      return this.a;
   }

   public void a(float var1) {
      this.a = var1;
   }

   public long a() {
      return this.a;
   }

   public void a(long var1) {
      this.a = var1;
   }

   public void a(ByteBuf var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
   }

   public boolean d() {
      return this.c;
   }

   public void b(boolean var1) {
      this.c = var1;
   }

   public boolean e() {
      return this.d;
   }

   public void c(boolean var1) {
      this.d = var1;
   }

   public boolean f() {
      return this.e;
   }

   public void d(boolean var1) {
      this.e = var1;
   }

   public adu a() {
      return new adE("structure_block.hover." + abr.a(this.a), new Object[]{this.a == abr.DATA ? this.c : this.a});
   }
}
