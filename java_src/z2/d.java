package z2;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import h2.h0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k2.a;
import p3.i0;
import p3.v;
import s1.m1;
import t1.t1;
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f17185d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f17186b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17187c;

    public d() {
        this(0, true);
    }

    public d(int i10, boolean z10) {
        this.f17186b = i10;
        this.f17187c = z10;
    }

    private static void b(int i10, List<Integer> list) {
        if (d5.d.g(f17185d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    @SuppressLint({"SwitchIntDef"})
    private x1.l d(int i10, m1 m1Var, List<m1> list, i0 i0Var) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 7) {
                        if (i10 != 8) {
                            if (i10 != 11) {
                                if (i10 != 13) {
                                    return null;
                                }
                                return new t(m1Var.f13578p, i0Var);
                            }
                            return f(this.f17186b, this.f17187c, m1Var, list, i0Var);
                        }
                        return e(i0Var, m1Var, list);
                    }
                    return new e2.f(0, 0L);
                }
                return new h2.h();
            }
            return new h2.e();
        }
        return new h2.b();
    }

    private static f2.g e(i0 i0Var, m1 m1Var, List<m1> list) {
        int i10 = g(m1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new f2.g(i10, i0Var, null, list);
    }

    private static h0 f(int i10, boolean z10, m1 m1Var, List<m1> list, i0 i0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new m1.b().e0("application/cea-608").E()) : Collections.emptyList();
        }
        String str = m1Var.f13584v;
        if (!TextUtils.isEmpty(str)) {
            if (!v.b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!v.b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new h0(2, i0Var, new h2.j(i11, list));
    }

    private static boolean g(m1 m1Var) {
        a.b c10;
        k2.a aVar = m1Var.f13585w;
        if (aVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            if (aVar.c(i10) instanceof q) {
                return !((q) c10).f17292p.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(x1.l lVar, x1.m mVar) {
        try {
            boolean j10 = lVar.j(mVar);
            mVar.g();
            return j10;
        } catch (EOFException unused) {
            mVar.g();
            return false;
        } catch (Throwable th) {
            mVar.g();
            throw th;
        }
    }

    @Override // z2.h
    /* renamed from: c */
    public b a(Uri uri, m1 m1Var, List<m1> list, i0 i0Var, Map<String, List<String>> map, x1.m mVar, t1 t1Var) {
        int a10 = p3.k.a(m1Var.f13587y);
        int b10 = p3.k.b(map);
        int c10 = p3.k.c(uri);
        int[] iArr = f17185d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int i10 : iArr) {
            b(i10, arrayList);
        }
        x1.l lVar = null;
        mVar.g();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            x1.l lVar2 = (x1.l) p3.a.e(d(intValue, m1Var, list, i0Var));
            if (h(lVar2, mVar)) {
                return new b(lVar2, m1Var, i0Var);
            }
            if (lVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                lVar = lVar2;
            }
        }
        return new b((x1.l) p3.a.e(lVar), m1Var, i0Var);
    }
}
