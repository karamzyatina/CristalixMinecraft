import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import dev.xdark.feder.RecyclableArrayList;
import io.netty.util.concurrent.FastThreadLocalThread;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Logger;

public class Eg {
   private static final Logger a;
   private static final ThreadFactory a;
   protected final sE a;
   private final int a;
   private final List<Thread> a;
   private final List<El> b;
   private final PriorityBlockingQueue<Ed> a;
   private final BlockingQueue<Cj> a;
   private final CB a;
   private final Cz a;
   private final Queue<Ek> a;
   private final El a;
   private final List<Cj> c;

   public Eg(sE var1) {
      this(var1, -1);
   }

   public Eg(sE var1, int var2) {
      this.a = var1;
      this.a = new ReferenceArrayList();
      this.b = new ReferenceArrayList();
      this.a = new PriorityBlockingQueue();
      this.a = new CB();
      this.a = new Cz();
      this.a = new ConcurrentLinkedQueue();
      this.c = new ArrayList();
      int var3 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3D) / 10485760);
      int var4 = Math.max(1, adh.a(Runtime.getRuntime().availableProcessors() - 2, 1, var3 / 5));
      if (var2 < 0) {
         this.a = adh.a(var4 * 8, 1, var3);
      } else {
         this.a = var2;
      }

      int var7;
      if (var4 > 1) {
         List var5 = this.b;
         List var6 = this.a;

         for(var7 = 0; var7 < var4; ++var7) {
            El var8 = new El(var1, this);
            Thread var9 = a.newThread(var8);
            var9.start();
            var5.add(var8);
            var6.add(var9);
         }
      }

      this.a = new ArrayBlockingQueue(this.a);
      HO var10 = var1.a();
      int var11 = 0;

      for(var7 = this.a; var11 < var7; ++var11) {
         this.a.add(new Cj(var10));
      }

      this.a = new El(var1, this, new Cj(var10));
   }

   public final String a() {
      return this.a.isEmpty() ? String.format("pC: %03d, single-threaded", this.a.size()) : String.format("pC: %03d, pU: %1d, aB: %1d", this.a.size(), this.a.size(), this.a.size());
   }

   public final boolean a(long var1) {
      boolean var3 = false;

      boolean var4;
      do {
         var4 = false;
         if (this.a.isEmpty()) {
            Ed var5 = (Ed)this.a.poll();
            if (var5 != null) {
               try {
                  this.a.a(var5);
                  var4 = true;
               } catch (InterruptedException var9) {
                  a.warn("Skipped task due to interrupt");
               }
            }
         }

         Ek var10;
         synchronized(this.a) {
            var10 = (Ek)this.a.poll();
         }

         if (var10 != null) {
            Ek.a(var10).run();
            var4 = true;
            var3 = true;
         }
      } while(var1 != 0L && var4 && var1 >= System.nanoTime());

      return var3;
   }

   public final boolean a(Et var1) {
      var1.a().lock();

      boolean var2;
      try {
         Ed var3 = var1.a();
         var3.a((Runnable)(new Eh(this, var3)));
         boolean var4 = this.a.offer(var3);
         if (!var4) {
            var3.a();
         }

         var2 = var4;
      } finally {
         var1.a().unlock();
      }

      return var2;
   }

   public final boolean b(Et var1) {
      var1.a().lock();

      try {
         Ed var2 = var1.a();

         try {
            this.a.a(var2);
         } catch (InterruptedException var7) {
         }
      } finally {
         var1.a().unlock();
      }

      return true;
   }

   public final void a() {
      this.b();
      RecyclableArrayList var1 = RecyclableArrayList.newInstance();

      while(var1.size() != this.a) {
         this.a(Long.MAX_VALUE);

         try {
            var1.add(this.a());
         } catch (InterruptedException var3) {
         }
      }

      this.a.addAll(var1);
      var1.recycle();
   }

   public final void a(Cj var1) {
      this.a.add(var1);
   }

   public final Cj a() {
      return (Cj)this.a.take();
   }

   public final Ed a() {
      return (Ed)this.a.take();
   }

   public final boolean c(Et var1) {
      var1.a().lock();

      boolean var4;
      try {
         Ed var3 = var1.b();
         if (var3 != null) {
            var3.a((Runnable)(new Ei(this, var3)));
            boolean var2 = this.a.offer(var3);
            return var2;
         }

         var4 = true;
      } finally {
         var1.a().unlock();
      }

      return var4;
   }

   public ListenableFuture<Object> a(abu var1, Bh var2, Et var3, Eo var4, double var5) {
      if (this.a.e()) {
         if (Ci.b()) {
            this.a(var2, var3.a(var1.ordinal()));
         } else {
            this.a(var2, ((Es)var3).a(var1, var4), var3);
         }

         var2.setTranslation(0.0D, 0.0D, 0.0D);
         return Futures.immediateFuture((Object)null);
      } else {
         ListenableFutureTask var7 = ListenableFutureTask.create(new Ej(this, var1, var2, var3, var4, var5), (Object)null);
         synchronized(this.a) {
            this.a.add(new Ek(var7, var5));
            return var7;
         }
      }
   }

   protected final void a(Bh var1, int var2, Et var3) {
      By.f(var2, 4864);
      By.C();
      var3.c();
      this.a.a(var1);
      By.D();
      By.G();
   }

   private void a(Bh var1, Io var2) {
      Cz var3 = this.a;
      var3.a(var2);
      var3.a(var1);
   }

   public final void b() {
      PriorityBlockingQueue var1 = this.a;

      Ed var2;
      while((var2 = (Ed)var1.poll()) != null) {
         var2.a();
      }

   }

   public final boolean a() {
      return this.a.isEmpty() && this.a.isEmpty();
   }

   public final void c() {
      this.b();
      List var1 = this.b;
      int var2 = 0;

      for(int var3 = var1.size(); var2 < var3; ++var2) {
         El var4 = (El)var1.get(var2);
         var4.a();
      }

      Iterator var10 = this.a.iterator();

      while(var10.hasNext()) {
         Thread var12 = (Thread)var10.next();

         try {
            var12.interrupt();
            var12.join();
         } catch (InterruptedException var9) {
            a.warn("Interrupted whilst waiting for worker to die", var9);
         }
      }

      BlockingQueue var11 = this.a;

      Cj var13;
      while((var13 = (Cj)var11.poll()) != null) {
         Bh[] var5 = var13.a();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            Bh var8 = var5[var7];
            var8.a();
         }
      }

   }

   public boolean b() {
      return this.a.isEmpty();
   }

   public final void d() {
      while(this.c.size() != this.a) {
         try {
            this.a(Long.MAX_VALUE);
            Cj var1 = (Cj)this.a.poll(100L, TimeUnit.MILLISECONDS);
            if (var1 != null) {
               this.c.add(var1);
            }
         } catch (InterruptedException var2) {
         }
      }

   }

   public final void e() {
      this.a.addAll(this.c);
      this.c.clear();
   }

   // $FF: synthetic method
   static PriorityBlockingQueue a(Eg var0) {
      return var0.a;
   }

   static {
      a = sE.a;
      a = (new ThreadFactoryBuilder()).setNameFormat("Chunk Batcher %d").setDaemon(true).setThreadFactory(FastThreadLocalThread::new).build();
   }
}
