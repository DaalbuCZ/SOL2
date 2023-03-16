package s9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import k9.g;
import k9.k;
import r9.t1;
import r9.x0;
/* loaded from: classes.dex */
public final class c extends d {
    private volatile c _immediate;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f14412p;

    /* renamed from: q  reason: collision with root package name */
    private final String f14413q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f14414r;

    /* renamed from: s  reason: collision with root package name */
    private final c f14415s;

    public c(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ c(Handler handler, String str, int i10, g gVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private c(Handler handler, String str, boolean z10) {
        super(null);
        this.f14412p = handler;
        this.f14413q = str;
        this.f14414r = z10;
        this._immediate = z10 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f14415s = cVar;
    }

    private final void a0(b9.g gVar, Runnable runnable) {
        t1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        x0.b().b(gVar, runnable);
    }

    @Override // r9.d0
    public boolean W(b9.g gVar) {
        return (this.f14414r && k.a(Looper.myLooper(), this.f14412p.getLooper())) ? false : true;
    }

    @Override // r9.d0
    public void b(b9.g gVar, Runnable runnable) {
        if (this.f14412p.post(runnable)) {
            return;
        }
        a0(gVar, runnable);
    }

    @Override // r9.z1
    /* renamed from: b0 */
    public c Y() {
        return this.f14415s;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f14412p == this.f14412p;
    }

    public int hashCode() {
        return System.identityHashCode(this.f14412p);
    }

    @Override // r9.z1, r9.d0
    public String toString() {
        String Z = Z();
        if (Z == null) {
            String str = this.f14413q;
            if (str == null) {
                str = this.f14412p.toString();
            }
            if (this.f14414r) {
                return str + ".immediate";
            }
            return str;
        }
        return Z;
    }
}
