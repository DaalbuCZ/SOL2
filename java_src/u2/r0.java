package u2;

import android.util.SparseArray;
/* loaded from: classes.dex */
final class r0<V> {

    /* renamed from: c  reason: collision with root package name */
    private final p3.h<V> f15355c;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f15354b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    private int f15353a = -1;

    public r0(p3.h<V> hVar) {
        this.f15355c = hVar;
    }

    public void a(int i10, V v10) {
        if (this.f15353a == -1) {
            p3.a.f(this.f15354b.size() == 0);
            this.f15353a = 0;
        }
        if (this.f15354b.size() > 0) {
            SparseArray<V> sparseArray = this.f15354b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            p3.a.a(i10 >= keyAt);
            if (keyAt == i10) {
                SparseArray<V> sparseArray2 = this.f15354b;
                this.f15355c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f15354b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f15354b.size(); i10++) {
            this.f15355c.accept(this.f15354b.valueAt(i10));
        }
        this.f15353a = -1;
        this.f15354b.clear();
    }

    public void c(int i10) {
        for (int size = this.f15354b.size() - 1; size >= 0 && i10 < this.f15354b.keyAt(size); size--) {
            this.f15355c.accept(this.f15354b.valueAt(size));
            this.f15354b.removeAt(size);
        }
        this.f15353a = this.f15354b.size() > 0 ? Math.min(this.f15353a, this.f15354b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f15354b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f15354b.keyAt(i12)) {
                return;
            }
            this.f15355c.accept(this.f15354b.valueAt(i11));
            this.f15354b.removeAt(i11);
            int i13 = this.f15353a;
            if (i13 > 0) {
                this.f15353a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f15353a == -1) {
            this.f15353a = 0;
        }
        while (true) {
            int i11 = this.f15353a;
            if (i11 <= 0 || i10 >= this.f15354b.keyAt(i11)) {
                break;
            }
            this.f15353a--;
        }
        while (this.f15353a < this.f15354b.size() - 1 && i10 >= this.f15354b.keyAt(this.f15353a + 1)) {
            this.f15353a++;
        }
        return this.f15354b.valueAt(this.f15353a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f15354b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f15354b.size() == 0;
    }
}
