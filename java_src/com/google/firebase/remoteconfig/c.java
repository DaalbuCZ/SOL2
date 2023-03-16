package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.q;
import d4.e;
import d4.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import t4.l;
/* loaded from: classes.dex */
public class c {

    /* renamed from: j  reason: collision with root package name */
    private static final e f5811j = h.d();

    /* renamed from: k  reason: collision with root package name */
    private static final Random f5812k = new Random();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f5813a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5814b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5815c;

    /* renamed from: d  reason: collision with root package name */
    private final f5.e f5816d;

    /* renamed from: e  reason: collision with root package name */
    private final j6.e f5817e;

    /* renamed from: f  reason: collision with root package name */
    private final g5.c f5818f;

    /* renamed from: g  reason: collision with root package name */
    private final i6.b<i5.a> f5819g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5820h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f5821i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, @j5.b Executor executor, f5.e eVar, j6.e eVar2, g5.c cVar, i6.b<i5.a> bVar) {
        this(context, executor, eVar, eVar2, cVar, bVar, true);
    }

    protected c(Context context, Executor executor, f5.e eVar, j6.e eVar2, g5.c cVar, i6.b<i5.a> bVar, boolean z10) {
        this.f5813a = new HashMap();
        this.f5821i = new HashMap();
        this.f5814b = context;
        this.f5815c = executor;
        this.f5816d = eVar;
        this.f5817e = eVar2;
        this.f5818f = cVar;
        this.f5819g = bVar;
        this.f5820h = eVar.q().c();
        if (z10) {
            l.c(executor, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.e();
                }
            });
        }
    }

    private d d(String str, String str2) {
        return d.h(this.f5815c, n.c(this.f5814b, String.format("%s_%s_%s_%s.json", "frc", this.f5820h, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.l h(d dVar, d dVar2) {
        return new com.google.firebase.remoteconfig.internal.l(this.f5815c, dVar, dVar2);
    }

    static m i(Context context, String str, String str2) {
        return new m(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static q j(f5.e eVar, String str, i6.b<i5.a> bVar) {
        if (l(eVar) && str.equals("firebase")) {
            return new q(bVar);
        }
        return null;
    }

    private static boolean k(f5.e eVar, String str) {
        return str.equals("firebase") && l(eVar);
    }

    private static boolean l(f5.e eVar) {
        return eVar.p().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i5.a m() {
        return null;
    }

    synchronized a b(f5.e eVar, String str, j6.e eVar2, g5.c cVar, Executor executor, d dVar, d dVar2, d dVar3, j jVar, com.google.firebase.remoteconfig.internal.l lVar, m mVar) {
        if (!this.f5813a.containsKey(str)) {
            a aVar = new a(this.f5814b, eVar, eVar2, k(eVar, str) ? cVar : null, executor, dVar, dVar2, dVar3, jVar, lVar, mVar);
            aVar.o();
            this.f5813a.put(str, aVar);
        }
        return this.f5813a.get(str);
    }

    public synchronized a c(String str) {
        d d10;
        d d11;
        d d12;
        m i10;
        com.google.firebase.remoteconfig.internal.l h10;
        d10 = d(str, "fetch");
        d11 = d(str, "activate");
        d12 = d(str, "defaults");
        i10 = i(this.f5814b, this.f5820h, str);
        h10 = h(d11, d12);
        final q j10 = j(this.f5816d, str, this.f5819g);
        if (j10 != null) {
            h10.b(new d4.d() { // from class: d7.l
                @Override // d4.d
                public final void a(Object obj, Object obj2) {
                    q.this.a((String) obj, (com.google.firebase.remoteconfig.internal.e) obj2);
                }
            });
        }
        return b(this.f5816d, str, this.f5817e, this.f5818f, this.f5815c, d10, d11, d12, f(str, d10, i10), h10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a e() {
        return c("firebase");
    }

    synchronized j f(String str, d dVar, m mVar) {
        return new j(this.f5817e, l(this.f5816d) ? this.f5819g : d7.m.f6610a, this.f5815c, f5811j, f5812k, dVar, g(this.f5816d.q().b(), str, mVar), mVar, this.f5821i);
    }

    ConfigFetchHttpClient g(String str, String str2, m mVar) {
        return new ConfigFetchHttpClient(this.f5814b, this.f5816d.q().c(), str, str2, mVar.b(), mVar.b());
    }
}
