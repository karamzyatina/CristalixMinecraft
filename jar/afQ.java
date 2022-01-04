import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.world.chunk.ExtendedBlockStorage;

public final class afq implements ExtendedBlockStorage {
   private final int a;
   private int b;
   private final afd a;
   private afo a;
   private afo b;

   public afq(int var1, afd var2, afo var3, afo var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.b = var4;
   }

   public afq(int var1, boolean var2) {
      this(var1, new afd(), new afo(), var2 ? new afo() : null);
   }

   public sD a(int var1, int var2, int var3) {
      return this.a.a(var1, var2, var3);
   }

   public void a(int var1, int var2, int var3, sD var4) {
      sD var5 = this.a(var1, var2, var3);
      nh var6 = var5.a();
      nh var7 = var4.a();
      if (var6 != RQ.a) {
         --this.b;
      }

      if (var7 != RQ.a) {
         ++this.b;
      }

      this.a.a(var1, var2, var3, var4);
   }

   public boolean isEmpty() {
      return this.b == 0;
   }

   public int getYLocation() {
      return this.a;
   }

   public void setSkyLight(int var1, int var2, int var3, int var4) {
      this.b.a(var1, var2, var3, var4);
   }

   public int getSkyLight(int var1, int var2, int var3) {
      return this.b.a(var1, var2, var3);
   }

   public void setBlockLight(int var1, int var2, int var3, int var4) {
      this.a.a(var1, var2, var3, var4);
   }

   public int getBlockLight(int var1, int var2, int var3) {
      return this.a.a(var1, var2, var3);
   }

   public void a() {
      sD var1 = afh.a;
      int var2 = 0;
      afd var3 = this.a;

      for(int var4 = 0; var4 < 16; ++var4) {
         int var5 = var4 << 8;

         for(int var6 = 0; var6 < 16; ++var6) {
            int var7 = var5 | var6 << 4;

            for(int var8 = 0; var8 < 16; ++var8) {
               sD var9 = var3.a(var7 | var8);
               if (var9 != var1) {
                  ++var2;
               }
            }
         }
      }

      this.b = var2;
   }

   public afd a() {
      return this.a;
   }

   public afo a() {
      return this.a;
   }

   public afo b() {
      return this.b;
   }

   public void a(afo var1) {
      this.a = var1;
   }

   public void b(afo var1) {
      this.b = var1;
   }

   public int getBlockRefCount() {
      return this.b;
   }

   public BlockState get(int var1, int var2, int var3) {
      return (BlockState)this.a(var1, var2, var3);
   }

   public void set(int var1, int var2, int var3, BlockState var4) {
      this.a(var1, var2, var3, (sD)var4);
   }
}
