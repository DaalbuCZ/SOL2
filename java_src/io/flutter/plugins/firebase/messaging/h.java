package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import java.util.ArrayList;
import l8.p;
/* loaded from: classes.dex */
class h implements p {

    /* renamed from: o  reason: collision with root package name */
    private a f8979o;

    /* renamed from: n  reason: collision with root package name */
    private final int f8978n = 240;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8980p = false;

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface a {
        void a(int i10);
    }

    public void a(Activity activity, a aVar, io.flutter.plugins.firebase.messaging.a aVar2) {
        String str;
        if (this.f8980p) {
            str = "A request for permissions is already running, please wait for it to finish before doing another request.";
        } else if (activity != null) {
            this.f8979o = aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.POST_NOTIFICATIONS");
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (this.f8980p) {
                return;
            }
            androidx.core.app.b.s(activity, strArr, 240);
            this.f8980p = true;
            return;
        } else {
            str = "Unable to detect current Android Activity.";
        }
        aVar2.a(str);
    }

    @Override // l8.p
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        a aVar;
        int i11 = 0;
        if (this.f8980p && i10 == 240 && (aVar = this.f8979o) != null) {
            this.f8980p = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                i11 = 1;
            }
            aVar.a(i11);
            return true;
        }
        return false;
    }
}
