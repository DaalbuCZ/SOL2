package g1;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements e1.g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<e1.b> f7439a;

    /* renamed from: b  reason: collision with root package name */
    private final p f7440b;

    /* renamed from: c  reason: collision with root package name */
    private final t f7441c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Set<e1.b> set, p pVar, t tVar) {
        this.f7439a = set;
        this.f7440b = pVar;
        this.f7441c = tVar;
    }

    @Override // e1.g
    public <T> e1.f<T> a(String str, Class<T> cls, e1.b bVar, e1.e<T, byte[]> eVar) {
        if (this.f7439a.contains(bVar)) {
            return new s(this.f7440b, str, bVar, eVar, this.f7441c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f7439a));
    }
}
