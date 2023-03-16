package m9;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import k9.k;
/* loaded from: classes.dex */
public final class a extends l9.a {
    @Override // l9.a
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.d(current, "current()");
        return current;
    }
}
