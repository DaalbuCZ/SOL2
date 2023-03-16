package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static final m.e<String, Typeface> f1477a = new m.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f1478b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f1479c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final m.g<String, ArrayList<androidx.core.util.a<e>>> f1480d = new m.g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1481a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1482b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1483c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1484d;

        a(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f1481a = str;
            this.f1482b = context;
            this.f1483c = eVar;
            this.f1484d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return f.c(this.f1481a, this.f1482b, this.f1483c, this.f1484d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements androidx.core.util.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f1485a;

        b(androidx.core.provider.a aVar) {
            this.f1485a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f1485a.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1489d;

        c(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f1486a = str;
            this.f1487b = context;
            this.f1488c = eVar;
            this.f1489d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.f1486a, this.f1487b, this.f1488c, this.f1489d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements androidx.core.util.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1490a;

        d(String str) {
            this.f1490a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (f.f1479c) {
                m.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f.f1480d;
                ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(this.f1490a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f1490a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f1491a;

        /* renamed from: b  reason: collision with root package name */
        final int f1492b;

        e(int i10) {
            this.f1491a = null;
            this.f1492b = i10;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f1491a = typeface;
            this.f1492b = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f1492b == 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (g.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i10) {
        m.e<String, Typeface> eVar2 = f1477a;
        Typeface c10 = eVar2.c(str);
        if (c10 != null) {
            return new e(c10);
        }
        try {
            g.a e10 = androidx.core.provider.d.e(context, eVar, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = androidx.core.graphics.d.b(context, null, e10.b(), i10);
            if (b11 != null) {
                eVar2.d(str, b11);
                return new e(b11);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, androidx.core.provider.e eVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String a10 = a(eVar, i10);
        Typeface c10 = f1477a.c(a10);
        if (c10 != null) {
            aVar.b(new e(c10));
            return c10;
        }
        b bVar = new b(aVar);
        synchronized (f1479c) {
            m.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f1480d;
            ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a10, arrayList2);
            c cVar = new c(a10, context, eVar, i10);
            if (executor == null) {
                executor = f1478b;
            }
            h.b(executor, cVar, new d(a10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface c10 = f1477a.c(a10);
        if (c10 != null) {
            aVar.b(new e(c10));
            return c10;
        } else if (i11 == -1) {
            e c11 = c(a10, context, eVar, i10);
            aVar.b(c11);
            return c11.f1491a;
        } else {
            try {
                e eVar2 = (e) h.c(f1478b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f1491a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }
}
