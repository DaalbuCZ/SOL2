package y3;

import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final m.a<b<?>, w3.b> f16961a;

    /* renamed from: b  reason: collision with root package name */
    private final m.a<b<?>, String> f16962b;

    /* renamed from: c  reason: collision with root package name */
    private final t4.j<Map<b<?>, String>> f16963c;

    /* renamed from: d  reason: collision with root package name */
    private int f16964d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16965e;

    public final Set<b<?>> a() {
        return this.f16961a.keySet();
    }

    public final void b(b<?> bVar, w3.b bVar2, String str) {
        this.f16961a.put(bVar, bVar2);
        this.f16962b.put(bVar, str);
        this.f16964d--;
        if (!bVar2.C()) {
            this.f16965e = true;
        }
        if (this.f16964d == 0) {
            if (!this.f16965e) {
                this.f16963c.c(this.f16962b);
                return;
            }
            this.f16963c.b(new x3.c(this.f16961a));
        }
    }
}
