package n9;

import k9.g;
import z8.w;
/* loaded from: classes.dex */
public class a implements Iterable<Integer> {

    /* renamed from: q  reason: collision with root package name */
    public static final C0173a f11803q = new C0173a(null);

    /* renamed from: n  reason: collision with root package name */
    private final int f11804n;

    /* renamed from: o  reason: collision with root package name */
    private final int f11805o;

    /* renamed from: p  reason: collision with root package name */
    private final int f11806p;

    /* renamed from: n9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0173a {
        private C0173a() {
        }

        public /* synthetic */ C0173a(g gVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11804n = i10;
        this.f11805o = e9.c.b(i10, i11, i12);
        this.f11806p = i12;
    }

    public final int d() {
        return this.f11804n;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f11804n != aVar.f11804n || this.f11805o != aVar.f11805o || this.f11806p != aVar.f11806p) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f11805o;
    }

    public final int h() {
        return this.f11806p;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f11804n * 31) + this.f11805o) * 31) + this.f11806p;
    }

    public boolean isEmpty() {
        if (this.f11806p > 0) {
            if (this.f11804n > this.f11805o) {
                return true;
            }
        } else if (this.f11804n < this.f11805o) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: k */
    public w iterator() {
        return new b(this.f11804n, this.f11805o, this.f11806p);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f11806p > 0) {
            sb = new StringBuilder();
            sb.append(this.f11804n);
            sb.append("..");
            sb.append(this.f11805o);
            sb.append(" step ");
            i10 = this.f11806p;
        } else {
            sb = new StringBuilder();
            sb.append(this.f11804n);
            sb.append(" downTo ");
            sb.append(this.f11805o);
            sb.append(" step ");
            i10 = -this.f11806p;
        }
        sb.append(i10);
        return sb.toString();
    }
}
