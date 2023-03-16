package f1;

import com.google.auto.value.AutoValue;
import f1.e;
@AutoValue
/* loaded from: classes.dex */
public abstract class k {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(f1.a aVar);

        public abstract a c(b bVar);
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: n  reason: collision with root package name */
        private final int f6960n;

        b(int i10) {
            this.f6960n = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract f1.a b();

    public abstract b c();
}
