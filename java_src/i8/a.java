package i8;

import io.flutter.plugins.GeneratedPluginRegistrant;
import x7.b;
/* loaded from: classes.dex */
public class a {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.a.class).invoke(null, aVar);
        } catch (Exception e10) {
            b.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            b.c("GeneratedPluginsRegister", "Received exception while registering", e10);
        }
    }
}
