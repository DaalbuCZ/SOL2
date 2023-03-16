package i7;

import f7.s;
import f7.w;
import f7.x;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class c extends w<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final x f8356b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<DateFormat> f8357a;

    /* loaded from: classes.dex */
    class a implements x {
        a() {
        }

        @Override // f7.x
        public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f8357a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (h7.e.e()) {
            arrayList.add(h7.j.c(2, 2));
        }
    }

    private synchronized Date f(String str) {
        for (DateFormat dateFormat : this.f8357a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return j7.a.c(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new s(str, e10);
        }
    }

    @Override // f7.w
    /* renamed from: g */
    public Date c(n7.a aVar) {
        if (aVar.Z() == n7.b.NULL) {
            aVar.S();
            return null;
        }
        return f(aVar.X());
    }

    @Override // f7.w
    /* renamed from: h */
    public synchronized void e(n7.c cVar, Date date) {
        if (date == null) {
            cVar.D();
        } else {
            cVar.c0(this.f8357a.get(0).format(date));
        }
    }
}
