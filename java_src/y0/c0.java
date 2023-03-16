package y0;

import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class c0<T> {

    /* renamed from: a  reason: collision with root package name */
    private List<T> f16465a;

    /* renamed from: b  reason: collision with root package name */
    private List<File> f16466b;

    public c0(List<T> list, List<File> list2) {
        this.f16465a = list;
        this.f16466b = list2;
    }

    public List<T> a() {
        return this.f16465a;
    }

    public List<File> b() {
        return this.f16466b;
    }

    public boolean c() {
        return !this.f16465a.isEmpty();
    }
}
