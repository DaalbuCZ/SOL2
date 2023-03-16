package k8;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l8.k;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final l8.k f10707a;

    /* renamed from: b  reason: collision with root package name */
    private b f10708b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f10709c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // l8.k.c
        public void onMethodCall(l8.j jVar, k.d dVar) {
            if (f.this.f10708b == null) {
                return;
            }
            String str = jVar.f11211a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) jVar.b();
            try {
                dVar.a(f.this.f10708b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e10) {
                dVar.b("error", e10.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    public f(y7.a aVar) {
        a aVar2 = new a();
        this.f10709c = aVar2;
        l8.k kVar = new l8.k(aVar, "flutter/localization", l8.g.f11210a);
        this.f10707a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        x7.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            x7.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "");
            arrayList.add(locale.getVariant());
        }
        this.f10707a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f10708b = bVar;
    }
}
