package l8;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: l8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0159c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11197a = true;

        public boolean a() {
            return this.f11197a;
        }
    }

    InterfaceC0159c a(d dVar);

    InterfaceC0159c b();

    void c(String str, a aVar, InterfaceC0159c interfaceC0159c);

    void d(String str, ByteBuffer byteBuffer);

    void f(String str, a aVar);

    void h(String str, ByteBuffer byteBuffer, b bVar);
}
