package v5;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f15689a = new b();

    private /* synthetic */ b() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith("event");
        return startsWith;
    }
}
