package z1;

import p3.a0;
import p3.m0;
import p3.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f17154a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17155b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17156c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17157d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17158e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17159f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f17154a = i10;
        this.f17155b = i11;
        this.f17156c = i12;
        this.f17157d = i13;
        this.f17158e = i14;
        this.f17159f = i15;
    }

    public static d c(a0 a0Var) {
        int p10 = a0Var.p();
        a0Var.P(12);
        int p11 = a0Var.p();
        int p12 = a0Var.p();
        int p13 = a0Var.p();
        a0Var.P(4);
        int p14 = a0Var.p();
        int p15 = a0Var.p();
        a0Var.P(8);
        return new d(p10, p11, p12, p13, p14, p15);
    }

    public long a() {
        return m0.M0(this.f17158e, this.f17156c * 1000000, this.f17157d);
    }

    public int b() {
        int i10 = this.f17154a;
        if (i10 != 1935960438) {
            if (i10 != 1935963489) {
                if (i10 != 1937012852) {
                    r.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f17154a));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    @Override // z1.a
    public int getType() {
        return 1752331379;
    }
}
