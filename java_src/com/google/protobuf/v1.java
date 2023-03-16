package com.google.protobuf;

import com.google.protobuf.l0;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
interface v1 {

    /* loaded from: classes.dex */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i10, long j10);

    a B();

    void C(int i10, long j10);

    void D(int i10, float f10);

    void E(int i10, List<String> list);

    @Deprecated
    void F(int i10);

    void G(int i10, String str);

    void H(int i10, List<Integer> list, boolean z10);

    void I(int i10, long j10);

    void J(int i10, int i11);

    void K(int i10, List<Long> list, boolean z10);

    void L(int i10, List<Integer> list, boolean z10);

    void M(int i10, List<Double> list, boolean z10);

    void N(int i10, int i11);

    void O(int i10, List<h> list);

    void a(int i10, List<?> list, h1 h1Var);

    @Deprecated
    void b(int i10, List<?> list, h1 h1Var);

    void c(int i10, List<Integer> list, boolean z10);

    void d(int i10, List<Float> list, boolean z10);

    void e(int i10, long j10);

    void f(int i10, boolean z10);

    void g(int i10, int i11);

    void h(int i10, Object obj);

    @Deprecated
    void i(int i10, Object obj, h1 h1Var);

    void j(int i10, int i11);

    @Deprecated
    void k(int i10);

    void l(int i10, h hVar);

    void m(int i10, int i11);

    void n(int i10, List<Long> list, boolean z10);

    void o(int i10, List<Integer> list, boolean z10);

    void p(int i10, int i11);

    void q(int i10, double d10);

    void r(int i10, long j10);

    void s(int i10, List<Long> list, boolean z10);

    void t(int i10, List<Integer> list, boolean z10);

    void u(int i10, List<Long> list, boolean z10);

    void v(int i10, List<Boolean> list, boolean z10);

    void w(int i10, Object obj, h1 h1Var);

    <K, V> void x(int i10, l0.a<K, V> aVar, Map<K, V> map);

    void y(int i10, List<Integer> list, boolean z10);

    void z(int i10, List<Long> list, boolean z10);
}
