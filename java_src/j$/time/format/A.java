package j$.time.format;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class A {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9438a = {1, 2, 3, 4, 5};

    public static boolean a(int i10, boolean z10, boolean z11, boolean z12) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                return (z10 && z11) ? false : true;
            } else if (i11 == 1 || i11 == 4) {
                return true;
            } else {
                return (z11 || z12) ? false : true;
            }
        }
        throw null;
    }

    public static int[] b() {
        return e(5);
    }

    public static /* synthetic */ int c(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i10) {
        return i10 == 1 ? "NORMAL" : i10 == 2 ? "ALWAYS" : i10 == 3 ? "NEVER" : i10 == 4 ? "NOT_NEGATIVE" : i10 == 5 ? "EXCEEDS_PAD" : "null";
    }

    public static /* synthetic */ int[] e(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f9438a, 0, iArr, 0, i10);
        return iArr;
    }
}
