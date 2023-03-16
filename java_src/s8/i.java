package s8;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import c8.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import s8.h;
/* loaded from: classes.dex */
public class i implements c8.a, h.a {

    /* renamed from: n  reason: collision with root package name */
    private Context f14410n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14411a;

        static {
            int[] iArr = new int[h.c.values().length];
            f14411a = iArr;
            try {
                iArr[h.c.root.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14411a[h.c.music.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14411a[h.c.podcasts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14411a[h.c.ringtones.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14411a[h.c.alarms.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14411a[h.c.notifications.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14411a[h.c.pictures.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14411a[h.c.movies.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14411a[h.c.downloads.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14411a[h.c.dcim.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14411a[h.c.documents.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private String g() {
        return w8.b.d(this.f14410n);
    }

    private String h() {
        return w8.b.c(this.f14410n);
    }

    private List<String> i() {
        File[] externalCacheDirs;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f14410n.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f14410n.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> j(h.c cVar) {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f14410n.getExternalFilesDirs(m(cVar))) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f14410n.getExternalFilesDir(m(cVar));
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String k() {
        File externalFilesDir = this.f14410n.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String l() {
        return this.f14410n.getCacheDir().getPath();
    }

    private String m(h.c cVar) {
        switch (a.f14411a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    private void n(l8.c cVar, Context context) {
        cVar.b();
        try {
            g.n(cVar, this);
        } catch (Exception e10) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e10);
        }
        this.f14410n = context;
    }

    @Override // s8.h.a
    public String a() {
        return l();
    }

    @Override // s8.h.a
    public String b() {
        return h();
    }

    @Override // s8.h.a
    public List<String> c() {
        return i();
    }

    @Override // s8.h.a
    public String d() {
        return g();
    }

    @Override // s8.h.a
    public List<String> e(h.c cVar) {
        return j(cVar);
    }

    @Override // s8.h.a
    public String f() {
        return k();
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        n(bVar.b(), bVar.a());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        g.n(bVar.b(), null);
    }
}
