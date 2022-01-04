public abstract class RP {
   public static final aeu a;
   public static final aeu b;
   public static final aeu c;
   public static final aeu d;
   public static final aeu e;
   public static final aeu f;
   public static final aeu g;
   public static final aeu h;
   public static final aeu i;
   public static final aeu j;
   public static final aeu k;
   public static final aeu l;
   public static final aeu m;
   public static final aeu n;
   public static final aeu o;
   public static final aeu p;
   public static final aeu q;
   public static final aeu r;
   public static final aeu s;
   public static final aeu t;
   public static final aeu u;
   public static final aeu v;
   public static final aeu w;
   public static final aeu x;
   public static final aeu y;
   public static final aeu z;
   public static final aeu A;
   public static final aeu B;
   public static final aeu C;
   public static final aeu D;
   public static final aeu E;
   public static final aeu F;
   public static final aeu G;
   public static final aeu H;
   public static final aeu I;
   public static final aeu J;
   public static final aeu K;
   public static final aeu L;
   public static final aeu M;
   public static final aeu N;
   public static final aeu O;
   public static final aeu P;
   public static final aeu Q;
   public static final aeu R;
   public static final aeu S;
   public static final aeu T;
   public static final aeu U;
   public static final aeu V;
   public static final aeu W;
   public static final aeu X;
   public static final aeu Y;
   public static final aeu Z;
   public static final aeu aa;
   public static final aeu ab;
   public static final aeu ac;
   public static final aeu ad;
   public static final aeu ae;
   public static final aeu af;
   public static final aeu ag;
   public static final aeu ah;
   public static final aeu ai;
   public static final aeu aj;
   public static final aeu ak;

   private static aeu a(String var0) {
      aeu var1 = (aeu)aeu.a.a(new acC(var0));
      if (var1 == null) {
         throw new IllegalStateException("Invalid Biome requested: " + var0);
      } else {
         return var1;
      }
   }

   static {
      if (!RR.a()) {
         throw new RuntimeException("Accessed Biomes before Bootstrap!");
      } else {
         a = a("ocean");
         b = a;
         c = a("plains");
         d = a("desert");
         e = a("extreme_hills");
         f = a("forest");
         g = a("taiga");
         h = a("swampland");
         i = a("river");
         j = a("hell");
         k = a("sky");
         l = a("frozen_ocean");
         m = a("frozen_river");
         n = a("ice_flats");
         o = a("ice_mountains");
         p = a("mushroom_island");
         q = a("mushroom_island_shore");
         r = a("beaches");
         s = a("desert_hills");
         t = a("forest_hills");
         u = a("taiga_hills");
         v = a("smaller_extreme_hills");
         w = a("jungle");
         x = a("jungle_hills");
         y = a("jungle_edge");
         z = a("deep_ocean");
         A = a("stone_beach");
         B = a("cold_beach");
         C = a("birch_forest");
         D = a("birch_forest_hills");
         E = a("roofed_forest");
         F = a("taiga_cold");
         G = a("taiga_cold_hills");
         H = a("redwood_taiga");
         I = a("redwood_taiga_hills");
         J = a("extreme_hills_with_trees");
         K = a("savanna");
         L = a("savanna_rock");
         M = a("mesa");
         N = a("mesa_rock");
         O = a("mesa_clear_rock");
         P = a("void");
         Q = a("mutated_plains");
         R = a("mutated_desert");
         S = a("mutated_extreme_hills");
         T = a("mutated_forest");
         U = a("mutated_taiga");
         V = a("mutated_swampland");
         W = a("mutated_ice_flats");
         X = a("mutated_jungle");
         Y = a("mutated_jungle_edge");
         Z = a("mutated_birch_forest");
         aa = a("mutated_birch_forest_hills");
         ab = a("mutated_roofed_forest");
         ac = a("mutated_taiga_cold");
         ad = a("mutated_redwood_taiga");
         ae = a("mutated_redwood_taiga_hills");
         af = a("mutated_extreme_hills_with_trees");
         ag = a("mutated_savanna");
         ah = a("mutated_savanna_rock");
         ai = a("mutated_mesa");
         aj = a("mutated_mesa_rock");
         ak = a("mutated_mesa_clear_rock");
      }
   }
}
