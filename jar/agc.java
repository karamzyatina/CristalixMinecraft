import dev.xdark.feder.array.EmptyArrays;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class agC {
   private String a = null;
   public static final agN[] a = new agN[0];
   private static final agF<Enum> a = new agD();

   public agC(String var1) {
      this.a = var1;
   }

   public String a(String var1) {
      String var2 = var1;
      int var3 = var1.lastIndexOf(47);
      if (var3 >= 0) {
         var2 = var1.substring(var3 + 1);
      }

      int var4 = var2.lastIndexOf(46);
      if (var4 >= 0) {
         var2 = var2.substring(0, var4);
      }

      return var2;
   }

   public String b(String var1) {
      int var2 = var1.lastIndexOf(47);
      return var2 < 0 ? "" : var1.substring(0, var2);
   }

   public agH[] a(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = afT.a(var1, " ");

         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            agH[] var6 = this.b(var5);
            if (var6 != null) {
               var2.addAll(Arrays.asList(var6));
            }
         }

         agH[] var7 = (agH[])((agH[])var2.toArray(new agH[0]));
         return var7;
      }
   }

   public sD a(String var1, sD var2) {
      agH[] var3 = this.b(var1);
      if (var3 == null) {
         return var2;
      } else if (var3.length != 1) {
         return var2;
      } else {
         agH var4 = var3[0];
         int var5 = var4.a();
         nh var6 = mY.a(var5);
         return var6.a();
      }
   }

   public agH[] b(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         if (var1.length() <= 0) {
            return null;
         } else {
            String[] var2 = afT.a(var1, ":");
            String var3;
            byte var4;
            if (var2.length > 1 && this.a(var2)) {
               var3 = var2[0];
               var4 = 1;
            } else {
               var3 = "minecraft";
               var4 = 0;
            }

            String var5 = var2[var4];
            String[] var6 = (String[])((String[])Arrays.copyOfRange(var2, var4 + 1, var2.length));
            nh[] var7 = this.a(var3, var5);
            if (var7 == null) {
               return null;
            } else {
               agH[] var8 = new agH[var7.length];

               for(int var9 = 0; var9 < var7.length; ++var9) {
                  nh var10 = var7[var9];
                  int var11 = mY.a(var10);
                  int[] var12 = null;
                  if (var6.length > 0) {
                     var12 = this.a(var10, var6);
                     if (var12 == null) {
                        return null;
                     }
                  }

                  agH var13 = new agH(var11, var12);
                  var8[var9] = var13;
               }

               return var8;
            }
         }
      }
   }

   public boolean a(String[] var1) {
      if (var1.length < 2) {
         return false;
      } else {
         String var2 = var1[1];
         if (var2.length() < 1) {
            return false;
         } else if (this.a(var2)) {
            return false;
         } else {
            return !var2.contains("=");
         }
      }
   }

   public boolean a(String var1) {
      if (var1 == null) {
         return false;
      } else if (var1.length() < 1) {
         return false;
      } else {
         char var2 = var1.charAt(0);
         return Character.isDigit(var2);
      }
   }

   public nh[] a(String var1, String var2) {
      if (this.a(var2)) {
         int[] var8 = this.a(var2);
         if (var8 == null) {
            return null;
         } else {
            nh[] var9 = new nh[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               int var6 = var8[var10];
               nh var7 = mY.a(var6);
               if (var7 == null) {
                  this.b("Block not found for id: " + var6);
                  return null;
               }

               var9[var10] = var7;
            }

            return var9;
         }
      } else {
         String var3 = var1 + ':' + var2;
         nh var4 = mY.a(var3);
         if (var4 == null) {
            this.b("Block not found for name: " + var3);
            return null;
         } else {
            nh[] var5 = new nh[]{var4};
            return var5;
         }
      }
   }

   public int[] a(nh var1, String[] var2) {
      if (var2.length <= 0) {
         return null;
      } else {
         String var3 = var2[0];
         if (this.a(var3)) {
            int[] var19 = this.a(var3);
            return var19;
         } else {
            sD var4 = var1.a();
            Collection var5 = var4.getPropertyKeys();
            HashMap var6 = new HashMap();

            for(int var7 = 0; var7 < var2.length; ++var7) {
               String var8 = var2[var7];
               if (var8.length() > 0) {
                  String[] var9 = afT.a(var8, "=");
                  if (var9.length != 2) {
                     this.b("Invalid block property: " + var8);
                     return null;
                  }

                  String var10 = var9[0];
                  String var11 = var9[1];
                  so var12 = afU.a(var10, var5);
                  if (var12 == null) {
                     this.b("Property not found: " + var10 + ", block: " + var1);
                     return null;
                  }

                  Object var13 = (List)var6.get(var10);
                  if (var13 == null) {
                     var13 = new ArrayList();
                     var6.put(var12, var13);
                  }

                  String[] var14 = afT.a(var11, ",");

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     String var16 = var14[var15];
                     Comparable var17 = a(var12, var16);
                     if (var17 == null) {
                        this.b("Property value not found: " + var16 + ", property: " + var10 + ", block: " + var1);
                        return null;
                     }

                     ((List)var13).add(var17);
                  }
               }
            }

            if (var6.isEmpty()) {
               return null;
            } else {
               IntArrayList var20 = new IntArrayList();

               for(int var21 = 0; var21 < 16; ++var21) {
                  try {
                     sD var22 = this.a(var1, var21);
                     if (this.a((sD)var22, (Map)var6)) {
                        var20.add(var21);
                     }
                  } catch (IllegalArgumentException var18) {
                  }
               }

               if (var20.size() == 16) {
                  return null;
               } else {
                  return var20.toArray(EmptyArrays.INT);
               }
            }
         }
      }
   }

   private sD a(nh var1, int var2) {
      try {
         sD var3 = var1.a(var2);
         if (var1 == RQ.a && var2 > 7) {
            sD var4 = var1.a(var2 & 7);
            var3 = var3.a(nY.a, var4.a((so)nY.a));
         }

         if (var1 == RQ.bX && (var2 & 8) != 0) {
            var3 = var3.a(pA.a, Boolean.TRUE);
         }

         return var3;
      } catch (IllegalArgumentException var5) {
         return var1.a();
      }
   }

   public static Comparable a(so var0, String var1) {
      Class var2 = var0.getValueClass();
      Comparable var3 = a(var1, var2);
      if (var3 == null) {
         Collection var4 = var0.getAllowedValues();
         var3 = a(var1, var4);
      }

      return var3;
   }

   public static Comparable a(String var0, Collection<Comparable> var1) {
      Iterator var2 = var1.iterator();

      Comparable var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (Comparable)var2.next();
      } while(!a(var3).equals(var0));

      return var3;
   }

   private static Object a(Comparable var0) {
      if (var0 instanceof acf) {
         acf var1 = (acf)var0;
         return var1.getName();
      } else {
         return var0.toString();
      }
   }

   public static Comparable a(String var0, Class var1) {
      if (var1 == String.class) {
         return var0;
      } else if (var1 == Boolean.class) {
         return Boolean.valueOf(var0);
      } else if (var1 == Float.class) {
         return Float.valueOf(var0);
      } else if (var1 == Double.class) {
         return Double.valueOf(var0);
      } else if (var1 == Integer.class) {
         return Integer.valueOf(var0);
      } else {
         return var1 == Long.class ? Long.valueOf(var0) : null;
      }
   }

   public boolean a(sD var1, Map<so, List<Comparable>> var2) {
      Iterator var3 = var2.keySet().iterator();

      List var5;
      Comparable var6;
      do {
         if (!var3.hasNext()) {
            return true;
         }

         so var4 = (so)var3.next();
         var5 = (List)var2.get(var4);
         var6 = var1.a(var4);
         if (var6 == null) {
            return false;
         }
      } while(var5.contains(var6));

      return false;
   }

   public aeu[] a(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         boolean var2 = false;
         if (!var1.isEmpty() && var1.charAt(0) == '!') {
            var2 = true;
            var1 = var1.substring(1);
         }

         String[] var3 = afT.a(var1, " ");
         ArrayList var4 = new ArrayList();

         for(int var5 = 0; var5 < var3.length; ++var5) {
            String var6 = var3[var5];
            aeu var7 = this.a(var6);
            if (var7 == null) {
               this.b("Biome not found: " + var6);
            } else {
               var4.add(var7);
            }
         }

         if (var2) {
            ArrayList var8 = new ArrayList(aeu.a.a());
            var8.removeAll(var4);
            var4 = var8;
         }

         aeu[] var9 = (aeu[])((aeu[])var4.toArray(new aeu[0]));
         return var9;
      }
   }

   public aeu a(String var1) {
      var1 = var1.toLowerCase();
      if (var1.equals("nether")) {
         return RP.j;
      } else {
         Iterator var2 = aeu.a.a().iterator();

         while(var2.hasNext()) {
            acC var3 = (acC)var2.next();
            aeu var4 = (aeu)aeu.a.a(var3);
            if (var4 != null) {
               String var5 = var4.a().replace(" ", "").toLowerCase();
               if (var5.equals(var1)) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   public int a(String var1, int var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         int var3 = afT.a((String)var1, -1);
         if (var3 < 0) {
            this.b("Invalid number: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   public int[] a(String var1) {
      if (var1 == null) {
         return null;
      } else {
         IntArrayList var2 = new IntArrayList();
         String[] var3 = afT.a(var1, " ,");

         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            if (var5.contains("-")) {
               String[] var10 = afT.a(var5, "-");
               if (var10.length != 2) {
                  this.b("Invalid interval: " + var5 + ", when parsing: " + var1);
               } else {
                  int var7 = afT.a((String)var10[0], -1);
                  int var8 = afT.a((String)var10[1], -1);
                  if (var7 >= 0 && var8 >= 0 && var7 <= var8) {
                     for(int var9 = var7; var9 <= var8; ++var9) {
                        var2.add(var9);
                     }
                  } else {
                     this.b("Invalid interval: " + var5 + ", when parsing: " + var1);
                  }
               }
            } else {
               int var6 = afT.a((String)var5, -1);
               if (var6 < 0) {
                  this.b("Invalid number: " + var5 + ", when parsing: " + var1);
               } else {
                  var2.add(var6);
               }
            }
         }

         return var2.toIntArray();
      }
   }

   public abP a(String var1) {
      var1 = var1.toLowerCase();
      if (!var1.equals("bottom") && !var1.equals("down")) {
         if (!var1.equals("top") && !var1.equals("up")) {
            if (var1.equals("north")) {
               return abP.NORTH;
            } else if (var1.equals("south")) {
               return abP.SOUTH;
            } else if (var1.equals("east")) {
               return abP.EAST;
            } else if (var1.equals("west")) {
               return abP.WEST;
            } else {
               afT.b("Unknown face: " + var1);
               return null;
            }
         } else {
            return abP.UP;
         }
      } else {
         return abP.DOWN;
      }
   }

   public void a(String var1) {
      afT.a(this.a + ": " + var1);
   }

   public void b(String var1) {
      afT.b(this.a + ": " + var1);
   }

   public agM a(String var1) {
      if (var1 == null) {
         return null;
      } else {
         agM var2 = new agM();
         String[] var3 = afT.a(var1, " ,");

         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            agL var6 = this.a(var5);
            if (var6 == null) {
               return null;
            }

            var2.a(var6);
         }

         return var2;
      }
   }

   private agL a(String var1) {
      if (var1 == null) {
         return null;
      } else if (var1.indexOf(45) >= 0) {
         String[] var5 = afT.a(var1, "-");
         if (var5.length != 2) {
            this.b("Invalid range: " + var1);
            return null;
         } else {
            int var3 = afT.a((String)var5[0], -1);
            int var4 = afT.a((String)var5[1], -1);
            if (var3 >= 0 && var4 >= 0) {
               return new agL(var3, var4);
            } else {
               this.b("Invalid range: " + var1);
               return null;
            }
         }
      } else {
         int var2 = afT.a((String)var1, -1);
         if (var2 < 0) {
            this.b("Invalid integer: " + var1);
            return null;
         } else {
            return new agL(var2, var2);
         }
      }
   }

   public boolean a(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      } else {
         String var3 = var1.toLowerCase().trim();
         if (var3.equals("true")) {
            return true;
         } else if (var3.equals("false")) {
            return false;
         } else {
            this.b("Invalid boolean: " + var1);
            return var2;
         }
      }
   }

   public Boolean a(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.toLowerCase().trim();
         if (var2.equals("true")) {
            return Boolean.TRUE;
         } else if (var2.equals("false")) {
            return Boolean.FALSE;
         } else {
            this.b("Invalid boolean: " + var1);
            return null;
         }
      }
   }

   public static int b(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            int var2 = Integer.parseInt(var0, 16) & 16777215;
            return var2;
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   public abu a(String var1, abu var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.toLowerCase().trim();
         abu[] var3 = abu.VALUES;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            abu var5 = var3[var4];
            if (var1.equals(var5.name().toLowerCase())) {
               return var5;
            }
         }

         return var2;
      }
   }

   public <T> T a(String var1, T[] var2, agF var3, String var4) {
      if (var1 == null) {
         return null;
      } else {
         String var5 = var1.toLowerCase().trim();

         for(int var6 = 0; var6 < var2.length; ++var6) {
            Object var7 = var2[var6];
            String var8 = var3.a(var7);
            if (var8 != null && var8.toLowerCase().equals(var5)) {
               return var7;
            }
         }

         this.b("Invalid " + var4 + ": " + var1);
         return null;
      }
   }

   public <T> T[] a(String var1, T[] var2, agF var3, String var4, T[] var5) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.toLowerCase().trim();
         String[] var6 = afT.a(var1, " ");
         Object[] var7 = (Object[])((Object[])((Object[])Array.newInstance(var2.getClass().getComponentType(), var6.length)));

         for(int var8 = 0; var8 < var6.length; ++var8) {
            String var9 = var6[var8];
            Object var10 = this.a(var9, var2, var3, var4);
            if (var10 == null) {
               return var5;
            }

            var7[var8] = var10;
         }

         return var7;
      }
   }

   public Enum a(String var1, Enum[] var2, String var3) {
      return (Enum)this.a(var1, (Object[])var2, (agF)a, (String)var3);
   }

   public Enum[] a(String var1, Enum[] var2, String var3, Enum[] var4) {
      return (Enum[])((Enum[])this.a(var1, var2, a, var3, var4));
   }

   public agJ a(String var1, String var2) {
      return var1 != null && var2 != null ? new agJ(var1, var2) : null;
   }

   public agN[] a(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = afT.a(var1, " ");

         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            agN var6 = this.a(var5);
            if (var6 == null) {
               this.b("Invalid profession: " + var5);
               return a;
            }

            var2.add(var6);
         }

         if (var2.isEmpty()) {
            return null;
         } else {
            agN[] var7 = (agN[])((agN[])var2.toArray(new agN[0]));
            return var7;
         }
      }
   }

   private agN a(String var1) {
      var1 = var1.toLowerCase();
      String[] var2 = afT.a(var1, ":");
      if (var2.length > 2) {
         return null;
      } else {
         String var3 = var2[0];
         String var4 = null;
         if (var2.length > 1) {
            var4 = var2[1];
         }

         int var5 = a(var3);
         if (var5 < 0) {
            return null;
         } else {
            int[] var6 = null;
            if (var4 != null) {
               var6 = a(var5, var4);
               if (var6 == null) {
                  return null;
               }
            }

            return new agN(var5, var6);
         }
      }
   }

   private static int a(String var0) {
      int var1 = afT.a((String)var0, -1);
      if (var1 >= 0) {
         return var1;
      } else if (var0.equals("farmer")) {
         return 0;
      } else if (var0.equals("librarian")) {
         return 1;
      } else if (var0.equals("priest")) {
         return 2;
      } else if (var0.equals("blacksmith")) {
         return 3;
      } else if (var0.equals("butcher")) {
         return 4;
      } else {
         return var0.equals("nitwit") ? 5 : -1;
      }
   }

   private static int[] a(int var0, String var1) {
      IntArraySet var2 = new IntArraySet();
      String[] var3 = afT.a(var1, ",");

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         int var6 = a(var0, var5);
         if (var6 < 0) {
            return null;
         }

         var2.add(var6);
      }

      int[] var7 = var2.toIntArray();
      return var7;
   }

   private static int a(int var0, String var1) {
      int var2 = afT.a((String)var1, -1);
      if (var2 >= 0) {
         return var2;
      } else {
         if (var0 == 0) {
            if (var1.equals("farmer")) {
               return 1;
            }

            if (var1.equals("fisherman")) {
               return 2;
            }

            if (var1.equals("shepherd")) {
               return 3;
            }

            if (var1.equals("fletcher")) {
               return 4;
            }
         }

         if (var0 == 1) {
            if (var1.equals("librarian")) {
               return 1;
            }

            if (var1.equals("cartographer")) {
               return 2;
            }
         }

         if (var0 == 2 && var1.equals("cleric")) {
            return 1;
         } else {
            if (var0 == 3) {
               if (var1.equals("armor")) {
                  return 1;
               }

               if (var1.equals("weapon")) {
                  return 2;
               }

               if (var1.equals("tool")) {
                  return 3;
               }
            }

            if (var0 == 4) {
               if (var1.equals("butcher")) {
                  return 1;
               }

               if (var1.equals("leather")) {
                  return 2;
               }
            }

            return var0 == 5 && var1.equals("nitwit") ? 1 : -1;
         }
      }
   }

   public int[] b(String var1) {
      var1 = var1.trim();
      IntRBTreeSet var2 = new IntRBTreeSet();
      String[] var3 = afT.a(var1, " ");

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         acC var6 = new acC(var5);
         SZ var7 = (SZ)SZ.a.a(var6);
         if (var7 == null) {
            this.b("Item not found: " + var5);
         } else {
            int var8 = SZ.a(var7);
            if (var8 < 0) {
               this.b("Item has no ID: " + var7 + ", name: " + var5);
            } else {
               var2.add(var8);
            }
         }
      }

      return var2.toIntArray();
   }

   public int[] c(String var1) {
      var1 = var1.trim();
      IntRBTreeSet var2 = new IntRBTreeSet();
      String[] var3 = afT.a(var1, " ");

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         acC var6 = new acC(var5);
         Class var7 = a(var6);
         if (var7 == null) {
            this.b("Entity not found: " + var5);
         } else {
            int var8 = this.a(var7);
            if (var8 < 0) {
               this.b("Entity has no ID: " + var7 + ", name: " + var5);
            } else {
               var2.add(var8);
            }
         }
      }

      return var2.toIntArray();
   }

   private static Class a(acC var0) {
      return (Class)Oc.a.a(var0);
   }

   private int a(Class var1) {
      return Oc.a.a(var1);
   }
}
