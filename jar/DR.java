import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.xdark.clientapi.renderer.block.model.ModelBlockDefinition;
import dev.xdark.clientapi.renderer.block.model.VariantList;
import dev.xdark.clientapi.renderer.block.model.multipart.Multipart;
import dev.xdark.feder.RecyclableHashSet;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dr implements ModelBlockDefinition {
   static final Gson a = (new GsonBuilder()).registerTypeAdapter(Dr.class, new Ds()).registerTypeAdapter(DB.class, new DC()).registerTypeAdapter(DD.class, new DE()).registerTypeAdapter(DQ.class, new DR()).registerTypeAdapter(DS.class, new DT()).create();
   private final Map<String, DD> a;
   private DQ a;
   private Set<DD> a;
   private int a = -1;

   public static Dr a(Reader var0) {
      return (Dr)acn.a(a, var0, Dr.class);
   }

   public Dr(Map<String, DD> var1, DQ var2) {
      this.a = var2;
      this.a = var1;
   }

   public Dr(List<Dr> var1) {
      Dr var2 = null;
      this.a = new HashMap();
      int var3 = 0;

      for(int var4 = var1.size(); var3 < var4; ++var3) {
         Dr var5 = (Dr)var1.get(var3);
         if (var5.hasMultipartData()) {
            this.a.clear();
            var2 = var5;
         }

         this.a.putAll(var5.a);
      }

      if (var2 != null) {
         this.a = var2.a;
      }

   }

   public boolean hasVariant(String var1) {
      return this.a.get(var1) != null;
   }

   public DD a(String var1) {
      DD var2 = (DD)this.a.get(var1);
      if (var2 == null) {
         throw Dt.a;
      } else {
         return var2;
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof Dr) {
            Dr var2 = (Dr)var1;
            if (this.a.equals(var2.a)) {
               return this.hasMultipartData() ? this.a.equals(var2.a) : !var2.hasMultipartData();
            }
         }

         return false;
      }
   }

   public int hashCode() {
      int var1 = this.a;
      if (var1 == -1) {
         var1 = 31 * this.a.hashCode() + (this.hasMultipartData() ? this.a.hashCode() : 0);
         this.a = var1;
      }

      return var1;
   }

   public RecyclableHashSet<DD> a() {
      RecyclableHashSet var1 = RecyclableHashSet.newInstance(this.a.values());
      if (this.hasMultipartData()) {
         var1.addAll(this.a.getVariants());
      }

      return var1;
   }

   public Set<DD> getMultipartVariants() {
      Object var1 = this.a;
      if (var1 == null) {
         var1 = new HashSet(this.a.values());
         if (this.hasMultipartData()) {
            ((Set)var1).addAll(this.a.getVariants());
         }

         this.a = (Set)var1;
      }

      return (Set)var1;
   }

   public boolean hasMultipartData() {
      return this.a != null;
   }

   public DQ a() {
      return this.a;
   }

   public VariantList getVariant(String var1) {
      return (VariantList)d.a(this.a(var1));
   }

   public Multipart getMultipartData() {
      return (Multipart)d.a(this.a);
   }
}
