package r9;

import b9.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class h0 extends b9.a implements f2<String> {

    /* renamed from: p  reason: collision with root package name */
    public static final a f13118p = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private final long f13119o;

    /* loaded from: classes.dex */
    public static final class a implements g.c<h0> {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }

    public h0(long j10) {
        super(f13118p);
        this.f13119o = j10;
    }

    @Override // r9.f2
    /* renamed from: W */
    public void r(b9.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // r9.f2
    /* renamed from: X */
    public String o(b9.g gVar) {
        int B;
        i0 i0Var = (i0) gVar.c(i0.f13122p);
        String str = (i0Var == null || (str = i0Var.b()) == null) ? "coroutine" : "coroutine";
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        B = q9.n.B(name, " @", 0, false, 6, null);
        if (B < 0) {
            B = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + B + 10);
        String substring = name.substring(0, B);
        k9.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f13119o);
        String sb2 = sb.toString();
        k9.k.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public final long b() {
        return this.f13119o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.f13119o == ((h0) obj).f13119o;
    }

    public int hashCode() {
        return ca.b.a(this.f13119o);
    }

    public String toString() {
        return "CoroutineId(" + this.f13119o + ')';
    }
}
