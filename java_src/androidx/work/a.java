package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k0.g;
import k0.i;
import k0.q;
import k0.v;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    final Executor f2534a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f2535b;

    /* renamed from: c  reason: collision with root package name */
    final v f2536c;

    /* renamed from: d  reason: collision with root package name */
    final i f2537d;

    /* renamed from: e  reason: collision with root package name */
    final q f2538e;

    /* renamed from: f  reason: collision with root package name */
    final g f2539f;

    /* renamed from: g  reason: collision with root package name */
    final String f2540g;

    /* renamed from: h  reason: collision with root package name */
    final int f2541h;

    /* renamed from: i  reason: collision with root package name */
    final int f2542i;

    /* renamed from: j  reason: collision with root package name */
    final int f2543j;

    /* renamed from: k  reason: collision with root package name */
    final int f2544k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f2545l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0049a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f2546a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f2547b;

        ThreadFactoryC0049a(boolean z10) {
            this.f2547b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.f2547b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f2546a.incrementAndGet());
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        Executor f2549a;

        /* renamed from: b  reason: collision with root package name */
        v f2550b;

        /* renamed from: c  reason: collision with root package name */
        i f2551c;

        /* renamed from: d  reason: collision with root package name */
        Executor f2552d;

        /* renamed from: e  reason: collision with root package name */
        q f2553e;

        /* renamed from: f  reason: collision with root package name */
        g f2554f;

        /* renamed from: g  reason: collision with root package name */
        String f2555g;

        /* renamed from: h  reason: collision with root package name */
        int f2556h = 4;

        /* renamed from: i  reason: collision with root package name */
        int f2557i = 0;

        /* renamed from: j  reason: collision with root package name */
        int f2558j = Integer.MAX_VALUE;

        /* renamed from: k  reason: collision with root package name */
        int f2559k = 20;

        public a a() {
            return new a(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        a a();
    }

    a(b bVar) {
        Executor executor = bVar.f2549a;
        this.f2534a = executor == null ? a(false) : executor;
        Executor executor2 = bVar.f2552d;
        if (executor2 == null) {
            this.f2545l = true;
            executor2 = a(true);
        } else {
            this.f2545l = false;
        }
        this.f2535b = executor2;
        v vVar = bVar.f2550b;
        this.f2536c = vVar == null ? v.c() : vVar;
        i iVar = bVar.f2551c;
        this.f2537d = iVar == null ? i.c() : iVar;
        q qVar = bVar.f2553e;
        this.f2538e = qVar == null ? new l0.a() : qVar;
        this.f2541h = bVar.f2556h;
        this.f2542i = bVar.f2557i;
        this.f2543j = bVar.f2558j;
        this.f2544k = bVar.f2559k;
        this.f2539f = bVar.f2554f;
        this.f2540g = bVar.f2555g;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new ThreadFactoryC0049a(z10);
    }

    public String c() {
        return this.f2540g;
    }

    public g d() {
        return this.f2539f;
    }

    public Executor e() {
        return this.f2534a;
    }

    public i f() {
        return this.f2537d;
    }

    public int g() {
        return this.f2543j;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f2544k / 2 : this.f2544k;
    }

    public int i() {
        return this.f2542i;
    }

    public int j() {
        return this.f2541h;
    }

    public q k() {
        return this.f2538e;
    }

    public Executor l() {
        return this.f2535b;
    }

    public v m() {
        return this.f2536c;
    }
}
