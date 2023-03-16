package j$.util.stream;

import java.security.PrivilegedAction;
/* loaded from: classes2.dex */
public final /* synthetic */ class N3 implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ N3 f9870a = new N3();

    private /* synthetic */ N3() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean z10 = O3.f9877a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
