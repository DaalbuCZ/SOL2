package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0254a extends p {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f9669i;

    /* renamed from: j  reason: collision with root package name */
    l f9670j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0254a(l[] lVarArr, int i10, int i11, int i12, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, i11, i12);
        this.f9669i = concurrentHashMap;
        b();
    }

    public final boolean hasMoreElements() {
        return this.f9690b != null;
    }

    public final boolean hasNext() {
        return this.f9690b != null;
    }

    public final void remove() {
        l lVar = this.f9670j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f9670j = null;
        this.f9669i.i(lVar.f9682b, null, null);
    }
}
