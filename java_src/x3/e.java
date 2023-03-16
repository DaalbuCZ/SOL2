package x3;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import x3.a;
import x3.a.d;
import y3.z;
import z3.d;
import z3.o;
/* loaded from: classes.dex */
public abstract class e<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16318a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16319b;

    /* renamed from: c  reason: collision with root package name */
    private final x3.a<O> f16320c;

    /* renamed from: d  reason: collision with root package name */
    private final O f16321d;

    /* renamed from: e  reason: collision with root package name */
    private final y3.b<O> f16322e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f16323f;

    /* renamed from: g  reason: collision with root package name */
    private final int f16324g;
    @NotOnlyInitialized

    /* renamed from: h  reason: collision with root package name */
    private final f f16325h;

    /* renamed from: i  reason: collision with root package name */
    private final y3.k f16326i;

    /* renamed from: j  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.b f16327j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f16328c = new C0237a().a();

        /* renamed from: a  reason: collision with root package name */
        public final y3.k f16329a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f16330b;

        /* renamed from: x3.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0237a {

            /* renamed from: a  reason: collision with root package name */
            private y3.k f16331a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f16332b;

            public a a() {
                if (this.f16331a == null) {
                    this.f16331a = new y3.a();
                }
                if (this.f16332b == null) {
                    this.f16332b = Looper.getMainLooper();
                }
                return new a(this.f16331a, this.f16332b);
            }
        }

        private a(y3.k kVar, Account account, Looper looper) {
            this.f16329a = kVar;
            this.f16330b = looper;
        }
    }

    private e(Context context, Activity activity, x3.a<O> aVar, O o10, a aVar2) {
        o.j(context, "Null context is not permitted.");
        o.j(aVar, "Api must not be null.");
        o.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f16318a = context.getApplicationContext();
        String str = null;
        if (d4.l.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f16319b = str;
        this.f16320c = aVar;
        this.f16321d = o10;
        this.f16323f = aVar2.f16330b;
        y3.b<O> a10 = y3.b.a(aVar, o10, str);
        this.f16322e = a10;
        this.f16325h = new y3.o(this);
        com.google.android.gms.common.api.internal.b x10 = com.google.android.gms.common.api.internal.b.x(this.f16318a);
        this.f16327j = x10;
        this.f16324g = x10.m();
        this.f16326i = aVar2.f16329a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.f.u(activity, x10, a10);
        }
        x10.b(this);
    }

    public e(Context context, x3.a<O> aVar, O o10, a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }

    private final <TResult, A extends a.b> t4.i<TResult> i(int i10, com.google.android.gms.common.api.internal.c<A, TResult> cVar) {
        t4.j jVar = new t4.j();
        this.f16327j.D(this, i10, cVar, jVar, this.f16326i);
        return jVar.a();
    }

    protected d.a b() {
        Account a10;
        GoogleSignInAccount b10;
        GoogleSignInAccount b11;
        d.a aVar = new d.a();
        O o10 = this.f16321d;
        if (!(o10 instanceof a.d.b) || (b11 = ((a.d.b) o10).b()) == null) {
            O o11 = this.f16321d;
            a10 = o11 instanceof a.d.InterfaceC0236a ? ((a.d.InterfaceC0236a) o11).a() : null;
        } else {
            a10 = b11.k();
        }
        aVar.d(a10);
        O o12 = this.f16321d;
        aVar.c((!(o12 instanceof a.d.b) || (b10 = ((a.d.b) o12).b()) == null) ? Collections.emptySet() : b10.G());
        aVar.e(this.f16318a.getClass().getName());
        aVar.b(this.f16318a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> t4.i<TResult> c(com.google.android.gms.common.api.internal.c<A, TResult> cVar) {
        return i(2, cVar);
    }

    public final y3.b<O> d() {
        return this.f16322e;
    }

    protected String e() {
        return this.f16319b;
    }

    public final int f() {
        return this.f16324g;
    }

    public final a.f g(Looper looper, com.google.android.gms.common.api.internal.m<O> mVar) {
        a.f a10 = ((a.AbstractC0235a) o.i(this.f16320c.a())).a(this.f16318a, looper, b().a(), this.f16321d, mVar, mVar);
        String e10 = e();
        if (e10 != null && (a10 instanceof z3.c)) {
            ((z3.c) a10).P(e10);
        }
        if (e10 != null && (a10 instanceof y3.g)) {
            ((y3.g) a10).r(e10);
        }
        return a10;
    }

    public final z h(Context context, Handler handler) {
        return new z(context, handler, b().a());
    }
}
