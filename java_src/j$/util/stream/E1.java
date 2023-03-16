package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class E1 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    protected final P0 f9801a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f9802b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E1(E1 e12, P0 p02, int i10) {
        super(e12);
        this.f9801a = p02;
        this.f9802b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public E1(P0 p02, int i10) {
        this.f9801a = p02;
        this.f9802b = i10;
    }

    abstract void a();

    abstract E1 b(int i10, int i11);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        E1 e12 = this;
        while (e12.f9801a.n() != 0) {
            e12.setPendingCount(e12.f9801a.n() - 1);
            int i10 = 0;
            int i11 = 0;
            while (i10 < e12.f9801a.n() - 1) {
                E1 b10 = e12.b(i10, e12.f9802b + i11);
                i11 = (int) (i11 + b10.f9801a.count());
                b10.fork();
                i10++;
            }
            e12 = e12.b(i10, e12.f9802b + i11);
        }
        e12.a();
        e12.propagateCompletion();
    }
}
