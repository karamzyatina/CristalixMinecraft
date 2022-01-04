import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

public final class ago {
   private static yr a = null;
   private static agk[][] a = (agk[][])null;
   public static boolean a = a();

   public static acC a(sE var0, acC var1) {
      if (a == null) {
         return var1;
      } else {
         uI var2 = var0.a;
         if (!(var2 instanceof vO)) {
            return var1;
         } else if (var1.getNamespace().equals("minecraft") && var1.getPath().startsWith("textures/gui/")) {
            if (a == null) {
               return var1;
            } else {
               yw var3 = var0.a;
               if (var3 == null) {
                  return var1;
               } else if (var2 instanceof vP) {
                  return a(agm.CREATIVE, var0.a.a_(), var3, var1, var2);
               } else if (var2 instanceof wb) {
                  return a(agm.INVENTORY, var0.a.a_(), var3, var1, var2);
               } else {
                  acV var4 = a.a();
                  if (var4 != null) {
                     if (var2 instanceof uE) {
                        return a(agm.ANVIL, var4, var3, var1, var2);
                     }

                     if (var2 instanceof vH) {
                        return a(agm.BEACON, var4, var3, var1, var2);
                     }

                     if (var2 instanceof vM) {
                        return a(agm.BREWING_STAND, var4, var3, var1, var2);
                     }

                     if (var2 instanceof vN) {
                        return a(agm.CHEST, var4, var3, var1, var2);
                     }

                     if (var2 instanceof vT) {
                        return a(agm.CRAFTING, var4, var3, var1, var2);
                     }

                     if (var2 instanceof vU) {
                        return a(agm.DISPENSER, var4, var3, var1, var2);
                     }

                     if (var2 instanceof ub) {
                        return a(agm.ENCHANTMENT, var4, var3, var1, var2);
                     }

                     if (var2 instanceof wa) {
                        return a(agm.FURNACE, var4, var3, var1, var2);
                     }

                     if (var2 instanceof ue) {
                        return a(agm.HOPPER, var4, var3, var1, var2);
                     }

                     if (var2 instanceof wd) {
                        return a(agm.SHULKER_BOX, var4, var3, var1, var2);
                     }
                  }

                  NN var5 = a.a();
                  if (var5 != null) {
                     if (var2 instanceof wc) {
                        return a(agm.HORSE, var5, var3, var1);
                     }

                     if (var2 instanceof uu) {
                        return a(agm.VILLAGER, var5, var3, var1);
                     }
                  }

                  return var1;
               }
            }
         } else {
            return var1;
         }
      }
   }

   private static acC a(agm var0, acV var1, aec var2, acC var3, uI var4) {
      agk[] var5 = a[var0.ordinal()];
      if (var5 == null) {
         return var3;
      } else {
         for(int var6 = 0; var6 < var5.length; ++var6) {
            agk var7 = var5[var6];
            if (var7.a(var0, var1, var2, var4)) {
               return var7.a(var3);
            }
         }

         return var3;
      }
   }

   private static acC a(agm var0, NN var1, aec var2, acC var3) {
      agk[] var4 = a[var0.ordinal()];
      if (var4 == null) {
         return var3;
      } else {
         for(int var5 = 0; var5 < var4.length; ++var5) {
            agk var6 = var4[var5];
            if (var6.a(var0, var1, var2)) {
               return var6.a(var3);
            }
         }

         return var3;
      }
   }

   public static void a(Jc var0) {
      a = (agk[][])null;
      if (afT.am()) {
         ArrayList var1 = new ArrayList();
         IP[] var2 = var0.a();

         for(int var3 = var2.length - 1; var3 >= 0; --var3) {
            IP var4 = var2[var3];
            a((IP)var4, (List)var1);
         }

         a = a((List)var1);
      }

   }

   private static agk[][] a(List<List<agk>> var0) {
      if (var0.isEmpty()) {
         return (agk[][])null;
      } else {
         agk[][] var1 = new agk[agm.values().length][];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var0.size() > var2) {
               List var3 = (List)var0.get(var2);
               if (var3 != null) {
                  agk[] var4 = (agk[])var3.toArray(new agk[0]);
                  var1[var2] = var4;
               }
            }
         }

         return var1;
      }
   }

   private static void a(IP var0, List<List<agk>> var1) {
      String[] var2 = amg.a((IP)var0, (String)"optifine/gui/container/", (String)".properties", (String[])null);
      Arrays.sort(var2);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         afT.a("CustomGuis: " + var4);

         try {
            acC var5 = new acC(var4);
            InputStream var6 = var0.a(var5);
            if (var6 == null) {
               afT.b("CustomGuis file not found: " + var4);
            } else {
               Properties var7 = new Properties();
               var7.load(var6);
               var6.close();
               agk var8 = new agk(var7, var4);
               if (var8.a(var4)) {
                  a(var8, var1);
               }
            }
         } catch (FileNotFoundException var9) {
            afT.b("CustomGuis file not found: " + var4);
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }

   }

   private static void a(agk var0, List<List<agk>> var1) {
      if (var0.a() == null) {
         a("Invalid container: " + var0.a());
      } else {
         int var2 = var0.a().ordinal();

         while(var1.size() <= var2) {
            var1.add((Object)null);
         }

         Object var3 = (List)var1.get(var2);
         if (var3 == null) {
            var3 = new ArrayList();
            var1.set(var2, var3);
         }

         ((List)var3).add(var0);
      }

   }

   public static void a(yr var0) {
      a = var0;
   }

   private static boolean a() {
      Calendar var0 = Calendar.getInstance();
      return var0.get(2) + 1 == 12 && var0.get(5) >= 24 && var0.get(5) <= 26;
   }

   private static void a(String var0) {
      afT.b("[CustomGuis] " + var0);
   }
}
