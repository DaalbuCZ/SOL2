package n1;

import java.util.concurrent.Executor;
import p1.b;
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11553a;

    /* renamed from: b  reason: collision with root package name */
    private final o1.d f11554b;

    /* renamed from: c  reason: collision with root package name */
    private final y f11555c;

    /* renamed from: d  reason: collision with root package name */
    private final p1.b f11556d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Executor executor, o1.d dVar, y yVar, p1.b bVar) {
        this.f11553a = executor;
        this.f11554b = dVar;
        this.f11555c = yVar;
        this.f11556d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (g1.p pVar : this.f11554b.C()) {
            this.f11555c.b(pVar, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f11556d.c(new b.a() { // from class: n1.v
            @Override // p1.b.a
            public final Object b() {
                Object d10;
                d10 = w.this.d();
                return d10;
            }
        });
    }

    public void c() {
        this.f11553a.execute(new Runnable() { // from class: n1.u
            @Override // java.lang.Runnable
            public final void run() {
                w.this.e();
            }
        });
    }
}
