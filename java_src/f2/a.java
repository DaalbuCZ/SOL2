package f2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3.a0;
/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f6996a;

    /* renamed from: f2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0104a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f6997b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f6998c;

        /* renamed from: d  reason: collision with root package name */
        public final List<C0104a> f6999d;

        public C0104a(int i10, long j10) {
            super(i10);
            this.f6997b = j10;
            this.f6998c = new ArrayList();
            this.f6999d = new ArrayList();
        }

        public void d(C0104a c0104a) {
            this.f6999d.add(c0104a);
        }

        public void e(b bVar) {
            this.f6998c.add(bVar);
        }

        public C0104a f(int i10) {
            int size = this.f6999d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0104a c0104a = this.f6999d.get(i11);
                if (c0104a.f6996a == i10) {
                    return c0104a;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f6998c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f6998c.get(i11);
                if (bVar.f6996a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // f2.a
        public String toString() {
            return a.a(this.f6996a) + " leaves: " + Arrays.toString(this.f6998c.toArray()) + " containers: " + Arrays.toString(this.f6999d.toArray());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final a0 f7000b;

        public b(int i10, a0 a0Var) {
            super(i10);
            this.f7000b = a0Var;
        }
    }

    public a(int i10) {
        this.f6996a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f6996a);
    }
}
