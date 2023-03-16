package b4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import y3.h;
import z3.g;
import z3.v;
/* loaded from: classes.dex */
public final class e extends g<a> {
    private final v V;

    public e(Context context, Looper looper, z3.d dVar, v vVar, y3.c cVar, h hVar) {
        super(context, looper, 270, dVar, cVar, hVar);
        this.V = vVar;
    }

    @Override // z3.c
    protected final Bundle A() {
        return this.V.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.c
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // z3.c
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // z3.c
    protected final boolean I() {
        return true;
    }

    @Override // z3.c, x3.a.f
    public final int h() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // z3.c
    public final w3.d[] v() {
        return j4.d.f10389b;
    }
}
