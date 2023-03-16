package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4837a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f4838b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f4839c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s3 f4840d;

    public o3(s3 s3Var, String str, Bundle bundle) {
        this.f4840d = s3Var;
        z3.o.e("default_event_parameters");
        this.f4837a = "default_event_parameters";
        this.f4838b = new Bundle();
    }

    public final Bundle a() {
        char c10;
        if (this.f4839c == null) {
            String string = this.f4840d.o().getString(this.f4837a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 != 2) {
                                this.f4840d.f4438a.d().r().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f4840d.f4438a.d().r().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f4839c = bundle;
                } catch (JSONException unused2) {
                    this.f4840d.f4438a.d().r().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f4839c == null) {
                this.f4839c = this.f4838b;
            }
        }
        return this.f4839c;
    }

    public final void b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f4840d.o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f4837a);
        } else {
            String str2 = this.f4837a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            this.f4840d.f4438a.d().r().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f4840d.f4438a.d().r().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f4839c = bundle;
    }
}
