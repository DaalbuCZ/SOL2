package y0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* loaded from: classes.dex */
public class c1 implements Cloneable, Runnable {

    /* renamed from: n  reason: collision with root package name */
    private Process f16467n;

    /* renamed from: o  reason: collision with root package name */
    private BufferedReader f16468o;

    /* renamed from: p  reason: collision with root package name */
    private a f16469p;

    /* renamed from: q  reason: collision with root package name */
    private volatile boolean f16470q = true;

    /* renamed from: r  reason: collision with root package name */
    private final String f16471r;

    /* loaded from: classes.dex */
    public interface a {
        void b(String str);
    }

    public c1(String str) {
        this.f16471r = str;
    }

    private BufferedReader c() {
        if (this.f16468o == null && this.f16467n != null) {
            this.f16468o = new BufferedReader(new InputStreamReader(this.f16467n.getInputStream()));
        }
        return this.f16468o;
    }

    private void d(String str) {
        a aVar = this.f16469p;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    private void g() {
        BufferedReader c10 = c();
        if (c10 == null) {
            return;
        }
        while (true) {
            try {
                String readLine = c10.readLine();
                if (readLine == null || !this.f16470q) {
                    return;
                }
                d(readLine);
            } catch (IOException e10) {
                i0.b("Logcat", "IOException reading logcat trace.", e10);
                return;
            }
        }
    }

    public void e(a aVar) {
        this.f16469p = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("logcat -c").waitFor();
            this.f16467n = runtime.exec("logcat -v brief " + this.f16471r);
        } catch (IOException | InterruptedException e10) {
            i0.b("Logcat", "Exception executing logcat command.", e10);
        }
        g();
        i0.a("Logcat", "run: Logcat thread finished");
    }
}
