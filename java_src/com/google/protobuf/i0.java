package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f5992a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final i0 f5993b = new c();

    /* loaded from: classes.dex */
    private static final class b extends i0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f5994c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) s1.C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j10, int i10) {
            List<L> i11;
            g0 g0Var;
            List<L> f10 = f(obj, j10);
            if (!f10.isEmpty()) {
                if (f5994c.isAssignableFrom(f10.getClass())) {
                    ArrayList arrayList = new ArrayList(f10.size() + i10);
                    arrayList.addAll(f10);
                    g0Var = arrayList;
                } else if (f10 instanceof r1) {
                    g0 g0Var2 = new g0(f10.size() + i10);
                    g0Var2.addAll((r1) f10);
                    g0Var = g0Var2;
                } else if (!(f10 instanceof b1) || !(f10 instanceof a0.i)) {
                    return f10;
                } else {
                    a0.i iVar = (a0.i) f10;
                    if (iVar.B()) {
                        return f10;
                    }
                    i11 = iVar.i(f10.size() + i10);
                }
                s1.R(obj, j10, g0Var);
                return g0Var;
            }
            i11 = f10 instanceof h0 ? new g0(i10) : ((f10 instanceof b1) && (f10 instanceof a0.i)) ? ((a0.i) f10).i(i10) : new ArrayList<>(i10);
            s1.R(obj, j10, i11);
            return i11;
        }

        @Override // com.google.protobuf.i0
        void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) s1.C(obj, j10);
            if (list instanceof h0) {
                unmodifiableList = ((h0) list).w();
            } else if (f5994c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof b1) && (list instanceof a0.i)) {
                    a0.i iVar = (a0.i) list;
                    if (iVar.B()) {
                        iVar.m();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            s1.R(obj, j10, unmodifiableList);
        }

        @Override // com.google.protobuf.i0
        <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            s1.R(obj, j10, f10);
        }

        @Override // com.google.protobuf.i0
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends i0 {
        private c() {
            super();
        }

        static <E> a0.i<E> f(Object obj, long j10) {
            return (a0.i) s1.C(obj, j10);
        }

        @Override // com.google.protobuf.i0
        void c(Object obj, long j10) {
            f(obj, j10).m();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.i0
        <E> void d(Object obj, Object obj2, long j10) {
            a0.i<E> f10 = f(obj, j10);
            a0.i<E> f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            a0.i<E> iVar = f10;
            iVar = f10;
            if (size > 0 && size2 > 0) {
                boolean B = f10.B();
                a0.i<E> iVar2 = f10;
                if (!B) {
                    iVar2 = f10.i(size2 + size);
                }
                iVar2.addAll(f11);
                iVar = iVar2;
            }
            if (size > 0) {
                f11 = iVar;
            }
            s1.R(obj, j10, f11);
        }

        @Override // com.google.protobuf.i0
        <L> List<L> e(Object obj, long j10) {
            a0.i f10 = f(obj, j10);
            if (f10.B()) {
                return f10;
            }
            int size = f10.size();
            a0.i i10 = f10.i(size == 0 ? 10 : size * 2);
            s1.R(obj, j10, i10);
            return i10;
        }
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 a() {
        return f5992a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 b() {
        return f5993b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);
}
