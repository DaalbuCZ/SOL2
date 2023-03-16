package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a  reason: collision with root package name */
    private final m.g f3900a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i6(m.g gVar) {
        this.f3900a = gVar;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            m.g gVar = (m.g) this.f3900a.get(uri.toString());
            if (gVar == null) {
                return null;
            }
            return (String) gVar.get("".concat(String.valueOf(str3)));
        }
        return null;
    }
}
