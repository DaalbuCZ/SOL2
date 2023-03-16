package b5;

import java.io.Serializable;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n0<T> extends h0<T> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    final h0<? super T> f2852n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(h0<? super T> h0Var) {
        this.f2852n = (h0) a5.j.i(h0Var);
    }

    @Override // b5.h0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f2852n.compare(t11, t10);
    }

    @Override // b5.h0
    public <S extends T> h0<S> d() {
        return (h0<? super T>) this.f2852n;
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            return this.f2852n.equals(((n0) obj).f2852n);
        }
        return false;
    }

    public int hashCode() {
        return -this.f2852n.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2852n);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
