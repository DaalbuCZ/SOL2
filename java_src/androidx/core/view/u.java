package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.e0;
import androidx.core.view.u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class u {

    /* renamed from: b  reason: collision with root package name */
    private static Field f1666b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1667c;

    /* renamed from: d  reason: collision with root package name */
    private static WeakHashMap<View, String> f1668d;

    /* renamed from: f  reason: collision with root package name */
    private static Field f1670f;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f1665a = new AtomicInteger(1);

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<View, a0> f1669e = null;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f1671g = false;

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f1672h = {n.e.accessibility_custom_action_0, n.e.accessibility_custom_action_1, n.e.accessibility_custom_action_2, n.e.accessibility_custom_action_3, n.e.accessibility_custom_action_4, n.e.accessibility_custom_action_5, n.e.accessibility_custom_action_6, n.e.accessibility_custom_action_7, n.e.accessibility_custom_action_8, n.e.accessibility_custom_action_9, n.e.accessibility_custom_action_10, n.e.accessibility_custom_action_11, n.e.accessibility_custom_action_12, n.e.accessibility_custom_action_13, n.e.accessibility_custom_action_14, n.e.accessibility_custom_action_15, n.e.accessibility_custom_action_16, n.e.accessibility_custom_action_17, n.e.accessibility_custom_action_18, n.e.accessibility_custom_action_19, n.e.accessibility_custom_action_20, n.e.accessibility_custom_action_21, n.e.accessibility_custom_action_22, n.e.accessibility_custom_action_23, n.e.accessibility_custom_action_24, n.e.accessibility_custom_action_25, n.e.accessibility_custom_action_26, n.e.accessibility_custom_action_27, n.e.accessibility_custom_action_28, n.e.accessibility_custom_action_29, n.e.accessibility_custom_action_30, n.e.accessibility_custom_action_31};

    /* renamed from: i  reason: collision with root package name */
    private static final androidx.core.view.q f1673i = t.f1664a;

    /* renamed from: j  reason: collision with root package name */
    private static final e f1674j = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.f
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(n.d(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.f
        /* renamed from: e */
        public CharSequence c(View view) {
            return n.b(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.f
        /* renamed from: e */
        public CharSequence c(View view) {
            return p.a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u.f
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(n.c(view));
        }
    }

    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: n  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f1675n = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                u.y(view, z11 ? 16 : 32);
                this.f1675n.put(view, Boolean.valueOf(z11));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f1675n.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f1676a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f1677b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1678c;

        /* renamed from: d  reason: collision with root package name */
        private final int f1679d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f1676a = i10;
            this.f1677b = cls;
            this.f1679d = i11;
            this.f1678c = i12;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f1678c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (a()) {
                T t10 = (T) view.getTag(this.f1676a);
                if (this.f1677b.isInstance(t10)) {
                    return t10;
                }
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* loaded from: classes.dex */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    private static class l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            e0 f1680a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f1681b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.core.view.p f1682c;

            a(View view, androidx.core.view.p pVar) {
                this.f1681b = view;
                this.f1682c = pVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                e0 u10 = e0.u(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    l.a(windowInsets, this.f1681b);
                    if (u10.equals(this.f1680a)) {
                        return this.f1682c.a(view, u10).s();
                    }
                }
                this.f1680a = u10;
                e0 a10 = this.f1682c.a(view, u10);
                if (i10 >= 30) {
                    return a10.s();
                }
                u.E(view);
                return a10.s();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(n.e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static e0 b(View view, e0 e0Var, Rect rect) {
            WindowInsets s10 = e0Var.s();
            if (s10 != null) {
                return e0.u(view.computeSystemWindowInsets(s10, rect), view);
            }
            rect.setEmpty();
            return e0Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static e0 j(View view) {
            return e0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, androidx.core.view.p pVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(n.e.tag_on_apply_window_listener, pVar);
            }
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(n.e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, pVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    private static class m {
        public static e0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            e0 t10 = e0.t(rootWindowInsets);
            t10.q(t10);
            t10.d(view.getRootView());
            return t10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class n {
        static void a(View view, final q qVar) {
            int i10 = n.e.tag_unhandled_key_listeners;
            m.g gVar = (m.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new m.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.v
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return u.q.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            m.g gVar = (m.g) view.getTag(n.e.tag_unhandled_key_listeners);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class p {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    static class r {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f1683d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1684a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1685b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f1686c = null;

        r() {
        }

        static r a(View view) {
            int i10 = n.e.tag_unhandled_key_event_manager;
            r rVar = (r) view.getTag(i10);
            if (rVar == null) {
                r rVar2 = new r();
                view.setTag(i10, rVar2);
                return rVar2;
            }
            return rVar;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1684a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f1685b == null) {
                this.f1685b = new SparseArray<>();
            }
            return this.f1685b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(n.e.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1684a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f1683d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f1684a == null) {
                    this.f1684a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f1683d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f1684a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f1684a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            return c10 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1686c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f1686c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d10 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d10.valueAt(indexOfKey);
                    d10.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d10.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && u.v(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    private static f<CharSequence> A() {
        return new b(n.e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    public static void C(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void D(View view, Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j10);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j10);
        }
    }

    public static void E(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            k.c(view);
        } else if (i10 >= 16) {
            h.p(view);
        }
    }

    public static void F(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static f<Boolean> G() {
        return new a(n.e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void H(View view, androidx.core.view.a aVar) {
        if (aVar == null && (g(view) instanceof a.C0032a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void I(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void J(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            if (view instanceof s) {
                ((s) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        l.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void K(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            if (view instanceof s) {
                ((s) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        l.r(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void L(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.s(view, f10);
        }
    }

    public static void M(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 19) {
            if (i11 < 16) {
                return;
            }
            if (i10 == 4) {
                i10 = 2;
            }
        }
        h.s(view, i10);
    }

    public static void N(View view, androidx.core.view.p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.u(view, pVar);
        }
    }

    public static void O(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.d(view, i10, i11);
        }
    }

    public static void P(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.v(view, str);
            return;
        }
        if (f1668d == null) {
            f1668d = new WeakHashMap<>();
        }
        f1668d.put(view, str);
    }

    private static void Q(View view) {
        if (m(view) == 0) {
            M(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m((View) parent) == 4) {
                M(view, 2);
                return;
            }
        }
    }

    private static f<CharSequence> R() {
        return new c(n.e.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void S(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            l.z(view);
        } else if (view instanceof androidx.core.view.j) {
            ((androidx.core.view.j) view).stopNestedScroll();
        }
    }

    private static f<Boolean> a() {
        return new d(n.e.tag_accessibility_heading, Boolean.class, 28);
    }

    public static a0 b(View view) {
        if (f1669e == null) {
            f1669e = new WeakHashMap<>();
        }
        a0 a0Var = f1669e.get(view);
        if (a0Var == null) {
            a0 a0Var2 = new a0(view);
            f1669e.put(view, a0Var2);
            return a0Var2;
        }
        return a0Var;
    }

    public static e0 c(View view, e0 e0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? l.b(view, e0Var, rect) : e0Var;
    }

    public static e0 d(View view, e0 e0Var) {
        WindowInsets s10;
        if (Build.VERSION.SDK_INT >= 21 && (s10 = e0Var.s()) != null) {
            WindowInsets a10 = k.a(view, s10);
            if (!a10.equals(s10)) {
                return e0.u(a10, view);
            }
        }
        return e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    private static View.AccessibilityDelegate g(View view) {
        return Build.VERSION.SDK_INT >= 29 ? o.a(view) : h(view);
    }

    private static View.AccessibilityDelegate h(View view) {
        if (f1671g) {
            return null;
        }
        if (f1670f == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1670f = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1671g = true;
                return null;
            }
        }
        try {
            Object obj = f1670f.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1671g = true;
            return null;
        }
    }

    public static int i(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return j.a(view);
        }
        return 0;
    }

    public static CharSequence j(View view) {
        return A().d(view);
    }

    public static ColorStateList k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return l.g(view);
        }
        if (view instanceof s) {
            return ((s) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static PorterDuff.Mode l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return l.h(view);
        }
        if (view instanceof s) {
            return ((s) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static int m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    public static int n(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!f1667c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f1666b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1667c = true;
        }
        Field field = f1666b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static e0 p(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return m.a(view);
        }
        if (i10 >= 21) {
            return l.j(view);
        }
        return null;
    }

    public static CharSequence q(View view) {
        return R().d(view);
    }

    public static String r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return l.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f1668d;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    public static boolean t(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static boolean u(View view) {
        Boolean d10 = a().d(view);
        return d10 != null && d10.booleanValue();
    }

    public static boolean v(View view) {
        return Build.VERSION.SDK_INT >= 19 ? j.b(view) : view.getWindowToken() != null;
    }

    public static boolean w(View view) {
        return Build.VERSION.SDK_INT >= 19 ? j.c(view) : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean x(View view) {
        Boolean d10 = G().d(view);
        return d10 != null && d10.booleanValue();
    }

    static void y(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = j(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (i(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                j.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(j(view));
                    Q(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                j.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(j(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    j.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static e0 z(View view, e0 e0Var) {
        WindowInsets s10;
        if (Build.VERSION.SDK_INT >= 21 && (s10 = e0Var.s()) != null) {
            WindowInsets b10 = k.b(view, s10);
            if (!b10.equals(s10)) {
                return e0.u(b10, view);
            }
        }
        return e0Var;
    }
}
