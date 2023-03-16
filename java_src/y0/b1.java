package y0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class b1 {
    public s a(Context context, z zVar, SharedPreferences sharedPreferences) {
        return new v(context, zVar, sharedPreferences);
    }

    public s0 b(x0 x0Var) {
        return new s0(x0Var);
    }

    public z0 c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "https://dashboard.bugfender.com";
        }
        return new z0(str, str2);
    }

    public p1<k3> d() {
        return new g1(new p());
    }

    public d2 e(k2 k2Var) {
        return new d2(k2Var);
    }

    public s2 f(Context context, x0 x0Var, s0 s0Var, k2 k2Var, d2 d2Var, n3 n3Var, g3 g3Var, p1<k3> p1Var, r<k3> rVar, t tVar) {
        return new v2(context, k2Var, d2Var, x0Var, s0Var, n3Var, g3Var, p1Var, rVar, tVar);
    }

    public g3 g(n3 n3Var) {
        return new g3(n3Var);
    }

    public j3<String> h(Context context) {
        return new t2(context);
    }

    public z i(Context context) {
        return new z(context);
    }

    public n3 j() {
        return new n3();
    }

    public e0 k(Context context) {
        return new j0(context);
    }

    public x0 l() {
        return new x0();
    }

    public SharedPreferences m(Context context) {
        return context.getSharedPreferences("bugfender.preferences", 0);
    }

    public y1 n() {
        return new c2();
    }

    public t o() {
        return new t();
    }

    public r<k3> p() {
        return new l(new p());
    }

    public k2 q() {
        return new k2();
    }
}
