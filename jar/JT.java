import dev.xdark.clientapi.resource.data.AnimationMetadataSection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.util.List;
import java.util.Set;

public class Jt implements Jw, AnimationMetadataSection {
   private final List<Js> a;
   private final int a;
   private final int b;
   private final int c;
   private final boolean a;

   public Jt(List<Js> var1, int var2, int var3, int var4, boolean var5) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.a = var5;
   }

   public int getFrameHeight() {
      return this.b;
   }

   public int getFrameWidth() {
      return this.a;
   }

   public int getFrameCount() {
      return this.a.size();
   }

   public int getFrameTime() {
      return this.c;
   }

   public boolean isInterpolate() {
      return this.a;
   }

   private Js a(int var1) {
      return (Js)this.a.get(var1);
   }

   public int getFrameTimeSingle(int var1) {
      Js var2 = this.a(var1);
      return var2.a() ? this.c : var2.a();
   }

   public boolean frameHasTime(int var1) {
      return !((Js)this.a.get(var1)).a();
   }

   public int getFrameIndex(int var1) {
      return ((Js)this.a.get(var1)).b();
   }

   public IntSet a() {
      List var1 = this.a;
      int var2 = var1.size();
      if (var2 == 0) {
         return IntSets.EMPTY_SET;
      } else {
         IntOpenHashSet var3 = new IntOpenHashSet(var2, 1.0F);

         while(var2-- > 0) {
            var3.add(((Js)var1.get(var2)).b());
         }

         return var3;
      }
   }

   public Set<Integer> a() {
      return this.a();
   }

   // $FF: synthetic method
   public IntSet getFrameIndexSet() {
      return this.a();
   }
}
