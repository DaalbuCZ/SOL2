package n3;

import android.os.SystemClock;
import b5.q;
import java.util.Arrays;
import java.util.List;
import n3.v;
import o3.g0;
import s1.q3;
import u2.t0;
import u2.v0;
/* loaded from: classes.dex */
public final class b0 {
    public static q3 a(v.a aVar, List<? extends w>[] listArr) {
        boolean z10;
        q.a aVar2 = new q.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            v0 f10 = aVar.f(i10);
            List<? extends w> list = listArr[i10];
            for (int i11 = 0; i11 < f10.f15375n; i11++) {
                t0 b10 = f10.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = b10.f15363n;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f15363n; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        w wVar = list.get(i14);
                        if (wVar.c().equals(b10) && wVar.e(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new q3.a(b10, z11, iArr, zArr));
            }
        }
        v0 h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f15375n; i15++) {
            t0 b11 = h10.b(i15);
            int[] iArr2 = new int[b11.f15363n];
            Arrays.fill(iArr2, 0);
            aVar2.a(new q3.a(b11, false, iArr2, new boolean[b11.f15363n]));
        }
        return new q3(aVar2.h());
    }

    public static q3 b(v.a aVar, w[] wVarArr) {
        List[] listArr = new List[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            w wVar = wVarArr[i10];
            listArr[i10] = wVar != null ? b5.q.K(wVar) : b5.q.J();
        }
        return a(aVar, listArr);
    }

    public static g0.a c(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (tVar.i(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new g0.a(1, 0, length, i10);
    }
}
