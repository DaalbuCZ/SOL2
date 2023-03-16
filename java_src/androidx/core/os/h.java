package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f1460a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Object obj) {
        this.f1460a = (LocaleList) obj;
    }

    @Override // androidx.core.os.g
    public Object a() {
        return this.f1460a;
    }

    public boolean equals(Object obj) {
        return this.f1460a.equals(((g) obj).a());
    }

    @Override // androidx.core.os.g
    public Locale get(int i10) {
        return this.f1460a.get(i10);
    }

    public int hashCode() {
        return this.f1460a.hashCode();
    }

    public String toString() {
        return this.f1460a.toString();
    }
}
