package s0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f13210a;

    /* renamed from: b  reason: collision with root package name */
    private final y.a<g> f13211b;

    /* renamed from: c  reason: collision with root package name */
    private final y.d f13212c;

    /* loaded from: classes.dex */
    class a extends y.a<g> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // y.a
        /* renamed from: i */
        public void g(b0.f fVar, g gVar) {
            String str = gVar.f13208a;
            if (str == null) {
                fVar.u(1);
            } else {
                fVar.n(1, str);
            }
            fVar.H(2, gVar.f13209b);
        }
    }

    /* loaded from: classes.dex */
    class b extends y.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.h hVar) {
        this.f13210a = hVar;
        this.f13211b = new a(hVar);
        this.f13212c = new b(hVar);
    }

    @Override // s0.h
    public void a(g gVar) {
        this.f13210a.b();
        this.f13210a.c();
        try {
            this.f13211b.h(gVar);
            this.f13210a.r();
        } finally {
            this.f13210a.g();
        }
    }

    @Override // s0.h
    public List<String> b() {
        y.c c10 = y.c.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f13210a.b();
        Cursor b10 = a0.c.b(this.f13210a, c10, false, null);
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

    @Override // s0.h
    public g c(String str) {
        y.c c10 = y.c.c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13210a.b();
        Cursor b10 = a0.c.b(this.f13210a, c10, false, null);
        try {
            return b10.moveToFirst() ? new g(b10.getString(a0.b.b(b10, "work_spec_id")), b10.getInt(a0.b.b(b10, "system_id"))) : null;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.h
    public void d(String str) {
        this.f13210a.b();
        b0.f a10 = this.f13212c.a();
        if (str == null) {
            a10.u(1);
        } else {
            a10.n(1, str);
        }
        this.f13210a.c();
        try {
            a10.q();
            this.f13210a.r();
        } finally {
            this.f13210a.g();
            this.f13212c.f(a10);
        }
    }
}
