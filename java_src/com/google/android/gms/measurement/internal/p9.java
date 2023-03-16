package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* loaded from: classes.dex */
public final class p9 {

    /* renamed from: a  reason: collision with root package name */
    private final j4 f4899a;

    public p9(j4 j4Var) {
        this.f4899a = j4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        String uri;
        this.f4899a.b().h();
        if (this.f4899a.o()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f4899a.F().f4989v.b(uri);
        this.f4899a.F().f4990w.b(this.f4899a.e().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f4899a.b().h();
        if (d()) {
            if (e()) {
                this.f4899a.F().f4989v.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f4899a.I().u("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f4899a.F().f4989v.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f4899a.d().t().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f4899a.F().f4990w.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    this.f4899a.I().u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f4899a.F().f4989v.b(null);
            }
            this.f4899a.F().f4990w.b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f4899a.F().f4989v.b(null);
        }
    }

    final boolean d() {
        return this.f4899a.F().f4990w.a() > 0;
    }

    final boolean e() {
        return d() && this.f4899a.e().a() - this.f4899a.F().f4990w.a() > this.f4899a.z().r(null, u2.S);
    }
}
