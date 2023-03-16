package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class i implements k.h {

    /* renamed from: a  reason: collision with root package name */
    final h f9117a;

    public i(h hVar) {
        this.f9117a = hVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.h
    public String a(String str) {
        return this.f9117a.a(str);
    }

    @Override // io.flutter.plugins.webviewflutter.k.h
    public List<String> b(String str) {
        try {
            String[] b10 = this.f9117a.b(str);
            return b10 == null ? new ArrayList() : Arrays.asList(b10);
        } catch (IOException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }
}
