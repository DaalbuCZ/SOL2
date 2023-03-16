package l7;

import f7.e;
import f7.s;
import f7.w;
import f7.x;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
final class b extends w<Time> {

    /* renamed from: b  reason: collision with root package name */
    static final x f11177b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f11178a;

    /* loaded from: classes.dex */
    class a implements x {
        a() {
        }

        @Override // f7.x
        public <T> w<T> create(e eVar, m7.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new b(null);
            }
            return null;
        }
    }

    private b() {
        this.f11178a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // f7.w
    /* renamed from: f */
    public synchronized Time c(n7.a aVar) {
        if (aVar.Z() == n7.b.NULL) {
            aVar.S();
            return null;
        }
        try {
            return new Time(this.f11178a.parse(aVar.X()).getTime());
        } catch (ParseException e10) {
            throw new s(e10);
        }
    }

    @Override // f7.w
    /* renamed from: g */
    public synchronized void e(n7.c cVar, Time time) {
        cVar.c0(time == null ? null : this.f11178a.format((Date) time));
    }
}
