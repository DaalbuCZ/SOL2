package v6;

import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f15712a;

        /* renamed from: b  reason: collision with root package name */
        int f15713b;

        /* renamed from: c  reason: collision with root package name */
        int f15714c;

        public a(int i10, int i11, int i12) {
            this.f15712a = 0;
            this.f15713b = 0;
            this.f15714c = 0;
            this.f15712a = i10;
            this.f15713b = i11;
            this.f15714c = i12;
        }

        public a a(a aVar) {
            return new a(this.f15712a - aVar.d(), this.f15713b - aVar.c(), this.f15714c - aVar.b());
        }

        public int b() {
            return this.f15714c;
        }

        public int c() {
            return this.f15713b;
        }

        public int d() {
            return this.f15712a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i11 += valueAt;
                }
                if (keyAt > 16) {
                    i10 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i10, i11);
    }
}
