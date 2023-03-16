package r2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.a0;
import p3.m0;
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0188a();

    /* renamed from: n  reason: collision with root package name */
    public final long f12960n;

    /* renamed from: o  reason: collision with root package name */
    public final long f12961o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f12962p;

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0188a implements Parcelable.Creator<a> {
        C0188a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f12960n = j11;
        this.f12961o = j10;
        this.f12962p = bArr;
    }

    private a(Parcel parcel) {
        this.f12960n = parcel.readLong();
        this.f12961o = parcel.readLong();
        this.f12962p = (byte[]) m0.j(parcel.createByteArray());
    }

    /* synthetic */ a(Parcel parcel, C0188a c0188a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(a0 a0Var, int i10, long j10) {
        long E = a0Var.E();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        return new a(E, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12960n);
        parcel.writeLong(this.f12961o);
        parcel.writeByteArray(this.f12962p);
    }
}
