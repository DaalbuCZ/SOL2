package y0;
/* loaded from: classes.dex */
public class o2<T> implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final j3<String> f16630n;

    /* renamed from: o  reason: collision with root package name */
    private final q<T> f16631o;

    /* renamed from: p  reason: collision with root package name */
    private final h2<Boolean> f16632p;

    public o2(j3<String> j3Var, q<T> qVar, h2<Boolean> h2Var) {
        this.f16630n = j3Var;
        this.f16631o = qVar;
        this.f16632p = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16632p.a(Boolean.valueOf(this.f16631o.b() instanceof Float ? this.f16630n.e(this.f16631o.a(), (Float) this.f16631o.b()) : this.f16631o.b() instanceof Integer ? this.f16630n.f(this.f16631o.a(), (Integer) this.f16631o.b()) : this.f16631o.b() instanceof String ? this.f16630n.c(this.f16631o.a(), (String) this.f16631o.b()) : this.f16631o.b() instanceof Boolean ? this.f16630n.h(this.f16631o.a(), (Boolean) this.f16631o.b()) : false));
        } catch (Throwable th) {
            this.f16632p.b(th);
        }
    }
}
