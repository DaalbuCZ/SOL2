package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class z2 extends w3 {

    /* renamed from: c  reason: collision with root package name */
    private final x2 f5216c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5217d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z2(j4 j4Var) {
        super(j4Var);
        Context c10 = this.f4438a.c();
        this.f4438a.z();
        this.f5216c = new x2(this, c10, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean x(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z2.x(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean n() {
        return false;
    }

    final SQLiteDatabase o() {
        if (this.f5217d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f5216c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f5217d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x023e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(int r23) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z2.p(int):java.util.List");
    }

    public final void q() {
        int delete;
        h();
        try {
            SQLiteDatabase o10 = o();
            if (o10 == null || (delete = o10.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f4438a.d().v().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            this.f4438a.d().r().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean r() {
        return x(3, new byte[0]);
    }

    final boolean s() {
        Context c10 = this.f4438a.c();
        this.f4438a.z();
        return c10.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean t() {
        int i10;
        h();
        if (!this.f5217d && s()) {
            int i11 = 5;
            for (i10 = 0; i10 < 5; i10 = i10 + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase o10 = o();
                    if (o10 == null) {
                        this.f5217d = true;
                        return false;
                    }
                    o10.beginTransaction();
                    o10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    o10.setTransactionSuccessful();
                    o10.endTransaction();
                    o10.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i11);
                    i11 += 20;
                    i10 = 0 == 0 ? i10 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e10) {
                    this.f4438a.d().r().b("Error deleting app launch break from local database", e10);
                    this.f5217d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.f4438a.d().r().b("Error deleting app launch break from local database", e11);
                    this.f5217d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f4438a.d().w().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean u(d dVar) {
        byte[] c02 = this.f4438a.N().c0(dVar);
        if (c02.length > 131072) {
            this.f4438a.d().t().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return x(2, c02);
    }

    public final boolean v(v vVar) {
        Parcel obtain = Parcel.obtain();
        w.a(vVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f4438a.d().t().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return x(0, marshall);
    }

    public final boolean w(d9 d9Var) {
        Parcel obtain = Parcel.obtain();
        e9.a(d9Var, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f4438a.d().t().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return x(1, marshall);
    }
}
