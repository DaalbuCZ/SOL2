package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f10385a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10386b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f10385a = iBinder;
        this.f10386b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10386b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10385a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10385a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(int i10, Parcel parcel) {
        try {
            this.f10385a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
