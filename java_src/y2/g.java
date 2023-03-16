package y2;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f16900a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16901b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f16902c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f16903d;

    /* renamed from: e  reason: collision with root package name */
    public final e f16904e;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f16900a = str;
        this.f16901b = j10;
        this.f16902c = Collections.unmodifiableList(list);
        this.f16903d = Collections.unmodifiableList(list2);
        this.f16904e = eVar;
    }

    public int a(int i10) {
        int size = this.f16902c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f16902c.get(i11).f16856b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
