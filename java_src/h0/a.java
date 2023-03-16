package h0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class a implements h0.e {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<a> f7639c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f7640a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7641b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0116a {

        /* renamed from: a  reason: collision with root package name */
        static final Set<String> f7642a = new HashSet(Arrays.asList(k.d().a()));
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // h0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // h0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // h0.a
        public boolean c() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // h0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // h0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // h0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // h0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    a(String str, String str2) {
        this.f7640a = str;
        this.f7641b = str2;
        f7639c.add(this);
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f7639c);
    }

    @Override // h0.e
    public String a() {
        return this.f7640a;
    }

    @Override // h0.e
    public boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        return ba.a.b(C0116a.f7642a, this.f7641b);
    }
}
