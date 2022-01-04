import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import dev.xdark.feder.RecyclableArrayList;
import org.apache.logging.log4j.Logger;

public class El implements Runnable {
   private static final Logger a;
   private final Eg a;
   private final Cj a;
   private boolean a;
   private final sE a;

   public El(sE var1, Eg var2) {
      this(var1, var2, (Cj)null);
   }

   public El(sE var1, Eg var2, Cj var3) {
      this.a = true;
      this.a = var1;
      this.a = true;
      this.a = var2;
      this.a = var3;
   }

   public void run() {
      while(this.a) {
         try {
            this.a(this.a.a());
         } catch (InterruptedException var3) {
            a.debug("Stopping chunk worker due to interrupt");
            return;
         } catch (Throwable var4) {
            Kn var2 = Kn.a(var4, "Batching chunks");
            this.a.a(this.a.a(var2));
            return;
         }
      }

   }

   protected void a(Ed var1) {
      var1.a().lock();

      try {
         if (var1.a() != Ee.PENDING) {
            if (!var1.a()) {
               a.warn("Chunk render task was {} when I expected it to be pending; ignoring task", var1.a());
            }

            return;
         }

         acV var2 = new acV(this.a.a);
         acV var3 = var1.a().a();
         if (var3.a(8, 8, 8).a((adn)var2) > 576.0D) {
            aej var4 = var1.a().a();
            acZ var5 = new acZ(var3);
            if (!this.a((acV)var5.a((adn)var3).a(abP.WEST, 16), (aej)var4) || !this.a((acV)var5.a((adn)var3).a(abP.NORTH, 16), (aej)var4) || !this.a((acV)var5.a((adn)var3).a(abP.EAST, 16), (aej)var4) || !this.a((acV)var5.a((adn)var3).a(abP.SOUTH, 16), (aej)var4)) {
               return;
            }
         }

         var1.a(Ee.COMPILING);
      } finally {
         var1.a().unlock();
      }

      NN var19 = this.a.a();
      if (var19 == null) {
         var1.a();
      } else {
         var1.a(this.a());
         float var20 = (float)var19.d;
         float var21 = (float)var19.e + var19.getEyeHeight();
         float var22 = (float)var19.f;
         Ef var6 = var1.a();
         if (var6 == Ef.REBUILD_CHUNK) {
            var1.a().b(var20, var21, var22, var1);
         } else if (var6 == Ef.RESORT_TRANSPARENCY) {
            var1.a().a(var20, var21, var22, var1);
         }

         var1.a().lock();

         try {
            if (var1.a() != Ee.COMPILING) {
               if (!var1.a()) {
                  a.warn("Chunk render task was {} when I expected it to be compiling; aborting task", var1.a());
               }

               this.b(var1);
               return;
            }

            var1.a(Ee.UPLOADING);
         } finally {
            var1.a().unlock();
         }

         Eo var7 = var1.a();
         RecyclableArrayList var8 = RecyclableArrayList.newInstance();
         if (var6 == Ef.REBUILD_CHUNK) {
            abu[] var9 = abu.VALUES;
            int var10 = var9.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               abu var12 = var9[var11];
               if (var7.b(var12)) {
                  var8.add(this.a.a(var12, var1.a().a(var12), var1.a(), var7, var1.a()));
               }
            }
         } else if (var6 == Ef.RESORT_TRANSPARENCY) {
            var8.add(this.a.a(abu.TRANSLUCENT, var1.a().a(abu.TRANSLUCENT), var1.a(), var7, var1.a()));
         }

         ListenableFuture var23 = Futures.allAsList(var8);
         var8.recycle();
         var1.a((Runnable)(new Em(this, var23)));
         Futures.addCallback(var23, new En(this, var1, var7));
      }

   }

   private boolean a(acV var1, aej var2) {
      return !var2.a(var1.a >> 4, var1.c >> 4).isEmpty();
   }

   private Cj a() {
      return this.a != null ? this.a : this.a.a();
   }

   private void b(Ed var1) {
      if (this.a == null) {
         this.a.a(var1.a());
      }

   }

   public void a() {
      this.a = false;
   }

   // $FF: synthetic method
   static void a(El var0, Ed var1) {
      var0.b(var1);
   }

   // $FF: synthetic method
   static Logger a() {
      return a;
   }

   // $FF: synthetic method
   static sE a(El var0) {
      return var0.a;
   }

   static {
      a = sE.a;
   }
}
