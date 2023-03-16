package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    final String f4936a;

    /* renamed from: b  reason: collision with root package name */
    final String f4937b;

    /* renamed from: c  reason: collision with root package name */
    final long f4938c;

    /* renamed from: d  reason: collision with root package name */
    final long f4939d;

    /* renamed from: e  reason: collision with root package name */
    final long f4940e;

    /* renamed from: f  reason: collision with root package name */
    final long f4941f;

    /* renamed from: g  reason: collision with root package name */
    final long f4942g;

    /* renamed from: h  reason: collision with root package name */
    final Long f4943h;

    /* renamed from: i  reason: collision with root package name */
    final Long f4944i;

    /* renamed from: j  reason: collision with root package name */
    final Long f4945j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f4946k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        z3.o.e(str);
        z3.o.e(str2);
        z3.o.a(j10 >= 0);
        z3.o.a(j11 >= 0);
        z3.o.a(j12 >= 0);
        z3.o.a(j14 >= 0);
        this.f4936a = str;
        this.f4937b = str2;
        this.f4938c = j10;
        this.f4939d = j11;
        this.f4940e = j12;
        this.f4941f = j13;
        this.f4942g = j14;
        this.f4943h = l10;
        this.f4944i = l11;
        this.f4945j = l12;
        this.f4946k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r a(Long l10, Long l11, Boolean bool) {
        return new r(this.f4936a, this.f4937b, this.f4938c, this.f4939d, this.f4940e, this.f4941f, this.f4942g, this.f4943h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(long j10, long j11) {
        return new r(this.f4936a, this.f4937b, this.f4938c, this.f4939d, this.f4940e, this.f4941f, j10, Long.valueOf(j11), this.f4944i, this.f4945j, this.f4946k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r c(long j10) {
        return new r(this.f4936a, this.f4937b, this.f4938c, this.f4939d, this.f4940e, j10, this.f4942g, this.f4943h, this.f4944i, this.f4945j, this.f4946k);
    }
}
