package j$.util.function;

import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements r {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongConsumer f9731a;

    private /* synthetic */ q(LongConsumer longConsumer) {
        this.f9731a = longConsumer;
    }

    public static /* synthetic */ r a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return new q(longConsumer);
    }

    @Override // j$.util.function.r
    public /* synthetic */ void e(long j10) {
        this.f9731a.accept(j10);
    }
}
