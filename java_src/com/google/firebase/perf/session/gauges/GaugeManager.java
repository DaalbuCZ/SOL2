package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b7.g;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k5.x;
@Keep
/* loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private b7.d applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final x<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final x<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final x<l> memoryGaugeCollector;
    private String sessionId;
    private final z6.k transportManager;
    private static final u6.a logger = u6.a.e();
    private static final GaugeManager instance = new GaugeManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5759a;

        static {
            int[] iArr = new int[b7.d.values().length];
            f5759a = iArr;
            try {
                iArr[b7.d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5759a[b7.d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new x(f.f5774a), z6.k.k(), com.google.firebase.perf.config.a.g(), null, new x(d.f5772a), new x(e.f5773a));
    }

    GaugeManager(x<ScheduledExecutorService> xVar, z6.k kVar, com.google.firebase.perf.config.a aVar, i iVar, x<c> xVar2, x<l> xVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = b7.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = xVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = xVar2;
        this.memoryGaugeCollector = xVar3;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, a7.l lVar2) {
        cVar.c(lVar2);
        lVar.c(lVar2);
    }

    private long getCpuGaugeCollectionFrequencyMs(b7.d dVar) {
        int i10 = a.f5759a[dVar.ordinal()];
        long z10 = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.z() : this.configResolver.y();
        return c.f(z10) ? INVALID_GAUGE_COLLECTION_FREQUENCY : z10;
    }

    private b7.f getGaugeMetadata() {
        return b7.f.X().L(this.gaugeMetadataManager.a()).M(this.gaugeMetadataManager.b()).N(this.gaugeMetadataManager.c()).a();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(b7.d dVar) {
        int i10 = a.f5759a[dVar.ordinal()];
        long C = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.C() : this.configResolver.B();
        return l.e(C) ? INVALID_GAUGE_COLLECTION_FREQUENCY : C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$0() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$new$1() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j10, a7.l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().k(j10, lVar);
        return true;
    }

    private long startCollectingGauges(b7.d dVar, a7.l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar) ? cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }

    private boolean startCollectingMemoryMetrics(long j10, a7.l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().j(j10, lVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, b7.d dVar) {
        g.b g02 = b7.g.g0();
        while (!this.cpuGaugeCollector.get().f5766a.isEmpty()) {
            g02.M(this.cpuGaugeCollector.get().f5766a.poll());
        }
        while (!this.memoryGaugeCollector.get().f5792b.isEmpty()) {
            g02.L(this.memoryGaugeCollector.get().f5792b.poll());
        }
        g02.O(str);
        this.transportManager.A(g02.a(), dVar);
    }

    public void collectGaugeMetricOnce(a7.l lVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), lVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, b7.d dVar) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.A(b7.g.g0().O(str).N(getGaugeMetadata()).a(), dVar);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(y6.a aVar, final b7.d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, aVar.d());
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String j10 = aVar.j();
        this.sessionId = j10;
        this.applicationProcessState = dVar;
        try {
            long j11 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.g
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$2(j10, dVar);
                }
            }, j11, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            u6.a aVar2 = logger;
            aVar2.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final b7.d dVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().l();
        this.memoryGaugeCollector.get().k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.lambda$stopCollectingGauges$3(str, dVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = b7.d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }
}
