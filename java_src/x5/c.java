package x5;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import q5.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements k {

    /* renamed from: a  reason: collision with root package name */
    private final String f16336a;

    /* renamed from: b  reason: collision with root package name */
    private final u5.b f16337b;

    /* renamed from: c  reason: collision with root package name */
    private final n5.f f16338c;

    public c(String str, u5.b bVar) {
        this(str, bVar, n5.f.f());
    }

    c(String str, u5.b bVar, n5.f fVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f16338c = fVar;
        this.f16337b = bVar;
        this.f16336a = str;
    }

    private u5.a b(u5.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f16367a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", m.l());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f16368b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f16369c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f16370d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f16371e.a());
        return aVar;
    }

    private void c(u5.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            n5.f fVar = this.f16338c;
            fVar.l("Failed to parse settings JSON from " + this.f16336a, e10);
            n5.f fVar2 = this.f16338c;
            fVar2.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f16374h);
        hashMap.put("display_version", jVar.f16373g);
        hashMap.put("source", Integer.toString(jVar.f16375i));
        String str = jVar.f16372f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // x5.k
    public JSONObject a(j jVar, boolean z10) {
        if (z10) {
            try {
                Map<String, String> f10 = f(jVar);
                u5.a b10 = b(d(f10), jVar);
                n5.f fVar = this.f16338c;
                fVar.b("Requesting settings from " + this.f16336a);
                n5.f fVar2 = this.f16338c;
                fVar2.i("Settings query params were: " + f10);
                return g(b10.c());
            } catch (IOException e10) {
                this.f16338c.e("Settings request failed.", e10);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected u5.a d(Map<String, String> map) {
        u5.a a10 = this.f16337b.a(this.f16336a, map);
        return a10.d("User-Agent", "Crashlytics Android SDK/" + m.l()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(u5.c cVar) {
        int b10 = cVar.b();
        n5.f fVar = this.f16338c;
        fVar.i("Settings response code was: " + b10);
        if (h(b10)) {
            return e(cVar.a());
        }
        n5.f fVar2 = this.f16338c;
        fVar2.d("Settings request failed; (status: " + b10 + ") from " + this.f16336a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }
}
