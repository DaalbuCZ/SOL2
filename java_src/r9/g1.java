package r9;

import b9.g;
import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class g1 extends d0 implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final a f13114p = new a(null);

    /* loaded from: classes.dex */
    public static final class a extends b9.b<d0, g1> {

        /* renamed from: r9.g1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0190a extends k9.l implements j9.l<g.b, g1> {

            /* renamed from: o  reason: collision with root package name */
            public static final C0190a f13115o = new C0190a();

            C0190a() {
                super(1);
            }

            @Override // j9.l
            /* renamed from: a */
            public final g1 c(g.b bVar) {
                if (bVar instanceof g1) {
                    return (g1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(d0.f13106o, C0190a.f13115o);
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }
}
