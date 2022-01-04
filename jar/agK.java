import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public final class agk {
   private String a = null;
   private String b = null;
   private agm a = null;
   private Map<acC, acC> a = null;
   private agJ a = null;
   private aeu[] a = null;
   private agM a = null;
   private Boolean a = null;
   private Boolean b = null;
   private Boolean c = null;
   private Boolean d = null;
   private agM b = null;
   private agN[] a = null;
   private agn[] a = null;
   private SW[] a = null;
   private static final agn[] b;
   private static final agn[] c;
   private static final agn[] d;
   private static final SW[] b;
   private static final acC a;
   private static final acC b;
   private static final acC c;
   private static final acC d;
   private static final acC e;
   private static final acC f;
   private static final acC g;
   private static final acC h;
   private static final acC i;
   private static final acC j;
   private static final acC k;
   private static final acC l;
   private static final acC m;

   public agk(Properties var1, String var2) {
      agC var3 = new agC("CustomGuis");
      this.a = var3.a(var2);
      this.b = var3.b(var2);
      this.a = (agm)var3.a(var1.getProperty("container"), agm.values(), "container");
      this.a = a(var1, "texture", this.a, "textures/gui/", this.b);
      this.a = var3.a("name", var1.getProperty("name"));
      this.a = var3.a(var1.getProperty("biomes"));
      this.a = var3.a(var1.getProperty("heights"));
      this.a = var3.a(var1.getProperty("large"));
      this.b = var3.a(var1.getProperty("trapped"));
      this.c = var3.a(var1.getProperty("christmas"));
      this.d = var3.a(var1.getProperty("ender"));
      this.b = var3.a(var1.getProperty("levels"));
      this.a = var3.a(var1.getProperty("professions"));
      agn[] var4 = a(this.a);
      this.a = (agn[])((agn[])var3.a(var1.getProperty("variants"), (Enum[])var4, (String)"variants", (Enum[])d));
      this.a = a(var1.getProperty("colors"));
   }

   private static agn[] a(agm var0) {
      if (var0 == agm.HORSE) {
         return b;
      } else {
         return var0 == agm.DISPENSER ? c : new agn[0];
      }
   }

   private static SW[] a(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.toLowerCase();
         String[] var1 = afT.a(var0, " ");
         SW[] var2 = new SW[var1.length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            SW var5 = a(var4);
            if (var5 == null) {
               a("Invalid color: " + var4);
               return b;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   private static SW a(String var0) {
      if (var0 == null) {
         return null;
      } else {
         SW[] var1 = SW.values();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            SW var3 = var1[var2];
            if (var3.getName().equals(var0)) {
               return var3;
            }

            if (var3.b().equals(var0)) {
               return var3;
            }
         }

         return null;
      }
   }

   private static acC a(String var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         String var2 = amj.a(var0, var1);
         if (!var2.endsWith(".png")) {
            var2 = var2 + ".png";
         }

         return new acC(var1 + '/' + var2);
      }
   }

   private static Map<acC, acC> a(Properties var0, String var1, agm var2, String var3, String var4) {
      HashMap var5 = new HashMap();
      String var6 = var0.getProperty(var1);
      if (var6 != null) {
         acC var7 = a(var2);
         acC var8 = a(var6, var4);
         if (var7 != null && var8 != null) {
            var5.put(var7, var8);
         }
      }

      String var15 = var1 + '.';
      Iterator var16 = var0.keySet().iterator();

      while(var16.hasNext()) {
         String var9 = (String)var16.next();
         if (var9.startsWith(var15)) {
            String var10 = var9.substring(var15.length());
            var10 = var10.replace('\\', '/');
            var10 = ami.c(var10, "/", ".png");
            String var11 = var3 + var10 + ".png";
            String var12 = var0.getProperty(var9);
            acC var13 = new acC(var11);
            acC var14 = a(var12, var4);
            var5.put(var13, var14);
         }
      }

      return var5;
   }

   private static acC a(agm var0) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(String var1) {
      if (this.a != null && this.a.length() > 0) {
         if (this.b == null) {
            a("No base path found: " + var1);
            return false;
         } else if (this.a == null) {
            a("No container found: " + var1);
            return false;
         } else if (this.a.isEmpty()) {
            a("No texture found: " + var1);
            return false;
         } else if (this.a == agC.a) {
            a("Invalid professions or careers: " + var1);
            return false;
         } else if (this.a == d) {
            a("Invalid variants: " + var1);
            return false;
         } else if (this.a == b) {
            a("Invalid colors: " + var1);
            return false;
         } else {
            return true;
         }
      } else {
         a("No name found: " + var1);
         return false;
      }
   }

   private static void a(String var0) {
      afT.b("[CustomGuis] " + var0);
   }

   private boolean a(agm var1, acV var2, aec var3) {
      if (this.a != var1) {
         return false;
      } else {
         if (this.a != null) {
            aeu var4 = var3.a(var2);
            if (!agI.a(var4, this.a)) {
               return false;
            }
         }

         return this.a == null || this.a.a(var2.b);
      }
   }

   public boolean a(agm var1, acV var2, aec var3, uI var4) {
      // $FF: Couldn't be decompiled
   }

   public static String a(uI var0) {
      aeg var1 = a(var0);
      return var1 == null ? null : var1.a().getUnformattedText();
   }

   private static aeg a(uI var0) {
      if (var0 instanceof vH) {
         return ((vH)var0).a;
      } else if (var0 instanceof vM) {
         return ((vM)var0).a;
      } else if (var0 instanceof vN) {
         return ((vN)var0).a;
      } else if (var0 instanceof vU) {
         return ((vU)var0).a;
      } else if (var0 instanceof ub) {
         return ((ub)var0).a;
      } else if (var0 instanceof wa) {
         return ((wa)var0).a;
      } else if (var0 instanceof ue) {
         return ((ue)var0).a;
      } else {
         return var0 instanceof wd ? ((wd)var0).a : null;
      }
   }

   private boolean a(acV var1, aec var2) {
      aaD var3 = var2.a(var1);
      if (!(var3 instanceof aaI)) {
         return false;
      } else {
         aaI var4 = (aaI)var3;
         if (this.b != null) {
            int var5 = var4.e();
            if (!this.b.a(var5)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean b(acV var1, aec var2) {
      aaD var3 = var2.a(var1);
      if (var3 instanceof aaM) {
         aaM var5 = (aaM)var3;
         return this.a(var5, var1, var2);
      } else if (var3 instanceof aaY) {
         aaY var4 = (aaY)var3;
         return this.a(var4, var1, var2);
      } else {
         return false;
      }
   }

   private boolean a(aaM var1, acV var2, aec var3) {
      boolean var4 = var1.c != null || var1.b != null || var1.a != null || var1.d != null;
      boolean var5 = var1.a() == nC.TRAP;
      boolean var6 = ago.a;
      boolean var7 = false;
      return this.a(var4, var5, var6, var7);
   }

   private boolean a(aaY var1, acV var2, aec var3) {
      return this.a(false, false, false, true);
   }

   private boolean a(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.a != null && this.a != var1) {
         return false;
      } else if (this.b != null && this.b != var2) {
         return false;
      } else if (this.c != null && this.c != var3) {
         return false;
      } else {
         return this.d == null || this.d == var4;
      }
   }

   private boolean c(acV var1, aec var2) {
      aaD var3 = var2.a(var1);
      if (!(var3 instanceof aaT)) {
         return false;
      } else {
         aaT var4 = (aaT)var3;
         if (this.a != null) {
            agn var5 = this.a(var4);
            if (!afT.a((Object)var5, (Object[])this.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private agn a(aaT var1) {
      return var1 instanceof aaU ? agn.DROPPER : agn.DISPENSER;
   }

   private boolean d(acV var1, aec var2) {
      aaD var3 = var2.a(var1);
      if (!(var3 instanceof abk)) {
         return false;
      } else {
         abk var4 = (abk)var3;
         if (this.a != null) {
            SW var5 = var4.a();
            if (!afT.a((Object)var5, (Object[])this.a)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean a(agm var1, NN var2, aec var3) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(NN var1, aec var2) {
      if (!(var1 instanceof QZ)) {
         return false;
      } else {
         QZ var3 = (QZ)var1;
         if (this.a != null) {
            int var4 = var3.i();
            int var5 = var3.y;
            if (var5 < 0) {
               return false;
            }

            boolean var6 = false;

            for(int var7 = 0; var7 < this.a.length; ++var7) {
               agN var8 = this.a[var7];
               if (var8.a(var4, var5)) {
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean b(NN var1, aec var2) {
      if (!(var1 instanceof Qz)) {
         return false;
      } else {
         Qz var3 = (Qz)var1;
         if (this.a != null) {
            agn var4 = this.a(var3);
            if (!afT.a((Object)var4, (Object[])this.a)) {
               return false;
            }
         }

         if (this.a != null && var3 instanceof QJ) {
            QJ var6 = (QJ)var3;
            SW var5 = var6.a();
            if (!afT.a((Object)var5, (Object[])this.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private agn a(Qz var1) {
      if (var1 instanceof QH) {
         return agn.HORSE;
      } else if (var1 instanceof QF) {
         return agn.DONKEY;
      } else if (var1 instanceof QM) {
         return agn.MULE;
      } else {
         return var1 instanceof QJ ? agn.LLAMA : null;
      }
   }

   public agm a() {
      return this.a;
   }

   public acC a(acC var1) {
      acC var2 = (acC)this.a.get(var1);
      return var2 == null ? var1 : var2;
   }

   public String toString() {
      return "name: " + this.a + ", container: " + this.a + ", textures: " + this.a;
   }

   static {
      b = new agn[]{agn.HORSE, agn.DONKEY, agn.MULE, agn.LLAMA};
      c = new agn[]{agn.DISPENSER, agn.DROPPER};
      d = new agn[0];
      b = new SW[0];
      a = new acC("textures/gui/container/anvil.png");
      b = new acC("textures/gui/container/beacon.png");
      c = new acC("textures/gui/container/brewing_stand.png");
      d = new acC("textures/gui/container/generic_54.png");
      e = new acC("textures/gui/container/crafting_table.png");
      f = new acC("textures/gui/container/horse.png");
      g = new acC("textures/gui/container/dispenser.png");
      h = new acC("textures/gui/container/enchanting_table.png");
      i = new acC("textures/gui/container/furnace.png");
      j = new acC("textures/gui/container/hopper.png");
      k = new acC("textures/gui/container/inventory.png");
      l = new acC("textures/gui/container/shulker_box.png");
      m = new acC("textures/gui/container/villager.png");
   }
}
