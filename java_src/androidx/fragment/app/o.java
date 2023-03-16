package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1997a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    private static final q f1998b;

    /* renamed from: c  reason: collision with root package name */
    private static final q f1999c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ArrayList f2000n;

        a(ArrayList arrayList) {
            this.f2000n = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.A(this.f2000n, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Object f2001n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ q f2002o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ View f2003p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Fragment f2004q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ ArrayList f2005r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ ArrayList f2006s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ ArrayList f2007t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ Object f2008u;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2001n = obj;
            this.f2002o = qVar;
            this.f2003p = view;
            this.f2004q = fragment;
            this.f2005r = arrayList;
            this.f2006s = arrayList2;
            this.f2007t = arrayList3;
            this.f2008u = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2001n;
            if (obj != null) {
                this.f2002o.p(obj, this.f2003p);
                this.f2006s.addAll(o.k(this.f2002o, this.f2001n, this.f2004q, this.f2005r, this.f2003p));
            }
            if (this.f2007t != null) {
                if (this.f2008u != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2003p);
                    this.f2002o.q(this.f2008u, this.f2007t, arrayList);
                }
                this.f2007t.clear();
                this.f2007t.add(this.f2003p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Fragment f2009n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Fragment f2010o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f2011p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ m.a f2012q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ View f2013r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ q f2014s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Rect f2015t;

        c(Fragment fragment, Fragment fragment2, boolean z10, m.a aVar, View view, q qVar, Rect rect) {
            this.f2009n = fragment;
            this.f2010o = fragment2;
            this.f2011p = z10;
            this.f2012q = aVar;
            this.f2013r = view;
            this.f2014s = qVar;
            this.f2015t = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.f(this.f2009n, this.f2010o, this.f2011p, this.f2012q, false);
            View view = this.f2013r;
            if (view != null) {
                this.f2014s.k(view, this.f2015t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ q f2016n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ m.a f2017o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f2018p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e f2019q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ ArrayList f2020r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ View f2021s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Fragment f2022t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ Fragment f2023u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ boolean f2024v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ ArrayList f2025w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ Object f2026x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ Rect f2027y;

        d(q qVar, m.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2016n = qVar;
            this.f2017o = aVar;
            this.f2018p = obj;
            this.f2019q = eVar;
            this.f2020r = arrayList;
            this.f2021s = view;
            this.f2022t = fragment;
            this.f2023u = fragment2;
            this.f2024v = z10;
            this.f2025w = arrayList2;
            this.f2026x = obj2;
            this.f2027y = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.a<String, View> h10 = o.h(this.f2016n, this.f2017o, this.f2018p, this.f2019q);
            if (h10 != null) {
                this.f2020r.addAll(h10.values());
                this.f2020r.add(this.f2021s);
            }
            o.f(this.f2022t, this.f2023u, this.f2024v, h10, false);
            Object obj = this.f2018p;
            if (obj != null) {
                this.f2016n.z(obj, this.f2025w, this.f2020r);
                View s10 = o.s(h10, this.f2019q, this.f2026x, this.f2024v);
                if (s10 != null) {
                    this.f2016n.k(s10, this.f2027y);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f2028a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2029b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.fragment.app.a f2030c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f2031d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2032e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f2033f;

        e() {
        }
    }

    static {
        f1998b = Build.VERSION.SDK_INT >= 21 ? new p() : null;
        f1999c = w();
    }

    static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(j jVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10) {
        if (jVar.C < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(jVar.D.f());
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                m.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                e eVar = (e) sparseArray.valueAt(i13);
                if (z10) {
                    o(jVar, keyAt, eVar, view, d10);
                } else {
                    n(jVar, keyAt, eVar, view, d10);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, m.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l10 = aVar.l(size);
            if (collection.contains(u.r(l10))) {
                arrayList.add(l10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
        if (r10.f1833x != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0090, code lost:
        if (r10.L == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray<androidx.fragment.app.o.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z10) {
        int size = aVar.f1971a.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f1971a.get(i10), sparseArray, false, z10);
        }
    }

    private static m.a<String, String> d(int i10, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        m.a<String, String> aVar = new m.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i13);
            if (aVar2.p(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f1985o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f1985o;
                        arrayList4 = aVar2.f1986p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f1985o;
                        arrayList3 = aVar2.f1986p;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z10) {
        if (aVar.f1859s.E.d()) {
            for (int size = aVar.f1971a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f1971a.get(size), sparseArray, true, z10);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z10, m.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.t();
        } else {
            fragment.t();
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!qVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static m.a<String, View> h(q qVar, m.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f2028a;
        View L = fragment.L();
        if (aVar.isEmpty() || obj == null || L == null) {
            aVar.clear();
            return null;
        }
        m.a<String, View> aVar2 = new m.a<>();
        qVar.j(aVar2, L);
        androidx.fragment.app.a aVar3 = eVar.f2030c;
        if (eVar.f2029b) {
            fragment.v();
            arrayList = aVar3.f1985o;
        } else {
            fragment.t();
            arrayList = aVar3.f1986p;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static m.a<String, View> i(q qVar, m.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f2031d;
        m.a<String, View> aVar2 = new m.a<>();
        qVar.j(aVar2, fragment.c1());
        androidx.fragment.app.a aVar3 = eVar.f2033f;
        if (eVar.f2032e) {
            fragment.t();
            arrayList = aVar3.f1986p;
        } else {
            fragment.v();
            arrayList = aVar3.f1985o;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object u10 = fragment.u();
            if (u10 != null) {
                arrayList.add(u10);
            }
            Object G = fragment.G();
            if (G != null) {
                arrayList.add(G);
            }
            Object I = fragment.I();
            if (I != null) {
                arrayList.add(I);
            }
        }
        if (fragment2 != null) {
            Object s10 = fragment2.s();
            if (s10 != null) {
                arrayList.add(s10);
            }
            Object D = fragment2.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object H = fragment2.H();
            if (H != null) {
                arrayList.add(H);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f1998b;
        if (qVar == null || !g(qVar, arrayList)) {
            q qVar2 = f1999c;
            if (qVar2 == null || !g(qVar2, arrayList)) {
                if (qVar == null && qVar2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return qVar2;
        }
        return qVar;
    }

    static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View L = fragment.L();
            if (L != null) {
                qVar.f(arrayList2, L);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            qVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, m.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t10;
        m.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f2028a;
        Fragment fragment2 = eVar.f2031d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = eVar.f2029b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t10 = null;
        } else {
            t10 = t(qVar, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        m.a<String, View> i10 = i(qVar, aVar2, t10, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i10.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            rect = new Rect();
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, i10, eVar.f2032e, eVar.f2033f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        androidx.core.view.r.a(viewGroup, new d(qVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, m.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f2028a;
        Fragment fragment2 = eVar.f2031d;
        if (fragment != null) {
            fragment.c1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = eVar.f2029b;
        Object t10 = aVar.isEmpty() ? null : t(qVar, fragment, fragment2, z10);
        m.a<String, View> i10 = i(qVar, aVar, t10, eVar);
        m.a<String, View> h10 = h(qVar, aVar, t10, eVar);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i10, aVar.keySet());
            a(arrayList2, h10, aVar.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, i10, eVar.f2032e, eVar.f2033f);
            Rect rect2 = new Rect();
            View s10 = s(h10, eVar, obj, z10);
            if (s10 != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s10;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.r.a(viewGroup, new c(fragment, fragment2, z10, h10, view2, qVar, rect));
        return obj3;
    }

    private static void n(j jVar, int i10, e eVar, View view, m.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q j10;
        Object obj;
        ViewGroup viewGroup = jVar.E.d() ? (ViewGroup) jVar.E.c(i10) : null;
        if (viewGroup == null || (j10 = j((fragment2 = eVar.f2031d), (fragment = eVar.f2028a))) == null) {
            return;
        }
        boolean z10 = eVar.f2029b;
        boolean z11 = eVar.f2032e;
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l10 = l(j10, viewGroup, view, aVar, eVar, arrayList, arrayList2, q10, r10);
        if (q10 == null && l10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList, view);
        Object obj2 = (k10 == null || k10.isEmpty()) ? null : obj;
        j10.a(q10, view);
        Object u10 = u(j10, q10, obj2, l10, fragment, eVar.f2029b);
        if (u10 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j10.t(u10, q10, arrayList3, obj2, k10, l10, arrayList2);
            y(j10, viewGroup, fragment, view, arrayList2, q10, arrayList3, obj2, k10);
            j10.w(viewGroup, arrayList2, aVar);
            j10.c(viewGroup, u10);
            j10.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(j jVar, int i10, e eVar, View view, m.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q j10;
        Object obj;
        ViewGroup viewGroup = jVar.E.d() ? (ViewGroup) jVar.E.c(i10) : null;
        if (viewGroup == null || (j10 = j((fragment2 = eVar.f2031d), (fragment = eVar.f2028a))) == null) {
            return;
        }
        boolean z10 = eVar.f2029b;
        boolean z11 = eVar.f2032e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        Object m10 = m(j10, viewGroup, view, aVar, eVar, arrayList2, arrayList, q10, r10);
        if (q10 == null && m10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList2, view);
        ArrayList<View> k11 = k(j10, q10, fragment, arrayList, view);
        A(k11, 4);
        Object u10 = u(j10, q10, obj, m10, fragment, z10);
        if (u10 != null) {
            v(j10, obj, fragment2, k10);
            ArrayList<String> o10 = j10.o(arrayList);
            j10.t(u10, q10, k11, obj, k10, m10, arrayList);
            j10.c(viewGroup, u10);
            j10.x(viewGroup, arrayList2, arrayList, o10, aVar);
            A(k11, 0);
            j10.z(m10, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i10) {
        if (eVar == null) {
            e eVar2 = new e();
            sparseArray.put(i10, eVar2);
            return eVar2;
        }
        return eVar;
    }

    private static Object q(q qVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z10 ? fragment.D() : fragment.s());
    }

    private static Object r(q qVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z10 ? fragment.G() : fragment.u());
    }

    static View s(m.a<String, View> aVar, e eVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f2030c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1985o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z10 ? aVar2.f1985o : aVar2.f1986p).get(0));
    }

    private static Object t(q qVar, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z10 ? fragment2.I() : fragment.H()));
    }

    private static Object u(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        return (obj == null || obj2 == null || fragment == null) ? true : z10 ? fragment.n() : fragment.m() ? qVar.n(obj2, obj, obj3) : qVar.m(obj2, obj, obj3);
    }

    private static void v(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1833x && fragment.L && fragment.f1813a0) {
            fragment.i1(true);
            qVar.r(obj, fragment.L(), arrayList);
            androidx.core.view.r.a(fragment.S, new a(arrayList));
        }
    }

    private static q w() {
        try {
            return (q) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(m.a<String, String> aVar, m.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        androidx.core.view.r.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(q qVar, Object obj, Object obj2, m.a<String, View> aVar, boolean z10, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f1985o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z10 ? aVar2.f1986p : aVar2.f1985o).get(0));
        qVar.v(obj, view);
        if (obj2 != null) {
            qVar.v(obj2, view);
        }
    }
}
