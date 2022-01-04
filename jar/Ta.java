import java.util.HashMap;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

public final class tA extends SoundSystem {
   public boolean playing(String var1) {
      synchronized(SoundSystemConfig.THREAD_SYNC) {
         if (this.soundLibrary == null) {
            return false;
         } else {
            HashMap var3 = this.soundLibrary.getSources();
            if (var3 == null) {
               return false;
            } else {
               Source var4 = (Source)var3.get(var1);
               if (var4 == null) {
                  return false;
               } else {
                  return var4.playing() || var4.paused() || var4.preLoad;
               }
            }
         }
      }
   }
}
