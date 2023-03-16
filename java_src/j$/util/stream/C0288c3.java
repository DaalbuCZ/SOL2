package j$.util.stream;

import java.util.Map;
/* renamed from: j$.util.stream.c3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0288c3 {

    /* renamed from: a  reason: collision with root package name */
    final Map f10003a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0288c3(Map map) {
        this.f10003a = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0288c3 a(EnumC0293d3 enumC0293d3) {
        this.f10003a.put(enumC0293d3, 2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0288c3 b(EnumC0293d3 enumC0293d3) {
        this.f10003a.put(enumC0293d3, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0288c3 c(EnumC0293d3 enumC0293d3) {
        this.f10003a.put(enumC0293d3, 3);
        return this;
    }
}
