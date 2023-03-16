package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.q7;
/* loaded from: classes.dex */
public abstract class p7<MessageType extends q7<MessageType, BuilderType>, BuilderType extends p7<MessageType, BuilderType>> implements na {
    @Override // com.google.android.gms.internal.measurement.na
    public final /* synthetic */ na B(byte[] bArr, u8 u8Var) {
        return l(bArr, 0, bArr.length, u8Var);
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final /* synthetic */ na f(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public abstract p7 i(byte[] bArr, int i10, int i11);

    public abstract p7 l(byte[] bArr, int i10, int i11, u8 u8Var);
}
