package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import d7.k;
import f5.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.h;
import t4.i;
/* loaded from: classes.dex */
public class a {

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f5798l = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final Context f5799a;

    /* renamed from: b  reason: collision with root package name */
    private final e f5800b;

    /* renamed from: c  reason: collision with root package name */
    private final g5.c f5801c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f5802d;

    /* renamed from: e  reason: collision with root package name */
    private final d f5803e;

    /* renamed from: f  reason: collision with root package name */
    private final d f5804f;

    /* renamed from: g  reason: collision with root package name */
    private final d f5805g;

    /* renamed from: h  reason: collision with root package name */
    private final j f5806h;

    /* renamed from: i  reason: collision with root package name */
    private final l f5807i;

    /* renamed from: j  reason: collision with root package name */
    private final m f5808j;

    /* renamed from: k  reason: collision with root package name */
    private final j6.e f5809k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, e eVar, j6.e eVar2, g5.c cVar, Executor executor, d dVar, d dVar2, d dVar3, j jVar, l lVar, m mVar) {
        this.f5799a = context;
        this.f5800b = eVar;
        this.f5809k = eVar2;
        this.f5801c = cVar;
        this.f5802d = executor;
        this.f5803e = dVar;
        this.f5804f = dVar2;
        this.f5805g = dVar3;
        this.f5806h = jVar;
        this.f5807i = lVar;
        this.f5808j = mVar;
    }

    private static boolean j(com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        return eVar2 == null || !eVar.e().equals(eVar2.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i k(i iVar, i iVar2, i iVar3) {
        if (!iVar.p() || iVar.l() == null) {
            return t4.l.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.e eVar = (com.google.firebase.remoteconfig.internal.e) iVar.l();
        return (!iVar2.p() || j(eVar, (com.google.firebase.remoteconfig.internal.e) iVar2.l())) ? this.f5804f.k(eVar).h(this.f5802d, new t4.a() { // from class: d7.a
            @Override // t4.a
            public final Object a(t4.i iVar4) {
                boolean n10;
                n10 = com.google.firebase.remoteconfig.a.this.n(iVar4);
                return Boolean.valueOf(n10);
            }
        }) : t4.l.e(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i m(Void r12) {
        return e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(i<com.google.firebase.remoteconfig.internal.e> iVar) {
        if (iVar.p()) {
            this.f5803e.d();
            if (iVar.l() != null) {
                q(iVar.l().c());
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    static List<Map<String, String>> p(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public i<Boolean> e() {
        final i<com.google.firebase.remoteconfig.internal.e> e10 = this.f5803e.e();
        final i<com.google.firebase.remoteconfig.internal.e> e11 = this.f5804f.e();
        return t4.l.i(e10, e11).j(this.f5802d, new t4.a() { // from class: d7.b
            @Override // t4.a
            public final Object a(t4.i iVar) {
                t4.i k10;
                k10 = com.google.firebase.remoteconfig.a.this.k(e10, e11, iVar);
                return k10;
            }
        });
    }

    public i<Void> f() {
        return this.f5806h.h().q(l5.i.a(), d7.d.f6602a);
    }

    public i<Boolean> g() {
        return f().q(this.f5802d, new h() { // from class: d7.c
            @Override // t4.h
            public final t4.i a(Object obj) {
                t4.i m10;
                m10 = com.google.firebase.remoteconfig.a.this.m((Void) obj);
                return m10;
            }
        });
    }

    public Map<String, k> h() {
        return this.f5807i.d();
    }

    public d7.h i() {
        return this.f5808j.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.f5804f.e();
        this.f5805g.e();
        this.f5803e.e();
    }

    void q(JSONArray jSONArray) {
        if (this.f5801c == null) {
            return;
        }
        try {
            this.f5801c.k(p(jSONArray));
        } catch (g5.a e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }
}
