package g1;

import com.google.auto.value.AutoValue;
import g1.c;
/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* loaded from: classes.dex */
public abstract class o {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(e1.b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(e1.c<?> cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(e1.e<?, byte[]> eVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract e1.b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e1.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e1.e<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
