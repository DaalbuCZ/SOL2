package j$.util.stream;

import java.security.AccessController;
/* loaded from: classes2.dex */
abstract class O3 {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f9877a = ((Boolean) AccessController.doPrivileged(N3.f9870a)).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
