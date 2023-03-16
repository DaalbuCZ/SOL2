package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.g;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class SidecarCompat implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2416f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final SidecarInterface f2417a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2418b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<IBinder, Activity> f2419c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Activity, ComponentCallbacks> f2420d;

    /* renamed from: e  reason: collision with root package name */
    private g.a f2421e;

    /* loaded from: classes.dex */
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a  reason: collision with root package name */
        private final m f2422a;

        /* renamed from: b  reason: collision with root package name */
        private final SidecarInterface.SidecarCallback f2423b;

        /* renamed from: c  reason: collision with root package name */
        private final ReentrantLock f2424c;

        /* renamed from: d  reason: collision with root package name */
        private SidecarDeviceState f2425d;

        /* renamed from: e  reason: collision with root package name */
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f2426e;

        public DistinctSidecarElementCallback(m mVar, SidecarInterface.SidecarCallback sidecarCallback) {
            k9.k.e(mVar, "sidecarAdapter");
            k9.k.e(sidecarCallback, "callbackInterface");
            this.f2422a = mVar;
            this.f2423b = sidecarCallback;
            this.f2424c = new ReentrantLock();
            this.f2426e = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            k9.k.e(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f2424c;
            reentrantLock.lock();
            try {
                if (this.f2422a.a(this.f2425d, sidecarDeviceState)) {
                    return;
                }
                this.f2425d = sidecarDeviceState;
                this.f2423b.onDeviceStateChanged(sidecarDeviceState);
                y8.s sVar = y8.s.f17099a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            k9.k.e(iBinder, "token");
            k9.k.e(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f2424c) {
                if (this.f2422a.d(this.f2426e.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f2426e.put(iBinder, sidecarWindowLayoutInfo);
                this.f2423b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SidecarCompat f2427a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            k9.k.e(sidecarCompat, "this$0");
            this.f2427a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface g10;
            k9.k.e(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = this.f2427a.f2419c.values();
            SidecarCompat sidecarCompat = this.f2427a;
            for (Activity activity : values) {
                IBinder a10 = SidecarCompat.f2416f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a10 != null && (g10 = sidecarCompat.g()) != null) {
                    sidecarWindowLayoutInfo = g10.getWindowLayoutInfo(a10);
                }
                g.a aVar = sidecarCompat.f2421e;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.f2418b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            k9.k.e(iBinder, "windowToken");
            k9.k.e(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f2427a.f2419c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            m mVar = this.f2427a.f2418b;
            SidecarInterface g10 = this.f2427a.g();
            SidecarDeviceState deviceState = g10 == null ? null : g10.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            v e10 = mVar.e(sidecarWindowLayoutInfo, deviceState);
            g.a aVar = this.f2427a.f2421e;
            if (aVar == null) {
                return;
            }
            aVar.a(activity, e10);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            k9.k.e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final i0.h c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return i0.h.f8223s.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final g.a f2428a;

        /* renamed from: b  reason: collision with root package name */
        private final ReentrantLock f2429b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakHashMap<Activity, v> f2430c;

        public b(g.a aVar) {
            k9.k.e(aVar, "callbackInterface");
            this.f2428a = aVar;
            this.f2429b = new ReentrantLock();
            this.f2430c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.g.a
        public void a(Activity activity, v vVar) {
            k9.k.e(activity, "activity");
            k9.k.e(vVar, "newLayout");
            ReentrantLock reentrantLock = this.f2429b;
            reentrantLock.lock();
            try {
                if (k9.k.a(vVar, this.f2430c.get(activity))) {
                    return;
                }
                this.f2430c.put(activity, vVar);
                reentrantLock.unlock();
                this.f2428a.a(activity, vVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: n  reason: collision with root package name */
        private final SidecarCompat f2431n;

        /* renamed from: o  reason: collision with root package name */
        private final WeakReference<Activity> f2432o;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            k9.k.e(sidecarCompat, "sidecarCompat");
            k9.k.e(activity, "activity");
            this.f2431n = sidecarCompat;
            this.f2432o = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            k9.k.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f2432o.get();
            IBinder a10 = SidecarCompat.f2416f.a(activity);
            if (activity == null || a10 == null) {
                return;
            }
            this.f2431n.i(a10, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            k9.k.e(view, "view");
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements ComponentCallbacks {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Activity f2434o;

        d(Activity activity) {
            this.f2434o = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            k9.k.e(configuration, "newConfig");
            g.a aVar = SidecarCompat.this.f2421e;
            if (aVar == null) {
                return;
            }
            Activity activity = this.f2434o;
            aVar.a(activity, SidecarCompat.this.h(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f2416f.b(context), new m(null, 1, null));
        k9.k.e(context, "context");
    }

    public SidecarCompat(SidecarInterface sidecarInterface, m mVar) {
        k9.k.e(mVar, "sidecarAdapter");
        this.f2417a = sidecarInterface;
        this.f2418b = mVar;
        this.f2419c = new LinkedHashMap();
        this.f2420d = new LinkedHashMap();
    }

    private final void j(Activity activity) {
        if (this.f2420d.get(activity) == null) {
            d dVar = new d(activity);
            this.f2420d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    private final void k(Activity activity) {
        activity.unregisterComponentCallbacks(this.f2420d.get(activity));
        this.f2420d.remove(activity);
    }

    @Override // androidx.window.layout.g
    public void a(Activity activity) {
        k9.k.e(activity, "activity");
        IBinder a10 = f2416f.a(activity);
        if (a10 != null) {
            i(a10, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
    }

    @Override // androidx.window.layout.g
    public void b(g.a aVar) {
        k9.k.e(aVar, "extensionCallback");
        this.f2421e = new b(aVar);
        SidecarInterface sidecarInterface = this.f2417a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f2418b, new TranslatingCallback(this)));
    }

    @Override // androidx.window.layout.g
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        k9.k.e(activity, "activity");
        IBinder a10 = f2416f.a(activity);
        if (a10 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f2417a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a10);
        }
        k(activity);
        boolean z10 = this.f2419c.size() == 1;
        this.f2419c.remove(a10);
        if (!z10 || (sidecarInterface = this.f2417a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface g() {
        return this.f2417a;
    }

    public final v h(Activity activity) {
        List d10;
        k9.k.e(activity, "activity");
        IBinder a10 = f2416f.a(activity);
        if (a10 == null) {
            d10 = z8.j.d();
            return new v(d10);
        }
        SidecarInterface sidecarInterface = this.f2417a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(a10);
        m mVar = this.f2418b;
        SidecarInterface sidecarInterface2 = this.f2417a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return mVar.e(windowLayoutInfo, deviceState);
    }

    public final void i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        k9.k.e(iBinder, "windowToken");
        k9.k.e(activity, "activity");
        this.f2419c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f2417a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f2419c.size() == 1 && (sidecarInterface = this.f2417a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        g.a aVar = this.f2421e;
        if (aVar != null) {
            aVar.a(activity, h(activity));
        }
        j(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008e, B:57:0x00ae, B:59:0x00b6, B:61:0x00bc, B:67:0x00f2, B:68:0x010e, B:70:0x0112, B:72:0x0141, B:75:0x014a, B:76:0x0151, B:77:0x0152, B:78:0x0159, B:63:0x00bf, B:65:0x00ea, B:79:0x015a, B:80:0x0161, B:81:0x0162, B:82:0x0169, B:83:0x016a, B:84:0x0175, B:56:0x00aa, B:50:0x0094, B:53:0x009b, B:85:0x0176, B:86:0x0181, B:44:0x0082, B:38:0x006b, B:41:0x0072, B:87:0x0182, B:88:0x018d, B:32:0x0059, B:26:0x0042, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018e, B:90:0x0199, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:95:0x0002, inners: #0, #2 }] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.l():boolean");
    }
}
