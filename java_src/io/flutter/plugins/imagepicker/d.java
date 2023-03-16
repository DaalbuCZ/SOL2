package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import l8.j;
/* loaded from: classes.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f9035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
        this.f9035a = context.getSharedPreferences("flutter_image_picker_shared_preference", 0);
    }

    private void h(Double d10, Double d11, int i10) {
        SharedPreferences.Editor edit = this.f9035a.edit();
        if (d10 != null) {
            edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(d10.doubleValue()));
        }
        if (d11 != null) {
            edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(d11.doubleValue()));
        }
        if (i10 <= -1 || i10 >= 101) {
            edit.putInt("flutter_image_picker_image_quality", 100);
        } else {
            edit.putInt("flutter_image_picker_image_quality", i10);
        }
        edit.apply();
    }

    private void i(String str) {
        this.f9035a.edit().putString("flutter_image_picker_type", str).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f9035a.edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> b() {
        boolean z10;
        Set<String> stringSet;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        if (!this.f9035a.contains("flutter_image_picker_image_path") || (stringSet = this.f9035a.getStringSet("flutter_image_picker_image_path", null)) == null) {
            z10 = false;
        } else {
            arrayList.addAll(stringSet);
            hashMap.put("pathList", arrayList);
            z10 = true;
        }
        if (this.f9035a.contains("flutter_image_picker_error_code")) {
            hashMap.put("errorCode", this.f9035a.getString("flutter_image_picker_error_code", ""));
            if (this.f9035a.contains("flutter_image_picker_error_message")) {
                hashMap.put("errorMessage", this.f9035a.getString("flutter_image_picker_error_message", ""));
            }
        } else {
            z11 = z10;
        }
        if (z11) {
            if (this.f9035a.contains("flutter_image_picker_type")) {
                hashMap.put("type", this.f9035a.getString("flutter_image_picker_type", ""));
            }
            if (this.f9035a.contains("flutter_image_picker_max_width")) {
                hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(this.f9035a.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (this.f9035a.contains("flutter_image_picker_max_height")) {
                hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(this.f9035a.getLong("flutter_image_picker_max_height", 0L))));
            }
            hashMap.put("imageQuality", this.f9035a.contains("flutter_image_picker_image_quality") ? Integer.valueOf(this.f9035a.getInt("flutter_image_picker_image_quality", 100)) : 100);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f9035a.getString("flutter_image_picker_pending_image_uri", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(j jVar) {
        h((Double) jVar.a("maxWidth"), (Double) jVar.a("maxHeight"), jVar.a("imageQuality") == null ? 100 : ((Integer) jVar.a("imageQuality")).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Uri uri) {
        this.f9035a.edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ArrayList<String> arrayList, String str, String str2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        SharedPreferences.Editor edit = this.f9035a.edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", hashSet);
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(String str) {
        String str2;
        if (str.equals("pickImage") || str.equals("pickMultiImage")) {
            str2 = "image";
        } else if (!str.equals("pickVideo")) {
            return;
        } else {
            str2 = "video";
        }
        i(str2);
    }
}
