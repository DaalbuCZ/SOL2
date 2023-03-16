package b5;

import java.io.Serializable;
/* loaded from: classes.dex */
class p<K, V> extends e<K, V> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    final K f2857n;

    /* renamed from: o  reason: collision with root package name */
    final V f2858o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(K k10, V v10) {
        this.f2857n = k10;
        this.f2858o = v10;
    }

    @Override // b5.e, java.util.Map.Entry
    public final K getKey() {
        return this.f2857n;
    }

    @Override // b5.e, java.util.Map.Entry
    public final V getValue() {
        return this.f2858o;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
