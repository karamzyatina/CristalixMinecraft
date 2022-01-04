import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public final class mV {
   private final adu a;
   private final adu b;
   private final Vh a;
   private final acC a;
   private final mW a;
   private final boolean a;
   private final boolean b;
   private float a;
   private float b;

   public mV(Vh var1, adu var2, adu var3, acC var4, mW var5, boolean var6, boolean var7) {
      this.a = var2;
      this.b = var3;
      this.a = var1;
      this.a = var4;
      this.a = var5;
      this.a = var6;
      this.b = var7;
   }

   public void a(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public adu a() {
      return this.a;
   }

   public adu b() {
      return this.b;
   }

   public Vh a() {
      return this.a;
   }

   public acC a() {
      return this.a;
   }

   public mW a() {
      return this.a;
   }

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }

   public static mV a(JsonObject var0, JsonDeserializationContext var1) {
      adu var2 = (adu)acn.a(var0, "title", var1, adu.class);
      adu var3 = (adu)acn.a(var0, "description", var1, adu.class);
      if (var2 != null && var3 != null) {
         Vh var4 = a(acn.a(var0, "icon"));
         acC var5 = var0.has("background") ? new acC(acn.a(var0, "background")) : null;
         mW var6 = var0.has("frame") ? mW.a(acn.a(var0, "frame")) : mW.TASK;
         boolean var7 = acn.a(var0, "show_toast", true);
         boolean var8 = acn.a(var0, "hidden", false);
         return new mV(var4, var2, var3, var5, var6, var7, var8);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static Vh a(JsonObject var0) {
      if (!var0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         SZ var1 = acn.a(var0, "item");
         int var2 = acn.a(var0, "data", 0);
         return new Vh(var1, 1, var2);
      }
   }

   public void a(ByteBuf var1) {
      Wt.a(this.a, var1);
      Wt.a(this.b, var1);
      Wt.a(this.a, var1);
      NetUtil.writeEnum(this.a, var1);
      int var2 = 0;
      if (this.a != null) {
         var2 |= 1;
      }

      if (this.a) {
         var2 |= 2;
      }

      if (this.b) {
         var2 |= 4;
      }

      var1.writeInt(var2);
      if (this.a != null) {
         Wt.a(this.a, var1);
      }

      var1.writeFloat(this.a);
      var1.writeFloat(this.b);
   }

   public static mV a(ByteBuf var0) {
      adu var1 = Wt.a(var0);
      adu var2 = Wt.a(var0);
      Vh var3 = Wt.a(var0);
      mW var4 = (mW)NetUtil.readEnum(mW.VALUES, var0);
      int var5 = var0.readInt();
      acC var6 = (var5 & 1) != 0 ? new acC(NetUtil.readUtf8(var0)) : null;
      boolean var7 = (var5 & 2) != 0;
      boolean var8 = (var5 & 4) != 0;
      mV var9 = new mV(var3, var1, var2, var6, var4, var7, var8);
      var9.a(var0.readFloat(), var0.readFloat());
      return var9;
   }
}
