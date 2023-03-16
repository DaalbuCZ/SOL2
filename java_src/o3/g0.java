package o3;

import java.io.IOException;
/* loaded from: classes.dex */
public interface g0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11956a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11957b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11958c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11959d;

        public a(int i10, int i11, int i12, int i13) {
            this.f11956a = i10;
            this.f11957b = i11;
            this.f11958c = i12;
            this.f11959d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f11956a - this.f11957b <= 1) {
                    return false;
                }
            } else if (this.f11958c - this.f11959d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f11960a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11961b;

        public b(int i10, long j10) {
            p3.a.a(j10 >= 0);
            this.f11960a = i10;
            this.f11961b = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final u2.n f11962a;

        /* renamed from: b  reason: collision with root package name */
        public final u2.q f11963b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f11964c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11965d;

        public c(u2.n nVar, u2.q qVar, IOException iOException, int i10) {
            this.f11962a = nVar;
            this.f11963b = qVar;
            this.f11964c = iOException;
            this.f11965d = i10;
        }
    }

    void a(long j10);

    long b(c cVar);

    b c(a aVar, c cVar);

    int d(int i10);
}
