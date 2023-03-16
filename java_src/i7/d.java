package i7;

import f7.s;
import f7.w;
import f7.x;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class d<T extends Date> extends w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f8358a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f8359b;

    /* loaded from: classes.dex */
    public static abstract class b<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final b<Date> f8360b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f8361a;

        /* loaded from: classes.dex */
        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // i7.d.b
            protected Date d(Date date) {
                return date;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b(Class<T> cls) {
            this.f8361a = cls;
        }

        private final x c(d<T> dVar) {
            return n.a(this.f8361a, dVar);
        }

        public final x a(int i10, int i11) {
            return c(new d<>(this, i10, i11));
        }

        public final x b(String str) {
            return c(new d<>(this, str));
        }

        protected abstract T d(Date date);
    }

    private d(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f8359b = arrayList;
        this.f8358a = (b) h7.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (h7.e.e()) {
            arrayList.add(h7.j.c(i10, i11));
        }
    }

    private d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f8359b = arrayList;
        this.f8358a = (b) h7.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date f(String str) {
        synchronized (this.f8359b) {
            for (DateFormat dateFormat : this.f8359b) {
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
    }

    @Override // f7.w
    /* renamed from: g */
    public T c(n7.a aVar) {
        if (aVar.Z() == n7.b.NULL) {
            aVar.S();
            return null;
        }
        return this.f8358a.d(f(aVar.X()));
    }

    @Override // f7.w
    /* renamed from: h */
    public void e(n7.c cVar, Date date) {
        if (date == null) {
            cVar.D();
            return;
        }
        synchronized (this.f8359b) {
            cVar.c0(this.f8359b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f8359b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
