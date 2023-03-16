package g6;

import android.content.Context;
import android.util.Base64OutputStream;
import g6.j;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import k5.f0;
import k5.r;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final i6.b<k> f7559a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7560b;

    /* renamed from: c  reason: collision with root package name */
    private final i6.b<c7.i> f7561c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<g> f7562d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f7563e;

    private f(final Context context, final String str, Set<g> set, i6.b<c7.i> bVar, Executor executor) {
        this(new i6.b() { // from class: g6.b
            @Override // i6.b
            public final Object get() {
                k j10;
                j10 = f.j(context, str);
                return j10;
            }
        }, set, executor, bVar, context);
    }

    f(i6.b<k> bVar, Set<g> set, Executor executor, i6.b<c7.i> bVar2, Context context) {
        this.f7559a = bVar;
        this.f7562d = set;
        this.f7563e = executor;
        this.f7561c = bVar2;
        this.f7560b = context;
    }

    public static k5.c<f> g() {
        final f0 a10 = f0.a(j5.a.class, Executor.class);
        return k5.c.d(f.class, i.class, j.class).b(r.j(Context.class)).b(r.j(f5.e.class)).b(r.m(g.class)).b(r.l(c7.i.class)).b(r.k(a10)).f(new k5.h() { // from class: g6.e
            @Override // k5.h
            public final Object a(k5.e eVar) {
                f h10;
                h10 = f.h(f0.this, eVar);
                return h10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(f0 f0Var, k5.e eVar) {
        return new f((Context) eVar.a(Context.class), ((f5.e) eVar.a(f5.e.class)).r(), eVar.c(g.class), eVar.f(c7.i.class), (Executor) eVar.h(f0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            k kVar = this.f7559a.get();
            List<l> c10 = kVar.c();
            kVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                l lVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.c());
                jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            this.f7559a.get().k(System.currentTimeMillis(), this.f7561c.get().a());
        }
        return null;
    }

    @Override // g6.i
    public t4.i<String> a() {
        return androidx.core.os.i.a(this.f7560b) ^ true ? t4.l.e("") : t4.l.c(this.f7563e, new Callable() { // from class: g6.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i10;
                i10 = f.this.i();
                return i10;
            }
        });
    }

    @Override // g6.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f7559a.get();
        if (!kVar.i(currentTimeMillis)) {
            return j.a.NONE;
        }
        kVar.g();
        return j.a.GLOBAL;
    }

    public t4.i<Void> l() {
        if (this.f7562d.size() > 0 && !(!androidx.core.os.i.a(this.f7560b))) {
            return t4.l.c(this.f7563e, new Callable() { // from class: g6.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void k10;
                    k10 = f.this.k();
                    return k10;
                }
            });
        }
        return t4.l.e(null);
    }
}
