package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class t implements Iterator {

    /* renamed from: n  reason: collision with root package name */
    private int f4181n = 0;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ u f4182o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(u uVar) {
        this.f4182o = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f4181n;
        str = this.f4182o.f4224n;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i10 = this.f4181n;
        u uVar = this.f4182o;
        str = uVar.f4224n;
        if (i10 < str.length()) {
            str2 = uVar.f4224n;
            this.f4181n = i10 + 1;
            return new u(String.valueOf(str2.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
