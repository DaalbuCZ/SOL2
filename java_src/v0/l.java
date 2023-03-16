package v0;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l8.k;
import v0.a;
import v0.n;
import v0.p;
/* loaded from: classes.dex */
final class l implements k.c {

    /* renamed from: n  reason: collision with root package name */
    private final Context f15496n;

    /* renamed from: o  reason: collision with root package name */
    private final a f15497o;

    /* renamed from: p  reason: collision with root package name */
    private final n f15498p;

    /* renamed from: q  reason: collision with root package name */
    private final p f15499q;

    /* renamed from: r  reason: collision with root package name */
    private Activity f15500r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, a aVar, n nVar, p pVar) {
        this.f15496n = context;
        this.f15497o = aVar;
        this.f15498p = nVar;
        this.f15499q = pVar;
    }

    public void i(Activity activity) {
        this.f15500r = activity;
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, final k.d dVar) {
        String str = jVar.f11211a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c10 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                int parseInt = Integer.parseInt(jVar.f11212b.toString());
                p pVar = this.f15499q;
                Context context = this.f15496n;
                Objects.requireNonNull(dVar);
                pVar.a(parseInt, context, new p.a() { // from class: v0.k
                    @Override // v0.p.a
                    public final void a(int i10) {
                        k.d.this.a(Integer.valueOf(i10));
                    }
                }, new b() { // from class: v0.e
                    @Override // v0.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                return;
            case 1:
                int parseInt2 = Integer.parseInt(jVar.f11212b.toString());
                n nVar = this.f15498p;
                Activity activity = this.f15500r;
                Objects.requireNonNull(dVar);
                nVar.i(parseInt2, activity, new n.c() { // from class: v0.j
                    @Override // v0.n.c
                    public final void a(boolean z10) {
                        k.d.this.a(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: v0.g
                    @Override // v0.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                return;
            case 2:
                int parseInt3 = Integer.parseInt(jVar.f11212b.toString());
                n nVar2 = this.f15498p;
                Context context2 = this.f15496n;
                Objects.requireNonNull(dVar);
                nVar2.d(parseInt3, context2, new n.a() { // from class: v0.h
                    @Override // v0.n.a
                    public final void a(int i10) {
                        k.d.this.a(Integer.valueOf(i10));
                    }
                });
                return;
            case 3:
                a aVar = this.f15497o;
                Context context3 = this.f15496n;
                Objects.requireNonNull(dVar);
                aVar.a(context3, new a.InterfaceC0224a() { // from class: v0.c
                    @Override // v0.a.InterfaceC0224a
                    public final void a(boolean z10) {
                        k.d.this.a(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: v0.f
                    @Override // v0.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                return;
            case 4:
                n nVar3 = this.f15498p;
                Activity activity2 = this.f15500r;
                Objects.requireNonNull(dVar);
                nVar3.h((List) jVar.b(), activity2, new n.b() { // from class: v0.i
                    @Override // v0.n.b
                    public final void a(Map map) {
                        k.d.this.a(map);
                    }
                }, new b() { // from class: v0.d
                    @Override // v0.b
                    public final void a(String str2, String str3) {
                        k.d.this.b(str2, str3, null);
                    }
                });
                return;
            default:
                dVar.c();
                return;
        }
    }
}
