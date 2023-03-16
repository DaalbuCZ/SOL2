package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import l8.j;
import l8.k;
import l8.m;
import l8.p;
/* loaded from: classes.dex */
public class e implements m, p {

    /* renamed from: n  reason: collision with root package name */
    final String f9036n;

    /* renamed from: o  reason: collision with root package name */
    private final Activity f9037o;

    /* renamed from: p  reason: collision with root package name */
    final File f9038p;

    /* renamed from: q  reason: collision with root package name */
    private final io.flutter.plugins.imagepicker.g f9039q;

    /* renamed from: r  reason: collision with root package name */
    private final io.flutter.plugins.imagepicker.d f9040r;

    /* renamed from: s  reason: collision with root package name */
    private final g f9041s;

    /* renamed from: t  reason: collision with root package name */
    private final InterfaceC0137e f9042t;

    /* renamed from: u  reason: collision with root package name */
    private final io.flutter.plugins.imagepicker.c f9043u;

    /* renamed from: v  reason: collision with root package name */
    private io.flutter.plugins.imagepicker.a f9044v;

    /* renamed from: w  reason: collision with root package name */
    private Uri f9045w;

    /* renamed from: x  reason: collision with root package name */
    private k.d f9046x;

    /* renamed from: y  reason: collision with root package name */
    private j f9047y;

    /* loaded from: classes.dex */
    class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f9048a;

        a(Activity activity) {
            this.f9048a = activity;
        }

        @Override // io.flutter.plugins.imagepicker.e.g
        public void a(String str, int i10) {
            androidx.core.app.b.s(this.f9048a, new String[]{str}, i10);
        }

        @Override // io.flutter.plugins.imagepicker.e.g
        public boolean b(String str) {
            return androidx.core.content.a.a(this.f9048a, str) == 0;
        }

        @Override // io.flutter.plugins.imagepicker.e.g
        public boolean c() {
            return io.flutter.plugins.imagepicker.f.b(this.f9048a);
        }
    }

    /* loaded from: classes.dex */
    class b implements InterfaceC0137e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f9049a;

        /* loaded from: classes.dex */
        class a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f9050a;

            a(f fVar) {
                this.f9050a = fVar;
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                this.f9050a.a(str);
            }
        }

        b(Activity activity) {
            this.f9049a = activity;
        }

        @Override // io.flutter.plugins.imagepicker.e.InterfaceC0137e
        public Uri a(String str, File file) {
            return androidx.core.content.b.f(this.f9049a, str, file);
        }

        @Override // io.flutter.plugins.imagepicker.e.InterfaceC0137e
        public void b(Uri uri, f fVar) {
            Activity activity = this.f9049a;
            String[] strArr = new String[1];
            strArr[0] = uri != null ? uri.getPath() : "";
            MediaScannerConnection.scanFile(activity, strArr, null, new a(fVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements f {
        c() {
        }

        @Override // io.flutter.plugins.imagepicker.e.f
        public void a(String str) {
            e.this.v(str, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements f {
        d() {
        }

        @Override // io.flutter.plugins.imagepicker.e.f
        public void a(String str) {
            e.this.x(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.imagepicker.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0137e {
        Uri a(String str, File file);

        void b(Uri uri, f fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a(String str, int i10);

        boolean b(String str);

        boolean c();
    }

    public e(Activity activity, File file, io.flutter.plugins.imagepicker.g gVar, io.flutter.plugins.imagepicker.d dVar) {
        this(activity, file, gVar, null, null, dVar, new a(activity), new b(activity), new io.flutter.plugins.imagepicker.c());
    }

    e(Activity activity, File file, io.flutter.plugins.imagepicker.g gVar, k.d dVar, j jVar, io.flutter.plugins.imagepicker.d dVar2, g gVar2, InterfaceC0137e interfaceC0137e, io.flutter.plugins.imagepicker.c cVar) {
        this.f9037o = activity;
        this.f9038p = file;
        this.f9039q = gVar;
        this.f9036n = activity.getPackageName() + ".flutter.image_provider";
        this.f9046x = dVar;
        this.f9047y = jVar;
        this.f9041s = gVar2;
        this.f9042t = interfaceC0137e;
        this.f9043u = cVar;
        this.f9040r = dVar2;
    }

    private void A() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("video/*");
        this.f9037o.startActivityForResult(intent, 2352);
    }

    private void B() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f9044v == io.flutter.plugins.imagepicker.a.FRONT) {
            K(intent);
        }
        File i10 = i();
        this.f9045w = Uri.parse("file:" + i10.getAbsolutePath());
        Uri a10 = this.f9042t.a(this.f9036n, i10);
        intent.putExtra("output", a10);
        p(intent, a10);
        try {
            try {
                this.f9037o.startActivityForResult(intent, 2343);
            } catch (ActivityNotFoundException unused) {
                i10.delete();
                l("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e10) {
            e10.printStackTrace();
            l("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private void C() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        j jVar = this.f9047y;
        if (jVar != null && jVar.a("maxDuration") != null) {
            intent.putExtra("android.intent.extra.durationLimit", ((Integer) this.f9047y.a("maxDuration")).intValue());
        }
        if (this.f9044v == io.flutter.plugins.imagepicker.a.FRONT) {
            K(intent);
        }
        File j10 = j();
        this.f9045w = Uri.parse("file:" + j10.getAbsolutePath());
        Uri a10 = this.f9042t.a(this.f9036n, j10);
        intent.putExtra("output", a10);
        p(intent, a10);
        try {
            try {
                this.f9037o.startActivityForResult(intent, 2353);
            } catch (ActivityNotFoundException unused) {
                j10.delete();
                l("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e10) {
            e10.printStackTrace();
            l("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private boolean D() {
        g gVar = this.f9041s;
        if (gVar == null) {
            return false;
        }
        return gVar.c();
    }

    private boolean H(j jVar, k.d dVar) {
        if (this.f9046x != null) {
            return false;
        }
        this.f9047y = jVar;
        this.f9046x = dVar;
        this.f9040r.a();
        return true;
    }

    private void K(Intent intent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 22) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            return;
        }
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i10 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    private void g() {
        this.f9047y = null;
        this.f9046x = null;
    }

    private File h(String str) {
        String uuid = UUID.randomUUID().toString();
        try {
            this.f9038p.mkdirs();
            return File.createTempFile(uuid, str, this.f9038p);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File i() {
        return h(".jpg");
    }

    private File j() {
        return h(".mp4");
    }

    private void k(k.d dVar) {
        dVar.b("already_active", "Image picker is already active", null);
    }

    private void l(String str, String str2) {
        k.d dVar = this.f9046x;
        if (dVar == null) {
            this.f9040r.f(null, str, str2);
            return;
        }
        dVar.b(str, str2, null);
        g();
    }

    private void m(ArrayList<String> arrayList) {
        k.d dVar = this.f9046x;
        if (dVar == null) {
            this.f9040r.f(arrayList, null, null);
            return;
        }
        dVar.a(arrayList);
        g();
    }

    private void n(String str) {
        k.d dVar = this.f9046x;
        if (dVar != null) {
            dVar.a(str);
            g();
        } else if (str != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            this.f9040r.f(arrayList, null, null);
        }
    }

    private String o(String str) {
        return this.f9039q.h(str, (Double) this.f9047y.a("maxWidth"), (Double) this.f9047y.a("maxHeight"), (Integer) this.f9047y.a("imageQuality"));
    }

    private void p(Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : this.f9037o.getPackageManager().queryIntentActivities(intent, 65536)) {
            this.f9037o.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    private void q(int i10) {
        if (i10 != -1) {
            n(null);
            return;
        }
        InterfaceC0137e interfaceC0137e = this.f9042t;
        Uri uri = this.f9045w;
        if (uri == null) {
            uri = Uri.parse(this.f9040r.c());
        }
        interfaceC0137e.b(uri, new c());
    }

    private void r(int i10) {
        if (i10 != -1) {
            n(null);
            return;
        }
        InterfaceC0137e interfaceC0137e = this.f9042t;
        Uri uri = this.f9045w;
        if (uri == null) {
            uri = Uri.parse(this.f9040r.c());
        }
        interfaceC0137e.b(uri, new d());
    }

    private void s(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            n(null);
        } else {
            v(this.f9043u.d(this.f9037o, intent.getData()), false);
        }
    }

    private void t(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            n(null);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (intent.getClipData() != null) {
            for (int i11 = 0; i11 < intent.getClipData().getItemCount(); i11++) {
                arrayList.add(this.f9043u.d(this.f9037o, intent.getClipData().getItemAt(i11).getUri()));
            }
        } else {
            arrayList.add(this.f9043u.d(this.f9037o, intent.getData()));
        }
        w(arrayList, false);
    }

    private void u(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            n(null);
        } else {
            x(this.f9043u.d(this.f9037o, intent.getData()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, boolean z10) {
        if (this.f9047y == null) {
            n(str);
            return;
        }
        String o10 = o(str);
        if (o10 != null && !o10.equals(str) && z10) {
            new File(str).delete();
        }
        n(o10);
    }

    private void w(ArrayList<String> arrayList, boolean z10) {
        if (this.f9047y == null) {
            m(arrayList);
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String o10 = o(arrayList.get(i10));
            if (o10 != null && !o10.equals(arrayList.get(i10)) && z10) {
                new File(arrayList.get(i10)).delete();
            }
            arrayList2.add(i10, o10);
        }
        m(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(String str) {
        n(str);
    }

    private void y() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (Build.VERSION.SDK_INT >= 18) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        intent.setType("image/*");
        this.f9037o.startActivityForResult(intent, 2346);
    }

    private void z() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        this.f9037o.startActivityForResult(intent, 2342);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(k.d dVar) {
        Map<String, Object> b10 = this.f9040r.b();
        ArrayList arrayList = (ArrayList) b10.get("pathList");
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.f9039q.h((String) it.next(), (Double) b10.get("maxWidth"), (Double) b10.get("maxHeight"), Integer.valueOf(b10.get("imageQuality") == null ? 100 : ((Integer) b10.get("imageQuality")).intValue())));
            }
            b10.put("pathList", arrayList2);
            b10.put("path", arrayList2.get(arrayList2.size() - 1));
        }
        if (b10.isEmpty()) {
            b10 = null;
        }
        dVar.a(b10);
        this.f9040r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        j jVar = this.f9047y;
        if (jVar == null) {
            return;
        }
        this.f9040r.g(jVar.f11211a);
        this.f9040r.d(this.f9047y);
        Uri uri = this.f9045w;
        if (uri != null) {
            this.f9040r.e(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(io.flutter.plugins.imagepicker.a aVar) {
        this.f9044v = aVar;
    }

    public void I(j jVar, k.d dVar) {
        if (!H(jVar, dVar)) {
            k(dVar);
        } else if (!D() || this.f9041s.b("android.permission.CAMERA")) {
            B();
        } else {
            this.f9041s.a("android.permission.CAMERA", 2345);
        }
    }

    public void J(j jVar, k.d dVar) {
        if (!H(jVar, dVar)) {
            k(dVar);
        } else if (!D() || this.f9041s.b("android.permission.CAMERA")) {
            C();
        } else {
            this.f9041s.a("android.permission.CAMERA", 2355);
        }
    }

    @Override // l8.m
    public boolean a(int i10, int i11, Intent intent) {
        if (i10 == 2342) {
            s(i11, intent);
            return true;
        } else if (i10 == 2343) {
            q(i11);
            return true;
        } else if (i10 == 2346) {
            t(i11, intent);
            return true;
        } else if (i10 == 2352) {
            u(i11, intent);
            return true;
        } else if (i10 != 2353) {
            return false;
        } else {
            r(i11);
            return true;
        }
    }

    public void d(j jVar, k.d dVar) {
        if (H(jVar, dVar)) {
            z();
        } else {
            k(dVar);
        }
    }

    public void e(j jVar, k.d dVar) {
        if (H(jVar, dVar)) {
            y();
        } else {
            k(dVar);
        }
    }

    public void f(j jVar, k.d dVar) {
        if (H(jVar, dVar)) {
            A();
        } else {
            k(dVar);
        }
    }

    @Override // l8.p
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 != 2345) {
            if (i10 != 2355) {
                return false;
            }
            if (z10) {
                C();
            }
        } else if (z10) {
            B();
        }
        if (!z10 && (i10 == 2345 || i10 == 2355)) {
            l("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }
}
