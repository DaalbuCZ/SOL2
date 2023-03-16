package com.google.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public class n1 extends RuntimeException {

    /* renamed from: n  reason: collision with root package name */
    private final List<String> f6059n;

    public n1(s0 s0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f6059n = null;
    }

    public c0 a() {
        return new c0(getMessage());
    }
}
