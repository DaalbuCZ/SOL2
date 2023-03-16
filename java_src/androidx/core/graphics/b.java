package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f1393e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1394a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1395b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1396c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1397d;

    /* loaded from: classes.dex */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f1394a = i10;
        this.f1395b = i11;
        this.f1396c = i12;
        this.f1397d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f1394a, bVar2.f1394a), Math.max(bVar.f1395b, bVar2.f1395b), Math.max(bVar.f1396c, bVar2.f1396c), Math.max(bVar.f1397d, bVar2.f1397d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f1393e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f1394a, this.f1395b, this.f1396c, this.f1397d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1397d == bVar.f1397d && this.f1394a == bVar.f1394a && this.f1396c == bVar.f1396c && this.f1395b == bVar.f1395b;
    }

    public int hashCode() {
        return (((((this.f1394a * 31) + this.f1395b) * 31) + this.f1396c) * 31) + this.f1397d;
    }

    public String toString() {
        return "Insets{left=" + this.f1394a + ", top=" + this.f1395b + ", right=" + this.f1396c + ", bottom=" + this.f1397d + '}';
    }
}
