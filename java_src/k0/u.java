package k0;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    private UUID f10521a;

    /* renamed from: b  reason: collision with root package name */
    private s0.p f10522b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f10523c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends u> {

        /* renamed from: c  reason: collision with root package name */
        s0.p f10526c;

        /* renamed from: e  reason: collision with root package name */
        Class<? extends ListenableWorker> f10528e;

        /* renamed from: a  reason: collision with root package name */
        boolean f10524a = false;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f10527d = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        UUID f10525b = UUID.randomUUID();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Class<? extends ListenableWorker> cls) {
            this.f10528e = cls;
            this.f10526c = new s0.p(this.f10525b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f10527d.add(str);
            return d();
        }

        public final W b() {
            W c10 = c();
            b bVar = this.f10526c.f13240j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && bVar.e()) || bVar.f() || bVar.g() || (i10 >= 23 && bVar.h());
            s0.p pVar = this.f10526c;
            if (pVar.f13247q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (pVar.f13237g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f10525b = UUID.randomUUID();
            s0.p pVar2 = new s0.p(this.f10526c);
            this.f10526c = pVar2;
            pVar2.f13231a = this.f10525b.toString();
            return c10;
        }

        abstract W c();

        abstract B d();

        public final B e(k0.a aVar, long j10, TimeUnit timeUnit) {
            this.f10524a = true;
            s0.p pVar = this.f10526c;
            pVar.f13242l = aVar;
            pVar.e(timeUnit.toMillis(j10));
            return d();
        }

        public final B f(b bVar) {
            this.f10526c.f13240j = bVar;
            return d();
        }

        public final B g(androidx.work.b bVar) {
            this.f10526c.f13235e = bVar;
            return d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u(UUID uuid, s0.p pVar, Set<String> set) {
        this.f10521a = uuid;
        this.f10522b = pVar;
        this.f10523c = set;
    }

    public UUID a() {
        return this.f10521a;
    }

    public String b() {
        return this.f10521a.toString();
    }

    public Set<String> c() {
        return this.f10523c;
    }

    public s0.p d() {
        return this.f10522b;
    }
}
