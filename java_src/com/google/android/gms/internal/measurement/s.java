package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class s implements Iterator {

    /* renamed from: n  reason: collision with root package name */
    private int f4140n = 0;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ u f4141o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(u uVar) {
        this.f4141o = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f4140n;
        str = this.f4141o.f4224n;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i10 = this.f4140n;
        str = this.f4141o.f4224n;
        if (i10 < str.length()) {
            this.f4140n = i10 + 1;
            return new u(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
