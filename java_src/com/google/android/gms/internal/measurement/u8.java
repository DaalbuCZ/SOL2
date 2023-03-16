package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class u8 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile u8 f4235b;

    /* renamed from: c  reason: collision with root package name */
    static final u8 f4236c = new u8(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map f4237a;

    u8() {
        this.f4237a = new HashMap();
    }

    u8(boolean z10) {
        this.f4237a = Collections.emptyMap();
    }

    public static u8 a() {
        u8 u8Var = f4235b;
        if (u8Var != null) {
            return u8Var;
        }
        synchronized (u8.class) {
            u8 u8Var2 = f4235b;
            if (u8Var2 != null) {
                return u8Var2;
            }
            u8 b10 = c9.b(u8.class);
            f4235b = b10;
            return b10;
        }
    }

    public final h9 b(oa oaVar, int i10) {
        return (h9) this.f4237a.get(new t8(oaVar, i10));
    }
}
