package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f2407d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f2408e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2409f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2410g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2411h;

    /* renamed from: i  reason: collision with root package name */
    private int f2412i;

    /* renamed from: j  reason: collision with root package name */
    private int f2413j;

    /* renamed from: k  reason: collision with root package name */
    private int f2414k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m.a(), new m.a(), new m.a());
    }

    private b(Parcel parcel, int i10, int i11, String str, m.a<String, Method> aVar, m.a<String, Method> aVar2, m.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2407d = new SparseIntArray();
        this.f2412i = -1;
        this.f2413j = 0;
        this.f2414k = -1;
        this.f2408e = parcel;
        this.f2409f = i10;
        this.f2410g = i11;
        this.f2413j = i10;
        this.f2411h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2408e.writeInt(-1);
            return;
        }
        this.f2408e.writeInt(bArr.length);
        this.f2408e.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2408e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f2408e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f2408e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f2408e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f2412i;
        if (i10 >= 0) {
            int i11 = this.f2407d.get(i10);
            int dataPosition = this.f2408e.dataPosition();
            this.f2408e.setDataPosition(i11);
            this.f2408e.writeInt(dataPosition - i11);
            this.f2408e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2408e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f2413j;
        if (i10 == this.f2409f) {
            i10 = this.f2410g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f2411h + "  ", this.f2404a, this.f2405b, this.f2406c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f2408e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f2408e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2408e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2408e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f2413j < this.f2410g) {
            int i11 = this.f2414k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f2408e.setDataPosition(this.f2413j);
            int readInt = this.f2408e.readInt();
            this.f2414k = this.f2408e.readInt();
            this.f2413j += readInt;
        }
        return this.f2414k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f2408e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f2408e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f2408e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f2412i = i10;
        this.f2407d.put(i10, this.f2408e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f2408e.writeInt(z10 ? 1 : 0);
    }
}
