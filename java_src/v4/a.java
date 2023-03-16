package v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f15643a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15644b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f15643a = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15644b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15643a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i10, Parcel parcel) {
        try {
            this.f15643a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
