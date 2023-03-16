package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class x8 {

    /* renamed from: a  reason: collision with root package name */
    private static final v8 f4289a = new w8();

    /* renamed from: b  reason: collision with root package name */
    private static final v8 f4290b;

    static {
        v8 v8Var;
        try {
            v8Var = (v8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            v8Var = null;
        }
        f4290b = v8Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v8 a() {
        v8 v8Var = f4290b;
        if (v8Var != null) {
            return v8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v8 b() {
        return f4289a;
    }
}
