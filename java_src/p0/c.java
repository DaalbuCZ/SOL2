package p0;

import java.util.ArrayList;
import java.util.List;
import s0.p;
/* loaded from: classes.dex */
public abstract class c<T> implements o0.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f12192a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f12193b;

    /* renamed from: c  reason: collision with root package name */
    private q0.d<T> f12194c;

    /* renamed from: d  reason: collision with root package name */
    private a f12195d;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(q0.d<T> dVar) {
        this.f12194c = dVar;
    }

    private void h(a aVar, T t10) {
        if (this.f12192a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || c(t10)) {
            aVar.b(this.f12192a);
        } else {
            aVar.a(this.f12192a);
        }
    }

    @Override // o0.a
    public void a(T t10) {
        this.f12193b = t10;
        h(this.f12195d, t10);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f12193b;
        return t10 != null && c(t10) && this.f12192a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f12192a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f12192a.add(pVar.f13231a);
            }
        }
        if (this.f12192a.isEmpty()) {
            this.f12194c.c(this);
        } else {
            this.f12194c.a(this);
        }
        h(this.f12195d, this.f12193b);
    }

    public void f() {
        if (this.f12192a.isEmpty()) {
            return;
        }
        this.f12192a.clear();
        this.f12194c.c(this);
    }

    public void g(a aVar) {
        if (this.f12195d != aVar) {
            this.f12195d = aVar;
            h(aVar, this.f12193b);
        }
    }
}
