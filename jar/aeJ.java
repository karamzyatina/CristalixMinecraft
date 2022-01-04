import dev.xdark.clientapi.biome.Biome;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityWeatherEffect;
import dev.xdark.clientapi.sound.SoundCategory;
import dev.xdark.clientapi.sound.SoundEvent;
import dev.xdark.clientapi.tile.TileEntity;
import dev.xdark.clientapi.util.ParticleType;
import dev.xdark.clientapi.world.World;
import dev.xdark.clientapi.world.chunk.Chunk;
import dev.xdark.clientapi.world.chunk.ChunkProvider;
import dev.xdark.feder.RecyclableArrayList;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import ru.cristalix.core.math.V3;
import ru.cristalix.core.minecraft.DimensionData;

public abstract class aej implements aec, World {
   private int b = 63;
   public final Set<NN> b = new ReferenceOpenHashSet();
   protected final List<NN> a = new ReferenceArrayList();
   public final Set<aaD> c = new ReferenceOpenHashSet();
   public final List<aaD> b = new ReferenceArrayList();
   private final List<aaD> f = new ReferenceArrayList();
   private final List<aaD> g = new ReferenceArrayList();
   public final List<Rn> c = new ReferenceArrayList();
   public final Object2ReferenceMap<String, Rn> a = new Object2ReferenceOpenHashMap();
   public final Object2ReferenceMap<UUID, NN> b = new Object2ReferenceOpenHashMap();
   public final List<NN> d = new ReferenceArrayList();
   protected final Int2ReferenceMap<NN> a = new Int2ReferenceOpenHashMap();
   private int c;
   protected float a;
   protected float b;
   public int a;
   public final Random a = new Random();
   public final aen a;
   protected List<aef> e = new ArrayList(2);
   protected afn a;
   protected afF a;
   protected afD a;
   private final Calendar a = Calendar.getInstance();
   protected aao a = new aao();
   private boolean a;
   private final afc a;
   int[] a = new int['耀'];
   private final adm a = new adm(0.0D, 0.0D, 0.0D);
   private final adm b = new adm(0.0D, 0.0D, 0.0D);

   protected aej(afF var1, aen var2) {
      this.a = var1;
      this.a = var2;
      this.a = var2.a();
   }

   public aeu a(int var1, int var2, int var3) {
      afh var4 = this.a(var1 >> 4, var3 >> 4);

      try {
         return var4.a(var1, var3);
      } catch (Throwable var8) {
         Kn var6 = Kn.a(var8, "Getting biome");
         Ku var7 = var6.a("Coordinates of biome request");
         var7.a((String)"Location", (KB)(new aek(this, var1, var2, var3)));
         throw new acB(var6);
      }
   }

   public aeu a(acV var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   protected abstract afn a();

   public final void a(afn var1) {
      this.a = var1;
   }

   public final sD b(acV var1) {
      int var2 = var1.a;
      int var3 = this.b() + 1;

      int var4;
      for(var4 = var1.c; !this.isAirBlock(var2, var3, var4); ++var3) {
      }

      return this.a(var2, var3, var4);
   }

   private boolean e(int var1, int var2, int var3) {
      return !this.a(var2) && var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000;
   }

   private boolean k(acV var1) {
      return this.e(var1.a, var1.b, var1.c);
   }

   public boolean a(int var1) {
      return var1 < 0 || var1 >= this.getHeight();
   }

   private boolean l(acV var1) {
      return this.a(var1.b);
   }

   public boolean isAirBlock(int var1, int var2, int var3) {
      return this.a(var1, var2, var3).a() == si.a;
   }

   public final boolean a(acV var1) {
      return this.isAirBlock(var1.a, var1.b, var1.c);
   }

   public final boolean a(int var1, int var2) {
      return true;
   }

   public final boolean b(int var1, int var2, boolean var3) {
      return this.a(var1 >> 4, var2 >> 4, var3);
   }

   public final boolean b(acV var1) {
      return true;
   }

   public final boolean a(acV var1, boolean var2) {
      return this.b(var1.a, var1.c, var2);
   }

   public final boolean a(int var1, int var2, int var3, int var4) {
      return true;
   }

   public final boolean a(NN var1, int var2) {
      return true;
   }

   public final boolean a(acV var1, int var2) {
      return true;
   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5) {
      return this.a(var1 - var4, var2 - var4, var3 - var4, var1 + var4, var2 + var4, var3 + var4, var5);
   }

   public final boolean a(acV var1, int var2, boolean var3) {
      return this.a(var1.a, var1.b, var1.c, var2, var3);
   }

   public boolean a(acV var1, acV var2) {
      return true;
   }

   public final boolean a(acV var1, acV var2, boolean var3) {
      return this.a(var1.a, var1.b, var1.c, var2.a, var2.b, var2.c, var3);
   }

   public final boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   public final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var5 >= 0 && var2 < this.getHeight()) {
         if (var7) {
            return true;
         } else {
            var1 >>= 4;
            var3 >>= 4;
            var4 >>= 4;
            var6 >>= 4;

            for(int var8 = var1; var8 <= var4; ++var8) {
               for(int var9 = var3; var9 <= var6; ++var9) {
                  if (!this.a(var8, var9, false)) {
                     return false;
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public abstract boolean a(int var1, int var2, boolean var3);

   public final afh a(acV var1) {
      return this.a(var1.a >> 4, var1.c >> 4);
   }

   public final afh a(int var1, int var2) {
      return this.a.c(var1, var2);
   }

   public final boolean isChunkGeneratedAt(int var1, int var2) {
      return this.a(var1, var2, false) || this.a.a(var1, var2);
   }

   public final boolean b(acV var1, sD var2) {
      int var3 = var1.b;
      if (this.a(var3)) {
         return false;
      } else {
         int var4 = var1.a;
         int var5 = var1.c;
         return this.a(var4 >> 4, var5 >> 4).a(var4, var3, var5, var2);
      }
   }

   public boolean a(int var1, int var2, int var3, sD var4, int var5) {
      if (this.a(var2)) {
         return false;
      } else {
         afh var6 = this.a(var1 >> 4, var3 >> 4);
         sD var7 = var6.a(var1, var2, var3, var4);
         if (var7 == null) {
            return false;
         } else {
            if (var4.getLightOpacity() != var7.getLightOpacity() || var4.getLightValue() != var7.getLightValue()) {
               this.c(var1, var2, var3);
            }

            if ((var5 & 2) != 0 && (var5 & 4) == 0 && var6.a()) {
               this.a(var1, var2, var3, var7, var4, var5);
            }

            return true;
         }
      }
   }

   public final boolean a(acV var1, sD var2, int var3) {
      return this.a(var1.a, var1.b, var1.c, var2, var3);
   }

   public final boolean a(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, afh.a, 3);
   }

   public final boolean c(acV var1) {
      return this.a((acV)var1, (sD)afh.a, 3);
   }

   public final boolean d(acV var1) {
      sD var2 = this.a(var1);
      if (var2.a() == si.a) {
         return false;
      } else {
         this.b(2001, var1, mY.e(var2));
         return this.a((acV)var1, (sD)afh.a, 3);
      }
   }

   public final boolean b(int var1, int var2, int var3, sD var4) {
      return this.a(var1, var2, var3, var4, 3);
   }

   public final boolean c(acV var1, sD var2) {
      return this.a((acV)var1, (sD)var2, 3);
   }

   public final void a(int var1, int var2, int var3, sD var4, sD var5, int var6) {
      List var7 = this.e;

      for(int var8 = 0; var8 < var7.size(); ++var8) {
         ((aef)var7.get(var8)).a(this, var1, var2, var3, var4, var5, var6);
      }

   }

   public final void a(acV var1, sD var2, sD var3, int var4) {
      List var5 = this.e;

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         ((aef)var5.get(var6)).a(this, var1, var2, var3, var4);
      }

   }

   public final void a(int var1, int var2, int var3, int var4) {
      int var5;
      if (var3 > var4) {
         var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if (this.a.d()) {
         for(var5 = var3; var5 <= var4; ++var5) {
            this.a(adZ.SKY, var1, var5, var2);
         }
      }

      this.markBlockRangeForRenderUpdate(var1, var3, var2, var1, var4, var2);
   }

   public final void a(acV var1, acV var2) {
      this.markBlockRangeForRenderUpdate(var1.a, var1.b, var1.c, var2.a, var2.b, var2.c);
   }

   public final void markBlockRangeForRenderUpdate(int var1, int var2, int var3, int var4, int var5, int var6) {
      List var7 = this.e;

      for(int var8 = 0; var8 < var7.size(); ++var8) {
         ((aef)var7.get(var8)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public final boolean canSeeSky(int var1, int var2, int var3) {
      return this.a(var1 >> 4, var3 >> 4).a(var1, var2, var3);
   }

   public final boolean e(acV var1) {
      return this.canSeeSky(var1.a, var1.b, var1.c);
   }

   public final int getLight(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      } else {
         int var4 = this.getHeight() - 1;
         if (var2 > var4) {
            var2 = var4;
         }

         return this.a(var1 >> 4, var3 >> 4).a(var1, var2, var3, 0);
      }
   }

   public final int a(acV var1) {
      return this.getLight(var1.a, var1.b, var1.c);
   }

   public final int b(acV var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   public final int a(int var1, int var2, int var3) {
      return this.getLight(var1, var2, var3, true);
   }

   public final int getLight(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         int var5;
         if (var4 && this.a(var1, var2, var3).useNeighborBrightness()) {
            var5 = this.getLight(var1, var2 + 1, var3, false);
            int var10 = this.getLight(var1 + 1, var2, var3, false);
            int var7 = this.getLight(var1 - 1, var2, var3, false);
            int var8 = this.getLight(var1, var2, var3 + 1, false);
            int var9 = this.getLight(var1, var2, var3 - 1, false);
            if (var10 > var5) {
               var5 = var10;
            }

            if (var7 > var5) {
               var5 = var7;
            }

            if (var8 > var5) {
               var5 = var8;
            }

            if (var9 > var5) {
               var5 = var9;
            }

            return var5;
         } else if (var2 < 0) {
            return 0;
         } else {
            var5 = this.getHeight();
            if (var2 >= var5) {
               var2 = var5 - 1;
            }

            afh var6 = this.a(var1 >> 4, var3 >> 4);
            return var6.a(var1, var2, var3, this.c);
         }
      } else {
         return 15;
      }
   }

   public final int a(acV var1, boolean var2) {
      return this.getLight(var1.a, var1.b, var1.c, var2);
   }

   public final acV a(acV var1) {
      int var2 = var1.a;
      int var3 = var1.c;
      return new acV(var2, this.getHeight(var2, var3), var3);
   }

   public final int getHeight(int var1, int var2) {
      int var3;
      if (var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         var3 = this.a(var1 >> 4, var2 >> 4).a(var1 & 15, var2 & 15);
      } else {
         var3 = this.b() + 1;
      }

      return var3;
   }

   public final int getChunksLowestHorizon(int var1, int var2) {
      if (var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         afh var3 = this.a(var1 >> 4, var2 >> 4);
         return var3.a();
      } else {
         return this.b() + 1;
      }
   }

   public int a(adZ var1, int var2, int var3, int var4) {
      if (!this.a.d() && var1 == adZ.SKY) {
         return 0;
      } else {
         if (var3 < 0) {
            var3 = 0;
         }

         if (!this.e(var2, var3, var4)) {
            return var1.defaultLightValue;
         } else if (this.a(var2, var3, var4).useNeighborBrightness()) {
            int var10 = this.b(var1, var2, var3 + 1, var4);
            int var6 = this.b(var1, var2 + 1, var3, var4);
            int var7 = this.b(var1, var2 - 1, var3, var4);
            int var8 = this.b(var1, var2, var3, var4 + 1);
            int var9 = this.b(var1, var2, var3, var4 - 1);
            if (var6 > var10) {
               var10 = var6;
            }

            if (var7 > var10) {
               var10 = var7;
            }

            if (var8 > var10) {
               var10 = var8;
            }

            if (var9 > var10) {
               var10 = var9;
            }

            return var10;
         } else {
            afh var5 = this.a(var2 >> 4, var4 >> 4);
            return var5.a(var1, var2, var3, var4);
         }
      }
   }

   public final int a(adZ var1, acV var2) {
      return this.a(var1, var2.a, var2.b, var2.c);
   }

   public final int b(adZ var1, int var2, int var3, int var4) {
      var3 = Math.max(var3, 0);
      if (!this.e(var2, var3, var4)) {
         return var1.defaultLightValue;
      } else {
         afh var5 = this.a(var2 >> 4, var4 >> 4);
         return var5.a(var1, var2, var3, var4);
      }
   }

   public final int b(adZ var1, acV var2) {
      return this.b(var1, var2.a, var2.b, var2.c);
   }

   public final void a(adZ var1, int var2, int var3, int var4, int var5) {
      if (this.e(var2, var3, var4)) {
         afh var6 = this.a(var2 >> 4, var4 >> 4);
         var6.a(var1, var2, var3, var4, var5);
         this.b(var2, var3, var4);
      }

   }

   public final void a(adZ var1, acV var2, int var3) {
      this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   public final void b(int var1, int var2, int var3) {
      List var4 = this.e;

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         ((aef)var4.get(var5)).a(var1, var2, var3);
      }

   }

   public final void a(acV var1) {
      this.b(var1.a, var1.b, var1.c);
   }

   public int getCombinedLight(int var1, int var2, int var3, int var4) {
      int var5 = this.a(adZ.SKY, var1, var2, var3);
      int var6 = this.a(adZ.BLOCK, var1, var2, var3);
      if (var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public final int a(acV var1, int var2) {
      return this.getCombinedLight(var1.a, var1.b, var1.c, var2);
   }

   public final int a(double var1, double var3, double var5, int var7) {
      return this.getCombinedLight(adh.b(var1), adh.b(var3), adh.b(var5), var7);
   }

   public float getLightBrightness(int var1, int var2, int var3) {
      return this.a.a()[this.a(var1, var2, var3)];
   }

   public final float a(double var1, double var3, double var5) {
      return this.getLightBrightness(adh.b(var1), adh.b(var3), adh.b(var5));
   }

   public float a(acV var1) {
      return this.getLightBrightness(var1.a, var1.b, var1.c);
   }

   public sD a(int var1, int var2, int var3) {
      if (this.a(var2)) {
         return afh.a;
      } else {
         afh var4 = this.a(var1 >> 4, var3 >> 4);
         return var4.a(var1, var2, var3);
      }
   }

   public sD a(double var1, double var3, double var5) {
      return this.a(adh.b(var1), adh.b(var3), adh.b(var5));
   }

   public sD a(acV var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   public sD a(NN var1) {
      return this.a(var1.d, var1.e, var1.f);
   }

   public boolean b() {
      return this.c < 4;
   }

   public adi a(adm var1, adm var2) {
      return this.a((adi)null, var1, var2, false, false, false);
   }

   public adi a(adm var1, adm var2, boolean var3) {
      return this.a((adi)null, var1, var2, var3, false, false);
   }

   public adi a(adi var1, adm var2, adm var3) {
      return this.a(var1, var2, var3, false, false, false);
   }

   public adi a(adi var1, adm var2, adm var3, boolean var4) {
      return this.a(var1, var2, var3, var4, false, false);
   }

   public adi a(adm var1, adm var2, boolean var3, boolean var4, boolean var5) {
      return this.a((adi)null, var1, var2, var3, var4, var5);
   }

   public adi a(adi var1, adm var2, adm var3, boolean var4, boolean var5, boolean var6) {
      if (!var2.a() && !var3.a()) {
         int var7 = adh.b(var3.a);
         int var8 = adh.b(var3.b);
         int var9 = adh.b(var3.c);
         int var10 = adh.b(var2.a);
         int var11 = adh.b(var2.b);
         int var12 = adh.b(var2.c);
         sD var13 = this.a(var10, var11, var12);
         nh var14 = var13.a();
         adi var15;
         if ((!var5 || var13.a(this, var10, var11, var12) != mY.c) && var14.a(var13, var4)) {
            var15 = var13.a(this, var10, var11, var12, var2, var3);
            if (var15 != null) {
               return adi.a(var15, var1);
            }
         }

         var15 = null;
         int var16 = 200;
         var2 = var2.d();

         while(true) {
            abP var38;
            sD var39;
            nh var40;
            do {
               if (var16-- < 0) {
                  return var6 ? adi.a(var15, var1) : null;
               }

               if (var2.a()) {
                  return null;
               }

               if (var10 == var7 && var11 == var8 && var12 == var9) {
                  return var6 ? var15 : null;
               }

               boolean var17 = true;
               boolean var18 = true;
               boolean var19 = true;
               double var20 = 999.0D;
               double var22 = 999.0D;
               double var24 = 999.0D;
               if (var7 > var10) {
                  var20 = (double)var10 + 1.0D;
               } else if (var7 < var10) {
                  var20 = (double)var10 + 0.0D;
               } else {
                  var17 = false;
               }

               if (var8 > var11) {
                  var22 = (double)var11 + 1.0D;
               } else if (var8 < var11) {
                  var22 = (double)var11 + 0.0D;
               } else {
                  var18 = false;
               }

               if (var9 > var12) {
                  var24 = (double)var12 + 1.0D;
               } else if (var9 < var12) {
                  var24 = (double)var12 + 0.0D;
               } else {
                  var19 = false;
               }

               double var26 = 999.0D;
               double var28 = 999.0D;
               double var30 = 999.0D;
               double var32 = var3.a - var2.a;
               double var34 = var3.b - var2.b;
               double var36 = var3.c - var2.c;
               if (var17) {
                  var26 = (var20 - var2.a) / var32;
               }

               if (var18) {
                  var28 = (var22 - var2.b) / var34;
               }

               if (var19) {
                  var30 = (var24 - var2.c) / var36;
               }

               if (var26 == -0.0D) {
                  var26 = -1.0E-4D;
               }

               if (var28 == -0.0D) {
                  var28 = -1.0E-4D;
               }

               if (var30 == -0.0D) {
                  var30 = -1.0E-4D;
               }

               if (var26 < var28 && var26 < var30) {
                  var38 = var7 > var10 ? abP.WEST : abP.EAST;
                  var2.g(var20, var2.b + var34 * var26, var2.c + var36 * var26);
               } else if (var28 < var30) {
                  var38 = var8 > var11 ? abP.DOWN : abP.UP;
                  var2.g(var2.a + var32 * var28, var22, var2.c + var36 * var28);
               } else {
                  var38 = var9 > var12 ? abP.NORTH : abP.SOUTH;
                  var2.g(var2.a + var32 * var30, var2.b + var34 * var30, var24);
               }

               var10 = adh.b(var2.a) - (var38 == abP.EAST ? 1 : 0);
               var11 = adh.b(var2.b) - (var38 == abP.UP ? 1 : 0);
               var12 = adh.b(var2.c) - (var38 == abP.SOUTH ? 1 : 0);
               var39 = this.a(var10, var11, var12);
               var40 = var39.a();
            } while(var5 && var39.a() != si.E && var39.a(this, var10, var11, var12) == mY.c);

            if (var40.a(var39, var4)) {
               adi var41 = var39.a(this, var10, var11, var12, var2, var3);
               if (var41 != null) {
                  return adi.a(var41, var1);
               }
            } else {
               var15 = adi.b(var1, adj.MISS, var2, var38, new acV(var10, var11, var12));
            }
         }
      } else {
         return null;
      }
   }

   public final void a(Rn var1, acV var2, acJ var3, acI var4, float var5, float var6) {
      this.a(var1, (double)var2.a + 0.5D, (double)var2.b + 0.5D, (double)var2.c + 0.5D, var3, var4, var5, var6);
   }

   public void a(Rn var1, double var2, double var4, double var6, acJ var8, acI var9, float var10, float var11) {
      List var12 = this.e;

      for(int var13 = 0; var13 < var12.size(); ++var13) {
         ((aef)var12.get(var13)).a(var1, var8, var9, var2, var4, var6, var10, var11);
      }

   }

   public void a(double var1, double var3, double var5, acJ var7, acI var8, float var9, float var10, boolean var11) {
   }

   public final void a(acV var1, acJ var2) {
      List var3 = this.e;

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         ((aef)var3.get(var4)).a(var2, var1);
      }

   }

   public final void a(abW var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14) {
      this.a(var1.a(), var1.a(), var2, var4, var6, var8, var10, var12, var14);
   }

   public final void a(int var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14) {
      List var15 = this.e;

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         ((aef)var15.get(var16)).a(var1, false, true, var2, var4, var6, var8, var10, var12, var14);
      }

   }

   public final void a(abW var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      this.a(var1.a(), var1.a() || var2, var3, var5, var7, var9, var11, var13, var15);
   }

   private void a(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      List var16 = this.e;

      for(int var17 = 0; var17 < var16.size(); ++var17) {
         ((aef)var16.get(var17)).a(var1, var2, var3, var5, var7, var9, var11, var13, var15);
      }

   }

   public final boolean b(NN var1) {
      return this.d.add(var1);
   }

   public boolean a(NN var1) {
      int var2 = adh.b(var1.d / 16.0D);
      int var3 = adh.b(var1.f / 16.0D);
      boolean var4 = var1.b;
      if (var1 instanceof Rn) {
         var4 = true;
      }

      if (!var4 && !this.a(var2, var3, false)) {
         return false;
      } else {
         if (var1 instanceof Rn) {
            Rn var5 = (Rn)var1;
            this.c.add(var5);
            this.a.put(var5.getName(), var5);
         }

         this.b.put(var1.getUniqueID(), var1);
         this.a(var2, var3).a(var1);
         this.b.add(var1);
         this.b(var1);
         return true;
      }
   }

   protected void b(NN var1) {
      List var2 = this.e;

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         ((aef)var2.get(var3)).a(var1);
      }

   }

   protected void c(NN var1) {
      List var2 = this.e;

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         ((aef)var2.get(var3)).b(var1);
      }

   }

   public void a(NN var1) {
      if (var1.isBeingRidden()) {
         var1.removePassengers();
      }

      if (var1.isRiding()) {
         var1.dismountRidingEntity();
      }

      var1.n();
      this.b.remove(var1.getUniqueID());
      if (var1 instanceof Rn) {
         this.c.remove(var1);
         this.a.remove(var1.getName());
         this.c(var1);
      }

   }

   public void a(aef var1) {
      this.e.add(var1);
   }

   public void b(aef var1) {
      this.e.remove(var1);
   }

   private boolean a(NN var1, acU var2, boolean var3, List<acU> var4) {
      int var5 = adh.b(var2.a) - 1;
      int var6 = adh.c(var2.d) + 1;
      int var7 = adh.b(var2.b) - 1;
      int var8 = adh.c(var2.e) + 1;
      int var9 = adh.b(var2.c) - 1;
      int var10 = adh.c(var2.f) + 1;
      afc var11 = this.a();
      boolean var12 = var1 != null && var1.p();
      boolean var13 = var1 != null && this.c(var1);
      sD var14 = RQ.b.a();

      for(int var15 = var5; var15 < var6; ++var15) {
         for(int var16 = var9; var16 < var10; ++var16) {
            boolean var17 = var15 == var5 || var15 == var6 - 1;
            boolean var18 = var16 == var9 || var16 == var10 - 1;
            if (!var17 || !var18) {
               for(int var19 = var7; var19 < var8; ++var19) {
                  if (!var17 && !var18 || var19 != var8 - 1) {
                     if (var3) {
                        if (var15 < -30000000 || var15 >= 30000000 || var16 < -30000000 || var16 >= 30000000) {
                           return true;
                        }
                     } else if (var1 != null && var12 == var13) {
                        var1.b(!var13);
                     }

                     sD var20;
                     if (!var3 && !var11.a(var15, var16) && var13) {
                        var20 = var14;
                     } else {
                        var20 = this.a(var15, var19, var16);
                     }

                     var20.a(this, var15, var19, var16, var2, var4, var1, false);
                     if (var3 && !var4.isEmpty()) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return !var4.isEmpty();
   }

   private void a(List var1, NN var2, acU var3) {
      this.a(var2, var3, false, var1);
      if (var2 != null) {
         RecyclableArrayList var4 = this.b(var2, var3.c(0.25D));

         for(int var5 = 0; var5 < var4.size(); ++var5) {
            NN var6 = (NN)var4.get(var5);
            if (!var2.h(var6)) {
               acU var7 = var6.a();
               if (var7 != null && var7.a(var3)) {
                  var1.add(var7);
               }

               var7 = var2.a(var6);
               if (var7 != null && var7.a(var3)) {
                  var1.add(var7);
               }
            }
         }

         var4.recycle();
      }

   }

   public boolean a(NN var1, acU var2, Predicate var3) {
      if (this.a(var1, var2, false, new MP())) {
         return false;
      } else {
         if (var1 != null) {
            RecyclableArrayList var4 = RecyclableArrayList.newInstance();
            this.a(var4, (NN)var1, var2.c(0.25D), var3);

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               NN var6 = (NN)var4.get(var5);
               if (!var1.h(var6)) {
                  acU var7 = var6.a();
                  if (var7 != null && var7.a(var2)) {
                     var4.recycle();
                     return false;
                  }

                  var7 = var1.a(var6);
                  if (var7 != null && var7.a(var2)) {
                     var4.recycle();
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   public boolean a(NN var1, acU var2) {
      return this.a(var1, var2, abH.e);
   }

   public RecyclableArrayList<acU> a(NN var1, acU var2) {
      RecyclableArrayList var3 = RecyclableArrayList.newInstance();
      this.a((List)var3, (NN)var1, (acU)var2);
      return var3;
   }

   public boolean c(NN var1) {
      afc var2 = this.a;
      double var3 = var2.c();
      double var5 = var2.d();
      double var7 = var2.e();
      double var9 = var2.f();
      if (var1.p()) {
         ++var3;
         ++var5;
         --var7;
         --var9;
      } else {
         --var3;
         --var5;
         ++var7;
         ++var9;
      }

      return var1.d > var3 && var1.d < var7 && var1.f > var5 && var1.f < var9;
   }

   public boolean a(acU var1) {
      int var2 = adh.b(var1.a) - 1;
      int var3 = adh.c(var1.d) + 1;
      int var4 = adh.b(var1.b) - 1;
      int var5 = adh.c(var1.e) + 1;
      int var6 = adh.b(var1.c) - 1;
      int var7 = adh.c(var1.f) + 1;
      MP var8 = new MP();

      for(int var9 = var2; var9 < var3; ++var9) {
         for(int var10 = var6; var10 < var7; ++var10) {
            boolean var11 = var9 == var2 || var9 == var3 - 1;
            boolean var12 = var10 == var6 || var10 == var7 - 1;
            if (!var11 || !var12) {
               for(int var13 = var4; var13 < var5; ++var13) {
                  if (!var11 && !var12 || var13 != var5 - 1) {
                     if (var9 < -30000000 || var9 >= 30000000 || var10 < -30000000 || var10 >= 30000000) {
                        return true;
                     }

                     sD var14 = this.a(var9, var13, var10);
                     var14.a(this, var9, var13, var10, var1, var8, (NN)null, false);
                     if (!var8.isEmpty()) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   public int a(float var1) {
      float var2 = this.b(var1);
      float var3 = 1.0F - (adh.b(var2 * 6.2831855F) * 2.0F + 0.5F);
      var3 = adh.a(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.b() * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.getThunderStrength(var1) * 5.0F) / 16.0D));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float a(float var1) {
      float var2 = this.b(var1);
      float var3 = 1.0F - (adh.b(var2 * 6.2831855F) * 2.0F + 0.2F);
      var3 = adh.a(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.b() * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.getThunderStrength(var1) * 5.0F) / 16.0D));
      return var3 * 0.8F + 0.2F;
   }

   public adm a(NN var1, float var2) {
      adm var3 = this.b(var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         float var4 = this.b(var2);
         float var5 = adh.b(var4 * 6.2831855F) * 2.0F + 0.5F;
         var5 = adh.a(var5, 0.0F, 1.0F);
         int var6 = adh.b(var1.d);
         int var7 = adh.b(var1.e);
         int var8 = adh.b(var1.f);
         aeu var9 = this.a(var6, var7, var8);
         float var10 = var9.getTemperature(var6, var7, var8);
         int var11 = var9.a(var10);
         float var12 = (float)(var11 >> 16 & 255) / 255.0F;
         float var13 = (float)(var11 >> 8 & 255) / 255.0F;
         float var14 = (float)(var11 & 255) / 255.0F;
         var12 *= var5;
         var13 *= var5;
         var14 *= var5;
         float var15 = this.b();
         float var16;
         float var17;
         if (var15 > 0.0F) {
            var16 = (var12 * 0.3F + var13 * 0.59F + var14 * 0.11F) * 0.6F;
            var17 = 1.0F - var15 * 0.75F;
            var12 = var12 * var17 + var16 * (1.0F - var17);
            var13 = var13 * var17 + var16 * (1.0F - var17);
            var14 = var14 * var17 + var16 * (1.0F - var17);
         }

         var16 = this.getThunderStrength(var2);
         if (var16 > 0.0F) {
            var17 = (var12 * 0.3F + var13 * 0.59F + var14 * 0.11F) * 0.2F;
            float var18 = 1.0F - var16 * 0.75F;
            var12 = var12 * var18 + var17 * (1.0F - var18);
            var13 = var13 * var18 + var17 * (1.0F - var18);
            var14 = var14 * var18 + var17 * (1.0F - var18);
         }

         if (this.a > 0) {
            var17 = (float)this.a - var2;
            if (var17 > 1.0F) {
               var17 = 1.0F;
            }

            var17 *= 0.45F;
            var12 = var12 * (1.0F - var17) + 0.8F * var17;
            var13 = var13 * (1.0F - var17) + 0.8F * var17;
            var14 = var14 * (1.0F - var17) + var17;
         }

         return this.a.g((double)var12, (double)var13, (double)var14);
      }
   }

   public float b(float var1) {
      return this.a.a(this.a.b(), var1);
   }

   public int a() {
      return this.a.a(this.a.b());
   }

   public float a() {
      return aen.a[this.a.a(this.a.b())];
   }

   public float c(float var1) {
      float var2 = this.b(var1);
      return var2 * 6.2831855F;
   }

   public adm a(float var1) {
      adm var2 = this.c(var1);
      if (var2 != null) {
         return var2;
      } else {
         float var3 = this.b(var1);
         float var4 = adh.b(var3 * 6.2831855F) * 2.0F + 0.5F;
         var4 = adh.a(var4, 0.0F, 1.0F);
         float var5 = 1.0F;
         float var6 = 1.0F;
         float var7 = 1.0F;
         float var8 = this.b();
         float var9;
         float var10;
         if (var8 > 0.0F) {
            var9 = (var5 * 0.3F + var6 * 0.59F + var7 * 0.11F) * 0.6F;
            var10 = 1.0F - var8 * 0.95F;
            var5 = var5 * var10 + var9 * (1.0F - var10);
            var6 = var6 * var10 + var9 * (1.0F - var10);
            var7 = var7 * var10 + var9 * (1.0F - var10);
         }

         var5 *= var4 * 0.9F + 0.1F;
         var6 *= var4 * 0.9F + 0.1F;
         var7 *= var4 * 0.85F + 0.15F;
         var9 = this.getThunderStrength(var1);
         if (var9 > 0.0F) {
            var10 = (var5 * 0.3F + var6 * 0.59F + var7 * 0.11F) * 0.2F;
            float var11 = 1.0F - var9 * 0.95F;
            var5 = var5 * var11 + var10 * (1.0F - var11);
            var6 = var6 * var11 + var10 * (1.0F - var11);
            var7 = var7 * var11 + var10 * (1.0F - var11);
         }

         return this.b.g((double)var5, (double)var6, (double)var7);
      }
   }

   public adm b(float var1) {
      adm var2 = this.d(var1);
      if (var2 != null) {
         return var2;
      } else {
         float var3 = this.b(var1);
         return this.a.a(var3, var1);
      }
   }

   public int a(int var1, int var2) {
      return this.a(var1 >> 4, var2 >> 4).b(var1, var2);
   }

   public acV a(int var1, int var2) {
      return this.a(var1 >> 4, var2 >> 4).a(var1, var2);
   }

   public acV b(acV var1) {
      return this.a(var1.a, var1.c);
   }

   public acV c(acV var1) {
      afh var2 = this.a(var1);

      acV var3;
      acV var4;
      for(var3 = new acV(var1.a, var2.getTopFilledSegment() + 16, var1.c); var3.b >= 0; var3 = var4) {
         var4 = var3.b();
         si var5 = var2.a(var4).a();
         if (var5.blocksMovement() && var5 != si.j) {
            break;
         }
      }

      return var3;
   }

   public float getStarBrightness(float var1) {
      float var2 = this.b(var1);
      float var3 = 1.0F - (adh.b(var2 * 6.2831855F) * 2.0F + 0.25F);
      var3 = adh.a(var3, 0.0F, 1.0F);
      return var3 * var3 * 0.5F;
   }

   public void f() {
      this.b();
      this.k();
      this.j();
      List var1 = this.g;
      if (!var1.isEmpty()) {
         this.b.removeAll(var1);
         Set var10001 = this.c;
         var1.forEach(var10001::remove);
         var1.clear();
      }

      this.e();
      this.i();
   }

   private void b() {
      List var1 = this.d;

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         NN var3 = (NN)var1.get(var2);

         try {
            ++var3.b;
            var3.a();
         } catch (Throwable var7) {
            Kn var5 = Kn.a(var7, "Ticking entity");
            Ku var6 = var5.a("Entity being ticked");
            if (var3 == null) {
               var6.a((String)"Entity", (Object)"~~NULL~~");
            } else {
               var3.a(var6);
            }

            throw new acB(var5);
         }

         if (var3.c) {
            var1.remove(var2--);
         }
      }

   }

   private void e() {
      List var1 = this.b;
      int var2 = var1.size();
      if (var2 != 0) {
         this.a = true;
         afc var3 = this.a;

         for(int var4 = 0; var4 < var2; ++var4) {
            aaD var5 = (aaD)var1.get(var4);
            int var6;
            int var7;
            if (!var5.b() && var5.a()) {
               var6 = var5.b();
               var7 = var5.d();
               if (var3.a(var6, var7)) {
                  try {
                     ((aci)var5).a();
                  } catch (Throwable var11) {
                     Kn var9 = Kn.a(var11, "Ticking block entity");
                     Ku var10 = var9.a("Block entity being ticked");
                     var5.a(var10);
                     throw new acB(var9);
                  }
               }
            }

            if (var5.b()) {
               var1.remove(var4--);
               --var2;
               this.c.remove(var5);
               var6 = var5.b();
               var7 = var5.d();
               this.a(var6 >> 4, var7 >> 4).a(var6, var5.c(), var7);
            }
         }

         this.a = false;
      }

   }

   private void i() {
      if (!this.f.isEmpty()) {
         for(int var1 = 0; var1 < this.f.size(); ++var1) {
            aaD var2 = (aaD)this.f.get(var1);
            if (!var2.b()) {
               if (!this.c.contains(var2)) {
                  this.a(var2);
               }

               int var3 = var2.b();
               int var4 = var2.d();
               int var5 = var2.c();
               afh var6 = this.a(var3 >> 4, var4 >> 4);
               sD var7 = var6.a(var3, var5, var4);
               var6.a(var3, var5, var4, var2);
               this.a(var3, var5, var4, var7, var7, 3);
            }
         }

         this.f.clear();
      }

   }

   private void j() {
      Iterator var1 = this.b.iterator();

      while(true) {
         NN var2;
         while(true) {
            if (!var1.hasNext()) {
               return;
            }

            var2 = (NN)var1.next();
            NN var3 = var2.c();
            if (var3 == null) {
               break;
            }

            if (var3.c || !var3.g(var2)) {
               var2.dismountRidingEntity();
               break;
            }
         }

         if (!var2.c) {
            try {
               this.g(var2);
            } catch (Throwable var7) {
               Kn var5 = Kn.a(var7, "Ticking entity");
               Ku var6 = var5.a("Entity being ticked");
               var2.a(var6);
               throw new acB(var5);
            }
         }

         this.a(var2, var1);
      }
   }

   private void a(NN var1, Iterator<NN> var2) {
      if (var1.c) {
         if (var1.g) {
            int var3 = var1.d;
            int var4 = var1.f;
            afh var5 = this.a(var3, var4);
            if (var5 != null) {
               var5.b(var1);
            }
         }

         var2.remove();
         this.c(var1);
      }

   }

   private void k() {
      List var1 = this.a;
      if (!var1.isEmpty()) {
         this.b.removeAll(var1);

         int var2;
         for(var2 = 0; var2 < var1.size(); ++var2) {
            NN var3 = (NN)var1.get(var2);
            if (var3.g) {
               int var4 = var3.d;
               int var5 = var3.f;
               afh var6 = this.a(var4, var5);
               if (var6 != null) {
                  var6.b(var3);
               }
            }
         }

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.c((NN)var1.get(var2));
         }

         var1.clear();
      }

   }

   public boolean a(aaD var1) {
      boolean var2 = this.c.add(var1);
      if (var2 && var1 instanceof aci) {
         this.b.add(var1);
      }

      int var3 = var1.b();
      int var4 = var1.c();
      int var5 = var1.d();
      sD var6 = this.a(var3, var4, var5);
      this.a(var3, var4, var5, var6, var6, 2);
      return var2;
   }

   public void a(Collection<aaD> var1) {
      if (!var1.isEmpty()) {
         if (this.a) {
            this.f.addAll(var1);
         } else {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               aaD var3 = (aaD)var2.next();
               this.a(var3);
            }
         }

      }
   }

   public void g(NN var1) {
      this.a(var1, true);
   }

   public void a(NN var1, boolean var2) {
      var1.g = var1.d;
      var1.h = var1.e;
      var1.i = var1.f;
      var1.l = var1.j;
      var1.m = var1.k;
      if (var2 && var1.g) {
         ++var1.b;
         if (var1.isRiding()) {
            var1.j();
         } else {
            var1.a();
         }
      }

      if (Double.isNaN(var1.d) || Double.isInfinite(var1.d)) {
         var1.d = var1.g;
      }

      if (Double.isNaN(var1.e) || Double.isInfinite(var1.e)) {
         var1.e = var1.h;
      }

      if (Double.isNaN(var1.f) || Double.isInfinite(var1.f)) {
         var1.f = var1.i;
      }

      if (Double.isNaN((double)var1.k) || Double.isInfinite((double)var1.k)) {
         var1.k = var1.m;
      }

      if (Double.isNaN((double)var1.j) || Double.isInfinite((double)var1.j)) {
         var1.j = var1.l;
      }

      int var3 = adh.b(var1.d / 16.0D);
      int var4 = adh.b(var1.e / 16.0D);
      int var5 = adh.b(var1.f / 16.0D);
      boolean var6 = true;
      afh var7;
      if (var1.g) {
         if (var1.d == var3 && var1.f == var5) {
            var6 = false;
            var7 = this.a(var3, var5);
            if (var7.isEmpty()) {
               var1.g = false;
            } else if (var1.e != var4) {
               var7.b(var1, var1.e);
               var7.a(var1, var4);
               var1.e = var4;
            }
         } else {
            var1.g = false;
            var7 = this.a(var1.d, var1.f);
            var7.b(var1);
         }
      }

      if (var6) {
         var7 = this.a(var3, var5);
         if (!var7.isEmpty()) {
            var1.g = true;
            var7.a(var1);
         }
      }

      if (var2 && var1.g) {
         RecyclableArrayList var11 = var1.a();
         if (var11 != null) {
            int var8 = 0;

            for(int var9 = var11.size(); var8 < var9; ++var8) {
               NN var10 = (NN)var11.get(var8);
               if (!var10.c && var10.c() == var1) {
                  this.g(var10);
               } else {
                  var10.dismountRidingEntity();
               }
            }

            var11.recycle();
         }
      }

   }

   public boolean b(acU var1) {
      return this.a((acU)var1, (NN)null);
   }

   public boolean a(acU var1, NN var2) {
      RecyclableArrayList var3 = this.b((NN)null, (acU)var1);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         NN var5 = (NN)var3.get(var4);
         if (!var5.c && var5.a && var5 != var2 && (var2 == null || var5.h(var2))) {
            var3.recycle();
            return false;
         }
      }

      var3.recycle();
      return true;
   }

   public boolean c(acU var1) {
      int var2 = adh.b(var1.a);
      int var3 = adh.c(var1.d);
      int var4 = adh.b(var1.b);
      int var5 = adh.c(var1.e);
      int var6 = adh.b(var1.c);
      int var7 = adh.c(var1.f);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               sD var11 = this.a(var8, var9, var10);
               if (var11.a() != si.a) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean d(acU var1) {
      int var2 = adh.b(var1.a);
      int var3 = adh.c(var1.d);
      int var4 = adh.b(var1.b);
      int var5 = adh.c(var1.e);
      int var6 = adh.b(var1.c);
      int var7 = adh.c(var1.f);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               sD var11 = this.a(var8, var9, var10);
               if (var11.a().isLiquid()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean e(acU var1) {
      int var2 = adh.b(var1.a);
      int var3 = adh.c(var1.d);
      int var4 = adh.b(var1.b);
      int var5 = adh.c(var1.e);
      int var6 = adh.b(var1.c);
      int var7 = adh.c(var1.f);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               nh var11 = this.a(var8, var9, var10).a();
               if (var11 == RQ.a || var11 == RQ.b || var11 == RQ.b) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(acU var1, si var2, NN var3) {
      int var4 = adh.b(var1.a);
      int var5 = adh.c(var1.d);
      int var6 = adh.b(var1.b);
      int var7 = adh.c(var1.e);
      int var8 = adh.b(var1.c);
      int var9 = adh.c(var1.f);
      boolean var10 = false;
      adm var11 = adm.a;

      for(int var12 = var4; var12 < var5; ++var12) {
         for(int var13 = var6; var13 < var7; ++var13) {
            for(int var14 = var8; var14 < var9; ++var14) {
               sD var15 = this.a(var12, var13, var14);
               nh var16 = var15.a();
               if (var15.a() == var2) {
                  double var17 = (double)((float)(var13 + 1) - pj.a((Integer)var15.a((so)pj.a)));
                  if ((double)var7 >= var17) {
                     var10 = true;
                     var11 = var16.a(this, var12, var13, var14, var3, var11);
                  }
               }
            }
         }
      }

      if (var11.length() > 0.0D && var3.o()) {
         var11 = var11.a();
         var3.a.a(var3.a.a() + var11.a * iM.a(iM.a(-7404330148876522082L) ^ iM.a(iM.a(6435040245605399320L) ^ -1L)));
         var3.b.a(var3.b.a() + var11.b * iM.a(iM.a(5494132130162921123L) ^ iM.a(iM.a(-8337209748920018907L) ^ -1L)));
         var3.c.a(var3.c.a() + var11.c * iM.a(iM.a(2280716337355708533L) ^ iM.a(iM.a(-2317690680268468493L) ^ -1L)));
      }

      return var10;
   }

   public boolean a(acU var1, si var2) {
      int var3 = adh.b(var1.a);
      int var4 = adh.c(var1.d);
      int var5 = adh.b(var1.b);
      int var6 = adh.c(var1.e);
      int var7 = adh.b(var1.c);
      int var8 = adh.c(var1.f);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               if (this.a(var9, var10, var11).a() == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(Rn var1, acV var2, abP var3) {
      var2 = var2.a(var3);
      if (this.a(var2).a() == RQ.a) {
         this.a(var1, 1009, var2, 0);
         this.c(var2);
         return true;
      } else {
         return false;
      }
   }

   public String a() {
      return "All: " + this.b.size();
   }

   public String b() {
      return this.a.a();
   }

   public aaD a(int var1, int var2, int var3) {
      if (this.a(var2)) {
         return null;
      } else {
         aaD var4 = null;
         if (this.a) {
            var4 = this.b(var1, var2, var3);
         }

         if (var4 == null) {
            afh var5 = this.a(var1 >> 4, var3 >> 4);
            var4 = var5.a(var1, var2, var3, afj.IMMEDIATE);
         }

         if (var4 == null) {
            var4 = this.b(var1, var2, var3);
         }

         return var4;
      }
   }

   public aaD a(acV var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   private aaD b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.f.size(); ++var4) {
         aaD var5 = (aaD)this.f.get(var4);
         if (!var5.b() && var1 == var5.b() && var2 == var5.c() && var3 == var5.d()) {
            return var5;
         }
      }

      return null;
   }

   private aaD b(acV var1) {
      return this.b(var1.a, var1.b, var1.c);
   }

   public void a(int var1, int var2, int var3, aaD var4) {
      if (!this.a(var2) && var4 != null && !var4.b()) {
         if (this.a) {
            var4.a(var1, var2, var3);
            Iterator var5 = this.f.iterator();

            while(var5.hasNext()) {
               aaD var6 = (aaD)var5.next();
               if (var6.b() == var1 & var6.c() == var2 && var6.d() == var3) {
                  var6.c();
                  var5.remove();
               }
            }

            this.f.add(var4);
         } else {
            this.a(var1 >> 4, var3 >> 4).a(var1, var2, var3, var4);
            this.a(var4);
         }
      }

   }

   public void a(acV var1, aaD var2) {
      this.a(var1.a, var1.b, var1.c, var2);
   }

   public void c(int var1, int var2, int var3) {
      aaD var4 = this.a(var1, var2, var3);
      if (var4 != null && this.a) {
         var4.c();
         this.f.remove(var4);
      } else {
         if (var4 != null) {
            this.f.remove(var4);
            this.c.remove(var4);
            this.b.remove(var4);
         }

         this.a(var1 >> 4, var3 >> 4).a(var1, var2, var3);
      }

   }

   public void b(acV var1) {
      this.c(var1.a, var1.b, var1.c);
   }

   public void b(Collection<aaD> var1) {
      this.g.addAll(var1);
   }

   public void a(aaD var1) {
      this.g.add(var1);
   }

   public boolean b(int var1, int var2, int var3) {
      acU var4 = this.a(var1, var2, var3).a(this, var1, var2, var3);
      return var4 != mY.c && var4.getAverageEdgeLength() >= 1.0D;
   }

   public boolean f(acV var1) {
      return this.b(var1.a, var1.b, var1.c);
   }

   public boolean a(int var1, int var2, int var3, boolean var4) {
      if (this.a(var2)) {
         return false;
      } else {
         afh var5 = this.a.a(var1 >> 4, var3 >> 4);
         if (var5 == null) {
            return var4;
         } else {
            sD var6 = this.a(var1, var2, var3);
            return var6.a().isOpaque() && var6.isFullCube();
         }
      }
   }

   public boolean b(acV var1, boolean var2) {
      return this.a(var1.a, var1.b, var1.c, var2);
   }

   public void g() {
      int var1 = this.a(1.0F);
      this.c = var1;
   }

   public void a() {
   }

   protected void h() {
      if (this.a.a()) {
         this.a = 1.0F;
      }

   }

   protected void a(afh var1) {
      var1.e();
   }

   protected void c() {
   }

   public boolean b(int var1, int var2, int var3, boolean var4) {
      aeu var5 = this.a(var1, var2, var3);
      float var6 = var5.getTemperature(var1, var2, var3);
      if (var6 >= 0.15F) {
         return false;
      } else if (!var4) {
         return true;
      } else if (var2 >= 0 && var2 < this.getHeight() && this.b(adZ.BLOCK, var1, var2, var3) < 10) {
         sD var7 = this.a(var1, var2, var3);
         return var7.a() == si.a && RQ.aa.a(this, var1, var2, var3);
      } else {
         return false;
      }
   }

   public boolean c(acV var1, boolean var2) {
      return this.b(var1.a, var1.b, var1.c, var2);
   }

   public boolean c(int var1, int var2, int var3) {
      boolean var4 = false;
      if (this.a.d()) {
         var4 = this.a(adZ.SKY, var1, var2, var3);
      }

      var4 |= this.a(adZ.BLOCK, var1, var2, var3);
      return var4;
   }

   public boolean g(acV var1) {
      return this.c(var1.a, var1.b, var1.c);
   }

   private int a(int var1, int var2, int var3, adZ var4) {
      if (var4 == adZ.SKY && this.canSeeSky(var1, var2, var3)) {
         return 15;
      } else {
         sD var5 = this.a(var1, var2, var3);
         int var6 = var4 == adZ.SKY ? 0 : var5.getLightValue();
         int var7 = var5.getLightOpacity();
         if (var7 < 1) {
            var7 = 1;
         }

         if (var7 >= 15) {
            return 0;
         } else if (var6 >= 14) {
            return var6;
         } else {
            abP[] var8 = abP.VALUES;
            int var9 = var8.length;

            for(int var10 = 0; var10 < var9; ++var10) {
               abP var11 = var8[var10];
               int var12 = var1 + var11.getXOffset();
               int var13 = var2 + var11.getYOffset();
               int var14 = var3 + var11.getZOffset();
               int var15 = this.b(var4, var12, var13, var14) - var7;
               if (var15 > var6) {
                  var6 = var15;
               }

               if (var6 >= 14) {
                  return var6;
               }
            }

            return var6;
         }
      }
   }

   private int a(acV var1, adZ var2) {
      return this.a(var1.a, var1.b, var1.c, var2);
   }

   public boolean a(adZ var1, int var2, int var3, int var4) {
      if (!this.a(var2, var3, var4, 17, false)) {
         return false;
      } else {
         int var5 = 0;
         int var6 = 0;
         int var7 = this.b(var1, var2, var3, var4);
         int var8 = this.a(var2, var3, var4, var1);
         int[] var9 = this.a;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         if (var8 > var7) {
            var9[var6++] = 133152;
         } else if (var8 < var7) {
            var9[var6++] = 133152 | var7 << 18;

            label88:
            while(true) {
               do {
                  do {
                     do {
                        if (var5 >= var6) {
                           var5 = 0;
                           break label88;
                        }

                        var10 = var9[var5++];
                        var11 = (var10 & 63) - 32 + var2;
                        var12 = (var10 >> 6 & 63) - 32 + var3;
                        var13 = (var10 >> 12 & 63) - 32 + var4;
                        var14 = var10 >> 18 & 15;
                        var15 = this.b(var1, var11, var12, var13);
                     } while(var15 != var14);

                     this.a(var1, var11, var12, var13, 0);
                  } while(var14 <= 0);

                  var16 = Math.abs(var11 - var2);
                  var17 = Math.abs(var12 - var3);
                  var18 = Math.abs(var13 - var4);
               } while(var16 + var17 + var18 >= 17);

               abP[] var19 = abP.VALUES;
               int var20 = var19.length;

               for(int var21 = 0; var21 < var20; ++var21) {
                  abP var22 = var19[var21];
                  int var23 = var11 + var22.getXOffset();
                  int var24 = var12 + var22.getYOffset();
                  int var25 = var13 + var22.getZOffset();
                  int var26 = Math.max(1, this.a(var23, var24, var25).getLightOpacity());
                  var15 = this.b(var1, var23, var24, var25);
                  if (var15 == var14 - var26 && var6 < var9.length) {
                     var9[var6++] = var23 - var2 + 32 | var24 - var3 + 32 << 6 | var25 - var4 + 32 << 12 | var14 - var26 << 18;
                  }
               }
            }
         }

         while(var5 < var6) {
            var10 = var9[var5++];
            var11 = (var10 & 63) - 32 + var2;
            var12 = (var10 >> 6 & 63) - 32 + var3;
            var13 = (var10 >> 12 & 63) - 32 + var4;
            var14 = this.b(var1, var11, var12, var13);
            var15 = this.a(var11, var12, var13, var1);
            if (var15 != var14) {
               this.a(var1, var11, var12, var13, var15);
               if (var15 > var14) {
                  var16 = Math.abs(var11 - var2);
                  var17 = Math.abs(var12 - var3);
                  var18 = Math.abs(var13 - var4);
                  boolean var27 = var6 < var9.length - 6;
                  if (var16 + var17 + var18 < 17 && var27) {
                     if (this.b(var1, var11 - 1, var12, var13) < var15) {
                        var9[var6++] = var11 - 1 - var2 + 32 + (var12 - var3 + 32 << 6) + (var13 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var11 + 1, var12, var13) < var15) {
                        var9[var6++] = var11 + 1 - var2 + 32 + (var12 - var3 + 32 << 6) + (var13 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var11, var12 - 1, var13) < var15) {
                        var9[var6++] = var11 - var2 + 32 + (var12 - 1 - var3 + 32 << 6) + (var13 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var11, var12 + 1, var13) < var15) {
                        var9[var6++] = var11 - var2 + 32 + (var12 + 1 - var3 + 32 << 6) + (var13 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var11, var12, var13 - 1) < var15) {
                        var9[var6++] = var11 - var2 + 32 + (var12 - var3 + 32 << 6) + (var13 - 1 - var4 + 32 << 12);
                     }

                     if (this.b(var1, var11, var12, var13 + 1) < var15) {
                        var9[var6++] = var11 - var2 + 32 + (var12 - var3 + 32 << 6) + (var13 + 1 - var4 + 32 << 12);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   public boolean a(adZ var1, acV var2) {
      return this.a(var1, var2.a, var2.b, var2.c);
   }

   public RecyclableArrayList<NN> b(NN var1, acU var2) {
      return this.a(var1, var2, abH.e);
   }

   public RecyclableArrayList<NN> a(NN var1, acU var2, Predicate<? super NN> var3) {
      return (RecyclableArrayList)this.a(RecyclableArrayList.newInstance(), (NN)var1, var2, var3);
   }

   private <T extends List> T a(T var1, NN var2, acU var3, Predicate<? super NN> var4) {
      int var5 = adh.b((var3.a - 2.0D) / 16.0D);
      int var6 = adh.b((var3.d + 2.0D) / 16.0D);
      int var7 = adh.b((var3.c - 2.0D) / 16.0D);
      int var8 = adh.b((var3.f + 2.0D) / 16.0D);

      for(int var9 = var5; var9 <= var6; ++var9) {
         for(int var10 = var7; var10 <= var8; ++var10) {
            this.a(var9, var10).a(var2, var3, var1, var4);
         }
      }

      return var1;
   }

   public <T extends NN> RecyclableArrayList<T> a(Class<? extends T> var1, acU var2) {
      return this.a(var1, var2, abH.e);
   }

   public <T extends NN> RecyclableArrayList<T> a(Class<? extends T> var1, acU var2, Predicate<? super T> var3) {
      return (RecyclableArrayList)this.a(RecyclableArrayList.newInstance(), (Class)var1, var2, var3);
   }

   public <A extends List> A a(A var1, Class var2, acU var3, Predicate var4) {
      int var5 = adh.b((var3.a - 2.0D) / 16.0D);
      int var6 = adh.c((var3.d + 2.0D) / 16.0D);
      int var7 = adh.b((var3.c - 2.0D) / 16.0D);
      int var8 = adh.c((var3.f + 2.0D) / 16.0D);

      for(int var9 = var5; var9 < var6; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            this.a(var9, var10).a(var2, var3, var1, var4);
         }
      }

      return var1;
   }

   public <T extends NN> T a(Class<? extends T> var1, acU var2, T var3) {
      RecyclableArrayList var4 = this.a(var1, var2);
      NN var5 = null;
      double var6 = Double.MAX_VALUE;

      for(int var8 = 0; var8 < var4.size(); ++var8) {
         NN var9 = (NN)var4.get(var8);
         if (var9 != var3 && abH.e.test(var9)) {
            double var10 = var3.a(var9);
            if (var10 <= var6) {
               var5 = var9;
               var6 = var10;
            }
         }
      }

      var4.recycle();
      return var5;
   }

   public NN a(int var1) {
      return (NN)this.a.get(var1);
   }

   public Set<NN> a() {
      return this.b;
   }

   public void c(Collection<NN> var1) {
      this.b.addAll(var1);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         NN var3 = (NN)var2.next();
         this.b(var3);
      }

   }

   public void a(List<NN> var1) {
      this.b.addAll(var1);
      int var2 = 0;

      for(int var3 = var1.size(); var2 < var3; ++var2) {
         this.b((NN)var1.get(var2));
      }

   }

   public void d(Collection<NN> var1) {
      this.a.addAll(var1);
   }

   public boolean a(nh var1, acV var2, boolean var3, abP var4, NN var5) {
      sD var6 = this.a(var2);
      acU var7 = var3 ? null : var1.a().a(this, var2);
      if (var7 != mY.c && !this.a(var7.a(var2), var5)) {
         return false;
      } else if (var6.a() == si.q && var1 == RQ.bi) {
         return true;
      } else {
         return var6.a().isReplaceable() && var1.a(this, var2.a, var2.b, var2.c, var4);
      }
   }

   public int b() {
      return this.b;
   }

   public void a(int var1) {
      this.b = var1;
   }

   public int a(int var1, int var2, int var3, abP var4) {
      return this.a(var1, var2, var3).b(this, var1, var2, var3, var4);
   }

   public int a(acV var1, abP var2) {
      return this.a(var1.a, var1.b, var1.c, var2);
   }

   public aet a() {
      return this.a.a();
   }

   public int b(int var1, int var2, int var3) {
      byte var4 = 0;
      int var5 = Math.max(var4, this.a(var1, var2 - 1, var3, abP.DOWN));
      if (var5 >= 15) {
         return var5;
      } else {
         var5 = Math.max(var5, this.a(var1, var2 + 1, var3, abP.UP));
         if (var5 >= 15) {
            return var5;
         } else {
            var5 = Math.max(var5, this.a(var1, var2, var3 - 1, abP.NORTH));
            if (var5 >= 15) {
               return var5;
            } else {
               var5 = Math.max(var5, this.a(var1, var2, var3 + 1, abP.SOUTH));
               if (var5 >= 15) {
                  return var5;
               } else {
                  var5 = Math.max(var5, this.a(var1 - 1, var2, var3, abP.WEST));
                  if (var5 >= 15) {
                     return var5;
                  } else {
                     var5 = Math.max(var5, this.a(var1 + 1, var2, var3, abP.EAST));
                     return var5 >= 15 ? var5 : var5;
                  }
               }
            }
         }
      }
   }

   public int c(acV var1) {
      return this.b(var1.a, var1.b, var1.c);
   }

   public boolean a(acV var1, abP var2) {
      return this.b(var1, var2) > 0;
   }

   public int b(int var1, int var2, int var3, abP var4) {
      sD var5 = this.a(var1, var2, var3);
      return var5.isNormalCube() ? this.b(var1, var2, var3) : var5.a(this, var1, var2, var3, var4);
   }

   public int b(acV var1, abP var2) {
      return this.b(var1.a, var1.b, var1.c, var2);
   }

   public boolean d(int var1, int var2, int var3) {
      if (this.b(var1, var2 - 1, var3, abP.DOWN) > 0) {
         return true;
      } else if (this.b(var1, var2 + 1, var3, abP.UP) > 0) {
         return true;
      } else if (this.b(var1, var2, var3 - 1, abP.NORTH) > 0) {
         return true;
      } else if (this.b(var1, var2, var3 + 1, abP.SOUTH) > 0) {
         return true;
      } else if (this.b(var1 - 1, var2, var3, abP.WEST) > 0) {
         return true;
      } else {
         return this.b(var1 + 1, var2, var3, abP.EAST) > 0;
      }
   }

   public boolean h(acV var1) {
      return this.d(var1.a, var1.b, var1.c);
   }

   public int d(acV var1) {
      int var2 = 0;
      abP[] var3 = abP.VALUES;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         abP var6 = var3[var5];
         int var7 = this.b(var1.a(var6), var6);
         if (var7 >= 15) {
            return 15;
         }

         if (var7 > var2) {
            var2 = var7;
         }
      }

      return var2;
   }

   public Rn a(NN var1, double var2) {
      return this.a(var1.d, var1.e, var1.f, var2, false);
   }

   public Rn a(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate var10 = var9 ? abH.d : abH.e;
      return this.a(var1, var3, var5, var7, var10);
   }

   public Rn a(double var1, double var3, double var5, double var7, Predicate<NN> var9) {
      double var10 = -1.0D;
      Rn var12 = null;

      for(int var13 = 0; var13 < this.c.size(); ++var13) {
         Rn var14 = (Rn)this.c.get(var13);
         if (var9.test(var14)) {
            double var15 = var14.a(var1, var3, var5);
            if ((var7 < 0.0D || var15 < var7 * var7) && (var10 == -1.0D || var15 < var10)) {
               var10 = var15;
               var12 = var14;
            }
         }
      }

      return var12;
   }

   public boolean a(double var1, double var3, double var5, double var7) {
      for(int var9 = 0; var9 < this.c.size(); ++var9) {
         Rn var10 = (Rn)this.c.get(var9);
         if (abH.e.test(var10)) {
            double var11 = var10.a(var1, var3, var5);
            if (var7 < 0.0D || var11 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   public Rn a(String var1) {
      return (Rn)this.a.get(var1);
   }

   public Rn a(UUID var1) {
      NN var2 = (NN)this.b.get(var1);
      return var2 instanceof Rn ? (Rn)var2 : null;
   }

   public NN a(UUID var1) {
      return (NN)this.b.get(var1);
   }

   public void d() {
   }

   public void b(long var1) {
      this.a.a(var1);
   }

   public long a() {
      return this.a.a();
   }

   public long b() {
      return this.a.b();
   }

   public void a(long var1) {
      this.a.b(var1);
   }

   public acV a() {
      return this.a.a();
   }

   public afn b() {
      return this.a;
   }

   public void a(int var1, int var2, int var3, nh var4, int var5, int var6) {
      this.a(var1, var2, var3).a(this, var1, var2, var3, var5, var6);
   }

   public void a(acV var1, nh var2, int var3, int var4) {
      this.a(var1).a(this, var1, var3, var4);
   }

   public afF a() {
      return this.a;
   }

   public float getThunderStrength(float var1) {
      return this.b * this.b();
   }

   public void setThunderStrength(float var1) {
      this.b = var1;
   }

   public float b() {
      return this.a;
   }

   public void setRainStrength(float var1) {
      this.a = var1;
   }

   public boolean isThundering() {
      return (double)this.getThunderStrength(1.0F) > 0.9D;
   }

   public boolean isRaining() {
      return (double)this.b() > 0.2D;
   }

   public boolean isRainingAt(int var1, int var2, int var3) {
      if (!this.isRaining()) {
         return false;
      } else if (!this.canSeeSky(var1, var2, var3)) {
         return false;
      } else if (this.a(var1, var3) > var2) {
         return false;
      } else {
         aeu var4 = this.a(var1, var2, var3);
         if (var4.b()) {
            return false;
         } else {
            return !this.b(var1, var2, var3, false) && var4.canRain();
         }
      }
   }

   public boolean i(acV var1) {
      return this.isRainingAt(var1.a, var1.b, var1.c);
   }

   public boolean j(acV var1) {
      aeu var2 = this.a(var1);
      return var2.isHighHumidity();
   }

   public void a(String var1, afL var2) {
      this.a.a(var1, var2);
   }

   public afL a(Class<? extends afL> var1, String var2) {
      return this.a.a(var1, var2);
   }

   public int a(String var1) {
      return this.a.a(var1);
   }

   public void a(int var1, acV var2, int var3) {
      List var4 = this.e;

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         ((aef)var4.get(var5)).a(var1, var2, var3);
      }

   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.a((Rn)null, var1, var2, var3, var4, var5);
   }

   public void b(int var1, acV var2, int var3) {
      this.a((Rn)null, var1, var2, var3);
   }

   public void a(Rn var1, int var2, int var3, int var4, int var5, int var6) {
      List var7 = this.e;

      try {
         for(int var8 = 0; var8 < var7.size(); ++var8) {
            ((aef)var7.get(var8)).a(var1, var2, var3, var4, var5, var6);
         }

      } catch (Throwable var11) {
         Kn var9 = Kn.a(var11, "Playing level event");
         Ku var10 = var9.a("Level event being played");
         var10.a((String)"Block coordinates", (Object)Ku.a(new acV(var3, var4, var5)));
         var10.a((String)"Event source", (Object)var1);
         var10.a((String)"Event type", (Object)var2);
         var10.a((String)"Event data", (Object)var6);
         throw new acB(var9);
      }
   }

   public void a(Rn var1, int var2, acV var3, int var4) {
      this.a(var1, var2, var3.a, var3.b, var3.c, var4);
   }

   public double getHorizon() {
      return this.a.a() == aet.b ? 0.0D : 63.0D;
   }

   public Ku a(Kn var1) {
      Ku var2 = var1.a("Affected level", 1);
      var2.a((String)"Level name", (Object)(this.a == null ? "????" : this.a.a()));
      var2.a((String)"All players", (KB)(new ael(this)));
      var2.a((String)"Chunk stats", (KB)(new aem(this)));

      try {
         this.a.a(var2);
      } catch (Throwable var4) {
         var2.a("Level Data Unobtainable", var4);
      }

      return var2;
   }

   public void c(int var1, acV var2, int var3) {
      List var4 = this.e;

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         aef var6 = (aef)var4.get(var5);
         var6.b(var1, var2, var3);
      }

   }

   public Calendar a() {
      Calendar var1 = this.a;
      if (this.a() % 600L == 0L) {
         var1.setTimeInMillis(System.currentTimeMillis());
      }

      return var1;
   }

   public void a(double var1, double var3, double var5, double var7, double var9, double var11, VR var13) {
   }

   public aao a() {
      return this.a;
   }

   public adW a(acV var1) {
      return this.a(var1.a, var1.c);
   }

   public adW a(int var1, int var2) {
      long var3 = 0L;
      float var5 = 0.0F;
      var5 = this.a();
      return new adW(this.a(), this.b(), var3, var5);
   }

   public adY a() {
      return this.a().a();
   }

   public int c() {
      return this.c;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public int d() {
      return this.a;
   }

   public void c(int var1) {
      this.a = var1;
   }

   public afc a() {
      return this.a;
   }

   public int e() {
      return this.a.e() / 16;
   }

   public int f() {
      return this.getHeight() * 16;
   }

   public void a(Ws<?> var1) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   protected adm b(NN var1, float var2) {
      DimensionData var3 = asE.a;
      if (var3 == null) {
         return null;
      } else {
         V3 var4 = var3.getSkyColor();
         return var4 == null ? null : this.a.g(var4.getX(), var4.getY(), var4.getZ());
      }
   }

   protected adm c(float var1) {
      DimensionData var2 = asE.a;
      if (var2 == null) {
         return null;
      } else {
         V3 var3 = var2.getCloudColor();
         return var3 == null ? null : this.b.g(var3.getX(), var3.getY(), var3.getZ());
      }
   }

   protected adm d(float var1) {
      DimensionData var2 = asE.a;
      if (var2 == null) {
         return null;
      } else {
         V3 var3 = var2.getFogColor();
         return var3 == null ? null : this.a.a.g(var3.getX(), var3.getY(), var3.getZ());
      }
   }

   public boolean spawnEntity(Entity var1) {
      return this.a((NN)var1);
   }

   public void removeEntity(Entity var1) {
      this.a((NN)var1);
   }

   public TileEntity getTileEntity(int var1, int var2, int var3) {
      return (TileEntity)this.a(var1, var2, var3);
   }

   public ChunkProvider getChunkProvider() {
      return (ChunkProvider)this.a;
   }

   public void spawnParticle(ParticleType var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      this.a((abW)d.a(var1), var2, var3, var5, var7, var9, var11, var13, var15);
   }

   public void playSound(double var1, double var3, double var5, SoundEvent var7, SoundCategory var8, float var9, float var10, boolean var11) {
      this.a(var1, var3, var5, (acJ)d.a(var7), (acI)d.a(var8), var9, var10, var11);
   }

   public boolean addWeatherEffect(EntityWeatherEffect var1) {
      return this.b((NN)d.a(var1));
   }

   public void removeWeatherEffect(EntityWeatherEffect var1) {
      this.d.remove(var1);
   }

   public Entity getEntity(int var1) {
      return (Entity)d.a(this.a.get(var1));
   }

   public int getHeight() {
      return this.a.e();
   }

   public void setBiome(int var1, int var2, Biome var3) {
      afh var4 = this.a(var1 >> 4, var2 >> 4);
      if (!var4.isEmpty()) {
         var4.a(var1, var2, (aeu)d.a(var3));
      }

   }

   public Chunk getChunk(int var1, int var2) {
      return (Chunk)d.a(this.a(var1, var2));
   }

   public int getDimension() {
      return this.a.a().a();
   }

   // $FF: synthetic method
   public long getTime() {
      return this.b();
   }

   // $FF: synthetic method
   public long getTotalTime() {
      return this.a();
   }

   // $FF: synthetic method
   public void setTime(long var1) {
      this.a(var1);
   }
}
