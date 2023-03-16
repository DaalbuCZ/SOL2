package i7;

import f7.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g extends n7.c {
    private static final Writer B = new a();
    private static final p C = new p("closed");
    private f7.k A;

    /* renamed from: y  reason: collision with root package name */
    private final List<f7.k> f8363y;

    /* renamed from: z  reason: collision with root package name */
    private String f8364z;

    /* loaded from: classes.dex */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(B);
        this.f8363y = new ArrayList();
        this.A = f7.m.f7331a;
    }

    private f7.k g0() {
        List<f7.k> list = this.f8363y;
        return list.get(list.size() - 1);
    }

    private void h0(f7.k kVar) {
        if (this.f8364z != null) {
            if (!kVar.s() || p()) {
                ((f7.n) g0()).C(this.f8364z, kVar);
            }
            this.f8364z = null;
        } else if (this.f8363y.isEmpty()) {
            this.A = kVar;
        } else {
            f7.k g02 = g0();
            if (!(g02 instanceof f7.h)) {
                throw new IllegalStateException();
            }
            ((f7.h) g02).C(kVar);
        }
    }

    @Override // n7.c
    public n7.c D() {
        h0(f7.m.f7331a);
        return this;
    }

    @Override // n7.c
    public n7.c Z(long j10) {
        h0(new p(Long.valueOf(j10)));
        return this;
    }

    @Override // n7.c
    public n7.c a0(Boolean bool) {
        if (bool == null) {
            return D();
        }
        h0(new p(bool));
        return this;
    }

    @Override // n7.c
    public n7.c b0(Number number) {
        if (number == null) {
            return D();
        }
        if (!t()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        h0(new p(number));
        return this;
    }

    @Override // n7.c
    public n7.c c() {
        f7.h hVar = new f7.h();
        h0(hVar);
        this.f8363y.add(hVar);
        return this;
    }

    @Override // n7.c
    public n7.c c0(String str) {
        if (str == null) {
            return D();
        }
        h0(new p(str));
        return this;
    }

    @Override // n7.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f8363y.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f8363y.add(C);
    }

    @Override // n7.c
    public n7.c d0(boolean z10) {
        h0(new p(Boolean.valueOf(z10)));
        return this;
    }

    @Override // n7.c
    public n7.c f() {
        f7.n nVar = new f7.n();
        h0(nVar);
        this.f8363y.add(nVar);
        return this;
    }

    public f7.k f0() {
        if (this.f8363y.isEmpty()) {
            return this.A;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f8363y);
    }

    @Override // n7.c, java.io.Flushable
    public void flush() {
    }

    @Override // n7.c
    public n7.c k() {
        if (this.f8363y.isEmpty() || this.f8364z != null) {
            throw new IllegalStateException();
        }
        if (g0() instanceof f7.h) {
            List<f7.k> list = this.f8363y;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // n7.c
    public n7.c o() {
        if (this.f8363y.isEmpty() || this.f8364z != null) {
            throw new IllegalStateException();
        }
        if (g0() instanceof f7.n) {
            List<f7.k> list = this.f8363y;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // n7.c
    public n7.c y(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f8363y.isEmpty() || this.f8364z != null) {
            throw new IllegalStateException();
        }
        if (g0() instanceof f7.n) {
            this.f8364z = str;
            return this;
        }
        throw new IllegalStateException();
    }
}
