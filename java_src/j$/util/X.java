package j$.util;

import java.security.PrivilegedAction;
/* loaded from: classes2.dex */
public final /* synthetic */ class X implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ X f9636a = new X();

    private /* synthetic */ X() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean z10 = Y.f9637a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
