package b5;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j<T> extends h0<T> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    final Comparator<T> f2822n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Comparator<T> comparator) {
        this.f2822n = (Comparator) a5.j.i(comparator);
    }

    @Override // b5.h0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f2822n.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f2822n.equals(((j) obj).f2822n);
        }
        return false;
    }

    public int hashCode() {
        return this.f2822n.hashCode();
    }

    public String toString() {
        return this.f2822n.toString();
    }
}
