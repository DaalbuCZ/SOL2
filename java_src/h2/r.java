package h2;

import h2.i0;
import s1.m1;
/* loaded from: classes.dex */
public final class r implements m {

    /* renamed from: b  reason: collision with root package name */
    private x1.e0 f8007b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8008c;

    /* renamed from: e  reason: collision with root package name */
    private int f8010e;

    /* renamed from: f  reason: collision with root package name */
    private int f8011f;

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f8006a = new p3.a0(10);

    /* renamed from: d  reason: collision with root package name */
    private long f8009d = -9223372036854775807L;

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f8007b);
        if (this.f8008c) {
            int a10 = a0Var.a();
            int i10 = this.f8011f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(a0Var.d(), a0Var.e(), this.f8006a.d(), this.f8011f, min);
                if (this.f8011f + min == 10) {
                    this.f8006a.O(0);
                    if (73 != this.f8006a.C() || 68 != this.f8006a.C() || 51 != this.f8006a.C()) {
                        p3.r.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f8008c = false;
                        return;
                    }
                    this.f8006a.P(3);
                    this.f8010e = this.f8006a.B() + 10;
                }
            }
            int min2 = Math.min(a10, this.f8010e - this.f8011f);
            this.f8007b.d(a0Var, min2);
            this.f8011f += min2;
        }
    }

    @Override // h2.m
    public void b() {
        this.f8008c = false;
        this.f8009d = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        x1.e0 e10 = nVar.e(dVar.c(), 5);
        this.f8007b = e10;
        e10.e(new m1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // h2.m
    public void d() {
        int i10;
        p3.a.h(this.f8007b);
        if (this.f8008c && (i10 = this.f8010e) != 0 && this.f8011f == i10) {
            long j10 = this.f8009d;
            if (j10 != -9223372036854775807L) {
                this.f8007b.c(j10, 1, i10, 0, null);
            }
            this.f8008c = false;
        }
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f8008c = true;
        if (j10 != -9223372036854775807L) {
            this.f8009d = j10;
        }
        this.f8010e = 0;
        this.f8011f = 0;
    }
}
