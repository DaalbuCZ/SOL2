package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g> f8769a = new HashMap();

    @Override // io.flutter.plugin.platform.h
    public boolean a(String str, g gVar) {
        if (this.f8769a.containsKey(str)) {
            return false;
        }
        this.f8769a.put(str, gVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g b(String str) {
        return this.f8769a.get(str);
    }
}