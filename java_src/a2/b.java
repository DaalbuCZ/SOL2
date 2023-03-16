package a2;

import java.util.Objects;
import x1.a;
import x1.m;
import x1.s;
import x1.v;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends x1.a {

    /* renamed from: a2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0002b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final v f39a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40b;

        /* renamed from: c  reason: collision with root package name */
        private final s.a f41c;

        private C0002b(v vVar, int i10) {
            this.f39a = vVar;
            this.f40b = i10;
            this.f41c = new s.a();
        }

        private long c(m mVar) {
            while (mVar.m() < mVar.a() - 6 && !s.h(mVar, this.f39a, this.f40b, this.f41c)) {
                mVar.p(1);
            }
            if (mVar.m() >= mVar.a() - 6) {
                mVar.p((int) (mVar.a() - mVar.m()));
                return this.f39a.f16290j;
            }
            return this.f41c.f16277a;
        }

        @Override // x1.a.f
        public a.e a(m mVar, long j10) {
            long q10 = mVar.q();
            long c10 = c(mVar);
            long m10 = mVar.m();
            mVar.p(Math.max(6, this.f39a.f16283c));
            long c11 = c(mVar);
            return (c10 > j10 || c11 <= j10) ? c11 <= j10 ? a.e.f(c11, mVar.m()) : a.e.d(c10, q10) : a.e.e(m10);
        }

        @Override // x1.a.f
        public /* synthetic */ void b() {
            x1.b.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final v vVar, int i10, long j10, long j11) {
        super(new a.d() { // from class: a2.a
            @Override // x1.a.d
            public final long a(long j12) {
                return v.this.i(j12);
            }
        }, new C0002b(vVar, i10), vVar.f(), 0L, vVar.f16290j, j10, j11, vVar.d(), Math.max(6, vVar.f16283c));
        Objects.requireNonNull(vVar);
    }
}
