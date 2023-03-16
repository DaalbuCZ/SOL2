package e1;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f6632a;

    /* renamed from: b  reason: collision with root package name */
    private final T f6633b;

    /* renamed from: c  reason: collision with root package name */
    private final d f6634c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, T t10, d dVar) {
        this.f6632a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f6633b = t10;
        Objects.requireNonNull(dVar, "Null priority");
        this.f6634c = dVar;
    }

    @Override // e1.c
    public Integer a() {
        return this.f6632a;
    }

    @Override // e1.c
    public T b() {
        return this.f6633b;
    }

    @Override // e1.c
    public d c() {
        return this.f6634c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f6632a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f6633b.equals(cVar.b()) && this.f6634c.equals(cVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f6632a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f6633b.hashCode()) * 1000003) ^ this.f6634c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f6632a + ", payload=" + this.f6633b + ", priority=" + this.f6634c + "}";
    }
}
