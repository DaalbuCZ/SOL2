package l7;

import f7.x;
import i7.d;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11181a;

    /* renamed from: b  reason: collision with root package name */
    public static final d.b<? extends Date> f11182b;

    /* renamed from: c  reason: collision with root package name */
    public static final d.b<? extends Date> f11183c;

    /* renamed from: d  reason: collision with root package name */
    public static final x f11184d;

    /* renamed from: e  reason: collision with root package name */
    public static final x f11185e;

    /* renamed from: f  reason: collision with root package name */
    public static final x f11186f;

    /* loaded from: classes.dex */
    class a extends d.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // i7.d.b
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // i7.d.b
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        x xVar;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f11181a = z10;
        if (z10) {
            f11182b = new a(java.sql.Date.class);
            f11183c = new b(Timestamp.class);
            f11184d = l7.a.f11175b;
            f11185e = l7.b.f11177b;
            xVar = c.f11179b;
        } else {
            xVar = null;
            f11182b = null;
            f11183c = null;
            f11184d = null;
            f11185e = null;
        }
        f11186f = xVar;
    }
}
