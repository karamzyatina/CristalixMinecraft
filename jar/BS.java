public enum Bs {
   DOWN(new Bv[]{new Bv(Bu.f, Bu.e, Bu.a, (Bt)null), new Bv(Bu.f, Bu.e, Bu.d, (Bt)null), new Bv(Bu.c, Bu.e, Bu.d, (Bt)null), new Bv(Bu.c, Bu.e, Bu.a, (Bt)null)}),
   UP(new Bv[]{new Bv(Bu.f, Bu.b, Bu.d, (Bt)null), new Bv(Bu.f, Bu.b, Bu.a, (Bt)null), new Bv(Bu.c, Bu.b, Bu.a, (Bt)null), new Bv(Bu.c, Bu.b, Bu.d, (Bt)null)}),
   NORTH(new Bv[]{new Bv(Bu.c, Bu.b, Bu.d, (Bt)null), new Bv(Bu.c, Bu.e, Bu.d, (Bt)null), new Bv(Bu.f, Bu.e, Bu.d, (Bt)null), new Bv(Bu.f, Bu.b, Bu.d, (Bt)null)}),
   SOUTH(new Bv[]{new Bv(Bu.f, Bu.b, Bu.a, (Bt)null), new Bv(Bu.f, Bu.e, Bu.a, (Bt)null), new Bv(Bu.c, Bu.e, Bu.a, (Bt)null), new Bv(Bu.c, Bu.b, Bu.a, (Bt)null)}),
   WEST(new Bv[]{new Bv(Bu.f, Bu.b, Bu.d, (Bt)null), new Bv(Bu.f, Bu.e, Bu.d, (Bt)null), new Bv(Bu.f, Bu.e, Bu.a, (Bt)null), new Bv(Bu.f, Bu.b, Bu.a, (Bt)null)}),
   EAST(new Bv[]{new Bv(Bu.c, Bu.b, Bu.a, (Bt)null), new Bv(Bu.c, Bu.e, Bu.a, (Bt)null), new Bv(Bu.c, Bu.e, Bu.d, (Bt)null), new Bv(Bu.c, Bu.b, Bu.d, (Bt)null)});

   private static final Bs[] FACINGS = new Bs[6];
   private final Bv[] vertexInfos;

   public static Bs a(abP var0) {
      return FACINGS[var0.getIndex()];
   }

   private Bs(Bv[] var3) {
      this.vertexInfos = var3;
   }

   public Bv a(int var1) {
      return this.vertexInfos[var1];
   }

   static {
      FACINGS[Bu.e] = DOWN;
      FACINGS[Bu.b] = UP;
      FACINGS[Bu.d] = NORTH;
      FACINGS[Bu.a] = SOUTH;
      FACINGS[Bu.f] = WEST;
      FACINGS[Bu.c] = EAST;
   }
}
