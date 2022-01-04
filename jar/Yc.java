import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.event.chat.ChatReceive;
import dev.xdark.clientapi.network.ClientConnection;
import dev.xdark.clientapi.network.NetworkPlayerInfo;
import dev.xdark.clientapi.network.Packet;
import dev.xdark.clientapi.text.Text;
import dev.xdark.feder.ChunkBiomeRegistry;
import dev.xdark.feder.ChunkLightRegistry;
import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class yC implements Xe, ClientConnection {
   private static final Logger a;
   private final Wp a;
   private final GameProfile a;
   private final uI a;
   public final sE a;
   private yw a;
   private boolean a;
   private final Map<UUID, yF> a = new HashMap();
   private final Map<String, yF> b = new HashMap();
   private final yn a;
   private final Random a = new Random();
   private boolean b = true;
   private boolean c;

   public yC(sE var1, uI var2, Wp var3, GameProfile var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
      this.a = new yn(var1);
   }

   public void b() {
      this.a = null;
   }

   public void a(YG var1) {
      this.b(var1);
      sE var2 = this.a;
      tE var3 = var2.a;
      boolean var4 = var3 != null;
      var2.a = null;
      this.a = false;
      this.a.a = new yr(var2, this);
      this.a = new yw(var2, this, new aes(var1.a(), var1.a(), var1.a(), this.a(var1)), var1.b(), var1.a());
      var2.a(this.a);
      tE var5 = var2.a;
      if (var3 != null) {
         var5.a(var3);
      }

      var5.h = var1.b();
      var2.a((uI)null);
      var5.setEntityId(var1.a());
      var5.setReducedDebug(var1.b());
      var2.a.a(var1.a());
      var2.a.c();
      this.a(var1, new CallbackInfo("handleJoinGame", false));
      if (var4) {
         this.a.clear();
         this.b.clear();
         var5.a().a();
         var2.a().a();
         this.a.a();
         var2.a.a().b();
         var2.a.a((String)null, (String)null, -1, -1, -1);
      }

      ByteBuf var6 = Unpooled.buffer();
      NetUtil.writeUtf8("Cristalix", var6);
      this.a.a((Ws)(new Xq("MC|Brand", var6)));
      JH var7 = this.a.a;
      La.a(var7::a);
      this.a.d();
   }

   public void a(Zr var1) {
      double var2 = var1.a();
      double var4 = var1.b();
      double var6 = var1.c();
      Object var8 = null;
      int var9 = var1.g();
      switch(var9) {
      case 1:
         var8 = new Pc(this.a, var2, var4, var6);
         break;
      case 2:
         var8 = new Pm(this.a, var2, var4, var6);
         break;
      case 3:
         var8 = new NU(this.a, var2, var4, var6);
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 69:
      case 74:
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 92:
      default:
         break;
      case 10:
         var8 = Po.a(this.a, var2, var4, var6, Pq.a(var1.h()));
         break;
      case 50:
         var8 = new PD(this.a, var2, var4, var6, (Oh)null);
         break;
      case 51:
         var8 = new Pg(this.a, var2, var4, var6);
         break;
      case 60:
         var8 = new RM(this.a, var2, var4, var6);
         break;
      case 61:
         var8 = new RJ(this.a, var2, var4, var6);
         break;
      case 62:
         var8 = new Rz(this.a, var2, var4, var6);
         break;
      case 63:
         var8 = new RE(this.a, var2, var4, var6, (double)var1.b() / iM.a(iM.a(4533958986747109221L) ^ iM.a(iM.a(-9103071914947010406L) ^ -1L)), (double)var1.c() / iM.a(iM.a(-104205347499282357L) ^ iM.a(iM.a(4741575957551517620L) ^ -1L)), (double)var1.d() / iM.a(iM.a(-1696216773122603565L) ^ iM.a(iM.a(6284047787273763372L) ^ -1L)));
         var1.d(0);
         break;
      case 64:
         var8 = new RI(this.a, var2, var4, var6, (double)var1.b() / iM.a(iM.a(3826578204546082685L) ^ iM.a(iM.a(-8477459613480429438L) ^ -1L)), (double)var1.c() / iM.a(iM.a(-1832358475282947735L) ^ iM.a(iM.a(6472403097613934230L) ^ -1L)), (double)var1.d() / iM.a(iM.a(-193719245376241427L) ^ iM.a(iM.a(4760158161297391378L) ^ -1L)));
         var1.d(0);
         break;
      case 65:
         var8 = new Pi(this.a, var2, var4, var6);
         break;
      case 66:
         var8 = new RN(this.a, var2, var4, var6, (double)var1.b() / iM.a(iM.a(1182510888803937283L) ^ iM.a(iM.a(-5824948048436964356L) ^ -1L)), (double)var1.c() / iM.a(iM.a(-5172633561483627389L) ^ iM.a(iM.a(538077701198498684L) ^ -1L)), (double)var1.d() / iM.a(iM.a(600953521148126360L) ^ iM.a(iM.a(-5253523779942737049L) ^ -1L)));
         var1.d(0);
         break;
      case 67:
         var8 = new RH(this.a, var2, var4, var6, (double)var1.b() / iM.a(iM.a(-7364575369883256570L) ^ iM.a(iM.a(2777448043173873401L) ^ -1L)), (double)var1.c() / iM.a(iM.a(-2667775099272873464L) ^ iM.a(iM.a(7330337719740712439L) ^ -1L)), (double)var1.d() / iM.a(iM.a(4529099915700080249L) ^ iM.a(iM.a(-9107923730596499066L) ^ -1L)));
         var1.d(0);
         break;
      case 68:
         var8 = new RF(this.a, var2, var4, var6, (double)var1.b() / iM.a(iM.a(6470002712125399377L) ^ iM.a(iM.a(-1834461689421783378L) ^ -1L)), (double)var1.c() / iM.a(iM.a(8866689617499078471L) ^ iM.a(iM.a(-4301939551438192456L) ^ -1L)), (double)var1.d() / iM.a(iM.a(3251655385751880486L) ^ iM.a(iM.a(-7899159094965699367L) ^ -1L)));
         break;
      case 70:
         var8 = new Pk(this.a, var2, var4, var6, mY.c(var1.h() & '\uffff'));
         var1.d(0);
         break;
      case 71:
         var8 = new Pn(this.a, new acV(var2, var4, var6), abP.b(var1.h()));
         var1.d(0);
         break;
      case 72:
         var8 = new Ph(this.a, var2, var4, var6);
         break;
      case 73:
         var8 = new RG(this.a, var2, var4, var6, Vh.a);
         var1.d(0);
         break;
      case 75:
         var8 = new Pj(this.a, var2, var4, var6);
         var1.d(0);
         break;
      case 76:
         var8 = new Pl(this.a, var2, var4, var6, Vh.a);
         break;
      case 77:
         var8 = new Ob(this.a, new acV(adh.b(var2), adh.b(var4), adh.b(var6)));
         var1.d(0);
         break;
      case 78:
         var8 = new Pa(this.a, var2, var4, var6);
         break;
      case 79:
         var8 = new RA(this.a, var2, var4, var6, 0.0F, 0, (Oh)null);
         break;
      case 90:
         NN var10 = this.a.a(var1.h());
         if (var10 instanceof Rn) {
            var8 = new RC(this.a, (Rn)var10, var2, var4, var6);
         }

         var1.d(0);
         break;
      case 91:
         var8 = new RK(this.a, var2, var4, var6);
         break;
      case 93:
         var8 = new Ry(this.a, var2, var4, var6, (double)var1.b() / iM.a(iM.a(5431110863370243849L) ^ iM.a(iM.a(-855805485682708234L) ^ -1L)), (double)var1.c() / iM.a(iM.a(2267420198535232421L) ^ iM.a(iM.a(-6901835321332005798L) ^ -1L)), (double)var1.d() / iM.a(iM.a(-3624755320530676518L) ^ iM.a(iM.a(8282955078859500325L) ^ -1L)));
         var1.d(0);
      }

      if (var8 != null) {
         Oi.a((NN)var8, var2, var4, var6);
         ((NN)var8).k = (float)(var1.e() * 360) / 256.0F;
         ((NN)var8).j = (float)(var1.f() * 360) / 256.0F;
         NN[] var17 = ((NN)var8).a();
         int var11 = var1.a();
         int var12;
         if (var17 != null) {
            var12 = var11 - ((NN)var8).getEntityId();
            NN[] var13 = var17;
            int var14 = var17.length;

            for(int var15 = 0; var15 < var14; ++var15) {
               NN var16 = var13[var15];
               var16.setEntityId(var16.getEntityId() + var12);
            }
         }

         ((NN)var8).setEntityId(var11);
         ((NN)var8).setUniqueId(var1.a());
         this.a.a(var1.a(), (NN)var8);
         var12 = var1.h();
         if (var12 > 0) {
            if (var9 == 60 || var9 == 91) {
               NN var18 = this.a.a(var12 - 1);
               if (var18 instanceof Oh && var8 instanceof Rv) {
                  ((Rv)var8).b = var18;
               }
            }

            ((NN)var8).c((double)var1.b() / iM.a(iM.a(-1183157802967274892L) ^ iM.a(iM.a(5824328325205104011L) ^ -1L)), (double)var1.c() / iM.a(iM.a(5585077417414478778L) ^ iM.a(iM.a(-954039994338233275L) ^ -1L)), (double)var1.d() / iM.a(iM.a(695366496605948002L) ^ iM.a(iM.a(-5267294174572955747L) ^ -1L)));
         }
      }

   }

   public void a(Zo var1) {
      double var2 = var1.a();
      double var4 = var1.b();
      double var6 = var1.c();
      PE var8 = new PE(this.a, var2, var4, var6, var1.b());
      Oi.a(var8, var2, var4, var6);
      var8.j = 0.0F;
      var8.k = 0.0F;
      var8.setEntityId(var1.a());
      this.a.a(var1.a(), var8);
   }

   public void a(Zp var1) {
      double var2 = var1.a();
      double var4 = var1.b();
      double var6 = var1.c();
      OY var8 = null;
      if (var1.b() == 1) {
         var8 = new OY(this.a, var2, var4, var6);
      }

      if (var8 != null) {
         Oi.a(var8, var2, var4, var6);
         var8.j = 0.0F;
         var8.k = 0.0F;
         var8.setEntityId(var1.a());
         this.a.b((NN)var8);
      }

   }

   public void a(Zs var1) {
      PB var2 = new PB(this.a, var1.a(), var1.a(), var1.a());
      var2.setUniqueId(var1.a());
      this.a.a(var1.a(), var2);
   }

   public void a(YD var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 != null) {
         var2.c((double)var1.b() / iM.a(iM.a(4541022745596741765L) ^ iM.a(iM.a(-9204148316018002054L) ^ -1L)), (double)var1.c() / iM.a(iM.a(-6296270159092107648L) ^ iM.a(iM.a(1720261093962795391L) ^ -1L)), (double)var1.d() / iM.a(iM.a(-6036994892360895812L) ^ iM.a(iM.a(1403142719517543747L) ^ -1L)));
      }

   }

   public void a(Yy var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 != null && var1.a() != null) {
         var2.a().a(var1.a());
      }

   }

   public void a(Zt var1) {
      double var2 = var1.a();
      double var4 = var1.b();
      double var6 = var1.c();
      float var8 = (float)(var1.a() * 360) / 256.0F;
      float var9 = (float)(var1.b() * 360) / 256.0F;
      tD var10 = new tD(this.a, this.a, this.a(var1.a()).getGameProfile());
      var10.a = var2;
      var10.g = var2;
      var10.b = var4;
      var10.h = var4;
      var10.c = var6;
      var10.i = var6;
      Oi.a(var10, var2, var4, var6);
      var10.a(var2, var4, var6, var8, var9);
      this.a.a(var1.a(), var10);
      List var11 = var1.a();
      if (var11 != null) {
         var10.a().a(var11);
      }

   }

   public void a(YC var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 != null) {
         double var3 = var1.a();
         double var5 = var1.b();
         double var7 = var1.c();
         Oi.a(var2, var3, var5, var7);
         if (!var2.q()) {
            float var9 = (float)(var1.a() * 360) / 256.0F;
            float var10 = (float)(var1.b() * 360) / 256.0F;
            if (Math.abs(var2.d - var3) < iM.a(iM.a(-4888327168388521507L) ^ iM.a(iM.a(8968588430786190882L) ^ -1L)) && Math.abs(var2.e - var5) < iM.a(iM.a(-6189142130618590133L) ^ iM.a(iM.a(7670826408023483316L) ^ -1L)) && Math.abs(var2.f - var7) < iM.a(iM.a(-1168433014892856625L) ^ iM.a(iM.a(3429240027832845616L) ^ -1L))) {
               var2.a(var2.d, var2.e, var2.f, var9, var10, 0, true);
            } else {
               var2.a(var3, var5, var7, var9, var10, 3, true);
            }

            var2.a.a(var1.a());
         }
      }

   }

   public void a(YF var1) {
      if (Rs.a(var1.a())) {
         this.a.a.a.a = var1.a();
      }

   }

   public void a(Yq var1) {
      NN var2 = var1.a((aej)this.a);
      if (var2 != null) {
         var2.a += (long)var1.a();
         var2.b += (long)var1.b();
         var2.c += (long)var1.c();
         double var3 = (double)var2.a / 4096.0D;
         double var5 = (double)var2.b / 4096.0D;
         double var7 = (double)var2.c / 4096.0D;
         if (!var2.q()) {
            float var9 = var1.a() ? (float)(var1.a() * 360) / 256.0F : var2.j;
            float var10 = var1.a() ? (float)(var1.b() * 360) / 256.0F : var2.k;
            var2.a(var3, var5, var7, var9, var10, 3, false);
            var2.a.a(var1.b());
         }
      }

   }

   public void a(Yx var1) {
      NN var2 = var1.a((aej)this.a);
      if (var2 != null) {
         float var3 = (float)(var1.a() * 360) / 256.0F;
         var2.setRotationYawHead(var3);
      }

   }

   public void a(Ym var1) {
      yw var2 = this.a;
      int[] var3 = var1.a();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var2.b(var3[var4]);
      }

   }

   public void a(YY var1) {
      sE var2 = this.a;
      tE var3 = var2.a;
      double var4 = var1.a();
      double var6 = var1.b();
      double var8 = var1.c();
      float var10 = var1.a();
      float var11 = var1.b();
      Set var12 = var1.a();
      if (var12.contains(YZ.X)) {
         var4 += var3.d;
      } else {
         var3.a.a(0.0D);
      }

      if (var12.contains(YZ.Y)) {
         var6 += var3.e;
      } else {
         var3.b.a(0.0D);
      }

      if (var12.contains(YZ.Z)) {
         var8 += var3.f;
      } else {
         var3.c.a(0.0D);
      }

      if (var12.contains(YZ.X_ROT)) {
         var11 += var3.k;
      }

      if (var12.contains(YZ.Y_ROT)) {
         var10 += var3.j;
      }

      var3.a(var4, var6, var8, var10, var11);
      Wp var13 = this.a;
      var13.a((Ws)(new Xn(var1.a())));
      var13.a((Ws)(new XA(var3.d, var3.b().b, var3.f, var3.j, var3.k, false)));
      if (!this.a) {
         var3.a = var3.d;
         var3.b = var3.e;
         var3.c = var3.f;
         this.a = true;
         this.a(var1, new CallbackInfo("handlePlayerPosLook", false));
         var2.a((uI)null);
      }

   }

   public void a(YM var1) {
      YN[] var2 = var1.a();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         YN var5 = var2[var4];
         this.a.a(var5.a(), var5.b(), var5.c(), var5.a());
      }

   }

   public void a(Yd var1) {
      yw var2 = this.a;
      if (var1.a()) {
         this.a.a(var1.a(), var1.b(), true);
      }

      afh var3 = var2.a(var1.a(), var1.b());
      var3.a(var1.a(), var1.c(), var1.a());
      var2.markBlockRangeForRenderUpdate(var1.a() << 4, 0, var1.b() << 4, (var1.a() << 4) + 15, this.a.getHeight(), (var1.b() << 4) + 15);
      if (!var1.a() || !(var2.a instanceof aer)) {
         var3.d();
      }

      List var4 = var1.a();
      int var5 = 0;

      for(int var6 = var4.size(); var5 < var6; ++var5) {
         VR var7 = (VR)var4.get(var5);
         int var8 = var7.getInteger("x");
         int var9 = var7.getInteger("y");
         int var10 = var7.getInteger("z");
         aaD var11 = var2.a(var7.getInteger("x"), var7.getInteger("y"), var7.getInteger("z"));
         if (var11 != null) {
            var11.a(var7);
            var11.b(var7);
         } else {
            a.warn("Skipping tile entity data at: {}, {}, {}", var8, var9, var10);
         }
      }

   }

   public void a(ZB var1) {
      this.a.a(var1.a(), var1.b(), false);
   }

   public void a(XZ var1) {
      this.a.a(var1.a(), var1.a());
   }

   public void a(Yn var1) {
      this.a.a(var1.a());
   }

   public void a(Ws<?> var1) {
      this.a.a(var1);
   }

   public void a(Yf var1) {
      NN var2 = this.a.a(var1.a());
      Object var3 = (Oh)this.a.a(var1.b());
      if (var3 == null) {
         var3 = this.a.a;
      }

      if (var2 != null) {
         if (var2 instanceof PE) {
            this.a.a(var2.d, var2.e, var2.f, RW.bA, acI.PLAYERS, 0.1F, (this.a.nextFloat() - this.a.nextFloat()) * 0.35F + 0.9F, false);
         } else {
            this.a.a(var2.d, var2.e, var2.f, RW.dx, acI.PLAYERS, 0.2F, (this.a.nextFloat() - this.a.nextFloat()) * 1.4F + 2.0F, false);
         }

         if (var2 instanceof Pm) {
            ((Pm)var2).a().setCount(var1.c());
         }

         this.a.a.a((yQ)(new zL(this.a.a(), this.a, var2, (NN)var3, 0.5F)));
         this.a.b(var1.a());
      }

   }

   public void a(Yc var1) {
      this.b(var1);
   }

   public void a(XV var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 != null) {
         Oh var3;
         if (var1.b() == 0) {
            var3 = (Oh)var2;
            var3.a(abU.MAIN_HAND);
         } else if (var1.b() == 3) {
            var3 = (Oh)var2;
            var3.a(abU.OFF_HAND);
         } else if (var1.b() == 1) {
            var2.performHurtAnimation();
         } else if (var1.b() == 2) {
            Rn var4 = (Rn)var2;
            var4.a(false, false, false);
         } else if (var1.b() == 4) {
            this.a.a.a(var2, abW.CRIT);
         } else if (var1.b() == 5) {
            this.a.a.a(var2, abW.CRIT_MAGIC);
         }
      }

   }

   public void a(ZJ var1) {
      var1.a((aej)this.a).a(var1.a());
   }

   public void a(Zq var1) {
      double var2 = var1.a();
      double var4 = var1.b();
      double var6 = var1.c();
      float var8 = (float)(var1.a() * 360) / 256.0F;
      float var9 = (float)(var1.b() * 360) / 256.0F;
      Oh var10 = (Oh)Oc.a(var1.b(), this.a.a);
      if (var10 != null) {
         Oi.a(var10, var2, var4, var6);
         float var11 = (float)var1.c();
         var10.A = var11 * 360.0F / 256.0F;
         var10.C = var11 * 360.0F / 256.0F;
         NN[] var12 = var10.a();
         int var13 = var1.a();
         if (var12 != null) {
            int var14 = var13 - var10.getEntityId();
            NN[] var15 = var12;
            int var16 = var12.length;

            for(int var17 = 0; var17 < var16; ++var17) {
               NN var18 = var15[var17];
               var18.setEntityId(var18.getEntityId() + var14);
            }
         }

         var10.setEntityId(var13);
         var10.setUniqueId(var1.a());
         var10.a(var2, var4, var6, var8, var9);
         var10.a.a((double)((float)var1.c() / 8000.0F));
         var10.b.a((double)((float)var1.d() / 8000.0F));
         var10.c.a((double)((float)var1.e() / 8000.0F));
         this.a.a(var13, var10);
         List var19 = var1.a();
         if (var19 != null) {
            var10.a().a(var19);
         }
      } else {
         a.warn("Skipping Entity with id {}", var1.b());
      }

   }

   public void a(Zy var1) {
      this.a.a.b(var1.a());
      this.a.a.a(var1.b());
   }

   public void a(Zu var1) {
      this.a.a.b(var1.a(), true);
      this.a.a.a().a(var1.a());
   }

   public void a(Zk var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 != null) {
         boolean var3 = var2.i(this.a.a);
         var2.removePassengers();
         int[] var4 = var1.a();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            int var7 = var4[var6];
            NN var8 = this.a.a(var7);
            if (var8 != null) {
               var8.a(var2, true);
               if (var8 == this.a.a && !var3) {
                  this.a.a.a(IK.a("mount.onboard", JI.a(this.a.a.f.getKeyCode())), false);
               }
            }
         }
      }

   }

   public void a(Yu var1) {
      yw var2 = this.a;
      NN var3 = var2.a(var1.a());
      NN var4 = var2.a(var1.b());
      if (var3 instanceof Of) {
         if (var4 != null) {
            ((Of)var3).a(var4, false);
         } else {
            ((Of)var3).a(false, false);
         }
      }

   }

   public void a(YB var1) {
      yw var2 = this.a;
      NN var3 = var1.a((aej)var2);
      if (var3 != null) {
         if (var1.a() == 21) {
            this.a.a().a((tb)(new ta((PT)var3)));
         } else if (var1.a() == 35) {
            this.a.a.a(var3, abW.TOTEM, 30);
            var2.a(var3.d, var3.e, var3.f, RW.hX, var3.a(), 1.0F, 1.0F, false);
            if (var3 == this.a.a) {
               this.a.a.a(new Vh(RT.cv));
            }
         } else {
            var3.a(var1.a());
         }
      }

   }

   public void a(ZF var1) {
      tE var2 = this.a.a;
      var2.b(var1.a());
      abZ var3 = var2.a();
      var3.setFoodLevel(var1.a());
      var3.setFoodSaturationLevel(var1.b());
   }

   public void a(Zj var1) {
      this.a.a.setXPStats(var1.a(), var1.a(), var1.b());
   }

   public void a(Zf var1) {
      if (var1.a() != this.a.a.h) {
         this.a = false;
         aao var2 = this.a.a();
         this.a = new yw(this.a, this, new aes(var1.a(), this.a.a.a().b(), var1.a(), this.a(var1)), var1.a(), var1.a());
         this.a.a(var2);
         this.a.a(this.a);
         this.a.a.h = var1.a();
         this.a.a((uI)null);
      }

      this.a.a(var1.a());
      this.a.a.a(var1.a());
   }

   public void a(YE var1) {
      aea var2 = new aea(this.a.a, (NN)null, var1.a(), var1.b(), var1.c(), var1.d(), var1.a());
      var2.a(true);
      tE var3 = this.a.a;
      var3.a.a(var3.a.a() + (double)var1.a());
      var3.b.a(var3.b.a() + (double)var1.b());
      var3.c.a(var3.c.a() + (double)var1.c());
   }

   public void a(YP var1) {
      tE var2 = this.a.a;
      if ("minecraft:container".equals(var1.a())) {
         var2.a((SE)(new SH(var1.a(), var1.b())));
         var2.b.a = var1.a();
      } else if ("minecraft:villager".equals(var1.a())) {
         var2.a((Oo)(new Os(var2, var1.a())));
         var2.b.a = var1.a();
      } else if ("EntityHorse".equals(var1.a())) {
         NN var3 = this.a.a(var1.c());
         if (var3 instanceof Qz) {
            var2.a((Qz)((Qz)var3), (SE)(new Sn(var1.a(), var1.b())));
            var2.b.a = var1.a();
         }
      } else if (!var1.a()) {
         var2.a((aed)(new AH(var1.a(), var1.a())));
         var2.b.a = var1.a();
      } else {
         AG var4 = new AG(var1.a(), var1.a(), var1.b());
         var2.a((SE)var4);
         var2.b.a = var1.a();
      }

   }

   public void a(Zl var1) {
      tE var2 = this.a.a;
      Vh var3 = var1.a();
      int var4 = var1.b();
      if (var1.a() == -1) {
         var2.a.c(var3);
      } else if (var1.a() == -2) {
         var2.a.a(var4, var3);
      } else {
         boolean var5 = false;
         if (this.a.a instanceof vP) {
            vP var6 = (vP)this.a.a;
            var5 = var6.a() != KC.m.getIndex();
         }

         if (var1.a() == 0 && var1.b() >= 36 && var4 < 45) {
            if (!var3.isEmpty()) {
               Vh var7 = var2.a.a(var4).a();
               if (var7.isEmpty() || var7.getCount() < var3.getCount()) {
                  var3.b(5);
               }
            }

            var2.a.a(var4, var3);
         } else if (var1.a() == var2.b.a && (var1.a() != 0 || !var5)) {
            var2.b.a(var4, var3);
         }
      }

   }

   public void a(Yi var1) {
      RY var2 = null;
      tE var3 = this.a.a;
      if (var1.a() == 0) {
         var2 = var3.a;
      } else if (var1.a() == var3.b.a) {
         var2 = var3.b;
      }

      if (var2 != null && !var1.a()) {
         this.a((Ws)(new Xo(var1.a(), var1.a(), true)));
      }

   }

   public void a(ZK var1) {
      tE var2 = this.a.a;
      if (var1.a() == 0) {
         var2.a.setAll(var1.a());
      } else if (var1.a() == var2.b.a) {
         var2.b.setAll(var1.a());
      }

   }

   public void a(Zm var1) {
      Object var2 = this.a.a((acV)var1.a());
      if (!(var2 instanceof abn)) {
         var2 = new abn();
         ((aaD)var2).a((aej)this.a);
         ((aaD)var2).a(var1.a());
      }

      this.a.a.a((abn)var2);
   }

   public void a(ZI var1) {
      acV var2 = var1.a();
      aaD var3 = this.a.a.a((acV)var2);
      int var4 = var1.a();
      boolean var5 = var4 == 2 && var3 instanceof aaO;
      if (var4 == 1 && var3 instanceof abe || var5 || var4 == 3 && var3 instanceof aaI || var4 == 4 && var3 instanceof abo || var4 == 5 && var3 instanceof aaZ || var4 == 6 && var3 instanceof aaH || var4 == 7 && var3 instanceof abp || var4 == 8 && var3 instanceof aaW || var4 == 9 && var3 instanceof abn || var4 == 10 && var3 instanceof abk || var4 == 11 && var3 instanceof aaK) {
         VR var6 = var1.a();
         var3.a(var6);
         var3.b(var6);
      }

      if (var5 && this.a.a instanceof tR) {
         ((tR)this.a.a).d();
      }

   }

   public void a(ZL var1) {
      tE var2 = this.a.a;
      if (var2.b != null && var2.b.a == var1.a()) {
         var2.b.updateProgressBar(var1.b(), var1.c());
      }

   }

   public void a(Yw var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 != null) {
         var2.a(var1.a(), var1.a());
      }

   }

   public void a(Ye var1) {
      this.a.a.d();
   }

   public void a(XX var1) {
      this.a.a.a(var1.a(), var1.a(), var1.a(), var1.b());
   }

   public void a(XY var1) {
      this.a.a.c(var1.a(), var1.a(), var1.b());
   }

   public void a(Yb var1) {
      tE var2 = this.a.a;
      int var3 = var1.a();
      float var4 = var1.a();
      int var5 = adh.a(var4 + 0.5F);
      if (var3 >= 0 && var3 < Yb.a.length && Yb.a[var3] != null) {
         var2.a((adu)(new adE(Yb.a[var3])), false);
      }

      if (var3 == 1) {
         this.a.a().a(true);
         this.a.setRainStrength(0.0F);
      } else if (var3 == 2) {
         this.a.a().a(false);
         this.a.setRainStrength(1.0F);
      } else if (var3 == 3) {
         this.a.a.a(aeb.a(var5));
      } else if (var3 == 4) {
         if (var5 == 0) {
            this.a.a.a.a((Ws)(new Xk(Xl.PERFORM_RESPAWN)));
            this.a.a((uI)null);
         } else if (var5 == 1) {
            this.a.a((uI)(new vc(() -> {
               this.a.a.a.a((Ws)(new Xk(Xl.PERFORM_RESPAWN)));
            })));
         }
      } else if (var3 == 5) {
         JI var6 = this.a.a;
         if (var4 == 0.0F) {
            this.a.a((uI)(new uN()));
         } else if (var4 == 101.0F) {
            this.a.a.a().a((adu)(new adE("demo.help.movement", new Object[]{JI.a(var6.a.getKeyCode()), JI.a(var6.b.getKeyCode()), JI.a(var6.c.getKeyCode()), JI.a(var6.d.getKeyCode())})));
         } else if (var4 == 102.0F) {
            this.a.a.a().a((adu)(new adE("demo.help.jump", JI.a(var6.e.getKeyCode()))));
         } else if (var4 == 103.0F) {
            this.a.a.a().a((adu)(new adE("demo.help.inventory", JI.a(var6.h.getKeyCode()))));
         }
      } else if (var3 == 6) {
         this.a.a(var2, var2.d, var2.e + (double)var2.getEyeHeight(), var2.f, RW.v, acI.PLAYERS, 0.18F, 0.45F);
      } else if (var3 == 7) {
         this.a.setRainStrength(var4);
      } else if (var3 == 8) {
         this.a.setThunderStrength(var4);
      } else if (var3 == 10) {
         this.a.a(abW.MOB_APPEARANCE, var2.d, var2.e, var2.f, 0.0D, 0.0D, 0.0D, new int[0]);
         this.a.a(var2, var2.d, var2.e, var2.f, RW.aK, acI.HOSTILE, 1.0F, 1.0F);
      }

   }

   public void a(YK var1) {
      vh var2 = this.a.a.a();
      afz var3 = UD.a(var1.a(), this.a.a);
      if (var3 == null) {
         String var4 = "map_" + var1.a();
         var3 = new afz(var4);
         if (var2.a(var4) != null) {
            afz var5 = var2.a(var2.a(var4));
            if (var5 != null) {
               var3 = var5;
            }
         }

         this.a.a.a(var4, var3);
      }

      var1.a(var3);
      var2.a(var3);
   }

   public void a(Yp var1) {
      if (var1.a()) {
         this.a.a.a(var1.a(), var1.a(), var1.b());
      } else {
         this.a.a.b(var1.a(), var1.a(), var1.b());
      }

   }

   public void a(XU var1) {
      this.a.a(var1);
   }

   public void a(Zh var1) {
      acC var2 = var1.a();
      if (var2 == null) {
         this.a.a((mN)null, false);
      } else {
         mN var3 = this.a.a().a(var2);
         this.a.a(var3, false);
      }

   }

   public void a(Zv var1) {
      Iterator var2 = var1.a().entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         aau var4 = (aau)var3.getKey();
         int var5 = (Integer)var3.getValue();
         this.a.a.a().a(var4, var5);
      }

      if (this.a.a instanceof vg) {
         ((vg)this.a.a).a();
      }

   }

   public void a(Zb var1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Yv var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 instanceof Oh) {
         ZV var3 = ZV.a(var1.a());
         if (var3 != null) {
            ZY var4 = new ZY(var3, var1.b(), var1.b(), var1.c(), var1.b());
            var4.a(var1.a());
            ((Oh)var2).a(var4);
         }
      }

   }

   public void a(Yg var1) {
      if (var1.a == Yh.ENTITY_DIED) {
         NN var2 = this.a.a(var1.a);
         if (var2 == this.a.a) {
            this.a.a((uI)(new ud(var1.a)));
         }
      }

   }

   public void a(Zi var1) {
      this.a.a.a().a(var1.a());
   }

   public void a(Ya var1) {
      NN var2 = var1.a((aej)this.a);
      if (var2 != null) {
         this.a.a(var2);
      }

   }

   public void a(ZM var1) {
      var1.a(this.a.a());
   }

   public void a(Zz var1) {
      // $FF: Couldn't be decompiled
   }

   public void a(YT var1) {
      uD var2 = this.a.a.a();
      var2.b(var1.a().getFormattedText().isEmpty() ? null : var1.a());
      var2.a(var1.b().getFormattedText().isEmpty() ? null : var1.b());
   }

   public void a(Zd var1) {
      NN var2 = var1.a((aej)this.a);
      if (var2 instanceof Oh) {
         ((Oh)var2).a(var1.a());
      }

   }

   public void a(YU var1) {
      // $FF: Couldn't be decompiled
   }

   public void a(YH var1) {
      this.a((Ws)(new Xw(var1.a())));
   }

   public void a(YS var1) {
      tE var2 = this.a.a;
      Ru var3 = var2.a;
      var3.b = var1.b();
      var3.d = var1.d();
      var3.a = var1.a();
      var3.c = var1.c();
      var3.a(var1.a());
      var3.b(var1.b());
   }

   public void a(Zw var1) {
      if (this.a.a instanceof acg) {
         String[] var2 = var1.a();
         Arrays.sort(var2);
         ((acg)this.a.a).a(var2);
      }

   }

   public void a(Zn var1) {
      this.a.a.a(this.a.a, var1.a(), var1.b(), var1.c(), var1.a(), var1.a(), var1.a(), var1.b());
   }

   public void a(Yl var1) {
      this.a.a().a((tb)(new tm(new acC(var1.a()), var1.a(), var1.a(), var1.b(), false, 0, tc.LINEAR, (float)var1.a(), (float)var1.b(), (float)var1.c())));
   }

   private FutureCallback<Object> a() {
      return new yD(this);
   }

   public void a(ZC var1) {
      this.a.a.a().a(var1);
   }

   public void a(Yj var1) {
      if (var1.a() == 0) {
         this.a.a.b().a(var1.a());
      } else {
         this.a.a.b().a(var1.a(), var1.a());
      }

   }

   public void a(YL var1) {
      NN var2 = this.a.a.b();
      if (var2 != this.a.a && var2.q()) {
         var2.a(var1.a(), var1.b(), var1.c(), var1.a(), var1.b());
         this.a.a((Ws)(new XT(var2)));
      }

   }

   public void a(Yk var1) {
      Wt var2;
      if ("MC|TrList".equals(var1.a())) {
         var2 = var1.a();

         try {
            int var3 = var2.readInt();
            uI var4 = this.a.a;
            if (var4 != null && var4 instanceof uu && var3 == this.a.a.b.a) {
               Oo var5 = ((uu)var4).a();
               adP var6 = adP.a(var2);
               var5.a(var6);
            }
         } catch (IOException var7) {
            a.error("Couldn't load trade info", var7);
         }
      } else if ("MC|Brand".equals(var1.a())) {
         this.a.a.a(NetUtil.readUtf8(var1.a()));
      } else if ("MC|BOpen".equals(var1.a())) {
         abU var8 = (abU)NetUtil.readEnum(abU.VALUES, var1.a());
         Vh var9 = var8 == abU.OFF_HAND ? this.a.a.b() : this.a.a.a();
         if (var9.a() == RT.bx) {
            this.a.a((uI)(new uL(this.a.a, var9, false)));
         }
      } else if ("MC|StopSound".equals(var1.a())) {
         var2 = var1.a();
         String var10 = NetUtil.readUtf8(var2);
         String var11 = NetUtil.readUtf8(var2);
         this.a.a().a(var11, acI.a(var10));
      }

      this.b(var1, new CallbackInfo("handleCustomPayload", false));
      this.a(var1, new CallbackInfo("handleCustomPayload", false));
   }

   public void a(Zg var1) {
      aao var2 = this.a.a();
      aam var3;
      if (var1.a() == 0) {
         var3 = var2.a(var1.a(), aag.a);
         var3.a(var1.b());
         var3.a(var1.a());
      } else {
         var3 = var2.a(var1.a());
         if (var1.a() == 1) {
            var2.a(var3);
         } else if (var1.a() == 2) {
            var3.a(var1.b());
            var3.a(var1.a());
         }
      }

   }

   public void a(ZG var1) {
      aao var2 = this.a.a();
      aam var3 = var2.a(var1.b());
      if (var1.a() == ZH.CHANGE) {
         aai var4 = var2.a(var1.a(), var3);
         var4.b(var1.a());
      } else if (var1.a() == ZH.REMOVE) {
         if (acK.a(var1.b())) {
            var2.a(var1.a(), (aam)null);
         } else if (var3 != null) {
            var2.a(var1.a(), var3);
         }
      }

   }

   public void a(Yo var1) {
      aao var2 = this.a.a();
      if (var1.a().isEmpty()) {
         var2.a(var1.a(), (aam)null);
      } else {
         aam var3 = var2.a(var1.a());
         var2.a(var1.a(), var3);
      }

   }

   public void a(Zx var1) {
      aao var2 = this.a.a();
      aan var3;
      if (var1.a() == 0) {
         var3 = var2.b(var1.a());
      } else {
         var3 = var2.a(var1.a());
      }

      if (var1.a() == 0 || var1.a() == 2) {
         var3.a(var1.b());
         var3.b(var1.c());
         var3.c(var1.d());
         var3.a(adH.a(var1.c()));
         var3.a(var1.b());
         aar var4 = aar.a(var1.e());
         if (var4 != null) {
            var3.a(var4);
         }

         aaq var5 = aaq.a(var1.f());
         if (var5 != null) {
            var3.a(var5);
         }
      }

      Iterator var6;
      String var7;
      if (var1.a() == 0 || var1.a() == 3) {
         var6 = var1.a().iterator();

         while(var6.hasNext()) {
            var7 = (String)var6.next();
            var2.a(var7, var1.a());
         }
      }

      if (var1.a() == 4) {
         var6 = var1.a().iterator();

         while(var6.hasNext()) {
            var7 = (String)var6.next();
            var2.a(var7, var3);
         }
      }

      if (var1.a() == 1) {
         var2.a(var3);
      }

   }

   public void a(YQ var1) {
      CallbackInfo var36 = new CallbackInfo("handleParticles", true);
      this.a(var1, var36);
      if (!var36.isCancelled()) {
         double var2 = (double)var1.a();
         double var4 = (double)var1.b();
         double var6 = (double)var1.c();
         double var8 = var1.a();
         double var10 = var1.b();
         double var12 = var1.c();
         double var14 = (double)var1.d();
         boolean var16 = var1.a();
         abW var17 = var1.a();
         int[] var18 = var1.a();
         yw var19 = this.a;
         int var20 = var1.a();
         double var23;
         double var25;
         if (var20 == 0) {
            double var21 = var14 * var2;
            var23 = var14 * var4;
            var25 = var14 * var6;

            try {
               var19.a(var17, var16, var8, var10, var12, var21, var23, var25, var18);
            } catch (Throwable var38) {
               a.warn("Could not spawn particle effect {}", var17);
            }
         } else {
            Random var39 = this.a;

            for(int var22 = 0; var22 < var20; ++var22) {
               var23 = var39.nextGaussian() * var2;
               var25 = var39.nextGaussian() * var4;
               double var27 = var39.nextGaussian() * var6;
               double var29 = var39.nextGaussian() * var14;
               double var31 = var39.nextGaussian() * var14;
               double var33 = var39.nextGaussian() * var14;

               try {
                  var19.a(var17, var16, var8 + var23, var10 + var25, var12 + var27, var29, var31, var33, var18);
               } catch (Throwable var37) {
                  a.warn("Could not spawn particle effect {}", var17);
                  return;
               }
            }
         }

      }
   }

   public void a(Yz var1) {
      NN var2 = this.a.a(var1.a());
      if (var2 != null) {
         if (!(var2 instanceof Oh)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var2 + ')');
         }

         Oy var3 = ((Oh)var2).a();
         List var4 = var1.a();
         int var5 = 0;

         for(int var6 = var4.size(); var5 < var6; ++var5) {
            YA var7 = (YA)var4.get(var5);
            OD var8 = var3.a(var7.a());
            if (var8 == null) {
               var8 = var3.b(new OF((OC)null, var7.a(), 0.0D, 2.2250738585072014E-308D, Double.MAX_VALUE));
            }

            var8.a(var7.a());
            var8.a();
            List var9 = var7.a();
            int var10 = 0;

            for(int var11 = var9.size(); var10 < var11; ++var10) {
               OA var12 = (OA)var9.get(var10);
               var8.a(var12);
            }
         }
      }

   }

   public void a(YR var1) {
      RY var2 = this.a.a.b;
      if (var2.a == var1.a() && var2.b((Rn)this.a.a) && this.a.a instanceof wl) {
         wi var3 = ((wl)this.a.a).a();
         var3.a(var1.a(), var2.a);
      }

   }

   public void a(YO var1) {
      List var2 = var1.a();
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         ((Ws)var2.get(var3)).a((Wm)this);
      }

   }

   public void a(YI var1) {
      byte var2 = var1.a();
      a.info("Registered light map: {}", var2);
      ChunkLightRegistry.register(var2, var1.a());
   }

   public void a(XW var1) {
      byte var2 = var1.a();
      a.info("Registered biome map: {}", var2);
      ChunkBiomeRegistry.register(var2, var1.a());
   }

   public Wp a() {
      return this.a;
   }

   public Collection<yF> a() {
      return this.a.values();
   }

   public yF a(UUID var1) {
      return (yF)this.a.get(var1);
   }

   public yF a(String var1) {
      return (yF)this.b.get(var1);
   }

   public GameProfile a() {
      return this.a;
   }

   public yn a() {
      return this.a;
   }

   protected int a(YG var1) {
      return 256;
   }

   protected int a(Zf var1) {
      return 256;
   }

   public void a(yF var1) {
      GameProfile var2 = var1.getGameProfile();
      this.a.put(var2.getId(), var1);
      this.b.put(var2.getName(), var1);
   }

   public yF b(UUID var1) {
      yF var2 = (yF)this.a.remove(var1);
      return var2 != null && !this.b.remove(var2.getGameProfile().getName(), var2) ? null : var2;
   }

   public yF b(String var1) {
      yF var2 = (yF)this.b.remove(var1);
      return var2 != null && !this.a.remove(var2.getGameProfile().getId(), var2) ? null : var2;
   }

   public Executor executor() {
      return this.a;
   }

   // $FF: synthetic method
   static Wp a(yC var0) {
      return var0.a;
   }

   static {
      a = sE.a;
   }

   protected void b(YG var1) {
      if (!this.b) {
         a.info("Invalidating server data");
         asE var2 = ((ata)this.a).a();
         var2.c();
         this.a.a.b();
         atW.a(this.a);
         ((atd)this.a.a()).b();
         this.c = false;
      }

      asE.d = false;
   }

   private void a(YG var1, CallbackInfo var2) {
      if (this.b) {
         al.BUS.fireAndForget(al.a);
      } else {
         an.BUS.fireAndForget(an.a);
      }

      this.b = false;
   }

   private void a(YQ var1, CallbackInfo var2) {
      if (JI.l == 2) {
         var2.cancel();
      }

   }

   private void a(YY var1, CallbackInfo var2) {
      if (!this.c) {
         this.c = true;

         while(Lu.b()) {
         }

         while(Lv.b()) {
         }

         JN.b();
      }
   }

   public void a(adu var1) {
      sE var2 = this.a;
      var2.a((yw)null);
      asE var3 = ((ata)this.a).a();
      var3.c();
      asE.d();
      am.BUS.fireAndForget(new am((Text)d.a(var1)));
      String var4 = var1.getUnformattedText();
      if (var4.contains("\u0000")) {
         String[] var5 = var4.split("\u0000");
         a.info("Disconnected due:" + var5[0]);
         String var6 = var5[1].split("\u0001")[0];
         byte var8 = -1;
         switch(var6.hashCode()) {
         case 951351530:
            if (var6.equals("connect")) {
               var8 = 1;
            }
            break;
         case 990157655:
            if (var6.equals("reconnect")) {
               var8 = 0;
            }
         }

         switch(var8) {
         case 0:
            var2.a((uI)(new ua(new asO(), "disconnect.lost", new adD("Повторное подключение...."))));
            atZ.a(this.a, (String)null, (Consumer)null);
            return;
         case 1:
            var5 = var6.split("\u0002");
            var2.a((uI)(new ua(new asO(), "disconnect.lost", new adD("Подключение...."))));
            atZ.a(this.a, var5[0], (Consumer)null);
            return;
         }
      }

      var2.a((uI)(new ua(new asO(), "disconnect.lost", var1)));
   }

   public void a(Ze var1) {
      Wp var2 = this.a;
      var2.a((Ws)(new XJ(XK.ACCEPTED)));
      sE var3 = this.a;
      Channel var4 = var2.a();
      atY var5 = (atY)var4.attr(atW.a).get();
      if (var5 != null) {
         var5.a(false);
      }

      var3.a(() -> {
         String var4 = var1.a();
         if (var4.isEmpty()) {
            var3.a().b();
            this.a().onSuccess((Object)null);
         } else {
            ListenableFuture var5x = var3.a().a(var4, var1.b());
            Futures.addCallback(var5x, this.a());
            if (var5 != null) {
               Futures.addCallback(var5x, new atf(var5));
            }

         }
      });
   }

   private void b(Yk var1, CallbackInfo var2) {
      ((ata)this.a).a().a(var1);
   }

   protected void b(Yc var1) {
      adt var2 = var1.a();
      adu var3 = var1.a();
      if (var2 != adt.GAME_INFO) {
         adu var4 = var3.a();
         ChatReceive var5 = (ChatReceive)K.BUS.fire(new K(((atb)var1).a(), (Text)d.a(var3)));
         if (var5.isCancelled()) {
            return;
         }

         Text var6 = var5.getText();
         if (var6 == null) {
            return;
         }

         if (!var4.equals(var6)) {
            var3 = (adu)d.a(var6);
            ((cK)var6).a();
         }
      }

      this.a.a.a(var2, var3);
   }

   public void a(Za var1) {
      int var2 = var1.a();
      a.info("Protocol upgrade mask: {}", var2);
      asE.b = var2;
      asE.d = true;
   }

   public void addPlayerInfo(NetworkPlayerInfo var1) {
      GameProfile var2 = var1.getGameProfile();
      this.a.put(var2.getId(), d.a(var1));
      this.b.put(var2.getName(), d.a(var1));
   }

   public NetworkPlayerInfo getPlayerInfo(UUID var1) {
      return (NetworkPlayerInfo)d.a(this.a.get(var1));
   }

   public NetworkPlayerInfo getPlayerInfo(String var1) {
      return (NetworkPlayerInfo)d.a(this.b.get(var1));
   }

   public NetworkPlayerInfo removePlayerInfo(UUID var1) {
      yF var2 = (yF)this.a.remove(var1);
      if (var2 != null) {
         this.b.remove(var2.getGameProfile().getName());
      }

      return (NetworkPlayerInfo)d.a(var2);
   }

   public NetworkPlayerInfo removePlayerInfo(String var1) {
      yF var2 = (yF)this.b.remove(var1);
      if (var2 != null) {
         this.a.remove(var2.getGameProfile().getId());
      }

      return (NetworkPlayerInfo)d.a(var2);
   }

   public Collection getPlayerInfos() {
      return this.a.values();
   }

   public void sendPayload(String var1, ByteBuf var2) {
      this.a((Ws)(new Xq(var1, var2)));
   }

   public void a(YJ var1) {
      sE var2 = this.a;
      asE var3 = ((ata)var2).a();
      byte[][] var4 = var1.a();

      try {
         var2.b(() -> {
            int var2 = 0;

            for(int var3x = var4.length; var2 < var3x; ++var2) {
               try {
                  hw var4x = cV.a(var3.a, new LD(var4[var2]), Side.SERVER);
                  var3.a(var4x.a, var4x);
               } catch (Exception var5) {
                  a.error("Error loading mod", var5);
               }
            }

         }).get(1L, TimeUnit.MINUTES);
      } catch (ExecutionException | TimeoutException | InterruptedException var6) {
         a.error("Could not load mods", var6);
      }

   }

   public Object a() {
      return ((ata)this.a).a().a.clientConnection();
   }

   public void sendPacket(Packet var1) {
      this.a((Ws)d.a(var1));
   }

   public NetworkPlayerInfo newPlayerInfo(GameProfile var1) {
      return (NetworkPlayerInfo)d.a(new yF(this.a, var1));
   }

   public void a(Yk var1, CallbackInfo var2) {
      anC.a.a.a(var1);
   }
}
