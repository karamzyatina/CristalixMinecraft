import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.apache.logging.log4j.Logger;

public final class Oc {
   public static final acC a = new acC("lightning_bolt");
   private static final acC b = new acC("player");
   private static final Logger a;
   public static final adq<acC, Class<? extends NN>> a;
   public static final Map<acC, Oe> a;
   public static final Set<acC> a;
   private static final List<String> a;
   private static final Map<Class<? extends NN>, Function<aej, ? extends NN>> b;

   public static acC a(NN var0) {
      return a(var0.getClass());
   }

   public static acC a(Class<? extends NN> var0) {
      return (acC)a.b(var0);
   }

   public static String a(NN var0) {
      int var1 = a.a(var0.getClass());
      return var1 == -1 ? null : (String)a.get(var1);
   }

   public static String a(acC var0) {
      int var1 = a.a(a.a(var0));
      return var1 == -1 ? null : (String)a.get(var1);
   }

   public static Class<? extends NN> a(int var0) {
      return (Class)a.a(var0);
   }

   public static Class<? extends NN> a(String var0) {
      return (Class)a.a(new acC(var0));
   }

   public static NN a(Class<? extends NN> var0, aej var1) {
      if (var0 == null) {
         return null;
      } else {
         Function var2 = (Function)b.get(var0);
         return var2 == null ? null : (NN)var2.apply(var1);
      }
   }

   public static NN a(int var0, aej var1) {
      return a(a(var0), var1);
   }

   public static NN a(acC var0, aej var1) {
      return a((Class)a.a(var0), var1);
   }

   public static NN a(VR var0, aej var1) {
      acC var2 = new acC(var0.getString("id"));
      NN var3 = a(var2, var1);
      if (var3 == null) {
         a.warn("Skipping Entity with id {}", var2);
      } else {
         var3.a(var0);
      }

      return var3;
   }

   public static Set<acC> a() {
      return a;
   }

   public static boolean a(NN var0, acC var1) {
      acC var2 = a(var0.getClass());
      if (var2 != null) {
         return var2.equals(var1);
      } else if (var0 instanceof Rn) {
         return b.equals(var1);
      } else {
         return var0 instanceof OY && a.equals(var1);
      }
   }

   public static boolean a(acC var0) {
      return b.equals(var0) || a().contains(var0);
   }

   public static String a() {
      StringBuilder var0 = new StringBuilder();
      Iterator var1 = a().iterator();

      while(var1.hasNext()) {
         acC var2 = (acC)var1.next();
         var0.append(var2).append(", ");
      }

      var0.append(b);
      return var0.toString();
   }

   public static void a() {
      a(1, "item", Pm.class, "Item", Pm::new);
      a(2, "xp_orb", PE.class, "XPOrb", PE::new);
      a(3, "area_effect_cloud", NU.class, "AreaEffectCloud", NU::new);
      a(4, "elder_guardian", PL.class, "ElderGuardian", PL::new);
      a(5, "wither_skeleton", Qt.class, "WitherSkeleton", Qt::new);
      a(6, "stray", Qo.class, "Stray", Qo::new);
      a(7, "egg", Rz.class, "ThrownEgg", Rz::new);
      a(8, "leash_knot", Ob.class, "LeashKnot", Ob::new);
      a(9, "painting", PB.class, "Painting", PB::new);
      a(10, "arrow", RM.class, "Arrow", RM::new);
      a(11, "snowball", RJ.class, "Snowball", RJ::new);
      a(12, "fireball", RE.class, "Fireball", RE::new);
      a(13, "small_fireball", RI.class, "SmallFireball", RI::new);
      a(14, "ender_pearl", Pi.class, "ThrownEnderpearl", Pi::new);
      a(15, "eye_of_ender_signal", Ph.class, "EyeOfEnderSignal", Ph::new);
      a(16, "potion", RG.class, "ThrownPotion", RG::new);
      a(17, "xp_bottle", Pj.class, "ThrownExpBottle", Pj::new);
      a(18, "item_frame", Pn.class, "ItemFrame", Pn::new);
      a(19, "wither_skull", RN.class, "WitherSkull", RN::new);
      a(20, "tnt", PD.class, "PrimedTnt", PD::new);
      a(21, "falling_block", Pk.class, "FallingSand", Pk::new);
      a(22, "fireworks_rocket", Pl.class, "FireworksRocketEntity", Pl::new);
      a(23, "husk", PV.class, "Husk", PV::new);
      a(24, "spectral_arrow", RK.class, "SpectralArrow", RK::new);
      a(25, "shulker_bullet", RH.class, "ShulkerBullet", RH::new);
      a(26, "dragon_fireball", Ry.class, "DragonFireball", Ry::new);
      a(27, "zombie_villager", Qw.class, "ZombieVillager", Qw::new);
      a(28, "skeleton_horse", QW.class, "SkeletonHorse", QW::new);
      a(29, "zombie_horse", Rk.class, "ZombieHorse", Rk::new);
      a(30, "armor_stand", Pa.class, "ArmorStand", Pa::new);
      a(31, "donkey", QF.class, "Donkey", QF::new);
      a(32, "mule", QM.class, "Mule", QM::new);
      a(33, "evocation_fangs", RA.class, "EvocationFangs", RA::new);
      a(34, "evocation_illager", PO.class, "EvocationIllager", PO::new);
      a(35, "vex", Qp.class, "Vex", Qp::new);
      a(36, "vindication_illager", Qr.class, "VindicationIllager", Qr::new);
      a(37, "illusion_illager", PW.class, "IllusionIllager", PW::new);
      a(40, "commandblock_minecart", Ps.class, Pq.COMMAND_BLOCK.a(), Ps::new);
      a(41, "boat", Pc.class, "Boat", Pc::new);
      a(42, "minecart", Pv.class, Pq.RIDEABLE.a(), Pv::new);
      a(43, "chest_minecart", Pr.class, Pq.CHEST.a(), Pr::new);
      a(44, "furnace_minecart", Pw.class, Pq.FURNACE.a(), Pw::new);
      a(45, "tnt_minecart", PA.class, Pq.TNT.a(), PA::new);
      a(46, "hopper_minecart", Px.class, Pq.HOPPER.a(), Px::new);
      a(47, "spawner_minecart", Py.class, Pq.SPAWNER.a(), Py::new);
      a(50, "creeper", PK.class, "Creeper", PK::new);
      a(51, "skeleton", Qg.class, "Skeleton", Qg::new);
      a(52, "spider", Qm.class, "Spider", Qm::new);
      a(53, "giant", PR.class, "Giant", PR::new);
      a(54, "zombie", Qu.class, "Zombie", Qu::new);
      a(55, "slime", Qh.class, "Slime", Qh::new);
      a(56, "ghast", PP.class, "Ghast", PP::new);
      a(57, "zombie_pigman", Qa.class, "PigZombie", Qa::new);
      a(58, "enderman", PM.class, "Enderman", PM::new);
      a(59, "cave_spider", PJ.class, "CaveSpider", PJ::new);
      a(60, "silverfish", Qf.class, "Silverfish", Qf::new);
      a(61, "blaze", PI.class, "Blaze", PI::new);
      a(62, "magma_cube", PY.class, "LavaSlime", PY::new);
      a(63, "ender_dragon", OG.class, "EnderDragon", OG::new);
      a(64, "wither", OH.class, "WitherBoss", OH::new);
      a(65, "bat", QC.class, "Bat", QC::new);
      a(66, "witch", Qs.class, "Witch", Qs::new);
      a(67, "endermite", PN.class, "Endermite", PN::new);
      a(68, "guardian", PT.class, "Guardian", PT::new);
      a(69, "shulker", Qc.class, "Shulker", Qc::new);
      a(90, "pig", QQ.class, "Pig", QQ::new);
      a(91, "sheep", QU.class, "Sheep", QU::new);
      a(92, "cow", QE.class, "Cow", QE::new);
      a(93, "chicken", QD.class, "Chicken", QD::new);
      a(94, "squid", QX.class, "Squid", QX::new);
      a(95, "wolf", Rj.class, "Wolf", Rj::new);
      a(96, "mooshroom", QL.class, "MushroomCow", QL::new);
      a(97, "snowman", Qj.class, "SnowMan", Qj::new);
      a(98, "ocelot", QN.class, "Ozelot", QN::new);
      a(99, "villager_golem", PX.class, "VillagerGolem", PX::new);
      a(100, "horse", QH.class, "Horse", QH::new);
      a(101, "rabbit", QR.class, "Rabbit", QR::new);
      a(102, "polar_bear", Qb.class, "PolarBear", Qb::new);
      a(103, "llama", QJ.class, "Llama", QJ::new);
      a(104, "llama_spit", RF.class, "LlamaSpit", RF::new);
      a(105, "parrot", QO.class, "Parrot", QO::new);
      a(120, "villager", QZ.class, "Villager", QZ::new);
      a(200, "ender_crystal", Pg.class, "EnderCrystal", Pg::new);
      a("bat", 4996656, 986895);
      a("blaze", 16167425, 16775294);
      a("cave_spider", 803406, 11013646);
      a("chicken", 10592673, 16711680);
      a("cow", 4470310, 10592673);
      a("creeper", 894731, 0);
      a("donkey", 5457209, 8811878);
      a("elder_guardian", 13552826, 7632531);
      a("enderman", 1447446, 0);
      a("endermite", 1447446, 7237230);
      a("evocation_illager", 9804699, 1973274);
      a("ghast", 16382457, 12369084);
      a("guardian", 5931634, 15826224);
      a("horse", 12623485, 15656192);
      a("husk", 7958625, 15125652);
      a("llama", 12623485, 10051392);
      a("magma_cube", 3407872, 16579584);
      a("mooshroom", 10489616, 12040119);
      a("mule", 1769984, 5321501);
      a("ocelot", 15720061, 5653556);
      a("parrot", 894731, 16711680);
      a("pig", 15771042, 14377823);
      a("polar_bear", 15921906, 9803152);
      a("rabbit", 10051392, 7555121);
      a("sheep", 15198183, 16758197);
      a("shulker", 9725844, 5060690);
      a("silverfish", 7237230, 3158064);
      a("skeleton", 12698049, 4802889);
      a("skeleton_horse", 6842447, 15066584);
      a("slime", 5349438, 8306542);
      a("spider", 3419431, 11013646);
      a("squid", 2243405, 7375001);
      a("stray", 6387319, 14543594);
      a("vex", 8032420, 15265265);
      a("villager", 5651507, 12422002);
      a("vindication_illager", 9804699, 2580065);
      a("witch", 3407872, 5349438);
      a("wither_skeleton", 1315860, 4672845);
      a("wolf", 14144467, 13545366);
      a("zombie", 44975, 7969893);
      a("zombie_horse", 3232308, 9945732);
      a("zombie_pigman", 15373203, 5009705);
      a("zombie_villager", 5651507, 7969893);
      a.add(a);
   }

   public static <T extends NN> void a(int var0, String var1, Class<T> var2, String var3, Function<aej, T> var4) {
      acC var5 = new acC(var1);
      a.a(var0, var5, var2);
      a.add(var5);

      while(a.size() <= var0) {
         a.add((Object)null);
      }

      a.set(var0, var3);
      b.put(var2, var4);
   }

   public static <T extends NN> void a(int var0, String var1, Class<T> var2, String var3) {
      a(var0, var1, var2, var3, new Od(var2));
   }

   protected static Oe a(String var0, int var1, int var2) {
      acC var3 = new acC(var0);
      return (Oe)a.put(var3, new Oe(var3, var1, var2));
   }

   static {
      a = sE.a;
      a = new adq(84);
      a = new LinkedHashMap(43, 1.0F);
      a = new HashSet(84, 1.0F);
      a = new ArrayList(201);
      b = new Reference2ReferenceOpenHashMap(84, 1.0F);
   }
}
