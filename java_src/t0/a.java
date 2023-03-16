package t0;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import k0.m;
import k0.s;
import s0.q;
/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final l0.c f14422n = new l0.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0215a extends a {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ l0.i f14423o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ UUID f14424p;

        C0215a(l0.i iVar, UUID uuid) {
            this.f14423o = iVar;
            this.f14424p = uuid;
        }

        @Override // t0.a
        void h() {
            WorkDatabase o10 = this.f14423o.o();
            o10.c();
            try {
                a(this.f14423o, this.f14424p.toString());
                o10.r();
                o10.g();
                g(this.f14423o);
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ l0.i f14425o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f14426p;

        b(l0.i iVar, String str) {
            this.f14425o = iVar;
            this.f14426p = str;
        }

        @Override // t0.a
        void h() {
            WorkDatabase o10 = this.f14425o.o();
            o10.c();
            try {
                for (String str : o10.B().n(this.f14426p)) {
                    a(this.f14425o, str);
                }
                o10.r();
                o10.g();
                g(this.f14425o);
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends a {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ l0.i f14427o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f14428p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f14429q;

        c(l0.i iVar, String str, boolean z10) {
            this.f14427o = iVar;
            this.f14428p = str;
            this.f14429q = z10;
        }

        @Override // t0.a
        void h() {
            WorkDatabase o10 = this.f14427o.o();
            o10.c();
            try {
                for (String str : o10.B().g(this.f14428p)) {
                    a(this.f14427o, str);
                }
                o10.r();
                o10.g();
                if (this.f14429q) {
                    g(this.f14427o);
                }
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, l0.i iVar) {
        return new C0215a(iVar, uuid);
    }

    public static a c(String str, l0.i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, l0.i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q B = workDatabase.B();
        s0.b t10 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s j10 = B.j(str2);
            if (j10 != s.SUCCEEDED && j10 != s.FAILED) {
                B.c(s.CANCELLED, str2);
            }
            linkedList.addAll(t10.c(str2));
        }
    }

    void a(l0.i iVar, String str) {
        f(iVar.o(), str);
        iVar.m().l(str);
        for (l0.e eVar : iVar.n()) {
            eVar.a(str);
        }
    }

    public k0.m e() {
        return this.f14422n;
    }

    void g(l0.i iVar) {
        l0.f.b(iVar.i(), iVar.o(), iVar.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f14422n.a(k0.m.f10508a);
        } catch (Throwable th) {
            this.f14422n.a(new m.b.a(th));
        }
    }
}
