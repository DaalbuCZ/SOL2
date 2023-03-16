package ca;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final k f3286a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f3287b;

    public j(k kVar) {
        k9.k.e(kVar, "dbHelper");
        this.f3286a = kVar;
        this.f3287b = new String[]{"_id", "task_id", "progress", "status", "url", "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular"};
    }

    private final c f(Cursor cursor) {
        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("task_id"));
        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        int i12 = cursor.getInt(cursor.getColumnIndexOrThrow("progress"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("file_name"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("saved_dir"));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("headers"));
        String string6 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        short s10 = cursor.getShort(cursor.getColumnIndexOrThrow("resumable"));
        short s11 = cursor.getShort(cursor.getColumnIndexOrThrow("show_notification"));
        short s12 = cursor.getShort(cursor.getColumnIndexOrThrow("open_file_from_notification"));
        long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("time_created"));
        short s13 = cursor.getShort(cursor.getColumnIndexOrThrow("save_in_public_storage"));
        short s14 = cursor.getShort(cursor.getColumnIndexOrThrow("allow_cellular"));
        k9.k.d(string, "taskId");
        a aVar = a.values()[i11];
        k9.k.d(string2, "url");
        k9.k.d(string4, "savedDir");
        k9.k.d(string5, "headers");
        k9.k.d(string6, "mimeType");
        return new c(i10, string, aVar, i12, string2, string3, string4, string5, string6, s10 == 1, s11 == 1, s12 == 1, j10, s13 == 1, s14 == 1);
    }

    public final void a(String str) {
        k9.k.e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f3286a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.delete("task", "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void b(String str, String str2, a aVar, int i10, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13) {
        k9.k.e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f3286a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str);
        contentValues.put("url", str2);
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("file_name", str3);
        contentValues.put("saved_dir", str4);
        contentValues.put("headers", str5);
        contentValues.put("mime_type", "unknown");
        contentValues.put("show_notification", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("open_file_from_notification", Integer.valueOf(z11 ? 1 : 0));
        contentValues.put("resumable", (Integer) 0);
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("save_in_public_storage", Integer.valueOf(z12 ? 1 : 0));
        contentValues.put("allow_cellular", Integer.valueOf(z13 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.insertWithOnConflict("task", null, contentValues, 5);
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final List<c> c() {
        Cursor query = this.f3286a.getReadableDatabase().query("task", this.f3287b, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            k9.k.d(query, "cursor");
            arrayList.add(f(query));
        }
        query.close();
        return arrayList;
    }

    public final c d(String str) {
        k9.k.e(str, "taskId");
        Cursor query = this.f3286a.getReadableDatabase().query("task", this.f3287b, "task_id = ?", new String[]{str}, null, null, "_id DESC", "1");
        c cVar = null;
        while (query.moveToNext()) {
            k9.k.d(query, "cursor");
            cVar = f(query);
        }
        query.close();
        return cVar;
    }

    public final List<c> e(String str) {
        Cursor rawQuery = this.f3286a.getReadableDatabase().rawQuery(str, null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            k9.k.d(rawQuery, "cursor");
            arrayList.add(f(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public final void g(String str, a aVar, int i10) {
        k9.k.e(str, "taskId");
        k9.k.e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f3286a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void h(String str, String str2, a aVar, int i10, boolean z10) {
        k9.k.e(str, "currentTaskId");
        k9.k.e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f3286a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str2);
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void i(String str, String str2, String str3) {
        k9.k.e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f3286a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_name", str2);
        contentValues.put("mime_type", str3);
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void j(String str, boolean z10) {
        k9.k.e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f3286a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
