package com.google.protobuf;
/* loaded from: classes.dex */
class x implements r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final x f6213a = new x();

    private x() {
    }

    public static x c() {
        return f6213a;
    }

    @Override // com.google.protobuf.r0
    public q0 a(Class<?> cls) {
        if (!y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (q0) y.F(cls.asSubclass(y.class)).y();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.r0
    public boolean b(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }
}
