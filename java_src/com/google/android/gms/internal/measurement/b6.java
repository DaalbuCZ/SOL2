package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: f  reason: collision with root package name */
    static HashMap f3731f;

    /* renamed from: k  reason: collision with root package name */
    private static Object f3736k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f3737l;

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f3726a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f3727b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f3728c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f3729d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f3730e = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    static final HashMap f3732g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    static final HashMap f3733h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    static final HashMap f3734i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    static final HashMap f3735j = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    static final String[] f3738m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (b6.class) {
            if (f3731f == null) {
                f3730e.set(false);
                f3731f = new HashMap();
                f3736k = new Object();
                f3737l = false;
                contentResolver.registerContentObserver(f3726a, true, new z5(null));
            } else if (f3730e.getAndSet(false)) {
                f3731f.clear();
                f3732g.clear();
                f3733h.clear();
                f3734i.clear();
                f3735j.clear();
                f3736k = new Object();
                f3737l = false;
            }
            Object obj = f3736k;
            if (f3731f.containsKey(str)) {
                String str3 = (String) f3731f.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = f3738m.length;
            Cursor query = contentResolver.query(f3726a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                c(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (b6.class) {
            if (obj == f3736k) {
                f3731f.put(str, str2);
            }
        }
    }
}
