package v6;

import a7.o;
import b7.h;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z6.k;
/* loaded from: classes.dex */
public final class h extends com.google.firebase.perf.application.b implements y6.b {

    /* renamed from: v  reason: collision with root package name */
    private static final u6.a f15721v = u6.a.e();

    /* renamed from: n  reason: collision with root package name */
    private final List<y6.a> f15722n;

    /* renamed from: o  reason: collision with root package name */
    private final GaugeManager f15723o;

    /* renamed from: p  reason: collision with root package name */
    private final k f15724p;

    /* renamed from: q  reason: collision with root package name */
    private final h.b f15725q;

    /* renamed from: r  reason: collision with root package name */
    private final WeakReference<y6.b> f15726r;

    /* renamed from: s  reason: collision with root package name */
    private String f15727s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f15728t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f15729u;

    private h(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public h(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f15725q = b7.h.F0();
        this.f15726r = new WeakReference<>(this);
        this.f15724p = kVar;
        this.f15723o = gaugeManager;
        this.f15722n = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static h c(k kVar) {
        return new h(kVar);
    }

    private boolean j() {
        return this.f15725q.Q();
    }

    private boolean k() {
        return this.f15725q.S();
    }

    private static boolean m(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    public h A(String str) {
        this.f15727s = str;
        return this;
    }

    @Override // y6.b
    public void a(y6.a aVar) {
        if (aVar == null) {
            f15721v.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (!j() || k()) {
        } else {
            this.f15722n.add(aVar);
        }
    }

    public b7.h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f15726r);
        unregisterForAppState();
        b7.k[] b10 = y6.a.b(d());
        if (b10 != null) {
            this.f15725q.L(Arrays.asList(b10));
        }
        b7.h a10 = this.f15725q.a();
        if (!x6.e.c(this.f15727s)) {
            f15721v.a("Dropping network request from a 'User-Agent' that is not allowed");
            return a10;
        } else if (this.f15728t) {
            if (this.f15729u) {
                f15721v.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return a10;
        } else {
            this.f15724p.B(a10, getAppState());
            this.f15728t = true;
            return a10;
        }
    }

    List<y6.a> d() {
        List<y6.a> unmodifiableList;
        synchronized (this.f15722n) {
            ArrayList arrayList = new ArrayList();
            for (y6.a aVar : this.f15722n) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public long e() {
        return this.f15725q.O();
    }

    public String f() {
        return this.f15725q.P();
    }

    public boolean i() {
        return this.f15725q.R();
    }

    public h n(Map<String, String> map) {
        this.f15725q.M().T(map);
        return this;
    }

    public h o(String str) {
        if (str != null) {
            h.d dVar = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    dVar = h.d.OPTIONS;
                    break;
                case 1:
                    dVar = h.d.GET;
                    break;
                case 2:
                    dVar = h.d.PUT;
                    break;
                case 3:
                    dVar = h.d.HEAD;
                    break;
                case 4:
                    dVar = h.d.POST;
                    break;
                case 5:
                    dVar = h.d.PATCH;
                    break;
                case 6:
                    dVar = h.d.TRACE;
                    break;
                case 7:
                    dVar = h.d.CONNECT;
                    break;
                case '\b':
                    dVar = h.d.DELETE;
                    break;
            }
            this.f15725q.V(dVar);
        }
        return this;
    }

    public h p(int i10) {
        this.f15725q.W(i10);
        return this;
    }

    public void q() {
        this.f15729u = true;
    }

    public h r() {
        this.f15725q.X(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public h s(long j10) {
        this.f15725q.Y(j10);
        return this;
    }

    public h t(long j10) {
        y6.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f15726r);
        this.f15725q.U(j10);
        a(perfSession);
        if (perfSession.f()) {
            this.f15723o.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public h u(String str) {
        if (str == null) {
            this.f15725q.N();
            return this;
        }
        if (m(str)) {
            this.f15725q.Z(str);
        } else {
            u6.a aVar = f15721v;
            aVar.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public h v(long j10) {
        this.f15725q.a0(j10);
        return this;
    }

    public h w(long j10) {
        this.f15725q.b0(j10);
        return this;
    }

    public h x(long j10) {
        this.f15725q.c0(j10);
        if (SessionManager.getInstance().perfSession().f()) {
            this.f15723o.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public h y(long j10) {
        this.f15725q.d0(j10);
        return this;
    }

    public h z(String str) {
        if (str != null) {
            this.f15725q.e0(o.e(o.d(str), 2000));
        }
        return this;
    }
}
