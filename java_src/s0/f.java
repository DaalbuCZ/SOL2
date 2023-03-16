package s0;

import android.database.Cursor;
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f13205a;

    /* renamed from: b  reason: collision with root package name */
    private final y.a<d> f13206b;

    /* loaded from: classes.dex */
    class a extends y.a<d> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // y.a
        /* renamed from: i */
        public void g(b0.f fVar, d dVar) {
            String str = dVar.f13203a;
            if (str == null) {
                fVar.u(1);
            } else {
                fVar.n(1, str);
            }
            Long l10 = dVar.f13204b;
            if (l10 == null) {
                fVar.u(2);
            } else {
                fVar.H(2, l10.longValue());
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f13205a = hVar;
        this.f13206b = new a(hVar);
    }

    @Override // s0.e
    public Long a(String str) {
        y.c c10 = y.c.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13205a.b();
        Long l10 = null;
        Cursor b10 = a0.c.b(this.f13205a, c10, false, null);
        try {
            if (b10.moveToFirst() && !b10.isNull(0)) {
                l10 = Long.valueOf(b10.getLong(0));
            }
            return l10;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.e
    public void b(d dVar) {
        this.f13205a.b();
        this.f13205a.c();
        try {
            this.f13206b.h(dVar);
            this.f13205a.r();
        } finally {
            this.f13205a.g();
        }
    }
}
