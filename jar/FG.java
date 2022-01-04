import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Map;

public class Fg extends FU {
   private static final Map<Class<?>, acC> a = new Reference2ObjectArrayMap(4);
   private final float l;

   public Fg(Ga var1) {
      this(var1, 1.0F);
   }

   public Fg(Ga var1, float var2) {
      super(var1, new xv(var1.a), 0.75F);
      this.l = var2;
   }

   protected void a(Qz var1, float var2) {
      By.b(this.l, this.l, this.l);
      super.a(var1, var2);
   }

   protected acC a(Qz var1) {
      return (acC)a.get(var1.getClass());
   }

   static {
      a.put(QF.class, new acC("textures/entity/horse/donkey.png"));
      a.put(QM.class, new acC("textures/entity/horse/mule.png"));
      a.put(Rk.class, new acC("textures/entity/horse/horse_zombie.png"));
      a.put(QW.class, new acC("textures/entity/horse/horse_skeleton.png"));
   }
}
