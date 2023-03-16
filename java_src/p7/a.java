package p7;

import android.os.Environment;
import c8.a;
import l8.j;
import l8.k;
/* loaded from: classes.dex */
public final class a implements c8.a, k.c {

    /* renamed from: n  reason: collision with root package name */
    private k f12467n;

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k9.k.e(bVar, "flutterPluginBinding");
        k kVar = new k(bVar.b(), "android_path_provider");
        this.f12467n = kVar;
        kVar.e(this);
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        k kVar = this.f12467n;
        if (kVar == null) {
            k9.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        String str;
        k9.k.e(jVar, "call");
        k9.k.e(dVar, "result");
        if (k9.k.a(jVar.f11211a, "getAlarmsPath")) {
            str = Environment.DIRECTORY_ALARMS;
        } else if (k9.k.a(jVar.f11211a, "getDCIMPath")) {
            str = Environment.DIRECTORY_DCIM;
        } else if (k9.k.a(jVar.f11211a, "getDocumentsPath")) {
            str = Environment.DIRECTORY_DOCUMENTS;
        } else if (k9.k.a(jVar.f11211a, "getDownloadsPath")) {
            str = Environment.DIRECTORY_DOWNLOADS;
        } else if (k9.k.a(jVar.f11211a, "getMoviesPath")) {
            str = Environment.DIRECTORY_MOVIES;
        } else if (k9.k.a(jVar.f11211a, "getMusicPath")) {
            str = Environment.DIRECTORY_MUSIC;
        } else if (k9.k.a(jVar.f11211a, "getNotificationsPath")) {
            str = Environment.DIRECTORY_NOTIFICATIONS;
        } else if (k9.k.a(jVar.f11211a, "getPicturesPath")) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (k9.k.a(jVar.f11211a, "getPodcastsPath")) {
            str = Environment.DIRECTORY_PODCASTS;
        } else if (!k9.k.a(jVar.f11211a, "getRingtonesPath")) {
            dVar.c();
            return;
        } else {
            str = Environment.DIRECTORY_RINGTONES;
        }
        dVar.a(Environment.getExternalStoragePublicDirectory(str).getAbsolutePath());
    }
}
