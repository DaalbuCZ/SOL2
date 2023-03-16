package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f2297a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f2298b = new SavedStateRegistry();

    private a(b bVar) {
        this.f2297a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f2298b;
    }

    public void c(Bundle bundle) {
        e a10 = this.f2297a.a();
        if (a10.b() != e.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        a10.a(new Recreator(this.f2297a));
        this.f2298b.b(a10, bundle);
    }

    public void d(Bundle bundle) {
        this.f2298b.c(bundle);
    }
}
