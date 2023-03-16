package s1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import b5.q;
/* loaded from: classes.dex */
public final class g extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private static final int f13381a;

    static {
        f13381a = p3.m0.f12306a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static b5.q<Bundle> a(IBinder iBinder) {
        int readInt;
        q.a D = b5.q.D();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            D.a((Bundle) p3.a.e(obtain2.readBundle()));
                            i10++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i11 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return D.h();
    }
}
