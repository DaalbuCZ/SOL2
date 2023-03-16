package r9;
/* loaded from: classes.dex */
final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13163a;

    /* renamed from: b  reason: collision with root package name */
    public final i f13164b;

    /* renamed from: c  reason: collision with root package name */
    public final j9.l<Throwable, y8.s> f13165c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13166d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f13167e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(Object obj, i iVar, j9.l<? super Throwable, y8.s> lVar, Object obj2, Throwable th) {
        this.f13163a = obj;
        this.f13164b = iVar;
        this.f13165c = lVar;
        this.f13166d = obj2;
        this.f13167e = th;
    }

    public /* synthetic */ u(Object obj, i iVar, j9.l lVar, Object obj2, Throwable th, int i10, k9.g gVar) {
        this(obj, (i10 & 2) != 0 ? null : iVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ u b(u uVar, Object obj, i iVar, j9.l lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = uVar.f13163a;
        }
        if ((i10 & 2) != 0) {
            iVar = uVar.f13164b;
        }
        i iVar2 = iVar;
        j9.l<Throwable, y8.s> lVar2 = lVar;
        if ((i10 & 4) != 0) {
            lVar2 = uVar.f13165c;
        }
        j9.l lVar3 = lVar2;
        if ((i10 & 8) != 0) {
            obj2 = uVar.f13166d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = uVar.f13167e;
        }
        return uVar.a(obj, iVar2, lVar3, obj4, th);
    }

    public final u a(Object obj, i iVar, j9.l<? super Throwable, y8.s> lVar, Object obj2, Throwable th) {
        return new u(obj, iVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f13167e != null;
    }

    public final void d(l<?> lVar, Throwable th) {
        i iVar = this.f13164b;
        if (iVar != null) {
            lVar.r(iVar, th);
        }
        j9.l<Throwable, y8.s> lVar2 = this.f13165c;
        if (lVar2 != null) {
            lVar.t(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return k9.k.a(this.f13163a, uVar.f13163a) && k9.k.a(this.f13164b, uVar.f13164b) && k9.k.a(this.f13165c, uVar.f13165c) && k9.k.a(this.f13166d, uVar.f13166d) && k9.k.a(this.f13167e, uVar.f13167e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f13163a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f13164b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j9.l<Throwable, y8.s> lVar = this.f13165c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f13166d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f13167e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f13163a + ", cancelHandler=" + this.f13164b + ", onCancellation=" + this.f13165c + ", idempotentResume=" + this.f13166d + ", cancelCause=" + this.f13167e + ')';
    }
}
