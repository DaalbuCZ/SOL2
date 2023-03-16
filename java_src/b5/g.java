package b5;

import java.io.Serializable;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g<F, T> extends h0<F> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    final a5.f<F, ? extends T> f2818n;

    /* renamed from: o  reason: collision with root package name */
    final h0<T> f2819o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(a5.f<F, ? extends T> fVar, h0<T> h0Var) {
        this.f2818n = (a5.f) a5.j.i(fVar);
        this.f2819o = (h0) a5.j.i(h0Var);
    }

    @Override // b5.h0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f2819o.compare(this.f2818n.apply(f10), this.f2818n.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f2818n.equals(gVar.f2818n) && this.f2819o.equals(gVar.f2819o);
        }
        return false;
    }

    public int hashCode() {
        return a5.i.b(this.f2818n, this.f2819o);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2819o);
        String valueOf2 = String.valueOf(this.f2818n);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
