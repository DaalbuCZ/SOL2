package v5;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ c f15690n = new c();

    private /* synthetic */ c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int u10;
        u10 = e.u((File) obj, (File) obj2);
        return u10;
    }
}
