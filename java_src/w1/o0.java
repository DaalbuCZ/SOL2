package w1;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o0 extends IOException {

    /* renamed from: n  reason: collision with root package name */
    public final o3.p f15947n;

    /* renamed from: o  reason: collision with root package name */
    public final Uri f15948o;

    /* renamed from: p  reason: collision with root package name */
    public final Map<String, List<String>> f15949p;

    /* renamed from: q  reason: collision with root package name */
    public final long f15950q;

    public o0(o3.p pVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f15947n = pVar;
        this.f15948o = uri;
        this.f15949p = map;
        this.f15950q = j10;
    }
}
