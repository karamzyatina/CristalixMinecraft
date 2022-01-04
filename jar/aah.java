import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.ArrayList;
import java.util.List;

public final class aaH extends aaD implements aeg {
   private String a;
   private SW a;
   private VZ a;
   private boolean b;
   private List<aaz> a;
   private List<SW> b;
   private String b;

   public aaH() {
      this.a = SW.BLACK;
   }

   public void a(Vh var1, boolean var2) {
      this.a = null;
      VR var3 = var1.b("BlockEntityTag");
      if (var3 != null && var3.a("Patterns", (int)9)) {
         this.a = var3.a("Patterns", (int)10).a();
      }

      this.a = var2 ? a(var1) : TF.a(var1);
      this.a = null;
      this.b = null;
      this.b = "";
      this.b = true;
      this.a = var1.hasDisplayName() ? var1.getDisplayName() : null;
   }

   public String getName() {
      return this.hasCustomName() ? this.a : "banner";
   }

   public boolean hasCustomName() {
      return this.a != null && !this.a.isEmpty();
   }

   public adu a() {
      return (adu)(this.hasCustomName() ? new adD(this.getName()) : new adE(this.getName(), new Object[0]));
   }

   public VR a(VR var1) {
      super.a(var1);
      var1.a("Base", this.a.b());
      if (this.a != null) {
         var1.a((String)"Patterns", (VK)this.a);
      }

      if (this.hasCustomName()) {
         var1.a("CustomName", this.a);
      }

      return var1;
   }

   public void a(VR var1) {
      super.a(var1);
      if (var1.a("CustomName", (int)8)) {
         this.a = var1.getString("CustomName");
      }

      this.a = SW.a(var1.getInteger("Base"));
      this.a = var1.a("Patterns", (int)10);
      this.a = null;
      this.b = null;
      this.b = null;
      this.b = true;
   }

   public VR a() {
      return this.a(new VR());
   }

   public static int a(Vh var0) {
      VR var1 = var0.b("BlockEntityTag");
      return var1 != null && var1.hasKey("Patterns") ? var1.a("Patterns", (int)10).a() : 0;
   }

   public List<aaz> a() {
      this.a();
      return this.a;
   }

   public List<SW> b() {
      this.a();
      return this.b;
   }

   public String a() {
      this.a();
      return this.b;
   }

   private void a() {
      if (this.a == null || this.b == null || this.b == null) {
         if (!this.b) {
            this.b = "";
         } else {
            this.a = new ArrayList();
            this.b = new ReferenceArrayList();
            this.a.add(aaz.BASE);
            this.b.add(this.a);
            StringBuilder var1 = (new StringBuilder()).append('b').append(this.a.b());
            if (this.a != null) {
               for(int var2 = 0; var2 < this.a.a(); ++var2) {
                  VR var3 = this.a.a(var2);
                  aaz var4 = aaz.a(var3.getString("Pattern"));
                  if (var4 != null) {
                     this.a.add(var4);
                     int var5 = var3.getInteger("Color");
                     this.b.add(SW.a(var5));
                     var1.append(var4.b()).append(var5);
                  }
               }
            }

            this.b = var1.toString();
         }
      }

   }

   public Vh a() {
      Vh var1 = TF.a(this.a, this.a);
      if (this.hasCustomName()) {
         var1.b(this.getName());
      }

      return var1;
   }

   public static SW a(Vh var0) {
      VR var1 = var0.b("BlockEntityTag");
      return var1 != null && var1.hasKey("Base") ? SW.a(var1.getInteger("Base")) : SW.BLACK;
   }
}
