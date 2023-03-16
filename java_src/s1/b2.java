package s1;

import u2.u;
/* loaded from: classes.dex */
final class b2 {

    /* renamed from: a  reason: collision with root package name */
    public final u.b f13307a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13308b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13309c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13310d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13311e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13312f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13313g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13314h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13315i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b2(u.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        p3.a.a(!z13 || z11);
        p3.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        p3.a.a(z14);
        this.f13307a = bVar;
        this.f13308b = j10;
        this.f13309c = j11;
        this.f13310d = j12;
        this.f13311e = j13;
        this.f13312f = z10;
        this.f13313g = z11;
        this.f13314h = z12;
        this.f13315i = z13;
    }

    public b2 a(long j10) {
        return j10 == this.f13309c ? this : new b2(this.f13307a, this.f13308b, j10, this.f13310d, this.f13311e, this.f13312f, this.f13313g, this.f13314h, this.f13315i);
    }

    public b2 b(long j10) {
        return j10 == this.f13308b ? this : new b2(this.f13307a, j10, this.f13309c, this.f13310d, this.f13311e, this.f13312f, this.f13313g, this.f13314h, this.f13315i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b2.class != obj.getClass()) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f13308b == b2Var.f13308b && this.f13309c == b2Var.f13309c && this.f13310d == b2Var.f13310d && this.f13311e == b2Var.f13311e && this.f13312f == b2Var.f13312f && this.f13313g == b2Var.f13313g && this.f13314h == b2Var.f13314h && this.f13315i == b2Var.f13315i && p3.m0.c(this.f13307a, b2Var.f13307a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f13307a.hashCode()) * 31) + ((int) this.f13308b)) * 31) + ((int) this.f13309c)) * 31) + ((int) this.f13310d)) * 31) + ((int) this.f13311e)) * 31) + (this.f13312f ? 1 : 0)) * 31) + (this.f13313g ? 1 : 0)) * 31) + (this.f13314h ? 1 : 0)) * 31) + (this.f13315i ? 1 : 0);
    }
}
