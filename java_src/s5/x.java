package s5;

import java.util.Objects;
import s5.d0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0.a f14343a;

    /* renamed from: b  reason: collision with root package name */
    private final d0.c f14344b;

    /* renamed from: c  reason: collision with root package name */
    private final d0.b f14345c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(d0.a aVar, d0.c cVar, d0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f14343a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f14344b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f14345c = bVar;
    }

    @Override // s5.d0
    public d0.a a() {
        return this.f14343a;
    }

    @Override // s5.d0
    public d0.b c() {
        return this.f14345c;
    }

    @Override // s5.d0
    public d0.c d() {
        return this.f14344b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return this.f14343a.equals(d0Var.a()) && this.f14344b.equals(d0Var.d()) && this.f14345c.equals(d0Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f14343a.hashCode() ^ 1000003) * 1000003) ^ this.f14344b.hashCode()) * 1000003) ^ this.f14345c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f14343a + ", osData=" + this.f14344b + ", deviceData=" + this.f14345c + "}";
    }
}
