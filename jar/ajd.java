import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.EnumMap;
import java.util.List;

public final class ajD {
   public static CV a(CV var0) {
      List var1 = a(var0.a((sD)null, (abP)null, 0L));
      abP[] var2 = abP.VALUES;
      EnumMap var3 = new EnumMap(abP.class);

      for(int var4 = 0; var4 < var2.length; ++var4) {
         abP var5 = var2[var4];
         List var6 = var0.a((sD)null, var5, 0L);
         List var7 = a(var6);
         var3.put(var5, var7);
      }

      return new Dz(var1, var3, var0.isAmbientOcclusion(), var0.isGui3d(), var0.a(), var0.a(), var0.a());
   }

   public static List<CD> a(List<CD> var0) {
      int var1 = var0.size();
      ReferenceArrayList var2 = new ReferenceArrayList(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         CD var4 = a((CD)var0.get(var3));
         var2.add(var4);
      }

      return var2;
   }

   public static CD a(CD var0) {
      return new CD(var0.a, (int[])var0.getVertexData().clone(), var0.getTintIndex(), var0.a(), var0.a());
   }
}
