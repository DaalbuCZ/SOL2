package y0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class t2 implements j3<String> {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f16715a;

    public t2(Context context) {
        this.f16715a = context.getSharedPreferences("bugfender.device.key", 0);
    }

    private SharedPreferences.Editor i() {
        return this.f16715a.edit();
    }

    private <T> boolean m(String str, T t10) {
        try {
            String s10 = s(str);
            if (this.f16715a.contains(s10)) {
                if (t10 instanceof Boolean) {
                    Boolean bool = (Boolean) t10;
                    return bool.equals(Boolean.valueOf(this.f16715a.getBoolean(s10, bool.booleanValue())));
                } else if (t10 instanceof Integer) {
                    Integer num = (Integer) t10;
                    return num.equals(Integer.valueOf(this.f16715a.getInt(s10, num.intValue())));
                } else if (t10 instanceof Float) {
                    Float f10 = (Float) t10;
                    return f10.equals(Float.valueOf(this.f16715a.getFloat(s10, f10.floatValue())));
                } else if (t10 instanceof String) {
                    String str2 = (String) t10;
                    return str2.equals(this.f16715a.getString(s10, str2));
                } else {
                    throw new IllegalArgumentException("value type is not supported. Use Boolean, Integer, Float or String");
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    private <T> boolean n(String str, T t10, SharedPreferences.Editor editor) {
        if (t10 instanceof Boolean) {
            Boolean bool = (Boolean) t10;
            editor.putBoolean(str, bool.booleanValue());
            editor.putBoolean(s(str), bool.booleanValue());
        } else if (t10 instanceof Integer) {
            Integer num = (Integer) t10;
            editor.putInt(str, num.intValue());
            editor.putInt(s(str), num.intValue());
        } else if (t10 instanceof Float) {
            Float f10 = (Float) t10;
            editor.putFloat(str, f10.floatValue());
            editor.putFloat(s(str), f10.floatValue());
        } else if (!(t10 instanceof String)) {
            throw new IllegalArgumentException("value type is not supported. Use Boolean, Integer, Float or String");
        } else {
            String str2 = (String) t10;
            editor.putString(str, str2);
            editor.putString(s(str), str2);
        }
        return editor.commit();
    }

    private boolean p() {
        boolean z10 = this.f16715a.getBoolean("resend.keys.boolean.key", true);
        if (z10) {
            SharedPreferences.Editor edit = this.f16715a.edit();
            edit.putBoolean("resend.keys.boolean.key", false);
            edit.apply();
        }
        return z10;
    }

    private boolean q(String str) {
        return str.contains(".copy");
    }

    private <T> boolean r(String str, T t10) {
        if (m(str, t10)) {
            return true;
        }
        return n(str, t10, i());
    }

    private String s(String str) {
        return str + ".copy";
    }

    private boolean t(String str) {
        return str.equalsIgnoreCase("first.time.boolean.key") || str.equalsIgnoreCase("resend.keys.boolean.key");
    }

    @Override // y0.j3
    public Map<String, ?> a(boolean z10) {
        HashMap hashMap = new HashMap();
        Map<String, ?> all = this.f16715a.getAll();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (String str : all.keySet()) {
            Object obj = all.get(str);
            if (t(str)) {
                hashMap2.put(str, obj);
            } else if (q(str)) {
                hashMap3.put(str.replace(".copy", ""), obj);
            } else {
                hashMap.put(str, obj);
            }
        }
        if (z10 || p()) {
            hashMap.putAll(hashMap3);
        }
        return hashMap;
    }

    @Override // y0.j3
    public boolean b(String str) {
        SharedPreferences.Editor i10 = i();
        i10.remove(str);
        i10.remove(s(str));
        return i10.commit();
    }

    @Override // y0.j3
    public Map<String, ?> d() {
        return a(false);
    }

    @Override // y0.j3
    public boolean g(String str) {
        SharedPreferences.Editor i10 = i();
        i10.remove(str);
        return i10.commit();
    }

    @Override // y0.j3
    /* renamed from: j */
    public boolean h(String str, Boolean bool) {
        return r(str, bool);
    }

    @Override // y0.j3
    /* renamed from: k */
    public boolean e(String str, Float f10) {
        return r(str, f10);
    }

    @Override // y0.j3
    /* renamed from: l */
    public boolean f(String str, Integer num) {
        return r(str, num);
    }

    @Override // y0.j3
    /* renamed from: o */
    public boolean c(String str, String str2) {
        return r(str, str2);
    }
}
