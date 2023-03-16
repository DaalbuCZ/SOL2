package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class T extends AbstractC0289d {

    /* renamed from: j  reason: collision with root package name */
    private final M f9908j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(M m10, D0 d02, j$.util.H h10) {
        super(d02, h10);
        this.f9908j = m10;
    }

    T(T t10, j$.util.H h10) {
        super(t10, h10);
        this.f9908j = t10.f9908j;
    }

    private void m(Object obj) {
        boolean z10;
        T t10 = this;
        while (true) {
            if (t10 != null) {
                AbstractC0299f c10 = t10.c();
                if (c10 != null && c10.f10042d != t10) {
                    z10 = false;
                    break;
                }
                t10 = c10;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            l(obj);
        } else {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0299f
    public Object a() {
        D0 d02 = this.f10039a;
        M3 m32 = (M3) this.f9908j.f9859e.get();
        d02.I0(m32, this.f10040b);
        Object obj = m32.get();
        if (!this.f9908j.f9856b) {
            if (obj != null) {
                l(obj);
            }
            return null;
        } else if (obj != null) {
            m(obj);
            return obj;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0299f
    public AbstractC0299f f(j$.util.H h10) {
        return new T(this, h10);
    }

    @Override // j$.util.stream.AbstractC0289d
    protected Object k() {
        return this.f9908j.f9857c;
    }

    @Override // j$.util.stream.AbstractC0299f, java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        if (this.f9908j.f9856b) {
            T t10 = (T) this.f10042d;
            T t11 = null;
            while (true) {
                if (t10 != t11) {
                    Object b10 = t10.b();
                    if (b10 != null && this.f9908j.f9858d.test(b10)) {
                        g(b10);
                        m(b10);
                        break;
                    }
                    t11 = t10;
                    t10 = (T) this.f10043e;
                } else {
                    break;
                }
            }
        }
        this.f10040b = null;
        this.f10043e = null;
        this.f10042d = null;
    }
}
