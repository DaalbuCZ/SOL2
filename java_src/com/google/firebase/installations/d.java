package com.google.firebase.installations;

import f5.k;
/* loaded from: classes.dex */
public class d extends k {

    /* renamed from: n  reason: collision with root package name */
    private final a f5418n;

    /* loaded from: classes.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f5418n = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f5418n = aVar;
    }
}
