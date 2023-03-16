package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
final class g implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0078b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0078b c0078b = new DynamiteModule.b.C0078b();
        c0078b.f3668a = aVar.a(context, str);
        int b10 = aVar.b(context, str, true);
        c0078b.f3669b = b10;
        int i10 = c0078b.f3668a;
        if (i10 == 0) {
            if (b10 == 0) {
                c0078b.f3670c = 0;
                return c0078b;
            }
            i10 = 0;
        }
        if (i10 >= b10) {
            c0078b.f3670c = -1;
        } else {
            c0078b.f3670c = 1;
        }
        return c0078b;
    }
}
