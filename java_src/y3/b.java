package y3;

import x3.a;
import x3.a.d;
/* loaded from: classes.dex */
public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f16957a;

    /* renamed from: b  reason: collision with root package name */
    private final x3.a<O> f16958b;

    /* renamed from: c  reason: collision with root package name */
    private final O f16959c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16960d;

    private b(x3.a<O> aVar, O o10, String str) {
        this.f16958b = aVar;
        this.f16959c = o10;
        this.f16960d = str;
        this.f16957a = z3.n.b(aVar, o10, str);
    }

    public static <O extends a.d> b<O> a(x3.a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f16958b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return z3.n.a(this.f16958b, bVar.f16958b) && z3.n.a(this.f16959c, bVar.f16959c) && z3.n.a(this.f16960d, bVar.f16960d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16957a;
    }
}
