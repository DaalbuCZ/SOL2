package s0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f13272a;

    /* renamed from: b  reason: collision with root package name */
    private final y.a<s> f13273b;

    /* loaded from: classes.dex */
    class a extends y.a<s> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // y.a
        /* renamed from: i */
        public void g(b0.f fVar, s sVar) {
            String str = sVar.f13270a;
            if (str == null) {
                fVar.u(1);
            } else {
                fVar.n(1, str);
            }
            String str2 = sVar.f13271b;
            if (str2 == null) {
                fVar.u(2);
            } else {
                fVar.n(2, str2);
            }
        }
    }

    public u(androidx.room.h hVar) {
        this.f13272a = hVar;
        this.f13273b = new a(hVar);
    }

    @Override // s0.t
    public void a(s sVar) {
        this.f13272a.b();
        this.f13272a.c();
        try {
            this.f13273b.h(sVar);
            this.f13272a.r();
        } finally {
            this.f13272a.g();
        }
    }

    @Override // s0.t
    public List<String> b(String str) {
        y.c c10 = y.c.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13272a.b();
        Cursor b10 = a0.c.b(this.f13272a, c10, false, null);
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
