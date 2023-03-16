package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {

    /* renamed from: f  reason: collision with root package name */
    private static final Date f5842f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f5843a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f5844b;

    /* renamed from: c  reason: collision with root package name */
    private Date f5845c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f5846d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f5847e;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f5848a;

        /* renamed from: b  reason: collision with root package name */
        private Date f5849b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f5850c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f5851d;

        private b() {
            this.f5848a = new JSONObject();
            this.f5849b = e.f5842f;
            this.f5850c = new JSONArray();
            this.f5851d = new JSONObject();
        }

        public e a() {
            return new e(this.f5848a, this.f5849b, this.f5850c, this.f5851d);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f5848a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f5850c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f5849b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f5851d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f5844b = jSONObject;
        this.f5845c = date;
        this.f5846d = jSONArray;
        this.f5847e = jSONObject2;
        this.f5843a = jSONObject3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public static b g() {
        return new b();
    }

    public JSONArray c() {
        return this.f5846d;
    }

    public JSONObject d() {
        return this.f5844b;
    }

    public Date e() {
        return this.f5845c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f5843a.toString().equals(((e) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f5847e;
    }

    public int hashCode() {
        return this.f5843a.hashCode();
    }

    public String toString() {
        return this.f5843a.toString();
    }
}
