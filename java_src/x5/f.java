package x5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import q5.f0;
import q5.r;
import q5.s;
import q5.t;
import q5.w;
/* loaded from: classes.dex */
public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16356a;

    /* renamed from: b  reason: collision with root package name */
    private final j f16357b;

    /* renamed from: c  reason: collision with root package name */
    private final g f16358c;

    /* renamed from: d  reason: collision with root package name */
    private final r f16359d;

    /* renamed from: e  reason: collision with root package name */
    private final x5.a f16360e;

    /* renamed from: f  reason: collision with root package name */
    private final k f16361f;

    /* renamed from: g  reason: collision with root package name */
    private final s f16362g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<d> f16363h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<t4.j<d>> f16364i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements t4.h<Void, Void> {
        a() {
        }

        @Override // t4.h
        /* renamed from: b */
        public t4.i<Void> a(Void r52) {
            JSONObject a10 = f.this.f16361f.a(f.this.f16357b, true);
            if (a10 != null) {
                d b10 = f.this.f16358c.b(a10);
                f.this.f16360e.c(b10.f16341c, a10);
                f.this.q(a10, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.f16357b.f16372f);
                f.this.f16363h.set(b10);
                ((t4.j) f.this.f16364i.get()).e(b10);
            }
            return t4.l.e(null);
        }
    }

    f(Context context, j jVar, r rVar, g gVar, x5.a aVar, k kVar, s sVar) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f16363h = atomicReference;
        this.f16364i = new AtomicReference<>(new t4.j());
        this.f16356a = context;
        this.f16357b = jVar;
        this.f16359d = rVar;
        this.f16358c = gVar;
        this.f16360e = aVar;
        this.f16361f = kVar;
        this.f16362g = sVar;
        atomicReference.set(b.b(rVar));
    }

    public static f l(Context context, String str, w wVar, u5.b bVar, String str2, String str3, v5.f fVar, s sVar) {
        String g10 = wVar.g();
        f0 f0Var = new f0();
        return new f(context, new j(str, wVar.h(), wVar.i(), wVar.j(), wVar, q5.h.h(q5.h.o(context), str, str3, str2), str3, str2, t.e(g10).g()), f0Var, new g(f0Var), new x5.a(fVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), sVar);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b10 = this.f16360e.b();
                if (b10 != null) {
                    d b11 = this.f16358c.b(b10);
                    if (b11 != null) {
                        q(b10, "Loaded cached settings: ");
                        long a10 = this.f16359d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b11.a(a10)) {
                            n5.f.f().i("Cached settings have expired.");
                        }
                        try {
                            n5.f.f().i("Returning cached settings.");
                            dVar = b11;
                        } catch (Exception e10) {
                            e = e10;
                            dVar = b11;
                            n5.f.f().e("Failed to get cached settings", e);
                            return dVar;
                        }
                    } else {
                        n5.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    n5.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return dVar;
    }

    private String n() {
        return q5.h.s(this.f16356a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        n5.f f10 = n5.f.f();
        f10.b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = q5.h.s(this.f16356a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // x5.i
    public t4.i<d> a() {
        return this.f16364i.get().a();
    }

    @Override // x5.i
    public d b() {
        return this.f16363h.get();
    }

    boolean k() {
        return !n().equals(this.f16357b.f16372f);
    }

    public t4.i<Void> o(Executor executor) {
        return p(e.USE_CACHE, executor);
    }

    public t4.i<Void> p(e eVar, Executor executor) {
        d m10;
        if (!k() && (m10 = m(eVar)) != null) {
            this.f16363h.set(m10);
            this.f16364i.get().e(m10);
            return t4.l.e(null);
        }
        d m11 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m11 != null) {
            this.f16363h.set(m11);
            this.f16364i.get().e(m11);
        }
        return this.f16362g.j(executor).q(executor, new a());
    }
}
