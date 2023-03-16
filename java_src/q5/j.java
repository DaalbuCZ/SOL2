package q5;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ j f12773a = new j();

    private /* synthetic */ j() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(".ae");
        return startsWith;
    }
}
