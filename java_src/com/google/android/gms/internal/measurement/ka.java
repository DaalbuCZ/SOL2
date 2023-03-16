package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class ka {

    /* renamed from: a  reason: collision with root package name */
    private static final ja f3950a;

    /* renamed from: b  reason: collision with root package name */
    private static final ja f3951b;

    static {
        ja jaVar;
        try {
            jaVar = (ja) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            jaVar = null;
        }
        f3950a = jaVar;
        f3951b = new ja();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ja a() {
        return f3950a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ja b() {
        return f3951b;
    }
}
