package x1;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f16193c = new c0(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f16194a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16195b;

    public c0(long j10, long j11) {
        this.f16194a = j10;
        this.f16195b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f16194a == c0Var.f16194a && this.f16195b == c0Var.f16195b;
    }

    public int hashCode() {
        return (((int) this.f16194a) * 31) + ((int) this.f16195b);
    }

    public String toString() {
        return "[timeUs=" + this.f16194a + ", position=" + this.f16195b + "]";
    }
}
