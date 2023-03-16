package j2;

import j2.b;
import j2.l;
import j2.x;
import p3.m0;
/* loaded from: classes.dex */
public final class j implements l.b {

    /* renamed from: a  reason: collision with root package name */
    private int f10303a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10304b;

    @Override // j2.l.b
    public l a(l.a aVar) {
        int i10;
        int i11 = m0.f12306a;
        if (i11 < 23 || ((i10 = this.f10303a) != 1 && (i10 != 0 || i11 < 31))) {
            return new x.b().a(aVar);
        }
        int k10 = p3.v.k(aVar.f10312c.f13587y);
        p3.r.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.k0(k10));
        return new b.C0144b(k10, this.f10304b).a(aVar);
    }
}
