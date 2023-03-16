package z3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public final class e1 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, fVar.f17356n);
        a4.c.i(parcel, 2, fVar.f17357o);
        a4.c.i(parcel, 3, fVar.f17358p);
        a4.c.n(parcel, 4, fVar.f17359q, false);
        a4.c.h(parcel, 5, fVar.f17360r, false);
        a4.c.p(parcel, 6, fVar.f17361s, i10, false);
        a4.c.e(parcel, 7, fVar.f17362t, false);
        a4.c.m(parcel, 8, fVar.f17363u, i10, false);
        a4.c.p(parcel, 10, fVar.f17364v, i10, false);
        a4.c.p(parcel, 11, fVar.f17365w, i10, false);
        a4.c.c(parcel, 12, fVar.f17366x);
        a4.c.i(parcel, 13, fVar.f17367y);
        a4.c.c(parcel, 14, fVar.f17368z);
        a4.c.n(parcel, 15, fVar.k(), false);
        a4.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u10 = a4.b.u(parcel);
        Scope[] scopeArr = f.B;
        Bundle bundle = new Bundle();
        w3.d[] dVarArr = f.C;
        w3.d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < u10) {
            int n10 = a4.b.n(parcel);
            switch (a4.b.i(n10)) {
                case 1:
                    i10 = a4.b.p(parcel, n10);
                    break;
                case 2:
                    i11 = a4.b.p(parcel, n10);
                    break;
                case 3:
                    i12 = a4.b.p(parcel, n10);
                    break;
                case 4:
                    str = a4.b.d(parcel, n10);
                    break;
                case 5:
                    iBinder = a4.b.o(parcel, n10);
                    break;
                case 6:
                    scopeArr = (Scope[]) a4.b.f(parcel, n10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = a4.b.a(parcel, n10);
                    break;
                case 8:
                    account = (Account) a4.b.c(parcel, n10, Account.CREATOR);
                    break;
                case 9:
                default:
                    a4.b.t(parcel, n10);
                    break;
                case 10:
                    dVarArr = (w3.d[]) a4.b.f(parcel, n10, w3.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (w3.d[]) a4.b.f(parcel, n10, w3.d.CREATOR);
                    break;
                case 12:
                    z10 = a4.b.j(parcel, n10);
                    break;
                case 13:
                    i13 = a4.b.p(parcel, n10);
                    break;
                case 14:
                    z11 = a4.b.j(parcel, n10);
                    break;
                case 15:
                    str2 = a4.b.d(parcel, n10);
                    break;
            }
        }
        a4.b.h(parcel, u10);
        return new f(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
