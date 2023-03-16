package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.xc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends q8 {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f4717f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f4718g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f4719h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f4720i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f4721j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f4722k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f4723l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f4724m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    private final k f4725d;

    /* renamed from: e  reason: collision with root package name */
    private final m8 f4726e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(a9 a9Var) {
        super(a9Var);
        this.f4726e = new m8(this.f4438a.e());
        this.f4438a.z();
        this.f4725d = new k(this, this.f4438a.c(), "google_app_measurement.db");
    }

    static final void H(ContentValues contentValues, String str, Object obj) {
        z3.o.e("value");
        z3.o.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put("value", (Double) obj);
        }
    }

    private final long I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = P().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.f4438a.d().r().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long K(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = P().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                this.f4438a.d().r().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0227: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0227 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void G(String str, long j10, long j11, y8 y8Var) {
        ?? r42;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        int i10;
        String str2;
        String[] strArr;
        z3.o.i(y8Var);
        h();
        i();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase P = P();
                r42 = TextUtils.isEmpty(null);
                try {
                    if (r42 != 0) {
                        int i11 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        rawQuery = P.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (i11 != 0 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", i11 != 0 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i12 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        rawQuery = P.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (i12 != 0 ? " and rowid <= ?" : "") + " order by rowid limit 1;", i12 != 0 ? new String[]{null, String.valueOf(j11)} : new String[]{null});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str4 = string;
                    try {
                        Cursor query = P.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str4}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f4438a.d().r().b("Raw event metadata record is missing. appId", f3.z(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.d5 d5Var = (com.google.android.gms.internal.measurement.d5) ((com.google.android.gms.internal.measurement.c5) c9.C(com.google.android.gms.internal.measurement.d5.P1(), query.getBlob(0))).q();
                                    if (query.moveToNext()) {
                                        this.f4438a.d().w().b("Get multiple raw event metadata records, expected one. appId", f3.z(str3));
                                    }
                                    query.close();
                                    z3.o.i(d5Var);
                                    y8Var.f5207a = d5Var;
                                    if (j11 != -1) {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str3, str4, String.valueOf(j11)};
                                    } else {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str3, str4};
                                    }
                                    Cursor query2 = P.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.f4438a.d().w().b("Raw event data disappeared while in transaction. appId", f3.z(str3));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = query2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.r4 r4Var = (com.google.android.gms.internal.measurement.r4) c9.C(com.google.android.gms.internal.measurement.s4.I(), query2.getBlob(3));
                                            r4Var.G(query2.getString(i10));
                                            r4Var.K(query2.getLong(2));
                                            if (!y8Var.a(j12, (com.google.android.gms.internal.measurement.s4) r4Var.q())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e10) {
                                            this.f4438a.d().r().c("Data loss. Failed to merge raw event. appId", f3.z(str3), e10);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e11) {
                                    this.f4438a.d().r().c("Data loss. Failed to merge raw event metadata. appId", f3.z(str3), e11);
                                    query.close();
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                r42 = str4;
                                this.f4438a.d().r().c("Data loss. Error selecting raw event. appId", f3.z(str3), e);
                                if (r42 != 0) {
                                    r42.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = str4;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str4 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            str4 = query;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        r42 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e16) {
            e = e16;
            r42 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int J(String str, String str2) {
        z3.o.e(str);
        z3.o.e(str2);
        h();
        i();
        try {
            return P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f4438a.d().r().d("Error deleting conditional property", f3.z(str), this.f4438a.D().f(str2), e10);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long L(String str, String str2) {
        long j10;
        SQLiteException e10;
        ContentValues contentValues;
        z3.o.e(str);
        z3.o.e("first_open_count");
        h();
        i();
        SQLiteDatabase P = P();
        P.beginTransaction();
        try {
            try {
                j10 = K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j10 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (P.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f4438a.d().r().c("Failed to insert column (got -1). appId", f3.z(str), "first_open_count");
                        return -1L;
                    }
                    j10 = 0;
                }
            } catch (SQLiteException e11) {
                j10 = 0;
                e10 = e11;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Long.valueOf(1 + j10));
            } catch (SQLiteException e12) {
                e10 = e12;
                this.f4438a.d().r().d("Error inserting column. appId", f3.z(str), "first_open_count", e10);
                return j10;
            }
            if (P.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f4438a.d().r().c("Failed to update column (got 0). appId", f3.z(str), "first_open_count");
                return -1L;
            }
            P.setTransactionSuccessful();
            return j10;
        } finally {
            P.endTransaction();
        }
    }

    public final long M() {
        return K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long N() {
        return K("select max(timestamp) from raw_events", null, 0L);
    }

    public final long O(String str) {
        z3.o.e(str);
        return K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase P() {
        h();
        try {
            return this.f4725d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f4438a.d().w().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.P()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.j4 r8 = r7.f4438a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.f3 r8 = r8.d()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.d3 r8 = r8.v()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.r4 r3 = com.google.android.gms.internal.measurement.s4.I()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.na r2 = com.google.android.gms.measurement.internal.c9.C(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.r4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.i9 r2 = r2.q()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.s4 r2 = (com.google.android.gms.internal.measurement.s4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.a9 r8 = r7.f4898b     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.g0()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.M()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.w4 r3 = (com.google.android.gms.internal.measurement.w4) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.K()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.X()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.E()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.Y()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.F()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.b0()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.L()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.Z()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.H()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.j4 r3 = r7.f4438a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.f3 r3 = r3.d()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.d3 r3 = r3.r()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.f3.z(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.j4 r2 = r7.f4438a     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.f3 r2 = r2.d()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.d3 r2 = r2.r()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0170 A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c2 A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.m5 R(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.R(java.lang.String):com.google.android.gms.measurement.internal.m5");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.d S(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    public final j T(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return U(j10, str, 1L, false, false, z12, false, z14);
    }

    public final j U(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        z3.o.e(str);
        h();
        i();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase P = P();
                Cursor query = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f4438a.d().w().b("Not updating daily counts, app is not known. appId", f3.z(str));
                    query.close();
                    return jVar;
                }
                if (query.getLong(0) == j10) {
                    jVar.f4643b = query.getLong(1);
                    jVar.f4642a = query.getLong(2);
                    jVar.f4644c = query.getLong(3);
                    jVar.f4645d = query.getLong(4);
                    jVar.f4646e = query.getLong(5);
                }
                if (z10) {
                    jVar.f4643b += j11;
                }
                if (z11) {
                    jVar.f4642a += j11;
                }
                if (z12) {
                    jVar.f4644c += j11;
                }
                if (z13) {
                    jVar.f4645d += j11;
                }
                if (z14) {
                    jVar.f4646e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(jVar.f4642a));
                contentValues.put("daily_events_count", Long.valueOf(jVar.f4643b));
                contentValues.put("daily_conversions_count", Long.valueOf(jVar.f4644c));
                contentValues.put("daily_error_events_count", Long.valueOf(jVar.f4645d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f4646e));
                P.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return jVar;
            } catch (SQLiteException e10) {
                this.f4438a.d().r().c("Error updating daily counts. appId", f3.z(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return jVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.r V(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.f9 X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            z3.o.e(r20)
            z3.o.e(r21)
            r19.h()
            r19.i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.P()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.Y(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.f9 r0 = new com.google.android.gms.measurement.internal.f9     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.j4 r2 = r1.f4438a     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.f3 r2 = r2.d()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.d3 r2 = r2.r()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.f3.z(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f4438a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.f3 r2 = r2.d()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.d3 r2 = r2.r()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.f3.z(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.j4 r5 = r1.f4438a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.a3 r5 = r5.D()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.f(r9)     // Catch: java.lang.Throwable -> La2
            r2.d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.f9");
    }

    final Object Y(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f4438a.d().r().a("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.f4438a.d().r().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    this.f4438a.d().r().a("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i10);
            }
            return Double.valueOf(cursor.getDouble(i10));
        } else {
            return Long.valueOf(cursor.getLong(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.j4 r3 = r6.f4438a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.f3 r3 = r3.d()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.d3 r3 = r3.r()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.Z():java.lang.String");
    }

    public final List a0(String str, String str2, String str3) {
        z3.o.e(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.f4438a.d().r();
        r27.f4438a.z();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.b0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List c0(String str) {
        z3.o.e(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f4438a.z();
                cursor = P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object Y = Y(cursor, 3);
                    if (Y == null) {
                        this.f4438a.d().r().b("Read invalid user property value, ignoring it. appId", f3.z(str));
                    } else {
                        arrayList.add(new f9(str, str2, string, j10, Y));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.f4438a.d().r().c("Error querying user properties. appId", f3.z(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r0 = r17.f4438a.d().r();
        r17.f4438a.z();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void e0() {
        i();
        P().beginTransaction();
    }

    public final void f0() {
        i();
        P().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g0(List list) {
        h();
        i();
        z3.o.i(list);
        z3.o.k(list.size());
        if (u()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.f4438a.d().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                this.f4438a.d().r().b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h0() {
        h();
        i();
        if (u()) {
            long a10 = this.f4898b.e0().f5185e.a();
            long b10 = this.f4438a.e().b();
            long abs = Math.abs(b10 - a10);
            this.f4438a.z();
            if (abs > ((Long) u2.f5085z.a(null)).longValue()) {
                this.f4898b.e0().f5185e.b(b10);
                h();
                i();
                if (u()) {
                    SQLiteDatabase P = P();
                    this.f4438a.z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f4438a.e().a()), String.valueOf(h.i())});
                    if (delete > 0) {
                        this.f4438a.d().v().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.q8
    protected final boolean l() {
        return false;
    }

    public final void m(String str, String str2) {
        z3.o.e(str);
        z3.o.e(str2);
        h();
        i();
        try {
            P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f4438a.d().r().d("Error deleting user property. appId", f3.z(str), this.f4438a.D().f(str2), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x032f, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0343, code lost:
        if (P().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0345, code lost:
        r23.f4438a.d().r().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.f3.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0359, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x035d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x035e, code lost:
        r3 = r23.f4438a.d().r();
        r7 = "Error storing property filter. appId";
        r8 = com.google.android.gms.measurement.internal.f3.z(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0370, code lost:
        i();
        h();
        z3.o.e(r24);
        r0 = P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03a7, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0176, code lost:
        r0.c(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017a, code lost:
        r11 = r0.L().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0186, code lost:
        if (r11.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
        if (((com.google.android.gms.internal.measurement.r3) r11.next()).N() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0194, code lost:
        r0 = r23.f4438a.d().w();
        r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r9 = com.google.android.gms.measurement.internal.f3.z(r24);
        r10 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a9, code lost:
        r11 = r0.K().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bf, code lost:
        if (r11.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c1, code lost:
        r12 = (com.google.android.gms.internal.measurement.i3) r11.next();
        i();
        h();
        z3.o.e(r24);
        z3.o.i(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01db, code lost:
        if (r12.K().isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01dd, code lost:
        r0 = r23.f4438a.d().w();
        r9 = com.google.android.gms.measurement.internal.f3.z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f5, code lost:
        if (r12.S() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f7, code lost:
        r20 = java.lang.Integer.valueOf(r12.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0202, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0204, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020f, code lost:
        r3 = r12.i();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0228, code lost:
        if (r12.S() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022a, code lost:
        r9 = java.lang.Integer.valueOf(r12.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0233, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0234, code lost:
        r7.put("filter_id", r9);
        r7.put("event_name", r12.K());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0244, code lost:
        if (r12.T() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
        r9 = java.lang.Boolean.valueOf(r12.Q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024f, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0250, code lost:
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0264, code lost:
        if (P().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0266, code lost:
        r23.f4438a.d().r().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.f3.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0280, code lost:
        r3 = r23.f4438a.d().r();
        r7 = "Error storing event filter. appId";
        r8 = com.google.android.gms.measurement.internal.f3.z(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0290, code lost:
        r3.c(r7, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        r21 = r7;
        r0 = r0.L().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a3, code lost:
        if (r0.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a5, code lost:
        r3 = (com.google.android.gms.internal.measurement.r3) r0.next();
        i();
        h();
        z3.o.e(r24);
        z3.o.i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02bf, code lost:
        if (r3.I().isEmpty() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c1, code lost:
        r0 = r23.f4438a.d().w();
        r8 = com.google.android.gms.measurement.internal.f3.z(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d9, code lost:
        if (r3.N() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02db, code lost:
        r3 = java.lang.Integer.valueOf(r3.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02e4, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e5, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ee, code lost:
        r7 = r3.i();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0305, code lost:
        if (r3.N() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0307, code lost:
        r12 = java.lang.Integer.valueOf(r3.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0310, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0311, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.I());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0323, code lost:
        if (r3.O() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0325, code lost:
        r0 = java.lang.Boolean.valueOf(r3.M());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x032e, code lost:
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.n(java.lang.String, java.util.List):void");
    }

    public final void o() {
        i();
        P().setTransactionSuccessful();
    }

    public final void p(m5 m5Var) {
        z3.o.i(m5Var);
        h();
        i();
        String d02 = m5Var.d0();
        z3.o.i(d02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d02);
        contentValues.put("app_instance_id", m5Var.e0());
        contentValues.put("gmp_app_id", m5Var.i0());
        contentValues.put("resettable_device_id_hash", m5Var.a());
        contentValues.put("last_bundle_index", Long.valueOf(m5Var.Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(m5Var.Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(m5Var.X()));
        contentValues.put("app_version", m5Var.g0());
        contentValues.put("app_store", m5Var.f0());
        contentValues.put("gmp_version", Long.valueOf(m5Var.W()));
        contentValues.put("dev_cert_hash", Long.valueOf(m5Var.T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(m5Var.J()));
        contentValues.put("day", Long.valueOf(m5Var.S()));
        contentValues.put("daily_public_events_count", Long.valueOf(m5Var.Q()));
        contentValues.put("daily_events_count", Long.valueOf(m5Var.P()));
        contentValues.put("daily_conversions_count", Long.valueOf(m5Var.N()));
        contentValues.put("config_fetched_time", Long.valueOf(m5Var.M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(m5Var.V()));
        contentValues.put("app_version_int", Long.valueOf(m5Var.L()));
        contentValues.put("firebase_instance_id", m5Var.h0());
        contentValues.put("daily_error_events_count", Long.valueOf(m5Var.O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(m5Var.R()));
        contentValues.put("health_monitor_sample", m5Var.j0());
        m5Var.A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(m5Var.I()));
        contentValues.put("admob_app_id", m5Var.b0());
        contentValues.put("dynamite_version", Long.valueOf(m5Var.U()));
        contentValues.put("session_stitching_token", m5Var.b());
        List c10 = m5Var.c();
        if (c10 != null) {
            if (c10.isEmpty()) {
                this.f4438a.d().w().b("Safelisted events should not be an empty list. appId", d02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c10));
            }
        }
        xc.c();
        if (this.f4438a.z().B(null, u2.f5058k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = P();
            if (P.update("apps", contentValues, "app_id = ?", new String[]{d02}) == 0 && P.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f4438a.d().r().b("Failed to insert/update app (got -1). appId", f3.z(d02));
            }
        } catch (SQLiteException e10) {
            this.f4438a.d().r().c("Error storing app. appId", f3.z(d02), e10);
        }
    }

    public final void q(r rVar) {
        z3.o.i(rVar);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rVar.f4936a);
        contentValues.put("name", rVar.f4937b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f4938c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f4939d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f4941f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f4942g));
        contentValues.put("last_bundled_day", rVar.f4943h);
        contentValues.put("last_sampled_complex_event_id", rVar.f4944i);
        contentValues.put("last_sampling_rate", rVar.f4945j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f4940e));
        Boolean bool = rVar.f4946k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f4438a.d().r().b("Failed to insert/update event aggregates (got -1). appId", f3.z(rVar.f4936a));
            }
        } catch (SQLiteException e10) {
            this.f4438a.d().r().c("Error storing event aggregates. appId", f3.z(rVar.f4936a), e10);
        }
    }

    public final boolean r() {
        return I("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean s() {
        return I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean t() {
        return I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean u() {
        Context c10 = this.f4438a.c();
        this.f4438a.z();
        return c10.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean v(String str, Long l10, long j10, com.google.android.gms.internal.measurement.s4 s4Var) {
        h();
        i();
        z3.o.i(s4Var);
        z3.o.e(str);
        z3.o.i(l10);
        byte[] i10 = s4Var.i();
        this.f4438a.d().v().c("Saving complex main event, appId, data size", this.f4438a.D().d(str), Integer.valueOf(i10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", i10);
        try {
            if (P().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f4438a.d().r().b("Failed to insert complex main event (got -1). appId", f3.z(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f4438a.d().r().c("Error storing complex main event. appId", f3.z(str), e10);
            return false;
        }
    }

    public final boolean w(d dVar) {
        z3.o.i(dVar);
        h();
        i();
        String str = dVar.f4445n;
        z3.o.i(str);
        if (X(str, dVar.f4447p.f4488o) == null) {
            long I = I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f4438a.z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f4446o);
        contentValues.put("name", dVar.f4447p.f4488o);
        H(contentValues, "value", z3.o.i(dVar.f4447p.k()));
        contentValues.put("active", Boolean.valueOf(dVar.f4449r));
        contentValues.put("trigger_event_name", dVar.f4450s);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.f4452u));
        contentValues.put("timed_out_event", this.f4438a.N().c0(dVar.f4451t));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f4448q));
        contentValues.put("triggered_event", this.f4438a.N().c0(dVar.f4453v));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f4447p.f4489p));
        contentValues.put("time_to_live", Long.valueOf(dVar.f4454w));
        contentValues.put("expired_event", this.f4438a.N().c0(dVar.f4455x));
        try {
            if (P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f4438a.d().r().b("Failed to insert/update conditional user property (got -1)", f3.z(str));
            }
        } catch (SQLiteException e10) {
            this.f4438a.d().r().c("Error storing conditional user property", f3.z(str), e10);
        }
        return true;
    }

    public final boolean x(f9 f9Var) {
        z3.o.i(f9Var);
        h();
        i();
        if (X(f9Var.f4538a, f9Var.f4540c) == null) {
            if (i9.X(f9Var.f4540c)) {
                if (I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{f9Var.f4538a}) >= this.f4438a.z().p(f9Var.f4538a, u2.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(f9Var.f4540c)) {
                long I = I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{f9Var.f4538a, f9Var.f4539b});
                this.f4438a.z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f9Var.f4538a);
        contentValues.put("origin", f9Var.f4539b);
        contentValues.put("name", f9Var.f4540c);
        contentValues.put("set_timestamp", Long.valueOf(f9Var.f4541d));
        H(contentValues, "value", f9Var.f4542e);
        try {
            if (P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f4438a.d().r().b("Failed to insert/update user property (got -1). appId", f3.z(f9Var.f4538a));
            }
        } catch (SQLiteException e10) {
            this.f4438a.d().r().c("Error storing user property. appId", f3.z(f9Var.f4538a), e10);
        }
        return true;
    }
}
