package z2;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.a0;
import p3.i0;
import s1.h2;
import s1.m1;
import x1.b0;
import x1.e0;
/* loaded from: classes.dex */
public final class t implements x1.l {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f17300g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f17301h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f17302a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f17303b;

    /* renamed from: d  reason: collision with root package name */
    private x1.n f17305d;

    /* renamed from: f  reason: collision with root package name */
    private int f17307f;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f17304c = new a0();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f17306e = new byte[1024];

    public t(String str, i0 i0Var) {
        this.f17302a = str;
        this.f17303b = i0Var;
    }

    @RequiresNonNull({"output"})
    private e0 d(long j10) {
        e0 e10 = this.f17305d.e(0, 3);
        e10.e(new m1.b().e0("text/vtt").V(this.f17302a).i0(j10).E());
        this.f17305d.i();
        return e10;
    }

    @RequiresNonNull({"output"})
    private void e() {
        a0 a0Var = new a0(this.f17306e);
        m3.i.e(a0Var);
        long j10 = 0;
        long j11 = 0;
        for (String o10 = a0Var.o(); !TextUtils.isEmpty(o10); o10 = a0Var.o()) {
            if (o10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f17300g.matcher(o10);
                if (!matcher.find()) {
                    throw h2.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + o10, null);
                }
                Matcher matcher2 = f17301h.matcher(o10);
                if (!matcher2.find()) {
                    throw h2.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + o10, null);
                }
                j11 = m3.i.d((String) p3.a.e(matcher.group(1)));
                j10 = i0.f(Long.parseLong((String) p3.a.e(matcher2.group(1))));
            }
        }
        Matcher a10 = m3.i.a(a0Var);
        if (a10 == null) {
            d(0L);
            return;
        }
        long d10 = m3.i.d((String) p3.a.e(a10.group(1)));
        long b10 = this.f17303b.b(i0.j((j10 + d10) - j11));
        e0 d11 = d(b10 - d10);
        this.f17304c.M(this.f17306e, this.f17307f);
        d11.d(this.f17304c, this.f17307f);
        d11.c(b10, 1, this.f17307f, 0, null);
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f17305d = nVar;
        nVar.t(new b0.b(-9223372036854775807L));
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        p3.a.e(this.f17305d);
        int a10 = (int) mVar.a();
        int i10 = this.f17307f;
        byte[] bArr = this.f17306e;
        if (i10 == bArr.length) {
            this.f17306e = Arrays.copyOf(bArr, ((a10 != -1 ? a10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f17306e;
        int i11 = this.f17307f;
        int b10 = mVar.b(bArr2, i11, bArr2.length - i11);
        if (b10 != -1) {
            int i12 = this.f17307f + b10;
            this.f17307f = i12;
            if (a10 == -1 || i12 != a10) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        mVar.l(this.f17306e, 0, 6, false);
        this.f17304c.M(this.f17306e, 6);
        if (m3.i.b(this.f17304c)) {
            return true;
        }
        mVar.l(this.f17306e, 6, 3, false);
        this.f17304c.M(this.f17306e, 9);
        return m3.i.b(this.f17304c);
    }
}
