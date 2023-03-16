package z3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private final Object A;
    @GuardedBy("mServiceBrokerLock")
    private l B;
    protected InterfaceC0247c C;
    @GuardedBy("mLock")
    private IInterface D;
    private final ArrayList E;
    @GuardedBy("mLock")
    private y0 F;
    @GuardedBy("mLock")
    private int G;
    private final a H;
    private final b I;
    private final int J;
    private final String K;
    private volatile String L;
    private w3.b M;
    private boolean N;
    private volatile b1 O;
    protected AtomicInteger P;

    /* renamed from: n  reason: collision with root package name */
    private int f17318n;

    /* renamed from: o  reason: collision with root package name */
    private long f17319o;

    /* renamed from: p  reason: collision with root package name */
    private long f17320p;

    /* renamed from: q  reason: collision with root package name */
    private int f17321q;

    /* renamed from: r  reason: collision with root package name */
    private long f17322r;

    /* renamed from: s  reason: collision with root package name */
    private volatile String f17323s;

    /* renamed from: t  reason: collision with root package name */
    m1 f17324t;

    /* renamed from: u  reason: collision with root package name */
    private final Context f17325u;

    /* renamed from: v  reason: collision with root package name */
    private final Looper f17326v;

    /* renamed from: w  reason: collision with root package name */
    private final h f17327w;

    /* renamed from: x  reason: collision with root package name */
    private final w3.f f17328x;

    /* renamed from: y  reason: collision with root package name */
    final Handler f17329y;

    /* renamed from: z  reason: collision with root package name */
    private final Object f17330z;
    private static final w3.d[] R = new w3.d[0];
    public static final String[] Q = {"service_esmobile", "service_googleme"};

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);

        void f(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public interface b {
        void e(w3.b bVar);
    }

    /* renamed from: z3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0247c {
        void a(w3.b bVar);
    }

    /* loaded from: classes.dex */
    protected class d implements InterfaceC0247c {
        public d() {
        }

        @Override // z3.c.InterfaceC0247c
        public final void a(w3.b bVar) {
            if (bVar.C()) {
                c cVar = c.this;
                cVar.o(null, cVar.C());
            } else if (c.this.I != null) {
                c.this.I.e(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r10, android.os.Looper r11, int r12, z3.c.a r13, z3.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            z3.h r3 = z3.h.b(r10)
            w3.f r4 = w3.f.f()
            z3.o.i(r13)
            z3.o.i(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.c.<init>(android.content.Context, android.os.Looper, int, z3.c$a, z3.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, Looper looper, h hVar, w3.f fVar, int i10, a aVar, b bVar, String str) {
        this.f17323s = null;
        this.f17330z = new Object();
        this.A = new Object();
        this.E = new ArrayList();
        this.G = 1;
        this.M = null;
        this.N = false;
        this.O = null;
        this.P = new AtomicInteger(0);
        o.j(context, "Context must not be null");
        this.f17325u = context;
        o.j(looper, "Looper must not be null");
        this.f17326v = looper;
        o.j(hVar, "Supervisor must not be null");
        this.f17327w = hVar;
        o.j(fVar, "API availability must not be null");
        this.f17328x = fVar;
        this.f17329y = new v0(this, looper);
        this.J = i10;
        this.H = aVar;
        this.I = bVar;
        this.K = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c0(c cVar, b1 b1Var) {
        cVar.O = b1Var;
        if (cVar.S()) {
            z3.e eVar = b1Var.f17317q;
            p.b().c(eVar == null ? null : eVar.D());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d0(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.f17330z) {
            i11 = cVar.G;
        }
        if (i11 == 3) {
            cVar.N = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.f17329y;
        handler.sendMessage(handler.obtainMessage(i12, cVar.P.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean g0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.f17330z) {
            if (cVar.G != i10) {
                return false;
            }
            cVar.i0(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean h0(z3.c r2) {
        /*
            boolean r0 = r2.N
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.E()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.c.h0(z3.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(int i10, IInterface iInterface) {
        m1 m1Var;
        o.a((i10 == 4) == (iInterface != 0));
        synchronized (this.f17330z) {
            this.G = i10;
            this.D = iInterface;
            if (i10 == 1) {
                y0 y0Var = this.F;
                if (y0Var != null) {
                    h hVar = this.f17327w;
                    String c10 = this.f17324t.c();
                    o.i(c10);
                    hVar.e(c10, this.f17324t.b(), this.f17324t.a(), y0Var, X(), this.f17324t.d());
                    this.F = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                y0 y0Var2 = this.F;
                if (y0Var2 != null && (m1Var = this.f17324t) != null) {
                    String c11 = m1Var.c();
                    String b10 = m1Var.b();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c11 + " on " + b10);
                    h hVar2 = this.f17327w;
                    String c12 = this.f17324t.c();
                    o.i(c12);
                    hVar2.e(c12, this.f17324t.b(), this.f17324t.a(), y0Var2, X(), this.f17324t.d());
                    this.P.incrementAndGet();
                }
                y0 y0Var3 = new y0(this, this.P.get());
                this.F = y0Var3;
                m1 m1Var2 = (this.G != 3 || B() == null) ? new m1(G(), F(), false, h.a(), I()) : new m1(y().getPackageName(), B(), true, h.a(), false);
                this.f17324t = m1Var2;
                if (m1Var2.d() && h() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f17324t.c())));
                }
                h hVar3 = this.f17327w;
                String c13 = this.f17324t.c();
                o.i(c13);
                if (!hVar3.f(new f1(c13, this.f17324t.b(), this.f17324t.a(), this.f17324t.d()), y0Var3, X(), w())) {
                    String c14 = this.f17324t.c();
                    String b11 = this.f17324t.b();
                    Log.w("GmsClient", "unable to connect to service: " + c14 + " on " + b11);
                    e0(16, null, this.P.get());
                }
            } else if (i10 == 4) {
                o.i(iInterface);
                K(iInterface);
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set<Scope> C() {
        return Collections.emptySet();
    }

    public final T D() {
        T t10;
        synchronized (this.f17330z) {
            if (this.G == 5) {
                throw new DeadObjectException();
            }
            r();
            t10 = (T) this.D;
            o.j(t10, "Client is connected but service is null");
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public z3.e H() {
        b1 b1Var = this.O;
        if (b1Var == null) {
            return null;
        }
        return b1Var.f17317q;
    }

    protected boolean I() {
        return h() >= 211700000;
    }

    public boolean J() {
        return this.O != null;
    }

    protected void K(T t10) {
        this.f17320p = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(w3.b bVar) {
        this.f17321q = bVar.k();
        this.f17322r = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(int i10) {
        this.f17318n = i10;
        this.f17319o = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.f17329y;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new z0(this, i10, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.L = str;
    }

    public void Q(int i10) {
        Handler handler = this.f17329y;
        handler.sendMessage(handler.obtainMessage(6, this.P.get(), i10));
    }

    protected void R(InterfaceC0247c interfaceC0247c, int i10, PendingIntent pendingIntent) {
        o.j(interfaceC0247c, "Connection progress callbacks cannot be null.");
        this.C = interfaceC0247c;
        Handler handler = this.f17329y;
        handler.sendMessage(handler.obtainMessage(3, this.P.get(), i10, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.K;
        return str == null ? this.f17325u.getClass().getName() : str;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f17330z) {
            z10 = this.G == 4;
        }
        return z10;
    }

    public void d(e eVar) {
        eVar.a();
    }

    public void e(String str) {
        this.f17323s = str;
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e0(int i10, Bundle bundle, int i11) {
        Handler handler = this.f17329y;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new a1(this, i10, null)));
    }

    public void f(InterfaceC0247c interfaceC0247c) {
        o.j(interfaceC0247c, "Connection progress callbacks cannot be null.");
        this.C = interfaceC0247c;
        i0(2, null);
    }

    public boolean g() {
        return true;
    }

    public int h() {
        return w3.f.f16080a;
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f17330z) {
            int i10 = this.G;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final w3.d[] j() {
        b1 b1Var = this.O;
        if (b1Var == null) {
            return null;
        }
        return b1Var.f17315o;
    }

    public String k() {
        m1 m1Var;
        if (!a() || (m1Var = this.f17324t) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return m1Var.b();
    }

    public String l() {
        return this.f17323s;
    }

    public void m() {
        this.P.incrementAndGet();
        synchronized (this.E) {
            int size = this.E.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((w0) this.E.get(i10)).d();
            }
            this.E.clear();
        }
        synchronized (this.A) {
            this.B = null;
        }
        i0(1, null);
    }

    public boolean n() {
        return false;
    }

    public void o(i iVar, Set<Scope> set) {
        Bundle A = A();
        int i10 = this.J;
        String str = this.L;
        int i11 = w3.f.f16080a;
        Scope[] scopeArr = f.B;
        Bundle bundle = new Bundle();
        w3.d[] dVarArr = f.C;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        fVar.f17359q = this.f17325u.getPackageName();
        fVar.f17362t = A;
        if (set != null) {
            fVar.f17361s = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            Account u10 = u();
            if (u10 == null) {
                u10 = new Account("<<default account>>", "com.google");
            }
            fVar.f17363u = u10;
            if (iVar != null) {
                fVar.f17360r = iVar.asBinder();
            }
        } else if (O()) {
            fVar.f17363u = u();
        }
        fVar.f17364v = R;
        fVar.f17365w = v();
        if (S()) {
            fVar.f17368z = true;
        }
        try {
            synchronized (this.A) {
                l lVar = this.B;
                if (lVar != null) {
                    lVar.c0(new x0(this, this.P.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Q(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.P.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.P.get());
        }
    }

    public void q() {
        int h10 = this.f17328x.h(this.f17325u, h());
        if (h10 == 0) {
            f(new d());
            return;
        }
        i0(1, null);
        R(new d(), h10, null);
    }

    protected final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T s(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public w3.d[] v() {
        return R;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f17325u;
    }

    public int z() {
        return this.J;
    }
}
