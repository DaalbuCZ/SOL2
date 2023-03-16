package x3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import x3.a.d;
import x3.f;
import z3.c;
import z3.o;
/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0235a<?, O> f16313a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f16314b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16315c;

    /* renamed from: x3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0235a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, z3.d dVar, O o10, f.a aVar, f.b bVar) {
            return b(context, looper, dVar, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, z3.d dVar, O o10, y3.c cVar, y3.h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: x3.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0236a extends d {
            Account a();
        }

        /* loaded from: classes.dex */
        public interface b extends d {
            GoogleSignInAccount b();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        boolean a();

        Set<Scope> c();

        void d(c.e eVar);

        void e(String str);

        void f(c.InterfaceC0247c interfaceC0247c);

        boolean g();

        int h();

        boolean i();

        w3.d[] j();

        String k();

        String l();

        void m();

        boolean n();

        void o(z3.i iVar, Set<Scope> set);
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0235a<C, O> abstractC0235a, g<C> gVar) {
        o.j(abstractC0235a, "Cannot construct an Api with a null ClientBuilder");
        o.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f16315c = str;
        this.f16313a = abstractC0235a;
        this.f16314b = gVar;
    }

    public final AbstractC0235a<?, O> a() {
        return this.f16313a;
    }

    public final String b() {
        return this.f16315c;
    }
}
