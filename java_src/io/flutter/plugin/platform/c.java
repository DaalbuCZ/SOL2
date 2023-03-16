package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.f0;
import io.flutter.plugin.platform.c;
import java.io.FileNotFoundException;
import java.util.List;
import k8.i;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f8754a;

    /* renamed from: b  reason: collision with root package name */
    private final k8.i f8755b;

    /* renamed from: c  reason: collision with root package name */
    private final d f8756c;

    /* renamed from: d  reason: collision with root package name */
    private i.j f8757d;

    /* renamed from: e  reason: collision with root package name */
    private int f8758e;

    /* renamed from: f  reason: collision with root package name */
    final i.h f8759f;

    /* loaded from: classes.dex */
    class a implements i.h {
        a() {
        }

        @Override // k8.i.h
        public void a(i.k kVar) {
            c.this.w(kVar);
        }

        @Override // k8.i.h
        public void b(List<i.l> list) {
            c.this.x(list);
        }

        @Override // k8.i.h
        public void c() {
            c.this.r();
        }

        @Override // k8.i.h
        public void d() {
            c.this.v();
        }

        @Override // k8.i.h
        public void e() {
            c.this.s();
        }

        @Override // k8.i.h
        public void f(String str) {
            c.this.t(str);
        }

        @Override // k8.i.h
        public void g(i.j jVar) {
            c.this.z(jVar);
        }

        @Override // k8.i.h
        public void h(i.EnumC0152i enumC0152i) {
            c.this.q(enumC0152i);
        }

        @Override // k8.i.h
        public void i(int i10) {
            c.this.y(i10);
        }

        @Override // k8.i.h
        public void j(i.c cVar) {
            c.this.u(cVar);
        }

        @Override // k8.i.h
        public boolean k() {
            return c.this.n();
        }

        @Override // k8.i.h
        public void l(i.g gVar) {
            c.this.B(gVar);
        }

        @Override // k8.i.h
        public CharSequence m(i.e eVar) {
            return c.this.p(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f8761a;

        b(View view) {
            this.f8761a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            k8.i iVar;
            boolean z10;
            if ((i10 & 4) == 0) {
                iVar = c.this.f8755b;
                z10 = true;
            } else {
                iVar = c.this.f8755b;
                z10 = false;
            }
            iVar.m(z10);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i10) {
            this.f8761a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.b.this.b(i10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.platform.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0132c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8763a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f8764b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f8765c;

        static {
            int[] iArr = new int[i.d.values().length];
            f8765c = iArr;
            try {
                iArr[i.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8765c[i.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i.l.values().length];
            f8764b = iArr2;
            try {
                iArr2[i.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8764b[i.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[i.g.values().length];
            f8763a = iArr3;
            try {
                iArr3[i.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8763a[i.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8763a[i.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8763a[i.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8763a[i.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean c();
    }

    public c(Activity activity, k8.i iVar, d dVar) {
        a aVar = new a();
        this.f8759f = aVar;
        this.f8754a = activity;
        this.f8755b = iVar;
        iVar.l(aVar);
        this.f8756c = dVar;
        this.f8758e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f8754a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence p(i.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f8754a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != i.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getUri() != null) {
                    this.f8754a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
                }
                return itemAt.coerceToText(this.f8754a);
            } catch (FileNotFoundException unused) {
                return null;
            } catch (SecurityException e10) {
                x7.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(i.EnumC0152i enumC0152i) {
        if (enumC0152i == i.EnumC0152i.CLICK) {
            this.f8754a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        d dVar = this.f8756c;
        if (dVar == null || !dVar.c()) {
            Activity activity = this.f8754a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).i().c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        ((ClipboardManager) this.f8754a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(i.c cVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            return;
        }
        if (i10 < 28 && i10 > 21) {
            this.f8754a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f10726b, (Bitmap) null, cVar.f10725a));
        }
        if (i10 >= 28) {
            this.f8754a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f10726b, 0, cVar.f10725a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        View decorView = this.f8754a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(i.k kVar) {
        int i10;
        if (kVar == i.k.LEAN_BACK) {
            i10 = 1798;
        } else if (kVar == i.k.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
            i10 = 3846;
        } else if (kVar == i.k.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
            i10 = 5894;
        } else if (kVar != i.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i10 = 1792;
        }
        this.f8758e = i10;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(List<i.l> list) {
        int i10 = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = C0132c.f8764b[list.get(i11).ordinal()];
            if (i12 == 1) {
                i10 &= -5;
            } else if (i12 == 2) {
                i10 = i10 & (-513) & (-3);
            }
        }
        this.f8758e = i10;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i10) {
        this.f8754a.setRequestedOrientation(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public void z(i.j jVar) {
        Window window = this.f8754a.getWindow();
        f0 f0Var = new f0(window, window.getDecorView());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i10 >= 23) {
            i.d dVar = jVar.f10752b;
            if (dVar != null) {
                int i11 = C0132c.f8765c[dVar.ordinal()];
                if (i11 == 1) {
                    f0Var.b(true);
                } else if (i11 == 2) {
                    f0Var.b(false);
                }
            }
            Integer num = jVar.f10751a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f10753c;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            i.d dVar2 = jVar.f10755e;
            if (dVar2 != null) {
                int i12 = C0132c.f8765c[dVar2.ordinal()];
                if (i12 == 1) {
                    f0Var.a(true);
                } else if (i12 == 2) {
                    f0Var.a(false);
                }
            }
            Integer num2 = jVar.f10754d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f10756f;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f10757g;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f8757d = jVar;
    }

    public void A() {
        this.f8754a.getWindow().getDecorView().setSystemUiVisibility(this.f8758e);
        i.j jVar = this.f8757d;
        if (jVar != null) {
            z(jVar);
        }
    }

    void B(i.g gVar) {
        int i10;
        View decorView = this.f8754a.getWindow().getDecorView();
        int i11 = C0132c.f8763a[gVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        if (i11 != 5 || Build.VERSION.SDK_INT < 21) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        i10 = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i12);
            return;
        }
        i10 = 0;
        decorView.performHapticFeedback(i10);
    }

    public void o() {
        this.f8755b.l(null);
    }
}
