package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g4.a;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class e1 extends p0 implements f1 {
    public e1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static f1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof f1 ? (f1) queryLocalInterface : new d1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        i1 g1Var;
        i1 i1Var = null;
        i1 i1Var2 = null;
        i1 i1Var3 = null;
        i1 i1Var4 = null;
        l1 l1Var = null;
        l1 l1Var2 = null;
        l1 l1Var3 = null;
        i1 i1Var5 = null;
        i1 i1Var6 = null;
        i1 i1Var7 = null;
        i1 i1Var8 = null;
        i1 i1Var9 = null;
        i1 i1Var10 = null;
        n1 n1Var = null;
        i1 i1Var11 = null;
        i1 i1Var12 = null;
        i1 i1Var13 = null;
        i1 i1Var14 = null;
        switch (i10) {
            case 1:
                long readLong = parcel.readLong();
                q0.c(parcel);
                initialize(a.AbstractBinderC0114a.e(parcel.readStrongBinder()), (o1) q0.a(parcel, o1.CREATOR), readLong);
                break;
            case 2:
                boolean g10 = q0.g(parcel);
                boolean g11 = q0.g(parcel);
                long readLong2 = parcel.readLong();
                q0.c(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) q0.a(parcel, Bundle.CREATOR), g10, g11, readLong2);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) q0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    g1Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var = queryLocalInterface instanceof i1 ? (i1) queryLocalInterface : new g1(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                q0.c(parcel);
                logEventAndBundle(readString, readString2, bundle, g1Var, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                g4.a e10 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                boolean g12 = q0.g(parcel);
                long readLong4 = parcel.readLong();
                q0.c(parcel);
                setUserProperty(readString3, readString4, e10, g12, readLong4);
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean g13 = q0.g(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var = queryLocalInterface2 instanceof i1 ? (i1) queryLocalInterface2 : new g1(readStrongBinder2);
                }
                q0.c(parcel);
                getUserProperties(readString5, readString6, g13, i1Var);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var14 = queryLocalInterface3 instanceof i1 ? (i1) queryLocalInterface3 : new g1(readStrongBinder3);
                }
                q0.c(parcel);
                getMaxUserProperties(readString7, i1Var14);
                break;
            case 7:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                q0.c(parcel);
                setUserId(readString8, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                q0.c(parcel);
                setConditionalUserProperty((Bundle) q0.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                q0.c(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) q0.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var13 = queryLocalInterface4 instanceof i1 ? (i1) queryLocalInterface4 : new g1(readStrongBinder4);
                }
                q0.c(parcel);
                getConditionalUserProperties(readString9, readString10, i1Var13);
                break;
            case 11:
                boolean g14 = q0.g(parcel);
                long readLong7 = parcel.readLong();
                q0.c(parcel);
                setMeasurementEnabled(g14, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                q0.c(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                q0.c(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                q0.c(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                g4.a e11 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                q0.c(parcel);
                setCurrentScreen(e11, readString11, readString12, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var12 = queryLocalInterface5 instanceof i1 ? (i1) queryLocalInterface5 : new g1(readStrongBinder5);
                }
                q0.c(parcel);
                getCurrentScreenName(i1Var12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var11 = queryLocalInterface6 instanceof i1 ? (i1) queryLocalInterface6 : new g1(readStrongBinder6);
                }
                q0.c(parcel);
                getCurrentScreenClass(i1Var11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    n1Var = queryLocalInterface7 instanceof n1 ? (n1) queryLocalInterface7 : new m1(readStrongBinder7);
                }
                q0.c(parcel);
                setInstanceIdProvider(n1Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var10 = queryLocalInterface8 instanceof i1 ? (i1) queryLocalInterface8 : new g1(readStrongBinder8);
                }
                q0.c(parcel);
                getCachedAppInstanceId(i1Var10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var9 = queryLocalInterface9 instanceof i1 ? (i1) queryLocalInterface9 : new g1(readStrongBinder9);
                }
                q0.c(parcel);
                getAppInstanceId(i1Var9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var8 = queryLocalInterface10 instanceof i1 ? (i1) queryLocalInterface10 : new g1(readStrongBinder10);
                }
                q0.c(parcel);
                getGmpAppId(i1Var8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var7 = queryLocalInterface11 instanceof i1 ? (i1) queryLocalInterface11 : new g1(readStrongBinder11);
                }
                q0.c(parcel);
                generateEventId(i1Var7);
                break;
            case c.j.f3071t3 /* 23 */:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                q0.c(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case c.j.f3076u3 /* 24 */:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                q0.c(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                g4.a e12 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                q0.c(parcel);
                onActivityStarted(e12, readLong14);
                break;
            case 26:
                g4.a e13 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                q0.c(parcel);
                onActivityStopped(e13, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                q0.c(parcel);
                onActivityCreated(a.AbstractBinderC0114a.e(parcel.readStrongBinder()), (Bundle) q0.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                g4.a e14 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                q0.c(parcel);
                onActivityDestroyed(e14, readLong17);
                break;
            case c.j.f3101z3 /* 29 */:
                g4.a e15 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                q0.c(parcel);
                onActivityPaused(e15, readLong18);
                break;
            case 30:
                g4.a e16 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                q0.c(parcel);
                onActivityResumed(e16, readLong19);
                break;
            case 31:
                g4.a e17 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var6 = queryLocalInterface12 instanceof i1 ? (i1) queryLocalInterface12 : new g1(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                q0.c(parcel);
                onActivitySaveInstanceState(e17, i1Var6, readLong20);
                break;
            case 32:
                Bundle bundle2 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var5 = queryLocalInterface13 instanceof i1 ? (i1) queryLocalInterface13 : new g1(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                q0.c(parcel);
                performAction(bundle2, i1Var5, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                g4.a e18 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                g4.a e19 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                g4.a e20 = a.AbstractBinderC0114a.e(parcel.readStrongBinder());
                q0.c(parcel);
                logHealthData(readInt, readString15, e18, e19, e20);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l1Var3 = queryLocalInterface14 instanceof l1 ? (l1) queryLocalInterface14 : new j1(readStrongBinder14);
                }
                q0.c(parcel);
                setEventInterceptor(l1Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l1Var2 = queryLocalInterface15 instanceof l1 ? (l1) queryLocalInterface15 : new j1(readStrongBinder15);
                }
                q0.c(parcel);
                registerOnMeasurementEventListener(l1Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l1Var = queryLocalInterface16 instanceof l1 ? (l1) queryLocalInterface16 : new j1(readStrongBinder16);
                }
                q0.c(parcel);
                unregisterOnMeasurementEventListener(l1Var);
                break;
            case 37:
                HashMap b10 = q0.b(parcel);
                q0.c(parcel);
                initForTests(b10);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var4 = queryLocalInterface17 instanceof i1 ? (i1) queryLocalInterface17 : new g1(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                q0.c(parcel);
                getTestFlag(i1Var4, readInt2);
                break;
            case 39:
                boolean g15 = q0.g(parcel);
                q0.c(parcel);
                setDataCollectionEnabled(g15);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var3 = queryLocalInterface18 instanceof i1 ? (i1) queryLocalInterface18 : new g1(readStrongBinder18);
                }
                q0.c(parcel);
                isDataCollectionEnabled(i1Var3);
                break;
            case 41:
            default:
                return false;
            case 42:
                q0.c(parcel);
                setDefaultEventParameters((Bundle) q0.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                q0.c(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                q0.c(parcel);
                setConsent((Bundle) q0.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                q0.c(parcel);
                setConsentThirdParty((Bundle) q0.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var2 = queryLocalInterface19 instanceof i1 ? (i1) queryLocalInterface19 : new g1(readStrongBinder19);
                }
                q0.c(parcel);
                getSessionId(i1Var2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
