package l7;

import f7.e;
import f7.w;
import f7.x;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
class c extends w<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    static final x f11179b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final w<Date> f11180a;

    /* loaded from: classes.dex */
    class a implements x {
        a() {
        }

        @Override // f7.x
        public <T> w<T> create(e eVar, m7.a<T> aVar) {
            if (aVar.c() == Timestamp.class) {
                return new c(eVar.j(Date.class), null);
            }
            return null;
        }
    }

    private c(w<Date> wVar) {
        this.f11180a = wVar;
    }

    /* synthetic */ c(w wVar, a aVar) {
        this(wVar);
    }

    @Override // f7.w
    /* renamed from: f */
    public Timestamp c(n7.a aVar) {
        Date c10 = this.f11180a.c(aVar);
        if (c10 != null) {
            return new Timestamp(c10.getTime());
        }
        return null;
    }

    @Override // f7.w
    /* renamed from: g */
    public void e(n7.c cVar, Timestamp timestamp) {
        this.f11180a.e(cVar, timestamp);
    }
}
