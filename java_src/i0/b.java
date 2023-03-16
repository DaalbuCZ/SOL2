package i0;

import android.graphics.Rect;
import java.util.Objects;
import k9.k;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f8201a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8202b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8203c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8204d;

    public b(int i10, int i11, int i12, int i13) {
        this.f8201a = i10;
        this.f8202b = i11;
        this.f8203c = i12;
        this.f8204d = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        k.e(rect, "rect");
    }

    public final int a() {
        return this.f8204d - this.f8202b;
    }

    public final int b() {
        return this.f8201a;
    }

    public final int c() {
        return this.f8202b;
    }

    public final int d() {
        return this.f8203c - this.f8201a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (k.a(b.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
            b bVar = (b) obj;
            return this.f8201a == bVar.f8201a && this.f8202b == bVar.f8202b && this.f8203c == bVar.f8203c && this.f8204d == bVar.f8204d;
        }
        return false;
    }

    public final Rect f() {
        return new Rect(this.f8201a, this.f8202b, this.f8203c, this.f8204d);
    }

    public int hashCode() {
        return (((((this.f8201a * 31) + this.f8202b) * 31) + this.f8203c) * 31) + this.f8204d;
    }

    public String toString() {
        return ((Object) b.class.getSimpleName()) + " { [" + this.f8201a + ',' + this.f8202b + ',' + this.f8203c + ',' + this.f8204d + "] }";
    }
}
