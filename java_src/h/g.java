package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import c.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f7594e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f7595f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f7596a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f7597b;

    /* renamed from: c  reason: collision with root package name */
    Context f7598c;

    /* renamed from: d  reason: collision with root package name */
    private Object f7599d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f7600c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f7601a;

        /* renamed from: b  reason: collision with root package name */
        private Method f7602b;

        public a(Object obj, String str) {
            this.f7601a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f7602b = cls.getMethod(str, f7600c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f7602b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f7602b.invoke(this.f7601a, menuItem)).booleanValue();
                }
                this.f7602b.invoke(this.f7601a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f7603a;

        /* renamed from: b  reason: collision with root package name */
        private int f7604b;

        /* renamed from: c  reason: collision with root package name */
        private int f7605c;

        /* renamed from: d  reason: collision with root package name */
        private int f7606d;

        /* renamed from: e  reason: collision with root package name */
        private int f7607e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f7608f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f7609g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f7610h;

        /* renamed from: i  reason: collision with root package name */
        private int f7611i;

        /* renamed from: j  reason: collision with root package name */
        private int f7612j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f7613k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f7614l;

        /* renamed from: m  reason: collision with root package name */
        private int f7615m;

        /* renamed from: n  reason: collision with root package name */
        private char f7616n;

        /* renamed from: o  reason: collision with root package name */
        private int f7617o;

        /* renamed from: p  reason: collision with root package name */
        private char f7618p;

        /* renamed from: q  reason: collision with root package name */
        private int f7619q;

        /* renamed from: r  reason: collision with root package name */
        private int f7620r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f7621s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f7622t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f7623u;

        /* renamed from: v  reason: collision with root package name */
        private int f7624v;

        /* renamed from: w  reason: collision with root package name */
        private int f7625w;

        /* renamed from: x  reason: collision with root package name */
        private String f7626x;

        /* renamed from: y  reason: collision with root package name */
        private String f7627y;

        /* renamed from: z  reason: collision with root package name */
        private String f7628z;

        public b(Menu menu) {
            this.f7603a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f7598c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f7621s).setVisible(this.f7622t).setEnabled(this.f7623u).setCheckable(this.f7620r >= 1).setTitleCondensed(this.f7614l).setIcon(this.f7615m);
            int i10 = this.f7624v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f7628z != null) {
                if (g.this.f7598c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f7628z));
            }
            if (this.f7620r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof i.c) {
                    ((i.c) menuItem).h(true);
                }
            }
            String str = this.f7626x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f7594e, g.this.f7596a));
                z10 = true;
            }
            int i11 = this.f7625w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                androidx.core.view.h.a(menuItem, bVar);
            }
            androidx.core.view.h.c(menuItem, this.B);
            androidx.core.view.h.g(menuItem, this.C);
            androidx.core.view.h.b(menuItem, this.f7616n, this.f7617o);
            androidx.core.view.h.f(menuItem, this.f7618p, this.f7619q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                androidx.core.view.h.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                androidx.core.view.h.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f7610h = true;
            i(this.f7603a.add(this.f7604b, this.f7611i, this.f7612j, this.f7613k));
        }

        public SubMenu b() {
            this.f7610h = true;
            SubMenu addSubMenu = this.f7603a.addSubMenu(this.f7604b, this.f7611i, this.f7612j, this.f7613k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f7610h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f7598c.obtainStyledAttributes(attributeSet, j.f3059r1);
            this.f7604b = obtainStyledAttributes.getResourceId(j.f3069t1, 0);
            this.f7605c = obtainStyledAttributes.getInt(j.f3079v1, 0);
            this.f7606d = obtainStyledAttributes.getInt(j.f3084w1, 0);
            this.f7607e = obtainStyledAttributes.getInt(j.f3089x1, 0);
            this.f7608f = obtainStyledAttributes.getBoolean(j.f3074u1, true);
            this.f7609g = obtainStyledAttributes.getBoolean(j.f3064s1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            w0 t10 = w0.t(g.this.f7598c, attributeSet, j.f3094y1);
            this.f7611i = t10.m(j.B1, 0);
            this.f7612j = (t10.j(j.E1, this.f7605c) & (-65536)) | (t10.j(j.F1, this.f7606d) & 65535);
            this.f7613k = t10.o(j.G1);
            this.f7614l = t10.o(j.H1);
            this.f7615m = t10.m(j.f3099z1, 0);
            this.f7616n = c(t10.n(j.I1));
            this.f7617o = t10.j(j.P1, 4096);
            this.f7618p = c(t10.n(j.J1));
            this.f7619q = t10.j(j.T1, 4096);
            int i10 = j.K1;
            this.f7620r = t10.r(i10) ? t10.a(i10, false) : this.f7607e;
            this.f7621s = t10.a(j.C1, false);
            this.f7622t = t10.a(j.D1, this.f7608f);
            this.f7623u = t10.a(j.A1, this.f7609g);
            this.f7624v = t10.j(j.U1, -1);
            this.f7628z = t10.n(j.L1);
            this.f7625w = t10.m(j.M1, 0);
            this.f7626x = t10.n(j.O1);
            String n10 = t10.n(j.N1);
            this.f7627y = n10;
            boolean z10 = n10 != null;
            if (z10 && this.f7625w == 0 && this.f7626x == null) {
                this.A = (androidx.core.view.b) e(n10, g.f7595f, g.this.f7597b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t10.o(j.Q1);
            this.C = t10.o(j.V1);
            int i11 = j.S1;
            if (t10.r(i11)) {
                this.E = e0.d(t10.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.R1;
            if (t10.r(i12)) {
                this.D = t10.c(i12);
            } else {
                this.D = null;
            }
            t10.v();
            this.f7610h = false;
        }

        public void h() {
            this.f7604b = 0;
            this.f7605c = 0;
            this.f7606d = 0;
            this.f7607e = 0;
            this.f7608f = true;
            this.f7609g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f7594e = clsArr;
        f7595f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f7598c = context;
        Object[] objArr = {context};
        this.f7596a = objArr;
        this.f7597b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            h.g$b r0 = new h.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = r5
            r7 = r6
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f7599d == null) {
            this.f7599d = a(this.f7598c);
        }
        return this.f7599d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof o.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f7598c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
