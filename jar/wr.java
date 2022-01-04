import dev.xdark.feder.PipelineUtil;
import dev.xdark.feder.Varint21FrameDecoder;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

final class Wr extends ChannelInitializer {
   // $FF: synthetic field
   final Wp a;

   Wr(Wp var1) {
      this.a = var1;
   }

   protected void initChannel(Channel var1) {
      ChannelConfig var2 = var1.config();

      try {
         var2.setOption(ChannelOption.TCP_NODELAY, Boolean.TRUE);
      } catch (ChannelException var4) {
      }

      var2.setAllocator(PooledByteBufAllocator.DEFAULT);
      var1.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("frame-decoder", new Varint21FrameDecoder()).addLast("packet-decoder", new Wn(Wl.CLIENTBOUND)).addLast("frame-prepender", PipelineUtil.framePrepender).addLast("packet-encoder", new Wo(Wl.SERVERBOUND)).addLast("inbound-boss", this.a);
   }
}
