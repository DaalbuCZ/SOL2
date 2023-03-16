package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class e9 implements ma {

    /* renamed from: a  reason: collision with root package name */
    private static final e9 f3823a = new e9();

    private e9() {
    }

    public static e9 c() {
        return f3823a;
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final la a(Class cls) {
        if (i9.class.isAssignableFrom(cls)) {
            try {
                return (la) i9.C(cls.asSubclass(i9.class)).D(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final boolean b(Class cls) {
        return i9.class.isAssignableFrom(cls);
    }
}
