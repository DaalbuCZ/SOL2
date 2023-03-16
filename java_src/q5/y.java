package q5;

import android.content.Context;
/* loaded from: classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private String f12895a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        if (this.f12895a == null) {
            this.f12895a = b(context);
        }
        return "".equals(this.f12895a) ? null : this.f12895a;
    }
}
