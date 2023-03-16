package m1;

import g1.p;
import g1.u;
import h1.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import n1.y;
import p1.b;
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f11311f = Logger.getLogger(u.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final y f11312a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11313b;

    /* renamed from: c  reason: collision with root package name */
    private final h1.e f11314c;

    /* renamed from: d  reason: collision with root package name */
    private final o1.d f11315d;

    /* renamed from: e  reason: collision with root package name */
    private final p1.b f11316e;

    public c(Executor executor, h1.e eVar, y yVar, o1.d dVar, p1.b bVar) {
        this.f11313b = executor;
        this.f11314c = eVar;
        this.f11312a = yVar;
        this.f11315d = dVar;
        this.f11316e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, g1.i iVar) {
        this.f11315d.l(pVar, iVar);
        this.f11312a.b(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, e1.h hVar, g1.i iVar) {
        try {
            m a10 = this.f11314c.a(pVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f11311f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final g1.i a11 = a10.a(iVar);
            this.f11316e.c(new b.a() { // from class: m1.b
                @Override // p1.b.a
                public final Object b() {
                    Object d10;
                    d10 = c.this.d(pVar, a11);
                    return d10;
                }
            });
            hVar.a(null);
        } catch (Exception e10) {
            Logger logger = f11311f;
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override // m1.e
    public void a(final p pVar, final g1.i iVar, final e1.h hVar) {
        this.f11313b.execute(new Runnable() { // from class: m1.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(pVar, hVar, iVar);
            }
        });
    }
}
