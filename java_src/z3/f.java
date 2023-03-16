package z3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import z3.i;
/* loaded from: classes.dex */
public class f extends a4.a {
    private String A;

    /* renamed from: n  reason: collision with root package name */
    final int f17356n;

    /* renamed from: o  reason: collision with root package name */
    final int f17357o;

    /* renamed from: p  reason: collision with root package name */
    int f17358p;

    /* renamed from: q  reason: collision with root package name */
    String f17359q;

    /* renamed from: r  reason: collision with root package name */
    IBinder f17360r;

    /* renamed from: s  reason: collision with root package name */
    Scope[] f17361s;

    /* renamed from: t  reason: collision with root package name */
    Bundle f17362t;

    /* renamed from: u  reason: collision with root package name */
    Account f17363u;

    /* renamed from: v  reason: collision with root package name */
    w3.d[] f17364v;

    /* renamed from: w  reason: collision with root package name */
    w3.d[] f17365w;

    /* renamed from: x  reason: collision with root package name */
    boolean f17366x;

    /* renamed from: y  reason: collision with root package name */
    int f17367y;

    /* renamed from: z  reason: collision with root package name */
    boolean f17368z;
    public static final Parcelable.Creator<f> CREATOR = new e1();
    static final Scope[] B = new Scope[0];
    static final w3.d[] C = new w3.d[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, w3.d[] dVarArr, w3.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? B : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? C : dVarArr;
        dVarArr2 = dVarArr2 == null ? C : dVarArr2;
        this.f17356n = i10;
        this.f17357o = i11;
        this.f17358p = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f17359q = "com.google.android.gms";
        } else {
            this.f17359q = str;
        }
        if (i10 < 2) {
            this.f17363u = iBinder != null ? a.f(i.a.e(iBinder)) : null;
        } else {
            this.f17360r = iBinder;
            this.f17363u = account;
        }
        this.f17361s = scopeArr;
        this.f17362t = bundle;
        this.f17364v = dVarArr;
        this.f17365w = dVarArr2;
        this.f17366x = z10;
        this.f17367y = i13;
        this.f17368z = z11;
        this.A = str2;
    }

    public final String k() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e1.a(this, parcel, i10);
    }
}
