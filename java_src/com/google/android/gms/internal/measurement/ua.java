package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class ua {

    /* renamed from: a  reason: collision with root package name */
    private static final ta f4241a;

    /* renamed from: b  reason: collision with root package name */
    private static final ta f4242b;

    static {
        ta taVar;
        try {
            taVar = (ta) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            taVar = null;
        }
        f4241a = taVar;
        f4242b = new ta();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ta a() {
        return f4241a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ta b() {
        return f4242b;
    }
}
