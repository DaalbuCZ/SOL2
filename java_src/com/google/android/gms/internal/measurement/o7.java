package com.google.android.gms.internal.measurement;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class o7 {
    public static k7 a(k7 k7Var) {
        return ((k7Var instanceof m7) || (k7Var instanceof l7)) ? k7Var : k7Var instanceof Serializable ? new l7(k7Var) : new m7(k7Var);
    }

    public static k7 b(Object obj) {
        return new n7(obj);
    }
}
