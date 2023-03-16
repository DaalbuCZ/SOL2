package androidx.fragment.app;

import androidx.lifecycle.e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b  reason: collision with root package name */
    int f1972b;

    /* renamed from: c  reason: collision with root package name */
    int f1973c;

    /* renamed from: d  reason: collision with root package name */
    int f1974d;

    /* renamed from: e  reason: collision with root package name */
    int f1975e;

    /* renamed from: f  reason: collision with root package name */
    int f1976f;

    /* renamed from: g  reason: collision with root package name */
    int f1977g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1978h;

    /* renamed from: j  reason: collision with root package name */
    String f1980j;

    /* renamed from: k  reason: collision with root package name */
    int f1981k;

    /* renamed from: l  reason: collision with root package name */
    CharSequence f1982l;

    /* renamed from: m  reason: collision with root package name */
    int f1983m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f1984n;

    /* renamed from: o  reason: collision with root package name */
    ArrayList<String> f1985o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f1986p;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<Runnable> f1988r;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f1971a = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    boolean f1979i = true;

    /* renamed from: q  reason: collision with root package name */
    boolean f1987q = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f1989a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f1990b;

        /* renamed from: c  reason: collision with root package name */
        int f1991c;

        /* renamed from: d  reason: collision with root package name */
        int f1992d;

        /* renamed from: e  reason: collision with root package name */
        int f1993e;

        /* renamed from: f  reason: collision with root package name */
        int f1994f;

        /* renamed from: g  reason: collision with root package name */
        e.c f1995g;

        /* renamed from: h  reason: collision with root package name */
        e.c f1996h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment) {
            this.f1989a = i10;
            this.f1990b = fragment;
            e.c cVar = e.c.RESUMED;
            this.f1995g = cVar;
            this.f1996h = cVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a aVar) {
        this.f1971a.add(aVar);
        aVar.f1991c = this.f1972b;
        aVar.f1992d = this.f1973c;
        aVar.f1993e = this.f1974d;
        aVar.f1994f = this.f1975e;
    }

    public abstract int d();

    public abstract int e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.K;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.K + " now " + str);
            }
            fragment.K = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.I;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.I + " now " + i10);
            }
            fragment.I = i10;
            fragment.J = i10;
        }
        c(new a(i11, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}
