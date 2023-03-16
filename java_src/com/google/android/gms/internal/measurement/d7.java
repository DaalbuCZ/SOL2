package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class d7 {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static volatile a7 f3796h;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f3800l = 0;

    /* renamed from: a  reason: collision with root package name */
    final z6 f3801a;

    /* renamed from: b  reason: collision with root package name */
    final String f3802b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3803c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f3804d = -1;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f3805e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3806f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f3795g = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReference f3797i = new AtomicReference();

    /* renamed from: j  reason: collision with root package name */
    private static final f7 f3798j = new f7(u6.f4234a, null);

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicInteger f3799k = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ d7(z6 z6Var, String str, Object obj, boolean z10, c7 c7Var) {
        if (z6Var.f4331b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f3801a = z6Var;
        this.f3802b = str;
        this.f3803c = obj;
        this.f3806f = true;
    }

    public static void d() {
        f3799k.incrementAndGet();
    }

    public static void e(final Context context) {
        if (f3796h == null) {
            Object obj = f3795g;
            synchronized (obj) {
                if (f3796h == null) {
                    synchronized (obj) {
                        a7 a7Var = f3796h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (a7Var == null || a7Var.a() != context) {
                            g6.e();
                            e7.c();
                            o6.e();
                            f3796h = new d6(context, o7.a(new k7() { // from class: com.google.android.gms.internal.measurement.t6
                                @Override // com.google.android.gms.internal.measurement.k7
                                public final Object a() {
                                    Context context2 = context;
                                    int i10 = d7.f3800l;
                                    return p6.a(context2);
                                }
                            }));
                            f3799k.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0029, B:16:0x0037, B:20:0x0060, B:22:0x006a, B:38:0x009b, B:40:0x00ab, B:42:0x00bf, B:43:0x00c2, B:44:0x00c6, B:26:0x0073, B:28:0x0079, B:32:0x008b, B:34:0x0091, B:37:0x0099, B:31:0x0089, B:18:0x0050, B:45:0x00cb, B:46:0x00d0, B:47:0x00d1), top: B:54:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r6 = this;
            boolean r0 = r6.f3806f
            if (r0 != 0) goto Lb
            java.lang.String r0 = r6.f3802b
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        Lb:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.d7.f3799k
            int r0 = r0.get()
            int r1 = r6.f3804d
            if (r1 >= r0) goto Ld6
            monitor-enter(r6)
            int r1 = r6.f3804d     // Catch: java.lang.Throwable -> Ld3
            if (r1 >= r0) goto Ld1
            com.google.android.gms.internal.measurement.a7 r1 = com.google.android.gms.internal.measurement.d7.f3796h     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto Lcb
            com.google.android.gms.internal.measurement.z6 r2 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            boolean r3 = r2.f4335f     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r2 = r2.f4331b     // Catch: java.lang.Throwable -> Ld3
            r3 = 0
            if (r2 == 0) goto L50
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.z6 r4 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r4 = r4.f4331b     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = com.google.android.gms.internal.measurement.q6.a(r2, r4)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L4e
            com.google.android.gms.internal.measurement.z6 r2 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.f4337h     // Catch: java.lang.Throwable -> Ld3
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.z6 r4 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r4 = r4.f4331b     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.s6 r5 = com.google.android.gms.internal.measurement.s6.f4150n     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.g6 r2 = com.google.android.gms.internal.measurement.g6.b(r2, r4, r5)     // Catch: java.lang.Throwable -> Ld3
            goto L5e
        L4e:
            r2 = r3
            goto L5e
        L50:
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.z6 r4 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r4 = r4.f4330a     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.s6 r4 = com.google.android.gms.internal.measurement.s6.f4150n     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.e7 r2 = com.google.android.gms.internal.measurement.e7.b(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld3
        L5e:
            if (r2 == 0) goto L6f
            java.lang.String r4 = r6.c()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r2 = r2.a(r4)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> Ld3
            goto L70
        L6f:
            r2 = r3
        L70:
            if (r2 == 0) goto L73
            goto L9b
        L73:
            com.google.android.gms.internal.measurement.z6 r2 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.f4334e     // Catch: java.lang.Throwable -> Ld3
            if (r2 != 0) goto L96
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.o6 r2 = com.google.android.gms.internal.measurement.o6.b(r2)     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.z6 r4 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            boolean r4 = r4.f4334e     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto L89
            r4 = r3
            goto L8b
        L89:
            java.lang.String r4 = r6.f3802b     // Catch: java.lang.Throwable -> Ld3
        L8b:
            java.lang.String r2 = r2.a(r4)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L96
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> Ld3
            goto L97
        L96:
            r2 = r3
        L97:
            if (r2 != 0) goto L9b
            java.lang.Object r2 = r6.f3803c     // Catch: java.lang.Throwable -> Ld3
        L9b:
            com.google.android.gms.internal.measurement.k7 r1 = r1.b()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.i7 r1 = (com.google.android.gms.internal.measurement.i7) r1     // Catch: java.lang.Throwable -> Ld3
            boolean r4 = r1.b()     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto Lc6
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.i6 r1 = (com.google.android.gms.internal.measurement.i6) r1     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.measurement.z6 r2 = r6.f3801a     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r4 = r2.f4331b     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = r2.f4333d     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = r6.f3802b     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = r1.a(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> Ld3
            if (r1 != 0) goto Lc2
            java.lang.Object r2 = r6.f3803c     // Catch: java.lang.Throwable -> Ld3
            goto Lc6
        Lc2:
            java.lang.Object r2 = r6.a(r1)     // Catch: java.lang.Throwable -> Ld3
        Lc6:
            r6.f3805e = r2     // Catch: java.lang.Throwable -> Ld3
            r6.f3804d = r0     // Catch: java.lang.Throwable -> Ld3
            goto Ld1
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld3
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld3
            throw r0     // Catch: java.lang.Throwable -> Ld3
        Ld1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld3
            goto Ld6
        Ld3:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld3
            throw r0
        Ld6:
            java.lang.Object r0 = r6.f3805e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d7.b():java.lang.Object");
    }

    public final String c() {
        String str = this.f3801a.f4333d;
        return this.f3802b;
    }
}
