package a3;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class i implements t2.a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final String f151a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f152b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f153c;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(String str, List<String> list, boolean z10) {
        this.f151a = str;
        this.f152b = Collections.unmodifiableList(list);
        this.f153c = z10;
    }
}
