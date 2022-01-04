import dev.xdark.feder.RecyclableArrayList;

public abstract class agV {
   protected final sE a;
   private final Class a;
   private final String a;
   private final float a;
   private String[] a;

   public agV(sE var1, Class var2, String var3, float var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
   }

   public agV(sE var1, Class var2, String var3, float var4, String[] var5) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
      this.a = var5;
   }

   public final Class a() {
      return this.a;
   }

   public final String a() {
      return this.a;
   }

   public final String[] a() {
      return this.a;
   }

   public final float a() {
      return this.a;
   }

   public abstract wY a();

   public abstract xN a(wY var1, String var2);

   public abstract String[] b();

   public abstract agU a(wY var1, float var2);

   public final xN[] a(wY var1) {
      String[] var2 = this.b();
      RecyclableArrayList var3 = RecyclableArrayList.newInstance();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         String var5 = var2[var4];
         xN var6 = this.a(var1, var5);
         if (var6 != null) {
            var3.add(var6);
         }
      }

      xN[] var7 = (xN[])var3.toArray(new xN[0]);
      var3.recycle();
      return var7;
   }
}
