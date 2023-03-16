package r9;

import b9.g;
/* loaded from: classes.dex */
public final class i0 extends b9.a {

    /* renamed from: p  reason: collision with root package name */
    public static final a f13122p = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private final String f13123o;

    /* loaded from: classes.dex */
    public static final class a implements g.c<i0> {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }

    public final String b() {
        return this.f13123o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && k9.k.a(this.f13123o, ((i0) obj).f13123o);
    }

    public int hashCode() {
        return this.f13123o.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f13123o + ')';
    }
}
