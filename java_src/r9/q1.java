package r9;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class q1 extends CancellationException implements b0<q1> {

    /* renamed from: n  reason: collision with root package name */
    public final transient p1 f13158n;

    public q1(String str, Throwable th, p1 p1Var) {
        super(str);
        this.f13158n = p1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // r9.b0
    /* renamed from: b */
    public q1 a() {
        if (n0.c()) {
            String message = getMessage();
            k9.k.b(message);
            return new q1(message, this, this.f13158n);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q1) {
                q1 q1Var = (q1) obj;
                if (!k9.k.a(q1Var.getMessage(), getMessage()) || !k9.k.a(q1Var.f13158n, this.f13158n) || !k9.k.a(q1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (n0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        k9.k.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f13158n.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f13158n;
    }
}
