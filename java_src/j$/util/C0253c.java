package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;
/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0253c implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f9639b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9640c;

    public /* synthetic */ C0253c(Comparator comparator, Object obj, int i10) {
        this.f9638a = i10;
        this.f9639b = comparator;
        this.f9640c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9638a) {
            case 0:
                Comparator comparator = this.f9639b;
                Comparator comparator2 = (Comparator) this.f9640c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.f9639b;
                Function function = (Function) this.f9640c;
                return comparator3.compare(function.a(obj), function.a(obj2));
        }
    }
}
