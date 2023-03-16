package w6;
/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final u6.a f16143b = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final b7.c f16144a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b7.c cVar) {
        this.f16144a = cVar;
    }

    private boolean g() {
        u6.a aVar;
        String str;
        b7.c cVar = this.f16144a;
        if (cVar == null) {
            aVar = f16143b;
            str = "ApplicationInfo is null";
        } else if (!cVar.d0()) {
            aVar = f16143b;
            str = "GoogleAppId is null";
        } else if (!this.f16144a.b0()) {
            aVar = f16143b;
            str = "AppInstanceId is null";
        } else if (!this.f16144a.c0()) {
            aVar = f16143b;
            str = "ApplicationProcessState is null";
        } else if (!this.f16144a.a0()) {
            return true;
        } else {
            if (!this.f16144a.X().W()) {
                aVar = f16143b;
                str = "AndroidAppInfo.packageName is null";
            } else if (this.f16144a.X().X()) {
                return true;
            } else {
                aVar = f16143b;
                str = "AndroidAppInfo.sdkVersion is null";
            }
        }
        aVar.j(str);
        return false;
    }

    @Override // w6.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f16143b.j("ApplicationInfo is invalid");
        return false;
    }
}
