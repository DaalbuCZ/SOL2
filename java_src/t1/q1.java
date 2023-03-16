package t1;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.l3;
import t1.c;
import t1.s1;
import u2.u;
/* loaded from: classes.dex */
public final class q1 implements s1 {

    /* renamed from: h  reason: collision with root package name */
    public static final a5.o<String> f14615h = p1.f14609n;

    /* renamed from: i  reason: collision with root package name */
    private static final Random f14616i = new Random();

    /* renamed from: a  reason: collision with root package name */
    private final l3.d f14617a;

    /* renamed from: b  reason: collision with root package name */
    private final l3.b f14618b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, a> f14619c;

    /* renamed from: d  reason: collision with root package name */
    private final a5.o<String> f14620d;

    /* renamed from: e  reason: collision with root package name */
    private s1.a f14621e;

    /* renamed from: f  reason: collision with root package name */
    private l3 f14622f;

    /* renamed from: g  reason: collision with root package name */
    private String f14623g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f14624a;

        /* renamed from: b  reason: collision with root package name */
        private int f14625b;

        /* renamed from: c  reason: collision with root package name */
        private long f14626c;

        /* renamed from: d  reason: collision with root package name */
        private u.b f14627d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14628e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f14629f;

        public a(String str, int i10, u.b bVar) {
            this.f14624a = str;
            this.f14625b = i10;
            this.f14626c = bVar == null ? -1L : bVar.f15359d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f14627d = bVar;
        }

        private int l(l3 l3Var, l3 l3Var2, int i10) {
            if (i10 >= l3Var.t()) {
                if (i10 < l3Var2.t()) {
                    return i10;
                }
                return -1;
            }
            l3Var.r(i10, q1.this.f14617a);
            for (int i11 = q1.this.f14617a.B; i11 <= q1.this.f14617a.C; i11++) {
                int f10 = l3Var2.f(l3Var.q(i11));
                if (f10 != -1) {
                    return l3Var2.j(f10, q1.this.f14618b).f13544p;
                }
            }
            return -1;
        }

        public boolean i(int i10, u.b bVar) {
            if (bVar == null) {
                return i10 == this.f14625b;
            }
            u.b bVar2 = this.f14627d;
            return bVar2 == null ? !bVar.b() && bVar.f15359d == this.f14626c : bVar.f15359d == bVar2.f15359d && bVar.f15357b == bVar2.f15357b && bVar.f15358c == bVar2.f15358c;
        }

        public boolean j(c.a aVar) {
            long j10 = this.f14626c;
            if (j10 == -1) {
                return false;
            }
            u.b bVar = aVar.f14500d;
            if (bVar == null) {
                return this.f14625b != aVar.f14499c;
            } else if (bVar.f15359d > j10) {
                return true;
            } else {
                if (this.f14627d == null) {
                    return false;
                }
                int f10 = aVar.f14498b.f(bVar.f15356a);
                int f11 = aVar.f14498b.f(this.f14627d.f15356a);
                u.b bVar2 = aVar.f14500d;
                if (bVar2.f15359d < this.f14627d.f15359d || f10 < f11) {
                    return false;
                }
                if (f10 > f11) {
                    return true;
                }
                boolean b10 = bVar2.b();
                u.b bVar3 = aVar.f14500d;
                if (!b10) {
                    int i10 = bVar3.f15360e;
                    return i10 == -1 || i10 > this.f14627d.f15357b;
                }
                int i11 = bVar3.f15357b;
                int i12 = bVar3.f15358c;
                u.b bVar4 = this.f14627d;
                int i13 = bVar4.f15357b;
                return i11 > i13 || (i11 == i13 && i12 > bVar4.f15358c);
            }
        }

        public void k(int i10, u.b bVar) {
            if (this.f14626c == -1 && i10 == this.f14625b && bVar != null) {
                this.f14626c = bVar.f15359d;
            }
        }

        public boolean m(l3 l3Var, l3 l3Var2) {
            int l10 = l(l3Var, l3Var2, this.f14625b);
            this.f14625b = l10;
            if (l10 == -1) {
                return false;
            }
            u.b bVar = this.f14627d;
            return bVar == null || l3Var2.f(bVar.f15356a) != -1;
        }
    }

    public q1() {
        this(f14615h);
    }

    public q1(a5.o<String> oVar) {
        this.f14620d = oVar;
        this.f14617a = new l3.d();
        this.f14618b = new l3.b();
        this.f14619c = new HashMap<>();
        this.f14622f = l3.f13539n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k() {
        byte[] bArr = new byte[12];
        f14616i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a l(int i10, u.b bVar) {
        int i11;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f14619c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f14626c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (i11 == 0 && ((a) p3.m0.j(aVar)).f14627d != null && aVar2.f14627d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar == null) {
            String str = this.f14620d.get();
            a aVar3 = new a(str, i10, bVar);
            this.f14619c.put(str, aVar3);
            return aVar3;
        }
        return aVar;
    }

    @RequiresNonNull({"listener"})
    private void m(c.a aVar) {
        if (aVar.f14498b.u()) {
            this.f14623g = null;
            return;
        }
        a aVar2 = this.f14619c.get(this.f14623g);
        a l10 = l(aVar.f14499c, aVar.f14500d);
        this.f14623g = l10.f14624a;
        e(aVar);
        u.b bVar = aVar.f14500d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f14626c == aVar.f14500d.f15359d && aVar2.f14627d != null && aVar2.f14627d.f15357b == aVar.f14500d.f15357b && aVar2.f14627d.f15358c == aVar.f14500d.f15358c) {
            return;
        }
        u.b bVar2 = aVar.f14500d;
        this.f14621e.P(aVar, l(aVar.f14499c, new u.b(bVar2.f15356a, bVar2.f15359d)).f14624a, l10.f14624a);
    }

    @Override // t1.s1
    public synchronized void a(c.a aVar) {
        p3.a.e(this.f14621e);
        l3 l3Var = this.f14622f;
        this.f14622f = aVar.f14498b;
        Iterator<a> it = this.f14619c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(l3Var, this.f14622f) || next.j(aVar)) {
                it.remove();
                if (next.f14628e) {
                    if (next.f14624a.equals(this.f14623g)) {
                        this.f14623g = null;
                    }
                    this.f14621e.R(aVar, next.f14624a, false);
                }
            }
        }
        m(aVar);
    }

    @Override // t1.s1
    public synchronized void b(c.a aVar, int i10) {
        p3.a.e(this.f14621e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f14619c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f14628e) {
                    boolean equals = next.f14624a.equals(this.f14623g);
                    boolean z11 = z10 && equals && next.f14629f;
                    if (equals) {
                        this.f14623g = null;
                    }
                    this.f14621e.R(aVar, next.f14624a, z11);
                }
            }
        }
        m(aVar);
    }

    @Override // t1.s1
    public synchronized String c() {
        return this.f14623g;
    }

    @Override // t1.s1
    public synchronized String d(l3 l3Var, u.b bVar) {
        return l(l3Var.l(bVar.f15356a, this.f14618b).f13544p, bVar).f14624a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:11:0x0025, B:13:0x0030, B:16:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:34:0x00db, B:36:0x00e1, B:38:0x00f7, B:40:0x0103, B:42:0x0109), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    @Override // t1.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void e(t1.c.a r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.q1.e(t1.c$a):void");
    }

    @Override // t1.s1
    public synchronized void f(c.a aVar) {
        s1.a aVar2;
        this.f14623g = null;
        Iterator<a> it = this.f14619c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f14628e && (aVar2 = this.f14621e) != null) {
                aVar2.R(aVar, next.f14624a, false);
            }
        }
    }

    @Override // t1.s1
    public void g(s1.a aVar) {
        this.f14621e = aVar;
    }
}
