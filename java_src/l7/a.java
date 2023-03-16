package l7;

import f7.e;
import f7.s;
import f7.w;
import f7.x;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes.dex */
final class a extends w<Date> {

    /* renamed from: b  reason: collision with root package name */
    static final x f11175b = new C0156a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f11176a;

    /* renamed from: l7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0156a implements x {
        C0156a() {
        }

        @Override // f7.x
        public <T> w<T> create(e eVar, m7.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new a(null);
            }
            return null;
        }
    }

    private a() {
        this.f11176a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* synthetic */ a(C0156a c0156a) {
        this();
    }

    @Override // f7.w
    /* renamed from: f */
    public synchronized Date c(n7.a aVar) {
        if (aVar.Z() == n7.b.NULL) {
            aVar.S();
            return null;
        }
        try {
            return new Date(this.f11176a.parse(aVar.X()).getTime());
        } catch (ParseException e10) {
            throw new s(e10);
        }
    }

    @Override // f7.w
    /* renamed from: g */
    public synchronized void e(n7.c cVar, Date date) {
        cVar.c0(date == null ? null : this.f11176a.format((java.util.Date) date));
    }
}
