import dev.xdark.feder.IOUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;

public final class Kn {
   private static final Logger a;
   private final String a;
   private final Throwable a;
   private final Ku a = new Ku("System Details");
   private final List<Ku> a = new ArrayList();
   private File a;
   private boolean a = true;
   private StackTraceElement[] a = new StackTraceElement[0];
   private String b;
   private String c;

   public Kn(String var1, Throwable var2) {
      this.a = var1;
      this.a = var2;
      this.a();
   }

   private void a() {
      this.a.a((String)"Operating System", (KB)(new Ko(this)));
      this.a.a((String)"Java Version", (KB)(new Kp(this)));
      this.a.a((String)"Java VM Version", (KB)(new Kq(this)));
      this.a.a((String)"Memory", (KB)(new Kr(this)));
      this.a.a((String)"JVM Flags", (KB)(new Ks(this)));
      this.a.a((String)"Display Driver", (KB)(new Kt(this)));
   }

   public void a(String var1) {
      this.b = var1;
   }

   public String a() {
      return this.a;
   }

   public Throwable a() {
      return this.a;
   }

   public void a(StringBuilder var1) {
      if ((this.a == null || this.a.length <= 0) && !this.a.isEmpty()) {
         this.a = (StackTraceElement[])La.a(((Ku)this.a.get(0)).a(), 0, 1);
      }

      if (this.a != null && this.a.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Thread: ").append(Thread.currentThread().getName()).append('\n');
         var1.append("Stacktrace:\n");
         StackTraceElement[] var2 = this.a;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            StackTraceElement var5 = var2[var4];
            var1.append('\t').append("at ").append(var5);
            var1.append('\n');
         }

         var1.append('\n');
      }

      Iterator var6 = this.a.iterator();

      while(var6.hasNext()) {
         Ku var7 = (Ku)var6.next();
         var7.a(var1);
         var1.append("\n\n");
      }

      this.a.a(var1);
   }

   public String b() {
      PrintWriter var1 = null;
      Object var2 = this.a;
      if (((Throwable)var2).getMessage() == null) {
         if (var2 instanceof NullPointerException) {
            var2 = new NullPointerException(this.a);
         } else if (var2 instanceof StackOverflowError) {
            var2 = new StackOverflowError(this.a);
         } else if (var2 instanceof OutOfMemoryError) {
            var2 = new OutOfMemoryError(this.a);
         }

         ((Throwable)var2).setStackTrace(this.a.getStackTrace());
      }

      String var3;
      try {
         StringWriter var4 = new StringWriter();
         var1 = new PrintWriter(var4);
         ((Throwable)var2).printStackTrace(var1);
         var3 = var4.toString();
      } finally {
         IOUtil.closeQuietly(var1);
      }

      return var3;
   }

   public String c() {
      String var1 = this.c;
      if (var1 != null) {
         return var1;
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("---- Minecraft Crash Report ----\n");
         var2.append("// ");
         String var3 = this.b;
         if (var3 == null) {
            var3 = d();
         }

         var2.append(var3);
         var2.append("\n\n");
         var2.append("Time: ");
         var2.append((new SimpleDateFormat()).format(new Date()));
         var2.append('\n');
         var2.append("Description: ");
         var2.append(this.a);
         var2.append("\n\n");
         var2.append(this.b());
         var2.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
         char[] var4 = new char[87];
         Arrays.fill(var4, '-');
         var2.append(var4);
         var2.append("\n\n");
         this.a(var2);
         return this.c = var2.toString();
      }
   }

   public File a() {
      return this.a;
   }

   public boolean a(File var1) {
      if (this.a != null) {
         return false;
      } else {
         if (var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         OutputStreamWriter var2 = null;

         try {
            var2 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
            var2.write(this.c());
            this.a = var1;
            boolean var3 = true;
            return var3;
         } catch (Throwable var7) {
            a.error("Could not save crash report to {}", var1, var7);
         } finally {
            IOUtil.closeQuietly(var2);
         }

         return false;
      }
   }

   public Ku a() {
      return this.a;
   }

   public Ku a(String var1) {
      return this.a(var1, 1);
   }

   public Ku a(String var1, int var2) {
      Ku var3 = new Ku(var1);
      if (this.a) {
         int var4 = var3.a(var2);
         StackTraceElement[] var5 = this.a.getStackTrace();
         StackTraceElement var6 = null;
         StackTraceElement var7 = null;
         int var8 = var5.length - var4;
         if (var8 < 0) {
            System.out.println("Negative index in crash report handler (" + var5.length + '/' + var4 + ')');
         }

         if (var5 != null && 0 <= var8 && var8 < var5.length) {
            var6 = var5[var8];
            if (var5.length + 1 - var4 < var5.length) {
               var7 = var5[var5.length + 1 - var4];
            }
         }

         this.a = var3.a(var6, var7);
         if (var4 > 0 && !this.a.isEmpty()) {
            Ku var9 = (Ku)this.a.get(this.a.size() - 1);
            var9.a(var4);
         } else if (var5 != null && var5.length >= var4 && 0 <= var8 && var8 < var5.length) {
            this.a = new StackTraceElement[var8];
            System.arraycopy(var5, 0, this.a, 0, this.a.length);
         } else {
            this.a = false;
         }
      }

      this.a.add(var3);
      return var3;
   }

   private static String d() {
      String[] var0 = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};

      try {
         return var0[(int)(System.nanoTime() % (long)var0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }

   public static Kn a(Throwable var0, String var1) {
      Kn var2;
      if (var0 instanceof acB) {
         var2 = ((acB)var0).a();
      } else {
         var2 = new Kn(var1, var0);
      }

      return var2;
   }

   static {
      a = sE.a;
   }
}
