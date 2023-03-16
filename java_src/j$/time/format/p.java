package j$.time.format;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.o f9478a;

    /* renamed from: b  reason: collision with root package name */
    private final B f9479b;

    /* renamed from: c  reason: collision with root package name */
    private final C0250b f9480c;

    /* renamed from: d  reason: collision with root package name */
    private volatile j f9481d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(j$.time.temporal.o oVar, B b10, C0250b c0250b) {
        this.f9478a = oVar;
        this.f9479b = b10;
        this.f9480c = c0250b;
    }

    private j c() {
        if (this.f9481d == null) {
            this.f9481d = new j(this.f9478a, 1, 19, 1);
        }
        return this.f9481d;
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        String a10;
        j$.time.chrono.g gVar;
        Long e10 = vVar.e(this.f9478a);
        if (e10 == null) {
            return false;
        }
        j$.time.chrono.f fVar = (j$.time.chrono.f) vVar.d().m(j$.time.temporal.q.f9560a);
        if (fVar != null && fVar != (gVar = j$.time.chrono.g.f9432a)) {
            C0250b c0250b = this.f9480c;
            j$.time.temporal.o oVar = this.f9478a;
            long longValue = e10.longValue();
            B b10 = this.f9479b;
            vVar.c();
            Objects.requireNonNull(c0250b);
            a10 = (fVar == gVar || !(oVar instanceof j$.time.temporal.a)) ? c0250b.f9451a.a(longValue, b10) : null;
        } else {
            C0250b c0250b2 = this.f9480c;
            long longValue2 = e10.longValue();
            B b11 = this.f9479b;
            vVar.c();
            a10 = c0250b2.f9451a.a(longValue2, b11);
        }
        if (a10 == null) {
            return c().a(vVar, sb);
        }
        sb.append(a10);
        return true;
    }

    @Override // j$.time.format.g
    public int b(s sVar, CharSequence charSequence, int i10) {
        Iterator it;
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it2 = null;
        B b10 = sVar.k() ? this.f9479b : null;
        j$.time.chrono.f g10 = sVar.g();
        j$.time.chrono.f fVar = j$.time.chrono.g.f9432a;
        if (g10 == fVar) {
            C0250b c0250b = this.f9480c;
            sVar.h();
            it = c0250b.f9451a.b(b10);
        } else {
            C0250b c0250b2 = this.f9480c;
            j$.time.temporal.o oVar = this.f9478a;
            sVar.h();
            Objects.requireNonNull(c0250b2);
            if (g10 == fVar || !(oVar instanceof j$.time.temporal.a)) {
                it2 = c0250b2.f9451a.b(b10);
            }
            it = it2;
        }
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (sVar.r(str, 0, charSequence, i10, str.length())) {
                    return sVar.n(this.f9478a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                }
            }
            if (sVar.k()) {
                return ~i10;
            }
        }
        return c().b(sVar, charSequence, i10);
    }

    public String toString() {
        StringBuilder b10;
        Object obj;
        if (this.f9479b == B.FULL) {
            b10 = j$.time.a.b("Text(");
            obj = this.f9478a;
        } else {
            b10 = j$.time.a.b("Text(");
            b10.append(this.f9478a);
            b10.append(",");
            obj = this.f9479b;
        }
        b10.append(obj);
        b10.append(")");
        return b10.toString();
    }
}
