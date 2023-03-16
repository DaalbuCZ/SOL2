package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0268m {

    /* renamed from: c  reason: collision with root package name */
    private static final C0268m f9749c = new C0268m();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9750a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9751b;

    private C0268m() {
        this.f9750a = false;
        this.f9751b = 0;
    }

    private C0268m(int i10) {
        this.f9750a = true;
        this.f9751b = i10;
    }

    public static C0268m a() {
        return f9749c;
    }

    public static C0268m d(int i10) {
        return new C0268m(i10);
    }

    public int b() {
        if (this.f9750a) {
            return this.f9751b;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f9750a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0268m) {
            C0268m c0268m = (C0268m) obj;
            boolean z10 = this.f9750a;
            if (z10 && c0268m.f9750a) {
                if (this.f9751b == c0268m.f9751b) {
                    return true;
                }
            } else if (z10 == c0268m.f9750a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.f9750a) {
            return this.f9751b;
        }
        return 0;
    }

    public String toString() {
        return this.f9750a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f9751b)) : "OptionalInt.empty";
    }
}
