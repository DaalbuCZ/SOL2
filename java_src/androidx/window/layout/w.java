package androidx.window.layout;

import android.graphics.Rect;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final i0.b f2508a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(Rect rect) {
        this(new i0.b(rect));
        k9.k.e(rect, "bounds");
    }

    public w(i0.b bVar) {
        k9.k.e(bVar, "_bounds");
        this.f2508a = bVar;
    }

    public final Rect a() {
        return this.f2508a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k9.k.a(w.class, obj.getClass())) {
            return false;
        }
        return k9.k.a(this.f2508a, ((w) obj).f2508a);
    }

    public int hashCode() {
        return this.f2508a.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }
}
