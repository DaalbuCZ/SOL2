package j$.util.stream;

import j$.util.function.Function;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0353q extends AbstractC0337m2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10120b = 1;

    /* renamed from: c  reason: collision with root package name */
    Object f10121c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Object f10122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353q(r rVar, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10122d = rVar;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f10120b) {
            case 0:
                if (((Set) this.f10121c).contains(obj)) {
                    return;
                }
                ((Set) this.f10121c).add(obj);
                this.f10096a.accept(obj);
                return;
            case 1:
                InterfaceC0369u0 interfaceC0369u0 = (InterfaceC0369u0) ((Function) ((A) this.f10122d).f9760v).a(obj);
                if (interfaceC0369u0 != null) {
                    try {
                        interfaceC0369u0.sequential().c((j$.util.function.r) this.f10121c);
                    } catch (Throwable th) {
                        try {
                            ((AbstractC0284c) interfaceC0369u0).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC0369u0 != null) {
                    ((AbstractC0284c) interfaceC0369u0).close();
                    return;
                }
                return;
            case 2:
                InterfaceC0330l0 interfaceC0330l0 = (InterfaceC0330l0) ((Function) ((C0388z) this.f10122d).f10188v).a(obj);
                if (interfaceC0330l0 != null) {
                    try {
                        interfaceC0330l0.sequential().i((j$.util.function.m) this.f10121c);
                    } catch (Throwable th3) {
                        try {
                            ((AbstractC0284c) interfaceC0330l0).close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (interfaceC0330l0 != null) {
                    ((AbstractC0284c) interfaceC0330l0).close();
                    return;
                }
                return;
            default:
                H h10 = (H) ((Function) ((C0380x) this.f10122d).f10171v).a(obj);
                if (h10 != null) {
                    try {
                        h10.sequential().f((j$.util.function.h) this.f10121c);
                    } catch (Throwable th5) {
                        try {
                            ((AbstractC0284c) h10).close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (h10 != null) {
                    ((AbstractC0284c) h10).close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0337m2, j$.util.stream.InterfaceC0356q2
    public void h() {
        switch (this.f10120b) {
            case 0:
                this.f10121c = null;
                this.f10096a.h();
                return;
            default:
                this.f10096a.h();
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        switch (this.f10120b) {
            case 0:
                this.f10121c = new HashSet();
                this.f10096a.j(-1L);
                return;
            case 1:
                this.f10096a.j(-1L);
                return;
            case 2:
                this.f10096a.j(-1L);
                return;
            default:
                this.f10096a.j(-1L);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353q(C0380x c0380x, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10122d = c0380x;
        InterfaceC0356q2 interfaceC0356q22 = this.f10096a;
        Objects.requireNonNull(interfaceC0356q22);
        this.f10121c = new C0372v(interfaceC0356q22, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353q(C0388z c0388z, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10122d = c0388z;
        InterfaceC0356q2 interfaceC0356q22 = this.f10096a;
        Objects.requireNonNull(interfaceC0356q22);
        this.f10121c = new C0285c0(interfaceC0356q22, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353q(A a10, InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
        this.f10122d = a10;
        InterfaceC0356q2 interfaceC0356q22 = this.f10096a;
        Objects.requireNonNull(interfaceC0356q22);
        this.f10121c = new C0340n0(interfaceC0356q22, 0);
    }
}
