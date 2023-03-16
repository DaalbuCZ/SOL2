package io.flutter.plugins;

import androidx.annotation.Keep;
import ca.g;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.mr.flutter.plugin.filepicker.FilePickerPlugin;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.firebase.core.i;
import io.flutter.plugins.firebase.crashlytics.n;
import io.flutter.plugins.firebase.messaging.e;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.webviewflutter.o3;
import o8.m;
import q8.j;
import t7.f;
import u8.c;
import v8.t;
import x7.b;
@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.o().g(new p7.a());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin android_path_provider, com.mix1009.android_path_provider.AndroidPathProviderPlugin", e10);
        }
        try {
            aVar.o().g(new a1.a());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin better_open_file, com.crazecoder.openfile.OpenFilePlugin", e11);
        }
        try {
            aVar.o().g(new f());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e12);
        }
        try {
            aVar.o().g(new u7.a());
        } catch (Exception e13) {
            b.c(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e13);
        }
        try {
            aVar.o().g(new FilePickerPlugin());
        } catch (Exception e14) {
            b.c(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e14);
        }
        try {
            aVar.o().g(new m());
        } catch (Exception e15) {
            b.c(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e15);
        }
        try {
            aVar.o().g(new i());
        } catch (Exception e16) {
            b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e16);
        }
        try {
            aVar.o().g(new n());
        } catch (Exception e17) {
            b.c(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e17);
        }
        try {
            aVar.o().g(new e());
        } catch (Exception e18) {
            b.c(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e18);
        }
        try {
            aVar.o().g(new j());
        } catch (Exception e19) {
            b.c(TAG, "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin", e19);
        }
        try {
            aVar.o().g(new x0.a());
        } catch (Exception e20) {
            b.c(TAG, "Error registering plugin flutter_bugfender, com.bugfender.flutterbugfender.FlutterBugfenderPlugin", e20);
        }
        try {
            aVar.o().g(new g());
        } catch (Exception e21) {
            b.c(TAG, "Error registering plugin flutter_downloader, vn.hunghd.flutterdownloader.FlutterDownloaderPlugin", e21);
        }
        try {
            aVar.o().g(new o7.a());
        } catch (Exception e22) {
            b.c(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e22);
        }
        try {
            aVar.o().g(new FlutterLocalNotificationsPlugin());
        } catch (Exception e23) {
            b.c(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e23);
        }
        try {
            aVar.o().g(new x9.a());
        } catch (Exception e24) {
            b.c(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e24);
        }
        try {
            aVar.o().g(new r8.a());
        } catch (Exception e25) {
            b.c(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e25);
        }
        try {
            aVar.o().g(new ImagePickerPlugin());
        } catch (Exception e26) {
            b.c(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e26);
        }
        try {
            aVar.o().g(new s7.e());
        } catch (Exception e27) {
            b.c(TAG, "Error registering plugin in_app_update, de.ffuf.in_app_update.InAppUpdatePlugin", e27);
        }
        try {
            aVar.o().g(new v7.a());
        } catch (Exception e28) {
            b.c(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e28);
        }
        try {
            aVar.o().g(new s8.i());
        } catch (Exception e29) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e29);
        }
        try {
            aVar.o().g(new v0.m());
        } catch (Exception e30) {
            b.c(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e30);
        }
        try {
            aVar.o().g(new t8.b());
        } catch (Exception e31) {
            b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e31);
        }
        try {
            aVar.o().g(new w7.a());
        } catch (Exception e32) {
            b.c(TAG, "Error registering plugin sqlcipher_flutter_libs, eu.simonbinder.sqlite3_flutter_libs.Sqlite3FlutterLibsPlugin", e32);
        }
        try {
            aVar.o().g(new c());
        } catch (Exception e33) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e33);
        }
        try {
            aVar.o().g(new t());
        } catch (Exception e34) {
            b.c(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e34);
        }
        try {
            aVar.o().g(new q7.g());
        } catch (Exception e35) {
            b.c(TAG, "Error registering plugin wakelock, creativemaybeno.wakelock.WakelockPlugin", e35);
        }
        try {
            aVar.o().g(new o3());
        } catch (Exception e36) {
            b.c(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e36);
        }
    }
}
