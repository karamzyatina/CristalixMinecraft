import dev.xdark.clientapi.resource.Resource;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.resource.ResourceManager;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

public interface IN extends ResourceManager, Closeable {
   Set<String> a();

   IM a(acC var1);

   IM b(acC var1);

   List<IM> a(acC var1);

   List<InputStream> b(acC var1);

   Dr a(acC var1);

   Dm a(acC var1);

   InputStream a(acC var1);

   boolean a(acC var1);

   InputStream b(acC var1);

   Ln b(acC var1);

   Ln a(acC var1);

   default void close() {
   }

   default ResourceLocation getLocation(String var1, String var2) {
      return (ResourceLocation)(new acC(var1, var2));
   }

   default Resource getResource(ResourceLocation var1) {
      return (Resource)this.b((acC)var1);
   }

   default List getAllResources(ResourceLocation var1) {
      return this.a((acC)var1);
   }
}
