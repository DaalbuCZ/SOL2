package com.google.protobuf;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5918a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f5919b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f5920c;

    static {
        f5920c = (f5918a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return f5919b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f5918a || !(f5919b == null || f5920c);
    }
}
