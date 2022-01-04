import com.google.common.util.concurrent.ThreadFactoryBuilder;
import dev.xdark.feder.PipelineUtil;
import io.netty.channel.EventLoopGroup;

final class Wq extends aco {
   protected EventLoopGroup a() {
      return PipelineUtil.newEventLoopGroup(1, (new ThreadFactoryBuilder()).setNameFormat("Netty Client IO").setDaemon(true).build());
   }
}
