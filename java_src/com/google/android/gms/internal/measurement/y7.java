package com.google.android.gms.internal.measurement;

import java.util.Comparator;
/* loaded from: classes.dex */
final class y7 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        h8 h8Var = (h8) obj;
        h8 h8Var2 = (h8) obj2;
        x7 x7Var = new x7(h8Var);
        x7 x7Var2 = new x7(h8Var2);
        while (x7Var.hasNext() && x7Var2.hasNext()) {
            int compareTo = Integer.valueOf(x7Var.a() & 255).compareTo(Integer.valueOf(x7Var2.a() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(h8Var.h()).compareTo(Integer.valueOf(h8Var2.h()));
    }
}
