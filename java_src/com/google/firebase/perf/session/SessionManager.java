package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b7.d;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@Keep
/* loaded from: classes.dex */
public class SessionManager extends b {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<y6.b>> clients;
    private final GaugeManager gaugeManager;
    private y6.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), y6.a.c(), a.b());
    }

    public SessionManager(GaugeManager gaugeManager, y6.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, y6.a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.f()) {
            this.gaugeManager.logGaugeMetadata(aVar.j(), d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.j(), dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (dVar == d.FOREGROUND) {
            updatePerfSession(dVar);
        } else if (updatePerfSessionIfExpired()) {
        } else {
            startOrStopCollectingGauges(dVar);
        }
    }

    public final y6.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<y6.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final y6.a aVar = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: y6.c
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.this.lambda$setApplicationContext$0(context, aVar);
            }
        });
    }

    public void setPerfSession(y6.a aVar) {
        this.perfSession = aVar;
    }

    public void unregisterForSessionUpdates(WeakReference<y6.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(d dVar) {
        synchronized (this.clients) {
            this.perfSession = y6.a.c();
            Iterator<WeakReference<y6.b>> it = this.clients.iterator();
            while (it.hasNext()) {
                y6.b bVar = it.next().get();
                if (bVar != null) {
                    bVar.a(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    public boolean updatePerfSessionIfExpired() {
        if (this.perfSession.e()) {
            updatePerfSession(this.appStateMonitor.a());
            return true;
        }
        return false;
    }
}
