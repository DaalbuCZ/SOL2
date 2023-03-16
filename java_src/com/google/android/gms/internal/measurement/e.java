package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: n  reason: collision with root package name */
    private int f3815n = 0;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ f f3816o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar) {
        this.f3816o = fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3815n < this.f3816o.D();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f3815n < this.f3816o.D()) {
            f fVar = this.f3816o;
            int i10 = this.f3815n;
            this.f3815n = i10 + 1;
            return fVar.E(i10);
        }
        int i11 = this.f3815n;
        throw new NoSuchElementException("Out of bounds index: " + i11);
    }
}
