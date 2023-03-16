package f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: n  reason: collision with root package name */
    private c f6815n;

    /* renamed from: o  reason: collision with root package name */
    private Rect f6816o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f6817p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f6818q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6820s;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6822u;

    /* renamed from: v  reason: collision with root package name */
    private Runnable f6823v;

    /* renamed from: w  reason: collision with root package name */
    private long f6824w;

    /* renamed from: x  reason: collision with root package name */
    private long f6825x;

    /* renamed from: y  reason: collision with root package name */
    private C0101b f6826y;

    /* renamed from: r  reason: collision with root package name */
    private int f6819r = 255;

    /* renamed from: t  reason: collision with root package name */
    private int f6821t = -1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0101b implements Drawable.Callback {

        /* renamed from: n  reason: collision with root package name */
        private Drawable.Callback f6828n;

        C0101b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f6828n;
            this.f6828n = null;
            return callback;
        }

        public C0101b b(Drawable.Callback callback) {
            this.f6828n = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f6828n;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f6828n;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f6829a;

        /* renamed from: b  reason: collision with root package name */
        Resources f6830b;

        /* renamed from: c  reason: collision with root package name */
        int f6831c;

        /* renamed from: d  reason: collision with root package name */
        int f6832d;

        /* renamed from: e  reason: collision with root package name */
        int f6833e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f6834f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f6835g;

        /* renamed from: h  reason: collision with root package name */
        int f6836h;

        /* renamed from: i  reason: collision with root package name */
        boolean f6837i;

        /* renamed from: j  reason: collision with root package name */
        boolean f6838j;

        /* renamed from: k  reason: collision with root package name */
        Rect f6839k;

        /* renamed from: l  reason: collision with root package name */
        boolean f6840l;

        /* renamed from: m  reason: collision with root package name */
        boolean f6841m;

        /* renamed from: n  reason: collision with root package name */
        int f6842n;

        /* renamed from: o  reason: collision with root package name */
        int f6843o;

        /* renamed from: p  reason: collision with root package name */
        int f6844p;

        /* renamed from: q  reason: collision with root package name */
        int f6845q;

        /* renamed from: r  reason: collision with root package name */
        boolean f6846r;

        /* renamed from: s  reason: collision with root package name */
        int f6847s;

        /* renamed from: t  reason: collision with root package name */
        boolean f6848t;

        /* renamed from: u  reason: collision with root package name */
        boolean f6849u;

        /* renamed from: v  reason: collision with root package name */
        boolean f6850v;

        /* renamed from: w  reason: collision with root package name */
        boolean f6851w;

        /* renamed from: x  reason: collision with root package name */
        boolean f6852x;

        /* renamed from: y  reason: collision with root package name */
        boolean f6853y;

        /* renamed from: z  reason: collision with root package name */
        int f6854z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(c cVar, b bVar, Resources resources) {
            this.f6831c = 160;
            this.f6837i = false;
            this.f6840l = false;
            this.f6852x = true;
            this.A = 0;
            this.B = 0;
            this.f6829a = bVar;
            this.f6830b = resources != null ? resources : cVar != null ? cVar.f6830b : null;
            int f10 = b.f(resources, cVar != null ? cVar.f6831c : 0);
            this.f6831c = f10;
            if (cVar == null) {
                this.f6835g = new Drawable[10];
                this.f6836h = 0;
                return;
            }
            this.f6832d = cVar.f6832d;
            this.f6833e = cVar.f6833e;
            this.f6850v = true;
            this.f6851w = true;
            this.f6837i = cVar.f6837i;
            this.f6840l = cVar.f6840l;
            this.f6852x = cVar.f6852x;
            this.f6853y = cVar.f6853y;
            this.f6854z = cVar.f6854z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f6831c == f10) {
                if (cVar.f6838j) {
                    this.f6839k = new Rect(cVar.f6839k);
                    this.f6838j = true;
                }
                if (cVar.f6841m) {
                    this.f6842n = cVar.f6842n;
                    this.f6843o = cVar.f6843o;
                    this.f6844p = cVar.f6844p;
                    this.f6845q = cVar.f6845q;
                    this.f6841m = true;
                }
            }
            if (cVar.f6846r) {
                this.f6847s = cVar.f6847s;
                this.f6846r = true;
            }
            if (cVar.f6848t) {
                this.f6849u = cVar.f6849u;
                this.f6848t = true;
            }
            Drawable[] drawableArr = cVar.f6835g;
            this.f6835g = new Drawable[drawableArr.length];
            this.f6836h = cVar.f6836h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f6834f;
            this.f6834f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f6836h);
            int i10 = this.f6836h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null) {
                    Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                    if (constantState != null) {
                        this.f6834f.put(i11, constantState);
                    } else {
                        this.f6835g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f6834f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f6835g[this.f6834f.keyAt(i10)] = s(this.f6834f.valueAt(i10).newDrawable(this.f6830b));
                }
                this.f6834f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f6854z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f6829a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f6836h;
            if (i10 >= this.f6835g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f6829a);
            this.f6835g[i10] = drawable;
            this.f6836h++;
            this.f6833e = drawable.getChangingConfigurations() | this.f6833e;
            p();
            this.f6839k = null;
            this.f6838j = false;
            this.f6841m = false;
            this.f6850v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f6836h;
                Drawable[] drawableArr = this.f6835g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && drawableArr[i11].canApplyTheme()) {
                        drawableArr[i11].applyTheme(theme);
                        this.f6833e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f6850v) {
                return this.f6851w;
            }
            e();
            this.f6850v = true;
            int i10 = this.f6836h;
            Drawable[] drawableArr = this.f6835g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f6851w = false;
                    return false;
                }
            }
            this.f6851w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f6836h;
            Drawable[] drawableArr = this.f6835g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f6834f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f6841m = true;
            e();
            int i10 = this.f6836h;
            Drawable[] drawableArr = this.f6835g;
            this.f6843o = -1;
            this.f6842n = -1;
            this.f6845q = 0;
            this.f6844p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f6842n) {
                    this.f6842n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f6843o) {
                    this.f6843o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f6844p) {
                    this.f6844p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f6845q) {
                    this.f6845q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f6835g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f6835g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f6834f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f6834f.valueAt(indexOfKey).newDrawable(this.f6830b));
            this.f6835g[i10] = s10;
            this.f6834f.removeAt(indexOfKey);
            if (this.f6834f.size() == 0) {
                this.f6834f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6832d | this.f6833e;
        }

        public final int h() {
            return this.f6836h;
        }

        public final int i() {
            if (!this.f6841m) {
                d();
            }
            return this.f6843o;
        }

        public final int j() {
            if (!this.f6841m) {
                d();
            }
            return this.f6845q;
        }

        public final int k() {
            if (!this.f6841m) {
                d();
            }
            return this.f6844p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f6837i) {
                return null;
            }
            Rect rect2 = this.f6839k;
            if (rect2 != null || this.f6838j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f6836h;
            Drawable[] drawableArr = this.f6835g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f6838j = true;
            this.f6839k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f6841m) {
                d();
            }
            return this.f6842n;
        }

        public final int n() {
            if (this.f6846r) {
                return this.f6847s;
            }
            e();
            int i10 = this.f6836h;
            Drawable[] drawableArr = this.f6835g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f6847s = opacity;
            this.f6846r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            System.arraycopy(this.f6835g, 0, drawableArr, 0, i10);
            this.f6835g = drawableArr;
        }

        void p() {
            this.f6846r = false;
            this.f6848t = false;
        }

        public final boolean q() {
            return this.f6840l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f6840l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f6836h;
            Drawable[] drawableArr = this.f6835g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i13].setLayoutDirection(i10) : false;
                    if (i13 == i11) {
                        z10 = layoutDirection;
                    }
                }
            }
            this.f6854z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f6837i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f6830b = resources;
                int f10 = b.f(resources, this.f6831c);
                int i10 = this.f6831c;
                this.f6831c = f10;
                if (i10 != f10) {
                    this.f6841m = false;
                    this.f6838j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f6826y == null) {
            this.f6826y = new C0101b();
        }
        drawable.setCallback(this.f6826y.b(drawable.getCallback()));
        try {
            if (this.f6815n.A <= 0 && this.f6820s) {
                drawable.setAlpha(this.f6819r);
            }
            c cVar = this.f6815n;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    androidx.core.graphics.drawable.a.n(drawable, cVar.F);
                }
                c cVar2 = this.f6815n;
                if (cVar2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f6815n.f6852x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i10 >= 19) {
                drawable.setAutoMirrored(this.f6815n.C);
            }
            Rect rect = this.f6816o;
            if (i10 >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f6826y.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f6820s = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f6817p
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.f6824w
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f6819r
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            f.b$c r10 = r13.f6815n
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f6819r
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.f6824w = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.f6818q
            if (r9 == 0) goto L5d
            long r10 = r13.f6825x
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f6818q = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.b$c r4 = r13.f6815n
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f6819r
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.f6825x = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            java.lang.Runnable r14 = r13.f6823v
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f6815n.b(theme);
    }

    c b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f6821t;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f6815n.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f6818q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f6821t
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.b$c r0 = r9.f6815n
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f6818q
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f6817p
            if (r0 == 0) goto L29
            r9.f6818q = r0
            f.b$c r0 = r9.f6815n
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f6825x = r0
            goto L35
        L29:
            r9.f6818q = r4
            r9.f6825x = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f6817p
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            f.b$c r0 = r9.f6815n
            int r1 = r0.f6836h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f6817p = r0
            r9.f6821t = r10
            if (r0 == 0) goto L5a
            f.b$c r10 = r9.f6815n
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f6824w = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f6817p = r4
            r10 = -1
            r9.f6821t = r10
        L5a:
            long r0 = r9.f6824w
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f6825x
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f6823v
            if (r10 != 0) goto L73
            f.b$a r10 = new f.b$a
            r10.<init>()
            r9.f6823v = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6819r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f6815n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f6815n.c()) {
            this.f6815n.f6832d = getChangingConfigurations();
            return this.f6815n;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f6817p;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f6816o;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f6815n.q()) {
            return this.f6815n.i();
        }
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f6815n.q()) {
            return this.f6815n.m();
        }
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f6815n.q()) {
            return this.f6815n.j();
        }
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f6815n.q()) {
            return this.f6815n.k();
        }
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6817p;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f6815n.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l10 = this.f6815n.l();
        if (l10 != null) {
            rect.set(l10);
            padding = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f6817p;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(c cVar) {
        this.f6815n = cVar;
        int i10 = this.f6821t;
        if (i10 >= 0) {
            Drawable g10 = cVar.g(i10);
            this.f6817p = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f6818q = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f6815n.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f6815n;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable != this.f6817p || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f6815n.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f6818q;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f6818q = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f6817p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f6820s) {
                this.f6817p.setAlpha(this.f6819r);
            }
        }
        if (this.f6825x != 0) {
            this.f6825x = 0L;
            z10 = true;
        }
        if (this.f6824w != 0) {
            this.f6824w = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6822u && super.mutate() == this) {
            c b10 = b();
            b10.r();
            h(b10);
            this.f6822u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6818q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f6817p;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f6815n.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f6818q;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f6817p;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6818q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f6817p;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f6817p || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f6820s && this.f6819r == i10) {
            return;
        }
        this.f6820s = true;
        this.f6819r = i10;
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            if (this.f6824w == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        c cVar = this.f6815n;
        if (cVar.C != z10) {
            cVar.C = z10;
            Drawable drawable = this.f6817p;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f6815n;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f6817p;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        c cVar = this.f6815n;
        if (cVar.f6852x != z10) {
            cVar.f6852x = z10;
            Drawable drawable = this.f6817p;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f6816o;
        if (rect == null) {
            this.f6816o = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f6817p;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f6815n;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f6817p, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f6815n;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.o(this.f6817p, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f6818q;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f6817p;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f6817p || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
