package v3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
/* loaded from: classes.dex */
interface c extends IInterface {

    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f15590a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(IBinder iBinder) {
            this.f15590a = iBinder;
        }

        @Override // v3.c
        public void A(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f15590a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f15590a;
        }
    }

    void A(Message message);
}
