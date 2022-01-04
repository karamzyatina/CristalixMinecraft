import com.mojang.authlib.GameProfile;
import dev.xdark.feder.NetUtil;
import dev.xdark.feder.UUIDConversionUtil;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Xd implements Ws {
   private GameProfile a;

   public void read(ByteBuf var1) {
      String var2 = NetUtil.readUtf8(var1);
      String var3 = NetUtil.readUtf8(var1);
      UUID var4 = var2.isEmpty() ? null : UUIDConversionUtil.fromString(var2);
      this.a = new GameProfile(var4, var3);
   }

   public void write(ByteBuf var1) {
      UUID var2 = this.a.getId();
      String var3 = var2 == null ? "" : var2.toString();
      NetUtil.writeUtf8(var3, var1);
      NetUtil.writeUtf8(this.a.getName(), var1);
   }

   public void a(WW var1) {
      var1.a(this);
   }

   public GameProfile a() {
      return this.a;
   }
}
