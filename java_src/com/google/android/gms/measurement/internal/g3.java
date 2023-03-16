package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f4546a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4547b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4548c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f4549d;

    public g3(String str, String str2, Bundle bundle, long j10) {
        this.f4546a = str;
        this.f4547b = str2;
        this.f4549d = bundle;
        this.f4548c = j10;
    }

    public static g3 b(v vVar) {
        return new g3(vVar.f5100n, vVar.f5102p, vVar.f5101o.v(), vVar.f5103q);
    }

    public final v a() {
        return new v(this.f4546a, new t(new Bundle(this.f4549d)), this.f4547b, this.f4548c);
    }

    public final String toString() {
        String str = this.f4547b;
        String str2 = this.f4546a;
        String obj = this.f4549d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
