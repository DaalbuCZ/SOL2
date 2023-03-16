package com.google.android.play.core.install;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    private final int f5233a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5234b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5235c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5236d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5237e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, long j10, long j11, int i11, String str) {
        this.f5233a = i10;
        this.f5234b = j10;
        this.f5235c = j11;
        this.f5236d = i11;
        Objects.requireNonNull(str, "Null packageName");
        this.f5237e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.f5234b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.f5236d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.f5233a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f5237e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.f5235c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f5233a == installState.c() && this.f5234b == installState.a() && this.f5235c == installState.e() && this.f5236d == installState.b() && this.f5237e.equals(installState.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f5233a;
        long j10 = this.f5234b;
        long j11 = this.f5235c;
        return ((((((((i10 ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f5236d) * 1000003) ^ this.f5237e.hashCode();
    }

    public final String toString() {
        int i10 = this.f5233a;
        long j10 = this.f5234b;
        long j11 = this.f5235c;
        int i11 = this.f5236d;
        String str = this.f5237e;
        return "InstallState{installStatus=" + i10 + ", bytesDownloaded=" + j10 + ", totalBytesToDownload=" + j11 + ", installErrorCode=" + i11 + ", packageName=" + str + "}";
    }
}
