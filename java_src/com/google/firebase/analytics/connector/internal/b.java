package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import i5.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p4.p;
import p4.q;
import p4.s;
import p4.x;
import z3.o;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f5253a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b  reason: collision with root package name */
    private static final List f5254b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final List f5255c = Arrays.asList("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    private static final List f5256d = Arrays.asList("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final List f5257e = Arrays.asList((String[]) d4.b.a(s.f12414a, s.f12415b));

    /* renamed from: f  reason: collision with root package name */
    private static final List f5258f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f8328a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f8329b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f8330c;
        if (obj != null) {
            p.b(bundle, obj);
        }
        String str3 = cVar.f8331d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f8332e);
        String str4 = cVar.f8333f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f8334g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f8335h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f8336i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f8337j);
        String str6 = cVar.f8338k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f8339l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f8340m);
        bundle.putBoolean("active", cVar.f8341n);
        bundle.putLong("triggered_timestamp", cVar.f8342o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        o.i(bundle);
        a.c cVar = new a.c();
        cVar.f8328a = (String) o.i((String) p.a(bundle, "origin", String.class, null));
        cVar.f8329b = (String) o.i((String) p.a(bundle, "name", String.class, null));
        cVar.f8330c = p.a(bundle, "value", Object.class, null);
        cVar.f8331d = (String) p.a(bundle, "trigger_event_name", String.class, null);
        cVar.f8332e = ((Long) p.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f8333f = (String) p.a(bundle, "timed_out_event_name", String.class, null);
        cVar.f8334g = (Bundle) p.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.f8335h = (String) p.a(bundle, "triggered_event_name", String.class, null);
        cVar.f8336i = (Bundle) p.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.f8337j = ((Long) p.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.f8338k = (String) p.a(bundle, "expired_event_name", String.class, null);
        cVar.f8339l = (Bundle) p.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.f8341n = ((Boolean) p.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f8340m = ((Long) p.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.f8342o = ((Long) p.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String a10 = q.a(str);
        return a10 != null ? a10 : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        char c10;
        String str3;
        if ("_cmp".equals(str2)) {
            if (i(str) && bundle != null) {
                for (String str4 : f5256d) {
                    if (bundle.containsKey(str4)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c10 = 0;
                    }
                    c10 = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals("fiam")) {
                        c10 = 2;
                    }
                    c10 = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c10 = 1;
                    }
                    c10 = 65535;
                }
                if (c10 == 0) {
                    str3 = "fcm_integration";
                } else if (c10 == 1) {
                    str3 = "fdl_integration";
                } else if (c10 != 2) {
                    return false;
                } else {
                    str3 = "fiam_integration";
                }
                bundle.putString("_cis", str3);
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean f(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f8328a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f8330c;
        if ((obj == null || x.a(obj) != null) && i(str) && j(str, cVar.f8329b)) {
            String str2 = cVar.f8338k;
            if (str2 == null || (g(str2, cVar.f8339l) && e(str, cVar.f8338k, cVar.f8339l))) {
                String str3 = cVar.f8335h;
                if (str3 == null || (g(str3, cVar.f8336i) && e(str, cVar.f8335h, cVar.f8336i))) {
                    String str4 = cVar.f8333f;
                    if (str4 != null) {
                        return g(str4, cVar.f8334g) && e(str, cVar.f8333f, cVar.f8334g);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean g(String str, Bundle bundle) {
        if (f5254b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f5256d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean h(String str) {
        return !f5253a.contains(str);
    }

    public static boolean i(String str) {
        return !f5255c.contains(str);
    }

    public static boolean j(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (f5257e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f5258f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
