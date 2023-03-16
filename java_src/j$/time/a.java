package j$.time;

import j$.time.format.A;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static int[] a() {
        return A.e(4);
    }

    public static StringBuilder b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ String c(int i10) {
        return i10 == 1 ? "REFERENCE" : i10 == 2 ? "INT_VALUE" : i10 == 3 ? "LONG_VALUE" : i10 == 4 ? "DOUBLE_VALUE" : "null";
    }
}
