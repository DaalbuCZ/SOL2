package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class x7 extends z7 {

    /* renamed from: n  reason: collision with root package name */
    private int f4286n = 0;

    /* renamed from: o  reason: collision with root package name */
    private final int f4287o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ h8 f4288p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x7(h8 h8Var) {
        this.f4288p = h8Var;
        this.f4287o = h8Var.h();
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final byte a() {
        int i10 = this.f4286n;
        if (i10 < this.f4287o) {
            this.f4286n = i10 + 1;
            return this.f4288p.g(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f4286n < this.f4287o;
    }
}
