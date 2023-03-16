package w1;

import java.util.UUID;
/* loaded from: classes.dex */
public final class h0 implements v1.b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f15913d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f15914a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f15915b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15916c;

    static {
        boolean z10;
        if ("Amazon".equals(p3.m0.f12308c)) {
            String str = p3.m0.f12309d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f15913d = z10;
            }
        }
        z10 = false;
        f15913d = z10;
    }

    public h0(UUID uuid, byte[] bArr, boolean z10) {
        this.f15914a = uuid;
        this.f15915b = bArr;
        this.f15916c = z10;
    }
}
