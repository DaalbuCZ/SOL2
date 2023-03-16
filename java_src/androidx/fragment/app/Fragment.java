package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.e;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, x, androidx.savedstate.b {

    /* renamed from: k0  reason: collision with root package name */
    static final Object f1812k0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    int D;
    j E;
    h F;
    Fragment H;
    int I;
    int J;
    String K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    private boolean R;
    ViewGroup S;
    View T;
    View U;
    boolean V;
    d X;
    boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    boolean f1813a0;

    /* renamed from: b0  reason: collision with root package name */
    float f1814b0;

    /* renamed from: c0  reason: collision with root package name */
    LayoutInflater f1815c0;

    /* renamed from: d0  reason: collision with root package name */
    boolean f1816d0;

    /* renamed from: f0  reason: collision with root package name */
    androidx.lifecycle.j f1818f0;

    /* renamed from: g0  reason: collision with root package name */
    r f1819g0;

    /* renamed from: i0  reason: collision with root package name */
    androidx.savedstate.a f1821i0;

    /* renamed from: j0  reason: collision with root package name */
    private int f1822j0;

    /* renamed from: o  reason: collision with root package name */
    Bundle f1824o;

    /* renamed from: p  reason: collision with root package name */
    SparseArray<Parcelable> f1825p;

    /* renamed from: q  reason: collision with root package name */
    Boolean f1826q;

    /* renamed from: s  reason: collision with root package name */
    Bundle f1828s;

    /* renamed from: t  reason: collision with root package name */
    Fragment f1829t;

    /* renamed from: v  reason: collision with root package name */
    int f1831v;

    /* renamed from: x  reason: collision with root package name */
    boolean f1833x;

    /* renamed from: y  reason: collision with root package name */
    boolean f1834y;

    /* renamed from: z  reason: collision with root package name */
    boolean f1835z;

    /* renamed from: n  reason: collision with root package name */
    int f1823n = 0;

    /* renamed from: r  reason: collision with root package name */
    String f1827r = UUID.randomUUID().toString();

    /* renamed from: u  reason: collision with root package name */
    String f1830u = null;

    /* renamed from: w  reason: collision with root package name */
    private Boolean f1832w = null;
    j G = new j();
    boolean Q = true;
    boolean W = true;
    Runnable Y = new a();

    /* renamed from: e0  reason: collision with root package name */
    e.c f1817e0 = e.c.RESUMED;

    /* renamed from: h0  reason: collision with root package name */
    androidx.lifecycle.o<androidx.lifecycle.i> f1820h0 = new androidx.lifecycle.o<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.o1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.e();
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.fragment.app.e {
        c() {
        }

        @Override // androidx.fragment.app.e
        public View c(int i10) {
            View view = Fragment.this.T;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.T != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f1840a;

        /* renamed from: b  reason: collision with root package name */
        Animator f1841b;

        /* renamed from: c  reason: collision with root package name */
        int f1842c;

        /* renamed from: d  reason: collision with root package name */
        int f1843d;

        /* renamed from: e  reason: collision with root package name */
        int f1844e;

        /* renamed from: f  reason: collision with root package name */
        int f1845f;

        /* renamed from: g  reason: collision with root package name */
        Object f1846g = null;

        /* renamed from: h  reason: collision with root package name */
        Object f1847h;

        /* renamed from: i  reason: collision with root package name */
        Object f1848i;

        /* renamed from: j  reason: collision with root package name */
        Object f1849j;

        /* renamed from: k  reason: collision with root package name */
        Object f1850k;

        /* renamed from: l  reason: collision with root package name */
        Object f1851l;

        /* renamed from: m  reason: collision with root package name */
        Boolean f1852m;

        /* renamed from: n  reason: collision with root package name */
        Boolean f1853n;

        /* renamed from: o  reason: collision with root package name */
        androidx.core.app.q f1854o;

        /* renamed from: p  reason: collision with root package name */
        androidx.core.app.q f1855p;

        /* renamed from: q  reason: collision with root package name */
        boolean f1856q;

        /* renamed from: r  reason: collision with root package name */
        f f1857r;

        /* renamed from: s  reason: collision with root package name */
        boolean f1858s;

        d() {
            Object obj = Fragment.f1812k0;
            this.f1847h = obj;
            this.f1848i = null;
            this.f1849j = obj;
            this.f1850k = null;
            this.f1851l = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    public Fragment() {
        M();
    }

    private void M() {
        this.f1818f0 = new androidx.lifecycle.j(this);
        this.f1821i0 = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1818f0.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.g
                public void d(androidx.lifecycle.i iVar, e.b bVar) {
                    View view;
                    if (bVar != e.b.ON_STOP || (view = Fragment.this.T) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment O(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.h1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private d h() {
        if (this.X == null) {
            this.X = new d();
        }
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int A() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1844e;
    }

    public void A0(View view, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int B() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1845f;
    }

    public void B0(Bundle bundle) {
        this.R = true;
    }

    public final Fragment C() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0(Bundle bundle) {
        this.G.T0();
        this.f1823n = 2;
        this.R = false;
        V(bundle);
        if (this.R) {
            this.G.z();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object D() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1849j;
        return obj == f1812k0 ? u() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0() {
        this.G.q(this.F, new c(), this);
        this.R = false;
        Y(this.F.f());
        if (this.R) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final Resources E() {
        return a1().getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.G.A(configuration);
    }

    public final boolean F() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F0(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        return a0(menuItem) || this.G.B(menuItem);
    }

    public Object G() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1847h;
        return obj == f1812k0 ? s() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G0(Bundle bundle) {
        this.G.T0();
        this.f1823n = 1;
        this.R = false;
        this.f1821i0.c(bundle);
        b0(bundle);
        this.f1816d0 = true;
        if (this.R) {
            this.f1818f0.h(e.b.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object H() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f1850k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H0(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            z10 = true;
            e0(menu, menuInflater);
        }
        return z10 | this.G.D(menu, menuInflater);
    }

    public Object I() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1851l;
        return obj == f1812k0 ? H() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.G.T0();
        this.C = true;
        this.f1819g0 = new r();
        View f02 = f0(layoutInflater, viewGroup, bundle);
        this.T = f02;
        if (f02 != null) {
            this.f1819g0.c();
            this.f1820h0.h(this.f1819g0);
        } else if (this.f1819g0.d()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.f1819g0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int J() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1842c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0() {
        this.G.E();
        this.f1818f0.h(e.b.ON_DESTROY);
        this.f1823n = 0;
        this.R = false;
        this.f1816d0 = false;
        g0();
        if (this.R) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final Fragment K() {
        String str;
        Fragment fragment = this.f1829t;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.E;
        if (jVar == null || (str = this.f1830u) == null) {
            return null;
        }
        return jVar.f1907t.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0() {
        this.G.F();
        if (this.T != null) {
            this.f1819g0.b(e.b.ON_DESTROY);
        }
        this.f1823n = 1;
        this.R = false;
        i0();
        if (this.R) {
            androidx.loader.app.a.b(this).c();
            this.C = false;
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public View L() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L0() {
        this.R = false;
        j0();
        this.f1815c0 = null;
        if (this.R) {
            if (this.G.E0()) {
                return;
            }
            this.G.E();
            this.G = new j();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater M0(Bundle bundle) {
        LayoutInflater k02 = k0(bundle);
        this.f1815c0 = k02;
        return k02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N() {
        M();
        this.f1827r = UUID.randomUUID().toString();
        this.f1833x = false;
        this.f1834y = false;
        this.f1835z = false;
        this.A = false;
        this.B = false;
        this.D = 0;
        this.E = null;
        this.G = new j();
        this.F = null;
        this.I = 0;
        this.J = 0;
        this.K = null;
        this.L = false;
        this.M = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0() {
        onLowMemory();
        this.G.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(boolean z10) {
        o0(z10);
        this.G.H(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P() {
        d dVar = this.X;
        if (dVar == null) {
            return false;
        }
        return dVar.f1858s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P0(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        return (this.P && this.Q && p0(menuItem)) || this.G.W(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Q() {
        return this.D > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(Menu menu) {
        if (this.L) {
            return;
        }
        if (this.P && this.Q) {
            q0(menu);
        }
        this.G.X(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R() {
        d dVar = this.X;
        if (dVar == null) {
            return false;
        }
        return dVar.f1856q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0() {
        this.G.Z();
        if (this.T != null) {
            this.f1819g0.b(e.b.ON_PAUSE);
        }
        this.f1818f0.h(e.b.ON_PAUSE);
        this.f1823n = 3;
        this.R = false;
        r0();
        if (this.R) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean S() {
        return this.f1834y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0(boolean z10) {
        s0(z10);
        this.G.a0(z10);
    }

    public final boolean T() {
        j jVar = this.E;
        if (jVar == null) {
            return false;
        }
        return jVar.I0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean T0(Menu menu) {
        boolean z10 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            z10 = true;
            t0(menu);
        }
        return z10 | this.G.b0(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        this.G.T0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0() {
        boolean G0 = this.E.G0(this);
        Boolean bool = this.f1832w;
        if (bool == null || bool.booleanValue() != G0) {
            this.f1832w = Boolean.valueOf(G0);
            u0(G0);
            this.G.c0();
        }
    }

    public void V(Bundle bundle) {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0() {
        this.G.T0();
        this.G.m0();
        this.f1823n = 4;
        this.R = false;
        w0();
        if (!this.R) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.j jVar = this.f1818f0;
        e.b bVar = e.b.ON_RESUME;
        jVar.h(bVar);
        if (this.T != null) {
            this.f1819g0.b(bVar);
        }
        this.G.d0();
        this.G.m0();
    }

    public void W(int i10, int i11, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0(Bundle bundle) {
        x0(bundle);
        this.f1821i0.d(bundle);
        Parcelable f12 = this.G.f1();
        if (f12 != null) {
            bundle.putParcelable("android:support:fragments", f12);
        }
    }

    @Deprecated
    public void X(Activity activity) {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0() {
        this.G.T0();
        this.G.m0();
        this.f1823n = 3;
        this.R = false;
        y0();
        if (!this.R) {
            throw new s("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.j jVar = this.f1818f0;
        e.b bVar = e.b.ON_START;
        jVar.h(bVar);
        if (this.T != null) {
            this.f1819g0.b(bVar);
        }
        this.G.e0();
    }

    public void Y(Context context) {
        this.R = true;
        h hVar = this.F;
        Activity e10 = hVar == null ? null : hVar.e();
        if (e10 != null) {
            this.R = false;
            X(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y0() {
        this.G.g0();
        if (this.T != null) {
            this.f1819g0.b(e.b.ON_STOP);
        }
        this.f1818f0.h(e.b.ON_STOP);
        this.f1823n = 2;
        this.R = false;
        z0();
        if (this.R) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    public void Z(Fragment fragment) {
    }

    public final androidx.fragment.app.d Z0() {
        androidx.fragment.app.d l10 = l();
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.f1818f0;
    }

    public boolean a0(MenuItem menuItem) {
        return false;
    }

    public final Context a1() {
        Context r10 = r();
        if (r10 != null) {
            return r10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void b0(Bundle bundle) {
        this.R = true;
        d1(bundle);
        if (this.G.H0(1)) {
            return;
        }
        this.G.C();
    }

    public final i b1() {
        i w10 = w();
        if (w10 != null) {
            return w10;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Animation c0(int i10, boolean z10, int i11) {
        return null;
    }

    public final View c1() {
        View L = L();
        if (L != null) {
            return L;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator d0(int i10, boolean z10, int i11) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.G.d1(parcelable);
        this.G.C();
    }

    void e() {
        d dVar = this.X;
        f fVar = null;
        if (dVar != null) {
            dVar.f1856q = false;
            f fVar2 = dVar.f1857r;
            dVar.f1857r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public void e0(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1825p;
        if (sparseArray != null) {
            this.U.restoreHierarchyState(sparseArray);
            this.f1825p = null;
        }
        this.R = false;
        B0(bundle);
        if (this.R) {
            if (this.T != null) {
                this.f1819g0.b(e.b.ON_CREATE);
                return;
            }
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.I));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mTag=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1823n);
        printWriter.print(" mWho=");
        printWriter.print(this.f1827r);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1833x);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1834y);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1835z);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.L);
        printWriter.print(" mDetached=");
        printWriter.print(this.M);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.Q);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.W);
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.F);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.H);
        }
        if (this.f1828s != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1828s);
        }
        if (this.f1824o != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1824o);
        }
        if (this.f1825p != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1825p);
        }
        Fragment K = K();
        if (K != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(K);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1831v);
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(z());
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.T);
        }
        if (this.U != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.T);
        }
        if (o() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(o());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(J());
        }
        if (r() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.G + ":");
        j jVar = this.G;
        jVar.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f1822j0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1(View view) {
        h().f1840a = view;
    }

    @Override // androidx.lifecycle.x
    public w g() {
        j jVar = this.E;
        if (jVar != null) {
            return jVar.B0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void g0() {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g1(Animator animator) {
        h().f1841b = animator;
    }

    public void h0() {
    }

    public void h1(Bundle bundle) {
        if (this.E != null && T()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1828s = bundle;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i0() {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1(boolean z10) {
        h().f1858s = z10;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry j() {
        return this.f1821i0.b();
    }

    public void j0() {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j1(int i10) {
        if (this.X == null && i10 == 0) {
            return;
        }
        h().f1843d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k(String str) {
        return str.equals(this.f1827r) ? this : this.G.r0(str);
    }

    public LayoutInflater k0(Bundle bundle) {
        return y(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k1(int i10, int i11) {
        if (this.X == null && i10 == 0 && i11 == 0) {
            return;
        }
        h();
        d dVar = this.X;
        dVar.f1844e = i10;
        dVar.f1845f = i11;
    }

    public final androidx.fragment.app.d l() {
        h hVar = this.F;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.e();
    }

    public void l0(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1(f fVar) {
        h();
        d dVar = this.X;
        f fVar2 = dVar.f1857r;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f1856q) {
            dVar.f1857r = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public boolean m() {
        Boolean bool;
        d dVar = this.X;
        if (dVar == null || (bool = dVar.f1853n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void m0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m1(int i10) {
        h().f1842c = i10;
    }

    public boolean n() {
        Boolean bool;
        d dVar = this.X;
        if (dVar == null || (bool = dVar.f1852m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
        h hVar = this.F;
        Activity e10 = hVar == null ? null : hVar.e();
        if (e10 != null) {
            this.R = false;
            m0(e10, attributeSet, bundle);
        }
    }

    public void n1(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        h hVar = this.F;
        if (hVar != null) {
            hVar.r(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View o() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f1840a;
    }

    public void o0(boolean z10) {
    }

    public void o1() {
        j jVar = this.E;
        if (jVar == null || jVar.D == null) {
            h().f1856q = false;
        } else if (Looper.myLooper() != this.E.D.h().getLooper()) {
            this.E.D.h().postAtFrontOfQueue(new b());
        } else {
            e();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.R = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Z0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator p() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f1841b;
    }

    public boolean p0(MenuItem menuItem) {
        return false;
    }

    public final i q() {
        if (this.F != null) {
            return this.G;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void q0(Menu menu) {
    }

    public Context r() {
        h hVar = this.F;
        if (hVar == null) {
            return null;
        }
        return hVar.f();
    }

    public void r0() {
        this.R = true;
    }

    public Object s() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f1846g;
    }

    public void s0(boolean z10) {
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        n1(intent, i10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.q t() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f1854o;
    }

    public void t0(Menu menu) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        androidx.core.util.b.a(this, sb);
        sb.append(" (");
        sb.append(this.f1827r);
        sb.append(")");
        if (this.I != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.I));
        }
        if (this.K != null) {
            sb.append(" ");
            sb.append(this.K);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f1848i;
    }

    public void u0(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.q v() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f1855p;
    }

    public void v0(int i10, String[] strArr, int[] iArr) {
    }

    public final i w() {
        return this.E;
    }

    public void w0() {
        this.R = true;
    }

    public final Object x() {
        h hVar = this.F;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    public void x0(Bundle bundle) {
    }

    @Deprecated
    public LayoutInflater y(Bundle bundle) {
        h hVar = this.F;
        if (hVar != null) {
            LayoutInflater n10 = hVar.n();
            androidx.core.view.f.b(n10, this.G.z0());
            return n10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void y0() {
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1843d;
    }

    public void z0() {
        this.R = true;
    }
}
