package j$.time;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f9430a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ZoneId zoneId) {
        this.f9430a = zoneId;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f9430a.equals(((b) obj).f9430a);
        }
        return false;
    }

    @Override // j$.time.c
    public long f() {
        return System.currentTimeMillis();
    }

    public ZoneId h() {
        return this.f9430a;
    }

    public int hashCode() {
        return this.f9430a.hashCode() + 1;
    }

    public String toString() {
        StringBuilder b10 = a.b("SystemClock[");
        b10.append(this.f9430a);
        b10.append("]");
        return b10.toString();
    }
}
