import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.gui.Label;
import java.util.ArrayList;
import java.util.List;

public class ul extends tJ implements Label {
   public int a;
   public int b;
   public int c;
   public int d;
   public List<String> a;
   public int e;
   public boolean a;
   public boolean b = true;
   public boolean c;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;

   public ul(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.e = var1;
      this.c = var2;
      this.d = var3;
      this.a = var4;
      this.b = var5;
      this.a = new ArrayList();
      this.a = false;
      this.c = false;
      this.f = var6;
      this.g = -1;
      this.h = -1;
      this.i = -1;
      this.j = 0;
   }

   public void a(String var1) {
      this.a.add(IK.a(var1));
   }

   public ul a() {
      this.a = true;
      return this;
   }

   public void a(sE var1, int var2, int var3) {
      this.a = var1.a;
      List var4 = this.a;
      if (this.b) {
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         this.a();
         int var5 = this.d + this.b / 2 + this.j / 2;
         int var6 = var5 - var4.size() * 10 / 2;

         for(int var7 = 0; var7 < var4.size(); ++var7) {
            if (this.a) {
               this.a(var1.a, (String)var4.get(var7), this.c + this.a / 2, var6 + var7 * 10, this.f);
            } else {
               this.b(var1.a, (String)var4.get(var7), this.c, var6 + var7 * 10, this.f);
            }
         }
      }

   }

   protected void a() {
      if (this.c) {
         int var1 = this.a + this.j * 2;
         int var2 = this.b + this.j * 2;
         int var3 = this.c - this.j;
         int var4 = this.d - this.j;
         a(var3, var4, var3 + var1, var4 + var2, this.g);
         this.a(var3, var3 + var1, var4, this.h);
         this.a(var3, var3 + var1, var4 + var2, this.i);
         this.b(var3, var4, var4 + var2, this.h);
         this.b(var3 + var1, var4, var4 + var2, this.i);
      }

   }

   public void setX(int var1) {
      this.c = var1;
   }

   public void setY(int var1) {
      this.d = var1;
   }

   public void setPos(int var1, int var2) {
      this.c = var1;
      this.d = var2;
   }

   public void setWidth(int var1) {
      this.a = var1;
   }

   public void setHeight(int var1) {
      this.b = var1;
   }

   public void setDimension(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void setContent(List var1) {
      this.a = var1;
   }

   public void setCentered(boolean var1) {
      this.a = var1;
   }

   public void setVisible(boolean var1) {
      this.b = var1;
   }

   public void setBackgroundEnabled(boolean var1) {
      this.c = var1;
   }

   public void setBackgroundColor(int var1) {
      this.g = var1;
   }

   public void setTextColor(int var1) {
      this.f = var1;
   }

   public void setUlColor(int var1) {
      this.h = var1;
   }

   public void setBrColor(int var1) {
      this.i = var1;
   }

   public void setBorder(int var1) {
      this.j = var1;
   }

   public void draw(Minecraft var1) {
      this.a((sE)d.a(var1), 0, 0);
   }

   public void drawBackground() {
      this.a();
   }

   // $FF: synthetic method
   public int getId() {
      return this.e;
   }

   // $FF: synthetic method
   public int getX() {
      return this.c;
   }

   // $FF: synthetic method
   public int getY() {
      return this.d;
   }

   // $FF: synthetic method
   public int getWidth() {
      return this.a;
   }

   // $FF: synthetic method
   public int getHeight() {
      return this.b;
   }

   // $FF: synthetic method
   public List getContent() {
      return this.a;
   }

   // $FF: synthetic method
   public boolean isCentered() {
      return this.a;
   }

   // $FF: synthetic method
   public boolean isVisible() {
      return this.b;
   }

   // $FF: synthetic method
   public boolean isBackgroundEnabled() {
      return this.c;
   }

   // $FF: synthetic method
   public int getBackgroundColor() {
      return this.g;
   }

   // $FF: synthetic method
   public int getTextColor() {
      return this.f;
   }

   // $FF: synthetic method
   public int getUlColor() {
      return this.h;
   }

   // $FF: synthetic method
   public int getBrColor() {
      return this.i;
   }

   // $FF: synthetic method
   public int getBorder() {
      return this.j;
   }
}
