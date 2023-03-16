package aa;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: s  reason: collision with root package name */
    final transient byte[][] f314s;

    /* renamed from: t  reason: collision with root package name */
    final transient int[] f315t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar, int i10) {
        super(null);
        g.b(aVar.f299o, 0L, i10);
        d dVar = aVar.f298n;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = dVar.f307c;
            int i15 = dVar.f306b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            dVar = dVar.f310f;
        }
        this.f314s = new byte[i13];
        this.f315t = new int[i13 * 2];
        d dVar2 = aVar.f298n;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f314s;
            bArr[i16] = dVar2.f305a;
            int i17 = dVar2.f307c;
            int i18 = dVar2.f306b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f315t;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            dVar2.f308d = true;
            i16++;
            dVar2 = dVar2.f310f;
        }
    }

    private int v(int i10) {
        int binarySearch = Arrays.binarySearch(this.f315t, 0, this.f314s.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private c x() {
        return new c(w());
    }

    @Override // aa.c
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.r() == r() && u(0, cVar, 0, r())) {
                return true;
            }
        }
        return false;
    }

    @Override // aa.c
    public int hashCode() {
        int i10 = this.f303o;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f314s.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f314s[i11];
            int[] iArr = this.f315t;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f303o = i12;
        return i12;
    }

    @Override // aa.c
    public byte l(int i10) {
        g.b(this.f315t[this.f314s.length - 1], i10, 1L);
        int v10 = v(i10);
        int i11 = v10 == 0 ? 0 : this.f315t[v10 - 1];
        int[] iArr = this.f315t;
        byte[][] bArr = this.f314s;
        return bArr[v10][(i10 - i11) + iArr[bArr.length + v10]];
    }

    @Override // aa.c
    public String m() {
        return x().m();
    }

    @Override // aa.c
    public boolean q(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > r() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int v10 = v(i10);
        while (i12 > 0) {
            int i13 = v10 == 0 ? 0 : this.f315t[v10 - 1];
            int min = Math.min(i12, ((this.f315t[v10] - i13) + i13) - i10);
            int[] iArr = this.f315t;
            byte[][] bArr2 = this.f314s;
            if (!g.a(bArr2[v10], (i10 - i13) + iArr[bArr2.length + v10], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            v10++;
        }
        return true;
    }

    @Override // aa.c
    public int r() {
        return this.f315t[this.f314s.length - 1];
    }

    @Override // aa.c
    public c s(int i10, int i11) {
        return x().s(i10, i11);
    }

    @Override // aa.c
    public String t() {
        return x().t();
    }

    @Override // aa.c
    public String toString() {
        return x().toString();
    }

    public boolean u(int i10, c cVar, int i11, int i12) {
        if (i10 < 0 || i10 > r() - i12) {
            return false;
        }
        int v10 = v(i10);
        while (i12 > 0) {
            int i13 = v10 == 0 ? 0 : this.f315t[v10 - 1];
            int min = Math.min(i12, ((this.f315t[v10] - i13) + i13) - i10);
            int[] iArr = this.f315t;
            byte[][] bArr = this.f314s;
            if (!cVar.q(i11, bArr[v10], (i10 - i13) + iArr[bArr.length + v10], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            v10++;
        }
        return true;
    }

    public byte[] w() {
        int[] iArr = this.f315t;
        byte[][] bArr = this.f314s;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f315t;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f314s[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }
}
