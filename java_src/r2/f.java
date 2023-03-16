package r2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.a0;
/* loaded from: classes.dex */
public final class f extends r2.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final List<c> f12982n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12983a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12984b;

        private b(int i10, long j10) {
            this.f12983a = i10;
            this.f12984b = j10;
        }

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f12983a);
            parcel.writeLong(this.f12984b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f12985a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12986b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12987c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f12988d;

        /* renamed from: e  reason: collision with root package name */
        public final long f12989e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f12990f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f12991g;

        /* renamed from: h  reason: collision with root package name */
        public final long f12992h;

        /* renamed from: i  reason: collision with root package name */
        public final int f12993i;

        /* renamed from: j  reason: collision with root package name */
        public final int f12994j;

        /* renamed from: k  reason: collision with root package name */
        public final int f12995k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f12985a = j10;
            this.f12986b = z10;
            this.f12987c = z11;
            this.f12988d = z12;
            this.f12990f = Collections.unmodifiableList(list);
            this.f12989e = j11;
            this.f12991g = z13;
            this.f12992h = j12;
            this.f12993i = i10;
            this.f12994j = i11;
            this.f12995k = i12;
        }

        private c(Parcel parcel) {
            this.f12985a = parcel.readLong();
            this.f12986b = parcel.readByte() == 1;
            this.f12987c = parcel.readByte() == 1;
            this.f12988d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f12990f = Collections.unmodifiableList(arrayList);
            this.f12989e = parcel.readLong();
            this.f12991g = parcel.readByte() == 1;
            this.f12992h = parcel.readLong();
            this.f12993i = parcel.readInt();
            this.f12994j = parcel.readInt();
            this.f12995k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(a0 a0Var) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j12;
            long E = a0Var.E();
            boolean z14 = (a0Var.C() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int C = a0Var.C();
                boolean z15 = (C & 128) != 0;
                boolean z16 = (C & 64) != 0;
                boolean z17 = (C & 32) != 0;
                long E2 = z16 ? a0Var.E() : -9223372036854775807L;
                if (!z16) {
                    int C2 = a0Var.C();
                    ArrayList arrayList3 = new ArrayList(C2);
                    for (int i13 = 0; i13 < C2; i13++) {
                        arrayList3.add(new b(a0Var.C(), a0Var.E(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long C3 = a0Var.C();
                    boolean z18 = (128 & C3) != 0;
                    j12 = ((((C3 & 1) << 32) | a0Var.E()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int I = a0Var.I();
                int C4 = a0Var.C();
                z12 = z16;
                i12 = a0Var.C();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = E2;
                i10 = I;
                i11 = C4;
                j10 = j13;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(E, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f12985a);
            parcel.writeByte(this.f12986b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f12987c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f12988d ? (byte) 1 : (byte) 0);
            int size = this.f12990f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f12990f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f12989e);
            parcel.writeByte(this.f12991g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f12992h);
            parcel.writeInt(this.f12993i);
            parcel.writeInt(this.f12994j);
            parcel.writeInt(this.f12995k);
        }
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f12982n = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    private f(List<c> list) {
        this.f12982n = Collections.unmodifiableList(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(a0 a0Var) {
        int C = a0Var.C();
        ArrayList arrayList = new ArrayList(C);
        for (int i10 = 0; i10 < C; i10++) {
            arrayList.add(c.e(a0Var));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f12982n.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f12982n.get(i11).f(parcel);
        }
    }
}
