import java.util.Iterator;

final class acW implements Iterable {
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final int d;
   // $FF: synthetic field
   final int e;
   // $FF: synthetic field
   final int f;

   acW(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public Iterator<acZ> iterator() {
      return new acX(this);
   }
}
