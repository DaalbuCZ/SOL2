package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.j;
import androidx.window.layout.k;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f2448a = new i();

    private i() {
    }

    private final boolean c(Activity activity, i0.b bVar) {
        Rect a10 = y.f2509a.a(activity).a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() == a10.width() || bVar.a() == a10.height()) {
            if (bVar.d() >= a10.width() || bVar.a() >= a10.height()) {
                return (bVar.d() == a10.width() && bVar.a() == a10.height()) ? false : true;
            }
            return false;
        }
        return false;
    }

    public final j a(Activity activity, FoldingFeature foldingFeature) {
        k.b a10;
        j.b bVar;
        k9.k.e(activity, "activity");
        k9.k.e(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            a10 = k.b.f2461b.a();
        } else if (type != 2) {
            return null;
        } else {
            a10 = k.b.f2461b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar = j.b.f2454c;
        } else if (state != 2) {
            return null;
        } else {
            bVar = j.b.f2455d;
        }
        Rect bounds = foldingFeature.getBounds();
        k9.k.d(bounds, "oemFeature.bounds");
        if (c(activity, new i0.b(bounds))) {
            Rect bounds2 = foldingFeature.getBounds();
            k9.k.d(bounds2, "oemFeature.bounds");
            return new k(new i0.b(bounds2), a10, bVar);
        }
        return null;
    }

    public final v b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        j jVar;
        k9.k.e(activity, "activity");
        k9.k.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        k9.k.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                i iVar = f2448a;
                k9.k.d(foldingFeature, "feature");
                jVar = iVar.a(activity, foldingFeature);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return new v(arrayList);
    }
}
