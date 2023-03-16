package j$.util.stream;

import java.util.Set;
import java.util.stream.Collector;
/* renamed from: j$.util.stream.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0319j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collector f10060a;

    private /* synthetic */ C0319j(Collector collector) {
        this.f10060a = collector;
    }

    public static /* synthetic */ C0319j b(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C0319j(collector);
    }

    public Set a() {
        return this.f10060a.characteristics();
    }
}
