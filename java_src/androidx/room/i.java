package androidx.room;

import android.database.Cursor;
import b0.c;
import java.util.List;
/* loaded from: classes.dex */
public class i extends c.a {

    /* renamed from: b  reason: collision with root package name */
    private androidx.room.a f2269b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2270c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2271d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2272e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f2273a;

        public a(int i10) {
            this.f2273a = i10;
        }

        protected abstract void a(b0.b bVar);

        protected abstract void b(b0.b bVar);

        protected abstract void c(b0.b bVar);

        protected abstract void d(b0.b bVar);

        protected abstract void e(b0.b bVar);

        protected abstract void f(b0.b bVar);

        protected abstract b g(b0.b bVar);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f2274a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2275b;

        public b(boolean z10, String str) {
            this.f2274a = z10;
            this.f2275b = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f2273a);
        this.f2269b = aVar;
        this.f2270c = aVar2;
        this.f2271d = str;
        this.f2272e = str2;
    }

    private void h(b0.b bVar) {
        if (!k(bVar)) {
            b g10 = this.f2270c.g(bVar);
            if (g10.f2274a) {
                this.f2270c.e(bVar);
                l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f2275b);
        }
        Cursor L = bVar.L(new b0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = L.moveToFirst() ? L.getString(0) : null;
            L.close();
            if (!this.f2271d.equals(string) && !this.f2272e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            L.close();
            throw th;
        }
    }

    private void i(b0.b bVar) {
        bVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(b0.b bVar) {
        Cursor V = bVar.V("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (V.moveToFirst()) {
                if (V.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            V.close();
        }
    }

    private static boolean k(b0.b bVar) {
        Cursor V = bVar.V("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (V.moveToFirst()) {
                if (V.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            V.close();
        }
    }

    private void l(b0.b bVar) {
        i(bVar);
        bVar.m(y.b.a(this.f2271d));
    }

    @Override // b0.c.a
    public void b(b0.b bVar) {
        super.b(bVar);
    }

    @Override // b0.c.a
    public void d(b0.b bVar) {
        boolean j10 = j(bVar);
        this.f2270c.a(bVar);
        if (!j10) {
            b g10 = this.f2270c.g(bVar);
            if (!g10.f2274a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f2275b);
            }
        }
        l(bVar);
        this.f2270c.c(bVar);
    }

    @Override // b0.c.a
    public void e(b0.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    @Override // b0.c.a
    public void f(b0.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f2270c.d(bVar);
        this.f2269b = null;
    }

    @Override // b0.c.a
    public void g(b0.b bVar, int i10, int i11) {
        boolean z10;
        List<z.a> c10;
        androidx.room.a aVar = this.f2269b;
        if (aVar == null || (c10 = aVar.f2175d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f2270c.f(bVar);
            for (z.a aVar2 : c10) {
                aVar2.a(bVar);
            }
            b g10 = this.f2270c.g(bVar);
            if (!g10.f2274a) {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f2275b);
            }
            this.f2270c.e(bVar);
            l(bVar);
            z10 = true;
        }
        if (z10) {
            return;
        }
        androidx.room.a aVar3 = this.f2269b;
        if (aVar3 != null && !aVar3.a(i10, i11)) {
            this.f2270c.b(bVar);
            this.f2270c.a(bVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
