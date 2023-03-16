package o3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f12030a;

    /* renamed from: b  reason: collision with root package name */
    private long f12031b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f12032c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f12033d = Collections.emptyMap();

    public o0(l lVar) {
        this.f12030a = (l) p3.a.e(lVar);
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        int b10 = this.f12030a.b(bArr, i10, i11);
        if (b10 != -1) {
            this.f12031b += b10;
        }
        return b10;
    }

    @Override // o3.l
    public void close() {
        this.f12030a.close();
    }

    @Override // o3.l
    public Map<String, List<String>> f() {
        return this.f12030a.f();
    }

    @Override // o3.l
    public void i(p0 p0Var) {
        p3.a.e(p0Var);
        this.f12030a.i(p0Var);
    }

    @Override // o3.l
    public Uri k() {
        return this.f12030a.k();
    }

    @Override // o3.l
    public long n(p pVar) {
        this.f12032c = pVar.f12034a;
        this.f12033d = Collections.emptyMap();
        long n10 = this.f12030a.n(pVar);
        this.f12032c = (Uri) p3.a.e(k());
        this.f12033d = f();
        return n10;
    }

    public long r() {
        return this.f12031b;
    }

    public Uri s() {
        return this.f12032c;
    }

    public Map<String, List<String>> t() {
        return this.f12033d;
    }

    public void u() {
        this.f12031b = 0L;
    }
}
