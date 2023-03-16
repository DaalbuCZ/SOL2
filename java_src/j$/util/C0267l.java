package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0267l {

    /* renamed from: c  reason: collision with root package name */
    private static final C0267l f9746c = new C0267l();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9747a;

    /* renamed from: b  reason: collision with root package name */
    private final double f9748b;

    private C0267l() {
        this.f9747a = false;
        this.f9748b = Double.NaN;
    }

    private C0267l(double d10) {
        this.f9747a = true;
        this.f9748b = d10;
    }

    public static C0267l a() {
        return f9746c;
    }

    public static C0267l d(double d10) {
        return new C0267l(d10);
    }

    public double b() {
        if (this.f9747a) {
            return this.f9748b;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f9747a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0267l) {
            C0267l c0267l = (C0267l) obj;
            boolean z10 = this.f9747a;
            if (z10 && c0267l.f9747a) {
                if (Double.compare(this.f9748b, c0267l.f9748b) == 0) {
                    return true;
                }
            } else if (z10 == c0267l.f9747a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.f9747a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f9748b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public String toString() {
        return this.f9747a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f9748b)) : "OptionalDouble.empty";
    }
}
