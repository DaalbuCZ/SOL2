package a7;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static final u6.a f238b = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f239a;

    public f() {
        this(new Bundle());
    }

    public f(Bundle bundle) {
        this.f239a = (Bundle) bundle.clone();
    }

    private g<Integer> d(String str) {
        if (a(str)) {
            try {
                return g.b((Integer) this.f239a.get(str));
            } catch (ClassCastException e10) {
                f238b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
                return g.a();
            }
        }
        return g.a();
    }

    public boolean a(String str) {
        return str != null && this.f239a.containsKey(str);
    }

    public g<Boolean> b(String str) {
        if (a(str)) {
            try {
                return g.b((Boolean) this.f239a.get(str));
            } catch (ClassCastException e10) {
                f238b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
                return g.a();
            }
        }
        return g.a();
    }

    public g<Float> c(String str) {
        if (a(str)) {
            try {
                return g.b((Float) this.f239a.get(str));
            } catch (ClassCastException e10) {
                f238b.b("Metadata key %s contains type other than float: %s", str, e10.getMessage());
                return g.a();
            }
        }
        return g.a();
    }

    public g<Long> e(String str) {
        g<Integer> d10 = d(str);
        return d10.d() ? g.e(Long.valueOf(d10.c().intValue())) : g.a();
    }
}
