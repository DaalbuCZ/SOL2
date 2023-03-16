package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import h1.h;
import h1.m;
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements h1.d {
    @Override // h1.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
