import com.google.common.primitives.Doubles;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class Ed implements Comparable {
   private final Et a;
   private final ReentrantLock a = new ReentrantLock();
   private final List<Runnable> a = new ObjectArrayList();
   private final Ef a;
   private final double a;
   private Cj a;
   private Eo a;
   private Ee a;
   private boolean a;

   public Ed(Et var1, Ef var2, double var3) {
      this.a = Ee.PENDING;
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public Ee a() {
      return this.a;
   }

   public Et a() {
      return this.a;
   }

   public Eo a() {
      return this.a;
   }

   public void a(Eo var1) {
      this.a = var1;
   }

   public Cj a() {
      return this.a;
   }

   public void a(Cj var1) {
      this.a = var1;
   }

   public void a(Ee var1) {
      this.a.lock();

      try {
         this.a = var1;
      } finally {
         this.a.unlock();
      }

   }

   public void a() {
      this.a.lock();

      try {
         if (!this.a) {
            if (this.a == Ef.REBUILD_CHUNK && this.a != Ee.DONE) {
               this.a.a(false);
            }

            this.a = true;
            this.a = Ee.DONE;
            List var1 = this.a;
            int var2 = 0;

            for(int var3 = var1.size(); var2 < var3; ++var2) {
               ((Runnable)var1.get(var2)).run();
            }
         }
      } finally {
         this.a.unlock();
      }

   }

   public void a(Runnable var1) {
      this.a.lock();

      try {
         if (this.a) {
            var1.run();
         } else {
            this.a.add(var1);
         }
      } finally {
         this.a.unlock();
      }

   }

   public ReentrantLock a() {
      return this.a;
   }

   public Ef a() {
      return this.a;
   }

   public boolean a() {
      return this.a;
   }

   public int a(Ed var1) {
      return Doubles.compare(this.a, var1.a);
   }

   public double a() {
      return this.a;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((Ed)var1);
   }
}
