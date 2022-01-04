import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aiH {
   private final aiU a;

   public aiH(aiU var1) {
      this.a = var1;
   }

   public aiS a(String var1) {
      aiP var2 = this.a(var1);
      if (!(var2 instanceof aiS)) {
         throw new aiY("Not a float expression: " + var2.a());
      } else {
         return (aiS)var2;
      }
   }

   public aiQ a(String var1) {
      aiP var2 = this.a(var1);
      if (!(var2 instanceof aiQ)) {
         throw new aiY("Not a boolean expression: " + var2.a());
      } else {
         return (aiQ)var2;
      }
   }

   public aiP a(String var1) {
      try {
         aiZ[] var2 = aja.a(var1);
         ArrayDeque var3 = new ArrayDeque(Arrays.asList(var2));
         return this.a((Deque)var3);
      } catch (IOException var4) {
         throw new aiY(var4.getMessage(), var4);
      }
   }

   private aiP a(Deque<aiZ> var1) {
      if (var1.isEmpty()) {
         return null;
      } else {
         LinkedList var2 = new LinkedList();
         LinkedList var3 = new LinkedList();
         aiP var4 = this.b(var1);
         a((Object)var4, (String)"Missing expression");
         var2.add(var4);

         while(true) {
            aiZ var5 = (aiZ)var1.poll();
            if (var5 == null) {
               return this.a((List)var2, (List)var3);
            }

            if (var5.a() != ajb.OPERATOR) {
               throw new aiY("Invalid operator: " + var5);
            }

            aiP var6 = this.b(var1);
            a((Object)var6, (String)"Missing expression");
            var3.add(var5);
            var2.add(var6);
         }
      }
   }

   private aiP a(List<aiP> var1, List<aiZ> var2) {
      LinkedList var3 = new LinkedList();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         aiZ var5 = (aiZ)var4.next();
         aiN var6 = aiN.a(var5.a());
         a((Object)var6, (String)("Invalid operator: " + var5));
         var3.add(var6);
      }

      return b(var1, var3);
   }

   private static aiP b(List<aiP> var0, List<aiN> var1) {
      if (var0.size() != var1.size() + 1) {
         throw new aiY("Invalid infix expression, expressions: " + var0.size() + ", operators: " + var1.size());
      } else if (var0.size() == 1) {
         return (aiP)var0.get(0);
      } else {
         int var2 = Integer.MAX_VALUE;
         int var3 = Integer.MIN_VALUE;

         aiN var5;
         for(Iterator var4 = var1.iterator(); var4.hasNext(); var3 = Math.max(var5.a(), var3)) {
            var5 = (aiN)var4.next();
            var2 = Math.min(var5.a(), var2);
         }

         if (var3 >= var2 && var3 - var2 <= 10) {
            for(int var6 = var3; var6 >= var2; --var6) {
               a(var0, var1, var6);
            }

            if (var0.size() == 1 && var1.size() == 0) {
               return (aiP)var0.get(0);
            } else {
               throw new aiY("Error merging operators, expressions: " + var0.size() + ", operators: " + var1.size());
            }
         } else {
            throw new aiY("Invalid infix precedence, min: " + var2 + ", max: " + var3);
         }
      }
   }

   private static void a(List<aiP> var0, List<aiN> var1, int var2) {
      for(int var3 = 0; var3 < var1.size(); ++var3) {
         aiN var4 = (aiN)var1.get(var3);
         if (var4.a() == var2) {
            var1.remove(var3);
            aiP var5 = (aiP)var0.remove(var3);
            aiP var6 = (aiP)var0.remove(var3);
            aiP var7 = a(var4, new aiP[]{var5, var6});
            var0.add(var3, var7);
            --var3;
         }
      }

   }

   private aiP b(Deque<aiZ> var1) {
      // $FF: Couldn't be decompiled
   }

   private static aiP a(aiZ var0) {
      float var1 = afT.a(var0.a(), Float.NaN);
      if (var1 == Float.NaN) {
         throw new aiY("Invalid float value: " + var0);
      } else {
         return new aiE(var1);
      }
   }

   private aiN a(aiZ var1, Deque<aiZ> var2) {
      aiZ var3 = (aiZ)var2.peek();
      aiN var4;
      if (var3 != null && var3.a() == ajb.BRACKET_OPEN) {
         var4 = aiN.a(var1.a());
         a((Object)var4, (String)("Unknown function: " + var1));
         return var4;
      } else {
         var4 = aiN.a(var1.a());
         if (var4 == null) {
            return null;
         } else if (var4.a(new aiP[0]) > 0) {
            throw new aiY("Missing arguments: " + var4);
         } else {
            return var4;
         }
      }
   }

   private aiP a(aiN var1, Deque<aiZ> var2) {
      if (var1.a(new aiP[0]) == 0) {
         aiZ var3 = (aiZ)var2.peek();
         if (var3 == null || var3.a() != ajb.BRACKET_OPEN) {
            return a(var1, new aiP[0]);
         }
      }

      var2.poll();
      Deque var5 = a(var2, ajb.BRACKET_CLOSE, true);
      aiP[] var4 = this.a(var5);
      return a(var1, var4);
   }

   private aiP[] a(Deque<aiZ> var1) {
      ArrayList var2 = new ArrayList();

      while(true) {
         Deque var3 = a(var1, ajb.COMMA, false);
         aiP var4 = this.a(var3);
         if (var4 == null) {
            aiP[] var5 = (aiP[])var2.toArray(new aiP[0]);
            return var5;
         }

         var2.add(var4);
      }
   }

   private static aiP a(aiN var0, aiP[] var1) {
      aiJ[] var2 = var0.a(var1);
      if (var1.length != var2.length) {
         throw new aiY("Invalid number of arguments, function: \"" + var0.a() + "\", count arguments: " + var1.length + ", should be: " + var2.length);
      } else {
         for(int var3 = 0; var3 < var1.length; ++var3) {
            aiP var4 = var1[var3];
            aiJ var5 = var4.a();
            aiJ var6 = var2[var3];
            if (var5 != var6) {
               throw new aiY("Invalid argument type, function: \"" + var0.a() + "\", index: " + var3 + ", type: " + var5 + ", should be: " + var6);
            }
         }

         if (var0.a() == aiJ.FLOAT) {
            return new aiL(var0, var1);
         } else if (var0.a() == aiJ.BOOL) {
            return new aiK(var0, var1);
         } else if (var0.a() == aiJ.FLOAT_ARRAY) {
            return new aiM(var0, var1);
         } else {
            throw new aiY("Unknown function type: " + var0.a() + ", function: " + var0.a());
         }
      }
   }

   private aiP b(aiZ var1) {
      if (this.a == null) {
         throw new aiY("Model variable not found: " + var1);
      } else {
         aiP var2 = this.a.a(var1.a());
         if (var2 == null) {
            throw new aiY("Model variable not found: " + var1);
         } else {
            return var2;
         }
      }
   }

   private aiP c(Deque<aiZ> var1) {
      Deque var2 = a(var1, ajb.BRACKET_CLOSE, true);
      return this.a(var2);
   }

   private static Deque<aiZ> a(Deque<aiZ> var0, ajb var1, boolean var2) {
      ArrayDeque var3 = new ArrayDeque();
      int var4 = 0;
      Iterator var5 = var0.iterator();

      while(var5.hasNext()) {
         aiZ var6 = (aiZ)var5.next();
         var5.remove();
         if (var4 == 0 && var6.a() == var1) {
            return var3;
         }

         var3.add(var6);
         if (var6.a() == ajb.BRACKET_OPEN) {
            ++var4;
         }

         if (var6.a() == ajb.BRACKET_CLOSE) {
            --var4;
         }
      }

      if (var2) {
         throw new aiY("Missing end token: " + var1);
      } else {
         return var3;
      }
   }

   private static void a(Object var0, String var1) {
      if (var0 == null) {
         throw new aiY(var1);
      }
   }
}
