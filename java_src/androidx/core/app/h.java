package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f1180a;

    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private static HandlerThread f1181e;

        /* renamed from: f  reason: collision with root package name */
        private static Handler f1182f;

        /* renamed from: a  reason: collision with root package name */
        int f1183a;

        /* renamed from: b  reason: collision with root package name */
        SparseIntArray[] f1184b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f1185c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f1186d = new Window$OnFrameMetricsAvailableListenerC0017a();

        /* renamed from: androidx.core.app.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class Window$OnFrameMetricsAvailableListenerC0017a implements Window.OnFrameMetricsAvailableListener {
            Window$OnFrameMetricsAvailableListenerC0017a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f1183a & 1) != 0) {
                    aVar.e(aVar.f1184b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f1183a & 2) != 0) {
                    aVar2.e(aVar2.f1184b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f1183a & 4) != 0) {
                    aVar3.e(aVar3.f1184b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f1183a & 8) != 0) {
                    aVar4.e(aVar4.f1184b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f1183a & 16) != 0) {
                    aVar5.e(aVar5.f1184b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f1183a & 64) != 0) {
                    aVar6.e(aVar6.f1184b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f1183a & 32) != 0) {
                    aVar7.e(aVar7.f1184b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f1183a & 128) != 0) {
                    aVar8.e(aVar8.f1184b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f1183a & 256) != 0) {
                    aVar9.e(aVar9.f1184b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f1183a = i10;
        }

        @Override // androidx.core.app.h.b
        public void a(Activity activity) {
            if (f1181e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f1181e = handlerThread;
                handlerThread.start();
                f1182f = new Handler(f1181e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f1184b;
                if (sparseIntArrayArr[i10] == null && (this.f1183a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f1186d, f1182f);
            this.f1185c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.h.b
        public SparseIntArray[] b() {
            return this.f1184b;
        }

        @Override // androidx.core.app.h.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f1185c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f1185c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f1186d);
            return this.f1184b;
        }

        @Override // androidx.core.app.h.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f1184b;
            this.f1184b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }
    }

    public h() {
        this(1);
    }

    public h(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1180a = new a(i10);
        } else {
            this.f1180a = new b();
        }
    }

    public void a(Activity activity) {
        this.f1180a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f1180a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f1180a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f1180a.d();
    }
}
