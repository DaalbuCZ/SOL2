package com.google.android.gms.auth.api.signin;

import a4.c;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.e;
import d4.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import z3.o;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a4.a implements ReflectedParcelable {

    /* renamed from: n  reason: collision with root package name */
    final int f3514n;

    /* renamed from: o  reason: collision with root package name */
    private String f3515o;

    /* renamed from: p  reason: collision with root package name */
    private String f3516p;

    /* renamed from: q  reason: collision with root package name */
    private String f3517q;

    /* renamed from: r  reason: collision with root package name */
    private String f3518r;

    /* renamed from: s  reason: collision with root package name */
    private Uri f3519s;

    /* renamed from: t  reason: collision with root package name */
    private String f3520t;

    /* renamed from: u  reason: collision with root package name */
    private long f3521u;

    /* renamed from: v  reason: collision with root package name */
    private String f3522v;

    /* renamed from: w  reason: collision with root package name */
    List<Scope> f3523w;

    /* renamed from: x  reason: collision with root package name */
    private String f3524x;

    /* renamed from: y  reason: collision with root package name */
    private String f3525y;

    /* renamed from: z  reason: collision with root package name */
    private Set<Scope> f3526z = new HashSet();
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();
    public static e A = h.d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List<Scope> list, String str7, String str8) {
        this.f3514n = i10;
        this.f3515o = str;
        this.f3516p = str2;
        this.f3517q = str3;
        this.f3518r = str4;
        this.f3519s = uri;
        this.f3520t = str5;
        this.f3521u = j10;
        this.f3522v = str6;
        this.f3523w = list;
        this.f3524x = str7;
        this.f3525y = str8;
    }

    public static GoogleSignInAccount I(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), o.e(str7), new ArrayList((Collection) o.i(set)), str5, str6);
    }

    public static GoogleSignInAccount J(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount I = I(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        I.f3520t = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return I;
    }

    public String C() {
        return this.f3524x;
    }

    public String D() {
        return this.f3515o;
    }

    public String E() {
        return this.f3516p;
    }

    public Uri F() {
        return this.f3519s;
    }

    public Set<Scope> G() {
        HashSet hashSet = new HashSet(this.f3523w);
        hashSet.addAll(this.f3526z);
        return hashSet;
    }

    public String H() {
        return this.f3520t;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f3522v.equals(this.f3522v) && googleSignInAccount.G().equals(G());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3522v.hashCode() + 527) * 31) + G().hashCode();
    }

    public Account k() {
        String str = this.f3517q;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String s() {
        return this.f3518r;
    }

    public String v() {
        return this.f3517q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.i(parcel, 1, this.f3514n);
        c.n(parcel, 2, D(), false);
        c.n(parcel, 3, E(), false);
        c.n(parcel, 4, v(), false);
        c.n(parcel, 5, s(), false);
        c.m(parcel, 6, F(), i10, false);
        c.n(parcel, 7, H(), false);
        c.k(parcel, 8, this.f3521u);
        c.n(parcel, 9, this.f3522v, false);
        c.q(parcel, 10, this.f3523w, false);
        c.n(parcel, 11, C(), false);
        c.n(parcel, 12, x(), false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f3525y;
    }
}
