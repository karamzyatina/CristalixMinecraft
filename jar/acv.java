import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.util.Rotation;

public class acV extends adn implements BlockPos {
   public static final acV a = new acV(0, 0, 0);
   private static final int d = 1 + adh.d(adh.b(30000000));
   private static final int e;
   private static final int f;
   private static final int g;
   private static final int h;
   private static final long a;
   private static final long b;
   private static final long c;

   public acV(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public acV(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public acV(NN var1) {
      this(var1.d, var1.e, var1.f);
   }

   public acV(adm var1) {
      this(var1.a, var1.b, var1.c);
   }

   public acV(adn var1) {
      this(var1.a, var1.b, var1.c);
   }

   public final acV a(double var1, double var3, double var5) {
      return var1 == 0.0D && var3 == 0.0D && var5 == 0.0D ? this : new acV((double)this.a + var1, (double)this.b + var3, (double)this.c + var5);
   }

   public final acV a(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new acV(this.a + var1, this.b + var2, this.c + var3);
   }

   public final acV a(adn var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   public final acV b(adn var1) {
      return this.a(-var1.a, -var1.b, -var1.c);
   }

   public final acV a() {
      return new acV(this.a, this.b + 1, this.c);
   }

   public final acV b() {
      return new acV(this.a, this.b - 1, this.c);
   }

   public final acV c() {
      return new acV(this.a, this.b, this.c - 1);
   }

   public final acV d() {
      return new acV(this.a, this.b, this.c + 1);
   }

   public final acV e() {
      return new acV(this.a - 1, this.b, this.c);
   }

   public final acV f() {
      return new acV(this.a + 1, this.b, this.c);
   }

   public acV a(abP var1) {
      return this.a(var1, 1);
   }

   public acV a(abP var1, int var2) {
      return var2 == 0 ? this : new acV(this.a + var1.getXOffset() * var2, this.b + var1.getYOffset() * var2, this.c + var1.getZOffset() * var2);
   }

   public final acV a(acE var1) {
      // $FF: Couldn't be decompiled
   }

   public final acV c(adn var1) {
      int var2 = this.a;
      int var3 = this.b;
      int var4 = this.c;
      int var5 = var1.a;
      int var6 = var1.b;
      int var7 = var1.c;
      return new acV(var3 * var7 - var4 * var6, var4 * var5 - var2 * var7, var2 * var6 - var3 * var5);
   }

   public final long a() {
      return a(this.a, this.b, this.c);
   }

   public static long a(int var0, int var1, int var2) {
      return ((long)var0 & a) << h | ((long)var1 & b) << g | (long)var2 & c;
   }

   public static acV a(long var0) {
      return new acV((double)((int)(var0 << 64 - h - d >> 64 - d)), (double)(var0 << 64 - g - f >> 64 - f), (double)((int)(var0 << 64 - e >> 64 - e)));
   }

   public acV g() {
      return this;
   }

   public static Iterable<acZ> a(acV var0, acV var1) {
      return a(var0.a, var0.b, var0.c, var1.a, var1.b, var1.c);
   }

   public static Iterable<acZ> a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return b(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public static Iterable<acZ> b(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new acW(var0, var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public adn a(adn var1) {
      return this.c(var1);
   }

   static {
      e = d;
      f = 64 - d - e;
      g = e;
      h = g + f;
      a = (1L << d) - 1L;
      b = (1L << f) - 1L;
      c = (1L << e) - 1L;
   }

   public BlockPos add(int var1, int var2, int var3) {
      return (BlockPos)(var1 == 0 && var2 == 0 && var3 == 0 ? this : (BlockPos)d.a(new acV(this.getX() + var1, this.getY() + var2, this.getZ() + var3)));
   }

   public BlockPos up(int var1) {
      return (BlockPos)(var1 == 0 ? this : (BlockPos)d.a(new acV(this.getX(), this.getY() + 1, this.getZ())));
   }

   public BlockPos down(int var1) {
      return (BlockPos)(var1 == 0 ? this : (BlockPos)d.a(new acV(this.getX(), this.getY() - var1, this.getZ())));
   }

   public BlockPos north(int var1) {
      return (BlockPos)(var1 == 0 ? this : (BlockPos)d.a(new acV(this.getX(), this.getY(), this.getZ() - var1)));
   }

   public BlockPos south(int var1) {
      return (BlockPos)(var1 == 0 ? this : (BlockPos)d.a(new acV(this.getX(), this.getY(), this.getZ() + var1)));
   }

   public BlockPos west(int var1) {
      return (BlockPos)(var1 == 0 ? this : (BlockPos)d.a(new acV(this.getX() - var1, this.getY(), this.getZ())));
   }

   public BlockPos east(int var1) {
      return (BlockPos)(var1 == 0 ? this : (BlockPos)d.a(new acV(this.getX() + var1, this.getY(), this.getZ())));
   }

   public BlockPos rotate(Rotation var1) {
      return (BlockPos)d.a(this.a((acE)d.a(var1)));
   }
}
