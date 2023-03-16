package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f9570a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f9571b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneOffset f9572c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f9570a = LocalDateTime.E(j10, 0, zoneOffset);
        this.f9571b = zoneOffset;
        this.f9572c = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f9570a = localDateTime;
        this.f9571b = zoneOffset;
        this.f9572c = zoneOffset2;
    }

    public LocalDateTime a() {
        return this.f9570a.H(this.f9572c.s() - this.f9571b.s());
    }

    public LocalDateTime b() {
        return this.f9570a;
    }

    public j$.time.e c() {
        return j$.time.e.g(this.f9572c.s() - this.f9571b.s());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return g().o(((a) obj).g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f9570a.equals(aVar.f9570a) && this.f9571b.equals(aVar.f9571b) && this.f9572c.equals(aVar.f9572c);
        }
        return false;
    }

    public Instant g() {
        LocalDateTime localDateTime = this.f9570a;
        return Instant.u(localDateTime.J(this.f9571b), localDateTime.d().u());
    }

    public ZoneOffset h() {
        return this.f9572c;
    }

    public int hashCode() {
        return (this.f9570a.hashCode() ^ this.f9571b.hashCode()) ^ Integer.rotateLeft(this.f9572c.hashCode(), 16);
    }

    public ZoneOffset i() {
        return this.f9571b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List k() {
        return l() ? Collections.emptyList() : Arrays.asList(this.f9571b, this.f9572c);
    }

    public boolean l() {
        return this.f9572c.s() > this.f9571b.s();
    }

    public long n() {
        return this.f9570a.J(this.f9571b);
    }

    public String toString() {
        StringBuilder b10 = j$.time.a.b("Transition[");
        b10.append(l() ? "Gap" : "Overlap");
        b10.append(" at ");
        b10.append(this.f9570a);
        b10.append(this.f9571b);
        b10.append(" to ");
        b10.append(this.f9572c);
        b10.append(']');
        return b10.toString();
    }
}
