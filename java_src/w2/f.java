package w2;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import o3.h0;
import o3.o0;
import s1.m1;
/* loaded from: classes.dex */
public abstract class f implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f16003a = u2.n.a();

    /* renamed from: b  reason: collision with root package name */
    public final o3.p f16004b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16005c;

    /* renamed from: d  reason: collision with root package name */
    public final m1 f16006d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16007e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f16008f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16009g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16010h;

    /* renamed from: i  reason: collision with root package name */
    protected final o0 f16011i;

    public f(o3.l lVar, o3.p pVar, int i10, m1 m1Var, int i11, Object obj, long j10, long j11) {
        this.f16011i = new o0(lVar);
        this.f16004b = (o3.p) p3.a.e(pVar);
        this.f16005c = i10;
        this.f16006d = m1Var;
        this.f16007e = i11;
        this.f16008f = obj;
        this.f16009g = j10;
        this.f16010h = j11;
    }

    public final long a() {
        return this.f16011i.r();
    }

    public final long d() {
        return this.f16010h - this.f16009g;
    }

    public final Map<String, List<String>> e() {
        return this.f16011i.t();
    }

    public final Uri f() {
        return this.f16011i.s();
    }
}
