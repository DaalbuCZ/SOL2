package com.google.firebase.perf.application;

import a7.g;
import a7.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import v6.f;
import z6.k;
/* loaded from: classes.dex */
public class c extends i.a {

    /* renamed from: f  reason: collision with root package name */
    private static final u6.a f5674f = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Fragment, Trace> f5675a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final a7.a f5676b;

    /* renamed from: c  reason: collision with root package name */
    private final k f5677c;

    /* renamed from: d  reason: collision with root package name */
    private final a f5678d;

    /* renamed from: e  reason: collision with root package name */
    private final d f5679e;

    public c(a7.a aVar, k kVar, a aVar2, d dVar) {
        this.f5676b = aVar;
        this.f5677c = kVar;
        this.f5678d = aVar2;
        this.f5679e = dVar;
    }

    @Override // androidx.fragment.app.i.a
    public void f(i iVar, Fragment fragment) {
        super.f(iVar, fragment);
        u6.a aVar = f5674f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f5675a.containsKey(fragment)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f5675a.get(fragment);
        this.f5675a.remove(fragment);
        g<f.a> f10 = this.f5679e.f(fragment);
        if (!f10.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        j.a(trace, f10.c());
        trace.stop();
    }

    @Override // androidx.fragment.app.i.a
    public void i(i iVar, Fragment fragment) {
        super.i(iVar, fragment);
        f5674f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.f5677c, this.f5676b, this.f5678d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.C() == null ? "No parent" : fragment.C().getClass().getSimpleName());
        if (fragment.l() != null) {
            trace.putAttribute("Hosting_activity", fragment.l().getClass().getSimpleName());
        }
        this.f5675a.put(fragment, trace);
        this.f5679e.d(fragment);
    }

    public String o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
