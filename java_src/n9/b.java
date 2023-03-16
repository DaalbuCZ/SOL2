package n9;

import java.util.NoSuchElementException;
import z8.w;
/* loaded from: classes.dex */
public final class b extends w {

    /* renamed from: n  reason: collision with root package name */
    private final int f11807n;

    /* renamed from: o  reason: collision with root package name */
    private final int f11808o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11809p;

    /* renamed from: q  reason: collision with root package name */
    private int f11810q;

    public b(int i10, int i11, int i12) {
        this.f11807n = i12;
        this.f11808o = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f11809p = z10;
        this.f11810q = z10 ? i10 : i11;
    }

    @Override // z8.w
    public int b() {
        int i10 = this.f11810q;
        if (i10 != this.f11808o) {
            this.f11810q = this.f11807n + i10;
        } else if (!this.f11809p) {
            throw new NoSuchElementException();
        } else {
            this.f11809p = false;
        }
        return i10;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f11809p;
    }
}
