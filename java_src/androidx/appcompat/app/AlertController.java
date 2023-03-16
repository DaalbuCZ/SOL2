package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.core.view.u;
import androidx.core.widget.NestedScrollView;
import c.j;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a  reason: collision with root package name */
    private final Context f413a;

    /* renamed from: b  reason: collision with root package name */
    final d.f f414b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f415c;

    /* renamed from: d  reason: collision with root package name */
    private final int f416d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f417e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f418f;

    /* renamed from: g  reason: collision with root package name */
    ListView f419g;

    /* renamed from: h  reason: collision with root package name */
    private View f420h;

    /* renamed from: i  reason: collision with root package name */
    private int f421i;

    /* renamed from: j  reason: collision with root package name */
    private int f422j;

    /* renamed from: k  reason: collision with root package name */
    private int f423k;

    /* renamed from: l  reason: collision with root package name */
    private int f424l;

    /* renamed from: m  reason: collision with root package name */
    private int f425m;

    /* renamed from: o  reason: collision with root package name */
    Button f427o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f428p;

    /* renamed from: q  reason: collision with root package name */
    Message f429q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f430r;

    /* renamed from: s  reason: collision with root package name */
    Button f431s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f432t;

    /* renamed from: u  reason: collision with root package name */
    Message f433u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f434v;

    /* renamed from: w  reason: collision with root package name */
    Button f435w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f436x;

    /* renamed from: y  reason: collision with root package name */
    Message f437y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f438z;

    /* renamed from: n  reason: collision with root package name */
    private boolean f426n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: n  reason: collision with root package name */
        private final int f439n;

        /* renamed from: o  reason: collision with root package name */
        private final int f440o;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3000f2);
            this.f440o = obtainStyledAttributes.getDimensionPixelOffset(j.f3005g2, -1);
            this.f439n = obtainStyledAttributes.getDimensionPixelOffset(j.f3010h2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f439n, getPaddingRight(), z11 ? getPaddingBottom() : this.f440o);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f427o || (message2 = alertController.f429q) == null) && (view != alertController.f431s || (message2 = alertController.f433u) == null)) ? (view != alertController.f435w || (message = alertController.f437y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f414b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f443b;

        b(View view, View view2) {
            this.f442a = view;
            this.f443b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f442a, this.f443b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f445n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ View f446o;

        c(View view, View view2) {
            this.f445n = view;
            this.f446o = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f445n, this.f446o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f449b;

        d(View view, View view2) {
            this.f448a = view;
            this.f449b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f448a, this.f449b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f451n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ View f452o;

        e(View view, View view2) {
            this.f451n = view;
            this.f452o = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f419g, this.f451n, this.f452o);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f454a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f455b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f457d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f459f;

        /* renamed from: g  reason: collision with root package name */
        public View f460g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f461h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f462i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f463j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f464k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f465l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f466m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f467n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f468o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f469p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f470q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f472s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f473t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f474u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f475v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f476w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f477x;

        /* renamed from: y  reason: collision with root package name */
        public int f478y;

        /* renamed from: z  reason: collision with root package name */
        public View f479z;

        /* renamed from: c  reason: collision with root package name */
        public int f456c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f458e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f471r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ RecycleListView f480n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f480n = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f480n.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: n  reason: collision with root package name */
            private final int f482n;

            /* renamed from: o  reason: collision with root package name */
            private final int f483o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ RecycleListView f484p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ AlertController f485q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f484p = recycleListView;
                this.f485q = alertController;
                Cursor cursor2 = getCursor();
                this.f482n = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f483o = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f482n));
                this.f484p.setItemChecked(cursor.getPosition(), cursor.getInt(this.f483o) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f455b.inflate(this.f485q.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ AlertController f487n;

            c(AlertController alertController) {
                this.f487n = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f477x.onClick(this.f487n.f414b, i10);
                if (f.this.H) {
                    return;
                }
                this.f487n.f414b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ RecycleListView f489n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ AlertController f490o;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f489n = recycleListView;
                this.f490o = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f489n.isItemChecked(i10);
                }
                f.this.J.onClick(this.f490o.f414b, i10, this.f489n.isItemChecked(i10));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f454a = context;
            this.f455b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f455b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f454a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f475v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f454a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f454a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f476w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f454a
                java.lang.CharSequence[] r3 = r10.f475v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f477x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f419g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f460g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f459f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f457d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f456c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f458e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f461h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f462i;
            if (charSequence3 != null || this.f463j != null) {
                alertController.k(-1, charSequence3, this.f464k, null, this.f463j);
            }
            CharSequence charSequence4 = this.f465l;
            if (charSequence4 != null || this.f466m != null) {
                alertController.k(-2, charSequence4, this.f467n, null, this.f466m);
            }
            CharSequence charSequence5 = this.f468o;
            if (charSequence5 != null || this.f469p != null) {
                alertController.k(-3, charSequence5, this.f470q, null, this.f469p);
            }
            if (this.f475v != null || this.K != null || this.f476w != null) {
                b(alertController);
            }
            View view2 = this.f479z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i12 = this.f478y;
            if (i12 != 0) {
                alertController.r(i12);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f492a;

        public g(DialogInterface dialogInterface) {
            this.f492a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f492a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, d.f fVar, Window window) {
        this.f413a = context;
        this.f414b = fVar;
        this.f415c = window;
        this.R = new g(fVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.F, c.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.f416d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        fVar.e(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f415c.findViewById(c.f.scrollIndicatorUp);
        View findViewById2 = this.f415c.findViewById(c.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            u.O(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i10 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i10 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f418f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f419g;
            if (listView != null) {
                listView.setOnScrollListener(new d(findViewById, findViewById2));
                this.f419g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f427o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f428p) && this.f430r == null) {
            this.f427o.setVisibility(8);
            z10 = false;
        } else {
            this.f427o.setText(this.f428p);
            Drawable drawable = this.f430r;
            if (drawable != null) {
                int i10 = this.f416d;
                drawable.setBounds(0, 0, i10, i10);
                this.f427o.setCompoundDrawables(this.f430r, null, null, null);
            }
            this.f427o.setVisibility(0);
            z10 = true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f431s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f432t) && this.f434v == null) {
            this.f431s.setVisibility(8);
        } else {
            this.f431s.setText(this.f432t);
            Drawable drawable2 = this.f434v;
            if (drawable2 != null) {
                int i11 = this.f416d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f431s.setCompoundDrawables(this.f434v, null, null, null);
            }
            this.f431s.setVisibility(0);
            z10 |= true;
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f435w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f436x) && this.f438z == null) {
            this.f435w.setVisibility(8);
        } else {
            this.f435w.setText(this.f436x);
            Drawable drawable3 = this.f438z;
            if (drawable3 != null) {
                int i12 = this.f416d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f435w.setCompoundDrawables(this.f438z, null, null, null);
            }
            this.f435w.setVisibility(0);
            z10 |= true;
        }
        if (z(this.f413a)) {
            if (z10) {
                button = this.f427o;
            } else if (z10) {
                button = this.f431s;
            } else if (z10) {
                button = this.f435w;
            }
            b(button);
        }
        if (z10) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f415c.findViewById(c.f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f418f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f419g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f419g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f420h;
        if (view == null) {
            view = this.f421i != 0 ? LayoutInflater.from(this.f413a).inflate(this.f421i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f415c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f415c.findViewById(c.f.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f426n) {
            frameLayout.setPadding(this.f422j, this.f423k, this.f424l, this.f425m);
        }
        if (this.f419g != null) {
            ((i0.a) viewGroup.getLayoutParams()).f907a = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f415c.findViewById(c.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f415c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f417e)) || !this.P) {
            this.f415c.findViewById(c.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f415c.findViewById(c.f.alertTitle);
        this.E = textView;
        textView.setText(this.f417e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f415c.findViewById(c.f.parentPanel);
        int i10 = c.f.topPanel;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = c.f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = c.f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(c.f.customPanel);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i13 == null || i13.getVisibility() == 8) ? false : 1;
        boolean z12 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!z12 && i14 != null && (findViewById2 = i14.findViewById(c.f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f418f != null || this.f419g != null) {
                view = i13.findViewById(c.f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (i14 != null && (findViewById = i14.findViewById(c.f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f419g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f419g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                p(i14, view2, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f419g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i16 = this.I;
        if (i16 > -1) {
            listView2.setItemChecked(i16, true);
            listView2.setSelection(i16);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f413a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f419g;
    }

    public void e() {
        this.f414b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f436x = charSequence;
            this.f437y = message;
            this.f438z = drawable;
        } else if (i10 == -2) {
            this.f432t = charSequence;
            this.f433u = message;
            this.f434v = drawable;
        } else if (i10 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f428p = charSequence;
            this.f429q = message;
            this.f430r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
        }
    }

    public void o(CharSequence charSequence) {
        this.f418f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f417e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f420h = null;
        this.f421i = i10;
        this.f426n = false;
    }

    public void s(View view) {
        this.f420h = view;
        this.f421i = 0;
        this.f426n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f420h = view;
        this.f421i = 0;
        this.f426n = true;
        this.f422j = i10;
        this.f423k = i11;
        this.f424l = i12;
        this.f425m = i13;
    }
}
