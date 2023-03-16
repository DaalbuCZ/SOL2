package f5;

import z3.o;
/* loaded from: classes.dex */
public class k extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public k() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        o.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Throwable th) {
        super(str, th);
        o.f(str, "Detail message must not be empty");
    }
}
