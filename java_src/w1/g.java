package w1;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o3.g0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t1.t1;
import w1.g0;
import w1.m;
import w1.o;
import w1.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements o {

    /* renamed from: a  reason: collision with root package name */
    public final List<m.b> f15835a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f15836b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15837c;

    /* renamed from: d  reason: collision with root package name */
    private final b f15838d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15839e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15840f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15841g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, String> f15842h;

    /* renamed from: i  reason: collision with root package name */
    private final p3.i<w.a> f15843i;

    /* renamed from: j  reason: collision with root package name */
    private final o3.g0 f15844j;

    /* renamed from: k  reason: collision with root package name */
    private final t1 f15845k;

    /* renamed from: l  reason: collision with root package name */
    final n0 f15846l;

    /* renamed from: m  reason: collision with root package name */
    final UUID f15847m;

    /* renamed from: n  reason: collision with root package name */
    final e f15848n;

    /* renamed from: o  reason: collision with root package name */
    private int f15849o;

    /* renamed from: p  reason: collision with root package name */
    private int f15850p;

    /* renamed from: q  reason: collision with root package name */
    private HandlerThread f15851q;

    /* renamed from: r  reason: collision with root package name */
    private c f15852r;

    /* renamed from: s  reason: collision with root package name */
    private v1.b f15853s;

    /* renamed from: t  reason: collision with root package name */
    private o.a f15854t;

    /* renamed from: u  reason: collision with root package name */
    private byte[] f15855u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f15856v;

    /* renamed from: w  reason: collision with root package name */
    private g0.a f15857w;

    /* renamed from: x  reason: collision with root package name */
    private g0.d f15858x;

    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);

        void b();

        void c(Exception exc, boolean z10);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(g gVar, int i10);

        void b(g gVar, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15859a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, o0 o0Var) {
            d dVar = (d) message.obj;
            if (dVar.f15862b) {
                int i10 = dVar.f15865e + 1;
                dVar.f15865e = i10;
                if (i10 > g.this.f15844j.d(3)) {
                    return false;
                }
                long b10 = g.this.f15844j.b(new g0.c(new u2.n(dVar.f15861a, o0Var.f15947n, o0Var.f15948o, o0Var.f15949p, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f15863c, o0Var.f15950q), new u2.q(3), o0Var.getCause() instanceof IOException ? (IOException) o0Var.getCause() : new f(o0Var.getCause()), dVar.f15865e));
                if (b10 == -9223372036854775807L) {
                    return false;
                }
                synchronized (this) {
                    if (this.f15859a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), b10);
                    return true;
                }
            }
            return false;
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(u2.n.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f15859a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    g gVar = g.this;
                    bArr = gVar.f15846l.b(gVar.f15847m, (g0.d) dVar.f15864d);
                } else if (i10 != 1) {
                    throw new RuntimeException();
                } else {
                    g gVar2 = g.this;
                    bArr = gVar2.f15846l.a(gVar2.f15847m, (g0.a) dVar.f15864d);
                }
            } catch (o0 e10) {
                boolean a10 = a(message, e10);
                bArr = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                p3.r.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                bArr = e11;
            }
            g.this.f15844j.a(dVar.f15861a);
            synchronized (this) {
                if (!this.f15859a) {
                    g.this.f15848n.obtainMessage(message.what, Pair.create(dVar.f15864d, bArr)).sendToTarget();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f15861a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15862b;

        /* renamed from: c  reason: collision with root package name */
        public final long f15863c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f15864d;

        /* renamed from: e  reason: collision with root package name */
        public int f15865e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f15861a = j10;
            this.f15862b = z10;
            this.f15863c = j11;
            this.f15864d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                g.this.C(obj, obj2);
            } else if (i10 != 1) {
            } else {
                g.this.w(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public g(UUID uuid, g0 g0Var, a aVar, b bVar, List<m.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, n0 n0Var, Looper looper, o3.g0 g0Var2, t1 t1Var) {
        List<m.b> unmodifiableList;
        if (i10 == 1 || i10 == 3) {
            p3.a.e(bArr);
        }
        this.f15847m = uuid;
        this.f15837c = aVar;
        this.f15838d = bVar;
        this.f15836b = g0Var;
        this.f15839e = i10;
        this.f15840f = z10;
        this.f15841g = z11;
        if (bArr != null) {
            this.f15856v = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) p3.a.e(list));
        }
        this.f15835a = unmodifiableList;
        this.f15842h = hashMap;
        this.f15846l = n0Var;
        this.f15843i = new p3.i<>();
        this.f15844j = g0Var2;
        this.f15845k = t1Var;
        this.f15849o = 2;
        this.f15848n = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Object obj, Object obj2) {
        if (obj == this.f15858x) {
            if (this.f15849o == 2 || s()) {
                this.f15858x = null;
                if (obj2 instanceof Exception) {
                    this.f15837c.c((Exception) obj2, false);
                    return;
                }
                try {
                    this.f15836b.i((byte[]) obj2);
                    this.f15837c.b();
                } catch (Exception e10) {
                    this.f15837c.c(e10, true);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean D() {
        if (s()) {
            return true;
        }
        try {
            byte[] n10 = this.f15836b.n();
            this.f15855u = n10;
            this.f15836b.f(n10, this.f15845k);
            this.f15853s = this.f15836b.m(this.f15855u);
            this.f15849o = 3;
            o(new p3.h() { // from class: w1.b
                @Override // p3.h
                public final void accept(Object obj) {
                    ((w.a) obj).k(r1);
                }
            });
            p3.a.e(this.f15855u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f15837c.a(this);
            return false;
        } catch (Exception e10) {
            v(e10, 1);
            return false;
        }
    }

    private void E(byte[] bArr, int i10, boolean z10) {
        try {
            this.f15857w = this.f15836b.j(bArr, this.f15835a, i10, this.f15842h);
            ((c) p3.m0.j(this.f15852r)).b(1, p3.a.e(this.f15857w), z10);
        } catch (Exception e10) {
            x(e10, true);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean G() {
        try {
            this.f15836b.c(this.f15855u, this.f15856v);
            return true;
        } catch (Exception e10) {
            v(e10, 1);
            return false;
        }
    }

    private void o(p3.h<w.a> hVar) {
        for (w.a aVar : this.f15843i.n()) {
            hVar.accept(aVar);
        }
    }

    @RequiresNonNull({"sessionId"})
    private void p(boolean z10) {
        if (this.f15841g) {
            return;
        }
        byte[] bArr = (byte[]) p3.m0.j(this.f15855u);
        int i10 = this.f15839e;
        if (i10 == 0 || i10 == 1) {
            if (this.f15856v == null) {
                E(bArr, 1, z10);
                return;
            } else if (this.f15849o != 4 && !G()) {
                return;
            } else {
                long q10 = q();
                if (this.f15839e != 0 || q10 > 60) {
                    if (q10 <= 0) {
                        v(new m0(), 2);
                        return;
                    }
                    this.f15849o = 4;
                    o(w1.f.f15834a);
                    return;
                }
                p3.r.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + q10);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            p3.a.e(this.f15856v);
            p3.a.e(this.f15855u);
            E(this.f15856v, 3, z10);
            return;
        } else if (this.f15856v != null && !G()) {
            return;
        }
        E(bArr, 2, z10);
    }

    private long q() {
        if (s1.i.f13428d.equals(this.f15847m)) {
            Pair pair = (Pair) p3.a.e(q0.b(this));
            return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean s() {
        int i10 = this.f15849o;
        return i10 == 3 || i10 == 4;
    }

    private void v(final Exception exc, int i10) {
        this.f15854t = new o.a(exc, c0.a(exc, i10));
        p3.r.d("DefaultDrmSession", "DRM session error", exc);
        o(new p3.h() { // from class: w1.c
            @Override // p3.h
            public final void accept(Object obj) {
                ((w.a) obj).l(exc);
            }
        });
        if (this.f15849o != 4) {
            this.f15849o = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Object obj, Object obj2) {
        p3.h<w.a> hVar;
        if (obj == this.f15857w && s()) {
            this.f15857w = null;
            if (obj2 instanceof Exception) {
                x((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f15839e == 3) {
                    this.f15836b.g((byte[]) p3.m0.j(this.f15856v), bArr);
                    hVar = w1.e.f15832a;
                } else {
                    byte[] g10 = this.f15836b.g(this.f15855u, bArr);
                    int i10 = this.f15839e;
                    if ((i10 == 2 || (i10 == 0 && this.f15856v != null)) && g10 != null && g10.length != 0) {
                        this.f15856v = g10;
                    }
                    this.f15849o = 4;
                    hVar = w1.d.f15831a;
                }
                o(hVar);
            } catch (Exception e10) {
                x(e10, true);
            }
        }
    }

    private void x(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f15837c.a(this);
        } else {
            v(exc, z10 ? 1 : 2);
        }
    }

    private void y() {
        if (this.f15839e == 0 && this.f15849o == 4) {
            p3.m0.j(this.f15855u);
            p(false);
        }
    }

    public void A() {
        if (D()) {
            p(true);
        }
    }

    public void B(Exception exc, boolean z10) {
        v(exc, z10 ? 1 : 3);
    }

    public void F() {
        this.f15858x = this.f15836b.h();
        ((c) p3.m0.j(this.f15852r)).b(0, p3.a.e(this.f15858x), true);
    }

    @Override // w1.o
    public boolean a() {
        return this.f15840f;
    }

    @Override // w1.o
    public Map<String, String> b() {
        byte[] bArr = this.f15855u;
        if (bArr == null) {
            return null;
        }
        return this.f15836b.d(bArr);
    }

    @Override // w1.o
    public void c(w.a aVar) {
        int i10 = this.f15850p;
        if (i10 <= 0) {
            p3.r.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15850p = i11;
        if (i11 == 0) {
            this.f15849o = 0;
            ((e) p3.m0.j(this.f15848n)).removeCallbacksAndMessages(null);
            ((c) p3.m0.j(this.f15852r)).c();
            this.f15852r = null;
            ((HandlerThread) p3.m0.j(this.f15851q)).quit();
            this.f15851q = null;
            this.f15853s = null;
            this.f15854t = null;
            this.f15857w = null;
            this.f15858x = null;
            byte[] bArr = this.f15855u;
            if (bArr != null) {
                this.f15836b.e(bArr);
                this.f15855u = null;
            }
        }
        if (aVar != null) {
            this.f15843i.h(aVar);
            if (this.f15843i.g(aVar) == 0) {
                aVar.m();
            }
        }
        this.f15838d.a(this, this.f15850p);
    }

    @Override // w1.o
    public final UUID d() {
        return this.f15847m;
    }

    @Override // w1.o
    public void e(w.a aVar) {
        if (this.f15850p < 0) {
            p3.r.c("DefaultDrmSession", "Session reference count less than zero: " + this.f15850p);
            this.f15850p = 0;
        }
        if (aVar != null) {
            this.f15843i.d(aVar);
        }
        int i10 = this.f15850p + 1;
        this.f15850p = i10;
        if (i10 == 1) {
            p3.a.f(this.f15849o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15851q = handlerThread;
            handlerThread.start();
            this.f15852r = new c(this.f15851q.getLooper());
            if (D()) {
                p(true);
            }
        } else if (aVar != null && s() && this.f15843i.g(aVar) == 1) {
            aVar.k(this.f15849o);
        }
        this.f15838d.b(this, this.f15850p);
    }

    @Override // w1.o
    public final int f() {
        return this.f15849o;
    }

    @Override // w1.o
    public boolean g(String str) {
        return this.f15836b.b((byte[]) p3.a.h(this.f15855u), str);
    }

    @Override // w1.o
    public final o.a h() {
        if (this.f15849o == 1) {
            return this.f15854t;
        }
        return null;
    }

    @Override // w1.o
    public final v1.b i() {
        return this.f15853s;
    }

    public boolean r(byte[] bArr) {
        return Arrays.equals(this.f15855u, bArr);
    }

    public void z(int i10) {
        if (i10 != 2) {
            return;
        }
        y();
    }
}
