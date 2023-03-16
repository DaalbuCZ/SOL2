package u1;

import android.media.AudioAttributes;
import android.os.Bundle;
import p3.m0;
import s1.h;
/* loaded from: classes.dex */
public final class e implements s1.h {

    /* renamed from: t  reason: collision with root package name */
    public static final e f14907t = new C0221e().a();

    /* renamed from: u  reason: collision with root package name */
    public static final h.a<e> f14908u = u1.d.f14900a;

    /* renamed from: n  reason: collision with root package name */
    public final int f14909n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14910o;

    /* renamed from: p  reason: collision with root package name */
    public final int f14911p;

    /* renamed from: q  reason: collision with root package name */
    public final int f14912q;

    /* renamed from: r  reason: collision with root package name */
    public final int f14913r;

    /* renamed from: s  reason: collision with root package name */
    private d f14914s;

    /* loaded from: classes.dex */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes f14915a;

        private d(e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f14909n).setFlags(eVar.f14910o).setUsage(eVar.f14911p);
            int i10 = m0.f12306a;
            if (i10 >= 29) {
                b.a(usage, eVar.f14912q);
            }
            if (i10 >= 32) {
                c.a(usage, eVar.f14913r);
            }
            this.f14915a = usage.build();
        }
    }

    /* renamed from: u1.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0221e {

        /* renamed from: a  reason: collision with root package name */
        private int f14916a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f14917b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f14918c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f14919d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f14920e = 0;

        public e a() {
            return new e(this.f14916a, this.f14917b, this.f14918c, this.f14919d, this.f14920e);
        }

        public C0221e b(int i10) {
            this.f14919d = i10;
            return this;
        }

        public C0221e c(int i10) {
            this.f14916a = i10;
            return this;
        }

        public C0221e d(int i10) {
            this.f14917b = i10;
            return this;
        }

        public C0221e e(int i10) {
            this.f14920e = i10;
            return this;
        }

        public C0221e f(int i10) {
            this.f14918c = i10;
            return this;
        }
    }

    private e(int i10, int i11, int i12, int i13, int i14) {
        this.f14909n = i10;
        this.f14910o = i11;
        this.f14911p = i12;
        this.f14912q = i13;
        this.f14913r = i14;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e d(Bundle bundle) {
        C0221e c0221e = new C0221e();
        if (bundle.containsKey(c(0))) {
            c0221e.c(bundle.getInt(c(0)));
        }
        if (bundle.containsKey(c(1))) {
            c0221e.d(bundle.getInt(c(1)));
        }
        if (bundle.containsKey(c(2))) {
            c0221e.f(bundle.getInt(c(2)));
        }
        if (bundle.containsKey(c(3))) {
            c0221e.b(bundle.getInt(c(3)));
        }
        if (bundle.containsKey(c(4))) {
            c0221e.e(bundle.getInt(c(4)));
        }
        return c0221e.a();
    }

    public d b() {
        if (this.f14914s == null) {
            this.f14914s = new d();
        }
        return this.f14914s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14909n == eVar.f14909n && this.f14910o == eVar.f14910o && this.f14911p == eVar.f14911p && this.f14912q == eVar.f14912q && this.f14913r == eVar.f14913r;
    }

    public int hashCode() {
        return ((((((((527 + this.f14909n) * 31) + this.f14910o) * 31) + this.f14911p) * 31) + this.f14912q) * 31) + this.f14913r;
    }
}
