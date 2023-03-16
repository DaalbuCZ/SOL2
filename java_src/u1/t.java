package u1;

import java.nio.ByteBuffer;
import s1.m1;
import s1.o2;
import t1.t1;
/* loaded from: classes.dex */
public interface t {

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: n  reason: collision with root package name */
        public final m1 f15030n;

        public a(String str, m1 m1Var) {
            super(str);
            this.f15030n = m1Var;
        }

        public a(Throwable th, m1 m1Var) {
            super(th);
            this.f15030n = m1Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: n  reason: collision with root package name */
        public final int f15031n;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f15032o;

        /* renamed from: p  reason: collision with root package name */
        public final m1 f15033p;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r3, int r4, int r5, int r6, s1.m1 r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L32
                java.lang.String r4 = " (recoverable)"
                goto L34
            L32:
                java.lang.String r4 = ""
            L34:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f15031n = r3
                r2.f15032o = r8
                r2.f15033p = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.t.b.<init>(int, int, int, int, s1.m1, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(long j10);

        void b(boolean z10);

        void c(Exception exc);

        void d();

        void e();

        void f();

        void g(int i10, long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: n  reason: collision with root package name */
        public final long f15034n;

        /* renamed from: o  reason: collision with root package name */
        public final long f15035o;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f15034n = j10;
            this.f15035o = j11;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: n  reason: collision with root package name */
        public final int f15036n;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f15037o;

        /* renamed from: p  reason: collision with root package name */
        public final m1 f15038p;

        public e(int i10, m1 m1Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f15037o = z10;
            this.f15036n = i10;
            this.f15038p = m1Var;
        }
    }

    boolean a(m1 m1Var);

    boolean b();

    void c();

    void d(o2 o2Var);

    void e();

    void f(float f10);

    void flush();

    void g(c cVar);

    void h();

    void i();

    o2 j();

    boolean k();

    void l(int i10);

    void m(m1 m1Var, int i10, int[] iArr);

    void n(t1 t1Var);

    void o();

    boolean p(ByteBuffer byteBuffer, long j10, int i10);

    long q(boolean z10);

    void r(w wVar);

    void s();

    void t(u1.e eVar);

    void u();

    void v(boolean z10);

    void w();

    int x(m1 m1Var);
}
