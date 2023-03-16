package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u;
import androidx.core.view.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class q {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f2048n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ArrayList f2049o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ArrayList f2050p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ArrayList f2051q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ ArrayList f2052r;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2048n = i10;
            this.f2049o = arrayList;
            this.f2050p = arrayList2;
            this.f2051q = arrayList3;
            this.f2052r = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f2048n; i10++) {
                u.P((View) this.f2049o.get(i10), (String) this.f2050p.get(i10));
                u.P((View) this.f2051q.get(i10), (String) this.f2052r.get(i10));
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ArrayList f2054n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Map f2055o;

        b(ArrayList arrayList, Map map) {
            this.f2054n = arrayList;
            this.f2055o = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2054n.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2054n.get(i10);
                String r10 = u.r(view);
                if (r10 != null) {
                    u.P(view, q.i(this.f2055o, r10));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ArrayList f2057n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Map f2058o;

        c(ArrayList arrayList, Map map) {
            this.f2057n = arrayList;
            this.f2058o = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2057n.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2057n.get(i10);
                u.P(view, (String) this.f2058o.get(u.r(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z10 = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z10) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a10 = x.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a10) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        f(arrayList, viewGroup2.getChildAt(i10));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public abstract Object g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String r10 = u.r(view);
            if (r10 != null) {
                map.put(r10, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(u.r(view));
            u.P(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.r.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.r.a(view, new b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String r10 = u.r(view2);
            arrayList4.add(r10);
            if (r10 != null) {
                u.P(view2, null);
                String str = map.get(r10);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        u.P(arrayList2.get(i11), r10);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        androidx.core.view.r.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
