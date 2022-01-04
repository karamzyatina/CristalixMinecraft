import dev.xdark.feder.QuietException;

public final class Dt extends QuietException {
   public static final Dt a = new Dt();

   private Dt() {
      super((String)null);
   }

   public Throwable fillInStackTrace() {
      return this;
   }

   public Throwable initCause(Throwable var1) {
      return this;
   }
}
