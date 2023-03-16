package q5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class w implements x {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f12887g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    private static final String f12888h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    private final y f12889a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12890b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12891c;

    /* renamed from: d  reason: collision with root package name */
    private final j6.e f12892d;

    /* renamed from: e  reason: collision with root package name */
    private final s f12893e;

    /* renamed from: f  reason: collision with root package name */
    private String f12894f;

    public w(Context context, String str, j6.e eVar, s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f12890b = context;
        this.f12891c = str;
        this.f12892d = eVar;
        this.f12893e = sVar;
        this.f12889a = new y();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e10;
        e10 = e(UUID.randomUUID().toString());
        n5.f f10 = n5.f.f();
        f10.i("Created new Crashlytics installation ID: " + e10 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e10).putString("firebase.installation.id", str).apply();
        return e10;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String d() {
        try {
            return (String) j0.d(this.f12892d.a());
        } catch (Exception e10) {
            n5.f.f().l("Failed to retrieve Firebase Installations ID.", e10);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f12887g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f12888h, "");
    }

    @Override // q5.x
    public synchronized String a() {
        String l10;
        String str = this.f12894f;
        if (str != null) {
            return str;
        }
        n5.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences s10 = h.s(this.f12890b);
        String string = s10.getString("firebase.installation.id", null);
        n5.f f10 = n5.f.f();
        f10.i("Cached Firebase Installation ID: " + string);
        if (this.f12893e.d()) {
            String d10 = d();
            n5.f f11 = n5.f.f();
            f11.i("Fetched Firebase Installation ID: " + d10);
            if (d10 == null) {
                d10 = string == null ? c() : string;
            }
            l10 = d10.equals(string) ? l(s10) : b(d10, s10);
        } else {
            l10 = k(string) ? l(s10) : b(c(), s10);
        }
        this.f12894f = l10;
        if (this.f12894f == null) {
            n5.f.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f12894f = b(c(), s10);
        }
        n5.f f12 = n5.f.f();
        f12.i("Crashlytics installation ID: " + this.f12894f);
        return this.f12894f;
    }

    public String f() {
        return this.f12891c;
    }

    public String g() {
        return this.f12889a.a(this.f12890b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
