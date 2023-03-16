package j$.util;

import java.security.AccessController;
/* loaded from: classes2.dex */
abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f9637a = ((Boolean) AccessController.doPrivileged(X.f9636a)).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
