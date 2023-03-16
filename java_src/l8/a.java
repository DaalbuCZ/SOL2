package l8;

import java.nio.ByteBuffer;
import l8.c;
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final l8.c f11187a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11188b;

    /* renamed from: c  reason: collision with root package name */
    private final i<T> f11189c;

    /* renamed from: d  reason: collision with root package name */
    private final c.InterfaceC0159c f11190d;

    /* loaded from: classes.dex */
    private final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f11191a;

        /* renamed from: l8.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0158a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f11193a;

            C0158a(c.b bVar) {
                this.f11193a = bVar;
            }

            @Override // l8.a.e
            public void a(T t10) {
                this.f11193a.a(a.this.f11189c.a(t10));
            }
        }

        private b(d<T> dVar) {
            this.f11191a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f11191a.a(a.this.f11189c.b(byteBuffer), new C0158a(bVar));
            } catch (RuntimeException e10) {
                x7.b.c("BasicMessageChannel#" + a.this.f11188b, "Failed to handle message", e10);
                bVar.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final e<T> f11195a;

        private c(e<T> eVar) {
            this.f11195a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l8.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f11195a.a(a.this.f11189c.b(byteBuffer));
            } catch (RuntimeException e10) {
                x7.b.c("BasicMessageChannel#" + a.this.f11188b, "Failed to handle message reply", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t10, e<T> eVar);
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t10);
    }

    public a(l8.c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, null);
    }

    public a(l8.c cVar, String str, i<T> iVar, c.InterfaceC0159c interfaceC0159c) {
        this.f11187a = cVar;
        this.f11188b = str;
        this.f11189c = iVar;
        this.f11190d = interfaceC0159c;
    }

    public void c(T t10) {
        d(t10, null);
    }

    public void d(T t10, e<T> eVar) {
        this.f11187a.h(this.f11188b, this.f11189c.a(t10), eVar != null ? new c(eVar) : null);
    }

    public void e(d<T> dVar) {
        if (this.f11190d != null) {
            this.f11187a.c(this.f11188b, dVar != null ? new b(dVar) : null, this.f11190d);
        } else {
            this.f11187a.f(this.f11188b, dVar != null ? new b(dVar) : null);
        }
    }
}
