package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.layout.j;
import androidx.window.layout.k;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import i0.f;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2472b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f2473c = m.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final f.b f2474a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final int a(SidecarDeviceState sidecarDeviceState) {
            k9.k.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            k9.k.e(sidecarDeviceState, "sidecarDeviceState");
            int a10 = a(sidecarDeviceState);
            if (a10 < 0 || a10 > 4) {
                return 0;
            }
            return a10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            List<SidecarDisplayFeature> d10;
            List<SidecarDisplayFeature> d11;
            k9.k.e(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                    if (list == null) {
                        d11 = z8.j.d();
                        return d11;
                    }
                    return list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    if (invoke != null) {
                        return (List) invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                d10 = z8.j.d();
                return d10;
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(SidecarDeviceState sidecarDeviceState, int i10) {
            k9.k.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends k9.l implements j9.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: o  reason: collision with root package name */
        public static final b f2475o = new b();

        b() {
            super(1);
        }

        @Override // j9.l
        /* renamed from: a */
        public final Boolean c(SidecarDisplayFeature sidecarDisplayFeature) {
            k9.k.e(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends k9.l implements j9.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: o  reason: collision with root package name */
        public static final c f2476o = new c();

        c() {
            super(1);
        }

        @Override // j9.l
        /* renamed from: a */
        public final Boolean c(SidecarDisplayFeature sidecarDisplayFeature) {
            k9.k.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends k9.l implements j9.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: o  reason: collision with root package name */
        public static final d f2477o = new d();

        d() {
            super(1);
        }

        @Override // j9.l
        /* renamed from: a */
        public final Boolean c(SidecarDisplayFeature sidecarDisplayFeature) {
            k9.k.e(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends k9.l implements j9.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: o  reason: collision with root package name */
        public static final e f2478o = new e();

        e() {
            super(1);
        }

        @Override // j9.l
        /* renamed from: a */
        public final Boolean c(SidecarDisplayFeature sidecarDisplayFeature) {
            k9.k.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public m() {
        this(null, 1, null);
    }

    public m(f.b bVar) {
        k9.k.e(bVar, "verificationMode");
        this.f2474a = bVar;
    }

    public /* synthetic */ m(f.b bVar, int i10, k9.g gVar) {
        this((i10 & 1) != 0 ? f.b.QUIET : bVar);
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (k9.k.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return k9.k.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (!b(list.get(i10), list2.get(i10))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (k9.k.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f2472b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (k9.k.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f2472b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final v e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        List d10;
        k9.k.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            d10 = z8.j.d();
            return new v(d10);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a aVar = f2472b;
        aVar.d(sidecarDeviceState2, aVar.b(sidecarDeviceState));
        return new v(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List<androidx.window.layout.e> f(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        k9.k.e(list, "sidecarDisplayFeatures");
        k9.k.e(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : list) {
            androidx.window.layout.e g10 = g(sidecarDisplayFeature, sidecarDeviceState);
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        return arrayList;
    }

    public final androidx.window.layout.e g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        k.b a10;
        j.b bVar;
        k9.k.e(sidecarDisplayFeature, "feature");
        k9.k.e(sidecarDeviceState, "deviceState");
        f.a aVar = i0.f.f8214a;
        String str = f2473c;
        k9.k.d(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) f.a.b(aVar, sidecarDisplayFeature, str, this.f2474a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f2475o).c("Feature bounds must not be 0", c.f2476o).c("TYPE_FOLD must have 0 area", d.f2477o).c("Feature be pinned to either left or top", e.f2478o).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            a10 = k.b.f2461b.a();
        } else if (type != 2) {
            return null;
        } else {
            a10 = k.b.f2461b.b();
        }
        int b10 = f2472b.b(sidecarDeviceState);
        if (b10 == 0 || b10 == 1) {
            return null;
        }
        if (b10 == 2) {
            bVar = j.b.f2455d;
        } else if (b10 != 3 && b10 == 4) {
            return null;
        } else {
            bVar = j.b.f2454c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        k9.k.d(rect, "feature.rect");
        return new k(new i0.b(rect), a10, bVar);
    }
}
