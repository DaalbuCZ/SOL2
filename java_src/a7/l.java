package a7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    private long f257n;

    /* renamed from: o  reason: collision with root package name */
    private long f258o;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l() {
        this(j(), a());
    }

    l(long j10, long j11) {
        this.f257n = j10;
        this.f258o = j11;
    }

    private l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    /* synthetic */ l(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        TimeUnit timeUnit;
        long elapsedRealtime;
        if (Build.VERSION.SDK_INT >= 17) {
            timeUnit = TimeUnit.NANOSECONDS;
            elapsedRealtime = SystemClock.elapsedRealtimeNanos();
        } else {
            timeUnit = TimeUnit.MILLISECONDS;
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        return timeUnit.toMicros(elapsedRealtime);
    }

    public static l f(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new l(j() + (micros - a()), micros);
    }

    private static long j() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f257n + c();
    }

    public long c() {
        return d(new l());
    }

    public long d(l lVar) {
        return lVar.f258o - this.f258o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f257n;
    }

    public void i() {
        this.f257n = j();
        this.f258o = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f257n);
        parcel.writeLong(this.f258o);
    }
}
