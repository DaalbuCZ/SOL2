package i0;

import i0.f;
import j9.l;
import java.util.List;
import java.util.Objects;
import k9.k;
/* loaded from: classes.dex */
final class d<T> extends f<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f8207b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8208c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8209d;

    /* renamed from: e  reason: collision with root package name */
    private final e f8210e;

    /* renamed from: f  reason: collision with root package name */
    private final f.b f8211f;

    /* renamed from: g  reason: collision with root package name */
    private final i f8212g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8213a;

        static {
            int[] iArr = new int[f.b.values().length];
            iArr[f.b.STRICT.ordinal()] = 1;
            iArr[f.b.LOG.ordinal()] = 2;
            iArr[f.b.QUIET.ordinal()] = 3;
            f8213a = iArr;
        }
    }

    public d(T t10, String str, String str2, e eVar, f.b bVar) {
        List h10;
        k.e(t10, "value");
        k.e(str, "tag");
        k.e(str2, "message");
        k.e(eVar, "logger");
        k.e(bVar, "verificationMode");
        this.f8207b = t10;
        this.f8208c = str;
        this.f8209d = str2;
        this.f8210e = eVar;
        this.f8211f = bVar;
        i iVar = new i(b(t10, str2));
        StackTraceElement[] stackTrace = iVar.getStackTrace();
        k.d(stackTrace, "stackTrace");
        h10 = z8.f.h(stackTrace, 2);
        Object[] array = h10.toArray(new StackTraceElement[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        iVar.setStackTrace((StackTraceElement[]) array);
        this.f8212g = iVar;
    }

    @Override // i0.f
    public T a() {
        int i10 = a.f8213a[this.f8211f.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.f8210e.a(this.f8208c, b(this.f8207b, this.f8209d));
                return null;
            } else if (i10 == 3) {
                return null;
            } else {
                throw new y8.k();
            }
        }
        throw this.f8212g;
    }

    @Override // i0.f
    public f<T> c(String str, l<? super T, Boolean> lVar) {
        k.e(str, "message");
        k.e(lVar, "condition");
        return this;
    }
}
