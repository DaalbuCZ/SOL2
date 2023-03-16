package com.google.firebase.perf.application;

import a7.g;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.h;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import v6.f;
/* loaded from: classes.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    private static final u6.a f5680e = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Activity f5681a;

    /* renamed from: b  reason: collision with root package name */
    private final h f5682b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Fragment, f.a> f5683c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5684d;

    public d(Activity activity) {
        this(activity, new h(), new HashMap());
    }

    d(Activity activity, h hVar, Map<Fragment, f.a> map) {
        this.f5684d = false;
        this.f5681a = activity;
        this.f5682b = hVar;
        this.f5683c = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return true;
    }

    private g<f.a> b() {
        if (!this.f5684d) {
            f5680e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] b10 = this.f5682b.b();
        if (b10 == null) {
            f5680e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        } else if (b10[0] == null) {
            f5680e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return g.a();
        } else {
            return g.e(f.a(b10));
        }
    }

    public void c() {
        if (this.f5684d) {
            f5680e.b("FrameMetricsAggregator is already recording %s", this.f5681a.getClass().getSimpleName());
            return;
        }
        this.f5682b.a(this.f5681a);
        this.f5684d = true;
    }

    public void d(Fragment fragment) {
        if (!this.f5684d) {
            f5680e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f5683c.containsKey(fragment)) {
            f5680e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            g<f.a> b10 = b();
            if (b10.d()) {
                this.f5683c.put(fragment, b10.c());
            } else {
                f5680e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            }
        }
    }

    public g<f.a> e() {
        if (!this.f5684d) {
            f5680e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f5683c.isEmpty()) {
            f5680e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f5683c.clear();
        }
        g<f.a> b10 = b();
        try {
            this.f5682b.c(this.f5681a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f5680e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            b10 = g.a();
        }
        this.f5682b.d();
        this.f5684d = false;
        return b10;
    }

    public g<f.a> f(Fragment fragment) {
        if (!this.f5684d) {
            f5680e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        } else if (!this.f5683c.containsKey(fragment)) {
            f5680e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        } else {
            f.a remove = this.f5683c.remove(fragment);
            g<f.a> b10 = b();
            if (b10.d()) {
                return g.e(b10.c().a(remove));
            }
            f5680e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return g.a();
        }
    }
}
