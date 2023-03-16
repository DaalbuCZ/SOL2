package com.google.firebase.perf.metrics;

import a7.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import w6.e;
import z6.k;
/* loaded from: classes.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, y6.b {

    /* renamed from: n  reason: collision with root package name */
    private final WeakReference<y6.b> f5735n;

    /* renamed from: o  reason: collision with root package name */
    private final Trace f5736o;

    /* renamed from: p  reason: collision with root package name */
    private final GaugeManager f5737p;

    /* renamed from: q  reason: collision with root package name */
    private final String f5738q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, com.google.firebase.perf.metrics.a> f5739r;

    /* renamed from: s  reason: collision with root package name */
    private final Map<String, String> f5740s;

    /* renamed from: t  reason: collision with root package name */
    private final List<y6.a> f5741t;

    /* renamed from: u  reason: collision with root package name */
    private final List<Trace> f5742u;

    /* renamed from: v  reason: collision with root package name */
    private final k f5743v;

    /* renamed from: w  reason: collision with root package name */
    private final a7.a f5744w;

    /* renamed from: x  reason: collision with root package name */
    private l f5745x;

    /* renamed from: y  reason: collision with root package name */
    private l f5746y;

    /* renamed from: z  reason: collision with root package name */
    private static final u6.a f5734z = u6.a.e();
    private static final Map<String, Trace> A = new ConcurrentHashMap();
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();
    static final Parcelable.Creator<Trace> B = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* loaded from: classes.dex */
    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f5735n = new WeakReference<>(this);
        this.f5736o = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f5738q = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f5742u = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f5739r = concurrentHashMap;
        this.f5740s = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f5745x = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f5746y = (l) parcel.readParcelable(l.class.getClassLoader());
        List<y6.a> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f5741t = synchronizedList;
        parcel.readList(synchronizedList, y6.a.class.getClassLoader());
        if (z10) {
            this.f5743v = null;
            this.f5744w = null;
            this.f5737p = null;
            return;
        }
        this.f5743v = k.k();
        this.f5744w = new a7.a();
        this.f5737p = GaugeManager.getInstance();
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    private Trace(String str) {
        this(str, k.k(), new a7.a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, a7.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, a7.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f5735n = new WeakReference<>(this);
        this.f5736o = null;
        this.f5738q = str.trim();
        this.f5742u = new ArrayList();
        this.f5739r = new ConcurrentHashMap();
        this.f5740s = new ConcurrentHashMap();
        this.f5744w = aVar;
        this.f5743v = kVar;
        this.f5741t = Collections.synchronizedList(new ArrayList());
        this.f5737p = gaugeManager;
    }

    private void b(String str, String str2) {
        if (o()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f5738q));
        }
        if (!this.f5740s.containsKey(str) && this.f5740s.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(str, str2);
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private com.google.firebase.perf.metrics.a p(String str) {
        com.google.firebase.perf.metrics.a aVar = this.f5739r.get(str);
        if (aVar == null) {
            com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
            this.f5739r.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private void q(l lVar) {
        if (this.f5742u.isEmpty()) {
            return;
        }
        Trace trace = this.f5742u.get(this.f5742u.size() - 1);
        if (trace.f5746y == null) {
            trace.f5746y = lVar;
        }
    }

    @Override // y6.b
    public void a(y6.a aVar) {
        if (aVar == null) {
            f5734z.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (!m() || o()) {
        } else {
            this.f5741t.add(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, com.google.firebase.perf.metrics.a> d() {
        return this.f5739r;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l e() {
        return this.f5746y;
    }

    public String f() {
        return this.f5738q;
    }

    protected void finalize() {
        try {
            if (n()) {
                f5734z.k("Trace '%s' is started but not stopped when it is destructed!", this.f5738q);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return this.f5740s.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f5740s);
    }

    @Keep
    public long getLongMetric(String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? this.f5739r.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<y6.a> i() {
        List<y6.a> unmodifiableList;
        synchronized (this.f5741t) {
            ArrayList arrayList = new ArrayList();
            for (y6.a aVar : this.f5741t) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f5734z.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!m()) {
            f5734z.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f5738q);
        } else if (o()) {
            f5734z.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f5738q);
        } else {
            com.google.firebase.perf.metrics.a p10 = p(str.trim());
            p10.c(j10);
            f5734z.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(p10.a()), this.f5738q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l j() {
        return this.f5745x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Trace> k() {
        return this.f5742u;
    }

    boolean m() {
        return this.f5745x != null;
    }

    boolean n() {
        return m() && !o();
    }

    boolean o() {
        return this.f5746y != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f5734z.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f5738q);
            z10 = true;
        } catch (Exception e10) {
            f5734z.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f5740s.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f5734z.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!m()) {
            f5734z.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f5738q);
        } else if (o()) {
            f5734z.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f5738q);
        } else {
            p(str.trim()).d(j10);
            f5734z.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f5738q);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (o()) {
            f5734z.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f5740s.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f5734z.a("Trace feature is disabled.");
            return;
        }
        String f10 = e.f(this.f5738q);
        if (f10 != null) {
            f5734z.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f5738q, f10);
        } else if (this.f5745x != null) {
            f5734z.d("Trace '%s' has already started, should not start again!", this.f5738q);
        } else {
            this.f5745x = this.f5744w.a();
            registerForAppState();
            y6.a perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f5735n);
            a(perfSession);
            if (perfSession.f()) {
                this.f5737p.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!m()) {
            f5734z.d("Trace '%s' has not been started so unable to stop!", this.f5738q);
        } else if (o()) {
            f5734z.d("Trace '%s' has already stopped, should not stop again!", this.f5738q);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f5735n);
            unregisterForAppState();
            l a10 = this.f5744w.a();
            this.f5746y = a10;
            if (this.f5736o == null) {
                q(a10);
                if (this.f5738q.isEmpty()) {
                    f5734z.c("Trace name is empty, no log is sent to server");
                    return;
                }
                this.f5743v.C(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
                if (SessionManager.getInstance().perfSession().f()) {
                    this.f5737p.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                }
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5736o, 0);
        parcel.writeString(this.f5738q);
        parcel.writeList(this.f5742u);
        parcel.writeMap(this.f5739r);
        parcel.writeParcelable(this.f5745x, 0);
        parcel.writeParcelable(this.f5746y, 0);
        synchronized (this.f5741t) {
            parcel.writeList(this.f5741t);
        }
    }
}
