import dev.xdark.clientapi.event.chat.TabComplete;
import dev.xdark.clientapi.math.BlockPos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class acL {
   protected final uZ a;
   protected final boolean a;
   protected boolean b;
   protected boolean c;
   protected int a;
   protected List<String> a = new ArrayList();
   protected final sE a;

   public acL(sE var1, uZ var2, boolean var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public void a() {
      if (this.b) {
         this.a.deleteFromCursor(0);
         this.a.deleteFromCursor(this.a.getNthWordFromPosWS(-1, this.a.getCursorPosition(), false) - this.a.getCursorPosition());
         if (this.a >= this.a.size()) {
            this.a = 0;
         }
      } else {
         int var1 = this.a.getNthWordFromPosWS(-1, this.a.getCursorPosition(), false);
         this.a.clear();
         this.a = 0;
         String var2 = this.a.getText().substring(0, this.a.getCursorPosition());
         this.a(var2);
         if (this.a.isEmpty()) {
            return;
         }

         this.b = true;
         this.a.deleteFromCursor(var1 - this.a.getCursorPosition());
      }

      this.a.writeText((String)this.a.get(this.a++));
   }

   private void a(String var1) {
      if (var1.length() >= 1 && this.a(var1)) {
         this.a.a.a.a((Ws)(new XP(var1, this.a(), this.a)));
         this.c = true;
      }

   }

   public abstract acV a();

   public void a(String... var1) {
      if (this.c) {
         this.b = false;
         this.a.clear();
         String[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            if (!var5.isEmpty()) {
               this.a.add(var5);
            }
         }

         String var6 = this.a.getText().substring(this.a.getNthWordFromPosWS(-1, this.a.getCursorPosition(), false));
         String var7 = acK.a(var1);
         if (!var7.isEmpty() && !var6.equalsIgnoreCase(var7)) {
            this.a.deleteFromCursor(0);
            this.a.deleteFromCursor(this.a.getNthWordFromPosWS(-1, this.a.getCursorPosition(), false) - this.a.getCursorPosition());
            this.a.writeText(var7);
         } else if (!this.a.isEmpty()) {
            this.b = true;
            this.a();
         }
      }

   }

   public void b() {
      this.b = false;
   }

   public void c() {
      this.c = false;
   }

   protected boolean a(String var1) {
      TabComplete var2 = (TabComplete)M.BUS.fire(new M(var1, this.a, (BlockPos)d.a(this.a())));
      if (!var2.isCancelled()) {
         String[] var3 = var2.getCompletions();
         if (var3 != null) {
            Arrays.sort(var3);
            this.c = true;
            this.a(var3);
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}
