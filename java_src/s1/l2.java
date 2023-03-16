package s1;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import s1.h;
/* loaded from: classes.dex */
public class l2 extends Exception implements h {

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<l2> f13536p = k2.f13526a;

    /* renamed from: n  reason: collision with root package name */
    public final int f13537n;

    /* renamed from: o  reason: collision with root package name */
    public final long f13538o;

    /* JADX INFO: Access modifiers changed from: protected */
    public l2(Bundle bundle) {
        this(bundle.getString(d(2)), c(bundle), bundle.getInt(d(0), 1000), bundle.getLong(d(1), SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l2(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f13537n = i10;
        this.f13538o = j10;
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(d(3));
        String string2 = bundle.getString(d(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, l2.class.getClassLoader());
            Throwable b10 = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            if (b10 != null) {
                return b10;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }
}
