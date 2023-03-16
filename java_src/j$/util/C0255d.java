package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;
/* renamed from: j$.util.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0255d implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9718a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9719b;

    public /* synthetic */ C0255d(Object obj, int i10) {
        this.f9718a = i10;
        this.f9719b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9718a) {
            case 0:
                Function function = (Function) this.f9719b;
                return ((Comparable) function.a(obj)).compareTo(function.a(obj2));
            case 1:
                j$.util.function.B b10 = (j$.util.function.B) this.f9719b;
                return Double.compare(b10.t(obj), b10.t(obj2));
            case 2:
                j$.util.function.C c10 = (j$.util.function.C) this.f9719b;
                return Integer.compare(c10.f(obj), c10.f(obj2));
            default:
                j$.util.function.D d10 = (j$.util.function.D) this.f9719b;
                return Long.compare(d10.g(obj), d10.g(obj2));
        }
    }
}
