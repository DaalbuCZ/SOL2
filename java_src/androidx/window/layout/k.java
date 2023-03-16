package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.j;
import java.util.Objects;
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2457d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final i0.b f2458a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2459b;

    /* renamed from: c  reason: collision with root package name */
    private final j.b f2460c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }

        public final void a(i0.b bVar) {
            k9.k.e(bVar, "bounds");
            boolean z10 = false;
            if (!((bVar.d() == 0 && bVar.a() == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (bVar.b() == 0 || bVar.c() == 0) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f2461b = new a(null);

        /* renamed from: c  reason: collision with root package name */
        private static final b f2462c = new b("FOLD");

        /* renamed from: d  reason: collision with root package name */
        private static final b f2463d = new b("HINGE");

        /* renamed from: a  reason: collision with root package name */
        private final String f2464a;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(k9.g gVar) {
                this();
            }

            public final b a() {
                return b.f2462c;
            }

            public final b b() {
                return b.f2463d;
            }
        }

        private b(String str) {
            this.f2464a = str;
        }

        public String toString() {
            return this.f2464a;
        }
    }

    public k(i0.b bVar, b bVar2, j.b bVar3) {
        k9.k.e(bVar, "featureBounds");
        k9.k.e(bVar2, "type");
        k9.k.e(bVar3, "state");
        this.f2458a = bVar;
        this.f2459b = bVar2;
        this.f2460c = bVar3;
        f2457d.a(bVar);
    }

    @Override // androidx.window.layout.e
    public Rect a() {
        return this.f2458a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (k9.k.a(k.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
            k kVar = (k) obj;
            return k9.k.a(this.f2458a, kVar.f2458a) && k9.k.a(this.f2459b, kVar.f2459b) && k9.k.a(f(), kVar.f());
        }
        return false;
    }

    @Override // androidx.window.layout.j
    public j.b f() {
        return this.f2460c;
    }

    @Override // androidx.window.layout.j
    public j.a g() {
        return (this.f2458a.d() == 0 || this.f2458a.a() == 0) ? j.a.f2450c : j.a.f2451d;
    }

    public int hashCode() {
        return (((this.f2458a.hashCode() * 31) + this.f2459b.hashCode()) * 31) + f().hashCode();
    }

    public String toString() {
        return ((Object) k.class.getSimpleName()) + " { " + this.f2458a + ", type=" + this.f2459b + ", state=" + f() + " }";
    }
}
