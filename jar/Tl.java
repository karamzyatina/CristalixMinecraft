public abstract class tl implements tb {
   protected tn a;
   private tp a;
   protected acI a;
   protected acC a;
   protected float a;
   protected float b;
   protected float c;
   protected float d;
   protected float e;
   protected boolean b;
   protected int a;
   protected tc a;

   protected tl(acJ var1, acI var2) {
      this(var1.a(), var2);
   }

   protected tl(acC var1, acI var2) {
      this.a = 1.0F;
      this.b = 1.0F;
      this.a = tc.LINEAR;
      this.a = var1;
      this.a = var2;
   }

   public acC a() {
      return this.a;
   }

   public tp a(tq var1) {
      this.a = var1.a(this.a);
      if (this.a == null) {
         this.a = tq.a;
      } else {
         this.a = this.a.a();
      }

      return this.a;
   }

   public tn a() {
      return this.a;
   }

   public acI a() {
      return this.a;
   }

   public boolean a() {
      return this.b;
   }

   public int a() {
      return this.a;
   }

   public float a() {
      return this.a * this.a.a();
   }

   public float b() {
      return this.b * this.a.b();
   }

   public float c() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public float e() {
      return this.e;
   }

   public tc a() {
      return this.a;
   }
}
