package h2;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface i0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f7849a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7850b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f7851c;

        public a(String str, int i10, byte[] bArr) {
            this.f7849a = str;
            this.f7850b = i10;
            this.f7851c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7852a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7853b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f7854c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f7855d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f7852a = i10;
            this.f7853b = str;
            this.f7854c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f7855d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray<i0> a();

        i0 b(int i10, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f7856a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7857b;

        /* renamed from: c  reason: collision with root package name */
        private final int f7858c;

        /* renamed from: d  reason: collision with root package name */
        private int f7859d;

        /* renamed from: e  reason: collision with root package name */
        private String f7860e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f7856a = str;
            this.f7857b = i11;
            this.f7858c = i12;
            this.f7859d = Integer.MIN_VALUE;
            this.f7860e = "";
        }

        private void d() {
            if (this.f7859d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f7859d;
            this.f7859d = i10 == Integer.MIN_VALUE ? this.f7857b : i10 + this.f7858c;
            this.f7860e = this.f7856a + this.f7859d;
        }

        public String b() {
            d();
            return this.f7860e;
        }

        public int c() {
            d();
            return this.f7859d;
        }
    }

    void a(p3.a0 a0Var, int i10);

    void b();

    void c(p3.i0 i0Var, x1.n nVar, d dVar);
}
