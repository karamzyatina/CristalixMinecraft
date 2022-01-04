import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.language.Language;
import dev.xdark.clientapi.language.LanguageManager;
import dev.xdark.clientapi.language.Locale;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.logging.log4j.Logger;

public final class IR implements IO, aoY, LanguageManager {
   private static final Logger a;
   private final JA a;
   private String a;
   protected static final IT a;
   private final Map<String, IQ> a = new HashMap();
   private ape a;

   public IR(JA var1, String var2) {
      this.a = var1;
      this.a = var2;
      IK.a(a);
   }

   public void a(List<IP> var1) {
      this.a.clear();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         IP var3 = (IP)var2.next();

         try {
            Jy var4 = (Jy)var3.a(this.a, "language");
            if (var4 != null) {
               Iterator var5 = var4.a().iterator();

               while(var5.hasNext()) {
                  IQ var6 = (IQ)var5.next();
                  this.a.putIfAbsent(var6.a(), var6);
               }
            }
         } catch (IOException | RuntimeException var7) {
            a.warn("Unable to parse language metadata section of resourcepack: {}", var3.getPackName(), var7);
         }
      }

   }

   public void onResourceManagerReload(IN var1) {
      ArrayList var2 = new ArrayList(2);
      var2.add("en_us");
      if (!"en_us".equals(this.a)) {
         var2.add(this.a);
      }

      a.a(var1, var2);
      Map var3 = a.a;
      this.a(var3);
   }

   public boolean isCurrentLanguageBidirectional() {
      return this.a() != null && this.a().isBidirectional();
   }

   public void a(IQ var1) {
      this.a = var1.a();
   }

   public IQ a() {
      String var1 = this.a.containsKey(this.a) ? this.a : "en_us";
      return (IQ)this.a.get(var1);
   }

   public IQ a(String var1) {
      return (IQ)this.a.get(var1);
   }

   static {
      a = sE.a;
      a = new IT();
   }

   private void a(Map var1) {
      String var2 = this.a;
      a.info("Current language: {}", var2);
      Map var3 = asM.a(var2.toLowerCase());
      if (var3 != null) {
         a.info("Injecting locale for: {}", var2);
         var1.putAll(var3);
      }

      EventBus var4 = aL.BUS;
      if (var4 != null) {
         var4.fireAndForget(new aL((Locale)d.a(a)));
      }

      adN.a(var1);
   }

   public Language getLanguage(String var1) {
      return (Language)d.a(this.a.get(var1));
   }

   public void setCurrentLanguage(Language var1) {
      this.a((IQ)d.a(var1));
   }

   public Language getCurrentLanguage() {
      return (Language)d.a(this.a);
   }

   public SortedSet getLanguages() {
      return new TreeSet(this.a.values());
   }

   public Locale getCurrentLocale() {
      return (Locale)d.a(a);
   }

   public boolean isCurrentLocaleUnicode() {
      return this.a.a() == apg.FANCY ? false : a.isUnicode();
   }

   public void a(ape var1) {
      this.a = var1;
   }
}
