package ca;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.work.b;
import c8.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import k0.b;
import k0.l;
import k0.t;
import k0.u;
import l8.k;
import q9.n;
import vn.hunghd.flutterdownloader.DownloadWorker;
import y8.s;
/* loaded from: classes.dex */
public final class g implements k.c, c8.a {

    /* renamed from: v  reason: collision with root package name */
    public static final a f3276v = new a(null);

    /* renamed from: n  reason: collision with root package name */
    private l8.k f3277n;

    /* renamed from: o  reason: collision with root package name */
    private j f3278o;

    /* renamed from: p  reason: collision with root package name */
    private Context f3279p;

    /* renamed from: q  reason: collision with root package name */
    private long f3280q;

    /* renamed from: r  reason: collision with root package name */
    private int f3281r;

    /* renamed from: s  reason: collision with root package name */
    private int f3282s;

    /* renamed from: t  reason: collision with root package name */
    private int f3283t;

    /* renamed from: u  reason: collision with root package name */
    private final Object f3284u = new Object();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }

    private final u a(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, boolean z15) {
        l b10 = new l.a(DownloadWorker.class).f(new b.a().c(z13).b(z15 ? k0.k.CONNECTED : k0.k.UNMETERED).a()).a("flutter_download_task").e(k0.a.EXPONENTIAL, 10L, TimeUnit.SECONDS).g(new b.a().h("url", str).h("saved_file", str2).h("file_name", str3).h("headers", str4).e("show_notification", z10).e("open_file_from_notification", z11).e("is_resume", z12).g("callback_handle", this.f3280q).f("step", this.f3281r).e("debug", this.f3282s == 1).e("ignoreSsl", this.f3283t == 1).e("save_in_public_storage", z14).f("timeout", i10).a()).b();
        k9.k.d(b10, "Builder(DownloadWorker::…   )\n            .build()");
        return b10;
    }

    private final void b(l8.j jVar, k.d dVar) {
        t.e(o()).b(UUID.fromString((String) n(jVar, "task_id")));
        dVar.a(null);
    }

    private final void c(k.d dVar) {
        t.e(o()).a("flutter_download_task");
        dVar.a(null);
    }

    private final void d(File file) {
        String[] strArr = {"_id"};
        String absolutePath = file.getAbsolutePath();
        k9.k.d(absolutePath, "file.absolutePath");
        String[] strArr2 = {absolutePath};
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        k9.k.d(uri, "EXTERNAL_CONTENT_URI");
        ContentResolver contentResolver = o().getContentResolver();
        k9.k.d(contentResolver, "requireContext().contentResolver");
        Cursor query = contentResolver.query(uri, strArr, "_data = ?", strArr2, null);
        if (query == null || !query.moveToFirst()) {
            Cursor query2 = contentResolver.query(uri, strArr, "_data = ?", strArr2, null);
            if (query2 != null && query2.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query2.getLong(query2.getColumnIndexOrThrow("_id")));
                k9.k.d(withAppendedId, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
                contentResolver.delete(withAppendedId, null, null);
            }
            if (query2 != null) {
                query2.close();
            }
        } else {
            Uri withAppendedId2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
            k9.k.d(withAppendedId2, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
            contentResolver.delete(withAppendedId2, null, null);
        }
        if (query == null) {
            return;
        }
        query.close();
    }

    private final void e(l8.j jVar, k.d dVar) {
        String str = (String) n(jVar, "url");
        String str2 = (String) n(jVar, "saved_dir");
        String str3 = (String) jVar.a("file_name");
        String str4 = (String) n(jVar, "headers");
        int intValue = ((Number) n(jVar, "timeout")).intValue();
        boolean booleanValue = ((Boolean) n(jVar, "show_notification")).booleanValue();
        boolean booleanValue2 = ((Boolean) n(jVar, "open_file_from_notification")).booleanValue();
        boolean booleanValue3 = ((Boolean) n(jVar, "requires_storage_not_low")).booleanValue();
        boolean booleanValue4 = ((Boolean) n(jVar, "save_in_public_storage")).booleanValue();
        boolean booleanValue5 = ((Boolean) n(jVar, "allow_cellular")).booleanValue();
        u a10 = a(str, str2, str3, str4, booleanValue, booleanValue2, false, booleanValue3, booleanValue4, intValue, booleanValue5);
        t.e(o()).d(a10);
        String uuid = a10.a().toString();
        k9.k.d(uuid, "request.id.toString()");
        dVar.a(uuid);
        ca.a aVar = ca.a.ENQUEUED;
        r(uuid, aVar, 0);
        j jVar2 = this.f3278o;
        k9.k.b(jVar2);
        jVar2.b(uuid, str, aVar, 0, str3, str2, str4, booleanValue, booleanValue2, booleanValue4, booleanValue5);
    }

    private final void f(l8.j jVar, k.d dVar) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Object obj = jVar.f11212b;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        long parseLong = Long.parseLong(String.valueOf(list.get(0)));
        this.f3282s = Integer.parseInt(String.valueOf(list.get(1)));
        this.f3283t = Integer.parseInt(String.valueOf(list.get(2)));
        Context context = this.f3279p;
        SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putLong = edit.putLong("callback_dispatcher_handle_key", parseLong)) != null) {
            putLong.apply();
        }
        dVar.a(null);
    }

    private final void g(k.d dVar) {
        j jVar = this.f3278o;
        k9.k.b(jVar);
        List<c> c10 = jVar.c();
        ArrayList arrayList = new ArrayList();
        for (c cVar : c10) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", cVar.m());
            hashMap.put("status", Integer.valueOf(cVar.l().ordinal()));
            hashMap.put("progress", Integer.valueOf(cVar.g()));
            hashMap.put("url", cVar.o());
            hashMap.put("file_name", cVar.b());
            hashMap.put("saved_dir", cVar.j());
            hashMap.put("time_created", Long.valueOf(cVar.n()));
            hashMap.put("allow_cellular", Boolean.valueOf(cVar.a()));
            arrayList.add(hashMap);
        }
        dVar.a(arrayList);
    }

    private final void h(l8.j jVar, k.d dVar) {
        j jVar2 = this.f3278o;
        k9.k.b(jVar2);
        List<c> e10 = jVar2.e((String) n(jVar, "query"));
        ArrayList arrayList = new ArrayList();
        for (c cVar : e10) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", cVar.m());
            hashMap.put("status", Integer.valueOf(cVar.l().ordinal()));
            hashMap.put("progress", Integer.valueOf(cVar.g()));
            hashMap.put("url", cVar.o());
            hashMap.put("file_name", cVar.b());
            hashMap.put("saved_dir", cVar.j());
            hashMap.put("time_created", Long.valueOf(cVar.n()));
            hashMap.put("allow_cellular", Boolean.valueOf(cVar.a()));
            arrayList.add(hashMap);
        }
        dVar.a(arrayList);
    }

    private final void i(Context context, l8.c cVar) {
        synchronized (this.f3284u) {
            if (this.f3277n != null) {
                return;
            }
            this.f3279p = context;
            l8.k kVar = new l8.k(cVar, "vn.hunghd/downloader");
            this.f3277n = kVar;
            kVar.e(this);
            this.f3278o = new j(k.f3288n.a(this.f3279p));
            s sVar = s.f17099a;
        }
    }

    private final void j(l8.j jVar, k.d dVar) {
        Boolean bool;
        int B;
        String str = (String) n(jVar, "task_id");
        j jVar2 = this.f3278o;
        k9.k.b(jVar2);
        c d10 = jVar2.d(str);
        if (d10 == null) {
            dVar.b("invalid_task_id", k9.k.j("not found task with id ", str), null);
        } else if (d10.l() != ca.a.COMPLETE) {
            dVar.b("invalid_status", "only completed tasks can be opened", null);
        } else {
            String o10 = d10.o();
            String j10 = d10.j();
            String b10 = d10.b();
            if (b10 == null) {
                B = n.B(o10, "/", 0, false, 6, null);
                b10 = o10.substring(B + 1, o10.length());
                k9.k.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Intent c10 = h.f3285a.c(o(), j10 + ((Object) File.separator) + ((Object) b10), d10.d());
            if (c10 != null) {
                o().startActivity(c10);
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            dVar.a(bool);
        }
    }

    private final void k(l8.j jVar, k.d dVar) {
        String str = (String) n(jVar, "task_id");
        j jVar2 = this.f3278o;
        k9.k.b(jVar2);
        jVar2.j(str, true);
        t.e(o()).b(UUID.fromString(str));
        dVar.a(null);
    }

    private final void l(l8.j jVar, k.d dVar) {
        Object obj = jVar.f11212b;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        this.f3280q = Long.parseLong(String.valueOf(list.get(0)));
        this.f3281r = Integer.parseInt(String.valueOf(list.get(1)));
        dVar.a(null);
    }

    private final void m(l8.j jVar, k.d dVar) {
        int B;
        String str = (String) n(jVar, "task_id");
        boolean booleanValue = ((Boolean) n(jVar, "should_delete_content")).booleanValue();
        j jVar2 = this.f3278o;
        k9.k.b(jVar2);
        c d10 = jVar2.d(str);
        if (d10 == null) {
            dVar.b("invalid_task_id", "not found task corresponding to given task id", null);
            return;
        }
        if (d10.l() == ca.a.ENQUEUED || d10.l() == ca.a.RUNNING) {
            t.e(o()).b(UUID.fromString(str));
        }
        if (booleanValue) {
            String b10 = d10.b();
            if (b10 == null) {
                String o10 = d10.o();
                B = n.B(d10.o(), "/", 0, false, 6, null);
                b10 = o10.substring(B + 1, d10.o().length());
                k9.k.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            File file = new File(d10.j() + ((Object) File.separator) + ((Object) b10));
            if (file.exists()) {
                d(file);
                file.delete();
            }
        }
        j jVar3 = this.f3278o;
        k9.k.b(jVar3);
        jVar3.a(str);
        androidx.core.app.n.f(o()).b(d10.f());
        dVar.a(null);
    }

    private final <T> T n(l8.j jVar, String str) {
        T t10 = (T) jVar.a(str);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(("Required key '" + str + "' was null").toString());
    }

    private final Context o() {
        Context context = this.f3279p;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void p(l8.j jVar, k.d dVar) {
        String str;
        String str2;
        int B;
        String str3 = (String) n(jVar, "task_id");
        j jVar2 = this.f3278o;
        k9.k.b(jVar2);
        c d10 = jVar2.d(str3);
        boolean booleanValue = ((Boolean) n(jVar, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) n(jVar, "timeout")).intValue();
        if (d10 == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else if (d10.l() == ca.a.PAUSED) {
            String b10 = d10.b();
            if (b10 == null) {
                String o10 = d10.o();
                B = n.B(d10.o(), "/", 0, false, 6, null);
                b10 = o10.substring(B + 1, d10.o().length());
                k9.k.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (new File(d10.j() + ((Object) File.separator) + ((Object) b10)).exists()) {
                u a10 = a(d10.o(), d10.j(), d10.b(), d10.c(), d10.k(), d10.e(), true, booleanValue, d10.i(), intValue, d10.a());
                String uuid = a10.a().toString();
                k9.k.d(uuid, "request.id.toString()");
                dVar.a(uuid);
                ca.a aVar = ca.a.RUNNING;
                r(uuid, aVar, d10.g());
                j jVar3 = this.f3278o;
                k9.k.b(jVar3);
                jVar3.h(str3, uuid, aVar, d10.g(), false);
                t.e(o()).d(a10);
                return;
            }
            j jVar4 = this.f3278o;
            k9.k.b(jVar4);
            jVar4.j(str3, false);
            str = "invalid_data";
            str2 = "not found partial downloaded data, this task cannot be resumed";
        } else {
            str = "invalid_status";
            str2 = "only paused task can be resumed";
        }
        dVar.b(str, str2, null);
    }

    private final void q(l8.j jVar, k.d dVar) {
        String str;
        String str2;
        String str3 = (String) n(jVar, "task_id");
        j jVar2 = this.f3278o;
        k9.k.b(jVar2);
        c d10 = jVar2.d(str3);
        boolean booleanValue = ((Boolean) n(jVar, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) n(jVar, "timeout")).intValue();
        if (d10 == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else if (d10.l() == ca.a.FAILED || d10.l() == ca.a.CANCELED) {
            u a10 = a(d10.o(), d10.j(), d10.b(), d10.c(), d10.k(), d10.e(), false, booleanValue, d10.i(), intValue, d10.a());
            String uuid = a10.a().toString();
            k9.k.d(uuid, "request.id.toString()");
            dVar.a(uuid);
            ca.a aVar = ca.a.ENQUEUED;
            r(uuid, aVar, d10.g());
            j jVar3 = this.f3278o;
            k9.k.b(jVar3);
            jVar3.h(str3, uuid, aVar, d10.g(), false);
            t.e(o()).d(a10);
            return;
        } else {
            str = "invalid_status";
            str2 = "only failed and canceled task can be retried";
        }
        dVar.b(str, str2, null);
    }

    private final void r(String str, ca.a aVar, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("task_id", str);
        hashMap.put("status", Integer.valueOf(aVar.ordinal()));
        hashMap.put("progress", Integer.valueOf(i10));
        l8.k kVar = this.f3277n;
        if (kVar == null) {
            return;
        }
        kVar.c("updateProgress", hashMap);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        Context a10 = bVar.a();
        l8.c b10 = bVar.b();
        k9.k.d(b10, "binding.binaryMessenger");
        i(a10, b10);
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        this.f3279p = null;
        l8.k kVar = this.f3277n;
        if (kVar != null) {
            kVar.e(null);
        }
        this.f3277n = null;
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, k.d dVar) {
        k9.k.e(jVar, "call");
        k9.k.e(dVar, "result");
        String str = jVar.f11211a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1594257912:
                    if (str.equals("enqueue")) {
                        e(jVar, dVar);
                        return;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        b(jVar, dVar);
                        return;
                    }
                    break;
                case -934610812:
                    if (str.equals("remove")) {
                        m(jVar, dVar);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        p(jVar, dVar);
                        return;
                    }
                    break;
                case -403218424:
                    if (str.equals("registerCallback")) {
                        l(jVar, dVar);
                        return;
                    }
                    break;
                case 3417674:
                    if (str.equals("open")) {
                        j(jVar, dVar);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        k(jVar, dVar);
                        return;
                    }
                    break;
                case 108405416:
                    if (str.equals("retry")) {
                        q(jVar, dVar);
                        return;
                    }
                    break;
                case 230377166:
                    if (str.equals("loadTasksWithRawQuery")) {
                        h(jVar, dVar);
                        return;
                    }
                    break;
                case 476547271:
                    if (str.equals("cancelAll")) {
                        c(dVar);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        f(jVar, dVar);
                        return;
                    }
                    break;
                case 1378870856:
                    if (str.equals("loadTasks")) {
                        g(dVar);
                        return;
                    }
                    break;
            }
        }
        dVar.c();
    }
}
