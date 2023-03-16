package w1;

import android.os.Looper;
import s1.m1;
import t1.t1;
import w1.o;
import w1.w;
/* loaded from: classes.dex */
public interface y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f15971a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final y f15972b;

    /* loaded from: classes.dex */
    class a implements y {
        a() {
        }

        @Override // w1.y
        public /* synthetic */ void a() {
            x.c(this);
        }

        @Override // w1.y
        public /* synthetic */ void b() {
            x.b(this);
        }

        @Override // w1.y
        public o c(w.a aVar, m1 m1Var) {
            if (m1Var.B == null) {
                return null;
            }
            return new e0(new o.a(new p0(1), 6001));
        }

        @Override // w1.y
        public /* synthetic */ b d(w.a aVar, m1 m1Var) {
            return x.a(this, aVar, m1Var);
        }

        @Override // w1.y
        public void e(Looper looper, t1 t1Var) {
        }

        @Override // w1.y
        public int f(m1 m1Var) {
            return m1Var.B != null ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15973a = z.f15974b;

        void a();
    }

    static {
        a aVar = new a();
        f15971a = aVar;
        f15972b = aVar;
    }

    void a();

    void b();

    o c(w.a aVar, m1 m1Var);

    b d(w.a aVar, m1 m1Var);

    void e(Looper looper, t1 t1Var);

    int f(m1 m1Var);
}
