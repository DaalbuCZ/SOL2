package k0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f10486a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f10487a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f10488b;

        a(Uri uri, boolean z10) {
            this.f10487a = uri;
            this.f10488b = z10;
        }

        public Uri a() {
            return this.f10487a;
        }

        public boolean b() {
            return this.f10488b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10488b == aVar.f10488b && this.f10487a.equals(aVar.f10487a);
        }

        public int hashCode() {
            return (this.f10487a.hashCode() * 31) + (this.f10488b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f10486a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f10486a;
    }

    public int c() {
        return this.f10486a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f10486a.equals(((c) obj).f10486a);
    }

    public int hashCode() {
        return this.f10486a.hashCode();
    }
}
