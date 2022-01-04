import com.sun.jna.Pointer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class a implements Runnable {
   public static Runnable a;
   private static final ByteBuffer a = ByteBuffer.allocateDirect(712).order(ByteOrder.nativeOrder()).putDouble(1024.0D).putDouble(8000.0D).putDouble(10.0D).putDouble(0.9800000190734863D).putDouble(-7.0E-4D).putDouble(0.25D).putDouble(0.4000000059604645D).putDouble(0.6600000262260437D).putDouble(2.4000000953674316D).putDouble(0.10000000149011612D).putDouble(0.015625D).putDouble(0.05D).putDouble(0.699999988079071D).putDouble(3.2D).putDouble(0.5D).putDouble(-0.10000000149011612D).putDouble(2048.0D).putDouble(0.35D).putDouble(0.2D).putDouble(-0.1D).putDouble(0.4D).putDouble(20.0D).putDouble(0.1D).putDouble(0.05000000074505806D).putDouble(0.02D).putDouble(-1024.0D).putDouble(1.0D).putDouble(0.014D).putDouble(0.009999999776482582D).putDouble(0.30000001192092896D).putDouble(-0.15000000596046448D).putDouble(-0.03999999910593033D).putDouble(0.75D).putDouble(2.0D).putDouble(0.8D).putDouble(0.3D).putDouble(0.06D).putDouble(0.6000000238418579D).putDouble(9.999999747378752E-6D).putDouble(0.08D).putDouble(9.0D).putDouble(0.800000011920929D).putDouble(-0.15D).putDouble(-0.05D).putDouble(0.98D).putDouble(0.9900000095367432D).putDouble(-20.0D).putDouble(3.0D).putDouble(4.0D).putDouble(1.0000000149011612E16D).putDouble(0.06153846016296973D).putDouble(0.03125D).putDouble(0.04D).putDouble(0.6D).putDouble(0.15000000596046448D).putDouble(0.003D).putDouble(-0.5D).putDouble(-0.4000000059604645D).putDouble(-0.08D).putDouble(0.101D).putDouble(6.0D).putDouble(0.03999999910593033D).putDouble(0.0D).putFloat(0.54600006F).putFloat(0.0027F).putFloat(0.98F).putFloat(20.0F).putFloat(100.0F).putFloat(0.1F).putFloat(0.09F).putFloat(1.3964844F).putFloat(5.0F).putFloat(1.8F).putFloat(0.42F).putFloat(0.04F).putFloat(0.08F).putFloat(8.1E-4F).putFloat(1.65F).putFloat(0.8F).putFloat(-3.0F).putFloat(0.2F).putFloat(0.05F).putFloat(0.6875F).putFloat(-3.2F).putFloat(1000.0F).putFloat(0.16277136F).putFloat(-3.1F).putFloat(8.0F).putFloat(0.91F).putFloat(1.0F).putFloat(2.0F).putFloat(4.5F).putFloat(0.4F).putFloat(30.0F).putFloat(0.9F).putFloat(0.02F).putFloat(0.005F).putFloat(0.6F).putFloat(-0.4F).putFloat(6.0F).putFloat(1.6F).putFloat(90.0F).putFloat(0.017453292F).putFloat(1.15F).putFloat(70.0F).putFloat(15.0F).putFloat(0.5625F).putFloat(1.5F).putFloat(0.3F).putFloat(0.5F).putFloat(0.225F).putFloat(1.62F).putFloat(3.0F).putFloat(1.0E-4F).putFloat(1.375F);

   private static final byte[] a() {
      ByteBuffer var10000 = (ByteBuffer)a.position(0);
      byte[] var10002 = new byte[712];
      var10000.get(var10002);
      return var10002;
   }

   private static final int a() {
      return Arrays.hashCode(a());
   }

   public final void run() {
      int var10000;
      Object var10001;
      label37: {
         var10000 = a();
         if (System.getProperty("os.name").toLowerCase().contains("win")) {
            var10001 = iI.a(a());
            if (var10001 instanceof Pointer) {
               break label37;
            }
         }

         var10001 = null;
      }

      Object var10002 = var10001;
      int var2 = var10000;
      Object var1 = var10002;

      while(true) {
         label40: {
            if (var2 == a()) {
               int var3 = var2;
               var10001 = var1;
               var10000 = var3;
               if (var10001 == null) {
                  var10002 = var10001;
                  var2 = var10000;
                  var1 = var10002;
                  break label40;
               }

               int var10003 = Arrays.hashCode(iI.a(712, var10001));
               var10002 = var10001;
               var2 = var10003;
               Object var4 = var10002;
               var3 = var2;
               var2 = var10000;
               var1 = var4;
               var10003 = var3;
               var3 = var2;
               var2 = var10003;
               var10003 = var3;
               var3 = var2;
               var2 = var10003;
               if (var10003 == var3) {
                  break label40;
               }
            }

            Runnable var5 = a;
            if (var5 != null) {
               var5.run();
            } else {
               Runtime.getRuntime().halt(77777);
            }

            var2 = (int)System.currentTimeMillis();
         }

         Thread.sleep(10000L);
      }
   }
}
