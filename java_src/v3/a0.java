package v3;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements t4.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a0 f15585a = new a0();

    private /* synthetic */ a0() {
    }

    @Override // t4.a
    public final Object a(t4.i iVar) {
        if (iVar.p()) {
            return (Bundle) iVar.l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.k());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.k());
    }
}
