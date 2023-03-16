package f7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class h extends k implements Iterable<k> {

    /* renamed from: n  reason: collision with root package name */
    private final List<k> f7330n = new ArrayList();

    public void C(k kVar) {
        if (kVar == null) {
            kVar = m.f7331a;
        }
        this.f7330n.add(kVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h) && ((h) obj).f7330n.equals(this.f7330n));
    }

    public int hashCode() {
        return this.f7330n.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<k> iterator() {
        return this.f7330n.iterator();
    }

    @Override // f7.k
    public String k() {
        if (this.f7330n.size() == 1) {
            return this.f7330n.get(0).k();
        }
        throw new IllegalStateException();
    }
}
