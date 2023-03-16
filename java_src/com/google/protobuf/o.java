package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f6060a = c();

    public static p a() {
        p b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : p.f6063d;
    }

    private static final p b(String str) {
        Class<?> cls = f6060a;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
