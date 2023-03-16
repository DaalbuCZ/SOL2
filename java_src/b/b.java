package b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import b.a;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    final boolean f2710n = false;

    /* renamed from: o  reason: collision with root package name */
    final Handler f2711o = null;

    /* renamed from: p  reason: collision with root package name */
    b.a f2712p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0056b extends a.AbstractBinderC0054a {
        BinderC0056b() {
        }

        @Override // b.a
        public void i0(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f2711o;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final int f2714n;

        /* renamed from: o  reason: collision with root package name */
        final Bundle f2715o;

        c(int i10, Bundle bundle) {
            this.f2714n = i10;
            this.f2715o = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f2714n, this.f2715o);
        }
    }

    b(Parcel parcel) {
        this.f2712p = a.AbstractBinderC0054a.a(parcel.readStrongBinder());
    }

    protected void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f2712p == null) {
                this.f2712p = new BinderC0056b();
            }
            parcel.writeStrongBinder(this.f2712p.asBinder());
        }
    }
}
