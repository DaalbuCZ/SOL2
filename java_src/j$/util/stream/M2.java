package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.Collection$EL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class M2 extends E2 {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f9864d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M2(InterfaceC0356q2 interfaceC0356q2, Comparator comparator) {
        super(interfaceC0356q2, comparator);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f9864d.add(obj);
    }

    @Override // j$.util.stream.AbstractC0337m2, j$.util.stream.InterfaceC0356q2
    public void h() {
        AbstractC0251a.z(this.f9864d, this.f9803b);
        this.f10096a.j(this.f9864d.size());
        if (this.f9804c) {
            Iterator it = this.f9864d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f10096a.r()) {
                    break;
                }
                this.f10096a.accept(next);
            }
        } else {
            ArrayList arrayList = this.f9864d;
            InterfaceC0356q2 interfaceC0356q2 = this.f10096a;
            Objects.requireNonNull(interfaceC0356q2);
            Collection$EL.a(arrayList, new C0279b(interfaceC0356q2, 3));
        }
        this.f10096a.h();
        this.f9864d = null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9864d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
    }
}
