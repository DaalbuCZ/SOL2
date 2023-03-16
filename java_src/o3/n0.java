package o3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f12018h = m0.f12011n;

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f12019i = l0.f12009n;

    /* renamed from: a  reason: collision with root package name */
    private final int f12020a;

    /* renamed from: e  reason: collision with root package name */
    private int f12024e;

    /* renamed from: f  reason: collision with root package name */
    private int f12025f;

    /* renamed from: g  reason: collision with root package name */
    private int f12026g;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f12022c = new b[5];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f12021b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f12023d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f12027a;

        /* renamed from: b  reason: collision with root package name */
        public int f12028b;

        /* renamed from: c  reason: collision with root package name */
        public float f12029c;

        private b() {
        }
    }

    public n0(int i10) {
        this.f12020a = i10;
    }

    private void d() {
        if (this.f12023d != 1) {
            Collections.sort(this.f12021b, f12018h);
            this.f12023d = 1;
        }
    }

    private void e() {
        if (this.f12023d != 0) {
            Collections.sort(this.f12021b, f12019i);
            this.f12023d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f12027a - bVar2.f12027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f12029c, bVar2.f12029c);
    }

    public void c(int i10, float f10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        d();
        int i13 = this.f12026g;
        if (i13 > 0) {
            b[] bVarArr = this.f12022c;
            int i14 = i13 - 1;
            this.f12026g = i14;
            bVar = bVarArr[i14];
        } else {
            bVar = new b();
        }
        int i15 = this.f12024e;
        this.f12024e = i15 + 1;
        bVar.f12027a = i15;
        bVar.f12028b = i10;
        bVar.f12029c = f10;
        this.f12021b.add(bVar);
        int i16 = this.f12025f + i10;
        while (true) {
            this.f12025f = i16;
            while (true) {
                int i17 = this.f12025f;
                int i18 = this.f12020a;
                if (i17 <= i18) {
                    return;
                }
                i11 = i17 - i18;
                bVar2 = this.f12021b.get(0);
                i12 = bVar2.f12028b;
                if (i12 <= i11) {
                    this.f12025f -= i12;
                    this.f12021b.remove(0);
                    int i19 = this.f12026g;
                    if (i19 < 5) {
                        b[] bVarArr2 = this.f12022c;
                        this.f12026g = i19 + 1;
                        bVarArr2[i19] = bVar2;
                    }
                }
            }
            bVar2.f12028b = i12 - i11;
            i16 = this.f12025f - i11;
        }
    }

    public float f(float f10) {
        ArrayList<b> arrayList;
        e();
        float f11 = f10 * this.f12025f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12021b.size(); i11++) {
            b bVar = this.f12021b.get(i11);
            i10 += bVar.f12028b;
            if (i10 >= f11) {
                return bVar.f12029c;
            }
        }
        if (this.f12021b.isEmpty()) {
            return Float.NaN;
        }
        return this.f12021b.get(arrayList.size() - 1).f12029c;
    }

    public void i() {
        this.f12021b.clear();
        this.f12023d = -1;
        this.f12024e = 0;
        this.f12025f = 0;
    }
}
