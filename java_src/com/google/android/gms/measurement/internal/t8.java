package com.google.android.gms.measurement.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t8 implements h3 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5027a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a9 f5028b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t8(a9 a9Var, String str) {
        this.f5028b = a9Var;
        this.f5027a = str;
    }

    @Override // com.google.android.gms.measurement.internal.h3
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f5028b.p(i10, th, bArr, this.f5027a);
    }
}
