package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
/* renamed from: j$.util.stream.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0334m {
    static {
        EnumC0314i enumC0314i = EnumC0314i.CONCURRENT;
        EnumC0314i enumC0314i2 = EnumC0314i.UNORDERED;
        EnumC0314i enumC0314i3 = EnumC0314i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC0314i, enumC0314i2, enumC0314i3));
        Collections.unmodifiableSet(EnumSet.of(enumC0314i, enumC0314i2));
        Collections.unmodifiableSet(EnumSet.of(enumC0314i3));
        Collections.unmodifiableSet(EnumSet.of(enumC0314i2, enumC0314i3));
        Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(double[] dArr) {
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (Double.isNaN(d10) && Double.isInfinite(d11)) ? d11 : d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double[] b(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
        return dArr;
    }
}
