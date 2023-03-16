package w1;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import b5.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s1.m1;
import t1.t1;
import w1.g;
import w1.g0;
import w1.h;
import w1.m;
import w1.o;
import w1.w;
import w1.y;
/* loaded from: classes.dex */
public class h implements y {

    /* renamed from: c  reason: collision with root package name */
    private final UUID f15872c;

    /* renamed from: d  reason: collision with root package name */
    private final g0.c f15873d;

    /* renamed from: e  reason: collision with root package name */
    private final n0 f15874e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, String> f15875f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15876g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f15877h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f15878i;

    /* renamed from: j  reason: collision with root package name */
    private final g f15879j;

    /* renamed from: k  reason: collision with root package name */
    private final o3.g0 f15880k;

    /* renamed from: l  reason: collision with root package name */
    private final C0229h f15881l;

    /* renamed from: m  reason: collision with root package name */
    private final long f15882m;

    /* renamed from: n  reason: collision with root package name */
    private final List<w1.g> f15883n;

    /* renamed from: o  reason: collision with root package name */
    private final Set<f> f15884o;

    /* renamed from: p  reason: collision with root package name */
    private final Set<w1.g> f15885p;

    /* renamed from: q  reason: collision with root package name */
    private int f15886q;

    /* renamed from: r  reason: collision with root package name */
    private g0 f15887r;

    /* renamed from: s  reason: collision with root package name */
    private w1.g f15888s;

    /* renamed from: t  reason: collision with root package name */
    private w1.g f15889t;

    /* renamed from: u  reason: collision with root package name */
    private Looper f15890u;

    /* renamed from: v  reason: collision with root package name */
    private Handler f15891v;

    /* renamed from: w  reason: collision with root package name */
    private int f15892w;

    /* renamed from: x  reason: collision with root package name */
    private byte[] f15893x;

    /* renamed from: y  reason: collision with root package name */
    private t1 f15894y;

    /* renamed from: z  reason: collision with root package name */
    volatile d f15895z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        private boolean f15899d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15901f;

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f15896a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private UUID f15897b = s1.i.f13428d;

        /* renamed from: c  reason: collision with root package name */
        private g0.c f15898c = k0.f15924d;

        /* renamed from: g  reason: collision with root package name */
        private o3.g0 f15902g = new o3.x();

        /* renamed from: e  reason: collision with root package name */
        private int[] f15900e = new int[0];

        /* renamed from: h  reason: collision with root package name */
        private long f15903h = 300000;

        public h a(n0 n0Var) {
            return new h(this.f15897b, this.f15898c, n0Var, this.f15896a, this.f15899d, this.f15900e, this.f15901f, this.f15902g, this.f15903h);
        }

        public b b(boolean z10) {
            this.f15899d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f15901f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                p3.a.a(z10);
            }
            this.f15900e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, g0.c cVar) {
            this.f15897b = (UUID) p3.a.e(uuid);
            this.f15898c = (g0.c) p3.a.e(cVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private class c implements g0.b {
        private c() {
        }

        @Override // w1.g0.b
        public void a(g0 g0Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) p3.a.e(h.this.f15895z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (w1.g gVar : h.this.f15883n) {
                if (gVar.r(bArr)) {
                    gVar.z(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements y.b {

        /* renamed from: b  reason: collision with root package name */
        private final w.a f15906b;

        /* renamed from: c  reason: collision with root package name */
        private o f15907c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15908d;

        public f(w.a aVar) {
            this.f15906b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(m1 m1Var) {
            if (h.this.f15886q == 0 || this.f15908d) {
                return;
            }
            h hVar = h.this;
            this.f15907c = hVar.u((Looper) p3.a.e(hVar.f15890u), this.f15906b, m1Var, false);
            h.this.f15884o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            if (this.f15908d) {
                return;
            }
            o oVar = this.f15907c;
            if (oVar != null) {
                oVar.c(this.f15906b);
            }
            h.this.f15884o.remove(this);
            this.f15908d = true;
        }

        @Override // w1.y.b
        public void a() {
            p3.m0.J0((Handler) p3.a.e(h.this.f15891v), new Runnable() { // from class: w1.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.f();
                }
            });
        }

        public void d(final m1 m1Var) {
            ((Handler) p3.a.e(h.this.f15891v)).post(new Runnable() { // from class: w1.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.e(m1Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<w1.g> f15910a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private w1.g f15911b;

        public g(h hVar) {
        }

        @Override // w1.g.a
        public void a(w1.g gVar) {
            this.f15910a.add(gVar);
            if (this.f15911b != null) {
                return;
            }
            this.f15911b = gVar;
            gVar.F();
        }

        @Override // w1.g.a
        public void b() {
            this.f15911b = null;
            b5.q F = b5.q.F(this.f15910a);
            this.f15910a.clear();
            s0 it = F.iterator();
            while (it.hasNext()) {
                ((w1.g) it.next()).A();
            }
        }

        @Override // w1.g.a
        public void c(Exception exc, boolean z10) {
            this.f15911b = null;
            b5.q F = b5.q.F(this.f15910a);
            this.f15910a.clear();
            s0 it = F.iterator();
            while (it.hasNext()) {
                ((w1.g) it.next()).B(exc, z10);
            }
        }

        public void d(w1.g gVar) {
            this.f15910a.remove(gVar);
            if (this.f15911b == gVar) {
                this.f15911b = null;
                if (this.f15910a.isEmpty()) {
                    return;
                }
                w1.g next = this.f15910a.iterator().next();
                this.f15911b = next;
                next.F();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0229h implements g.b {
        private C0229h() {
        }

        @Override // w1.g.b
        public void a(final w1.g gVar, int i10) {
            if (i10 == 1 && h.this.f15886q > 0 && h.this.f15882m != -9223372036854775807L) {
                h.this.f15885p.add(gVar);
                ((Handler) p3.a.e(h.this.f15891v)).postAtTime(new Runnable() { // from class: w1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.c(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f15882m);
            } else if (i10 == 0) {
                h.this.f15883n.remove(gVar);
                if (h.this.f15888s == gVar) {
                    h.this.f15888s = null;
                }
                if (h.this.f15889t == gVar) {
                    h.this.f15889t = null;
                }
                h.this.f15879j.d(gVar);
                if (h.this.f15882m != -9223372036854775807L) {
                    ((Handler) p3.a.e(h.this.f15891v)).removeCallbacksAndMessages(gVar);
                    h.this.f15885p.remove(gVar);
                }
            }
            h.this.D();
        }

        @Override // w1.g.b
        public void b(w1.g gVar, int i10) {
            if (h.this.f15882m != -9223372036854775807L) {
                h.this.f15885p.remove(gVar);
                ((Handler) p3.a.e(h.this.f15891v)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    private h(UUID uuid, g0.c cVar, n0 n0Var, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, o3.g0 g0Var, long j10) {
        p3.a.e(uuid);
        p3.a.b(!s1.i.f13426b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f15872c = uuid;
        this.f15873d = cVar;
        this.f15874e = n0Var;
        this.f15875f = hashMap;
        this.f15876g = z10;
        this.f15877h = iArr;
        this.f15878i = z11;
        this.f15880k = g0Var;
        this.f15879j = new g(this);
        this.f15881l = new C0229h();
        this.f15892w = 0;
        this.f15883n = new ArrayList();
        this.f15884o = b5.p0.h();
        this.f15885p = b5.p0.h();
        this.f15882m = j10;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void A(Looper looper) {
        Looper looper2 = this.f15890u;
        if (looper2 == null) {
            this.f15890u = looper;
            this.f15891v = new Handler(looper);
        } else {
            p3.a.f(looper2 == looper);
            p3.a.e(this.f15891v);
        }
    }

    private o B(int i10, boolean z10) {
        g0 g0Var = (g0) p3.a.e(this.f15887r);
        if ((g0Var.k() == 2 && h0.f15913d) || p3.m0.x0(this.f15877h, i10) == -1 || g0Var.k() == 1) {
            return null;
        }
        w1.g gVar = this.f15888s;
        if (gVar == null) {
            w1.g y10 = y(b5.q.J(), true, null, z10);
            this.f15883n.add(y10);
            this.f15888s = y10;
        } else {
            gVar.e(null);
        }
        return this.f15888s;
    }

    private void C(Looper looper) {
        if (this.f15895z == null) {
            this.f15895z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f15887r != null && this.f15886q == 0 && this.f15883n.isEmpty() && this.f15884o.isEmpty()) {
            ((g0) p3.a.e(this.f15887r)).a();
            this.f15887r = null;
        }
    }

    private void E() {
        s0 it = b5.s.D(this.f15885p).iterator();
        while (it.hasNext()) {
            ((o) it.next()).c(null);
        }
    }

    private void F() {
        s0 it = b5.s.D(this.f15884o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void H(o oVar, w.a aVar) {
        oVar.c(aVar);
        if (this.f15882m != -9223372036854775807L) {
            oVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o u(Looper looper, w.a aVar, m1 m1Var, boolean z10) {
        List<m.b> list;
        C(looper);
        m mVar = m1Var.B;
        if (mVar == null) {
            return B(p3.v.k(m1Var.f13587y), z10);
        }
        w1.g gVar = null;
        if (this.f15893x == null) {
            list = z((m) p3.a.e(mVar), this.f15872c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f15872c);
                p3.r.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new e0(new o.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f15876g) {
            Iterator<w1.g> it = this.f15883n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w1.g next = it.next();
                if (p3.m0.c(next.f15835a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f15889t;
        }
        if (gVar == null) {
            gVar = y(list, false, aVar, z10);
            if (!this.f15876g) {
                this.f15889t = gVar;
            }
            this.f15883n.add(gVar);
        } else {
            gVar.e(aVar);
        }
        return gVar;
    }

    private static boolean v(o oVar) {
        return oVar.f() == 1 && (p3.m0.f12306a < 19 || (((o.a) p3.a.e(oVar.h())).getCause() instanceof ResourceBusyException));
    }

    private boolean w(m mVar) {
        if (this.f15893x != null) {
            return true;
        }
        if (z(mVar, this.f15872c, true).isEmpty()) {
            if (mVar.f15940q != 1 || !mVar.e(0).d(s1.i.f13426b)) {
                return false;
            }
            p3.r.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f15872c);
        }
        String str = mVar.f15939p;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? p3.m0.f12306a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private w1.g x(List<m.b> list, boolean z10, w.a aVar) {
        p3.a.e(this.f15887r);
        w1.g gVar = new w1.g(this.f15872c, this.f15887r, this.f15879j, this.f15881l, list, this.f15892w, this.f15878i | z10, z10, this.f15893x, this.f15875f, this.f15874e, (Looper) p3.a.e(this.f15890u), this.f15880k, (t1) p3.a.e(this.f15894y));
        gVar.e(aVar);
        if (this.f15882m != -9223372036854775807L) {
            gVar.e(null);
        }
        return gVar;
    }

    private w1.g y(List<m.b> list, boolean z10, w.a aVar, boolean z11) {
        w1.g x10 = x(list, z10, aVar);
        if (v(x10) && !this.f15885p.isEmpty()) {
            E();
            H(x10, aVar);
            x10 = x(list, z10, aVar);
        }
        if (v(x10) && z11 && !this.f15884o.isEmpty()) {
            F();
            if (!this.f15885p.isEmpty()) {
                E();
            }
            H(x10, aVar);
            return x(list, z10, aVar);
        }
        return x10;
    }

    private static List<m.b> z(m mVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(mVar.f15940q);
        for (int i10 = 0; i10 < mVar.f15940q; i10++) {
            m.b e10 = mVar.e(i10);
            if ((e10.d(uuid) || (s1.i.f13427c.equals(uuid) && e10.d(s1.i.f13426b))) && (e10.f15945r != null || z10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public void G(int i10, byte[] bArr) {
        p3.a.f(this.f15883n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            p3.a.e(bArr);
        }
        this.f15892w = i10;
        this.f15893x = bArr;
    }

    @Override // w1.y
    public final void a() {
        int i10 = this.f15886q - 1;
        this.f15886q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f15882m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f15883n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((w1.g) arrayList.get(i11)).c(null);
            }
        }
        F();
        D();
    }

    @Override // w1.y
    public final void b() {
        int i10 = this.f15886q;
        this.f15886q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f15887r == null) {
            g0 a10 = this.f15873d.a(this.f15872c);
            this.f15887r = a10;
            a10.l(new c());
        } else if (this.f15882m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f15883n.size(); i11++) {
                this.f15883n.get(i11).e(null);
            }
        }
    }

    @Override // w1.y
    public o c(w.a aVar, m1 m1Var) {
        p3.a.f(this.f15886q > 0);
        p3.a.h(this.f15890u);
        return u(this.f15890u, aVar, m1Var, true);
    }

    @Override // w1.y
    public y.b d(w.a aVar, m1 m1Var) {
        p3.a.f(this.f15886q > 0);
        p3.a.h(this.f15890u);
        f fVar = new f(aVar);
        fVar.d(m1Var);
        return fVar;
    }

    @Override // w1.y
    public void e(Looper looper, t1 t1Var) {
        A(looper);
        this.f15894y = t1Var;
    }

    @Override // w1.y
    public int f(m1 m1Var) {
        int k10 = ((g0) p3.a.e(this.f15887r)).k();
        m mVar = m1Var.B;
        if (mVar != null) {
            if (w(mVar)) {
                return k10;
            }
            return 1;
        }
        if (p3.m0.x0(this.f15877h, p3.v.k(m1Var.f13587y)) != -1) {
            return k10;
        }
        return 0;
    }
}
