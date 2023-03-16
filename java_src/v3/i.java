package v3;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import v3.c;
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new g();

    /* renamed from: n  reason: collision with root package name */
    Messenger f15606n;

    /* renamed from: o  reason: collision with root package name */
    c f15607o;

    public i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f15606n = new Messenger(iBinder);
        } else {
            this.f15607o = new c.a(iBinder);
        }
    }

    public final IBinder a() {
        Messenger messenger = this.f15606n;
        return messenger != null ? messenger.getBinder() : this.f15607o.asBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f15606n;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f15607o.A(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((i) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f15606n;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f15607o.asBinder());
    }
}
