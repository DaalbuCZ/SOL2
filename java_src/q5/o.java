package q5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import s5.b0;
/* loaded from: classes.dex */
public class o {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f12850f;

    /* renamed from: g  reason: collision with root package name */
    static final String f12851g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12852a;

    /* renamed from: b  reason: collision with root package name */
    private final w f12853b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12854c;

    /* renamed from: d  reason: collision with root package name */
    private final y5.d f12855d;

    /* renamed from: e  reason: collision with root package name */
    private final x5.i f12856e;

    static {
        HashMap hashMap = new HashMap();
        f12850f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f12851g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.5");
    }

    public o(Context context, w wVar, a aVar, y5.d dVar, x5.i iVar) {
        this.f12852a = context;
        this.f12853b = wVar;
        this.f12854c = aVar;
        this.f12855d = dVar;
        this.f12856e = iVar;
    }

    private b0.a a(b0.a aVar) {
        s5.c0<b0.a.AbstractC0197a> c0Var;
        if (!this.f12856e.b().f16340b.f16349c || this.f12854c.f12718c.size() <= 0) {
            c0Var = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f12854c.f12718c) {
                arrayList.add(b0.a.AbstractC0197a.a().d(eVar.c()).b(eVar.a()).c(eVar.b()).a());
            }
            c0Var = s5.c0.d(arrayList);
        }
        return b0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(c0Var).a();
    }

    private b0.b b() {
        return s5.b0.b().h("18.3.5").d(this.f12854c.f12716a).e(this.f12853b.a()).b(this.f12854c.f12721f).c(this.f12854c.f12722g).g(4);
    }

    private static int f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f12850f.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private b0.e.d.a.b.AbstractC0201a g() {
        return b0.e.d.a.b.AbstractC0201a.a().b(0L).d(0L).c(this.f12854c.f12720e).e(this.f12854c.f12717b).a();
    }

    private s5.c0<b0.e.d.a.b.AbstractC0201a> h() {
        return s5.c0.g(g());
    }

    private b0.e.d.a i(int i10, b0.a aVar) {
        return b0.e.d.a.a().b(Boolean.valueOf(aVar.c() != 100)).f(i10).d(n(aVar)).a();
    }

    private b0.e.d.a j(int i10, y5.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j10 = h.j(this.f12854c.f12720e, this.f12852a);
        if (j10 != null) {
            bool = Boolean.valueOf(j10.importance != 100);
        } else {
            bool = null;
        }
        return b0.e.d.a.a().b(bool).f(i10).d(o(eVar, thread, i11, i12, z10)).a();
    }

    private b0.e.d.c k(int i10) {
        d a10 = d.a(this.f12852a);
        Float b10 = a10.b();
        Double valueOf = b10 != null ? Double.valueOf(b10.doubleValue()) : null;
        int c10 = a10.c();
        boolean p10 = h.p(this.f12852a);
        return b0.e.d.c.a().b(valueOf).c(c10).f(p10).e(i10).g(h.t() - h.a(this.f12852a)).d(h.b(Environment.getDataDirectory().getPath())).a();
    }

    private b0.e.d.a.b.c l(y5.e eVar, int i10, int i11) {
        return m(eVar, i10, i11, 0);
    }

    private b0.e.d.a.b.c m(y5.e eVar, int i10, int i11, int i12) {
        String str = eVar.f17027b;
        String str2 = eVar.f17026a;
        StackTraceElement[] stackTraceElementArr = eVar.f17028c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        y5.e eVar2 = eVar.f17029d;
        if (i12 >= i11) {
            y5.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f17029d;
                i13++;
            }
        }
        b0.e.d.a.b.c.AbstractC0204a d10 = b0.e.d.a.b.c.a().f(str).e(str2).c(s5.c0.d(q(stackTraceElementArr, i10))).d(i13);
        if (eVar2 != null && i13 == 0) {
            d10.b(m(eVar2, i10, i11, i12 + 1));
        }
        return d10.a();
    }

    private b0.e.d.a.b n(b0.a aVar) {
        return b0.e.d.a.b.a().b(aVar).e(v()).c(h()).a();
    }

    private b0.e.d.a.b o(y5.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return b0.e.d.a.b.a().f(y(eVar, thread, i10, z10)).d(l(eVar, i10, i11)).e(v()).c(h()).a();
    }

    private b0.e.d.a.b.AbstractC0207e.AbstractC0209b p(StackTraceElement stackTraceElement, b0.e.d.a.b.AbstractC0207e.AbstractC0209b.AbstractC0210a abstractC0210a) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = stackTraceElement.getLineNumber();
        }
        return abstractC0210a.e(max).f(str).b(fileName).d(j10).a();
    }

    private s5.c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> q(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(p(stackTraceElement, b0.e.d.a.b.AbstractC0207e.AbstractC0209b.a().c(i10)));
        }
        return s5.c0.d(arrayList);
    }

    private b0.e.a r() {
        return b0.e.a.a().e(this.f12853b.f()).g(this.f12854c.f12721f).d(this.f12854c.f12722g).f(this.f12853b.a()).b(this.f12854c.f12723h.d()).c(this.f12854c.f12723h.e()).a();
    }

    private b0.e s(String str, long j10) {
        return b0.e.a().l(j10).i(str).g(f12851g).b(r()).k(u()).d(t()).h(3).a();
    }

    private b0.e.c t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int f10 = f();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long t10 = h.t();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean z10 = h.z();
        int n10 = h.n();
        String str = Build.MANUFACTURER;
        return b0.e.c.a().b(f10).f(Build.MODEL).c(availableProcessors).h(t10).d(blockCount).i(z10).j(n10).e(str).g(Build.PRODUCT).a();
    }

    private b0.e.AbstractC0212e u() {
        return b0.e.AbstractC0212e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(h.A()).a();
    }

    private b0.e.d.a.b.AbstractC0205d v() {
        return b0.e.d.a.b.AbstractC0205d.a().d("0").c("0").b(0L).a();
    }

    private b0.e.d.a.b.AbstractC0207e w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return x(thread, stackTraceElementArr, 0);
    }

    private b0.e.d.a.b.AbstractC0207e x(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return b0.e.d.a.b.AbstractC0207e.a().d(thread.getName()).c(i10).b(s5.c0.d(q(stackTraceElementArr, i10))).a();
    }

    private s5.c0<b0.e.d.a.b.AbstractC0207e> y(y5.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x(thread, eVar.f17028c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(w(key, this.f12855d.a(entry.getValue())));
                }
            }
        }
        return s5.c0.d(arrayList);
    }

    public b0.e.d c(b0.a aVar) {
        int i10 = this.f12852a.getResources().getConfiguration().orientation;
        return b0.e.d.a().f("anr").e(aVar.i()).b(i(i10, a(aVar))).c(k(i10)).a();
    }

    public b0.e.d d(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f12852a.getResources().getConfiguration().orientation;
        return b0.e.d.a().f(str).e(j10).b(j(i12, new y5.e(th, this.f12855d), thread, i10, i11, z10)).c(k(i12)).a();
    }

    public s5.b0 e(String str, long j10) {
        return b().i(s(str, j10)).a();
    }
}
