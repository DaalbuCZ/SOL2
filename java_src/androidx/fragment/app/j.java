package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.e;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {
    static boolean U = false;
    static final Interpolator V = new DecelerateInterpolator(2.5f);
    static final Interpolator W = new DecelerateInterpolator(1.5f);
    ArrayList<i.b> A;
    androidx.fragment.app.h D;
    androidx.fragment.app.e E;
    Fragment F;
    Fragment G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    ArrayList<androidx.fragment.app.a> M;
    ArrayList<Boolean> N;
    ArrayList<Fragment> O;
    ArrayList<m> R;
    private androidx.fragment.app.l S;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<k> f1903p;

    /* renamed from: q  reason: collision with root package name */
    boolean f1904q;

    /* renamed from: u  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1908u;

    /* renamed from: v  reason: collision with root package name */
    ArrayList<Fragment> f1909v;

    /* renamed from: w  reason: collision with root package name */
    private OnBackPressedDispatcher f1910w;

    /* renamed from: y  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1912y;

    /* renamed from: z  reason: collision with root package name */
    ArrayList<Integer> f1913z;

    /* renamed from: r  reason: collision with root package name */
    int f1905r = 0;

    /* renamed from: s  reason: collision with root package name */
    final ArrayList<Fragment> f1906s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    final HashMap<String, Fragment> f1907t = new HashMap<>();

    /* renamed from: x  reason: collision with root package name */
    private final androidx.activity.b f1911x = new a(false);
    private final CopyOnWriteArrayList<i> B = new CopyOnWriteArrayList<>();
    int C = 0;
    Bundle P = null;
    SparseArray<Parcelable> Q = null;
    Runnable T = new b();

    /* loaded from: classes.dex */
    class a extends androidx.activity.b {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.b
        public void b() {
            j.this.C0();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1917b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f1917b.o() != null) {
                    c.this.f1917b.f1(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f1917b;
                    jVar.S0(fragment, fragment.J(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f1916a = viewGroup;
            this.f1917b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1916a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1922c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1920a = viewGroup;
            this.f1921b = view;
            this.f1922c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1920a.endViewTransition(this.f1921b);
            Animator p10 = this.f1922c.p();
            this.f1922c.g1(null);
            if (p10 == null || this.f1920a.indexOfChild(this.f1921b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f1922c;
            jVar.S0(fragment, fragment.J(), 0, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1924a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1925b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1926c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1924a = viewGroup;
            this.f1925b = view;
            this.f1926c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1924a.endViewTransition(this.f1925b);
            animator.removeListener(this);
            Fragment fragment = this.f1926c;
            View view = fragment.T;
            if (view == null || !fragment.L) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends androidx.fragment.app.g {
        f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.h hVar = j.this.D;
            return hVar.b(hVar.f(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1929a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1930b;

        g(Animator animator) {
            this.f1929a = null;
            this.f1930b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f1929a = animation;
            this.f1930b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends AnimationSet implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final ViewGroup f1931n;

        /* renamed from: o  reason: collision with root package name */
        private final View f1932o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f1933p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f1934q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f1935r;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1935r = true;
            this.f1931n = viewGroup;
            this.f1932o = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f1935r = true;
            if (this.f1933p) {
                return !this.f1934q;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f1933p = true;
                androidx.core.view.r.a(this.f1931n, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f1935r = true;
            if (this.f1933p) {
                return !this.f1934q;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f1933p = true;
                androidx.core.view.r.a(this.f1931n, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1933p || !this.f1935r) {
                this.f1931n.endViewTransition(this.f1932o);
                this.f1934q = true;
                return;
            }
            this.f1935r = false;
            this.f1931n.post(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        final i.a f1936a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f1937b;

        i(i.a aVar, boolean z10) {
            this.f1936a = aVar;
            this.f1937b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0038j {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f1938a = {16842755, 16842960, 16842961};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class l implements k {

        /* renamed from: a  reason: collision with root package name */
        final String f1939a;

        /* renamed from: b  reason: collision with root package name */
        final int f1940b;

        /* renamed from: c  reason: collision with root package name */
        final int f1941c;

        l(String str, int i10, int i11) {
            this.f1939a = str;
            this.f1940b = i10;
            this.f1941c = i11;
        }

        @Override // androidx.fragment.app.j.k
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.G;
            if (fragment == null || this.f1940b >= 0 || this.f1939a != null || !fragment.q().g()) {
                return j.this.W0(arrayList, arrayList2, this.f1939a, this.f1940b, this.f1941c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m implements Fragment.f {

        /* renamed from: a  reason: collision with root package name */
        final boolean f1943a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.fragment.app.a f1944b;

        /* renamed from: c  reason: collision with root package name */
        private int f1945c;

        m(androidx.fragment.app.a aVar, boolean z10) {
            this.f1943a = z10;
            this.f1944b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i10 = this.f1945c - 1;
            this.f1945c = i10;
            if (i10 != 0) {
                return;
            }
            this.f1944b.f1859s.i1();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f1945c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f1944b;
            aVar.f1859s.w(aVar, this.f1943a, false, false);
        }

        public void d() {
            boolean z10 = this.f1945c > 0;
            j jVar = this.f1944b.f1859s;
            int size = jVar.f1906s.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = jVar.f1906s.get(i10);
                fragment.l1(null);
                if (z10 && fragment.R()) {
                    fragment.o1();
                }
            }
            androidx.fragment.app.a aVar = this.f1944b;
            aVar.f1859s.w(aVar, this.f1943a, !z10, true);
        }

        public boolean e() {
            return this.f1945c == 0;
        }
    }

    private boolean F0(Fragment fragment) {
        return (fragment.P && fragment.Q) || fragment.G.t();
    }

    static g L0(float f10, float f11) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f11);
        alphaAnimation.setInterpolator(W);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g N0(float f10, float f11, float f12, float f13) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(V);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f12, f13);
        alphaAnimation.setInterpolator(W);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void O0(m.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment x10 = bVar.x(i10);
            if (!x10.f1833x) {
                View c12 = x10.c1();
                x10.f1814b0 = c12.getAlpha();
                c12.setAlpha(0.0f);
            }
        }
    }

    private boolean V0(String str, int i10, int i11) {
        m0();
        k0(true);
        Fragment fragment = this.G;
        if (fragment == null || i10 >= 0 || str != null || !fragment.q().g()) {
            boolean W0 = W0(this.M, this.N, str, i10, i11);
            if (W0) {
                this.f1904q = true;
                try {
                    a1(this.M, this.N);
                } finally {
                    v();
                }
            }
            q1();
            h0();
            s();
            return W0;
        }
        return true;
    }

    private int X0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, m.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, i13 + 1, i11)) {
                if (this.R == null) {
                    this.R = new ArrayList<>();
                }
                m mVar = new m(aVar, booleanValue);
                this.R.add(mVar);
                aVar.u(mVar);
                if (booleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                k(bVar);
            }
        }
        return i12;
    }

    private void Y(Fragment fragment) {
        if (fragment == null || this.f1907t.get(fragment.f1827r) != fragment) {
            return;
        }
        fragment.U0();
    }

    private void a1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        p0(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f1987q) {
                if (i11 != i10) {
                    o0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f1987q) {
                        i11++;
                    }
                }
                o0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            o0(arrayList, arrayList2, i11, size);
        }
    }

    public static int e1(int i10) {
        if (i10 != 4097) {
            if (i10 != 4099) {
                return i10 != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    private void f0(int i10) {
        try {
            this.f1904q = true;
            Q0(i10, false);
            this.f1904q = false;
            m0();
        } catch (Throwable th) {
            this.f1904q = false;
            throw th;
        }
    }

    private void i0() {
        for (Fragment fragment : this.f1907t.values()) {
            if (fragment != null) {
                if (fragment.o() != null) {
                    int J = fragment.J();
                    View o10 = fragment.o();
                    Animation animation = o10.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        o10.clearAnimation();
                    }
                    fragment.f1(null);
                    S0(fragment, J, 0, 0, false);
                } else if (fragment.p() != null) {
                    fragment.p().end();
                }
            }
        }
    }

    private void k(m.b<Fragment> bVar) {
        int i10 = this.C;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 3);
        int size = this.f1906s.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f1906s.get(i11);
            if (fragment.f1823n < min) {
                S0(fragment, min, fragment.z(), fragment.A(), false);
                if (fragment.T != null && !fragment.L && fragment.Z) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void k0(boolean z10) {
        if (this.f1904q) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.D == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.D.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            u();
        }
        if (this.M == null) {
            this.M = new ArrayList<>();
            this.N = new ArrayList<>();
        }
        this.f1904q = true;
        try {
            p0(null, null);
        } finally {
            this.f1904q = false;
        }
    }

    private static void n0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.h(-1);
                aVar.m(i10 == i11 + (-1));
            } else {
                aVar.h(1);
                aVar.l();
            }
            i10++;
        }
    }

    private void o0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        int i12;
        int i13;
        int i14 = i10;
        boolean z10 = arrayList.get(i14).f1987q;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.f1906s);
        Fragment A0 = A0();
        boolean z11 = false;
        for (int i15 = i14; i15 < i11; i15++) {
            androidx.fragment.app.a aVar = arrayList.get(i15);
            A0 = !arrayList2.get(i15).booleanValue() ? aVar.n(this.O, A0) : aVar.v(this.O, A0);
            z11 = z11 || aVar.f1978h;
        }
        this.O.clear();
        if (!z10) {
            o.B(this, arrayList, arrayList2, i10, i11, false);
        }
        n0(arrayList, arrayList2, i10, i11);
        if (z10) {
            m.b<Fragment> bVar = new m.b<>();
            k(bVar);
            int X0 = X0(arrayList, arrayList2, i10, i11, bVar);
            O0(bVar);
            i12 = X0;
        } else {
            i12 = i11;
        }
        if (i12 != i14 && z10) {
            o.B(this, arrayList, arrayList2, i10, i12, true);
            Q0(this.C, true);
        }
        while (i14 < i11) {
            androidx.fragment.app.a aVar2 = arrayList.get(i14);
            if (arrayList2.get(i14).booleanValue() && (i13 = aVar2.f1861u) >= 0) {
                u0(i13);
                aVar2.f1861u = -1;
            }
            aVar2.t();
            i14++;
        }
        if (z11) {
            c1();
        }
    }

    private void o1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
        androidx.fragment.app.h hVar = this.D;
        try {
            if (hVar != null) {
                hVar.l("  ", null, printWriter, new String[0]);
            } else {
                b("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
        }
        throw runtimeException;
    }

    private void p(Fragment fragment, g gVar, int i10) {
        View view = fragment.T;
        ViewGroup viewGroup = fragment.S;
        viewGroup.startViewTransition(view);
        fragment.m1(i10);
        if (gVar.f1929a != null) {
            h hVar = new h(gVar.f1929a, viewGroup, view);
            fragment.f1(fragment.T);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.T.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f1930b;
        fragment.g1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.T);
        animator.start();
    }

    private void p0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.R;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            m mVar = this.R.get(i10);
            if (arrayList == null || mVar.f1943a || (indexOf2 = arrayList.indexOf(mVar.f1944b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f1944b.q(arrayList, 0, arrayList.size()))) {
                    this.R.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || mVar.f1943a || (indexOf = arrayList.indexOf(mVar.f1944b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                i10++;
            } else {
                this.R.remove(i10);
                i10--;
                size--;
            }
            mVar.c();
            i10++;
        }
    }

    public static int p1(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? 1 : 2;
        } else if (i10 == 4099) {
            return z10 ? 5 : 6;
        } else if (i10 != 8194) {
            return -1;
        } else {
            return z10 ? 3 : 4;
        }
    }

    private void q1() {
        ArrayList<k> arrayList = this.f1903p;
        boolean z10 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f1911x.f((w0() <= 0 || !G0(this.F)) ? false : false);
        } else {
            this.f1911x.f(true);
        }
    }

    private void s() {
        this.f1907t.values().removeAll(Collections.singleton(null));
    }

    private Fragment s0(Fragment fragment) {
        ViewGroup viewGroup = fragment.S;
        View view = fragment.T;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f1906s.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1906s.get(indexOf);
                if (fragment2.S == viewGroup && fragment2.T != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void t0() {
        if (this.R != null) {
            while (!this.R.isEmpty()) {
                this.R.remove(0).d();
            }
        }
    }

    private void u() {
        if (I0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void v() {
        this.f1904q = false;
        this.N.clear();
        this.M.clear();
    }

    private boolean v0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f1903p;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f1903p.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= this.f1903p.get(i10).a(arrayList, arrayList2);
                }
                this.f1903p.clear();
                this.D.h().removeCallbacks(this.T);
                return z10;
            }
            return false;
        }
    }

    public void A(Configuration configuration) {
        for (int i10 = 0; i10 < this.f1906s.size(); i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null) {
                fragment.E0(configuration);
            }
        }
    }

    public Fragment A0() {
        return this.G;
    }

    public boolean B(MenuItem menuItem) {
        if (this.C < 1) {
            return false;
        }
        for (int i10 = 0; i10 < this.f1906s.size(); i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null && fragment.F0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w B0(Fragment fragment) {
        return this.S.i(fragment);
    }

    public void C() {
        this.I = false;
        this.J = false;
        f0(1);
    }

    void C0() {
        m0();
        if (this.f1911x.c()) {
            g();
        } else {
            this.f1910w.c();
        }
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.C < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f1906s.size(); i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null && fragment.H0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f1909v != null) {
            for (int i11 = 0; i11 < this.f1909v.size(); i11++) {
                Fragment fragment2 = this.f1909v.get(i11);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.h0();
                }
            }
        }
        this.f1909v = arrayList;
        return z10;
    }

    public void D0(Fragment fragment) {
        if (U) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.L) {
            return;
        }
        fragment.L = true;
        fragment.f1813a0 = true ^ fragment.f1813a0;
    }

    public void E() {
        this.K = true;
        m0();
        f0(0);
        this.D = null;
        this.E = null;
        this.F = null;
        if (this.f1910w != null) {
            this.f1911x.d();
            this.f1910w = null;
        }
    }

    public boolean E0() {
        return this.K;
    }

    public void F() {
        f0(1);
    }

    public void G() {
        for (int i10 = 0; i10 < this.f1906s.size(); i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null) {
                fragment.N0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.E;
        return fragment == jVar.A0() && G0(jVar.F);
    }

    public void H(boolean z10) {
        for (int size = this.f1906s.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1906s.get(size);
            if (fragment != null) {
                fragment.O0(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H0(int i10) {
        return this.C >= i10;
    }

    void I(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).I(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.a(this, fragment, bundle);
            }
        }
    }

    public boolean I0() {
        return this.I || this.J;
    }

    void J(Fragment fragment, Context context, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).J(fragment, context, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.b(this, fragment, context);
            }
        }
    }

    g J0(Fragment fragment, int i10, boolean z10, int i11) {
        int p12;
        int z11 = fragment.z();
        boolean z12 = false;
        fragment.j1(0);
        ViewGroup viewGroup = fragment.S;
        if (viewGroup == null || viewGroup.getLayoutTransition() == null) {
            Animation c02 = fragment.c0(i10, z10, z11);
            if (c02 != null) {
                return new g(c02);
            }
            Animator d02 = fragment.d0(i10, z10, z11);
            if (d02 != null) {
                return new g(d02);
            }
            if (z11 != 0) {
                boolean equals = "anim".equals(this.D.f().getResources().getResourceTypeName(z11));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(this.D.f(), z11);
                        if (loadAnimation != null) {
                            return new g(loadAnimation);
                        }
                        z12 = true;
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z12) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(this.D.f(), z11);
                        if (loadAnimator != null) {
                            return new g(loadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (equals) {
                            throw e11;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.D.f(), z11);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    }
                }
            }
            if (i10 != 0 && (p12 = p1(i10, z10)) >= 0) {
                switch (p12) {
                    case 1:
                        return N0(1.125f, 1.0f, 0.0f, 1.0f);
                    case 2:
                        return N0(1.0f, 0.975f, 1.0f, 0.0f);
                    case 3:
                        return N0(0.975f, 1.0f, 0.0f, 1.0f);
                    case 4:
                        return N0(1.0f, 1.075f, 1.0f, 0.0f);
                    case 5:
                        return L0(0.0f, 1.0f);
                    case 6:
                        return L0(1.0f, 0.0f);
                    default:
                        if (i11 == 0 && this.D.p()) {
                            this.D.o();
                        }
                        return null;
                }
            }
            return null;
        }
        return null;
    }

    void K(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).K(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.c(this, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(Fragment fragment) {
        if (this.f1907t.get(fragment.f1827r) != null) {
            return;
        }
        this.f1907t.put(fragment.f1827r, fragment);
        if (fragment.O) {
            if (fragment.N) {
                n(fragment);
            } else {
                b1(fragment);
            }
            fragment.O = false;
        }
        if (U) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void L(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).L(fragment, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.d(this, fragment);
            }
        }
    }

    void M(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).M(fragment, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.e(this, fragment);
            }
        }
    }

    void M0(Fragment fragment) {
        if (this.f1907t.get(fragment.f1827r) == null) {
            return;
        }
        if (U) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.f1907t.values()) {
            if (fragment2 != null && fragment.f1827r.equals(fragment2.f1830u)) {
                fragment2.f1829t = fragment;
                fragment2.f1830u = null;
            }
        }
        this.f1907t.put(fragment.f1827r, null);
        b1(fragment);
        String str = fragment.f1830u;
        if (str != null) {
            fragment.f1829t = this.f1907t.get(str);
        }
        fragment.N();
    }

    void N(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).N(fragment, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.f(this, fragment);
            }
        }
    }

    void O(Fragment fragment, Context context, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).O(fragment, context, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.g(this, fragment, context);
            }
        }
    }

    void P(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).P(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.h(this, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f1907t.containsKey(fragment.f1827r)) {
            if (U) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.C + "since it is not added to " + this);
                return;
            }
            return;
        }
        int i10 = this.C;
        if (fragment.f1834y) {
            i10 = fragment.Q() ? Math.min(i10, 1) : Math.min(i10, 0);
        }
        S0(fragment, i10, fragment.A(), fragment.B(), false);
        if (fragment.T != null) {
            Fragment s02 = s0(fragment);
            if (s02 != null) {
                View view = s02.T;
                ViewGroup viewGroup = fragment.S;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.T);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.T, indexOfChild);
                }
            }
            if (fragment.Z && fragment.S != null) {
                float f10 = fragment.f1814b0;
                if (f10 > 0.0f) {
                    fragment.T.setAlpha(f10);
                }
                fragment.f1814b0 = 0.0f;
                fragment.Z = false;
                g J0 = J0(fragment, fragment.A(), true, fragment.B());
                if (J0 != null) {
                    Animation animation = J0.f1929a;
                    if (animation != null) {
                        fragment.T.startAnimation(animation);
                    } else {
                        J0.f1930b.setTarget(fragment.T);
                        J0.f1930b.start();
                    }
                }
            }
        }
        if (fragment.f1813a0) {
            x(fragment);
        }
    }

    void Q(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).Q(fragment, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.i(this, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(int i10, boolean z10) {
        androidx.fragment.app.h hVar;
        if (this.D == null && i10 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.C) {
            this.C = i10;
            int size = this.f1906s.size();
            for (int i11 = 0; i11 < size; i11++) {
                P0(this.f1906s.get(i11));
            }
            for (Fragment fragment : this.f1907t.values()) {
                if (fragment != null && (fragment.f1834y || fragment.M)) {
                    if (!fragment.Z) {
                        P0(fragment);
                    }
                }
            }
            n1();
            if (this.H && (hVar = this.D) != null && this.C == 4) {
                hVar.s();
                this.H = false;
            }
        }
    }

    void R(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).R(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.j(this, fragment, bundle);
            }
        }
    }

    void R0(Fragment fragment) {
        S0(fragment, this.C, 0, 0, false);
    }

    void S(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).S(fragment, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.k(this, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.S0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void T(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).T(fragment, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.l(this, fragment);
            }
        }
    }

    public void T0() {
        this.I = false;
        this.J = false;
        int size = this.f1906s.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null) {
                fragment.U();
            }
        }
    }

    void U(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).U(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.m(this, fragment, view, bundle);
            }
        }
    }

    public void U0(Fragment fragment) {
        if (fragment.V) {
            if (this.f1904q) {
                this.L = true;
                return;
            }
            fragment.V = false;
            S0(fragment, this.C, 0, 0, false);
        }
    }

    void V(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.F;
        if (fragment2 != null) {
            androidx.fragment.app.i w10 = fragment2.w();
            if (w10 instanceof j) {
                ((j) w10).V(fragment, true);
            }
        }
        Iterator<i> it = this.B.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 || next.f1937b) {
                next.f1936a.n(this, fragment);
            }
        }
    }

    public boolean W(MenuItem menuItem) {
        if (this.C < 1) {
            return false;
        }
        for (int i10 = 0; i10 < this.f1906s.size(); i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null && fragment.P0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1908u;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1908u.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1908u.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (i10 >= 0 && i10 == aVar.f1861u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1908u.get(size2);
                        if (str == null || !str.equals(aVar2.o())) {
                            if (i10 < 0 || i10 != aVar2.f1861u) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f1908u.size() - 1) {
                return false;
            }
            for (int size3 = this.f1908u.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f1908u.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void X(Menu menu) {
        if (this.C < 1) {
            return;
        }
        for (int i10 = 0; i10 < this.f1906s.size(); i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null) {
                fragment.Q0(menu);
            }
        }
    }

    public void Y0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.E != this) {
            o1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f1827r);
    }

    public void Z() {
        f0(3);
    }

    public void Z0(Fragment fragment) {
        if (U) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.D);
        }
        boolean z10 = !fragment.Q();
        if (!fragment.M || z10) {
            synchronized (this.f1906s) {
                this.f1906s.remove(fragment);
            }
            if (F0(fragment)) {
                this.H = true;
            }
            fragment.f1833x = false;
            fragment.f1834y = true;
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new androidx.fragment.app.a(this);
    }

    public void a0(boolean z10) {
        for (int size = this.f1906s.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1906s.get(size);
            if (fragment != null) {
                fragment.S0(z10);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f1907t.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f1907t.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.f(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f1906s.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size5; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f1906s.get(i10).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1909v;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size4; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f1909v.get(i11).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1908u;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                androidx.fragment.app.a aVar = this.f1908u.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f1912y;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i13 = 0; i13 < size2; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println((androidx.fragment.app.a) this.f1912y.get(i13));
                }
            }
            ArrayList<Integer> arrayList4 = this.f1913z;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1913z.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f1903p;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i14 = 0; i14 < size; i14++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i14);
                printWriter.print(": ");
                printWriter.println((k) this.f1903p.get(i14));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.E);
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.F);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.C);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public boolean b0(Menu menu) {
        if (this.C < 1) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f1906s.size(); i10++) {
            Fragment fragment = this.f1906s.get(i10);
            if (fragment != null && fragment.T0(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    void b1(Fragment fragment) {
        if (I0()) {
            if (U) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.S.k(fragment) && U) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public Fragment c(String str) {
        if (str != null) {
            for (int size = this.f1906s.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1906s.get(size);
                if (fragment != null && str.equals(fragment.K)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.f1907t.values()) {
                if (fragment2 != null && str.equals(fragment2.K)) {
                    return fragment2;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0() {
        q1();
        Y(this.G);
    }

    void c1() {
        if (this.A != null) {
            for (int i10 = 0; i10 < this.A.size(); i10++) {
                this.A.get(i10).a();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public androidx.fragment.app.g d() {
        if (super.d() == androidx.fragment.app.i.f1901o) {
            Fragment fragment = this.F;
            if (fragment != null) {
                return fragment.E.d();
            }
            i(new f());
        }
        return super.d();
    }

    public void d0() {
        this.I = false;
        this.J = false;
        f0(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1(Parcelable parcelable) {
        androidx.fragment.app.m mVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) parcelable;
        if (kVar.f1946n == null) {
            return;
        }
        for (Fragment fragment : this.S.h()) {
            if (U) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<androidx.fragment.app.m> it = kVar.f1946n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar = null;
                    break;
                }
                mVar = it.next();
                if (mVar.f1959o.equals(fragment.f1827r)) {
                    break;
                }
            }
            if (mVar == null) {
                if (U) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f1946n);
                }
                S0(fragment, 1, 0, 0, false);
                fragment.f1834y = true;
                S0(fragment, 0, 0, 0, false);
            } else {
                mVar.A = fragment;
                fragment.f1825p = null;
                fragment.D = 0;
                fragment.A = false;
                fragment.f1833x = false;
                Fragment fragment2 = fragment.f1829t;
                fragment.f1830u = fragment2 != null ? fragment2.f1827r : null;
                fragment.f1829t = null;
                Bundle bundle = mVar.f1970z;
                if (bundle != null) {
                    bundle.setClassLoader(this.D.f().getClassLoader());
                    fragment.f1825p = mVar.f1970z.getSparseParcelableArray("android:view_state");
                    fragment.f1824o = mVar.f1970z;
                }
            }
        }
        this.f1907t.clear();
        Iterator<androidx.fragment.app.m> it2 = kVar.f1946n.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.m next = it2.next();
            if (next != null) {
                Fragment a10 = next.a(this.D.f().getClassLoader(), d());
                a10.E = this;
                if (U) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + a10.f1827r + "): " + a10);
                }
                this.f1907t.put(a10.f1827r, a10);
                next.A = null;
            }
        }
        this.f1906s.clear();
        ArrayList<String> arrayList = kVar.f1947o;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.f1907t.get(next2);
                if (fragment3 == null) {
                    o1(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                }
                fragment3.f1833x = true;
                if (U) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (this.f1906s.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.f1906s) {
                    this.f1906s.add(fragment3);
                }
            }
        }
        if (kVar.f1948p != null) {
            this.f1908u = new ArrayList<>(kVar.f1948p.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = kVar.f1948p;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a11 = bVarArr[i10].a(this);
                if (U) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + a11.f1861u + "): " + a11);
                    PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
                    a11.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1908u.add(a11);
                int i11 = a11.f1861u;
                if (i11 >= 0) {
                    j1(i11, a11);
                }
                i10++;
            }
        } else {
            this.f1908u = null;
        }
        String str = kVar.f1949q;
        if (str != null) {
            Fragment fragment4 = this.f1907t.get(str);
            this.G = fragment4;
            Y(fragment4);
        }
        this.f1905r = kVar.f1950r;
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> e() {
        List<Fragment> list;
        if (this.f1906s.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1906s) {
            list = (List) this.f1906s.clone();
        }
        return list;
    }

    public void e0() {
        this.I = false;
        this.J = false;
        f0(3);
    }

    @Override // androidx.fragment.app.i
    public void f(int i10, int i11) {
        if (i10 >= 0) {
            j0(new l(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable f1() {
        ArrayList<String> arrayList;
        int size;
        t0();
        i0();
        m0();
        this.I = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.f1907t.isEmpty()) {
            return null;
        }
        ArrayList<androidx.fragment.app.m> arrayList2 = new ArrayList<>(this.f1907t.size());
        boolean z10 = false;
        for (Fragment fragment : this.f1907t.values()) {
            if (fragment != null) {
                if (fragment.E != this) {
                    o1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                androidx.fragment.app.m mVar = new androidx.fragment.app.m(fragment);
                arrayList2.add(mVar);
                if (fragment.f1823n <= 0 || mVar.f1970z != null) {
                    mVar.f1970z = fragment.f1824o;
                } else {
                    mVar.f1970z = g1(fragment);
                    String str = fragment.f1830u;
                    if (str != null) {
                        Fragment fragment2 = this.f1907t.get(str);
                        if (fragment2 == null) {
                            o1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f1830u));
                        }
                        if (mVar.f1970z == null) {
                            mVar.f1970z = new Bundle();
                        }
                        Y0(mVar.f1970z, "android:target_state", fragment2);
                        int i10 = fragment.f1831v;
                        if (i10 != 0) {
                            mVar.f1970z.putInt("android:target_req_state", i10);
                        }
                    }
                }
                if (U) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.f1970z);
                }
                z10 = true;
            }
        }
        if (!z10) {
            if (U) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f1906s.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f1906s.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1827r);
                if (next.E != this) {
                    o1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (U) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1827r + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1908u;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i11 = 0; i11 < size; i11++) {
                bVarArr[i11] = new androidx.fragment.app.b(this.f1908u.get(i11));
                if (U) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i11 + ": " + this.f1908u.get(i11));
                }
            }
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k();
        kVar.f1946n = arrayList2;
        kVar.f1947o = arrayList;
        kVar.f1948p = bVarArr;
        Fragment fragment3 = this.G;
        if (fragment3 != null) {
            kVar.f1949q = fragment3.f1827r;
        }
        kVar.f1950r = this.f1905r;
        return kVar;
    }

    @Override // androidx.fragment.app.i
    public boolean g() {
        u();
        return V0(null, -1, 0);
    }

    public void g0() {
        this.J = true;
        f0(2);
    }

    Bundle g1(Fragment fragment) {
        if (this.P == null) {
            this.P = new Bundle();
        }
        fragment.W0(this.P);
        R(fragment, this.P, false);
        Bundle bundle = null;
        if (!this.P.isEmpty()) {
            Bundle bundle2 = this.P;
            this.P = null;
            bundle = bundle2;
        }
        if (fragment.T != null) {
            h1(fragment);
        }
        if (fragment.f1825p != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f1825p);
        }
        if (!fragment.W) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.W);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public void h(i.a aVar, boolean z10) {
        this.B.add(new i(aVar, z10));
    }

    void h0() {
        if (this.L) {
            this.L = false;
            n1();
        }
    }

    void h1(Fragment fragment) {
        if (fragment.U == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.Q;
        if (sparseArray == null) {
            this.Q = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.U.saveHierarchyState(this.Q);
        if (this.Q.size() > 0) {
            fragment.f1825p = this.Q;
            this.Q = null;
        }
    }

    void i1() {
        synchronized (this) {
            ArrayList<m> arrayList = this.R;
            boolean z10 = false;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f1903p;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z10 = true;
            }
            if (z11 || z10) {
                this.D.h().removeCallbacks(this.T);
                this.D.h().post(this.T);
                q1();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void j(i.a aVar) {
        synchronized (this.B) {
            int i10 = 0;
            int size = this.B.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (this.B.get(i10).f1936a == aVar) {
                    this.B.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(androidx.fragment.app.j.k r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.u()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.K     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            androidx.fragment.app.h r0 = r1.D     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<androidx.fragment.app.j$k> r3 = r1.f1903p     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f1903p = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<androidx.fragment.app.j$k> r3 = r1.f1903p     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.i1()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.j0(androidx.fragment.app.j$k, boolean):void");
    }

    public void j1(int i10, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.f1912y == null) {
                this.f1912y = new ArrayList<>();
            }
            int size = this.f1912y.size();
            if (i10 < size) {
                if (U) {
                    Log.v("FragmentManager", "Setting back stack index " + i10 + " to " + aVar);
                }
                this.f1912y.set(i10, aVar);
            } else {
                while (size < i10) {
                    this.f1912y.add(null);
                    if (this.f1913z == null) {
                        this.f1913z = new ArrayList<>();
                    }
                    if (U) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f1913z.add(Integer.valueOf(size));
                    size++;
                }
                if (U) {
                    Log.v("FragmentManager", "Adding back stack index " + i10 + " with " + aVar);
                }
                this.f1912y.add(aVar);
            }
        }
    }

    public void k1(Fragment fragment, e.c cVar) {
        if (this.f1907t.get(fragment.f1827r) == fragment && (fragment.F == null || fragment.w() == this)) {
            fragment.f1817e0 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(androidx.fragment.app.a aVar) {
        if (this.f1908u == null) {
            this.f1908u = new ArrayList<>();
        }
        this.f1908u.add(aVar);
    }

    void l0(Fragment fragment) {
        if (!fragment.f1835z || fragment.C) {
            return;
        }
        fragment.I0(fragment.M0(fragment.f1824o), null, fragment.f1824o);
        View view = fragment.T;
        if (view == null) {
            fragment.U = null;
            return;
        }
        fragment.U = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.L) {
            fragment.T.setVisibility(8);
        }
        fragment.A0(fragment.T, fragment.f1824o);
        U(fragment, fragment.T, fragment.f1824o, false);
    }

    public void l1(Fragment fragment) {
        if (fragment == null || (this.f1907t.get(fragment.f1827r) == fragment && (fragment.F == null || fragment.w() == this))) {
            Fragment fragment2 = this.G;
            this.G = fragment;
            Y(fragment2);
            Y(this.G);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void m(Fragment fragment, boolean z10) {
        if (U) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        K0(fragment);
        if (fragment.M) {
            return;
        }
        if (this.f1906s.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1906s) {
            this.f1906s.add(fragment);
        }
        fragment.f1833x = true;
        fragment.f1834y = false;
        if (fragment.T == null) {
            fragment.f1813a0 = false;
        }
        if (F0(fragment)) {
            this.H = true;
        }
        if (z10) {
            R0(fragment);
        }
    }

    public boolean m0() {
        k0(true);
        boolean z10 = false;
        while (v0(this.M, this.N)) {
            this.f1904q = true;
            try {
                a1(this.M, this.N);
                v();
                z10 = true;
            } catch (Throwable th) {
                v();
                throw th;
            }
        }
        q1();
        h0();
        s();
        return z10;
    }

    public void m1(Fragment fragment) {
        if (U) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.L) {
            fragment.L = false;
            fragment.f1813a0 = !fragment.f1813a0;
        }
    }

    void n(Fragment fragment) {
        if (I0()) {
            if (U) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.S.d(fragment) && U) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    void n1() {
        for (Fragment fragment : this.f1907t.values()) {
            if (fragment != null) {
                U0(fragment);
            }
        }
    }

    public int o(androidx.fragment.app.a aVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f1913z;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Integer> arrayList2 = this.f1913z;
                int intValue = arrayList2.remove(arrayList2.size() - 1).intValue();
                if (U) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                }
                this.f1912y.set(intValue, aVar);
                return intValue;
            }
            if (this.f1912y == null) {
                this.f1912y = new ArrayList<>();
            }
            int size = this.f1912y.size();
            if (U) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f1912y.add(aVar);
            return size;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0038j.f1938a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            String str2 = attributeValue;
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
            }
            Fragment q02 = resourceId != -1 ? q0(resourceId) : null;
            if (q02 == null && string != null) {
                q02 = c(string);
            }
            if (q02 == null && id != -1) {
                q02 = q0(id);
            }
            if (U) {
                Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + q02);
            }
            if (q02 == null) {
                q02 = d().a(context.getClassLoader(), str2);
                q02.f1835z = true;
                q02.I = resourceId != 0 ? resourceId : id;
                q02.J = id;
                q02.K = string;
                q02.A = true;
                q02.E = this;
                androidx.fragment.app.h hVar = this.D;
                q02.F = hVar;
                q02.n0(hVar.f(), attributeSet, q02.f1824o);
                m(q02, true);
            } else if (q02.A) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            } else {
                q02.A = true;
                androidx.fragment.app.h hVar2 = this.D;
                q02.F = hVar2;
                q02.n0(hVar2.f(), attributeSet, q02.f1824o);
            }
            Fragment fragment = q02;
            if (this.C >= 1 || !fragment.f1835z) {
                R0(fragment);
            } else {
                S0(fragment, 1, 0, 0, false);
            }
            View view2 = fragment.T;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragment.T.getTag() == null) {
                    fragment.T.setTag(string);
                }
                return fragment.T;
            }
            throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public void q(androidx.fragment.app.h hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.D != null) {
            throw new IllegalStateException("Already attached");
        }
        this.D = hVar;
        this.E = eVar;
        this.F = fragment;
        if (fragment != null) {
            q1();
        }
        if (hVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) hVar;
            OnBackPressedDispatcher i10 = cVar.i();
            this.f1910w = i10;
            androidx.lifecycle.i iVar = cVar;
            if (fragment != null) {
                iVar = fragment;
            }
            i10.a(iVar, this.f1911x);
        }
        this.S = fragment != null ? fragment.E.x0(fragment) : hVar instanceof x ? androidx.fragment.app.l.g(((x) hVar).g()) : new androidx.fragment.app.l(false);
    }

    public Fragment q0(int i10) {
        for (int size = this.f1906s.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1906s.get(size);
            if (fragment != null && fragment.I == i10) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f1907t.values()) {
            if (fragment2 != null && fragment2.I == i10) {
                return fragment2;
            }
        }
        return null;
    }

    public void r(Fragment fragment) {
        if (U) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.M) {
            fragment.M = false;
            if (fragment.f1833x) {
                return;
            }
            if (this.f1906s.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (U) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.f1906s) {
                this.f1906s.add(fragment);
            }
            fragment.f1833x = true;
            if (F0(fragment)) {
                this.H = true;
            }
        }
    }

    public Fragment r0(String str) {
        Fragment k10;
        for (Fragment fragment : this.f1907t.values()) {
            if (fragment != null && (k10 = fragment.k(str)) != null) {
                return k10;
            }
        }
        return null;
    }

    boolean t() {
        boolean z10 = false;
        for (Fragment fragment : this.f1907t.values()) {
            if (fragment != null) {
                z10 = F0(fragment);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.F;
        if (obj == null) {
            obj = this.D;
        }
        androidx.core.util.b.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u0(int i10) {
        synchronized (this) {
            this.f1912y.set(i10, null);
            if (this.f1913z == null) {
                this.f1913z = new ArrayList<>();
            }
            if (U) {
                Log.v("FragmentManager", "Freeing back stack index " + i10);
            }
            this.f1913z.add(Integer.valueOf(i10));
        }
    }

    void w(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.m(z12);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11) {
            o.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z12) {
            Q0(this.C, true);
        }
        for (Fragment fragment : this.f1907t.values()) {
            if (fragment != null && fragment.T != null && fragment.Z && aVar.p(fragment.J)) {
                float f10 = fragment.f1814b0;
                if (f10 > 0.0f) {
                    fragment.T.setAlpha(f10);
                }
                if (z12) {
                    fragment.f1814b0 = 0.0f;
                } else {
                    fragment.f1814b0 = -1.0f;
                    fragment.Z = false;
                }
            }
        }
    }

    public int w0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f1908u;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void x(Fragment fragment) {
        Animator animator;
        if (fragment.T != null) {
            g J0 = J0(fragment, fragment.A(), !fragment.L, fragment.B());
            if (J0 == null || (animator = J0.f1930b) == null) {
                if (J0 != null) {
                    fragment.T.startAnimation(J0.f1929a);
                    J0.f1929a.start();
                }
                fragment.T.setVisibility((!fragment.L || fragment.P()) ? 0 : 8);
                if (fragment.P()) {
                    fragment.i1(false);
                }
            } else {
                animator.setTarget(fragment.T);
                if (!fragment.L) {
                    fragment.T.setVisibility(0);
                } else if (fragment.P()) {
                    fragment.i1(false);
                } else {
                    ViewGroup viewGroup = fragment.S;
                    View view = fragment.T;
                    viewGroup.startViewTransition(view);
                    J0.f1930b.addListener(new e(viewGroup, view, fragment));
                }
                J0.f1930b.start();
            }
        }
        if (fragment.f1833x && F0(fragment)) {
            this.H = true;
        }
        fragment.f1813a0 = false;
        fragment.l0(fragment.L);
    }

    androidx.fragment.app.l x0(Fragment fragment) {
        return this.S.f(fragment);
    }

    public void y(Fragment fragment) {
        if (U) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.M) {
            return;
        }
        fragment.M = true;
        if (fragment.f1833x) {
            if (U) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.f1906s) {
                this.f1906s.remove(fragment);
            }
            if (F0(fragment)) {
                this.H = true;
            }
            fragment.f1833x = false;
        }
    }

    public Fragment y0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f1907t.get(string);
        if (fragment == null) {
            o1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void z() {
        this.I = false;
        this.J = false;
        f0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 z0() {
        return this;
    }
}