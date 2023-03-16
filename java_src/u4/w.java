package u4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import v4.f0;
/* loaded from: classes.dex */
final class w {

    /* renamed from: e  reason: collision with root package name */
    private static final v4.s f15450e = new v4.s("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    private static final Intent f15451f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    v4.d0 f15452a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15453b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f15454c;

    /* renamed from: d  reason: collision with root package name */
    private final y f15455d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Context context, y yVar) {
        this.f15453b = context.getPackageName();
        this.f15454c = context;
        this.f15455d = yVar;
        if (v4.c.a(context)) {
            this.f15452a = new v4.d0(f0.a(context), f15450e, "AppUpdateService", f15451f, q.f15438a, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Bundle b(w wVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(wVar.f15454c.getPackageManager().getPackageInfo(wVar.f15454c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f15450e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ a f(w wVar, Bundle bundle, String str) {
        int i10 = bundle.getInt("version.code", -1);
        int i11 = bundle.getInt("update.availability");
        int i12 = bundle.getInt("install.status", 0);
        Integer valueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", k(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap.put("nonblocking.destructive.intent", k(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap.put("blocking.intent", k(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap.put("nonblocking.intent", k(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return a.j(str, i10, i11, i12, valueOf, bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), wVar.f15455d.a(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent"), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putAll(v4.o.a("app_update"));
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static t4.i j() {
        f15450e.b("onError(%d)", -9);
        return t4.l.d(new x4.a(-9));
    }

    private static HashSet k(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final t4.i d(String str) {
        if (this.f15452a == null) {
            return j();
        }
        f15450e.d("completeUpdate(%s)", str);
        t4.j jVar = new t4.j();
        this.f15452a.p(new s(this, jVar, jVar, str), jVar);
        return jVar.a();
    }

    public final t4.i e(String str) {
        if (this.f15452a == null) {
            return j();
        }
        f15450e.d("requestUpdateInfo(%s)", str);
        t4.j jVar = new t4.j();
        this.f15452a.p(new r(this, jVar, str, jVar), jVar);
        return jVar.a();
    }
}
