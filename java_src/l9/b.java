package l9;

import java.util.Random;
import k9.k;
/* loaded from: classes.dex */
public final class b extends l9.a {

    /* renamed from: p  reason: collision with root package name */
    private final a f11230p = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // l9.a
    public Random c() {
        Random random = this.f11230p.get();
        k.d(random, "implStorage.get()");
        return random;
    }
}
