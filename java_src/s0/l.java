package s0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f13217a;

    /* renamed from: b  reason: collision with root package name */
    private final y.a<j> f13218b;

    /* loaded from: classes.dex */
    class a extends y.a<j> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // y.a
        /* renamed from: i */
        public void g(b0.f fVar, j jVar) {
            String str = jVar.f13215a;
            if (str == null) {
                fVar.u(1);
            } else {
                fVar.n(1, str);
            }
            String str2 = jVar.f13216b;
            if (str2 == null) {
                fVar.u(2);
            } else {
                fVar.n(2, str2);
            }
        }
    }

    public l(androidx.room.h hVar) {
        this.f13217a = hVar;
        this.f13218b = new a(hVar);
    }

    @Override // s0.k
    public void a(j jVar) {
        this.f13217a.b();
        this.f13217a.c();
        try {
            this.f13218b.h(jVar);
            this.f13217a.r();
        } finally {
            this.f13217a.g();
        }
    }

    @Override // s0.k
    public List<String> b(String str) {
        y.c c10 = y.c.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13217a.b();
        Cursor b10 = a0.c.b(this.f13217a, c10, false, null);
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
}
