package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Keep
/* loaded from: classes.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    t4.i<Void> didReinitializeFirebaseCore();

    t4.i<Map<String, Object>> getPluginConstantsForFirebaseApp(f5.e eVar);
}
