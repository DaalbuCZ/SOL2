package j$.util.stream;

import j$.util.Collection$EL;
import j$.util.function.Consumer;
import java.util.Collection;
/* loaded from: classes2.dex */
final class T0 implements P0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f9909a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(Collection collection) {
        this.f9909a = collection;
    }

    @Override // j$.util.stream.P0
    public void a(Consumer consumer) {
        Collection$EL.a(this.f9909a, consumer);
    }

    @Override // j$.util.stream.P0
    public long count() {
        return this.f9909a.size();
    }

    @Override // j$.util.stream.P0
    public P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public void m(Object[] objArr, int i10) {
        for (Object obj : this.f9909a) {
            objArr[i10] = obj;
            i10++;
        }
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public Object[] o(j$.util.function.n nVar) {
        Collection collection = this.f9909a;
        return collection.toArray((Object[]) nVar.u(collection.size()));
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ P0 p(long j10, long j11, j$.util.function.n nVar) {
        return D0.Q(this, j10, j11, nVar);
    }

    @Override // j$.util.stream.P0
    public j$.util.H spliterator() {
        return Collection$EL.stream(this.f9909a).spliterator();
    }

    public String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f9909a.size()), this.f9909a);
    }
}
