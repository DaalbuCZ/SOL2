package r9;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13172a;

    /* renamed from: b  reason: collision with root package name */
    public final j9.l<Throwable, y8.s> f13173b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Object obj, j9.l<? super Throwable, y8.s> lVar) {
        this.f13172a = obj;
        this.f13173b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return k9.k.a(this.f13172a, wVar.f13172a) && k9.k.a(this.f13173b, wVar.f13173b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f13172a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f13173b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f13172a + ", onCancellation=" + this.f13173b + ')';
    }
}
