import io.netty.buffer.ByteBuf;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class VI {
   public static VR a(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      VR var2;
      try {
         var2 = a((DataInput)var1, (VN)VN.a);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(VR var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)));

      try {
         a((VR)var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static void a(VR var0, File var1) {
      File var2 = new File(var1.getAbsolutePath() + "_tmp");
      var2.delete();
      b(var0, var2);
      var1.delete();
      if (var1.isFile()) {
         throw new IOException("Failed to delete " + var1);
      } else {
         var2.renameTo(var1);
      }
   }

   public static void b(VR var0, File var1) {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         a((VR)var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static VR a(File var0) {
      if (!var0.isFile()) {
         return null;
      } else {
         DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

         VR var2;
         try {
            var2 = a((DataInput)var1, (VN)VN.a);
         } finally {
            var1.close();
         }

         return var2;
      }
   }

   public static VR a(DataInputStream var0) {
      return a((DataInput)var0, (VN)VN.a);
   }

   public static void a(ByteBuf var0) {
      byte var1 = var0.readByte();
      if (var1 != 0) {
         var0.skipBytes(var0.readUnsignedShort());
         VK var2 = VK.a(var1);
         var2.a(var0);
      }

   }

   public static VR a(DataInput var0, VN var1) {
      VK var2 = a(var0, 0, var1);
      if (var2 instanceof VR) {
         return (VR)var2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(VR var0, DataOutput var1) {
      a((VK)var0, (DataOutput)var1);
   }

   public static void a(VK var0, DataOutput var1) {
      var1.writeByte(var0.getId());
      if (var0.getId() != 0) {
         var1.writeUTF("");
         var0.write(var1);
      }

   }

   public static VK a(DataInput var0, int var1, VN var2) {
      byte var3 = var0.readByte();
      if (var3 == 0) {
         return new VV();
      } else {
         var0.readUTF();
         VK var4 = VK.a(var3);

         try {
            var4.a(var0, var1, var2);
            return var4;
         } catch (IOException var8) {
            Kn var6 = Kn.a(var8, "Loading NBT data");
            Ku var7 = var6.a("NBT Tag");
            var7.a((String)"Tag type", (Object)var3);
            throw new acB(var6);
         }
      }
   }
}
