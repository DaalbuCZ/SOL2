package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0083a();

    /* renamed from: n  reason: collision with root package name */
    private final String f5747n;

    /* renamed from: o  reason: collision with root package name */
    private final AtomicLong f5748o;

    /* renamed from: com.google.firebase.perf.metrics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0083a implements Parcelable.Creator<a> {
        C0083a() {
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

    private a(Parcel parcel) {
        this.f5747n = parcel.readString();
        this.f5748o = new AtomicLong(parcel.readLong());
    }

    /* synthetic */ a(Parcel parcel, C0083a c0083a) {
        this(parcel);
    }

    public a(String str) {
        this.f5747n = str;
        this.f5748o = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f5748o.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f5747n;
    }

    public void c(long j10) {
        this.f5748o.addAndGet(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j10) {
        this.f5748o.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5747n);
        parcel.writeLong(this.f5748o.get());
    }
}
