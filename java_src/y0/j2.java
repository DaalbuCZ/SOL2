package y0;

import java.io.IOException;
/* loaded from: classes.dex */
public class j2 extends IOException {

    /* renamed from: n  reason: collision with root package name */
    private int f16541n;

    /* renamed from: o  reason: collision with root package name */
    private String f16542o;

    public j2() {
    }

    public j2(int i10, String str) {
        this.f16541n = i10;
        this.f16542o = str;
    }

    public int a() {
        return this.f16541n;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f16542o;
    }
}
