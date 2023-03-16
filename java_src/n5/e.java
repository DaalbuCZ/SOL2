package n5;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import q5.h;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11754a;

    /* renamed from: b  reason: collision with root package name */
    private b f11755b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f11756a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11757b;

        private b() {
            int r10 = h.r(e.this.f11754a, "com.google.firebase.crashlytics.unity_version", "string");
            if (r10 == 0) {
                if (!e.this.c("flutter_assets/NOTICES.Z")) {
                    this.f11756a = null;
                    this.f11757b = null;
                    return;
                }
                this.f11756a = "Flutter";
                this.f11757b = null;
                f.f().i("Development platform is: Flutter");
                return;
            }
            this.f11756a = "Unity";
            String string = e.this.f11754a.getResources().getString(r10);
            this.f11757b = string;
            f f10 = f.f();
            f10.i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f11754a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f11754a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f11754a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f11755b == null) {
            this.f11755b = new b();
        }
        return this.f11755b;
    }

    public String d() {
        return f().f11756a;
    }

    public String e() {
        return f().f11757b;
    }
}
