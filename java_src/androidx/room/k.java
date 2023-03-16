package androidx.room;

import b0.c;
import java.io.File;
/* loaded from: classes.dex */
class k implements c.InterfaceC0057c {

    /* renamed from: a  reason: collision with root package name */
    private final String f2283a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2284b;

    /* renamed from: c  reason: collision with root package name */
    private final c.InterfaceC0057c f2285c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, File file, c.InterfaceC0057c interfaceC0057c) {
        this.f2283a = str;
        this.f2284b = file;
        this.f2285c = interfaceC0057c;
    }

    @Override // b0.c.InterfaceC0057c
    public b0.c a(c.b bVar) {
        return new j(bVar.f2720a, this.f2283a, this.f2284b, bVar.f2722c.f2719a, this.f2285c.a(bVar));
    }
}
