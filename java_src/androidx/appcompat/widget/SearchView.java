package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends i0 implements h.c {
    static final n D0;
    private final AdapterView.OnItemClickListener A0;
    private final AdapterView.OnItemSelectedListener B0;
    final SearchAutoComplete C;
    private TextWatcher C0;
    private final View D;
    private final View E;
    private final View F;
    final ImageView G;
    final ImageView H;
    final ImageView I;
    final ImageView J;
    private final View K;
    private p L;
    private Rect M;
    private Rect N;
    private int[] O;
    private int[] P;
    private final ImageView Q;
    private final Drawable R;
    private final int S;
    private final int T;
    private final Intent U;
    private final Intent V;
    private final CharSequence W;

    /* renamed from: a0  reason: collision with root package name */
    private l f710a0;

    /* renamed from: b0  reason: collision with root package name */
    private k f711b0;

    /* renamed from: c0  reason: collision with root package name */
    View.OnFocusChangeListener f712c0;

    /* renamed from: d0  reason: collision with root package name */
    private m f713d0;

    /* renamed from: e0  reason: collision with root package name */
    private View.OnClickListener f714e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f715f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f716g0;

    /* renamed from: h0  reason: collision with root package name */
    r.a f717h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f718i0;

    /* renamed from: j0  reason: collision with root package name */
    private CharSequence f719j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f720k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f721l0;

    /* renamed from: m0  reason: collision with root package name */
    private int f722m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f723n0;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f724o0;

    /* renamed from: p0  reason: collision with root package name */
    private CharSequence f725p0;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f726q0;

    /* renamed from: r0  reason: collision with root package name */
    private int f727r0;

    /* renamed from: s0  reason: collision with root package name */
    SearchableInfo f728s0;

    /* renamed from: t0  reason: collision with root package name */
    private Bundle f729t0;

    /* renamed from: u0  reason: collision with root package name */
    private final Runnable f730u0;

    /* renamed from: v0  reason: collision with root package name */
    private Runnable f731v0;

    /* renamed from: w0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f732w0;

    /* renamed from: x0  reason: collision with root package name */
    private final View.OnClickListener f733x0;

    /* renamed from: y0  reason: collision with root package name */
    View.OnKeyListener f734y0;

    /* renamed from: z0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f735z0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: q  reason: collision with root package name */
        private int f736q;

        /* renamed from: r  reason: collision with root package name */
        private SearchView f737r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f738s;

        /* renamed from: t  reason: collision with root package name */
        final Runnable f739t;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, c.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f739t = new a();
            this.f736q = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 < 600) {
                    return (i10 < 640 || i11 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.D0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.f738s) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f738s = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f736q <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f738s) {
                removeCallbacks(this.f739t);
                post(this.f739t);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f737r.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f737r.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f737r.hasFocus() && getVisibility() == 0) {
                this.f738s = true;
                if (SearchView.K(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f738s = false;
                removeCallbacks(this.f739t);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f738s = true;
            } else {
                this.f738s = false;
                removeCallbacks(this.f739t);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f737r = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f736q = i10;
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.a aVar = SearchView.this.f717h0;
            if (aVar instanceof q0) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f712c0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.G) {
                searchView.T();
            } else if (view == searchView.I) {
                searchView.P();
            } else if (view == searchView.H) {
                searchView.U();
            } else if (view == searchView.J) {
                searchView.Y();
            } else if (view == searchView.C) {
                searchView.F();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f728s0 == null) {
                return false;
            }
            if (!searchView.C.isPopupShowing() || SearchView.this.C.getListSelection() == -1) {
                if (!SearchView.this.C.b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i10 == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.N(0, null, searchView2.C.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.V(view, i10, keyEvent);
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i10);

        boolean b(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        private Method f751a;

        /* renamed from: b  reason: collision with root package name */
        private Method f752b;

        /* renamed from: c  reason: collision with root package name */
        private Method f753c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.f751a = null;
            this.f752b = null;
            this.f753c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f751a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f752b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f753c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f752b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f751a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f753c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o extends s.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        boolean f754p;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public o[] newArray(int i10) {
                return new o[i10];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f754p = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f754p + "}";
        }

        @Override // s.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f754p));
        }
    }

    /* loaded from: classes.dex */
    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f755a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f756b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f757c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f758d;

        /* renamed from: e  reason: collision with root package name */
        private final int f759e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f760f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f759e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f756b = new Rect();
            this.f758d = new Rect();
            this.f757c = new Rect();
            a(rect, rect2);
            this.f755a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f756b.set(rect);
            this.f758d.set(rect);
            Rect rect3 = this.f758d;
            int i10 = this.f759e;
            rect3.inset(-i10, -i10);
            this.f757c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f760f;
                    if (z11 && !this.f758d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f760f;
                        this.f760f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f756b.contains(x10, y10)) {
                    this.f760f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (!z10 || this.f757c.contains(x10, y10)) {
                    Rect rect = this.f757c;
                    f10 = x10 - rect.left;
                    i10 = y10 - rect.top;
                } else {
                    f10 = this.f755a.getWidth() / 2;
                    i10 = this.f755a.getHeight() / 2;
                }
                motionEvent.setLocation(f10, i10);
                return this.f755a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        D0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = new Rect();
        this.N = new Rect();
        this.O = new int[2];
        this.P = new int[2];
        this.f730u0 = new b();
        this.f731v0 = new c();
        this.f732w0 = new WeakHashMap<>();
        f fVar = new f();
        this.f733x0 = fVar;
        this.f734y0 = new g();
        h hVar = new h();
        this.f735z0 = hVar;
        i iVar = new i();
        this.A0 = iVar;
        j jVar = new j();
        this.B0 = jVar;
        this.C0 = new a();
        w0 u10 = w0.u(context, attributeSet, c.j.f3015i2, i10, 0);
        LayoutInflater.from(context).inflate(u10.m(c.j.f3065s2, c.g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(c.f.search_src_text);
        this.C = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.D = findViewById(c.f.search_edit_frame);
        View findViewById = findViewById(c.f.search_plate);
        this.E = findViewById;
        View findViewById2 = findViewById(c.f.submit_area);
        this.F = findViewById2;
        ImageView imageView = (ImageView) findViewById(c.f.search_button);
        this.G = imageView;
        ImageView imageView2 = (ImageView) findViewById(c.f.search_go_btn);
        this.H = imageView2;
        ImageView imageView3 = (ImageView) findViewById(c.f.search_close_btn);
        this.I = imageView3;
        ImageView imageView4 = (ImageView) findViewById(c.f.search_voice_btn);
        this.J = imageView4;
        ImageView imageView5 = (ImageView) findViewById(c.f.search_mag_icon);
        this.Q = imageView5;
        androidx.core.view.u.I(findViewById, u10.f(c.j.f3070t2));
        androidx.core.view.u.I(findViewById2, u10.f(c.j.f3090x2));
        int i11 = c.j.f3085w2;
        imageView.setImageDrawable(u10.f(i11));
        imageView2.setImageDrawable(u10.f(c.j.f3055q2));
        imageView3.setImageDrawable(u10.f(c.j.f3040n2));
        imageView4.setImageDrawable(u10.f(c.j.f3100z2));
        imageView5.setImageDrawable(u10.f(i11));
        this.R = u10.f(c.j.f3080v2);
        y0.a(imageView, getResources().getString(c.h.abc_searchview_description_search));
        this.S = u10.m(c.j.f3095y2, c.g.abc_search_dropdown_item_icons_2line);
        this.T = u10.m(c.j.f3045o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.C0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f734y0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u10.a(c.j.f3060r2, true));
        int e10 = u10.e(c.j.f3025k2, -1);
        if (e10 != -1) {
            setMaxWidth(e10);
        }
        this.W = u10.o(c.j.f3050p2);
        this.f719j0 = u10.o(c.j.f3075u2);
        int j10 = u10.j(c.j.f3035m2, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = u10.j(c.j.f3030l2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(u10.a(c.j.f3020j2, true));
        u10.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.U = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.V = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.K = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.f715f0);
        e0();
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f725p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f729t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f728s0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = q0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f728s0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = q0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f728s0.getSuggestIntentData();
            }
            if (o12 != null && (o10 = q0.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return A(str2, o12 == null ? null : Uri.parse(o12), q0.o(cursor, "suggest_intent_extra_data"), q0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f729t0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.C.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.O);
        getLocationInWindow(this.P);
        int[] iArr = this.O;
        int i10 = iArr[1];
        int[] iArr2 = this.P;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.f715f0 || this.R == null) {
            return charSequence;
        }
        int textSize = (int) (this.C.getTextSize() * 1.25d);
        this.R.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.R), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.f728s0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f728s0.getVoiceSearchLaunchWebSearch()) {
            intent = this.U;
        } else if (this.f728s0.getVoiceSearchLaunchRecognizer()) {
            intent = this.V;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.f718i0 || this.f723n0) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor b10 = this.f717h0.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        M(B(b10, i11, str));
        return true;
    }

    private void Z() {
        post(this.f730u0);
    }

    private void a0(int i10) {
        CharSequence c10;
        Editable text = this.C.getText();
        Cursor b10 = this.f717h0.b();
        if (b10 == null) {
            return;
        }
        if (!b10.moveToPosition(i10) || (c10 = this.f717h0.c(b10)) == null) {
            setQuery(text);
        } else {
            setQuery(c10);
        }
    }

    private void c0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.C.getText());
        if (!z11 && (!this.f715f0 || this.f726q0)) {
            z10 = false;
        }
        this.I.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.I.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.C;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.C.setThreshold(this.f728s0.getSuggestThreshold());
        this.C.setImeOptions(this.f728s0.getImeOptions());
        int inputType = this.f728s0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f728s0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.C.setInputType(inputType);
        r.a aVar = this.f717h0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f728s0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.f728s0, this.f732w0);
            this.f717h0 = q0Var;
            this.C.setAdapter(q0Var);
            ((q0) this.f717h0).x(this.f720k0 ? 2 : 1);
        }
    }

    private void g0() {
        this.F.setVisibility((L() && (this.H.getVisibility() == 0 || this.J.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(c.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(c.d.abc_search_view_preferred_width);
    }

    private void h0(boolean z10) {
        this.H.setVisibility((this.f718i0 && L() && hasFocus() && (z10 || !this.f723n0)) ? 0 : 8);
    }

    private void i0(boolean z10) {
        this.f716g0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.C.getText());
        this.G.setVisibility(i11);
        h0(z11);
        this.D.setVisibility(z10 ? 8 : 0);
        if (this.Q.getDrawable() == null || this.f715f0) {
            i10 = 8;
        }
        this.Q.setVisibility(i10);
        c0();
        j0(!z11);
        g0();
    }

    private void j0(boolean z10) {
        int i10 = 8;
        if (this.f723n0 && !J() && z10) {
            this.H.setVisibility(8);
            i10 = 0;
        }
        this.J.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.C.setText(charSequence);
        this.C.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.C.refreshAutoCompleteResults();
            return;
        }
        n nVar = D0;
        nVar.b(this.C);
        nVar.a(this.C);
    }

    public boolean J() {
        return this.f716g0;
    }

    void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.C.getText())) {
            this.C.setText("");
            this.C.requestFocus();
            this.C.setImeVisibility(true);
        } else if (this.f715f0) {
            k kVar = this.f711b0;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i10, int i11, String str) {
        m mVar = this.f713d0;
        if (mVar == null || !mVar.b(i10)) {
            O(i10, 0, null);
            this.C.setImeVisibility(false);
            E();
            return true;
        }
        return false;
    }

    boolean R(int i10) {
        m mVar = this.f713d0;
        if (mVar == null || !mVar.a(i10)) {
            a0(i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.C.requestFocus();
        this.C.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f714e0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.C.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f710a0;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.f728s0 != null) {
                N(0, null, text.toString());
            }
            this.C.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f728s0 != null && this.f717h0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.C.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.C.setSelection(i10 == 21 ? 0 : this.C.length());
                this.C.setListSelection(0);
                this.C.clearListSelection();
                this.C.a();
                return true;
            } else if (i10 == 19) {
                this.C.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.C.getText();
        this.f725p0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        h0(z10);
        j0(!z10);
        c0();
        g0();
        if (this.f710a0 != null && !TextUtils.equals(charSequence, this.f724o0)) {
            this.f710a0.a(charSequence.toString());
        }
        this.f724o0 = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.C.hasFocus()) {
            F();
        }
    }

    void Y() {
        Intent C;
        SearchableInfo searchableInfo = this.f728s0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                C = D(this.U, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                C = C(this.V, searchableInfo);
            }
            getContext().startActivity(C);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.C.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.C;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f725p0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // h.c
    public void c() {
        if (this.f726q0) {
            return;
        }
        this.f726q0 = true;
        int imeOptions = this.C.getImeOptions();
        this.f727r0 = imeOptions;
        this.C.setImeOptions(imeOptions | 33554432);
        this.C.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f721l0 = true;
        super.clearFocus();
        this.C.clearFocus();
        this.C.setImeVisibility(false);
        this.f721l0 = false;
    }

    @Override // h.c
    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.C.setImeOptions(this.f727r0);
        this.f726q0 = false;
    }

    void d0() {
        int[] iArr = this.C.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.F.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.C.getImeOptions();
    }

    public int getInputType() {
        return this.C.getInputType();
    }

    public int getMaxWidth() {
        return this.f722m0;
    }

    public CharSequence getQuery() {
        return this.C.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f719j0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f728s0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.W : getContext().getText(this.f728s0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.S;
    }

    public r.a getSuggestionsAdapter() {
        return this.f717h0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f730u0);
        post(this.f731v0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.C, this.M);
            Rect rect = this.N;
            Rect rect2 = this.M;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.L;
            if (pVar != null) {
                pVar.a(this.N, this.M);
                return;
            }
            p pVar2 = new p(this.N, this.M, this.C);
            this.L = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.i0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.J()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f722m0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f722m0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f722m0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        i0(oVar.f754p);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f754p = J();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (!this.f721l0 && isFocusable()) {
            if (J()) {
                return super.requestFocus(i10, rect);
            }
            boolean requestFocus = this.C.requestFocus(i10, rect);
            if (requestFocus) {
                i0(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f729t0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f715f0 == z10) {
            return;
        }
        this.f715f0 = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.C.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.C.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f722m0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f711b0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f712c0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f710a0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f714e0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f713d0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f719j0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f720k0 = z10;
        r.a aVar = this.f717h0;
        if (aVar instanceof q0) {
            ((q0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f728s0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I = I();
        this.f723n0 = I;
        if (I) {
            this.C.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f718i0 = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(r.a aVar) {
        this.f717h0 = aVar;
        this.C.setAdapter(aVar);
    }

    void z() {
        if (this.K.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.E.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = c1.b(this);
            int dimensionPixelSize = this.f715f0 ? resources.getDimensionPixelSize(c.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(c.d.abc_dropdownitem_text_padding_left) : 0;
            this.C.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.C.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.C.setDropDownWidth((((this.K.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
