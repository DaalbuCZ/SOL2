package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k8.a;
/* loaded from: classes.dex */
public class c extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    private final View f9290a;

    /* renamed from: b  reason: collision with root package name */
    private final k8.a f9291b;

    /* renamed from: c  reason: collision with root package name */
    private final AccessibilityManager f9292c;

    /* renamed from: d  reason: collision with root package name */
    private final AccessibilityViewEmbedder f9293d;

    /* renamed from: e  reason: collision with root package name */
    private final io.flutter.plugin.platform.k f9294e;

    /* renamed from: f  reason: collision with root package name */
    private final ContentResolver f9295f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, l> f9296g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, h> f9297h;

    /* renamed from: i  reason: collision with root package name */
    private l f9298i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f9299j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f9300k;

    /* renamed from: l  reason: collision with root package name */
    private int f9301l;

    /* renamed from: m  reason: collision with root package name */
    private l f9302m;

    /* renamed from: n  reason: collision with root package name */
    private l f9303n;

    /* renamed from: o  reason: collision with root package name */
    private l f9304o;

    /* renamed from: p  reason: collision with root package name */
    private final List<Integer> f9305p;

    /* renamed from: q  reason: collision with root package name */
    private int f9306q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f9307r;

    /* renamed from: s  reason: collision with root package name */
    private k f9308s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9309t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f9310u;

    /* renamed from: v  reason: collision with root package name */
    private final a.b f9311v;

    /* renamed from: w  reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f9312w;
    @TargetApi(19)

    /* renamed from: x  reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f9313x;

    /* renamed from: y  reason: collision with root package name */
    private final ContentObserver f9314y;

    /* renamed from: z  reason: collision with root package name */
    private static final int f9289z = ((g.SCROLL_RIGHT.f9342n | g.SCROLL_LEFT.f9342n) | g.SCROLL_UP.f9342n) | g.SCROLL_DOWN.f9342n;
    private static final int A = ((((((((((i.HAS_CHECKED_STATE.f9360n | i.IS_CHECKED.f9360n) | i.IS_SELECTED.f9360n) | i.IS_TEXT_FIELD.f9360n) | i.IS_FOCUSED.f9360n) | i.HAS_ENABLED_STATE.f9360n) | i.IS_ENABLED.f9360n) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f9360n) | i.HAS_TOGGLED_STATE.f9360n) | i.IS_TOGGLED.f9360n) | i.IS_FOCUSABLE.f9360n) | i.IS_SLIDER.f9360n;
    private static int B = 267386881;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.b {
        a() {
        }

        @Override // k8.a.b
        public void a(String str) {
            c.this.f9290a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.b0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.a0(byteBuffer, strArr);
        }

        @Override // k8.a.b
        public void d(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent H = c.this.H(0, 32);
            H.getText().add(str);
            c.this.S(H);
        }

        @Override // k8.a.b
        public void e(int i10) {
            c.this.R(i10, 2);
        }

        @Override // k8.a.b
        public void f(int i10) {
            c.this.R(i10, 1);
        }
    }

    /* loaded from: classes.dex */
    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            if (c.this.f9310u) {
                return;
            }
            c cVar = c.this;
            if (z10) {
                cVar.f9291b.g(c.this.f9311v);
                c.this.f9291b.e();
            } else {
                cVar.W(false);
                c.this.f9291b.g(null);
                c.this.f9291b.d();
            }
            if (c.this.f9308s != null) {
                c.this.f9308s.a(z10, c.this.f9292c.isTouchExplorationEnabled());
            }
        }
    }

    /* renamed from: io.flutter.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0139c extends ContentObserver {
        C0139c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            onChange(z10, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            if (c.this.f9310u) {
                return;
            }
            String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(c.this.f9295f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                c.g(c.this, f.DISABLE_ANIMATIONS.f9329n);
            } else {
                c.f(c.this, ~f.DISABLE_ANIMATIONS.f9329n);
            }
            c.this.T();
        }
    }

    /* loaded from: classes.dex */
    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f9318a;

        d(AccessibilityManager accessibilityManager) {
            this.f9318a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            if (c.this.f9310u) {
                return;
            }
            if (!z10) {
                c.this.W(false);
                c.this.L();
            }
            if (c.this.f9308s != null) {
                c.this.f9308s.a(this.f9318a.isEnabled(), z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9320a;

        static {
            int[] iArr = new int[o.values().length];
            f9320a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9320a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        

        /* renamed from: n  reason: collision with root package name */
        final int f9329n;

        f(int i10) {
            this.f9329n = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: n  reason: collision with root package name */
        public final int f9342n;

        g(int i10) {
            this.f9342n = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private int f9343a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f9344b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f9345c = -1;

        /* renamed from: d  reason: collision with root package name */
        private String f9346d;

        /* renamed from: e  reason: collision with root package name */
        private String f9347e;

        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        

        /* renamed from: n  reason: collision with root package name */
        final int f9360n;

        i(int i10) {
            this.f9360n = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends n {

        /* renamed from: d  reason: collision with root package name */
        String f9361d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(boolean z10, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {
        private p A;
        private int C;
        private int D;
        private int E;
        private int F;
        private float G;
        private float H;
        private float I;
        private String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        private l Q;
        private List<h> T;
        private h U;
        private h V;
        private float[] X;
        private float[] Z;

        /* renamed from: a  reason: collision with root package name */
        final c f9362a;

        /* renamed from: a0  reason: collision with root package name */
        private Rect f9363a0;

        /* renamed from: c  reason: collision with root package name */
        private int f9365c;

        /* renamed from: d  reason: collision with root package name */
        private int f9366d;

        /* renamed from: e  reason: collision with root package name */
        private int f9367e;

        /* renamed from: f  reason: collision with root package name */
        private int f9368f;

        /* renamed from: g  reason: collision with root package name */
        private int f9369g;

        /* renamed from: h  reason: collision with root package name */
        private int f9370h;

        /* renamed from: i  reason: collision with root package name */
        private int f9371i;

        /* renamed from: j  reason: collision with root package name */
        private int f9372j;

        /* renamed from: k  reason: collision with root package name */
        private int f9373k;

        /* renamed from: l  reason: collision with root package name */
        private float f9374l;

        /* renamed from: m  reason: collision with root package name */
        private float f9375m;

        /* renamed from: n  reason: collision with root package name */
        private float f9376n;

        /* renamed from: o  reason: collision with root package name */
        private String f9377o;

        /* renamed from: p  reason: collision with root package name */
        private List<n> f9378p;

        /* renamed from: q  reason: collision with root package name */
        private String f9379q;

        /* renamed from: r  reason: collision with root package name */
        private List<n> f9380r;

        /* renamed from: s  reason: collision with root package name */
        private String f9381s;

        /* renamed from: t  reason: collision with root package name */
        private List<n> f9382t;

        /* renamed from: u  reason: collision with root package name */
        private String f9383u;

        /* renamed from: v  reason: collision with root package name */
        private List<n> f9384v;

        /* renamed from: w  reason: collision with root package name */
        private String f9385w;

        /* renamed from: x  reason: collision with root package name */
        private List<n> f9386x;

        /* renamed from: y  reason: collision with root package name */
        private String f9387y;

        /* renamed from: b  reason: collision with root package name */
        private int f9364b = -1;

        /* renamed from: z  reason: collision with root package name */
        private int f9388z = -1;
        private boolean B = false;
        private List<l> R = new ArrayList();
        private List<l> S = new ArrayList();
        private boolean W = true;
        private boolean Y = true;

        l(c cVar) {
            this.f9362a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean A0(l lVar, w8.d<l> dVar) {
            return (lVar == null || lVar.j0(dVar) == null) ? false : true;
        }

        private void B0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C0(float[] fArr, Set<l> set, boolean z10) {
            set.add(this);
            if (this.Y) {
                z10 = true;
            }
            if (z10) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                if (this.P == null) {
                    this.P = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = {this.L, this.M, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                B0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                B0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                B0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                B0(fArr6, this.Z, fArr2);
                if (this.f9363a0 == null) {
                    this.f9363a0 = new Rect();
                }
                this.f9363a0.set(Math.round(z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(y0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(y0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i10 = -1;
            for (l lVar : this.R) {
                lVar.f9388z = i10;
                i10 = lVar.f9364b;
                lVar.C0(this.Z, set, z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.f9379q;
            this.K = this.f9377o;
            this.C = this.f9365c;
            this.D = this.f9366d;
            this.E = this.f9369g;
            this.F = this.f9370h;
            this.G = this.f9374l;
            this.H = this.f9375m;
            this.I = this.f9376n;
            this.f9365c = byteBuffer.getInt();
            this.f9366d = byteBuffer.getInt();
            this.f9367e = byteBuffer.getInt();
            this.f9368f = byteBuffer.getInt();
            this.f9369g = byteBuffer.getInt();
            this.f9370h = byteBuffer.getInt();
            this.f9371i = byteBuffer.getInt();
            this.f9372j = byteBuffer.getInt();
            this.f9373k = byteBuffer.getInt();
            this.f9374l = byteBuffer.getFloat();
            this.f9375m = byteBuffer.getFloat();
            this.f9376n = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            this.f9377o = i10 == -1 ? null : strArr[i10];
            this.f9378p = o0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.f9379q = i11 == -1 ? null : strArr[i11];
            this.f9380r = o0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f9381s = i12 == -1 ? null : strArr[i12];
            this.f9382t = o0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.f9383u = i13 == -1 ? null : strArr[i13];
            this.f9384v = o0(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            this.f9385w = i14 == -1 ? null : strArr[i14];
            this.f9386x = o0(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            this.f9387y = i15 == -1 ? null : strArr[i15];
            this.A = p.e(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i16 = 0; i16 < 16; i16++) {
                this.P[i16] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i17 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                l A = this.f9362a.A(byteBuffer.getInt());
                A.Q = this;
                this.R.add(A);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                l A2 = this.f9362a.A(byteBuffer.getInt());
                A2.Q = this;
                this.S.add(A2);
            }
            int i20 = byteBuffer.getInt();
            if (i20 == 0) {
                this.T = null;
                return;
            }
            List<h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i20);
            } else {
                list.clear();
            }
            for (int i21 = 0; i21 < i20; i21++) {
                h z10 = this.f9362a.z(byteBuffer.getInt());
                if (z10.f9345c == g.TAP.f9342n) {
                    this.U = z10;
                } else if (z10.f9345c == g.LONG_PRESS.f9342n) {
                    this.V = z10;
                } else {
                    this.T.add(z10);
                }
                this.T.add(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(List<l> list) {
            if (v0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l lVar : this.R) {
                lVar.e0(list);
            }
        }

        @TargetApi(21)
        private SpannableString f0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int i10 = e.f9320a[nVar.f9391c.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f9389a, nVar.f9390b, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f9361d)), nVar.f9389a, nVar.f9390b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g0() {
            String str;
            String str2 = this.f9377o;
            if (str2 == null && this.K == null) {
                return false;
            }
            return str2 == null || (str = this.K) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h0() {
            return (Float.isNaN(this.f9374l) || Float.isNaN(this.G) || this.G == this.f9374l) ? false : true;
        }

        private void i0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (Matrix.invertM(this.X, 0, this.P, 0)) {
                    return;
                }
                Arrays.fill(this.X, 0.0f);
            }
        }

        private l j0(w8.d<l> dVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect k0() {
            return this.f9363a0;
        }

        private CharSequence l0() {
            return Build.VERSION.SDK_INT < 21 ? this.f9385w : f0(this.f9385w, this.f9386x);
        }

        static /* synthetic */ int m(l lVar, int i10) {
            int i11 = lVar.f9370h + i10;
            lVar.f9370h = i11;
            return i11;
        }

        private CharSequence m0() {
            return Build.VERSION.SDK_INT < 21 ? this.f9377o : f0(this.f9377o, this.f9378p);
        }

        static /* synthetic */ int n(l lVar, int i10) {
            int i11 = lVar.f9370h - i10;
            lVar.f9370h = i11;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String n0() {
            String str;
            if (!v0(i.NAMES_ROUTE) || (str = this.f9377o) == null || str.isEmpty()) {
                for (l lVar : this.R) {
                    String n02 = lVar.n0();
                    if (n02 != null && !n02.isEmpty()) {
                        return n02;
                    }
                }
                return null;
            }
            return this.f9377o;
        }

        private List<n> o0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i14 = e.f9320a[oVar.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(null);
                    mVar.f9389a = i12;
                    mVar.f9390b = i13;
                    mVar.f9391c = oVar;
                    arrayList.add(mVar);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(null);
                    jVar.f9389a = i12;
                    jVar.f9390b = i13;
                    jVar.f9391c = oVar;
                    jVar.f9361d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence p0() {
            CharSequence[] charSequenceArr = {m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence q0() {
            return Build.VERSION.SDK_INT < 21 ? this.f9379q : f0(this.f9379q, this.f9380r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence r0() {
            CharSequence[] charSequenceArr = {q0(), m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean s0(g gVar) {
            return (gVar.f9342n & this.D) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean t0(i iVar) {
            return (iVar.f9360n & this.C) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u0(g gVar) {
            return (gVar.f9342n & this.f9366d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v0(i iVar) {
            return (iVar.f9360n & this.f9365c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l w0(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.L || f11 >= this.N || f12 < this.M || f12 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.S) {
                if (!lVar.v0(i.IS_HIDDEN)) {
                    lVar.i0();
                    Matrix.multiplyMV(fArr2, 0, lVar.X, 0, fArr, 0);
                    l w02 = lVar.w0(fArr2, z10);
                    if (w02 != null) {
                        return w02;
                    }
                }
            }
            if (z10 && this.f9371i != -1) {
                z11 = true;
            }
            if (x0() || z11) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x0() {
            String str;
            String str2;
            String str3;
            if (v0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (v0(i.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.f9366d & (~c.f9289z)) == 0 && (this.f9365c & c.A) == 0 && ((str = this.f9377o) == null || str.isEmpty()) && (((str2 = this.f9379q) == null || str2.isEmpty()) && ((str3 = this.f9385w) == null || str3.isEmpty()))) ? false : true;
        }

        private float y0(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float z0(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        int f9389a;

        /* renamed from: b  reason: collision with root package name */
        int f9390b;

        /* renamed from: c  reason: collision with root package name */
        o f9391c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum o {
        SPELLOUT,
        LOCALE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p e(int i10) {
            return i10 != 1 ? i10 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, k8.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), kVar);
    }

    public c(View view, k8.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.k kVar) {
        this.f9296g = new HashMap();
        this.f9297h = new HashMap();
        this.f9301l = 0;
        this.f9305p = new ArrayList();
        this.f9306q = 0;
        this.f9307r = 0;
        this.f9309t = false;
        this.f9310u = false;
        this.f9311v = new a();
        b bVar = new b();
        this.f9312w = bVar;
        C0139c c0139c = new C0139c(new Handler());
        this.f9314y = c0139c;
        this.f9290a = view;
        this.f9291b = aVar;
        this.f9292c = accessibilityManager;
        this.f9295f = contentResolver;
        this.f9293d = accessibilityViewEmbedder;
        this.f9294e = kVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            d dVar = new d(accessibilityManager);
            this.f9313x = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.f9313x = null;
        }
        if (i10 >= 17) {
            c0139c.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c0139c);
        }
        if (i10 >= 31) {
            X();
        }
        kVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l A(int i10) {
        l lVar = this.f9296g.get(Integer.valueOf(i10));
        if (lVar == null) {
            l lVar2 = new l(this);
            lVar2.f9364b = i10;
            this.f9296g.put(Integer.valueOf(i10), lVar2);
            return lVar2;
        }
        return lVar;
    }

    private l B() {
        return this.f9296g.get(0);
    }

    private void C(float f10, float f11, boolean z10) {
        l w02;
        if (this.f9296g.isEmpty() || (w02 = B().w0(new float[]{f10, f11, 0.0f, 1.0f}, z10)) == this.f9304o) {
            return;
        }
        if (w02 != null) {
            R(w02.f9364b, 128);
        }
        l lVar = this.f9304o;
        if (lVar != null) {
            R(lVar.f9364b, 256);
        }
        this.f9304o = w02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean G(l lVar) {
        return lVar.v0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent H(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setPackageName(this.f9290a.getContext().getPackageName());
        obtain.setSource(this.f9290a, i10);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        l lVar = this.f9304o;
        if (lVar != null) {
            R(lVar.f9364b, 256);
            this.f9304o = null;
        }
    }

    private void M(l lVar) {
        String n02 = lVar.n0();
        if (n02 == null) {
            n02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            V(n02);
            return;
        }
        AccessibilityEvent H = H(lVar.f9364b, 32);
        H.getText().add(n02);
        S(H);
    }

    @TargetApi(18)
    private boolean N(l lVar, int i10, Bundle bundle, boolean z10) {
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = lVar.f9369g;
        int i13 = lVar.f9370h;
        P(lVar, i11, z10, z11);
        if (i12 != lVar.f9369g || i13 != lVar.f9370h) {
            String str = lVar.f9379q != null ? lVar.f9379q : "";
            AccessibilityEvent H = H(lVar.f9364b, 8192);
            H.getText().add(str);
            H.setFromIndex(lVar.f9369g);
            H.setToIndex(lVar.f9370h);
            H.setItemCount(str.length());
            S(H);
        }
        if (i11 == 1) {
            if (z10) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.u0(gVar)) {
                    this.f9291b.c(i10, gVar, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (lVar.u0(gVar2)) {
                this.f9291b.c(i10, gVar2, Boolean.valueOf(z11));
                return true;
            }
            return false;
        } else if (i11 != 2) {
            return i11 == 4 || i11 == 8 || i11 == 16;
        } else {
            if (z10) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.u0(gVar3)) {
                    this.f9291b.c(i10, gVar3, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (lVar.u0(gVar4)) {
                this.f9291b.c(i10, gVar4, Boolean.valueOf(z11));
                return true;
            }
            return false;
        }
    }

    @TargetApi(21)
    private boolean O(l lVar, int i10, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f9291b.c(i10, g.SET_TEXT, string);
        lVar.f9379q = string;
        lVar.f9380r = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
        r5 = r4.f9379q.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        r4.f9370h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        r4.f9370h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5.find() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        io.flutter.view.c.l.m(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r5.find() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r5.find() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (r5.find() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P(io.flutter.view.c.l r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = io.flutter.view.c.l.k(r4)
            if (r0 < 0) goto L111
            int r0 = io.flutter.view.c.l.i(r4)
            if (r0 >= 0) goto Le
            goto L111
        Le:
            r0 = 1
            if (r5 == r0) goto Le9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L94
            r1 = 4
            if (r5 == r1) goto L36
            r0 = 8
            if (r5 == r0) goto L22
            r0 = 16
            if (r5 == r0) goto L22
            goto L108
        L22:
            if (r6 == 0) goto L31
        L24:
            java.lang.String r5 = io.flutter.view.c.l.q(r4)
            int r5 = r5.length()
        L2c:
            io.flutter.view.c.l.l(r4, r5)
            goto L108
        L31:
            io.flutter.view.c.l.l(r4, r2)
            goto L108
        L36:
            if (r6 == 0) goto L6b
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L6b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
        L62:
            int r5 = r5.start(r0)
            io.flutter.view.c.l.m(r4, r5)
            goto L108
        L6b:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L31
        L8f:
            int r5 = r5.start(r0)
            goto L2c
        L94:
            if (r6 == 0) goto Lc4
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lc4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
            goto L62
        Lc4:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L108
            goto L8f
        Le9:
            if (r6 == 0) goto Lfd
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lfd
            io.flutter.view.c.l.m(r4, r0)
            goto L108
        Lfd:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            io.flutter.view.c.l.n(r4, r0)
        L108:
            if (r7 != 0) goto L111
            int r5 = io.flutter.view.c.l.k(r4)
            io.flutter.view.c.l.j(r4, r5)
        L111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.P(io.flutter.view.c$l, int, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i10, int i11) {
        if (this.f9292c.isEnabled()) {
            S(H(i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(AccessibilityEvent accessibilityEvent) {
        if (this.f9292c.isEnabled()) {
            this.f9290a.getParent().requestSendAccessibilityEvent(this.f9290a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.f9291b.f(this.f9301l);
    }

    private void U(int i10) {
        AccessibilityEvent H = H(i10, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            H.setContentChangeTypes(1);
        }
        S(H);
    }

    @TargetApi(28)
    private void V(String str) {
        this.f9290a.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(boolean z10) {
        if (this.f9309t == z10) {
            return;
        }
        this.f9309t = z10;
        this.f9301l = z10 ? this.f9301l | f.ACCESSIBLE_NAVIGATION.f9329n : this.f9301l & (~f.ACCESSIBLE_NAVIGATION.f9329n);
        T();
    }

    @TargetApi(31)
    private void X() {
        View view = this.f9290a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i10 = this.f9290a.getResources().getConfiguration().fontWeightAdjustment;
        this.f9301l = i10 != Integer.MAX_VALUE && i10 >= 300 ? this.f9301l | f.BOLD_TEXT.f9329n : this.f9301l & f.BOLD_TEXT.f9329n;
        T();
    }

    private boolean Z(final l lVar) {
        return lVar.f9372j > 0 && (l.A0(this.f9298i, new w8.d() { // from class: io.flutter.view.a
            @Override // w8.d
            public final boolean test(Object obj) {
                boolean F;
                F = c.F(c.l.this, (c.l) obj);
                return F;
            }
        }) || !l.A0(this.f9298i, io.flutter.view.b.f9288a));
    }

    @TargetApi(19)
    private void c0(l lVar) {
        View c10;
        Integer num;
        lVar.Q = null;
        if (lVar.f9371i != -1 && (num = this.f9299j) != null && this.f9293d.platformViewOfNode(num.intValue()) == this.f9294e.c(lVar.f9371i)) {
            R(this.f9299j.intValue(), 65536);
            this.f9299j = null;
        }
        if (lVar.f9371i != -1 && (c10 = this.f9294e.c(lVar.f9371i)) != null) {
            c10.setImportantForAccessibility(4);
        }
        l lVar2 = this.f9298i;
        if (lVar2 == lVar) {
            R(lVar2.f9364b, 65536);
            this.f9298i = null;
        }
        if (this.f9302m == lVar) {
            this.f9302m = null;
        }
        if (this.f9304o == lVar) {
            this.f9304o = null;
        }
    }

    static /* synthetic */ int f(c cVar, int i10) {
        int i11 = i10 & cVar.f9301l;
        cVar.f9301l = i11;
        return i11;
    }

    static /* synthetic */ int g(c cVar, int i10) {
        int i11 = i10 | cVar.f9301l;
        cVar.f9301l = i11;
        return i11;
    }

    private AccessibilityEvent v(int i10, String str, String str2) {
        AccessibilityEvent H = H(i10, 16);
        H.setBeforeText(str);
        H.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 < str.length() || i11 < str2.length()) {
            H.setFromIndex(i11);
            int length = str.length() - 1;
            int length2 = str2.length() - 1;
            while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
                length--;
                length2--;
            }
            H.setRemovedCount((length - i11) + 1);
            H.setAddedCount((length2 - i11) + 1);
            return H;
        }
        return null;
    }

    @TargetApi(28)
    private boolean w() {
        Activity e10 = w8.h.e(this.f9290a.getContext());
        if (e10 == null || e10.getWindow() == null) {
            return false;
        }
        int i10 = e10.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i10 == 2 || i10 == 0;
    }

    private Rect y(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f9290a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h z(int i10) {
        h hVar = this.f9297h.get(Integer.valueOf(i10));
        if (hVar == null) {
            h hVar2 = new h();
            hVar2.f9344b = i10;
            hVar2.f9343a = B + i10;
            this.f9297h.put(Integer.valueOf(i10), hVar2);
            return hVar2;
        }
        return hVar;
    }

    public boolean D() {
        return this.f9292c.isEnabled();
    }

    public boolean E() {
        return this.f9292c.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo I(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean J(MotionEvent motionEvent) {
        return K(motionEvent, false);
    }

    public boolean K(MotionEvent motionEvent, boolean z10) {
        if (this.f9292c.isTouchExplorationEnabled() && !this.f9296g.isEmpty()) {
            l w02 = B().w0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
            if (w02 != null && w02.f9371i != -1) {
                if (z10) {
                    return false;
                }
                return this.f9293d.onAccessibilityHoverEvent(w02.f9364b, motionEvent);
            }
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                C(motionEvent.getX(), motionEvent.getY(), z10);
            } else if (motionEvent.getAction() != 10) {
                x7.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            } else {
                L();
            }
            return true;
        }
        return false;
    }

    public void Q() {
        this.f9310u = true;
        this.f9294e.d();
        Y(null);
        this.f9292c.removeAccessibilityStateChangeListener(this.f9312w);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f9292c.removeTouchExplorationStateChangeListener(this.f9313x);
        }
        this.f9295f.unregisterContentObserver(this.f9314y);
        this.f9291b.g(null);
    }

    public void Y(k kVar) {
        this.f9308s = kVar;
    }

    void a0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h z10 = z(byteBuffer.getInt());
            z10.f9345c = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str = null;
            z10.f9346d = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str = strArr[i11];
            }
            z10.f9347e = str;
        }
    }

    void b0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f10;
        float f11;
        WindowInsets rootWindowInsets;
        Integer valueOf;
        View c10;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l A2 = A(byteBuffer.getInt());
            A2.D0(byteBuffer, strArr, byteBufferArr);
            if (!A2.v0(i.IS_HIDDEN)) {
                if (A2.v0(i.IS_FOCUSED)) {
                    this.f9302m = A2;
                }
                if (A2.B) {
                    arrayList.add(A2);
                }
                if (A2.f9371i != -1 && !this.f9294e.b(A2.f9371i) && (c10 = this.f9294e.c(A2.f9371i)) != null) {
                    c10.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l B2 = B();
        ArrayList<l> arrayList2 = new ArrayList();
        if (B2 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                if ((i10 >= 28 ? w() : true) && (rootWindowInsets = this.f9290a.getRootWindowInsets()) != null) {
                    if (!this.f9307r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        B2.Y = true;
                        B2.W = true;
                    }
                    this.f9307r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, valueOf.intValue(), 0.0f, 0.0f);
                }
            }
            B2.C0(fArr, hashSet, false);
            B2.e0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f9305p.contains(Integer.valueOf(lVar4.f9364b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f9364b != this.f9306q || arrayList2.size() != this.f9305p.size())) {
            this.f9306q = lVar3.f9364b;
            M(lVar3);
        }
        this.f9305p.clear();
        for (l lVar5 : arrayList2) {
            this.f9305p.add(Integer.valueOf(lVar5.f9364b));
        }
        Iterator<Map.Entry<Integer, l>> it = this.f9296g.entrySet().iterator();
        while (it.hasNext()) {
            l value = it.next().getValue();
            if (!hashSet.contains(value)) {
                c0(value);
                it.remove();
            }
        }
        U(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l lVar6 = (l) it2.next();
            if (lVar6.h0()) {
                AccessibilityEvent H = H(lVar6.f9364b, 4096);
                float f12 = lVar6.f9374l;
                float f13 = lVar6.f9375m;
                if (Float.isInfinite(lVar6.f9375m)) {
                    if (f12 > 70000.0f) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(lVar6.f9376n)) {
                    f10 = f13 + 100000.0f;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + 100000.0f;
                } else {
                    f10 = f13 - lVar6.f9376n;
                    f11 = f12 - lVar6.f9376n;
                }
                if (lVar6.s0(g.SCROLL_UP) || lVar6.s0(g.SCROLL_DOWN)) {
                    H.setScrollY((int) f11);
                    H.setMaxScrollY((int) f10);
                } else if (lVar6.s0(g.SCROLL_LEFT) || lVar6.s0(g.SCROLL_RIGHT)) {
                    H.setScrollX((int) f11);
                    H.setMaxScrollX((int) f10);
                }
                if (lVar6.f9372j > 0) {
                    H.setItemCount(lVar6.f9372j);
                    H.setFromIndex(lVar6.f9373k);
                    int i11 = 0;
                    for (l lVar7 : lVar6.S) {
                        if (!lVar7.v0(i.IS_HIDDEN)) {
                            i11++;
                        }
                    }
                    H.setToIndex((lVar6.f9373k + i11) - 1);
                }
                S(H);
            }
            if (lVar6.v0(i.IS_LIVE_REGION) && lVar6.g0()) {
                U(lVar6.f9364b);
            }
            l lVar8 = this.f9298i;
            if (lVar8 != null && lVar8.f9364b == lVar6.f9364b) {
                i iVar = i.IS_SELECTED;
                if (!lVar6.t0(iVar) && lVar6.v0(iVar)) {
                    AccessibilityEvent H2 = H(lVar6.f9364b, 4);
                    H2.getText().add(lVar6.f9377o);
                    S(H2);
                }
            }
            l lVar9 = this.f9302m;
            if (lVar9 != null && lVar9.f9364b == lVar6.f9364b && ((lVar2 = this.f9303n) == null || lVar2.f9364b != this.f9302m.f9364b)) {
                this.f9303n = this.f9302m;
                S(H(lVar6.f9364b, 8));
            } else if (this.f9302m == null) {
                this.f9303n = null;
            }
            l lVar10 = this.f9302m;
            if (lVar10 != null && lVar10.f9364b == lVar6.f9364b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar6.t0(iVar2) && lVar6.v0(iVar2) && ((lVar = this.f9298i) == null || lVar.f9364b == this.f9302m.f9364b)) {
                    String str = lVar6.J != null ? lVar6.J : "";
                    String str2 = lVar6.f9379q != null ? lVar6.f9379q : "";
                    AccessibilityEvent v10 = v(lVar6.f9364b, str, str2);
                    if (v10 != null) {
                        S(v10);
                    }
                    if (lVar6.E != lVar6.f9369g || lVar6.F != lVar6.f9370h) {
                        AccessibilityEvent H3 = H(lVar6.f9364b, 8192);
                        H3.getText().add(str2);
                        H3.setFromIndex(lVar6.f9369g);
                        H3.setToIndex(lVar6.f9370h);
                        H3.setItemCount(str2.length());
                        S(H3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0462 A[LOOP:0: B:248:0x045c->B:250:0x0462, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0487  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r17) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r2 != null) goto L11;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.flutter.view.c$l r2 = r1.f9302m
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.flutter.view.c.l.a(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.f9300k
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.flutter.view.c$l r2 = r1.f9298i
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.f9299j
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i10, int i11, Bundle bundle) {
        int i12;
        if (i10 >= 65536) {
            boolean performAction = this.f9293d.performAction(i10, i11, bundle);
            if (performAction && i11 == 128) {
                this.f9299j = null;
            }
            return performAction;
        }
        l lVar = this.f9296g.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (lVar == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.f9291b.b(i10, g.TAP);
                return true;
            case 32:
                this.f9291b.b(i10, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f9298i == null) {
                    this.f9290a.invalidate();
                }
                this.f9298i = lVar;
                this.f9291b.b(i10, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                R(i10, 32768);
                if (lVar.u0(g.INCREASE) || lVar.u0(g.DECREASE)) {
                    R(i10, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f9298i;
                if (lVar2 != null && lVar2.f9364b == i10) {
                    this.f9298i = null;
                }
                Integer num = this.f9299j;
                if (num != null && num.intValue() == i10) {
                    this.f9299j = null;
                }
                this.f9291b.b(i10, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                R(i10, 65536);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return N(lVar, i10, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return N(lVar, i10, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.u0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.u0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.u0(gVar)) {
                            return false;
                        }
                        lVar.f9379q = lVar.f9381s;
                        lVar.f9380r = lVar.f9382t;
                        R(i10, 4);
                    }
                }
                this.f9291b.b(i10, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.u0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.u0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.u0(gVar2)) {
                            return false;
                        }
                        lVar.f9379q = lVar.f9383u;
                        lVar.f9380r = lVar.f9384v;
                        R(i10, 4);
                    }
                }
                this.f9291b.b(i10, gVar2);
                return true;
            case 16384:
                this.f9291b.b(i10, g.COPY);
                return true;
            case 32768:
                this.f9291b.b(i10, g.PASTE);
                return true;
            case 65536:
                this.f9291b.b(i10, g.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z10 = true;
                }
                if (z10) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i12 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f9370h));
                    i12 = lVar.f9370h;
                }
                hashMap.put("extent", Integer.valueOf(i12));
                this.f9291b.c(i10, g.SET_SELECTION, hashMap);
                l lVar3 = this.f9296g.get(Integer.valueOf(i10));
                lVar3.f9369g = ((Integer) hashMap.get("base")).intValue();
                lVar3.f9370h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f9291b.b(i10, g.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return O(lVar, i10, bundle);
            case 16908342:
                this.f9291b.b(i10, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f9297h.get(Integer.valueOf(i11 - B));
                if (hVar != null) {
                    this.f9291b.c(i10, g.CUSTOM_ACTION, Integer.valueOf(hVar.f9344b));
                    return true;
                }
                return false;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean x(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (this.f9293d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) && (recordFlutterId = this.f9293d.getRecordFlutterId(view, accessibilityEvent)) != null) {
            int eventType = accessibilityEvent.getEventType();
            if (eventType == 8) {
                this.f9300k = recordFlutterId;
                this.f9302m = null;
                return true;
            } else if (eventType == 128) {
                this.f9304o = null;
                return true;
            } else if (eventType == 32768) {
                this.f9299j = recordFlutterId;
                this.f9298i = null;
                return true;
            } else if (eventType != 65536) {
                return true;
            } else {
                this.f9300k = null;
                this.f9299j = null;
                return true;
            }
        }
        return false;
    }
}
