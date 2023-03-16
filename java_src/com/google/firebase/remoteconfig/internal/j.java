package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.m;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class j {

    /* renamed from: j  reason: collision with root package name */
    public static final long f5861j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    static final int[] f5862k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final j6.e f5863a;

    /* renamed from: b  reason: collision with root package name */
    private final i6.b<i5.a> f5864b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5865c;

    /* renamed from: d  reason: collision with root package name */
    private final d4.e f5866d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f5867e;

    /* renamed from: f  reason: collision with root package name */
    private final d f5868f;

    /* renamed from: g  reason: collision with root package name */
    private final ConfigFetchHttpClient f5869g;

    /* renamed from: h  reason: collision with root package name */
    private final m f5870h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f5871i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Date f5872a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5873b;

        /* renamed from: c  reason: collision with root package name */
        private final e f5874c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5875d;

        private a(Date date, int i10, e eVar, String str) {
            this.f5872a = date;
            this.f5873b = i10;
            this.f5874c = eVar;
            this.f5875d = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(e eVar, String str) {
            return new a(eVar.e(), 0, eVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public e d() {
            return this.f5874c;
        }

        String e() {
            return this.f5875d;
        }

        int f() {
            return this.f5873b;
        }
    }

    public j(j6.e eVar, i6.b<i5.a> bVar, Executor executor, d4.e eVar2, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, Map<String, String> map) {
        this.f5863a = eVar;
        this.f5864b = bVar;
        this.f5865c = executor;
        this.f5866d = eVar2;
        this.f5867e = random;
        this.f5868f = dVar;
        this.f5869g = configFetchHttpClient;
        this.f5870h = mVar;
        this.f5871i = map;
    }

    private boolean e(long j10, Date date) {
        Date e10 = this.f5870h.e();
        if (e10.equals(m.f5886d)) {
            return false;
        }
        return date.before(new Date(e10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private d7.i f(d7.i iVar) {
        String str;
        int a10 = iVar.a();
        if (a10 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a10 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a10 == 429) {
            throw new d7.e("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else {
            if (a10 != 500) {
                switch (a10) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        int a11 = iVar.a();
        return new d7.i(a11, "Fetch failed: " + str, iVar);
    }

    private String g(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a j(String str, String str2, Date date) {
        try {
            a fetch = this.f5869g.fetch(this.f5869g.d(), str, str2, p(), this.f5870h.d(), this.f5871i, n(), date);
            if (fetch.e() != null) {
                this.f5870h.i(fetch.e());
            }
            this.f5870h.g();
            return fetch;
        } catch (d7.i e10) {
            m.a w10 = w(e10.a(), date);
            if (v(w10, e10.a())) {
                throw new d7.g(w10.a().getTime());
            }
            throw f(e10);
        }
    }

    private t4.i<a> k(String str, String str2, Date date) {
        try {
            final a j10 = j(str, str2, date);
            return j10.f() != 0 ? t4.l.e(j10) : this.f5868f.k(j10.d()).q(this.f5865c, new t4.h() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // t4.h
                public final t4.i a(Object obj) {
                    t4.i e10;
                    e eVar = (e) obj;
                    e10 = t4.l.e(j.a.this);
                    return e10;
                }
            });
        } catch (d7.f e10) {
            return t4.l.d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public t4.i<a> r(t4.i<e> iVar, long j10) {
        t4.i j11;
        final Date date = new Date(this.f5866d.a());
        if (iVar.p() && e(j10, date)) {
            return t4.l.e(a.c(date));
        }
        Date m10 = m(date);
        if (m10 != null) {
            j11 = t4.l.d(new d7.g(g(m10.getTime() - date.getTime()), m10.getTime()));
        } else {
            final t4.i<String> a10 = this.f5863a.a();
            final t4.i<com.google.firebase.installations.g> b10 = this.f5863a.b(false);
            j11 = t4.l.i(a10, b10).j(this.f5865c, new t4.a() { // from class: com.google.firebase.remoteconfig.internal.h
                @Override // t4.a
                public final Object a(t4.i iVar2) {
                    t4.i t10;
                    t10 = j.this.t(a10, b10, date, iVar2);
                    return t10;
                }
            });
        }
        return j11.j(this.f5865c, new t4.a() { // from class: com.google.firebase.remoteconfig.internal.g
            @Override // t4.a
            public final Object a(t4.i iVar2) {
                t4.i u10;
                u10 = j.this.u(date, iVar2);
                return u10;
            }
        });
    }

    private Date m(Date date) {
        Date a10 = this.f5870h.a().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    private Long n() {
        i5.a aVar = this.f5864b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.a(true).get("_fot");
    }

    private long o(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f5862k;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + this.f5867e.nextInt((int) millis);
    }

    private Map<String, String> p() {
        HashMap hashMap = new HashMap();
        i5.a aVar = this.f5864b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean q(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t4.i t(t4.i iVar, t4.i iVar2, Date date, t4.i iVar3) {
        return !iVar.p() ? t4.l.d(new d7.e("Firebase Installations failed to get installation ID for fetch.", iVar.k())) : !iVar2.p() ? t4.l.d(new d7.e("Firebase Installations failed to get installation auth token for fetch.", iVar2.k())) : k((String) iVar.l(), ((com.google.firebase.installations.g) iVar2.l()).b(), date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t4.i u(Date date, t4.i iVar) {
        y(iVar, date);
        return iVar;
    }

    private boolean v(m.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    private m.a w(int i10, Date date) {
        if (q(i10)) {
            x(date);
        }
        return this.f5870h.a();
    }

    private void x(Date date) {
        int b10 = this.f5870h.a().b() + 1;
        this.f5870h.h(b10, new Date(date.getTime() + o(b10)));
    }

    private void y(t4.i<a> iVar, Date date) {
        if (iVar.p()) {
            this.f5870h.k(date);
            return;
        }
        Exception k10 = iVar.k();
        if (k10 == null) {
            return;
        }
        if (k10 instanceof d7.g) {
            this.f5870h.l();
        } else {
            this.f5870h.j();
        }
    }

    public t4.i<a> h() {
        return i(this.f5870h.f());
    }

    public t4.i<a> i(final long j10) {
        return this.f5868f.e().j(this.f5865c, new t4.a() { // from class: com.google.firebase.remoteconfig.internal.f
            @Override // t4.a
            public final Object a(t4.i iVar) {
                t4.i r10;
                r10 = j.this.r(j10, iVar);
                return r10;
            }
        });
    }
}
