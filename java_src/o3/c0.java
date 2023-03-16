package o3;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class c0 extends a0 {

    /* renamed from: q  reason: collision with root package name */
    public final int f11936q;

    /* renamed from: r  reason: collision with root package name */
    public final String f11937r;

    /* renamed from: s  reason: collision with root package name */
    public final Map<String, List<String>> f11938s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f11939t;

    public c0(int i10, String str, IOException iOException, Map<String, List<String>> map, p pVar, byte[] bArr) {
        super("Response code: " + i10, iOException, pVar, 2004, 1);
        this.f11936q = i10;
        this.f11937r = str;
        this.f11938s = map;
        this.f11939t = bArr;
    }
}
