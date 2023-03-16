package r4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import x3.f;
import z3.c;
import z3.i0;
import z3.o;
/* loaded from: classes.dex */
public class a extends z3.g<g> implements q4.f {
    public static final /* synthetic */ int Z = 0;
    private final boolean V;
    private final z3.d W;
    private final Bundle X;
    private final Integer Y;

    public a(Context context, Looper looper, boolean z10, z3.d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.V = true;
        this.W = dVar;
        this.X = bundle;
        this.Y = dVar.g();
    }

    public static Bundle l0(z3.d dVar) {
        dVar.f();
        Integer g10 = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (g10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // z3.c
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.W.d())) {
            this.X.putString("com.google.android.gms.signin.internal.realClientPackageName", this.W.d());
        }
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.c
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // z3.c
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // q4.f
    public final void b(f fVar) {
        o.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b10 = this.W.b();
            ((g) D()).m0(new j(1, new i0(b10, ((Integer) o.i(this.Y)).intValue(), "<<default account>>".equals(b10.name) ? t3.a.a(y()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.w(new l(1, new w3.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // z3.c, x3.a.f
    public final int h() {
        return w3.i.f16085a;
    }

    @Override // z3.c, x3.a.f
    public final boolean n() {
        return this.V;
    }

    @Override // q4.f
    public final void p() {
        f(new c.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
