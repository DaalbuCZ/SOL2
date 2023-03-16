package s1;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a  reason: collision with root package name */
    private final b f13744a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13745b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.d f13746c;

    /* renamed from: d  reason: collision with root package name */
    private final l3 f13747d;

    /* renamed from: e  reason: collision with root package name */
    private int f13748e;

    /* renamed from: f  reason: collision with root package name */
    private Object f13749f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f13750g;

    /* renamed from: h  reason: collision with root package name */
    private int f13751h;

    /* renamed from: i  reason: collision with root package name */
    private long f13752i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13753j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13754k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13755l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13756m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13757n;

    /* loaded from: classes.dex */
    public interface a {
        void a(t2 t2Var);
    }

    /* loaded from: classes.dex */
    public interface b {
        void p(int i10, Object obj);
    }

    public t2(a aVar, b bVar, l3 l3Var, int i10, p3.d dVar, Looper looper) {
        this.f13745b = aVar;
        this.f13744a = bVar;
        this.f13747d = l3Var;
        this.f13750g = looper;
        this.f13746c = dVar;
        this.f13751h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        p3.a.f(this.f13754k);
        p3.a.f(this.f13750g.getThread() != Thread.currentThread());
        long b10 = this.f13746c.b() + j10;
        while (true) {
            z10 = this.f13756m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f13746c.d();
            wait(j10);
            j10 = b10 - this.f13746c.b();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f13755l;
    }

    public boolean b() {
        return this.f13753j;
    }

    public Looper c() {
        return this.f13750g;
    }

    public int d() {
        return this.f13751h;
    }

    public Object e() {
        return this.f13749f;
    }

    public long f() {
        return this.f13752i;
    }

    public b g() {
        return this.f13744a;
    }

    public l3 h() {
        return this.f13747d;
    }

    public int i() {
        return this.f13748e;
    }

    public synchronized boolean j() {
        return this.f13757n;
    }

    public synchronized void k(boolean z10) {
        this.f13755l = z10 | this.f13755l;
        this.f13756m = true;
        notifyAll();
    }

    public t2 l() {
        p3.a.f(!this.f13754k);
        if (this.f13752i == -9223372036854775807L) {
            p3.a.a(this.f13753j);
        }
        this.f13754k = true;
        this.f13745b.a(this);
        return this;
    }

    public t2 m(Object obj) {
        p3.a.f(!this.f13754k);
        this.f13749f = obj;
        return this;
    }

    public t2 n(int i10) {
        p3.a.f(!this.f13754k);
        this.f13748e = i10;
        return this;
    }
}
