package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.u;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.q;
import io.flutter.view.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k8.k;
/* loaded from: classes.dex */
public class q implements k {

    /* renamed from: w  reason: collision with root package name */
    private static Class[] f8798w = {SurfaceView.class};

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.android.a f8800b;

    /* renamed from: c  reason: collision with root package name */
    private Context f8801c;

    /* renamed from: d  reason: collision with root package name */
    private io.flutter.embedding.android.k f8802d;

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.view.d f8803e;

    /* renamed from: f  reason: collision with root package name */
    private io.flutter.plugin.editing.f f8804f;

    /* renamed from: g  reason: collision with root package name */
    private k8.k f8805g;

    /* renamed from: o  reason: collision with root package name */
    private int f8813o = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8814p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f8815q = true;

    /* renamed from: u  reason: collision with root package name */
    private boolean f8819u = false;

    /* renamed from: v  reason: collision with root package name */
    private final k.g f8820v = new a();

    /* renamed from: a  reason: collision with root package name */
    private final i f8799a = new i();

    /* renamed from: i  reason: collision with root package name */
    final HashMap<Integer, r> f8807i = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final io.flutter.plugin.platform.a f8806h = new io.flutter.plugin.platform.a();

    /* renamed from: j  reason: collision with root package name */
    final HashMap<Context, View> f8808j = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<b> f8811m = new SparseArray<>();

    /* renamed from: r  reason: collision with root package name */
    private final HashSet<Integer> f8816r = new HashSet<>();

    /* renamed from: s  reason: collision with root package name */
    private final HashSet<Integer> f8817s = new HashSet<>();

    /* renamed from: n  reason: collision with root package name */
    private final SparseArray<j> f8812n = new SparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    private final SparseArray<f> f8809k = new SparseArray<>();

    /* renamed from: l  reason: collision with root package name */
    private final SparseArray<b8.a> f8810l = new SparseArray<>();

    /* renamed from: t  reason: collision with root package name */
    private final u f8818t = u.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.g {
        a() {
        }

        private void m(f fVar, k.d dVar) {
            x7.b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f10775a);
        }

        @TargetApi(c.j.f3071t3)
        private long n(f fVar, final k.d dVar) {
            j jVar;
            long j10;
            q(23);
            x7.b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f10775a);
            int l02 = q.this.l0(dVar.f10777c);
            int l03 = q.this.l0(dVar.f10778d);
            if (q.this.f8819u) {
                jVar = new j(q.this.f8801c);
                j10 = -1;
            } else {
                d.c a10 = q.this.f8803e.a();
                j jVar2 = new j(q.this.f8801c, a10);
                long e10 = a10.e();
                jVar = jVar2;
                j10 = e10;
            }
            jVar.m(q.this.f8800b);
            jVar.i(l02, l03);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l02, l03);
            int l04 = q.this.l0(dVar.f10779e);
            int l05 = q.this.l0(dVar.f10780f);
            layoutParams.topMargin = l04;
            layoutParams.leftMargin = l05;
            jVar.j(layoutParams);
            View view = fVar.getView();
            view.setLayoutParams(new FrameLayout.LayoutParams(l02, l03));
            view.setImportantForAccessibility(4);
            jVar.addView(view);
            jVar.k(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.n
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z10) {
                    q.a.this.s(dVar, view2, z10);
                }
            });
            q.this.f8802d.addView(jVar);
            q.this.f8812n.append(dVar.f10775a, jVar);
            return j10;
        }

        private long o(f fVar, final k.d dVar) {
            q(20);
            x7.b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f10775a);
            d.c a10 = q.this.f8803e.a();
            r a11 = r.a(q.this.f8801c, q.this.f8806h, fVar, a10, q.this.l0(dVar.f10777c), q.this.l0(dVar.f10778d), dVar.f10775a, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.o
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    q.a.this.t(dVar, view, z10);
                }
            });
            if (a11 != null) {
                if (q.this.f8802d != null) {
                    a11.f(q.this.f8802d);
                }
                q.this.f8807i.put(Integer.valueOf(dVar.f10775a), a11);
                View view = fVar.getView();
                q.this.f8808j.put(view.getContext(), view);
                return a10.e();
            }
            throw new IllegalStateException("Failed creating virtual display for a " + dVar.f10776b + " with id: " + dVar.f10775a);
        }

        @TargetApi(19)
        private f p(k.d dVar, boolean z10) {
            g b10 = q.this.f8799a.b(dVar.f10776b);
            if (b10 == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f10776b);
            }
            f a10 = b10.a(z10 ? new MutableContextWrapper(q.this.f8801c) : q.this.f8801c, dVar.f10775a, dVar.f10783i != null ? b10.b().b(dVar.f10783i) : null);
            View view = a10.getView();
            if (view != null) {
                view.setLayoutDirection(dVar.f10781g);
                q.this.f8809k.put(dVar.f10775a, a10);
                return a10;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }

        private void q(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= i10) {
                return;
            }
            throw new IllegalStateException("Trying to use platform views with API " + i11 + ", required API level is: " + i10);
        }

        private void r(k.d dVar) {
            if (q.n0(dVar.f10781g)) {
                return;
            }
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f10781g + "(view id: " + dVar.f10775a + ")");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(k.d dVar, View view, boolean z10) {
            q qVar = q.this;
            if (z10) {
                qVar.f8805g.d(dVar.f10775a);
            } else if (qVar.f8804f != null) {
                q.this.f8804f.l(dVar.f10775a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(k.d dVar, View view, boolean z10) {
            if (z10) {
                q.this.f8805g.d(dVar.f10775a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(r rVar, float f10, k.b bVar) {
            q.this.m0(rVar);
            if (q.this.f8801c != null) {
                f10 = q.this.O();
            }
            bVar.a(new k.c(q.this.j0(rVar.d(), f10), q.this.j0(rVar.c(), f10)));
        }

        @Override // k8.k.g
        public void a(boolean z10) {
            q.this.f8815q = z10;
        }

        @Override // k8.k.g
        public void b(int i10, double d10, double d11) {
            if (q.this.b(i10)) {
                return;
            }
            j jVar = (j) q.this.f8812n.get(i10);
            if (jVar == null) {
                x7.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i10);
                return;
            }
            int l02 = q.this.l0(d10);
            int l03 = q.this.l0(d11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.topMargin = l02;
            layoutParams.leftMargin = l03;
            jVar.j(layoutParams);
        }

        @Override // k8.k.g
        @TargetApi(17)
        public void c(int i10, int i11) {
            View view;
            StringBuilder sb;
            String str;
            if (!q.n0(i11)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i11 + "(view id: " + i10 + ")");
            }
            if (q.this.b(i10)) {
                view = q.this.f8807i.get(Integer.valueOf(i10)).e();
            } else {
                f fVar = (f) q.this.f8809k.get(i10);
                if (fVar == null) {
                    sb = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb.append(str);
                    sb.append(i10);
                    x7.b.b("PlatformViewsController", sb.toString());
                }
                view = fVar.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i11);
                return;
            }
            sb = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb.append(str);
            sb.append(i10);
            x7.b.b("PlatformViewsController", sb.toString());
        }

        @Override // k8.k.g
        @TargetApi(19)
        public void d(k.d dVar) {
            q(19);
            r(dVar);
            m(p(dVar, false), dVar);
        }

        @Override // k8.k.g
        public void e(int i10) {
            View view;
            StringBuilder sb;
            String str;
            if (q.this.b(i10)) {
                view = q.this.f8807i.get(Integer.valueOf(i10)).e();
            } else {
                f fVar = (f) q.this.f8809k.get(i10);
                if (fVar == null) {
                    sb = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb.append(str);
                    sb.append(i10);
                    x7.b.b("PlatformViewsController", sb.toString());
                }
                view = fVar.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            sb = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb.append(str);
            sb.append(i10);
            x7.b.b("PlatformViewsController", sb.toString());
        }

        @Override // k8.k.g
        @TargetApi(20)
        public long f(k.d dVar) {
            r(dVar);
            int i10 = dVar.f10775a;
            if (q.this.f8812n.get(i10) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i10);
            } else if (q.this.f8803e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i10);
            } else if (q.this.f8802d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i10);
            } else {
                boolean z10 = true;
                f p10 = p(dVar, true);
                View view = p10.getView();
                if (view.getParent() == null) {
                    if (!((Build.VERSION.SDK_INT < 23 || w8.h.f(view, q.f8798w)) ? false : false)) {
                        if (dVar.f10782h == k.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                            m(p10, dVar);
                            return -2L;
                        } else if (!q.this.f8819u) {
                            return o(p10, dVar);
                        }
                    }
                    return n(p10, dVar);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }

        @Override // k8.k.g
        public void g(int i10) {
            f fVar = (f) q.this.f8809k.get(i10);
            if (fVar == null) {
                x7.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i10);
                return;
            }
            q.this.f8809k.remove(i10);
            try {
                fVar.e();
            } catch (RuntimeException e10) {
                x7.b.c("PlatformViewsController", "Disposing platform view threw an exception", e10);
            }
            if (q.this.b(i10)) {
                View e11 = q.this.f8807i.get(Integer.valueOf(i10)).e();
                if (e11 != null) {
                    q.this.f8808j.remove(e11.getContext());
                }
                q.this.f8807i.remove(Integer.valueOf(i10));
                return;
            }
            j jVar = (j) q.this.f8812n.get(i10);
            if (jVar != null) {
                jVar.removeAllViews();
                jVar.h();
                jVar.o();
                ViewGroup viewGroup = (ViewGroup) jVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                }
                q.this.f8812n.remove(i10);
                return;
            }
            b8.a aVar = (b8.a) q.this.f8810l.get(i10);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                q.this.f8810l.remove(i10);
            }
        }

        @Override // k8.k.g
        public void h(k.e eVar, final k.b bVar) {
            int l02 = q.this.l0(eVar.f10789b);
            int l03 = q.this.l0(eVar.f10790c);
            int i10 = eVar.f10788a;
            if (q.this.b(i10)) {
                final float O = q.this.O();
                final r rVar = q.this.f8807i.get(Integer.valueOf(i10));
                q.this.U(rVar);
                rVar.i(l02, l03, new Runnable() { // from class: io.flutter.plugin.platform.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.a.this.u(rVar, O, bVar);
                    }
                });
                return;
            }
            f fVar = (f) q.this.f8809k.get(i10);
            j jVar = (j) q.this.f8812n.get(i10);
            if (fVar == null || jVar == null) {
                x7.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i10);
                return;
            }
            if (l02 > jVar.e() || l03 > jVar.d()) {
                jVar.i(l02, l03);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = l02;
            layoutParams.height = l03;
            jVar.setLayoutParams(layoutParams);
            View view = fVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = l02;
                layoutParams2.height = l03;
                view.setLayoutParams(layoutParams2);
            }
            bVar.a(new k.c(q.this.i0(jVar.e()), q.this.i0(jVar.d())));
        }

        @Override // k8.k.g
        public void i(k.f fVar) {
            int i10 = fVar.f10791a;
            float f10 = q.this.f8801c.getResources().getDisplayMetrics().density;
            if (q.this.b(i10)) {
                q.this.f8807i.get(Integer.valueOf(i10)).b(q.this.k0(f10, fVar, true));
                return;
            }
            f fVar2 = (f) q.this.f8809k.get(i10);
            if (fVar2 == null) {
                x7.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View view = fVar2.getView();
            if (view != null) {
                view.dispatchTouchEvent(q.this.k0(f10, fVar, false));
                return;
            }
            x7.b.b("PlatformViewsController", "Sending touch to a null view with id: " + i10);
        }
    }

    private void M() {
        while (this.f8809k.size() > 0) {
            this.f8820v.g(this.f8809k.keyAt(0));
        }
    }

    private void N(boolean z10) {
        for (int i10 = 0; i10 < this.f8811m.size(); i10++) {
            int keyAt = this.f8811m.keyAt(i10);
            b valueAt = this.f8811m.valueAt(i10);
            if (this.f8816r.contains(Integer.valueOf(keyAt))) {
                this.f8802d.m(valueAt);
                z10 &= valueAt.a();
            } else {
                if (!this.f8814p) {
                    valueAt.g();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i11 = 0; i11 < this.f8810l.size(); i11++) {
            int keyAt2 = this.f8810l.keyAt(i11);
            b8.a aVar = this.f8810l.get(keyAt2);
            if (!this.f8817s.contains(Integer.valueOf(keyAt2)) || (!z10 && this.f8815q)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float O() {
        return this.f8801c.getResources().getDisplayMetrics().density;
    }

    private void R() {
        if (!this.f8815q || this.f8814p) {
            return;
        }
        this.f8802d.p();
        this.f8814p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(int i10, View view, boolean z10) {
        if (z10) {
            this.f8805g.d(i10);
            return;
        }
        io.flutter.plugin.editing.f fVar = this.f8804f;
        if (fVar != null) {
            fVar.l(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        N(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(r rVar) {
        io.flutter.plugin.editing.f fVar = this.f8804f;
        if (fVar == null) {
            return;
        }
        fVar.u();
        rVar.g();
    }

    private static MotionEvent.PointerCoords c0(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f10;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f10;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f10;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f10;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f10;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f10;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> d0(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(c0(obj2, f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties e0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> f0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(e0(obj2));
        }
        return arrayList;
    }

    private void g0() {
        if (this.f8802d == null) {
            x7.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i10 = 0; i10 < this.f8811m.size(); i10++) {
            this.f8802d.removeView(this.f8811m.valueAt(i10));
        }
        this.f8811m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0(double d10) {
        return j0(d10, O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j0(double d10, float f10) {
        return (int) Math.round(d10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l0(double d10) {
        return (int) Math.round(d10 * O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(r rVar) {
        io.flutter.plugin.editing.f fVar = this.f8804f;
        if (fVar == null) {
            return;
        }
        fVar.G();
        rVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n0(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public void B(Context context, io.flutter.view.d dVar, y7.a aVar) {
        if (this.f8801c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f8801c = context;
        this.f8803e = dVar;
        k8.k kVar = new k8.k(aVar);
        this.f8805g = kVar;
        kVar.e(this.f8820v);
    }

    public void C(io.flutter.plugin.editing.f fVar) {
        this.f8804f = fVar;
    }

    public void D(j8.a aVar) {
        this.f8800b = new io.flutter.embedding.android.a(aVar, true);
    }

    public void E(io.flutter.embedding.android.k kVar) {
        this.f8802d = kVar;
        for (int i10 = 0; i10 < this.f8812n.size(); i10++) {
            this.f8802d.addView(this.f8812n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f8810l.size(); i11++) {
            this.f8802d.addView(this.f8810l.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.f8809k.size(); i12++) {
            this.f8809k.valueAt(i12).g(this.f8802d);
        }
    }

    public boolean F(View view) {
        if (view != null && this.f8808j.containsKey(view.getContext())) {
            View view2 = this.f8808j.get(view.getContext());
            if (view2 == view) {
                return true;
            }
            return view2.checkInputConnectionProxy(view);
        }
        return false;
    }

    @TargetApi(19)
    public FlutterOverlaySurface G() {
        return H(new b(this.f8802d.getContext(), this.f8802d.getWidth(), this.f8802d.getHeight(), this.f8806h));
    }

    @TargetApi(19)
    public FlutterOverlaySurface H(b bVar) {
        int i10 = this.f8813o;
        this.f8813o = i10 + 1;
        this.f8811m.put(i10, bVar);
        return new FlutterOverlaySurface(i10, bVar.getSurface());
    }

    public void I() {
        for (int i10 = 0; i10 < this.f8811m.size(); i10++) {
            b valueAt = this.f8811m.valueAt(i10);
            valueAt.g();
            valueAt.c();
        }
    }

    public void J() {
        k8.k kVar = this.f8805g;
        if (kVar != null) {
            kVar.e(null);
        }
        I();
        this.f8805g = null;
        this.f8801c = null;
        this.f8803e = null;
    }

    public void K() {
        for (int i10 = 0; i10 < this.f8812n.size(); i10++) {
            this.f8802d.removeView(this.f8812n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f8810l.size(); i11++) {
            this.f8802d.removeView(this.f8810l.valueAt(i11));
        }
        I();
        g0();
        this.f8802d = null;
        this.f8814p = false;
        for (int i12 = 0; i12 < this.f8809k.size(); i12++) {
            this.f8809k.valueAt(i12).h();
        }
    }

    public void L() {
        this.f8804f = null;
    }

    public h P() {
        return this.f8799a;
    }

    @TargetApi(19)
    void Q(final int i10) {
        f fVar = this.f8809k.get(i10);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f8810l.get(i10) != null) {
            return;
        }
        View view = fVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f8801c;
        b8.a aVar = new b8.a(context, context.getResources().getDisplayMetrics().density, this.f8800b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                q.this.S(i10, view2, z10);
            }
        });
        this.f8810l.put(i10, aVar);
        view.setImportantForAccessibility(4);
        aVar.addView(view);
        this.f8802d.addView(aVar);
    }

    public void V() {
    }

    public void W() {
        this.f8816r.clear();
        this.f8817s.clear();
    }

    public void X() {
        M();
    }

    public void Y(int i10, int i11, int i12, int i13, int i14) {
        if (this.f8811m.get(i10) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i10 + ") doesn't exist");
        }
        R();
        b bVar = this.f8811m.get(i10);
        if (bVar.getParent() == null) {
            this.f8802d.addView(bVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = i12;
        bVar.setLayoutParams(layoutParams);
        bVar.setVisibility(0);
        bVar.bringToFront();
        this.f8816r.add(Integer.valueOf(i10));
    }

    public void Z(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        R();
        Q(i10);
        b8.a aVar = this.f8810l.get(i10);
        aVar.a(flutterMutatorsStack, i11, i12, i13, i14);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
        View view = this.f8809k.get(i10).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.f8817s.add(Integer.valueOf(i10));
    }

    @Override // io.flutter.plugin.platform.k
    public void a(io.flutter.view.c cVar) {
        this.f8806h.c(cVar);
    }

    public void a0() {
        boolean z10 = false;
        if (this.f8814p && this.f8817s.isEmpty()) {
            this.f8814p = false;
            this.f8802d.B(new Runnable() { // from class: io.flutter.plugin.platform.m
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.T();
                }
            });
            return;
        }
        if (this.f8814p && this.f8802d.j()) {
            z10 = true;
        }
        N(z10);
    }

    @Override // io.flutter.plugin.platform.k
    public boolean b(int i10) {
        return this.f8807i.containsKey(Integer.valueOf(i10));
    }

    public void b0() {
        M();
    }

    @Override // io.flutter.plugin.platform.k
    public View c(int i10) {
        if (b(i10)) {
            return this.f8807i.get(Integer.valueOf(i10)).e();
        }
        f fVar = this.f8809k.get(i10);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    @Override // io.flutter.plugin.platform.k
    public void d() {
        this.f8806h.c(null);
    }

    public void h0(boolean z10) {
        this.f8819u = z10;
    }

    public MotionEvent k0(float f10, k.f fVar, boolean z10) {
        MotionEvent b10 = this.f8818t.b(u.a.c(fVar.f10806p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) f0(fVar.f10796f).toArray(new MotionEvent.PointerProperties[fVar.f10795e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) d0(fVar.f10797g, f10).toArray(new MotionEvent.PointerCoords[fVar.f10795e]);
        return (z10 || b10 == null) ? MotionEvent.obtain(fVar.f10792b.longValue(), fVar.f10793c.longValue(), fVar.f10794d, fVar.f10795e, pointerPropertiesArr, pointerCoordsArr, fVar.f10798h, fVar.f10799i, fVar.f10800j, fVar.f10801k, fVar.f10802l, fVar.f10803m, fVar.f10804n, fVar.f10805o) : MotionEvent.obtain(b10.getDownTime(), b10.getEventTime(), fVar.f10794d, fVar.f10795e, pointerPropertiesArr, pointerCoordsArr, b10.getMetaState(), b10.getButtonState(), b10.getXPrecision(), b10.getYPrecision(), b10.getDeviceId(), b10.getEdgeFlags(), b10.getSource(), b10.getFlags());
    }
}
