package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class d1 extends o0 implements f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeLong(j10);
        f(23, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        q0.e(a10, bundle);
        f(9, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void clearMeasurementEnabled(long j10) {
        Parcel a10 = a();
        a10.writeLong(j10);
        f(43, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void endAdUnitExposure(String str, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeLong(j10);
        f(24, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void generateEventId(i1 i1Var) {
        Parcel a10 = a();
        q0.f(a10, i1Var);
        f(22, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getAppInstanceId(i1 i1Var) {
        Parcel a10 = a();
        q0.f(a10, i1Var);
        f(20, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCachedAppInstanceId(i1 i1Var) {
        Parcel a10 = a();
        q0.f(a10, i1Var);
        f(19, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getConditionalUserProperties(String str, String str2, i1 i1Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        q0.f(a10, i1Var);
        f(10, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCurrentScreenClass(i1 i1Var) {
        Parcel a10 = a();
        q0.f(a10, i1Var);
        f(17, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCurrentScreenName(i1 i1Var) {
        Parcel a10 = a();
        q0.f(a10, i1Var);
        f(16, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getGmpAppId(i1 i1Var) {
        Parcel a10 = a();
        q0.f(a10, i1Var);
        f(21, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getMaxUserProperties(String str, i1 i1Var) {
        Parcel a10 = a();
        a10.writeString(str);
        q0.f(a10, i1Var);
        f(6, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getUserProperties(String str, String str2, boolean z10, i1 i1Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        q0.d(a10, z10);
        q0.f(a10, i1Var);
        f(5, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void initialize(g4.a aVar, o1 o1Var, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        q0.e(a10, o1Var);
        a10.writeLong(j10);
        f(1, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        q0.e(a10, bundle);
        q0.d(a10, z10);
        q0.d(a10, z11);
        a10.writeLong(j10);
        f(2, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void logHealthData(int i10, String str, g4.a aVar, g4.a aVar2, g4.a aVar3) {
        Parcel a10 = a();
        a10.writeInt(5);
        a10.writeString(str);
        q0.f(a10, aVar);
        q0.f(a10, aVar2);
        q0.f(a10, aVar3);
        f(33, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityCreated(g4.a aVar, Bundle bundle, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        q0.e(a10, bundle);
        a10.writeLong(j10);
        f(27, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityDestroyed(g4.a aVar, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        a10.writeLong(j10);
        f(28, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityPaused(g4.a aVar, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        a10.writeLong(j10);
        f(29, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityResumed(g4.a aVar, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        a10.writeLong(j10);
        f(30, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivitySaveInstanceState(g4.a aVar, i1 i1Var, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        q0.f(a10, i1Var);
        a10.writeLong(j10);
        f(31, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityStarted(g4.a aVar, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        a10.writeLong(j10);
        f(25, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityStopped(g4.a aVar, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        a10.writeLong(j10);
        f(26, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void registerOnMeasurementEventListener(l1 l1Var) {
        Parcel a10 = a();
        q0.f(a10, l1Var);
        f(35, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void resetAnalyticsData(long j10) {
        Parcel a10 = a();
        a10.writeLong(j10);
        f(12, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel a10 = a();
        q0.e(a10, bundle);
        a10.writeLong(j10);
        f(8, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel a10 = a();
        q0.e(a10, bundle);
        a10.writeLong(j10);
        f(45, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setCurrentScreen(g4.a aVar, String str, String str2, long j10) {
        Parcel a10 = a();
        q0.f(a10, aVar);
        a10.writeString(str);
        a10.writeString(str2);
        a10.writeLong(j10);
        f(15, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel a10 = a();
        q0.d(a10, z10);
        f(39, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel a10 = a();
        q0.e(a10, bundle);
        f(42, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel a10 = a();
        q0.d(a10, z10);
        a10.writeLong(j10);
        f(11, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setSessionTimeoutDuration(long j10) {
        Parcel a10 = a();
        a10.writeLong(j10);
        f(14, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setUserId(String str, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeLong(j10);
        f(7, a10);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setUserProperty(String str, String str2, g4.a aVar, boolean z10, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        q0.f(a10, aVar);
        q0.d(a10, z10);
        a10.writeLong(j10);
        f(4, a10);
    }
}
