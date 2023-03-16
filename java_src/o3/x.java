package o3;

import java.io.FileNotFoundException;
import java.io.IOException;
import o3.g0;
import o3.h0;
import s1.h2;
/* loaded from: classes.dex */
public class x implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f12139a;

    public x() {
        this(-1);
    }

    public x(int i10) {
        this.f12139a = i10;
    }

    @Override // o3.g0
    public /* synthetic */ void a(long j10) {
        f0.a(this, j10);
    }

    @Override // o3.g0
    public long b(g0.c cVar) {
        IOException iOException = cVar.f11964c;
        if ((iOException instanceof h2) || (iOException instanceof FileNotFoundException) || (iOException instanceof z) || (iOException instanceof h0.h) || m.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f11965d - 1) * 1000, 5000);
    }

    @Override // o3.g0
    public g0.b c(g0.a aVar, g0.c cVar) {
        if (e(cVar.f11964c)) {
            if (aVar.a(1)) {
                return new g0.b(1, 300000L);
            }
            if (aVar.a(2)) {
                return new g0.b(2, 60000L);
            }
            return null;
        }
        return null;
    }

    @Override // o3.g0
    public int d(int i10) {
        int i11 = this.f12139a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    protected boolean e(IOException iOException) {
        if (iOException instanceof c0) {
            int i10 = ((c0) iOException).f11936q;
            return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
        }
        return false;
    }
}
