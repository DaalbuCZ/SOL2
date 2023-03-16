package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0269n {

    /* renamed from: c  reason: collision with root package name */
    private static final C0269n f9752c = new C0269n();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9753a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9754b;

    private C0269n() {
        this.f9753a = false;
        this.f9754b = 0L;
    }

    private C0269n(long j10) {
        this.f9753a = true;
        this.f9754b = j10;
    }

    public static C0269n a() {
        return f9752c;
    }

    public static C0269n d(long j10) {
        return new C0269n(j10);
    }

    public long b() {
        if (this.f9753a) {
            return this.f9754b;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f9753a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0269n) {
            C0269n c0269n = (C0269n) obj;
            boolean z10 = this.f9753a;
            if (z10 && c0269n.f9753a) {
                if (this.f9754b == c0269n.f9754b) {
                    return true;
                }
            } else if (z10 == c0269n.f9753a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.f9753a) {
            long j10 = this.f9754b;
            return (int) (j10 ^ (j10 >>> 32));
        }
        return 0;
    }

    public String toString() {
        return this.f9753a ? String.format("OptionalLong[%s]", Long.valueOf(this.f9754b)) : "OptionalLong.empty";
    }
}
