package z3;

import android.content.Context;
import android.util.SparseIntArray;
import x3.a;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f17376a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private w3.f f17377b;

    public g0(w3.f fVar) {
        o.i(fVar);
        this.f17377b = fVar;
    }

    public final int a(Context context, int i10) {
        return this.f17376a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        o.i(context);
        o.i(fVar);
        int i10 = 0;
        if (fVar.g()) {
            int h10 = fVar.h();
            int a10 = a(context, h10);
            if (a10 == -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f17376a.size()) {
                        i10 = -1;
                        break;
                    }
                    int keyAt = this.f17376a.keyAt(i11);
                    if (keyAt > h10 && this.f17376a.get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                }
                a10 = i10 == -1 ? this.f17377b.h(context, h10) : i10;
                this.f17376a.put(h10, a10);
            }
            return a10;
        }
        return 0;
    }

    public final void c() {
        this.f17376a.clear();
    }
}
