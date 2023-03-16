package z3;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
final class o0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f17427a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(IBinder iBinder) {
        this.f17427a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17427a;
    }

    @Override // z3.l
    public final void c0(k kVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                e1.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17427a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
