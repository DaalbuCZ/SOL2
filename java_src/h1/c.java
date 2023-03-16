package h1;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7687a;

    /* renamed from: b  reason: collision with root package name */
    private final q1.a f7688b;

    /* renamed from: c  reason: collision with root package name */
    private final q1.a f7689c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7690d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, q1.a aVar, q1.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f7687a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f7688b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f7689c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f7690d = str;
    }

    @Override // h1.h
    public Context b() {
        return this.f7687a;
    }

    @Override // h1.h
    public String c() {
        return this.f7690d;
    }

    @Override // h1.h
    public q1.a d() {
        return this.f7689c;
    }

    @Override // h1.h
    public q1.a e() {
        return this.f7688b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f7687a.equals(hVar.b()) && this.f7688b.equals(hVar.e()) && this.f7689c.equals(hVar.d()) && this.f7690d.equals(hVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f7687a.hashCode() ^ 1000003) * 1000003) ^ this.f7688b.hashCode()) * 1000003) ^ this.f7689c.hashCode()) * 1000003) ^ this.f7690d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f7687a + ", wallClock=" + this.f7688b + ", monotonicClock=" + this.f7689c + ", backendName=" + this.f7690d + "}";
    }
}
