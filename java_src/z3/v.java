package z3;

import android.os.Bundle;
import x3.a;
/* loaded from: classes.dex */
public class v implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final v f17444b = c().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f17445a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f17446a;

        /* synthetic */ a(x xVar) {
        }

        public v a() {
            return new v(this.f17446a, null);
        }
    }

    /* synthetic */ v(String str, y yVar) {
        this.f17445a = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f17445a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return n.a(this.f17445a, ((v) obj).f17445a);
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f17445a);
    }
}
