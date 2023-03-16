package w3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import javax.annotation.Nullable;
import z3.p1;
/* loaded from: classes.dex */
public final class e0 extends a4.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: n  reason: collision with root package name */
    private final String f16076n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final v f16077o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f16078p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f16079q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(String str, @Nullable IBinder iBinder, boolean z10, boolean z11) {
        this.f16076n = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                g4.a d10 = p1.e(iBinder).d();
                byte[] bArr = d10 == null ? null : (byte[]) g4.b.f(d10);
                if (bArr != null) {
                    wVar = new w(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f16077o = wVar;
        this.f16078p = z10;
        this.f16079q = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(String str, @Nullable v vVar, boolean z10, boolean z11) {
        this.f16076n = str;
        this.f16077o = vVar;
        this.f16078p = z10;
        this.f16079q = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.n(parcel, 1, this.f16076n, false);
        v vVar = this.f16077o;
        if (vVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            vVar = null;
        }
        a4.c.h(parcel, 2, vVar, false);
        a4.c.c(parcel, 3, this.f16078p);
        a4.c.c(parcel, 4, this.f16079q);
        a4.c.b(parcel, a10);
    }
}
