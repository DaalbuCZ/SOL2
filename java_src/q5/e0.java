package q5;

import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import s5.b0;
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final o f12736a;

    /* renamed from: b  reason: collision with root package name */
    private final v5.e f12737b;

    /* renamed from: c  reason: collision with root package name */
    private final w5.b f12738c;

    /* renamed from: d  reason: collision with root package name */
    private final r5.c f12739d;

    /* renamed from: e  reason: collision with root package name */
    private final r5.i f12740e;

    e0(o oVar, v5.e eVar, w5.b bVar, r5.c cVar, r5.i iVar) {
        this.f12736a = oVar;
        this.f12737b = eVar;
        this.f12738c = bVar;
        this.f12739d = cVar;
        this.f12740e = iVar;
    }

    private b0.e.d c(b0.e.d dVar) {
        return d(dVar, this.f12739d, this.f12740e);
    }

    private b0.e.d d(b0.e.d dVar, r5.c cVar, r5.i iVar) {
        b0.e.d.b g10 = dVar.g();
        String c10 = cVar.c();
        if (c10 != null) {
            g10.d(b0.e.d.AbstractC0211d.a().b(c10).a());
        } else {
            n5.f.f().i("No log data to include with this event.");
        }
        List<b0.c> k10 = k(iVar.e());
        List<b0.c> k11 = k(iVar.f());
        if (!k10.isEmpty() || !k11.isEmpty()) {
            g10.b(dVar.b().g().c(s5.c0.d(k10)).e(s5.c0.d(k11)).a());
        }
        return g10.a();
    }

    private static b0.a e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e10) {
            n5.f f10 = n5.f.f();
            f10.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return b0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(str).a();
    }

    public static String f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static e0 g(Context context, w wVar, v5.f fVar, a aVar, r5.c cVar, r5.i iVar, y5.d dVar, x5.i iVar2, b0 b0Var) {
        return new e0(new o(context, wVar, aVar, dVar, iVar2), new v5.e(fVar, iVar2), w5.b.b(context, iVar2, b0Var), cVar, iVar);
    }

    private ApplicationExitInfo j(String str, List<ApplicationExitInfo> list) {
        long q10 = this.f12737b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < q10) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    private static List<b0.c> k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(b0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, c0.f12729n);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int m(b0.c cVar, b0.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(t4.i<p> iVar) {
        if (!iVar.p()) {
            n5.f.f().l("Crashlytics report could not be enqueued to DataTransport", iVar.k());
            return false;
        }
        p l10 = iVar.l();
        n5.f f10 = n5.f.f();
        f10.b("Crashlytics report successfully enqueued to DataTransport: " + l10.d());
        File c10 = l10.c();
        if (c10.delete()) {
            n5.f f11 = n5.f.f();
            f11.b("Deleted report file: " + c10.getPath());
            return true;
        }
        n5.f f12 = n5.f.f();
        f12.k("Crashlytics could not delete report file: " + c10.getPath());
        return true;
    }

    private void q(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f12737b.y(c(this.f12736a.d(th, thread, str2, j10, 4, 8, z10)), str, str2.equals("crash"));
    }

    public void h(String str, List<z> list) {
        n5.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (z zVar : list) {
            b0.d.b j10 = zVar.j();
            if (j10 != null) {
                arrayList.add(j10);
            }
        }
        this.f12737b.l(str, b0.d.a().b(s5.c0.d(arrayList)).a());
    }

    public void i(long j10, String str) {
        this.f12737b.k(str, j10);
    }

    public boolean l() {
        return this.f12737b.r();
    }

    public SortedSet<String> n() {
        return this.f12737b.p();
    }

    public void o(String str, long j10) {
        this.f12737b.z(this.f12736a.e(str, j10));
    }

    public void r(Throwable th, Thread thread, String str, long j10) {
        n5.f f10 = n5.f.f();
        f10.i("Persisting fatal event for session " + str);
        q(th, thread, str, "crash", j10, true);
    }

    public void s(Throwable th, Thread thread, String str, long j10) {
        n5.f f10 = n5.f.f();
        f10.i("Persisting non-fatal event for session " + str);
        q(th, thread, str, "error", j10, false);
    }

    public void t(String str, List<ApplicationExitInfo> list, r5.c cVar, r5.i iVar) {
        ApplicationExitInfo j10 = j(str, list);
        if (j10 == null) {
            n5.f f10 = n5.f.f();
            f10.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        b0.e.d c10 = this.f12736a.c(e(j10));
        n5.f f11 = n5.f.f();
        f11.b("Persisting anr for session " + str);
        this.f12737b.y(d(c10, cVar, iVar), str, true);
    }

    public void u() {
        this.f12737b.i();
    }

    public t4.i<Void> v(Executor executor) {
        return w(executor, null);
    }

    public t4.i<Void> w(Executor executor, String str) {
        List<p> w10 = this.f12737b.w();
        ArrayList arrayList = new ArrayList();
        for (p pVar : w10) {
            if (str == null || str.equals(pVar.d())) {
                arrayList.add(this.f12738c.c(pVar, str != null).h(executor, new t4.a() { // from class: q5.d0
                    @Override // t4.a
                    public final Object a(t4.i iVar) {
                        boolean p10;
                        p10 = e0.this.p(iVar);
                        return Boolean.valueOf(p10);
                    }
                }));
            }
        }
        return t4.l.f(arrayList);
    }
}
