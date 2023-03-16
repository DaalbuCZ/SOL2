package r2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.a0;
import p3.i0;
/* loaded from: classes.dex */
public final class d extends r2.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final long f12966n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f12967o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f12968p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f12969q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f12970r;

    /* renamed from: s  reason: collision with root package name */
    public final long f12971s;

    /* renamed from: t  reason: collision with root package name */
    public final long f12972t;

    /* renamed from: u  reason: collision with root package name */
    public final List<b> f12973u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f12974v;

    /* renamed from: w  reason: collision with root package name */
    public final long f12975w;

    /* renamed from: x  reason: collision with root package name */
    public final int f12976x;

    /* renamed from: y  reason: collision with root package name */
    public final int f12977y;

    /* renamed from: z  reason: collision with root package name */
    public final int f12978z;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12979a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12980b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12981c;

        private b(int i10, long j10, long j11) {
            this.f12979a = i10;
            this.f12980b = j10;
            this.f12981c = j11;
        }

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f12979a);
            parcel.writeLong(this.f12980b);
            parcel.writeLong(this.f12981c);
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f12966n = j10;
        this.f12967o = z10;
        this.f12968p = z11;
        this.f12969q = z12;
        this.f12970r = z13;
        this.f12971s = j11;
        this.f12972t = j12;
        this.f12973u = Collections.unmodifiableList(list);
        this.f12974v = z14;
        this.f12975w = j13;
        this.f12976x = i10;
        this.f12977y = i11;
        this.f12978z = i12;
    }

    private d(Parcel parcel) {
        this.f12966n = parcel.readLong();
        this.f12967o = parcel.readByte() == 1;
        this.f12968p = parcel.readByte() == 1;
        this.f12969q = parcel.readByte() == 1;
        this.f12970r = parcel.readByte() == 1;
        this.f12971s = parcel.readLong();
        this.f12972t = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f12973u = Collections.unmodifiableList(arrayList);
        this.f12974v = parcel.readByte() == 1;
        this.f12975w = parcel.readLong();
        this.f12976x = parcel.readInt();
        this.f12977y = parcel.readInt();
        this.f12978z = parcel.readInt();
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(a0 a0Var, long j10, i0 i0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        long j13;
        long E = a0Var.E();
        boolean z15 = (a0Var.C() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z15) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int C = a0Var.C();
            boolean z16 = (C & 128) != 0;
            boolean z17 = (C & 64) != 0;
            boolean z18 = (C & 32) != 0;
            boolean z19 = (C & 16) != 0;
            long b10 = (!z17 || z19) ? -9223372036854775807L : g.b(a0Var, j10);
            if (!z17) {
                int C2 = a0Var.C();
                ArrayList arrayList = new ArrayList(C2);
                for (int i13 = 0; i13 < C2; i13++) {
                    int C3 = a0Var.C();
                    long b11 = !z19 ? g.b(a0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(C3, b11, i0Var.b(b11), null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long C4 = a0Var.C();
                boolean z20 = (128 & C4) != 0;
                j13 = ((((C4 & 1) << 32) | a0Var.E()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i10 = a0Var.I();
            z13 = z17;
            i11 = a0Var.C();
            i12 = a0Var.C();
            list = emptyList;
            long j14 = b10;
            z12 = z14;
            j12 = j13;
            z11 = z19;
            z10 = z16;
            j11 = j14;
        }
        return new d(E, z15, z10, z13, z11, j11, i0Var.b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12966n);
        parcel.writeByte(this.f12967o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12968p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12969q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12970r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12971s);
        parcel.writeLong(this.f12972t);
        int size = this.f12973u.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f12973u.get(i11).b(parcel);
        }
        parcel.writeByte(this.f12974v ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12975w);
        parcel.writeInt(this.f12976x);
        parcel.writeInt(this.f12977y);
        parcel.writeInt(this.f12978z);
    }
}
