package z3;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static p f17428b;

    /* renamed from: c  reason: collision with root package name */
    private static final q f17429c = new q(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private q f17430a;

    private p() {
    }

    public static synchronized p b() {
        p pVar;
        synchronized (p.class) {
            if (f17428b == null) {
                f17428b = new p();
            }
            pVar = f17428b;
        }
        return pVar;
    }

    public q a() {
        return this.f17430a;
    }

    public final synchronized void c(q qVar) {
        if (qVar == null) {
            this.f17430a = f17429c;
            return;
        }
        q qVar2 = this.f17430a;
        if (qVar2 == null || qVar2.C() < qVar.C()) {
            this.f17430a = qVar;
        }
    }
}
