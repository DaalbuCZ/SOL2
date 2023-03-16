package y0;

import java.util.Objects;
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    private String f16529a;

    public g0(String str) {
        b(str);
        this.f16529a = str;
    }

    private void b(String str) {
        Objects.requireNonNull(str, "Key must be not null");
    }

    public String a() {
        return this.f16529a;
    }
}
