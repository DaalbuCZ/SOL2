package t2;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import o3.j0;
import t2.a;
/* loaded from: classes.dex */
public final class b<T extends a<T>> implements j0.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final j0.a<? extends T> f14707a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f14708b;

    public b(j0.a<? extends T> aVar, List<c> list) {
        this.f14707a = aVar;
        this.f14708b = list;
    }

    @Override // o3.j0.a
    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) {
        T a10 = this.f14707a.a(uri, inputStream);
        List<c> list = this.f14708b;
        return (list == null || list.isEmpty()) ? a10 : (T) a10.a(this.f14708b);
    }
}
