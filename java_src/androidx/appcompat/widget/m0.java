package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: i  reason: collision with root package name */
    private static m0 f944i;

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, m.h<ColorStateList>> f946a;

    /* renamed from: b  reason: collision with root package name */
    private m.g<String, d> f947b;

    /* renamed from: c  reason: collision with root package name */
    private m.h<String> f948c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, m.d<WeakReference<Drawable.ConstantState>>> f949d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f950e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f951f;

    /* renamed from: g  reason: collision with root package name */
    private e f952g;

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f943h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    private static final c f945j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return f.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends m.e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return c(Integer.valueOf(j(i10, mode)));
        }

        PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(m0 m0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f947b == null) {
            this.f947b = new m.g<>();
        }
        this.f947b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            m.d<WeakReference<Drawable.ConstantState>> dVar = this.f949d.get(context);
            if (dVar == null) {
                dVar = new m.d<>();
                this.f949d.put(context, dVar);
            }
            dVar.m(j10, new WeakReference<>(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f946a == null) {
            this.f946a = new WeakHashMap<>();
        }
        m.h<ColorStateList> hVar = this.f946a.get(context);
        if (hVar == null) {
            hVar = new m.h<>();
            this.f946a.put(context, hVar);
        }
        hVar.c(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f951f) {
            return;
        }
        this.f951f = true;
        Drawable j10 = j(context, g.a.abc_vector_test);
        if (j10 == null || !q(j10)) {
            this.f951f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) {
        if (this.f950e == null) {
            this.f950e = new TypedValue();
        }
        TypedValue typedValue = this.f950e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        e eVar = this.f952g;
        Drawable c10 = eVar == null ? null : eVar.c(this, context, i10);
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, c10);
        }
        return c10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (f944i == null) {
                m0 m0Var2 = new m0();
                f944i = m0Var2;
                p(m0Var2);
            }
            m0Var = f944i;
        }
        return m0Var;
    }

    private synchronized Drawable i(Context context, long j10) {
        m.d<WeakReference<Drawable.ConstantState>> dVar = this.f949d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> h10 = dVar.h(j10);
        if (h10 != null) {
            Drawable.ConstantState constantState = h10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.n(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (m0.class) {
            c cVar = f945j;
            k10 = cVar.k(i10, mode);
            if (k10 == null) {
                k10 = new PorterDuffColorFilter(i10, mode);
                cVar.l(i10, mode, k10);
            }
        }
        return k10;
    }

    private ColorStateList n(Context context, int i10) {
        m.h<ColorStateList> hVar;
        WeakHashMap<Context, m.h<ColorStateList>> weakHashMap = this.f946a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.h(i10);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new f());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i10) {
        int next;
        m.g<String, d> gVar = this.f947b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        m.h<String> hVar = this.f948c;
        if (hVar != null) {
            String h10 = hVar.h(i10);
            if ("appcompat_skip_skip".equals(h10) || (h10 != null && this.f947b.get(h10) == null)) {
                return null;
            }
        } else {
            this.f948c = new m.h<>();
        }
        if (this.f950e == null) {
            this.f950e = new TypedValue();
        }
        TypedValue typedValue = this.f950e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f948c.c(i10, name);
                d dVar = this.f947b.get(name);
                if (dVar != null) {
                    i11 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i11 != null) {
                    i11.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e10, i11);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (i11 == null) {
            this.f948c.c(i10, "appcompat_skip_skip");
        }
        return i11;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 == null) {
            e eVar = this.f952g;
            if ((eVar == null || !eVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (e0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable p10 = androidx.core.graphics.drawable.a.p(drawable);
        androidx.core.graphics.drawable.a.n(p10, m10);
        PorterDuff.Mode o10 = o(i10);
        if (o10 != null) {
            androidx.core.graphics.drawable.a.o(p10, o10);
            return p10;
        }
        return p10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = u0Var.f1025d;
        if (z10 || u0Var.f1024c) {
            drawable.setColorFilter(g(z10 ? u0Var.f1022a : null, u0Var.f1024c ? u0Var.f1023b : f943h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.f(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            e0.b(r10);
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            e eVar = this.f952g;
            n10 = eVar == null ? null : eVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    PorterDuff.Mode o(int i10) {
        e eVar = this.f952g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i10);
    }

    public synchronized void s(Context context) {
        m.d<WeakReference<Drawable.ConstantState>> dVar = this.f949d.get(context);
        if (dVar != null) {
            dVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, b1 b1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = b1Var.c(i10);
        }
        if (r10 != null) {
            return v(context, i10, false, r10);
        }
        return null;
    }

    public synchronized void u(e eVar) {
        this.f952g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        e eVar = this.f952g;
        return eVar != null && eVar.a(context, i10, drawable);
    }
}
