package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.s;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.q;
import java.util.HashMap;
import k8.p;
/* loaded from: classes.dex */
public class f implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final View f8712a;

    /* renamed from: b  reason: collision with root package name */
    private final InputMethodManager f8713b;

    /* renamed from: c  reason: collision with root package name */
    private final AutofillManager f8714c;

    /* renamed from: d  reason: collision with root package name */
    private final p f8715d;

    /* renamed from: e  reason: collision with root package name */
    private c f8716e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    private p.b f8717f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<p.b> f8718g;

    /* renamed from: h  reason: collision with root package name */
    private io.flutter.plugin.editing.c f8719h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8720i;

    /* renamed from: j  reason: collision with root package name */
    private InputConnection f8721j;

    /* renamed from: k  reason: collision with root package name */
    private q f8722k;

    /* renamed from: l  reason: collision with root package name */
    private Rect f8723l;

    /* renamed from: m  reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f8724m;

    /* renamed from: n  reason: collision with root package name */
    private p.e f8725n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8726o;

    /* loaded from: classes.dex */
    class a implements p.f {
        a() {
        }

        @Override // k8.p.f
        public void a() {
            f fVar = f.this;
            fVar.F(fVar.f8712a);
        }

        @Override // k8.p.f
        public void b() {
            f.this.m();
        }

        @Override // k8.p.f
        public void c(p.e eVar) {
            f fVar = f.this;
            fVar.E(fVar.f8712a, eVar);
        }

        @Override // k8.p.f
        public void d(int i10, p.b bVar) {
            f.this.D(i10, bVar);
        }

        @Override // k8.p.f
        public void e(String str, Bundle bundle) {
            f.this.B(str, bundle);
        }

        @Override // k8.p.f
        public void f(int i10, boolean z10) {
            f.this.C(i10, z10);
        }

        @Override // k8.p.f
        public void g(double d10, double d11, double[] dArr) {
            f.this.A(d10, d11, dArr);
        }

        @Override // k8.p.f
        public void h() {
            f.this.x();
        }

        @Override // k8.p.f
        public void i(boolean z10) {
            if (Build.VERSION.SDK_INT < 26 || f.this.f8714c == null) {
                return;
            }
            if (z10) {
                f.this.f8714c.commit();
            } else {
                f.this.f8714c.cancel();
            }
        }

        @Override // k8.p.f
        public void j() {
            if (f.this.f8716e.f8732a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                f.this.y();
                return;
            }
            f fVar = f.this;
            fVar.s(fVar.f8712a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f8728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double[] f8729b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double[] f8730c;

        b(boolean z10, double[] dArr, double[] dArr2) {
            this.f8728a = z10;
            this.f8729b = dArr;
            this.f8730c = dArr2;
        }

        @Override // io.flutter.plugin.editing.f.d
        public void a(double d10, double d11) {
            double d12 = 1.0d;
            if (!this.f8728a) {
                double[] dArr = this.f8729b;
                d12 = 1.0d / (((dArr[3] * d10) + (dArr[7] * d11)) + dArr[15]);
            }
            double[] dArr2 = this.f8729b;
            double d13 = ((dArr2[0] * d10) + (dArr2[4] * d11) + dArr2[12]) * d12;
            double d14 = ((dArr2[1] * d10) + (dArr2[5] * d11) + dArr2[13]) * d12;
            double[] dArr3 = this.f8730c;
            if (d13 < dArr3[0]) {
                dArr3[0] = d13;
            } else if (d13 > dArr3[1]) {
                dArr3[1] = d13;
            }
            if (d14 < dArr3[2]) {
                dArr3[2] = d14;
            } else if (d14 > dArr3[3]) {
                dArr3[3] = d14;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        a f8732a;

        /* renamed from: b  reason: collision with root package name */
        int f8733b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i10) {
            this.f8732a = aVar;
            this.f8733b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        void a(double d10, double d11);
    }

    @SuppressLint({"NewApi"})
    public f(View view, p pVar, q qVar) {
        this.f8712a = view;
        this.f8719h = new io.flutter.plugin.editing.c(null, view);
        this.f8713b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i10 = Build.VERSION.SDK_INT;
        this.f8714c = i10 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (i10 >= 30) {
            int navigationBars = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : 0;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? navigationBars | WindowInsets.Type.statusBars() : navigationBars, WindowInsets.Type.ime());
            this.f8724m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f8715d = pVar;
        pVar.n(new a());
        pVar.k();
        this.f8722k = qVar;
        qVar.C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(double d10, double d11, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z10 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d12 = dArr[12] / dArr[15];
        dArr2[1] = d12;
        dArr2[0] = d12;
        double d13 = dArr[13] / dArr[15];
        dArr2[3] = d13;
        dArr2[2] = d13;
        b bVar = new b(z10, dArr, dArr2);
        bVar.a(d10, 0.0d);
        bVar.a(d10, d11);
        bVar.a(0.0d, d11);
        Float valueOf = Float.valueOf(this.f8712a.getContext().getResources().getDisplayMetrics().density);
        this.f8723l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i10, boolean z10) {
        if (!z10) {
            this.f8716e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
            this.f8721j = null;
            return;
        }
        this.f8712a.requestFocus();
        this.f8716e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
        this.f8713b.restartInput(this.f8712a);
        this.f8720i = false;
    }

    private void H(p.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f10842j == null) {
            this.f8718g = null;
            return;
        }
        p.b[] bVarArr = bVar.f10844l;
        SparseArray<p.b> sparseArray = new SparseArray<>();
        this.f8718g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f10842j.f10845a.hashCode(), bVar);
            return;
        }
        for (p.b bVar2 : bVarArr) {
            p.b.a aVar = bVar2.f10842j;
            if (aVar != null) {
                this.f8718g.put(aVar.f10845a.hashCode(), bVar2);
                this.f8714c.notifyValueChanged(this.f8712a, aVar.f10845a.hashCode(), AutofillValue.forText(aVar.f10847c.f10858a));
            }
        }
    }

    private boolean k() {
        p.c cVar;
        p.b bVar = this.f8717f;
        return bVar == null || (cVar = bVar.f10839g) == null || cVar.f10849a != p.g.NONE;
    }

    private static boolean n(p.e eVar, p.e eVar2) {
        int i10 = eVar.f10862e - eVar.f10861d;
        if (i10 != eVar2.f10862e - eVar2.f10861d) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (eVar.f10858a.charAt(eVar.f10861d + i11) != eVar2.f10858a.charAt(eVar2.f10861d + i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f8713b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(p.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, p.d dVar) {
        p.g gVar = cVar.f10849a;
        if (gVar == p.g.DATETIME) {
            return 4;
        }
        if (gVar == p.g.NUMBER) {
            int i10 = cVar.f10850b ? 4098 : 2;
            return cVar.f10851c ? i10 | 8192 : i10;
        } else if (gVar == p.g.PHONE) {
            return 3;
        } else {
            if (gVar == p.g.NONE) {
                return 0;
            }
            int i11 = 1;
            if (gVar == p.g.MULTILINE) {
                i11 = 131073;
            } else if (gVar == p.g.EMAIL_ADDRESS) {
                i11 = 33;
            } else if (gVar == p.g.URL) {
                i11 = 17;
            } else if (gVar == p.g.VISIBLE_PASSWORD) {
                i11 = 145;
            } else if (gVar == p.g.NAME) {
                i11 = 97;
            } else if (gVar == p.g.POSTAL_ADDRESS) {
                i11 = 113;
            }
            if (z10) {
                i11 = i11 | 524288 | 128;
            } else {
                if (z11) {
                    i11 |= 32768;
                }
                if (!z12) {
                    i11 |= 524288;
                }
            }
            return dVar == p.d.CHARACTERS ? i11 | 4096 : dVar == p.d.WORDS ? i11 | 8192 : dVar == p.d.SENTENCES ? i11 | 16384 : i11;
        }
    }

    private boolean v() {
        return this.f8718g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f8714c == null || !v()) {
            return;
        }
        this.f8714c.notifyValueChanged(this.f8712a, this.f8717f.f10842j.f10845a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f8714c == null || !v()) {
            return;
        }
        String str = this.f8717f.f10842j.f10845a;
        int[] iArr = new int[2];
        this.f8712a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f8723l);
        rect.offset(iArr[0], iArr[1]);
        this.f8714c.notifyViewEntered(this.f8712a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        p.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f8714c == null || (bVar = this.f8717f) == null || bVar.f10842j == null || !v()) {
            return;
        }
        this.f8714c.notifyViewExited(this.f8712a, this.f8717f.f10842j.f10845a.hashCode());
    }

    public void B(String str, Bundle bundle) {
        this.f8713b.sendAppPrivateCommand(this.f8712a, str, bundle);
    }

    void D(int i10, p.b bVar) {
        y();
        this.f8717f = bVar;
        this.f8716e = k() ? new c(c.a.FRAMEWORK_CLIENT, i10) : new c(c.a.NO_TARGET, i10);
        this.f8719h.l(this);
        p.b.a aVar = bVar.f10842j;
        this.f8719h = new io.flutter.plugin.editing.c(aVar != null ? aVar.f10847c : null, this.f8712a);
        H(bVar);
        this.f8720i = true;
        G();
        this.f8723l = null;
        this.f8719h.a(this);
    }

    void E(View view, p.e eVar) {
        p.e eVar2;
        if (!this.f8720i && (eVar2 = this.f8725n) != null && eVar2.b()) {
            boolean n10 = n(this.f8725n, eVar);
            this.f8720i = n10;
            if (n10) {
                x7.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f8725n = eVar;
        this.f8719h.n(eVar);
        if (this.f8720i) {
            this.f8713b.restartInput(view);
            this.f8720i = false;
        }
    }

    void F(View view) {
        if (!k()) {
            s(view);
            return;
        }
        view.requestFocus();
        this.f8713b.showSoftInput(view, 0);
    }

    public void G() {
        if (this.f8716e.f8732a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f8726o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r7 == r1.f10862e) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    @Override // io.flutter.plugin.editing.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.c r9 = r8.f8719h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        Lb:
            io.flutter.plugin.editing.c r9 = r8.f8719h
            int r9 = r9.i()
            io.flutter.plugin.editing.c r10 = r8.f8719h
            int r10 = r10.h()
            io.flutter.plugin.editing.c r11 = r8.f8719h
            int r11 = r11.g()
            io.flutter.plugin.editing.c r0 = r8.f8719h
            int r7 = r0.f()
            io.flutter.plugin.editing.c r0 = r8.f8719h
            java.util.ArrayList r0 = r0.e()
            k8.p$e r1 = r8.f8725n
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.c r1 = r8.f8719h
            java.lang.String r1 = r1.toString()
            k8.p$e r2 = r8.f8725n
            java.lang.String r2 = r2.f10858a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            k8.p$e r1 = r8.f8725n
            int r2 = r1.f10859b
            if (r9 != r2) goto L50
            int r2 = r1.f10860c
            if (r10 != r2) goto L50
            int r2 = r1.f10861d
            if (r11 != r2) goto L50
            int r1 = r1.f10862e
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f8719h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            x7.b.f(r2, r1)
            k8.p$b r1 = r8.f8717f
            boolean r1 = r1.f10837e
            if (r1 == 0) goto L86
            k8.p r1 = r8.f8715d
            io.flutter.plugin.editing.f$c r2 = r8.f8716e
            int r2 = r2.f8733b
            r1.q(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f8719h
            r0.c()
            goto L99
        L86:
            k8.p r0 = r8.f8715d
            io.flutter.plugin.editing.f$c r1 = r8.f8716e
            int r1 = r1.f8733b
            io.flutter.plugin.editing.c r2 = r8.f8719h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L99:
            k8.p$e r6 = new k8.p$e
            io.flutter.plugin.editing.c r0 = r8.f8719h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f8725n = r6
            goto Lb1
        Lac:
            io.flutter.plugin.editing.c r9 = r8.f8719h
            r9.c()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.f.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        p.b bVar;
        p.b.a aVar;
        p.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f8717f) == null || this.f8718g == null || (aVar = bVar.f10842j) == null) {
            return;
        }
        HashMap<String, p.e> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            p.b bVar2 = this.f8718g.get(sparseArray.keyAt(i10));
            if (bVar2 != null && (aVar2 = bVar2.f10842j) != null) {
                String charSequence = sparseArray.valueAt(i10).getTextValue().toString();
                p.e eVar = new p.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f10845a.equals(aVar.f10845a)) {
                    this.f8719h.n(eVar);
                } else {
                    hashMap.put(aVar2.f10845a, eVar);
                }
            }
        }
        this.f8715d.r(this.f8716e.f8733b, hashMap);
    }

    public void l(int i10) {
        c cVar = this.f8716e;
        c.a aVar = cVar.f8732a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f8733b == i10) {
            this.f8716e = new c(c.a.NO_TARGET, 0);
            y();
            this.f8713b.hideSoftInputFromWindow(this.f8712a.getApplicationWindowToken(), 0);
            this.f8713b.restartInput(this.f8712a);
            this.f8720i = false;
        }
    }

    void m() {
        if (this.f8716e.f8732a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f8719h.l(this);
        y();
        this.f8717f = null;
        H(null);
        this.f8716e = new c(c.a.NO_TARGET, 0);
        G();
        this.f8723l = null;
    }

    public InputConnection o(View view, s sVar, EditorInfo editorInfo) {
        c cVar = this.f8716e;
        c.a aVar = cVar.f8732a;
        if (aVar == c.a.NO_TARGET) {
            this.f8721j = null;
            return null;
        } else if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                if (this.f8726o) {
                    return this.f8721j;
                }
                InputConnection onCreateInputConnection = this.f8722k.c(cVar.f8733b).onCreateInputConnection(editorInfo);
                this.f8721j = onCreateInputConnection;
                return onCreateInputConnection;
            }
            p.b bVar = this.f8717f;
            int t10 = t(bVar.f10839g, bVar.f10833a, bVar.f10834b, bVar.f10835c, bVar.f10836d, bVar.f10838f);
            editorInfo.inputType = t10;
            editorInfo.imeOptions = 33554432;
            if (Build.VERSION.SDK_INT >= 26 && !this.f8717f.f10836d) {
                editorInfo.imeOptions = 33554432 | 16777216;
            }
            Integer num = this.f8717f.f10840h;
            int intValue = num == null ? (t10 & 131072) != 0 ? 1 : 6 : num.intValue();
            p.b bVar2 = this.f8717f;
            String str = bVar2.f10841i;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions = intValue | editorInfo.imeOptions;
            String[] strArr = bVar2.f10843k;
            if (strArr != null) {
                q.a.a(editorInfo, strArr);
            }
            io.flutter.plugin.editing.b bVar3 = new io.flutter.plugin.editing.b(view, this.f8716e.f8733b, this.f8715d, sVar, this.f8719h, editorInfo);
            editorInfo.initialSelStart = this.f8719h.i();
            editorInfo.initialSelEnd = this.f8719h.h();
            this.f8721j = bVar3;
            return bVar3;
        }
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.f8722k.L();
        this.f8715d.n(null);
        y();
        this.f8719h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f8724m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f8713b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f8721j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.b ? ((io.flutter.plugin.editing.b) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f8716e.f8732a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f8726o = true;
        }
    }

    public void z(ViewStructure viewStructure, int i10) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f8717f.f10842j.f10845a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i11 = 0; i11 < this.f8718g.size(); i11++) {
            int keyAt = this.f8718g.keyAt(i11);
            p.b.a aVar = this.f8718g.valueAt(i11).f10842j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i11);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f10846b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f10848d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f8723l) == null) {
                    viewStructure2 = newChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = aVar.f10847c.f10858a;
                } else {
                    viewStructure2 = newChild;
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f8723l.height());
                    charSequence = this.f8719h;
                }
                viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
            }
        }
    }
}
