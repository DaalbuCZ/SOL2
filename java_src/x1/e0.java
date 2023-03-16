package x1;

import java.util.Arrays;
import s1.m1;
/* loaded from: classes.dex */
public interface e0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16209a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f16210b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16211c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16212d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f16209a = i10;
            this.f16210b = bArr;
            this.f16211c = i11;
            this.f16212d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16209a == aVar.f16209a && this.f16211c == aVar.f16211c && this.f16212d == aVar.f16212d && Arrays.equals(this.f16210b, aVar.f16210b);
        }

        public int hashCode() {
            return (((((this.f16209a * 31) + Arrays.hashCode(this.f16210b)) * 31) + this.f16211c) * 31) + this.f16212d;
        }
    }

    int a(o3.i iVar, int i10, boolean z10, int i11);

    void b(p3.a0 a0Var, int i10, int i11);

    void c(long j10, int i10, int i11, int i12, a aVar);

    void d(p3.a0 a0Var, int i10);

    void e(m1 m1Var);

    int f(o3.i iVar, int i10, boolean z10);
}
