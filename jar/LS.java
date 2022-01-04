import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayImplementation;
import org.lwjgl.opengl.DrawableLWJGL;

public final class Ls {
   private static final DisplayImplementation a;
   private static final DrawableLWJGL a;

   private Ls() {
   }

   public static boolean a() {
      return Display.window_created;
   }

   public static boolean b() {
      return a.isCloseRequested();
   }

   public static boolean c() {
      return a.isActive();
   }

   public static void a() {
      DisplayImplementation var0 = a;
      if (var0.isVisible() || var0.isDirty()) {
         try {
            a.swapBuffers();
         } catch (LWJGLException var2) {
            throw new RuntimeException(var2);
         }
      }

      boolean var1 = Display.window_resized = (!Display.fullscreen || !Display.current_mode.isFullscreenCapable()) && var0.wasResized();
      if (var1) {
         Display.width = var0.getWidth();
         Display.height = var0.getHeight();
      }

      var0.update();
      Lv.a();
      Lv.d();
      Lu.a();
   }

   public static boolean d() {
      return Display.window_resized;
   }

   public static boolean e() {
      return Display.fullscreen && Display.current_mode.isFullscreenCapable();
   }

   public static int a() {
      return e() ? 0 : a.getX();
   }

   public static int b() {
      return e() ? 0 : a.getY();
   }

   public static int c() {
      return e() ? Display.current_mode.getWidth() : Display.width;
   }

   public static int d() {
      return e() ? Display.current_mode.getHeight() : Display.height;
   }

   public static void a(int var0) {
      Lx.a(var0);
   }

   static {
      a = Display.display_impl;
      a = Display.drawable;
   }
}
