package com.google.firebase.abt.component;

import android.content.Context;
import g5.c;
import i6.b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c> f5238a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f5239b;

    /* renamed from: c  reason: collision with root package name */
    private final b<i5.a> f5240c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, b<i5.a> bVar) {
        this.f5239b = context;
        this.f5240c = bVar;
    }

    protected c a(String str) {
        return new c(this.f5239b, this.f5240c, str);
    }

    public synchronized c b(String str) {
        if (!this.f5238a.containsKey(str)) {
            this.f5238a.put(str, a(str));
        }
        return this.f5238a.get(str);
    }
}
