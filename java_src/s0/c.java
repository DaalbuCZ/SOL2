package s0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f13200a;

    /* renamed from: b  reason: collision with root package name */
    private final y.a<s0.a> f13201b;

    /* loaded from: classes.dex */
    class a extends y.a<s0.a> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // y.a
        /* renamed from: i */
        public void g(b0.f fVar, s0.a aVar) {
            String str = aVar.f13198a;
            if (str == null) {
                fVar.u(1);
            } else {
                fVar.n(1, str);
            }
            String str2 = aVar.f13199b;
            if (str2 == null) {
                fVar.u(2);
            } else {
                fVar.n(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f13200a = hVar;
        this.f13201b = new a(hVar);
    }

    @Override // s0.b
    public boolean a(String str) {
        y.c c10 = y.c.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13200a.b();
        boolean z10 = false;
        Cursor b10 = a0.c.b(this.f13200a, c10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.b
    public boolean b(String str) {
        y.c c10 = y.c.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13200a.b();
        boolean z10 = false;
        Cursor b10 = a0.c.b(this.f13200a, c10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.b
    public List<String> c(String str) {
        y.c c10 = y.c.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13200a.b();
        Cursor b10 = a0.c.b(this.f13200a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.b
    public void d(s0.a aVar) {
        this.f13200a.b();
        this.f13200a.c();
        try {
            this.f13201b.h(aVar);
            this.f13200a.r();
        } finally {
            this.f13200a.g();
        }
    }
}
