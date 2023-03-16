package p6;

import com.google.firebase.messaging.k0;
import e6.d;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f12464b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final p6.a f12465a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private p6.a f12466a = null;

        a() {
        }

        public b a() {
            return new b(this.f12466a);
        }

        public a b(p6.a aVar) {
            this.f12466a = aVar;
            return this;
        }
    }

    b(p6.a aVar) {
        this.f12465a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public p6.a a() {
        return this.f12465a;
    }

    public byte[] c() {
        return k0.a(this);
    }
}
