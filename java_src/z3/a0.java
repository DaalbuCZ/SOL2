package z3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class a0 {
    @GuardedBy("sCache")

    /* renamed from: a  reason: collision with root package name */
    private static final m.g<String, String> f17308a = new m.g<>();
    @GuardedBy("sCache")

    /* renamed from: b  reason: collision with root package name */
    private static Locale f17309b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return f4.c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(u3.b.common_google_play_services_notification_channel_name);
    }

    public static String c(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? 17039370 : u3.b.common_google_play_services_enable_button : u3.b.common_google_play_services_update_button : u3.b.common_google_play_services_install_button);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 == 2) {
                return d4.i.d(context) ? resources.getString(u3.b.common_google_play_services_wear_update_text) : resources.getString(u3.b.common_google_play_services_update_text, a10);
            } else if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            if (i10 != 20) {
                                switch (i10) {
                                    case 16:
                                        return h(context, "common_google_play_services_api_unavailable_text", a10);
                                    case 17:
                                        return h(context, "common_google_play_services_sign_in_failed_text", a10);
                                    case 18:
                                        return resources.getString(u3.b.common_google_play_services_updating_text, a10);
                                    default:
                                        return resources.getString(w3.k.common_google_play_services_unknown_issue, a10);
                                }
                            }
                            return h(context, "common_google_play_services_restricted_profile_text", a10);
                        }
                        return resources.getString(u3.b.common_google_play_services_unsupported_text, a10);
                    }
                    return h(context, "common_google_play_services_network_error_text", a10);
                }
                return h(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                return resources.getString(u3.b.common_google_play_services_enable_text, a10);
            }
        }
        return resources.getString(u3.b.common_google_play_services_install_text, a10);
    }

    public static String e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i10);
    }

    public static String f(Context context, int i10) {
        String i11 = i10 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i10);
        return i11 == null ? context.getResources().getString(u3.b.common_google_play_services_notification_ticker) : i11;
    }

    public static String g(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(u3.b.common_google_play_services_install_title);
            case 2:
                return resources.getString(u3.b.common_google_play_services_update_title);
            case 3:
                return resources.getString(u3.b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i10);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(w3.k.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i10, str2);
    }

    private static String i(Context context, String str) {
        m.g<String, String> gVar = f17308a;
        synchronized (gVar) {
            Locale c10 = androidx.core.os.b.a(context.getResources().getConfiguration()).c(0);
            if (!c10.equals(f17309b)) {
                gVar.clear();
                f17309b = c10;
            }
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources c11 = w3.h.c(context);
            if (c11 == null) {
                return null;
            }
            int identifier = c11.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = c11.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
