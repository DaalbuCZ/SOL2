package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import x3.g;
import x3.j;
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends x3.j> extends x3.g<R> {

    /* renamed from: o */
    static final ThreadLocal<Boolean> f3544o = new c0();

    /* renamed from: p */
    public static final /* synthetic */ int f3545p = 0;

    /* renamed from: f */
    private x3.k<? super R> f3551f;

    /* renamed from: h */
    private R f3553h;

    /* renamed from: i */
    private Status f3554i;

    /* renamed from: j */
    private volatile boolean f3555j;

    /* renamed from: k */
    private boolean f3556k;

    /* renamed from: l */
    private boolean f3557l;

    /* renamed from: m */
    private z3.j f3558m;
    @KeepName
    private d0 mResultGuardian;

    /* renamed from: a */
    private final Object f3546a = new Object();

    /* renamed from: d */
    private final CountDownLatch f3549d = new CountDownLatch(1);

    /* renamed from: e */
    private final ArrayList<g.a> f3550e = new ArrayList<>();

    /* renamed from: g */
    private final AtomicReference<u> f3552g = new AtomicReference<>();

    /* renamed from: n */
    private boolean f3559n = false;

    /* renamed from: b */
    protected final a<R> f3547b = new a<>(Looper.getMainLooper());

    /* renamed from: c */
    protected final WeakReference<x3.f> f3548c = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public static class a<R extends x3.j> extends j4.f {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(x3.k<? super R> kVar, R r10) {
            int i10 = BasePendingResult.f3545p;
            sendMessage(obtainMessage(1, new Pair((x3.k) z3.o.i(kVar), r10)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                x3.k kVar = (x3.k) pair.first;
                x3.j jVar = (x3.j) pair.second;
                try {
                    kVar.a(jVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.h(jVar);
                    throw e10;
                }
            } else if (i10 == 2) {
                ((BasePendingResult) message.obj).b(Status.f3535w);
            } else {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i10);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            }
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R e() {
        R r10;
        synchronized (this.f3546a) {
            z3.o.m(!this.f3555j, "Result has already been consumed.");
            z3.o.m(c(), "Result is not ready.");
            r10 = this.f3553h;
            this.f3553h = null;
            this.f3551f = null;
            this.f3555j = true;
        }
        if (this.f3552g.getAndSet(null) == null) {
            return (R) z3.o.i(r10);
        }
        throw null;
    }

    private final void f(R r10) {
        this.f3553h = r10;
        this.f3554i = r10.d();
        this.f3558m = null;
        this.f3549d.countDown();
        if (this.f3556k) {
            this.f3551f = null;
        } else {
            x3.k<? super R> kVar = this.f3551f;
            if (kVar != null) {
                this.f3547b.removeMessages(2);
                this.f3547b.a(kVar, e());
            } else if (this.f3553h instanceof x3.h) {
                this.mResultGuardian = new d0(this, null);
            }
        }
        ArrayList<g.a> arrayList = this.f3550e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.f3554i);
        }
        this.f3550e.clear();
    }

    public static void h(x3.j jVar) {
        if (jVar instanceof x3.h) {
            try {
                ((x3.h) jVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(jVar)), e10);
            }
        }
    }

    protected abstract R a(Status status);

    @Deprecated
    public final void b(Status status) {
        synchronized (this.f3546a) {
            if (!c()) {
                d(a(status));
                this.f3557l = true;
            }
        }
    }

    public final boolean c() {
        return this.f3549d.getCount() == 0;
    }

    public final void d(R r10) {
        synchronized (this.f3546a) {
            if (this.f3557l || this.f3556k) {
                h(r10);
                return;
            }
            c();
            z3.o.m(!c(), "Results have already been set");
            z3.o.m(!this.f3555j, "Result has already been consumed");
            f(r10);
        }
    }
}
