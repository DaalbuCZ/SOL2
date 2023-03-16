package com.google.protobuf;

import com.google.protobuf.u1;
/* loaded from: classes.dex */
public class l0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f6041a;

    /* renamed from: b  reason: collision with root package name */
    private final K f6042b;

    /* renamed from: c  reason: collision with root package name */
    private final V f6043c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final u1.b f6044a;

        /* renamed from: b  reason: collision with root package name */
        public final K f6045b;

        /* renamed from: c  reason: collision with root package name */
        public final u1.b f6046c;

        /* renamed from: d  reason: collision with root package name */
        public final V f6047d;

        public a(u1.b bVar, K k10, u1.b bVar2, V v10) {
            this.f6044a = bVar;
            this.f6045b = k10;
            this.f6046c = bVar2;
            this.f6047d = v10;
        }
    }

    private l0(u1.b bVar, K k10, u1.b bVar2, V v10) {
        this.f6041a = new a<>(bVar, k10, bVar2, v10);
        this.f6042b = k10;
        this.f6043c = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return u.d(aVar.f6044a, 1, k10) + u.d(aVar.f6046c, 2, v10);
    }

    public static <K, V> l0<K, V> d(u1.b bVar, K k10, u1.b bVar2, V v10) {
        return new l0<>(bVar, k10, bVar2, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void e(k kVar, a<K, V> aVar, K k10, V v10) {
        u.z(kVar, aVar.f6044a, 1, k10);
        u.z(kVar, aVar.f6046c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return k.U(i10) + k.C(b(this.f6041a, k10, v10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f6041a;
    }
}
