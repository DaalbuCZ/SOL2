package g2;

import java.util.Arrays;
import p3.a0;
import x1.m;
import x1.o;
/* loaded from: classes.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f7482a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final a0 f7483b = new a0(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f7484c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f7485d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7486e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f7485d = 0;
        do {
            int i13 = this.f7485d;
            int i14 = i10 + i13;
            f fVar = this.f7482a;
            if (i14 >= fVar.f7493g) {
                break;
            }
            int[] iArr = fVar.f7496j;
            this.f7485d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f7482a;
    }

    public a0 c() {
        return this.f7483b;
    }

    public boolean d(m mVar) {
        int i10;
        p3.a.f(mVar != null);
        if (this.f7486e) {
            this.f7486e = false;
            this.f7483b.K(0);
        }
        while (!this.f7486e) {
            if (this.f7484c < 0) {
                if (!this.f7482a.c(mVar) || !this.f7482a.a(mVar, true)) {
                    return false;
                }
                f fVar = this.f7482a;
                int i11 = fVar.f7494h;
                if ((fVar.f7488b & 1) == 1 && this.f7483b.f() == 0) {
                    i11 += a(0);
                    i10 = this.f7485d + 0;
                } else {
                    i10 = 0;
                }
                if (!o.e(mVar, i11)) {
                    return false;
                }
                this.f7484c = i10;
            }
            int a10 = a(this.f7484c);
            int i12 = this.f7484c + this.f7485d;
            if (a10 > 0) {
                a0 a0Var = this.f7483b;
                a0Var.c(a0Var.f() + a10);
                if (!o.d(mVar, this.f7483b.d(), this.f7483b.f(), a10)) {
                    return false;
                }
                a0 a0Var2 = this.f7483b;
                a0Var2.N(a0Var2.f() + a10);
                this.f7486e = this.f7482a.f7496j[i12 + (-1)] != 255;
            }
            if (i12 == this.f7482a.f7493g) {
                i12 = -1;
            }
            this.f7484c = i12;
        }
        return true;
    }

    public void e() {
        this.f7482a.b();
        this.f7483b.K(0);
        this.f7484c = -1;
        this.f7486e = false;
    }

    public void f() {
        if (this.f7483b.d().length == 65025) {
            return;
        }
        a0 a0Var = this.f7483b;
        a0Var.M(Arrays.copyOf(a0Var.d(), Math.max(65025, this.f7483b.f())), this.f7483b.f());
    }
}
