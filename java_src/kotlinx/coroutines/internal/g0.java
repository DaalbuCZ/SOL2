package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
final /* synthetic */ class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f10918a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f10918a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
