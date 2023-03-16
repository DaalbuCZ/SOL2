package d8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public interface b {
    boolean a(int i10, int i11, Intent intent);

    void b(Bundle bundle);

    void c(Bundle bundle);

    void d();

    void e(io.flutter.embedding.android.c<Activity> cVar, e eVar);

    void f();

    void h();

    void onNewIntent(Intent intent);

    boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
}
