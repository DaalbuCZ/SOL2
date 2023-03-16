package com.google.protobuf;
/* loaded from: classes.dex */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final q<?> f6082a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final q<?> f6083b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q<?> a() {
        q<?> qVar = f6083b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q<?> b() {
        return f6082a;
    }

    private static q<?> c() {
        try {
            return (q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
