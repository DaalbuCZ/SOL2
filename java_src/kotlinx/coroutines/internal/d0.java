package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import y8.m;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    private static final String f10913a;

    /* renamed from: b */
    private static final String f10914b;

    static {
        Object a10;
        Object a11;
        try {
            m.a aVar = y8.m.f17093n;
            a10 = y8.m.a(Class.forName("d9.a").getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = y8.m.f17093n;
            a10 = y8.m.a(y8.n.a(th));
        }
        if (y8.m.b(a10) != null) {
            a10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f10913a = (String) a10;
        try {
            m.a aVar3 = y8.m.f17093n;
            a11 = y8.m.a(d0.class.getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar4 = y8.m.f17093n;
            a11 = y8.m.a(y8.n.a(th2));
        }
        if (y8.m.b(a11) != null) {
            a11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f10914b = (String) a11;
    }

    public static final /* synthetic */ Throwable a(Throwable th, d9.e eVar) {
        return j(th, eVar);
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    private static final <E extends Throwable> y8.l<E, StackTraceElement[]> c(E e10) {
        boolean z10;
        Throwable cause = e10.getCause();
        if (cause == null || !k9.k.a(cause.getClass(), e10.getClass())) {
            return y8.p.a(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            } else if (h(stackTrace[i10])) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return z10 ? y8.p.a(cause, stackTrace) : y8.p.a(e10, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int g10 = g(stackTrace, f10913a);
        int i10 = 0;
        if (g10 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e11.setStackTrace((StackTraceElement[]) array);
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + g10];
        for (int i11 = 0; i11 < g10; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i10 + g10] = it.next();
            i10++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final ArrayDeque<StackTraceElement> e(d9.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement n10 = eVar.n();
        if (n10 != null) {
            arrayDeque.add(n10);
        }
        while (true) {
            eVar = eVar.h();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement n11 = eVar.n();
            if (n11 != null) {
                arrayDeque.add(n11);
            }
        }
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && k9.k.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && k9.k.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && k9.k.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (k9.k.a(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        boolean k10;
        k10 = q9.m.k(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return k10;
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (h(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 > length2) {
            return;
        }
        while (true) {
            if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i11) {
                return;
            }
            length2--;
        }
    }

    public static final <E extends Throwable> E j(E e10, d9.e eVar) {
        y8.l c10 = c(e10);
        Throwable th = (Throwable) c10.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c10.b();
        Throwable m10 = m(th);
        if (m10 == null) {
            return e10;
        }
        ArrayDeque<StackTraceElement> e11 = e(eVar);
        if (e11.isEmpty()) {
            return e10;
        }
        if (th != e10) {
            i(stackTraceElementArr, e11);
        }
        return (E) d(th, m10, e11);
    }

    public static final <E extends Throwable> E k(E e10) {
        Throwable m10;
        return (r9.n0.d() && (m10 = m(e10)) != null) ? (E) l(m10) : e10;
    }

    private static final <E extends Throwable> E l(E e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int g10 = g(stackTrace, f10914b);
        int i10 = g10 + 1;
        int g11 = g(stackTrace, f10913a);
        int i11 = 0;
        int i12 = (length - g10) - (g11 == -1 ? 0 : length - g11);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i12];
        while (i11 < i12) {
            stackTraceElementArr[i11] = i11 == 0 ? b("Coroutine boundary") : stackTrace[(i10 + i11) - 1];
            i11++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    private static final <E extends Throwable> E m(E e10) {
        E e11 = (E) j.g(e10);
        if (e11 == null) {
            return null;
        }
        if ((e10 instanceof r9.b0) || k9.k.a(e11.getMessage(), e10.getMessage())) {
            return e11;
        }
        return null;
    }

    public static final <E extends Throwable> E n(E e10) {
        E e11 = (E) e10.getCause();
        if (e11 != null && k9.k.a(e11.getClass(), e10.getClass())) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            int length = stackTrace.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (h(stackTrace[i10])) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                return e11;
            }
        }
        return e10;
    }
}
